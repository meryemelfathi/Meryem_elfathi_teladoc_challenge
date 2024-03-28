$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DeleteUser.feature");
formatter.feature({
  "name": "Delete user",
  "description": "  this feature talks about delete an existing user and validate the user has been deleted from the table",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate deleting new user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user is on web page",
  "keyword": "Given "
});
formatter.match({
  "location": "DeleteUserStepdef.user_is_on_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "delete the user with user name novak",
  "keyword": "When "
});
formatter.match({
  "location": "DeleteUserStepdef.delete_the_user_with_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see Confirmation Dialog popup",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteUserStepdef.user_should_see_Confirmation_Dialog_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User confirm the deletion",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteUserStepdef.user_confirm_the_deletion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not see the user on the table",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteUserStepdef.user_should_not_see_the_user_on_the_table()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertFalse(Assert.java:64)\r\n\tat org.junit.Assert.assertFalse(Assert.java:74)\r\n\tat stepDefinitions.DeleteUserStepdef.user_should_not_see_the_user_on_the_table(DeleteUserStepdef.java:49)\r\n\tat ✽.user should not see the user on the table(file:src/test/resources/features/DeleteUser.feature:11)\r\n",
  "status": "failed"
});
});