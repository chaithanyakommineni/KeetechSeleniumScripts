#Author: kommineni chaithanya

@tag
Feature: Functionality of facebook

#@tag1
#Scenario: Login functionality of facebook
#Given open browser as "firefox" And enter url as "https://www.facebook.com/"
#When enter username And password And click on login button
#Then succefully login to facebook

@tag2
Scenario Outline: Login functionality of facebook
Given open browser as "firefox" And enter url as "https://www.facebook.com/"
When enter <username> And <password> And click on login button And <status>
Then succefully login to facebook


Examples:
    | username |password | status |
    | chaitu9655@gmail.com |   chaitu9655@gmail.com   | success|
    |  chaitu9655@gmail.com |   chaitu9655@gmail.com7   | Fail   |
    | chaitu9655@gmail.com |   chaitu9655@gmail.com   | success|
    |  chaitu9655@gmail.com |   chaitu9655@gmail.com7   | Fail   |
    | chaitu9655@gmail.com |   chaitu9655@gmail.com   | success|
    |  chaitu9655@gmail.com |   chaitu9655@gmail.com7   | Fail   |
    | chaitu9655@gmail.com |   chaitu9655@gmail.com   | success|
    |  chaitu9655@gmail.com |   chaitu9655@gmail.com7   | Fail   |
    
