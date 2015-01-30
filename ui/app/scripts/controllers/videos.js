'use strict';

/**
 * @ngdoc function
 * @name staticApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the staticApp
 */
angular.module('staticApp')
  .controller('VideosCtrl', function ($scope, $http, SpringDataRestAdapter) {
    var httpPromise = $http.get('/api/videos').success(function (response) {
      $scope.response = angular.toJson(response, true);
    });

    SpringDataRestAdapter.processWithPromise(httpPromise).then(function (processedResponse) {
      $scope.videos = processedResponse._embeddedItems;
    });
  });
