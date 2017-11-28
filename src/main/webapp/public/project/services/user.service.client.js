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

        // not sure how to do this
        function addUser(user) {
            $http.get("/users/getNewUser")
                .then(function(response) {
                    var newUser = response.data;
                    // just set the fields manually from the json user object
                    newUser.username = user.username;
                    newUser.password = user.password;
                    newUser.email = user.email;
                    $http.put("/users/put", newUser);
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