$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate the login functionality in fb application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be there in the fb page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_be_there_in_the_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the login with valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user has to fill username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Shanthi@gmail.com",
        "123456789"
      ]
    },
    {
      "cells": [
        "Bindu@gmail.com",
        "23456789234567"
      ]
    },
    {
      "cells": [
        "Kowsy@gamil.com",
        "123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_fill_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_navigate_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be there in the fb page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_be_there_in_the_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the login with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user has to fill invalid username and invalid password and clicks login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_fill_invalid_username_and_invalid_password_and_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not able to navigate to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_should_not_able_to_navigate_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});