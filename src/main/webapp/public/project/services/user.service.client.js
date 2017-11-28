(function () {
    angular.module("NEUSL").service("userService", userService);

    function userService($http){
        var api = {
            "getUserByID": getUserByID,
            "getAllUsers" : getAllUsers,
            "addUser" : addUser,
            "editUser" : editUser,
            "getUserByUsername" : getUserByUsername
        };
        return api;

        function addUser(user) {
            $http.get("/users/getNewUser")
                .then(function(response) {
                    var newUser = response.data;
                    $http.put("/users/post", newUser);
                });
        }

        function getUserByID(id) {
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

        function editUser(user) {
        }

        function getUserByUsername(username) {

        }

    }
})();