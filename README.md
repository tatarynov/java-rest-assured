# New York Time API Tests
## Tech stack:
- Java 8 ([Install docs](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html))
- Gradle ([Install docs](https://gradle.org/install/))
- RestAssured (Will be installed automatically)
- TestNG (Will be installed automatically)
- GSON as JSON parser (Will be installed automatically)
- ExtentReports v3 (Will be installed automatically)
- Please see build.gradle file for more details on application modules


## How to set environment for running tests
Before executing tests there should be set next software:
- Java
- Gradle


#### Tests parameters

Next properties could be used to run tests:
1. ```-Dserver.host``` - set up host where API is running up. 
Default value: http://api.nytimes.com

2. ```-Dversion``` - version of API. 
Default value: v2

3. ```-Dserver.base``` - path where API is stored. 
Default value: svc/mostpopular/

4. ```API_KEY``` - stored in ```~/resources/nyapi.properties```. Used for access to API.

5. ```Logs level``` - could be changed in ```~/resources/log4j.properties```. 
Default value: INFO

### Source code
Source code (git repo) is available at ```https://tatarynov@bitbucket.org/tatarynov/nyt-tests.git```


### Assumptions
- You already familiar with: Git, Java, Terminal/Command line implementation of your Operation System
- Application code will be located in (Unix): ```~/Projects``` or in (Windows) ```C:\Projects```

Use this command to download code base
```bash
cd PROJECT_DIR
git clone https://tatarynov@bitbucket.org/tatarynov/nyt-tests.git
```

Open terminal (Unix) or CMD prompt (MS Windows) and run following commands:
```bash
cd PROJECT_DIR
```

## Run tests


###### For MacOS platform:
```
./gradlew test
```
or with parameters:
```
./gradlew test -Dversion=v2 -Dserver.host=localhost
```

###### For Windows platform:
```
gradle test
```
or with parameters:
```
gradlew test -Dversion=v2 -Dserver.host=localhost
```

## Reports and logs


A HTML report will be generated in ```~/report``` directory.