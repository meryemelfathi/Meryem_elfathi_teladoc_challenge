package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeleteUserAction;


public class DeleteUserStepdef {
    //WebDriver driver;

    DeleteUserAction deleteUserAction;


    @When("delete the user with user name")
    public void delete_the_user_with_user_name() throws InterruptedException {
            deleteUserAction.deleteUser.click();
            Thread.sleep(5000);
    }

//    @Then("user should see Confirmation Dialog popup")
//    public void user_should_see_Confirmation_Dialog_popup() {
//    }

    @Then("User confirm the deletion")
    public void user_confirm_the_deletion() {
        deleteUserAction.popup_okBtn.click();
    }

    @Then("user should not see the user on the table")
    public void user_should_not_see_the_user_on_the_table() {
    }
}
