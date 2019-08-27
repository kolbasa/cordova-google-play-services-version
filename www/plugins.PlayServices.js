var exec = require('cordova/exec');

function PlayServices() {
    //
}

var PLUGIN = 'PlayServices';

PlayServices.prototype.getVersion = function (success, error) {
    exec(success, error, PLUGIN, 'getVersion', []);
};

PlayServices.prototype.showUpdateDialog = function (success, error) {
    exec(success, error, PLUGIN, 'showUpdateDialog', []);
};

module.exports = new PlayServices();
