
Feature: Delete user
  this feature talks about delete an existing user and validate the user has been deleted from the table

@test
  Scenario: validate deleting new user
    Given user is on web page
    When delete the user with user name novak
    Then user should see Confirmation Dialog popup
    And User confirm the deletion
    And user should not see the user on the table