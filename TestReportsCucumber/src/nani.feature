#Author: kommineni chaithanya
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Functionality of Ravi

@HealthCheckup
Scenario: Is it Ok Ravi
Given when i entered to office i checked the mails 
When then after i discussed 
	And yet another action
Then I validate the outcomes
	And check more outcomes

@tag2
Scenario Outline: Title of your scenario outline
Given I want to write a step with <name>
When I check for the <value> in step
Then I verify the <status> in step

Examples:
   ||browser|url |username  |password | status |
    | name1 |  5   | success|
    | name2 |  7   | Fail   |
