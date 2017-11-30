(function () {
    angular
        .module("NEUSL")
        .controller("loginController", loginController);

    function loginController($window, $location, userService, $rootScope) {
        var model = this;
        model.login = login;
        model.onClickRegister = onClickRegister;
        model.addUser = addUser;

        function init() {
            userService.getAllUsers()
                .then(function(response) {
                    model.allUsers = response.data;
                });
        }
        init();

        function addUser(user) {
            userService.getUserByUsername(user.username)
                .then(function (_user) {
                    if(_user === "0") {
                        return userService.addUser(user);
                    } else {
                        model.error = "Username taken, choose another.";
                    }
                }).then(function (user) {
                $location.url("/profile/" + user._id);
            });
        }

        function onClickRegister() {
            $('.nav a[href="#Register"]').tab('show');
        }

        function login(user) {
            if(!user) {
                model.errorMessage = "Please fill in username and password!";
                $('.modal').effect('shake');

                return;
            }
            userService
                .login(user.username, user.password)
                .then(function (_user) {

                    $('.modal').modal('toggle');
                    $window.location.reload();

                }, function (err) {
                    if(err.status === 401) {
                        model.errorMessage = "User not found. Check username and password again";
                    } else if(err.status === 400) {
                        model.errorMessage = "Please fill in username and password!";
                    } else {
                        model.errorMessage = "Internal Server Error.";
                    }
                    $('.modal').effect('shake');
                });
        }
    }
})();
