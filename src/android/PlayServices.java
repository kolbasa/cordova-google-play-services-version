package de.kolbasa.playservices;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import android.util.Log;

public class PlayServices extends CordovaPlugin {

    private static final String TAG = "PlayServices";

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        //
    }

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) {
        Log.v(TAG, "Executing (" + action + ")");

        switch (action) {
            case "getVersion":
                // cordova.getThreadPool().execute(() -> getVersion(callbackContext));
                break;
            case "askToUpdate":
                // cordova.getThreadPool().execute(() -> askToUpdate(callbackContext));
                break;
            default:
                return false;
        }

        return true;
    }

}
