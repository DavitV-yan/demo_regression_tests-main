package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPage {
    private SelenideElement emailField = $("#userName");
    private SelenideElement passwordField = $("#password");
    private SelenideElement signInButton = $("form > button");
    private SelenideElement signUpButton = $(":nth-child(1) > div > button > div");
    private SelenideElement errorMessage = $(".danger > p");

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
        sleep(1000);
        return this;
    }

    public String getErrorMessage(){
        String text = errorMessage.getText();
        return text;
    }

}
