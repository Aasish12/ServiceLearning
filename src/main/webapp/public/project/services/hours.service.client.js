(function () {
    angular.module("NEUSL").service("hoursService", hoursService);

    function hoursService($http){
        var api = {
            "getHoursByStudentID" : getHoursByStudentID,
            "getHoursByCourseID" : getHoursByCourseID,
            "getAllHours" : getAllHours,
            "addHours" : addHours
        };
        return api;

        function getHoursByStudentID(studentID) {

        }

        function getHoursByCourseID(courseID) {

        }

        function getAllHours() {

        }

        function addHours() {

        }

    }
})();