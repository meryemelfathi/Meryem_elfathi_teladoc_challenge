package pages;

import constant.AddUserRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserAction extends AddUserRepo {

    WebDriver driver;

    public AddUserAction(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddUserLink(){
        addUser.click();
    }

    public void insertFirstName(String myFirstName){
        firstName.sendKeys(myFirstName);
    }

    public void insertLastName(String myLastName){
        lastName.sendKeys(myLastName);
    }

    public void insertUserName(String myUserName){
        userName.sendKeys(myUserName);
    }

    public void insertPassword(String myPassword){
        password.sendKeys(myPassword);
    }

    public void selectCustomer(){
        customer.click();
    }

    public void dropDown(){
        dropDownBTN.click();
    }

    public void selectRole(){
        salesTeam.click();
    }

    public void insertEmail(String myEmail){
        email.sendKeys(myEmail);
    }

    public void insertPhoneNumber(String myPhoneNumber){
        cellPhone.sendKeys(myPhoneNumber);
    }

    public void submitForm(){
        saveBTN.click();
    }

    public boolean newUserIsDisplayed(){
        return newUser.isDisplayed();
    }

}
