#Author: kommineni chaithanya

@tag
Feature: Functionality of flipacart



@tag2
Scenario Outline: Validation of flipcart
Given open browser as "<browser>" And enter url as "<url>"
When Enter username as "<username>" And password as "<password>" And click on login button
Then successfully  "<status>" 

Examples:
   |browser|url | username |password | status |
    |firefox|https://www.flipkart.com/| 7396618327 |  7396618327k   | success|
    |firefox|https://www.flipkart.com/ |7396618327 |  7396618327| Fail   |
