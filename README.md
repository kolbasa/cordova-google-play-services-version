# cordova-plugin-google-play-services-version

This plugin delivers the version of Google Play Services.

In addition, it is able to ask the user to perform an update if the version is not sufficient.

## Installation

```
cordova plugin add https://github.com/kolbasa/cordova-plugin-google-play-services-version
```

## Usage

Fetching Version:
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
