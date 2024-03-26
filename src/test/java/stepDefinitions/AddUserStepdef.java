package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AddUserAction;

public class AddUserStepdef {

WebDriver driver;

    AddUserAction addUserAction;
    //private String role;


    @Given("user is on web page")
    public void user_is_on_web_page() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        Thread.sleep(5000);

        addUserAction = new AddUserAction(driver);


    }

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
        Thread.sleep(5000);
        addUserAction.salesTeam.click();

        Thread.sleep(5000);
        addUserAction.email.sendKeys("meryem@gmail.com");
        addUserAction.cellPhone.sendKeys("3333333333");
        Thread.sleep(5000);
        addUserAction.saveBTN.click();
    }


//    @And("user selects sales team option from dropdown")
//    public void userSelectsSalesTeamOptionFromDropdown() throws InterruptedException {
//                addUserAction.dropDownBTN.click();
//                Thread.sleep(5000);
//                addUserAction.salesTeam.click();
//
//    }

//    @And("user selects {string} option from dropdown")
//    public void user_selects_option_from_dropdown(String role) throws InterruptedException {
//        this.role = role;
//        switch (role) {
//            case "Sales Team":
//                addUserAction.dropDownBTN.click();
//                Thread.sleep(5000);
//                addUserAction.salesTeam.click();
//                break;
//
//            case "Customer":
//                addUserAction.dropDownBTN.click();
//                Thread.sleep(5000);
//                addUserAction.customerRole.click();
//                break;
//
//            case "Admin":
//                addUserAction.dropDownBTN.click();
//                Thread.sleep(5000);
//                addUserAction.Admin.click();
//                break;
//        }
//    }

//    @And("user enter their email and phone number")
//    public void user_enter_their_email_and_phone_number() throws InterruptedException {
//        Thread.sleep(5000);
//        addUserAction.email.sendKeys("meryem@gmail.com");
//        addUserAction.cellPhone.sendKeys("3333333333");
//        Thread.sleep(5000);
//        addUserAction.saveBTN.click();
//    }

    @And("user can see that the new user is added succesfully")
    public void user_can_see_that_the_new_user_is_added_succesfully() {
        WebElement addedUser = driver.findElement(By.xpath("//table/tbody/tr[last()]"));
        Assert.assertTrue(addedUser.isDisplayed());
        driver.quit();
    }


}
