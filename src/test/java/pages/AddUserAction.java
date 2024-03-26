package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserAction {

    public AddUserAction(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/table/thead/tr[2]/td/button/i")
    public WebElement addUser;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")
    public WebElement firstName;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input")
    public WebElement lastName;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input")
    public WebElement userName;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")
    public WebElement password;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]")
    public WebElement customer;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select")
    public WebElement role;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input")
    public WebElement email;
    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[8]/td[2]/input")
    public WebElement cellPhone;

    @FindBy(xpath = "/html/body/div[2]/div[3]/button[2]")
    public WebElement saveBTN;

    @FindBy(xpath = "/html/body/div[2]/div[3]/button[1]")
    public WebElement closeBTN;

    @FindBy(xpath = "//table/tbody/tr[last()]")
    public WebElement newUser;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select")
    public WebElement dropDownBTN;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select")
    public WebElement salesTeam;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select")
    public WebElement customerRole;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select")
    public WebElement Admin;


}
