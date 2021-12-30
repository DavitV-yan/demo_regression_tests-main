package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement emailField = $(By.id("userName"));
    private SelenideElement passwordField = $(By.id("password"));
    private SelenideElement signInButton = $("form > button");

    public LoginPage typeInEmailField(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage typeInPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickOnSigninButton() {
        // signInButton.waitUntil(Condition.enabled, 10000);
        signInButton.click();
        return this;
    }

    public LoginPage logIn(String email, String password) {
        typeInEmailField(email);
        typeInPasswordField(password);
        clickOnSigninButton();
        return this;
    }

}
