'use strict';

/**
 * @ngdoc function
 * @name staticApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the staticApp
 */
angular.module('staticApp')
  .controller('QuotesCtrl', function ($scope, $http, SpringDataRestAdapter) {
    var httpPromise = $http.get('/api/quotes').success(function (response) {
      $scope.response = angular.toJson(response, true);
    });

    SpringDataRestAdapter.processWithPromise(httpPromise).then(function (processedResponse) {
      $scope.quotes = processedResponse._embeddedItems;
    });

  });
