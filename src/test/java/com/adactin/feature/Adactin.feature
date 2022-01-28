Feature: Testing Adactin Application end to end process

Scenario Outline: verify the user is able to login the application

Given user launch the application
When user enters the valid username "<username>" in the username field
And user enters the valid password "<password>" in the password field
And user clicks on the login button
Then user verify the homepage navigates to search hotel page

Examples:

|username|password|
|AAA|111|
|BBB|222|
|CCC|333|
|Pavikumaresh|Pavikums@24|



