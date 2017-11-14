(function () {
    angular
        .module("NEUSL")
        .controller("newHoursController", newHoursController);

    function newHoursController($scope, $filter, $routeParams) {
        var model = this;

        function init() {
            model.position = {"name" : "test position", "partner" : "test partner"};
            model.hours = {};
            model.hours.date = $scope.date_rdv = new Date();
            console.log(model.position.date);
        }
        init();


    }
})();