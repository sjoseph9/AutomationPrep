package helper;

import managers.PageObjectManager;
import managers.WebDriverManager;

import java.io.IOException;

public class TestContext {
    private PageObjectManager pageObjectManager;
    private WebDriverManager webDriverManager;
    public TestContext() throws IOException {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }
}
