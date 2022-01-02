package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RegistrationPage;

import java.util.Random;

public class MainRegressionTests extends BaseTest {
    MainPage mainPage = new MainPage();

    protected String userEmail = "davit.vardanyan@betconstruct.com";
    protected String userPassword = "Test1234";
    private  String userCurrency = "AMD";
    private String sportRoute = "http://spv2-stage.betcoapps.com/";
    private String inPlayRoute = "http://spv2-stage.betcoapps.com/live";
    private String esportRoute = "http://spv2-stage.betcoapps.com/esport";
    private String casinoRoute = "http://spv2-stage.betcoapps.com/casino";
    private String liveCasinoRoute = "http://spv2-stage.betcoapps.com/live-casino";
    private String gamesRoute = "http://spv2-stage.betcoapps.com/games";
    private String promotionsRoute = "http://spv2-stage.betcoapps.com/promotions";
    private String virtualSports = "http://spv2-stage.betcoapps.com/virtual-sports";

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
        Assert.assertEquals(mainPage.getSportRoute(), sportRoute);
    }

    @Test
    public void inPlayRouteTest() {
        Assert.assertEquals(mainPage.getInPlayRoute(), inPlayRoute);
    }

    @Test
    public void esportRouteTest() {
        Assert.assertEquals(mainPage.getEsportRoute(), esportRoute);
    }

    @Test
    public void casinoRouteTest() {
        Assert.assertEquals(mainPage.getCasinoRoute(), casinoRoute);
    }

    @Test
    public void liveCsinoRouteTest() {
        Assert.assertEquals(mainPage.getLiveCasinoRoute(), liveCasinoRoute);
    }

    @Test
    public void gamesRouteTest() {
        Assert.assertEquals(mainPage.getGamesRoute(), gamesRoute);
    }

    @Test
    public void promotionsRouteTest() {
        Assert.assertEquals(mainPage.getPromotionsRoute(), promotionsRoute);
    }

    @Test
    public void virtualSportsRouteTest() {
        Assert.assertEquals(mainPage.getVirtualSportsRoute(), virtualSports);
    }


//    @Test
//    public void changeAppLanguageToEnglish() {
//        mainPage.selectAppLanguage("eng")
//                .getLanguageText("Sign in");
//
//    }

}
