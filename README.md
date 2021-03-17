
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

## Running

In order to successfully run project the above need's 
to be correctly installed and to do this you can run the following commands to test

for Java:
```
java --version
```
expected output (similar) :
```
openjdk 13.0.2
OpenJDK Runtime Environment (build 13.0.2+9)
OpenJDK 64-Bit Server VM (build 13.0.2+9, mixed mode, sharing)
```

for gauge:
```
gauge --version
```
expected out(similar): 
```
Gauge version: 1.1.7
Plugins
-------
html-report (4.0.12)
java (0.7.13)
json-report (0.3.5)
```

In order to run tests on local ensure properties are configured for correct environment:

location : src/test/resources/production.properties
```
site.url=<url goes here>
```

each property in this location has been designed with the idea that a property 
file is linked to an environment i.e production.properties uses production api

Run the following command to execute automated test suite at the root of the repo

```
./gradlew gauge -Penv="production"
```

expected output should look like and then you should see the execution within the console (output may vary):
```
The default interactive shell is now zsh.
To update your account to use zsh, please run `chsh -s /bin/zsh`.
For more details, please visit https://support.apple.com/kb/HT208050.
Zains-MBP:iconic-autoamtion-framework zainglenn$ ./gradlew gauge -Penv="production"
DEFAULT_JVM_OPTS: "-Xmx64m"
JAVA_OPTS: 
GRADLE_OPTS:  "-Xdock:name=Gradle" "-Xdock:icon=/Users/zainglenn/Desktop/iconic-autoamtion-framework/media/gradle.icns"
APP_ARGS OPS: 'gauge' \
'-Penv=production' \
 

> Task :compileTestJava
Note: /Users/zainglenn/Desktop/iconic-autoamtion-framework/src/test/java/org/gauge/iconic/utils/rest/RestClient.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
# Iconic Product API
  ## Validate Response meets filtered criteria provided (male)       
      * Run products request filtered by query 
      
         |key      |value     |
         |---------|----------|
         |gender   |male      |
         |q        |boots     |
         |page     |1         |
         |page_size|10        |
         |sort     |popularity|  ...[PASS]
      * Validate response does not have gender "female" in response    ...[PASS]
      * Validate response relates to search query provided "boots"     ...[PASS]
```

## Reporting

Once the execution has been completed the report is contained in the following directory 
(starting at the root of the repository):

the html report is used as an artifact to view the results in pretty format
```
HTML - reports/html-report
```

the json report is used to create integrations into different CI/CD platforms and Test management tools such as

```
JSON - reports/json-report
```

* Git Lab - json/xml result can be published in pipelines in order to view Job test statuses
* Jenkins - Jenkins pipeline scripts can be used to publish both html & json which is also in Junit friendly format

## CI/CD

the project can be run in docker which can be integrated to many ci/cd platforms
 example : 

  ```
  FROM openjdk:13

RUN yum install unzip -y
RUN curl -SsL https://downloads.gauge.org/stable | sh
RUN gauge config plugin_kill_timeout 60000
RUN gauge config runner_request_timeout 60000
RUN gauge config runner_connection_timeout 60000
RUN gauge config plugin_connection_timeout 60000
COPY . /src
WORKDIR /src
```
an entrypoint to execute as an example : 
```
CMD ["./gradlew", "gauge", "-Penv=production"]
```

### Jenkins

Jenkins can be used such as groovy pipeline scripts

Example : 
```
#!/usr/bin/groovy

pipeline {

    agent {
        node {
            label '<slave>'
        }
    }

    stages {
        stage('Checkout code from GIT') {
            steps {
                echo '--- Checkout code from GIT ---'
                dir('/home/jenkins/iconic-automation-framework/') {
                    checkout scm: <git>
                }
            }
        }

        stage('Using Java & Gauge') {
            steps {
               # install and make sure correct java is used
            }
        }

        stage('Build and Test') {
            steps {
                echo '--- Build and Test ---'
                script {
                    wrap([$class: 'Xvfb']) {
                        catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE'){
                            try {
                                sh"""
                                cd /home/jenkins/iconic-automation-framework
                                echo 'Build Project ====='
                                gauge -v
                                ./gradlew clean build gauge -env={$ENV}
                                """
                            }finally{

                                sh"""
                                echo 'Cat Gauge Log ====='
                                cat /home/jenkins/iconic-automation-framework/logs/gauge.log
                                """

                                publishHTML target: [
                                        allowMissing: false,
                                        alwaysLinkToLastBuild: false,
                                        keepAll: true,
                                        reportDir: '/home/jenkins/iconic-automation-framework/reports/html-report',
                                        reportFiles: 'index.html',
                                        reportName: 'Gauge Report'
                                ]
                            }
                        }
                    }
                }
            }
        }
    }
```

### Gitlab

Gitlab pipeline file can be created inside the repository & the above docker file can be used as a base

Example of usage not meant to be used: 

```
stages:
- build
- deploy

Run tests in parallel:
stage: build
variables:
#    GRADLE_OPTS: "<can add system properties>"
image: openjdk:13-buster
before_script:
       - curl -fsSL https://download.docker.com/linux/debian/gpg | apt-key add
       - echo "deb [arch=amd64] https://download.docker.com/linux/debian buster stable" >> /etc/apt/sources.list.d/docker.list
       - curl -sS -L https://dl.google.com/linux/linux_signing_key.pub | apt-key add -
       - curl -SsL https://downloads.gauge.org/stable | sh
       - gauge config plugin_kill_timeout 60000
       - gauge config runner_request_timeout 60000
       - gauge config runner_connection_timeout 60000
       - gauge config plugin_connection_timeout 60000

script:
        - ./gradlew clean build gauge -Penv="production"

after_script:
        # publish json to third party test management tool

artifacts:
        when: always
```



