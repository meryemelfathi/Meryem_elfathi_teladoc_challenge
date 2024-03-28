@run
  Feature: Add user
    this feature talks about adding a new user and validating the user has been added to the table


    Scenario: validate adding new user
      Given user is on web page
      When choose to click on add new user
      Then user file the form
      And user can see that the new user added successfully


    Scenario: Add a user and validate the user has been added to the table
      Given launch web page and verify element
      Then add user popup appears
      And user fill the form with personal information
      And user selects role from the dropdown
      And user enter their email and phone number
      And user submit the form
      And user can see that the new user added successfully






