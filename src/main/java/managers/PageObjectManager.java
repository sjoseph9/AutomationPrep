package managers;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

// Create a single object for each class in stepDefinition
public class PageObjectManager {
    private WebDriver driver;
    private LoginPage loginpage;
    private HomePage homepage;
    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage getLoginpage()
    {
        return (loginpage==null)? loginpage = new LoginPage(driver) : loginpage;
    }
    public HomePage getHomepage()
    {
        return (homepage==null)? homepage = new HomePage(driver) : homepage;
    }

}
