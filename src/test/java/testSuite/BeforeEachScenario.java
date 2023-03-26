package testSuite;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeOptions;

public class BeforeEachScenario {
    @Given("Открываем сайт {string}")
    public void openSite(String url) {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        Configuration.timeout = 60000;
        Selenide.open(url);
    }
}
