package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends LoginPage {
    private SelenideElement loginButton = $("div > button");
    private SelenideElement userCurrencyType = $("[data-testid=balance-currency]");
    private SelenideElement sportRoute = $("nav > a:nth-child(1)");
    private SelenideElement inPlayRoute = $("nav > a:nth-child(2)");
    private SelenideElement esportRoute = $("nav > a:nth-child(3)");
    private SelenideElement casinoRoute = $("nav > a:nth-child(4)");
    private SelenideElement liveCasinoRoute = $("nav > a:nth-child(5)");
    private SelenideElement gamesRoute = $("nav > a:nth-child(6)");
    private SelenideElement promotionsRoute = $("nav > a:nth-child(7)");
    private SelenideElement virtualSportsRoute = $("nav > a:nth-child(8)");
    private SelenideElement textForCheckingLanguage = $x("//*[@id='layout']/footer/div[1]/div[1]/div/p");

    //first element for language drop-down second element for odds format drop-down
    private ElementsCollection dropDown = $$(".selectLabel");
    private SelenideElement oddsFormatDropDown = $("footer > div:nth-child(2) > div:nth-child(2) > div");


    private String getCurrentUrl() {
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }

    public MainPage clickOnLoginButton() {
        loginButton.click();
        return this;
    }

    public String getUserCurrency() {
        return userCurrencyType.getText();
    }

    public String getSportRoute() {
        sportRoute.click();
        return getCurrentUrl();
    }

    public String getInPlayRoute() {
        inPlayRoute.click();
        return getCurrentUrl();
    }

    public String getEsportRoute() {
        esportRoute.click();
        return getCurrentUrl();
    }

    public String getCasinoRoute() {
        casinoRoute.click();
        return getCurrentUrl();
    }

    public String getLiveCasinoRoute() {
        liveCasinoRoute.click();
        return getCurrentUrl();
    }

    public String getGamesRoute() {
        gamesRoute.click();
        return getCurrentUrl();
    }

    public String getPromotionsRoute() {
        promotionsRoute.click();
        return getCurrentUrl();
    }

    public String getVirtualSportsRoute() {
        virtualSportsRoute.click();
        return getCurrentUrl();
    }

    public void clickOnLanguageDropDown() {
        dropDown.first().click();
    }

    public void changeAppLanguage(String language) {
        clickOnLanguageDropDown();
        SelenideElement selectLanguage = $x("//li[text()=" + language + "]");
        selectLanguage.click();
        sleep(500);
    }

    public String getTextFromMainPage() {
        return textForCheckingLanguage.getText();
    }

//    public MainPage clickOnUserIcon() {
//        userIcon.click();
//        return this;
//    }
//
//    public MainPage getUserName(String text) {
//        userName.shouldHave(Condition.text(text));
//        return this;
//    }
//
//
//    public MainPage selectAppLanguage(String text) {
//        selectLanguage.selectOptionByValue(text);
//        return this;
//    }

//    public MainPage getLanguageText(String text) {
//        loginTitle.shouldHave(Condition.text(text));
//        return this;
//    }

}
