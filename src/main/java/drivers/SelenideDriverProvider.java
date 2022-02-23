package drivers;

import com.codeborne.selenide.Configuration;

public class SelenideDriverProvider{
    public static void initDriver(){
        Configuration.browser = "chrome";
        //Configuration.browser = "firefox";
        //Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        Configuration.browserSize = "375x812";
        // Configuration.timeout = 5000;
        // Configuration.pageLoadTimeout = 5000;
        //Configuration.clickViaJs = true;
        // Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }
}