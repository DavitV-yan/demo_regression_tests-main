package tests;
import drivers.SelenideDriverProvider;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;
import static data.TestData.BASE_URL;
abstract public class BaseTest{

    @BeforeClass(alwaysRun = true)
    public void start() {
        SelenideDriverProvider.initDriver();
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
