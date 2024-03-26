@run
  Feature: Add user
    this feature talks about adding a new user and validating the user has been added to the table


    Scenario: valiadate adding new user
      Given user is on web page
      When choose to click on add new user
      Then user file the form
     # And user selects sales team option from dropdown
         # And user enter their email and phone number
      And user can see that the new user is added succesfully






