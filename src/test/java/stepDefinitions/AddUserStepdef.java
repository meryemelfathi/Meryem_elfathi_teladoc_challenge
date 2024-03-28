package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AddUserAction;
import pages.DeleteUserAction;
import utils.Reporter;

public class AddUserStepdef {

    WebDriver driver;
    AddUserAction addUserAction;
    DeleteUserAction deleteUserAction;
    Reporter reporter;
    private String role;


    //First script
//    @Given("user is on web page")
//    public void user_is_on_web_page() throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
//        Thread.sleep(5000);
//        addUserAction = new AddUserAction(driver);
//        deleteUserAction = new DeleteUserAction(driver);
//
//    }

    @When("choose to click on add new user")
    public void choose_to_click_on_add_new_user() throws InterruptedException {
        addUserAction.addUser.click();
        Thread.sleep(5000);
    }

    @Then("user file the form")
    public void user_file_the_form() throws InterruptedException {
        addUserAction.firstName.sendKeys("Meryem");
        addUserAction.lastName.sendKeys("elfathi");
        addUserAction.userName.sendKeys("MElfathi");
        addUserAction.password.sendKeys("123@test");
        Thread.sleep(5000);

        addUserAction.customer.click();
        Thread.sleep(5000);
        addUserAction.dropDownBTN.click();
        addUserAction.salesTeam.click();

        Thread.sleep(5000);
        addUserAction.email.sendKeys("meryem@gmail.com");
        addUserAction.cellPhone.sendKeys("3333333333");
        Thread.sleep(5000);
        addUserAction.saveBTN.click();
    }


    //If we have locators for drop down list we can switch between cases
    @And("user selects {string} option from dropdown")
    public void user_selects_option_from_dropdown(String role) throws InterruptedException {
        this.role = role;
        switch (role) {
            case "Sales Team":
                addUserAction.dropDownBTN.click();
                Thread.sleep(5000);
                addUserAction.salesTeam.click();
                break;

            case "Customer":
                addUserAction.dropDownBTN.click();
                Thread.sleep(5000);
                addUserAction.customerRole.click();
                break;

            case "Admin":
                addUserAction.dropDownBTN.click();
                Thread.sleep(5000);
                addUserAction.Admin.click();
                break;
        }
    }

    @And("user can see that the new user added successfully")
    public void userCanSeeThatTheNewUserAddedSuccessfully() {
        Assert.assertTrue(addUserAction.newUserIsDisplayed());
        driver.quit();
    }


    //Second script
    @Given("launch web page and verify element")
    public void launchWebPageAndVerifyElement() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        addUserAction = new AddUserAction(driver);
    }

    @Then("add user popup appears")
    public void addUserPopupAppears() throws InterruptedException {
        Thread.sleep(5000);
        addUserAction.clickAddUserLink();
        Thread.sleep(5000);
    }

    @And("user fill the form with personal information")
    public void userFillTheFormWithPersonalInformation() throws InterruptedException {
        addUserAction.insertFirstName("Meryem");
        addUserAction.insertLastName("elfathi");
        addUserAction.insertUserName("Melfathi");
        addUserAction.insertPassword("123@Test");
        Thread.sleep(5000);
        addUserAction.selectCustomer();
    }

    @And("user selects role from the dropdown")
    public void userSelectsRoleFromTheDropdown() throws InterruptedException {
        addUserAction.dropDown();
        Thread.sleep(5000);
        addUserAction.selectRole();
    }

    @And("user enter their email and phone number")
    public void userEnterTheirEmailAndPhoneNumber() throws InterruptedException {
        Thread.sleep(5000);
        addUserAction.insertEmail("meryem@gmail.com");
        addUserAction.insertPhoneNumber("3333333333");
    }

    @And("user submit the form")
    public void userSubmitTheForm() throws InterruptedException {
        Thread.sleep(5000);
        addUserAction.submitForm();
    }

}
