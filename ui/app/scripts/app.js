'use strict';

/**
 * @ngdoc overview
 * @name staticApp
 * @description
 * # staticApp
 *
 * Main module of the application.
 */
angular
  .module('staticApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'spring-data-rest'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/videos', {
        templateUrl: 'views/videos.html',
        controller: 'VideosCtrl'
      })
      .when('/', {
        templateUrl: 'views/quotes.html',
        controller: 'QuotesCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
