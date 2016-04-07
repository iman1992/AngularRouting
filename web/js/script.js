var app = angular.module("MyApp", []);

app.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
                when('/viewAll', {
                    templateUrl: 'templates/viewall.html',
                    controller: 'DefController'
                }).
                when('/viewSpec/:fName/:lName', {
                    templateUrl: 'templates/viewspecific.html',
                    controller: 'SpecController'
                }).
                otherwise({
                    redirectTo: '/viewAll'
                });
    }]);

app.controller('DefController', ['$scope', '$http', function ($scope, $http) {
        $http.get('data/data.json').then(function (res) {
            $scope.users = res.data;
        });
    }]);

app.controller('SpecController', ['$scope', '$http', '$routeParams', function ($scope, $http, $routeParams) {
        $http.get('data/data.json').then(function (res) {
            $scope.users = res.data;
        });

        $scope.specUser;
        for (var i = 0; i < $scope.users.length; i += 1) {
            if ($scope.users[i].first == $routeParams.fName && $scope.users[i].last == $routeParams.lName) {
                $scope.specUser = $scope.users[i];
            }
        }
    }]);