# Basic Keyword Driven Framework using Selenium
Basic Keyword Driven Framework using Selenium + Java
This a a demonstration of how one can create a basic Keyword Driven Framework using Selenium and Java. 
# Components

1. Driver class - Main class to execute project as a Java Application
2. TestSuites/FirstTestSuites.xls - Test Case file with three columns
    - Keyword (Action to be performed)
    - Locator (Object Locator - Please use xpath locator)
    - Input Data - Test Data
3. TestMethods class - A keyword library that contains all the methods to be executed against respective keyword. I have added 4 methods only as of now for the demo purpose. You can add more method if you want to add more keywords.
4. KeywordExecutor Class - This class will take Keyword as an argument and execute respective Testmethod. Please add an entry of new keyword as and when you add a new method.leyword in TestMethod.class

To use this framework, please edit FirstSuite.xls file, provide URL in first step and it will launch that website in your chrome bowser. 

To run the framework, user below maven command from project folder in command prompt.
```sh
mvn clean test
```
Thanks,

QASquare
