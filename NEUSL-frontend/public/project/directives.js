(function () {
    angular
        .module("neuSLDirectives", [])
        .directive("neuSLNavbar", neuSLNavbar);

    function neuSLNavbar($http) {
        return {
            templateUrl: "views/home/templates/navbar.component.client.html",
            controller: 'navbarController',
            controllerAs: 'navController'
            // link : linkFunction
        }
    }

})();