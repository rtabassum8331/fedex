#Author: mdahad.us@gmail.com
#Keywords Summary : Ship & Rate


  @Sprint1
Feature: Verify price quotes and available options for shipments
Scenario: As a user I should be able to find price options for shipments.
Given User in on the FedEx home page
When User clicks on Rate & Ship
And Clicks on From              
And Selects To      
And Selects checkbox
And Selects packaging option from drop-down list.
And Selects lb from drop-down list
And Selects number of packages from drop-down list
And Inserts length weight height per packagee
And Inserts number of dimensions per package
And Selects ship-date from drop-down list
And Click Show Rates
Then FedEx Retails rates shows

