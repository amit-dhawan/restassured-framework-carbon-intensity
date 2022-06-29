# restassured-framework-carbon-intensity
This is rest-assured API automation framework for testing carbon intensity APIs cerated by Amit Dhawan (amit.dhawan085@gmail.com)

# Tech Stack used:
- Java (1.8)
- Maven
- Cucumber Java
- Cucumber jUnit
- RestAssured
- Jackson-databind
- Hamchrest  Matchers

# Pre-Req:
1. Java 1.8 should be installed on your system and JAVA_HOME path set in environment variables
2. Maven should be installed and MAVEN_HOME path set in env variables
3. Java IDE installed on you machine Intellij IDEA (preffered) or Eclipse

# Framework Setup & Test Execution:
1. Clone git repo using -> git clone https://github.com/amit-dhawan/restassured-framework-carbon-intensity.git
2. Navigate to repo folder -> cd restassured-framework-carbon-intensity
3. Type "mvn install" in cmd prompt(Windows) or terminal(Mac) to install the required dependencies and trigger test
4. Import the proejct in you IDE - Intellij or Eclipse as a maven project
5. If you want to run tests navigate to restassured-framework-carbon-intensity/src/test/java/com/amit/works/test_runners/TestRunner1.java file, Right click and click on **Run** option

# Feature Files: 
Test Cases are written in Cucumber BDD format 
Feature files are available at - restassured-framework-carbon-intensity/src/test/resources/features/ location

# Reports: 
* After successfull test execution Cucumber HTML reports will be generated at -> restassured-framework-carbon-intensity/target/cucumber-html/cucumber.html location
* Open .html file with browser to see the report
* Cucumber pretty format report will be printed in console output
* Request/Response will be logged in logs.txt at => restassured-framework-carbon-intensity/logs.txt file

