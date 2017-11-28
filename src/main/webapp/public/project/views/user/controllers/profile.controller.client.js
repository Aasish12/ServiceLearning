(function () {
    angular
        .module("NEUSL")
        .controller("profileController", profileController);

    function profileController($location, userService, paramUser, $route) {
        var model = this;
        model.UID = $routeParams["uid"];
        model.editProfile = editProfile;

        //declare functions

        function init() {
            model.user = userService.getUserByID(UID);

        }

        function editProfile(){
            userService.editUser(model.user)
                .then(function (response) {
                    $location.url("/profile/"+model.UID);
                });
        }

        init();
    }
})();
