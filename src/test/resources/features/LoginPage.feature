Feature: Login to Zaidan Educare School Application 

Background:
    Given User has opened the browser
    And User has navigated to the login page of Education Fund Payment Management System for Zaidan Educare School app "http://ptbsp.ddns.net:6882"

    @ValidCredentials
    Scenario: Login with valid credentials
        When User enters username as "bendahara" and password as "admin123"
        And User clicks on the login button
        Then User is navigated to the dashboard page
        And User should be able to see navigation bar for bendahara
    
    @InvalidCredentials
    Scenario Outline: Login with invalid credentials
        When User enters username as "indra" and password as "admin123"
        And User clicks on the login button
        Then User should be able to see "Incorrect username or password, please try again!" notification message
    