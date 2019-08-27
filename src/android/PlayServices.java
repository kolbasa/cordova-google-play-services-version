package de.kolbasa.playservices;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v4.content.pm.PackageInfoCompat;

import com.google.android.gms.common.GoogleApiAvailability;

import org.json.JSONArray;
import org.json.JSONObject;

public class PlayServices extends CordovaPlugin {

    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 999;
    private static final int UP_TO_DATE = 0;

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) {
        try {
            switch (action) {
                case "getVersion":
                    PackageManager pkgManager = this.cordova.getActivity().getPackageManager();
                    String googlePackage = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_PACKAGE;
                    PackageInfo info = pkgManager.getPackageInfo(googlePackage, 0);
                    long version = PackageInfoCompat.getLongVersionCode(info);

                    JSONObject response = new JSONObject();
                    response.put("versionName", info.versionName);
                    response.put("versionCode", version);
                    response.put("lastUpdateTime", info.lastUpdateTime);
                    callbackContext.success(response);
                    break;
                case "askToUpdate":
                    GoogleApiAvailability googleAPI = GoogleApiAvailability.getInstance();
                    int result = googleAPI.isGooglePlayServicesAvailable(this.cordova.getContext());
                    if (result == UP_TO_DATE) {
                        callbackContext.error("Google Play Services are up to date.");
                    } else {
                        if (googleAPI.isUserResolvableError(result)) {
                            googleAPI.getErrorDialog(this.cordova.getActivity(), result,
                                    PLAY_SERVICES_RESOLUTION_REQUEST).show();
                            callbackContext.success();
                        } else {
                            callbackContext.error("User access denied.");
                        }
                    }
                    break;
                default:
                    return false;
            }

        } catch (Exception e) {
            callbackContext.error(e.getMessage());
            e.printStackTrace();
        }

        return true;
    }

}
