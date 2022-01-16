package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;
import static data.TestData.BASE_URL;

abstract public class BaseTest {

    @BeforeSuite(alwaysRun = true)
    public void setUpAll() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        Configuration.browserSize = "375x812";
        // Configuration.timeout = 5000;
        // Configuration.pageLoadTimeout = 5000;
        Configuration.clickViaJs = true;
        // Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        open(BASE_URL);
        sleep(500);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        sleep(3000);
        closeWindow();
        closeWebDriver();

    }

}
