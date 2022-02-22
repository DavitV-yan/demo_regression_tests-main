package drivers;

import com.bme.data.TestData;
import com.bme.listeners.AllureListener;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.Map;
import static com.bme.utils.ConfigReader.*;
import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class SelenideDriverProvider {

    public static void initDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setAcceptInsecureCerts(true);
        caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, false);
        caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        caps.setCapability("platform", platform());
        caps.setCapability("getBrowserVersion", getBrowserVersion());
        assertionMode = SOFT;
        baseUrl = TestData.BASE_URL;
        pageLoadStrategy = "eager";
        browser = getBrowser();
        startMaximized = true;
        pollingInterval = 500;
        holdBrowserOpen = false;
        savePageSource = false;
        fastSetValue = true;
        screenshots = false;
        if (!isLocal()) {
            //http://http://10.25.112.102:4444/wd/hub
            remote = "http://10.100.8.4:4444/wd/hub";
            driverManagerEnabled = false;
            browserCapabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", false
            ));
        }
        headless = false;
        timeout = 10000;
        browserCapabilities.merge(caps);
        open();
    }

    
}

