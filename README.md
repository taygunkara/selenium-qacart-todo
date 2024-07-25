# Selenium Qacart Todo

<a href="https://rest-assured.io/"><img src="https://avatars.githubusercontent.com/u/19369327?s=280&v=4" width="40" alt="Rest Assured"/></a>
<a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="40" height="40" alt="Selenium"/></a>
<a href="https://testng.org/"><img src="https://e7.pngegg.com/pngimages/640/776/png-clipart-testng-logo-software-testing-software-framework-computer-icons-automation-testing-angle-text.png" height="40" alt="TestNG"/></a>
<a href="https://allurereport.org//"><img src="https://s3.eu-west-1.amazonaws.com/matrix.assets/cbnapp7fuq7flsqwoc9gn8hpo7ql" width="71" alt="Allure Report"/></a>

Welcome to the Selenium Qacart Todo project! This project is designed to perform test automation for the [Todo Qacart](https://todo.qacart.com/) website using Selenium and TestNG. It includes both UI and API tests and follows the Page Object Model (POM) design pattern.

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Maven Libraries Used](#maven-libraries-used)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Running Tests from Terminal](#running-tests-from-terminal)
- [Contact](#contact)


## Introduction

This project focuses on automating the testing of a Todo application developed using Java and configured with Maven. The tests can be configured for different environments (local and production).

### Key Features
- UI and API tests for the Todo application
- Page Object Model (POM) design pattern
- Environment configurations for local and production setups

## Technologies Used

- [Rest Assured](https://rest-assured.io/)
- [Selenium](https://selenium.dev)
- [TestNG](https://testng.org/)
- [Allure Report](https://allurereport.org/)

## Maven Libraries Used
- [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
- [TestNG](https://mvnrepository.com/artifact/org.testng/testng)
- [WebDriverManager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)
- [Rest Assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured)
- [Maven Surefire](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin)

## Project Structure

The project consists of the following main components:

- `apis`: Classes used for API calls
- `base`: Base test class
- `factory`: Factory class for creating WebDriver
- `models`: Data models
- `pages`: Page Object Model classes
- `testcases`: Test scenarios
- `utils`: Utility classes
- `resources`: Configuration files

```plaintext
.
├── pom.xml
├── README.md
├── src
│   ├── main
│   └── test
│       ├── java
│       │   ├── apis
│       │   │   ├── TodoApi.java
│       │   │   └── UserApi.java
│       │   ├── base
│       │   │   └── BaseTest.java
│       │   ├── factory
│       │   │   └── DriverFactory.java
│       │   ├── models
│       │   │   └── User.java
│       │   ├── pages
│       │   │   ├── NewTodoPage.java
│       │   │   ├── RegisterPage.java
│       │   │   └── TodoPage.java
│       │   ├── testcases
│       │   │   ├── TodoTest.java
│       │   │   └── UserTest.java
│       │   └── utils
│       │       └── ConfigUtils.java
│       └── resources
│           └── env
│               ├── local.properties
│               └── production.properties
```

## Installation

To set up the project, follow these steps:

1. **Clone the repository**:
```bash
git clone https://github.com/taygunkara/selenium-qacart-todo.git
cd selenium-qacart-todo
```
2. **Open the project in your preferred Java IDE** (e.g., IntelliJ, Eclipse).

3. **Install the required dependencies** (Selenium WebDriver, TestNG) using Maven. You can do this by right-clicking on the project and selecting "Maven" -> "Update Project."

## Running Tests from Terminal

- **Run tests in parallel with default properties**:
```  
mvn clean test  
```  

- **Run tests in a different browser**:
```
mvn clean test -Dbrowser=CHROME 
```  

- **Run tests in different environments**:
```
mvn clean test -Denv=PRODUCTION  
```

- **View the Allure report in your browser**:
```  
allure serve allure-results  
```

## Contact
For any queries or assistance, feel free to contact me via email at [kara.taygun@gmail.com](mailto:kara.taygun@gmail.com).