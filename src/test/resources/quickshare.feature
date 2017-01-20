Feature: As an employee I want to share a car with other employee So i can reduce the cost
Scenario: Valid post with sucess post message
Given Employee "Venky" enters office as Source and "Home" as the destination and time is "5.30pm"
And his email is "venky8888@gmail.com" and phone is "8793630576" 
When click on "Share"
Then data gets saved and message "Posting was sucessful" get displayed as OK
And If user clicks "OK" he is redirected to "Home Page."
