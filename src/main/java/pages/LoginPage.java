package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    //Locators
    private By email_idLocator = By.name("uid");
    private By passwordLocator = By.name("password");
    private By loginLocator = By.name("btnLogin");
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickLogin(String string) {
        WebElement login = driver.findElement(loginLocator);
        login.click();
    }
    public void setPassword(String password) {
        WebElement pwd = driver.findElement(passwordLocator);
        pwd.sendKeys(password);
    }
    public void setEmail(String email) {
        WebElement emailloc = driver.findElement(email_idLocator);
        emailloc.sendKeys(email);
    }
}
