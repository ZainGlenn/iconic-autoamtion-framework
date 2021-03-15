
# Iconic Test Automation Framework

[![Gauge Badge](https://gauge.org/Gauge_Badge.svg)](https://gauge.org)

## Requirements :
* Java ~ OpenJDK 13.0.2
* Gauge latest

## Installation Guide
### Gauge
In order to install gauge follow the documentation online by navigating to link :  

https://docs.gauge.org/getting_started/installing-gauge.html?

Once there select the following options

1. OS ~ Linux / macOS / Windows
2. Language ~ Java

Then proceed to follow the 'Installation Instructions' section of the site

### Java ~ OpenJDK 13.0.2

#### MacOS
```
sdk man used in this context to manage jdk installation
https://sdkman.io/

* Run the following command
$ curl -s "https://get.sdkman.io" | bash

* Check if SDKMan is installed properly
sdk version

* Install Required JDK
sdk list java
sdk install java 13.0.2-open


* Setup Java
    * validate installed java :
        java --version
    * this command tells you the location of the java installation   
        which java       
    * set env variable JAVA_HOME
      export JAVA_HOME={output above}
      echo $JAVA_HOME
      
* Verification
    Make sure 'JAVA_HOME' directory is pointing to the path of the JDK rather then the actual Java executable
```  
#### Linux / Windows
```
* Navigate to - https://jdk.java.net/archive/
* Locate Version 13.0.2 on archive list
* Download the version according to the desired OS
* Install version once download
* Setup Java
    * validate installed java :
        java --version      
    * set env variable JAVA_HOME and make sure the env variable is set to the root dir of the JDK installation
```



