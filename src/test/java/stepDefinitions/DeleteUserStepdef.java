package stepDefinitions;

import constant.DeleteUserRepo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AddUserAction;
import pages.DeleteUserAction;


public class DeleteUserStepdef {
    WebDriver driver;
    DeleteUserAction deleteUserAction;




    //First script
    @Given("user is on web page")
    public void user_is_on_web_page() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        Thread.sleep(5000);
        deleteUserAction = new DeleteUserAction(driver);
    }

    @When("delete the user with user name novak")
    public void delete_the_user_with_user_name() throws InterruptedException {
        deleteUserAction.deleteUser.click();
            Thread.sleep(5000);
    }

    @Then("user should see Confirmation Dialog popup")
    public void user_should_see_Confirmation_Dialog_popup() {
        Assert.assertTrue(deleteUserAction.dialogPopupIsDisplayed());
    }

    @Then("User confirm the deletion")
    public void user_confirm_the_deletion() {
        deleteUserAction.popup_okBtn.click();
    }

    @Then("user should not see the user on the table")
    public void user_should_not_see_the_user_on_the_table() {
        Assert.assertFalse(deleteUserAction.userIsDisplayed());
    }
}
