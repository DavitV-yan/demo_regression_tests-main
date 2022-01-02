package tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

abstract public class BaseTest {
    protected static final String BASE_URL = "http://spv2-stage.betcoapps.com/";


    private void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.headless = true;
        Configuration.browserSize = "375x812";
        // Configuration.timeout = 5000;
        // Configuration.pageLoadTimeout = 5000;
        Configuration.clickViaJs = true;
        // Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
        open(BASE_URL);
        sleep(500);
    }


    @BeforeMethod
    public void start() {
        setUp();
    }

    @AfterMethod
    public void tearDown() {
        sleep(3000);
        closeWebDriver();
    }

}
