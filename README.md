##About:
Currency Converter is an application aimed at providing latest Exchange Rates for various currencies available.

In addition to that, we also aim to allow a user to convert, view and compare different currencies.

##Exchange Rates API
We are using Fixer (http://fixer.io/), for acquiring exchange rates.

##Authors:
* Chetan Bommu (email)
* Raghav Sharma (raghav_sharma1995@outlook.com)
    
##Tech Stack
The project is currently utilizing the following:
* Java 8
* Vaadin 8
* API for up-to-date currency exchange rates
* GSON for parsing JSON
* SLF4J Logging API
* TestNG (IntelliJ's default)
* assertJ (http://joel-costigliola.github.io/assertj/)

##Run:
To run the project:
* Create a *Run Configuration* for *Maven*
* Add a Maven Goal *jetty:run*
* Name the configuration as *Run as Jetty*

Unfortunately in IntelliJ there is no neat way of stopping the server. The workaround is to kill the process via *Task manager* or *kill* command.

##Acknowledgements
