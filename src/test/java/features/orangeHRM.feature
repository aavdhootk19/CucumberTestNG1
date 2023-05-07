Feature: automate test cases of orange hrm

@HRM
Scenario: Verify login functionalty
Given user login to Orange HRM
And close the bwoser


@HRM
Scenario: Verify search user functionality in admin page
Given user login to Orange HRM
And user navigates to Admin page
When user click on Seach button
Then employee records should display successfully
And close the bwoser

@HRM
Scenario: Verify search user functionality in admin page
Given user login to Orange HRM
And user navigates to Admin page
When user click on Seach button
Then employee records should display successfully
And close the bwoser
Then failed the test case