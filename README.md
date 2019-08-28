# cordova-plugin-google-play-services-version

This plugin provides the version of Google Play Services.

In addition, it is able to ask the user to perform an update if the version is not sufficient.

There are plugins that require a certain version of Google Play Services, for example: [cordova-plugin-background-geolocation](cordova-plugin-background-geolocation).
It is beneficial to develop a fallback strategy if the version is too low. Or you can at least inform the user why some functionality is missing.


## Installation

```
cordova plugin add https://github.com/kolbasa/cordova-plugin-google-play-services-version
```

## Usage

Query the version:
```js
cordova.plugins.playservices.getVersion(
    function (oVersion) {
        // success callback
    },
    function (err) {
        // error callback
    }
);
```

Example result:
```js
{
    versionName: '16.0.89 (040700-239467275)',
    versionCode: 16089022,
    lastUpdateTime: 1554936328000 // unix timestamp
}
```

Prompting the user to update:
```js
cordova.plugins.playservices.showUpdateDialog(
    function () {
        // success callback
    },
    function (err) {
        // error callback
    }
);
```
