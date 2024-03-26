package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteUserAction {

    public DeleteUserAction (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/table/tbody/tr[1]/td[11]/button/i")
    public WebElement deleteUser;

    @FindBy(xpath = "/html/body/div[2]/div[3]/button[2]")
    public WebElement popup_okBtn;

}
