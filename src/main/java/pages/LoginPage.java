package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement emailField = $(By.id("userName"));
    private SelenideElement passwordField = $(By.id("password"));
    private SelenideElement signInButton = $("form > button");
    private SelenideElement signUpButton = $(":nth-child(1) > div > button > div");

    public void typeInEmailField(String email) {
        emailField.sendKeys(email);
    }

    public void typeInPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickOnSigninButton() {
        signInButton.click();
    }

    public void clickOnSignUpButton() {
        signUpButton.click();
    }

    public LoginPage logIn(String email, String password) {
        typeInEmailField(email);
        typeInPasswordField(password);
        clickOnSigninButton();
        return this;
    }

}
