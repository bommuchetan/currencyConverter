##About:
Currency Converter is an application aimed at providing latest Exchange Rates for various currencies available.

In addition to that, we also aim to allow a user to convert, view and compare different currencies.

##Exchange Rates API
We are using Fixer (http://fixer.io/), for acquiring exchange rates.

##Authors:
* Chetan Bommu (chetankumar.ck555@gmail.com)
* Raghav Sharma (raghav_sharma1995@outlook.com)
    
##Tech Stack
The project is currently utilizing the following:
* Middle Tier : Spring Boot(Java 8)
* Front End : React , Angular 5
* Build Tool : Maven 
* JSON Parser : GSON 
* Logging Framework : SLF4J 
* Testing Framework : TestNG 
* Assertions : AssertJ (http://joel-costigliola.github.io/assertj/)

##Run:
To run the project:
* Create a *Run Configuration* for *Maven*
* Add a Maven Goal *jetty:run*
* Name the configuration as *Run as Jetty*

Unfortunately in IntelliJ there is no neat way of stopping the server. The workaround is to kill the process via *Task manager* or *kill* command.

##Acknowledgements
