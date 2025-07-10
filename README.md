# Selenium Qacart Todo

<a href="https://rest-assured.io/"><img src="https://avatars.githubusercontent.com/u/19369327?s=280&v=4" width="40" alt="Rest Assured"/></a>
<a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="40" height="40" alt="Selenium"/></a>
<a href="https://testng.org/"><img src="https://e7.pngegg.com/pngimages/640/776/png-clipart-testng-logo-software-testing-software-framework-computer-icons-automation-testing-angle-text.png" height="40" alt="TestNG"/></a>
<a href="https://allurereport.org//"><img src="https://s3.eu-west-1.amazonaws.com/matrix.assets/cbnapp7fuq7flsqwoc9gn8hpo7ql" width="71" alt="Allure Report"/></a>

Welcome to the Selenium Qacart Todo project! This project is designed to perform test automation for the [Todo Qacart](https://todo.qacart.com/) website using Selenium and TestNG. It includes both UI and API tests and follows the Page Object Model (POM) design pattern.

[Project Article](https://taygunkara.github.io/pages/projects/selenium-qacart-todo-projesi.html)

## Table of Contents
- [Introduction](#introduction)
- [Key Features](#key-features)
- [Future Enhancements](#future-enhancements)
- [Technologies Used](#technologies-used)
- [Maven Libraries Used](#maven-libraries-used)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Running Tests from Terminal](#running-tests-from-terminal)
- [Contact](#contact)


## Introduction

This project automates the testing of a Todo application, configured with Maven for dependency management and TestNG for test execution. A key aspect of this framework is its hybrid nature; it uses API calls to set up test prerequisites (like creating a user), which makes UI tests faster and more reliable by focusing them on their specific target functionality.

## Key Features
- **Hybrid Testing:** Combines UI and API tests for efficient and stable test execution.
- **Page Object Model (POM):** Organizes UI interactions into page-specific classes for better reusability and maintenance.
- **Environment Configuration:** Supports running tests against different environments (e.g., local, production) through simple configuration files.
- **Cross-Browser Testing:** Easily configurable to run tests on different web browsers.
- **Detailed Reporting:** Generates comprehensive and interactive test reports using Allure.

## Future Enhancements
This project is under continuous development. The following improvements are planned to increase its robustness, scalability, and maintainability:

- **Refactor Driver Management:** Transition from the current Singleton Pattern for WebDriver management to a `BasePage` structure. This will improve thread safety and provide better control over the driver instance during parallel test execution.
- **Introduce a WaitUtils Class:** Abstract explicit waits into a dedicated `WaitUtils` utility class. This will centralize wait logic, reduce code duplication in page classes, and create convenient shortcut methods using method overloading.
- **Implement Robust Error Handling:** Integrate `try-catch` blocks within all major methods (page methods, utilities, driver management) to handle potential exceptions gracefully and prevent abrupt test failures.
- **Integrate SLF4J for Logging:** Add `SLF4J` for structured logging. By implementing `log.info()`, `log.debug()`, and `log.error()`, debugging will become more efficient, providing clear insights into the test execution flow and pinpointing the exact location of failures.
- **Develop an API Test Architecture:** Refactor API interactions into a more structured pattern similar to POM. This will involve creating `ApiHelper` and `ResponseBuilder` classes to encapsulate request/response logic, making API calls in test cases cleaner and more parameter-driven.

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
