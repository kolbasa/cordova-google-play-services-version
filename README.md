# cordova-plugin-google-play-services-version

This plugin provides the currently installed version of Google Play Services.

In addition, it is able to ask the user to perform an update if the version is not sufficient.

There are plugins that require a certain version of Google Play Services, for example: [cordova-plugin-background-geolocation](https://github.com/mauron85/cordova-plugin-background-geolocation).

It is helpful if you want to build a fallback solution or if you just want to inform the user why some functionality is missing.

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
