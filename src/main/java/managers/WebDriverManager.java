package managers;

import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private WebDriver driver;
    private DriverType driverType;
    public  WebDriverManager() throws IOException {
        driverType = DriverType.valueOf(FileReaderManager.getInstance().getConfigFileReader().getGlobalProperties("browser"));
    }

    public WebDriver getDriver() throws IOException {
        if(driver==null) driver = createDriver();
        return driver;
    }
    public WebDriver createDriver() throws IOException {
        switch (driverType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigFileReader().getGlobalProperties("driverPath"));
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                driver = new ChromeDriver();

                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((10), TimeUnit.SECONDS);
        driver.get(FileReaderManager.getInstance().getConfigFileReader().getGlobalProperties("url"));
        return driver;

    }
}
