Feature: Login

Scenario: Login with valid inputs
Given I have launch browser "chrome" and nevigate to url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When I have type username as "Admin" 
And I have type password as "admin123" 
Then I have click login button