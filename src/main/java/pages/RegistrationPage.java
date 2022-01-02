package pages;

import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class RegistrationPage {
    int day, month, year;
    String gender, country;
    private SelenideElement emailField = $(By.id("email"));
    private SelenideElement passwordField = $(By.cssSelector("[data-testid='password']"));
    private SelenideElement confirmPasswordField = $(By.id("confirmPassword"));
    private SelenideElement currencyDropDown = $(By.cssSelector(":nth-child(4) > div > span.selectValue"));
    private SelenideElement AMD = $(By.cssSelector("div.Drawer-drawerInnerStyles-0-2-243.Drawer-withoutPaddingStyles-0-2-242 > ul > li"));
    private SelenideElement promoCodeField = $(By.id("promoCode"));
    private SelenideElement nextButton = $(By.cssSelector("div.formButtons > button"));
    private SelenideElement firstNameField = $(By.id("firstName"));
    private SelenideElement lastNameField = $(By.id("lastName"));
    private SelenideElement birthDate = $(By.id("birthDate"));
    //  private SelenideElement dayInBirthDate = $(By.cssSelector("div.day > ul > li:nth-child(1)"));
    // private SelenideElement monthInBirthDate = $(By.cssSelector("div.month > ul > li:nth-child("+month+")"));
    // private SelenideElement yearInBirthDate = $(By.cssSelector("div.month > ul > li:nth-child("+year+")"));
    private SelenideElement closeDatePicker = $(By.cssSelector("div.selectedDate > i"));
    private SelenideElement genderDropDown = $(By.cssSelector(".Select-selectParentStyles-d6-0-2-512 > div"));
    private SelenideElement genderType = $(By.cssSelector("data-value=" + gender + ""));
    private SelenideElement docNumber = $(By.id("docNumber"));
    private SelenideElement countryField = $(By.cssSelector(".Select-selectParentStyles-d8-0-2-519 > div > span.selectValue"));
    private SelenideElement selectCountry = $(By.cssSelector("data-value=" + country + ""));
    private SelenideElement phoneField = $(By.id("phone"));
    private SelenideElement termAndConditionsCheckBox = $(By.id("agree"));
    private SelenideElement signUpButton = $(By.cssSelector(".Popup-popupChildrenStyles-d13-0-2-481 > div > form > button > div"));


    public RegistrationPage typeInEmailField(String email) {
        sleep(500);
        emailField.sendKeys(email);
        return this;
    }

    public RegistrationPage typeInPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public RegistrationPage typeInConfirmPasswordField(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
        return this;
    }

    public RegistrationPage selectCurrency(String currency) {
        currencyDropDown.click();
        if (currency == "AMD") {
            AMD.click();
        }
        return this;
    }

    public RegistrationPage typeInpromoCodeField(String promoCode) {
        promoCodeField.sendKeys(promoCode);
        return this;
    }

    public RegistrationPage clickOnNextButton() {
        nextButton.click();
        sleep(1000);
        return this;
    }

    public RegistrationPage typeInFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    public RegistrationPage typeInLastNameField(String firstName) {
        lastNameField.sendKeys(firstName);
        return this;
    }

    public RegistrationPage selectBirthDate(int day, int month, int year) {
        birthDate.click();
        SelenideElement dayInBirthDate = $(By.cssSelector("div.day > ul > li:nth-child(" + day + ")"));
        SelenideElement monthInBirthDate = $(By.cssSelector("div.month > ul > li:nth-child(" + month + ")"));
        SelenideElement yearInBirthDate = $(By.cssSelector("div.month > ul > li:nth-child(" + year + ")"));
        dayInBirthDate.click();
        monthInBirthDate.click();
        yearInBirthDate.click();
        return this;
    }


}
