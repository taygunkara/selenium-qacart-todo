# Selenium Qacart Todo



## Introduction 

Welcome to the README for the Test Automation project focusing on the [Todo Qacart](https://todo.qacart.com/) website.rstanding the project's structure and purpose.


## Technologies Used
<a href="https://rest-assured.io/"><img src="https://avatars.githubusercontent.com/u/19369327?s=280&v=4" width="40" alt="Rest Assured"/></a>
<a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="40" height="40" alt="Selenium"/></a>
<a href="https://testng.org/"><img src="https://e7.pngegg.com/pngimages/640/776/png-clipart-testng-logo-software-testing-software-framework-computer-icons-automation-testing-angle-text.png" height="40" alt="TestNG"/></a>
<a href="https://allurereport.org//"><img src="https://s3.eu-west-1.amazonaws.com/matrix.assets/cbnapp7fuq7flsqwoc9gn8hpo7ql" width="71" alt="Allure Report"/></a>


## Maven Libraries Used
- Selenium Java
- TestNG
- WebDriverManager
- Rest Assured
- Maven Surefire

## Project Structure

```
.
├── pom.xml
├── README.md
├── src
│   ├── main
│   └── test
│       ├── java
│       │   ├── apis
│       │   │   ├── TodoApi.java
│       │   │   └── UserApi.java
│       │   ├── base
│       │   │   └── BaseTest.java
│       │   ├── factory
│       │   │   └── DriverFactory.java
│       │   ├── models
│       │   │   └── User.java
│       │   ├── pages
│       │   │   ├── NewTodoPage.java
│       │   │   ├── RegisterPage.java
│       │   │   └── TodoPage.java
│       │   ├── testcases
│       │   │   ├── TodoTest.java
│       │   │   └── UserTest.java
│       │   └── utils
│       │       └── ConfigUtils.java
│       └── resources
│           └── env
│               ├── local.properties
│               └── production.properties
```

## Installation

To set up the project, follow these steps:

1. Clone the repository to your local machine: `git clone https://github.com/taygunkara/selenium-qacart-todo.git`

2. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).

3. Install the required dependencies (Selenium WebDriver, TestNG) using Maven. You can do this by right-clicking on the project and selecting "Maven" -> "Update Project."


## Running Tests from Terminal
- Tests to run in parallel with default properties: 
```
mvn clean test
```

- Tests to run in a different browser: 

```
mvn clean test -Dbrowser=CHROME 
```

- Tests to run with a different environments:

```
mvn clean test -Denv=PRODUCTION
```

## Contact
For any queries or assistance, feel free to contact me via email at [kara.taygun@gmail.com](mailto:kara.taygun@gmail.com).