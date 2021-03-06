var app = angular.module('cordova-chat-app', [
  'fsCordova',
  'ngRoute',
  'ngTouch',
  'mobile-angular-ui',
  'LocalStorageModule',
]);

app.config(function($routeProvider, $locationProvider) {
  $routeProvider
    .when('/', {
      templateUrl: 'views/home.html',
      controller: 'AppController'
    }).when('/settings', {
      templateUrl: 'views/settings.html',
      controller: 'SettingsController'
    }).when('/users', {
      templateUrl: 'views/users.html',
      controller: 'UsersController'
    }).when('/users/:username', {
      templateUrl: 'views/chat.html',
      controller: 'ChatController'
    }).otherwise({
      redirectTo: '/home'
    });
});