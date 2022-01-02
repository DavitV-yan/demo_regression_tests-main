package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RegistrationPage;

import java.util.Random;

public class MainRegressionTests extends BaseTest {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    RegistrationPage regPage = new RegistrationPage();

    protected String userEmail = "davit.vardanyan@betconstruct.com";
    protected String userPassword = "Test1234";
    private  String userCurrency = "AMD";

    public String generateEmail() {
        Random rand = new Random();
        int upperbound = 10000;
        int intRandom = rand.nextInt(upperbound);
        String email = "utest202101+" + intRandom + "@gmail.com";
        return email;
    }

    String generatedEmail = generateEmail();

    @Test
    public void LogInTest() throws InterruptedException {
        mainPage.clickOnLoginButton()
                .logIn(userEmail, userPassword);
        Assert.assertEquals(mainPage.getUserCurrency(), userCurrency);
    }

    // @Test
    // public void RegistrationTest(){
    //     mainPage.clickOnLoginButton();
    //     sleep(1000);
    //     loginPage.clickOnSignUpButton();
    //     regPage.typeInEmailField(generatedEmail);
    //     regPage.typeInPasswordField("Test1234");
    //     regPage.typeInConfirmPasswordField("Test1234");
    //     regPage.selectCurrency("AMD");
    //     regPage.typeInpromoCodeField("promoCode");
    //     regPage.clickOnNextButton();
    //     regPage.selectBirthDate(2, 3, 1);
    //     sleep(10000);
    // }

    @Test
    public void sportRouteTest() {
        Assert.assertEquals(mainPage.getSportRoute(), "http://spv2-stage.betcoapps.com/");
    }

    @Test
    public void inPlayRouteTest() {
        Assert.assertEquals(mainPage.getInPlayRoute(), "http://spv2-stage.betcoapps.com/live");
    }

    @Test
    public void esportRouteTest() {
        Assert.assertEquals(mainPage.getEsportRoute(), "http://spv2-stage.betcoapps.com/esport");
    }

    @Test
    public void casinoRouteTest() {
        Assert.assertEquals(mainPage.getCasinoRoute(), "http://spv2-stage.betcoapps.com/casino");
    }

    @Test
    public void liveCsinoRouteTest() {
        Assert.assertEquals(mainPage.getLiveCasinoRoute(), "http://spv2-stage.betcoapps.com/live-casino");
    }

    @Test
    public void gamesRouteTest() {
        Assert.assertEquals(mainPage.getGamesRoute(), "http://spv2-stage.betcoapps.com/games");
    }

    @Test
    public void promotionsRouteTest() {
        Assert.assertEquals(mainPage.getPromotionsRoute(), "http://spv2-stage.betcoapps.com/promotions");
    }

    @Test
    public void virtualSportsRouteTest() {
        Assert.assertEquals(mainPage.getVirtualSportsRoute(), "http://spv2-stage.betcoapps.com/virtual-sports");
    }


//    @Test
//    public void changeAppLanguageToEnglish() {
//        mainPage.selectAppLanguage("eng")
//                .getLanguageText("Sign in");
//
//    }

}
