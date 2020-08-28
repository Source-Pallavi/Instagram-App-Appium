# Instagram-App
## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This project is automating Instagram application which is a social media platform.
	
## Technologies
Project is created with:
* Java version: 11.0
### Frameworks
* NUnit 
* Selenium
* Data Driven
### Design Pattern
* Page Object Model
### Dependencies
* rg.seleniumhq.selenium artifactId>selenium-java
* io.appium artifactId>java-client
* org.testng artifactId>testng
* testNG- To define test cases, assertion
* org.apache.maven artifactId>maven-model Binding for maven project
* com.sun.mail artifactId>javax.mail
	
## Setup
To run this project, install it locally using intellij:
create a ms. project
downloaded the dependencies (the packages menthioned above)

## Scenarios
### First- Positive scenario of buying book

* Login to instagram application
* Navigates to Home page
* Search any user
* Select the user
* go to profile
* choose a post 
* Hit like ob it
* Navigates to homepage
* Navigates to my own profile
* Log out from application
* Close the browser

## Second- Negative test

* Try to Login with wrong username
* Try to Login with empty username
* Try to Login with wrong passowrd
* Try to Login with empty password
## Author 
  * Pallavi Dubey
