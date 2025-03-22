package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    //Locators
    private By page_titleLocator = By.xpath("//a[@ title='Home']");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String verifyTitle()
    {
        WebElement pageTitle = driver.findElement(page_titleLocator);
        return pageTitle.getAttribute("title");
    }
}
