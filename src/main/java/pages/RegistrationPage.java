package pages;

import com.codeborne.selenide.SelenideElement;
import java.util.Random;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationPage {
    int day, month, year;
    String gender, country;
    private SelenideElement emailField = $("#email");
    private SelenideElement passwordField = $("[data-testid='password']");
    private SelenideElement confirmPasswordField = $("#confirmPassword");
    private SelenideElement currencyDropDown = $(":nth-child(4) > div > span.selectValue");
    private SelenideElement AMD = $("div.Drawer-drawerInnerStyles-0-2-243.Drawer-withoutPaddingStyles-0-2-242 > ul > li");
    private SelenideElement promoCodeField = $("#promoCode");
    private SelenideElement nextButton = $("div.formButtons > button");
    private SelenideElement firstNameField = $("#firstName");
    private SelenideElement lastNameField = $("lastName");
    private SelenideElement birthDate = $("birthDate");
    //  private SelenideElement dayInBirthDate = $(By.cssSelector("div.day > ul > li:nth-child(1)"));
    // private SelenideElement monthInBirthDate = $(By.cssSelector("div.month > ul > li:nth-child("+month+")"));
    // private SelenideElement yearInBirthDate = $(By.cssSelector("div.month > ul > li:nth-child("+year+")"));
    private SelenideElement closeDatePicker = $("div.selectedDate > i");
    private SelenideElement genderDropDown = $(".Select-selectParentStyles-d6-0-2-512 > div");
    private SelenideElement genderType = $("data-value=" + gender + "");
    private SelenideElement docNumber = $("#docNumber");
    private SelenideElement countryField = $(".Select-selectParentStyles-d8-0-2-519 > div > span.selectValue");
    private SelenideElement selectCountry = $("data-value=" + country + "");
    private SelenideElement phoneField = $("#phone");
    private SelenideElement termAndConditionsCheckBox = $("#agree");
    private SelenideElement signUpButton = $(".Popup-popupChildrenStyles-d13-0-2-481 > div > form > button > div");


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

//    public RegistrationPage selectBirthDate(int day, int month, int year) {
//        birthDate.click();
//        SelenideElement dayInBirthDate = $(By.cssSelector("div.day > ul > li:nth-child(" + day + ")"));
//        SelenideElement monthInBirthDate = $(By.cssSelector("div.month > ul > li:nth-child(" + month + ")"));
//        SelenideElement yearInBirthDate = $(By.cssSelector("div.month > ul > li:nth-child(" + year + ")"));
//        dayInBirthDate.click();
//        monthInBirthDate.click();
//        yearInBirthDate.click();
//        return this;
//    }

    public String generateEmail() {
        Random rand = new Random();
        int upperbound = 10000;
        int intRandom = rand.nextInt(upperbound);
        String email = "utest202101+" + intRandom + "@gmail.com";
        return email;
    }

    String generatedEmail = generateEmail();
}
