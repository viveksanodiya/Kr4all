Feature: application login
Scenario: home page default
Given initilize the browser
And navigate to web site
And click on login button to land on sign in page
When user enter user Username and password 
Then verifiy the user is successfully to login
