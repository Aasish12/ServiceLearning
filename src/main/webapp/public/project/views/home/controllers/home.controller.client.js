(function () {
    angular
        .module("NEUSL")
        .controller("homeController", homeController);

    function homeController($window, $location, $filter, $routeParams, courseService, userService) {
        var model = this;
        model.UID = $routeParams["uid"];

        function init() {
            userService.getUserByID(model.UID)
                .then(function (response) {
                    model.user = response.data;
                });

        }
        init();

    }
})();
