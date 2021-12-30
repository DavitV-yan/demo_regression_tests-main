package pages;

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

    public String getCurrentUrl(){
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        return currentUrl;
    }

    public MainPage clickOnLoginButton() {
        loginButton.click();
        return this;
    }
        public String getUserCurrency(){
        String currency =  userCurrencyType.getText();
            return currency;
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
