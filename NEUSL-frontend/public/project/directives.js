(function () {
    angular
        .module("NEUSLDirectives", [])
        .directive("NEUSLNavbar", NEUSLNavbar)
        .directive("postListComponent", postListComponent)
        .directive("recentPostsComponent", recentPostsComponent)
        .directive("commentsComponent", commentsComponent);

    function NEUSLNavbar($http) {
        return {
            templateUrl: "views/home/templates/oh-navbar.component.client.html",
            controller: 'ohNavbarController',
            controllerAs: 'navController'
            // link : linkFunction
        }
    }

    function postListComponent($http) {
        return {
            templateUrl: "views/home/templates/post-list.component.client.html",
            controller: "postListComponentController",
            controllerAs: "postList"
        }
    }

    function recentPostsComponent($http) {
        return {
            templateUrl: "views/home/templates/recent-posts.component.client.html",
            controller: "recentPostController",
            controllerAs: "recentPostModel"
        }
    }

    function commentsComponent($http) {
        return {
            templateUrl: "views/home/templates/comment.component.client.html",
            controller: "commentComponentController",
            controllerAs: "commentModel"
        }
    }

})();