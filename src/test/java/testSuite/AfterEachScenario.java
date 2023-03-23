package testSuite;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;

public class AfterEachScenario {
    @After
    public void closeBrowser() {
        WebDriverRunner.getWebDriver().quit();
    }
}
