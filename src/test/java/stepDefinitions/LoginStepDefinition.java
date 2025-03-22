package stepDefinitions;


import helper.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import managers.WebDriverManager;
import managers.PageObjectManager;
import managers.FileReaderManager;
import pages.HomePage;
import pages.LoginPage;
//import pico.TestContext;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {
    //WebDriver driver;
    LoginPage loginpage;
    HomePage homepage;
    PageObjectManager pageobj;
  //  WebDriverManager webmanager;
    TestContext context;
   public LoginStepDefinition(TestContext tc) throws IOException {
        context = tc;
        loginpage= context.getPageObjectManager().getLoginpage();
    }

    @Given("user is in home page")
    public void user_is_in_home_page() throws IOException {
        //System.setProperty("webdriver.chrome.driver",getGlobalProperties("driverPath"));
        //System.setProperty("webdriver.http.factory", "jdk-http-client");
        //driver = new ChromeDriver();
        //webmanager =+++-9444444444444444----- new WebDriverManager();
        //driver = webmanager.getDriver();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait((10), TimeUnit.SECONDS);
        //driver.get(FileReaderManager.getInstance().getConfigFileReader().getGlobalProperties("url"));
        //loginpage = new loginPage(driver);
       // pageobj = new PageObjectManager(driver);
        //loginpage = pageobj.getLoginpage();
        //loginpage= context.getPageObj().getLoginpage();
    }
    @When("user enters {string} in textbox")
    public void user_enters_in_textbox(String input) {
        // Write code here that turns the phrase above into concrete actions
      loginpage.setEmail(input);
    }
    @When("user enters {string} in password textbox")
    public void user_enters_in_password_textbox(String input) {
        loginpage.setPassword(input);
    }

        @When("user clicks on {string}")
    public void user_clicks_on(String string) {
        loginpage.clickLogin(string);
    }
    @Then("user is navigated to {string} page")
    public void user_is_navigated_to_page(String string) {
        //homepage = new homePage(driver);
     //   homepage = context.getPageObj().getHomepage();
        homepage = pageobj.getHomepage();
        System.out.println("Page title is " +homepage.verifyTitle());

    }

}
