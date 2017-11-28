(function () {
    angular.module("NEUSL").service("userService", userService);

    function userService($http){
        var api = {
            "findUserByID": findUserByID,
            "getAllUsers" : getAllUsers
    }
        return api;

        function findUserByID(id) {
            return $http.get("/users/getById/" + id)
                .then(function(response) {
                    return response.data;
                });
        }

        function getAllUsers() {
            return $http.get("/users/all")
                .then(function (response){
                    return response.data;
                })
        }



    }
})();