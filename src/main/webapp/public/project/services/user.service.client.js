(function () {
    angular.module("NEUSL").service("userService", userService);

    function userService($http){
        var api = {
            "findUserByID": findUserByID,
            "getAllUsers" : getAllUsers,
            "addUser" : addUser
        };
        return api;

        function addUser(user) {
            $http.get("/users/getNewUser")
                .then(function(response) {
                    newUser = response.data;
                });
            $http.put("/users/post", newUser);
        }

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