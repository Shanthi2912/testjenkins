Feature:To validate the login functionality in fb application

Background:

Given user has to be there in the fb page

@Sanity 
Scenario:To verify the login with valid username and valid password
When user has to fill username and password
|username|password|
|Shanthi@gmail.com|123456789|
|Bindu@gmail.com|23456789234567|
|Kowsy@gamil.com|123|
And user clicks the login button
Then user has to navigate to homepage

@Regression
Scenario:To verify the login with invalid username and invalid password
When user has to fill invalid username and invalid password and clicks login button
Then user should not able to navigate to homepage
