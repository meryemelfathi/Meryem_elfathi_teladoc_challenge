package constant;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteUserRepo {

    @FindBy(xpath = "/html/body/table/tbody/tr[3]/td[11]/button/i")
    public WebElement deleteUser;

    @FindBy(xpath = "/html/body/table/tbody/tr[3]/td[3]")
    public WebElement novakUser;


    @FindBy(xpath = "/html/body/div[2]/div[3]/button[2]")
    public WebElement popup_okBtn;

    @FindBy(xpath = "/html/body/div[2]/div[1]/h3")
    public WebElement popup_header;
}
