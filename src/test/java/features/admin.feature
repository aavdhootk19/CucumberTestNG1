Feature: automate test cases of orange hrm

@createUser
Scenario: Verify create user functionality
Given user login to Orange HRM
And user navigates to Admin page
When create System user <username>
Then user should create successfully

