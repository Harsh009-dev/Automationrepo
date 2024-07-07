Feature: Practice Form

Scenario: Enter valid data into Practice form

Given I launch browser as "chrome" and nevigate to url as "https://demoqa.com/automation-practice-form"
When I Enter first name as "Snehal" 
And I Enter Last name as "Patil"
Then I Enter Email address as "snehal.patil@gmail.com"
Then I click Female radio button
Then I Enter Phone Number as "9689108643"
Then I click date of birth
And I select date as "11" and I select month as "September" and I select year as "1991"
Then I select hobbies
#Then I choose picture
When Click dropdown button And Select NCR
Then Select another dropdown and select Noida
Then I quit browser