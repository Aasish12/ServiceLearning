//remove this and integrate with profile.controller.client (inline email edit option)

(function () {
    angular
        .module("NEUSL")
        .controller("editProfileController", editProfileController);

    function editProfileController($location, $route) {
        var model = this;

        //declare functions

        function init() {
            model.user = {"email" : "testemail@gmail.com"};

        }

        init();
    }
})();