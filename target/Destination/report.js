$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality check for Face Book",
  "description": "",
  "id": "login-functionality-check-for-face-book",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 10,
  "name": "Login with Invalid Credentials",
  "description": "",
  "id": "login-functionality-check-for-face-book;login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@oneOfMyScenarios"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Open chrome broswer and start facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter username as \"abc\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter password as \"111\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.open_chrome_broswer_and_start_facebook_application()"
});
formatter.result({
  "duration": 10650385001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 21
    }
  ],
  "location": "StepDefinition.i_enter_username_as(String)"
});
formatter.result({
  "duration": 230466213,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "111",
      "offset": 21
    }
  ],
  "location": "StepDefinition.i_enter_password_as(String)"
});
formatter.result({
  "duration": 2198749030,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.login_should_fail()"
});
formatter.result({
  "duration": 12312696,
  "status": "passed"
});
});