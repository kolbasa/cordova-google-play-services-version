var exec = require('cordova/exec');

function PlayServices() {
    //
}

var PLUGIN = 'PlayServices';

PlayServices.prototype.getVersion = function (success, error) {
    exec(success, error, PLUGIN, 'getVersion', []);
};

PlayServices.prototype.askToUpdate = function (success, error) {
    exec(success, error, PLUGIN, 'askToUpdate', []);
};

module.exports = new PlayServices();
