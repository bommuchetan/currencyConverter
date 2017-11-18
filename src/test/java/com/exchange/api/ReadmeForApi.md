#Fixer::Foreign exchange rates and currency conversion API
`Fixer` is a free API for current and historical foreign exchange rates published by the European Central Bank. 

Refer to their [website](http://fixer.io/) for more information.

#Working
######Refer to ApiTest.java for test cases and related documentation.
We make use of Java's `HttpsUrlConnection` class to send `GET` requests and parse through the response. An example for this can be found in test case `sampleTest_displayApiResponse` in `ApiTest` class.

The response is saved in `ExchangeRate` class.


