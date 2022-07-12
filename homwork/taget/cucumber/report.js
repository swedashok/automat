$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Ashok/Desktop/cucumber1/homwork/src/test/java/features/main.feature");
formatter.feature({
  "line": 1,
  "name": "Sky  Blue Background color",
  "description": "",
  "id": "sky--blue-background-color",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to click and change the color to sky blue",
  "description": "",
  "id": "sky--blue-background-color;user-should-be-able-to-click-and-change-the-color-to-sky-blue",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user in techfios 101 page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click set skyblue background  button.",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "background color change to skyblue.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "101",
      "offset": 17
    }
  ],
  "location": "LoginStepDefinition.user_in_techfios_page(int)"
});
formatter.result({
  "duration": 5798659300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "LoginStepDefinition.button_exists(String)"
});
formatter.result({
  "duration": 1835000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_set_skyblue_background_button()"
});
formatter.result({
  "duration": 121475500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.background_color_change_to_blue()"
});
formatter.result({
  "duration": 41400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should be able to click and change the color to white",
  "description": "",
  "id": "sky--blue-background-color;user-should-be-able-to-click-and-change-the-color-to-white",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user in techfios 101 page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "\"Set White Background\" button2 exists",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User click set skywhite background  button.",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "background color change to white.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "101",
      "offset": 17
    }
  ],
  "location": "LoginStepDefinition.user_in_techfios_page(int)"
});
formatter.result({
  "duration": 4422917200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set White Background",
      "offset": 1
    }
  ],
  "location": "LoginStepDefinition.button_exists2(String)"
});
formatter.result({
  "duration": 55700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_set_white_background_button()"
});
formatter.result({
  "duration": 71922900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.background_color_change_to_white()"
});
formatter.result({
  "duration": 24800,
  "status": "passed"
});
});