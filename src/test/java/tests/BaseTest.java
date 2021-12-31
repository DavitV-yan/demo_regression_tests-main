package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

import java.util.Random;

public class BaseTest {
    protected static final String BASE_URL = "http://spv2-stage.betcoapps.com/";
    protected String userEmail  = "davit.vardanyan@betconstruct.com";
    protected String userPassword = "Test1234";
    Random rand = new Random(); 
    int upperbound = 10000;
    int intRandom = rand.nextInt(upperbound); 

    public String generateEmail(){
        String email = "utest202101+"+intRandom+"@gmail.com";
        return email;
      }

    @BeforeMethod
    public void beforeMethod() {
        //Configuration.headless = true;
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

    // @AfterMethod(alwaysRun = true)
    // public void tearDown() {
    //     sleep(3000);
    //     closeWebDriver();
    // }

}
