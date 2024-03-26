package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){

    }
//apply encapsulation and hide data
    private static WebDriver driver;

// create getter method
    public static WebDriver getDriver(){

        System.setProperty("webdriver.firefox.marionette","src/test/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        return driver;

    }


}
