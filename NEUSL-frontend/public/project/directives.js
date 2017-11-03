(function () {
    angular
        .module("NEUSLDirectives", [])
        .directive("NEUSLNavbar", NEUSLNavbar);

    function NEUSLNavbar($http) {
        return {
            templateUrl: "views/home/templates/navbar.component.client.html",
            controller: 'navbarController',
            controllerAs: 'navController'
            // link : linkFunction
        }
    }

})();