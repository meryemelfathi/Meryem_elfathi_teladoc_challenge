$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddUser.feature");
formatter.feature({
  "name": "Add user",
  "description": "    this feature talks about adding a new user and validating the user has been added to the table",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "name": "valiadate adding new user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "user is on web page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddUserStepdef.user_is_on_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose to click on add new user",
  "keyword": "When "
});
formatter.match({
  "location": "AddUserStepdef.choose_to_click_on_add_new_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user file the form",
  "keyword": "Then "
});
formatter.match({
  "location": "AddUserStepdef.user_file_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see that the new user is added succesfully",
  "keyword": "And "
});
formatter.match({
  "location": "AddUserStepdef.user_can_see_that_the_new_user_is_added_succesfully()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/DeleteUser.feature");
formatter.feature({
  "name": "Delete user",
  "description": "  this feature talks about delete an existing user and validate the user has been deleted from the table",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "name": "validate deleting new user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "user is on web page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddUserStepdef.user_is_on_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "delete the user with user name",
  "keyword": "When "
});
formatter.match({
  "location": "DeleteUserStepdef.delete_the_user_with_user_name()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot read field \"deleteUser\" because \"this.deleteUserAction\" is null\r\n\tat stepDefinitions.DeleteUserStepdef.delete_the_user_with_user_name(DeleteUserStepdef.java:16)\r\n\tat ✽.delete the user with user name(file:src/test/resources/features/DeleteUser.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User confirm the deletion",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteUserStepdef.user_confirm_the_deletion()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should not see the user on the table",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteUserStepdef.user_should_not_see_the_user_on_the_table()"
});
formatter.result({
  "status": "skipped"
});
});