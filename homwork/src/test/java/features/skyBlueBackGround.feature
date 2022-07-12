@ChangeBackground
Feature: Validate the background color will change to sky blue

Background:
Given Set SkyBlue Background button exists

@Scenario1
Scenario: Sky Blue Background

When User click on "Set SkyBlue Background" button 
Then the background color will change to sky blue

@Scenario2
Scenario: White Background Change
When User clicks on "Set White Background" button 
Then the background color will change to white  blue