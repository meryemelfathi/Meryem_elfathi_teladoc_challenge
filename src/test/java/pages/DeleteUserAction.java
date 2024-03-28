package pages;

import constant.DeleteUserRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteUserAction extends DeleteUserRepo {

    WebDriver driver;

    public DeleteUserAction (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean dialogPopupIsDisplayed(){
        return popup_header.isDisplayed();
    }

    public boolean userIsDisplayed(){
        return deleteUser.isDisplayed();
    }




}
