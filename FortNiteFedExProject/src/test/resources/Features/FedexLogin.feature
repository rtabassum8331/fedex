

@sprint1
Feature: Verify Login page
This step will verify all step for Login

Scenario: Customer should be able to Login successfully
Given Customer land on Fedex Homepage
When customer clicks on Signup or login
And customer put UserId "Ruhi123"
And Customer put Password "Crazy1234"
Then Customer able to Login Successfully