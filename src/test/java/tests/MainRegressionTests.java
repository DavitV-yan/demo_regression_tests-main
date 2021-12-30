package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class MainRegressionTests extends BaseTest {
     MainPage mainPage = new MainPage();
     LoginPage loginPage = new LoginPage();

    @Test
    public void LogInTest() throws InterruptedException {
        mainPage.clickOnLoginButton();
        loginPage.logIn(userEmail, userPassword);
        Thread.sleep(1000);
        Assert.assertEquals(mainPage.getUserCurrency(), "AMD");
    }

    @Test
    public void sportRouteTest() {
        mainPage.getSportRoute();
        Assert.assertEquals(mainPage.getSportRoute(), "http://spv2-stage.betcoapps.com/");
    }

    @Test
    public void inPlayRouteTest() {
        mainPage.getInPlayRoute();
        Assert.assertEquals(mainPage.getInPlayRoute(), "http://spv2-stage.betcoapps.com/live");
    }

    @Test
    public void esportRouteTest() {
        mainPage.getEsportRoute();
        Assert.assertEquals(mainPage.getEsportRoute(), "http://spv2-stage.betcoapps.com/esport");
    }

    @Test
    public void casinoRouteTest() {
        mainPage.getCasinoRoute();
        Assert.assertEquals(mainPage.getCasinoRoute(), "http://spv2-stage.betcoapps.com/casino");
    }

    @Test
    public void liveCsinoRouteTest() {
        mainPage.getLiveCasinoRoute();
        Assert.assertEquals(mainPage.getLiveCasinoRoute(), "http://spv2-stage.betcoapps.com/live-casino");
    }

    @Test
    public void gamesRouteTest() {
        mainPage.getGamesRoute();
        Assert.assertEquals(mainPage.getGamesRoute(), "http://spv2-stage.betcoapps.com/games");
    }

    @Test
    public void promotionsRouteTest() {
        mainPage.getPromotionsRoute();
        Assert.assertEquals(mainPage.getPromotionsRoute(), "http://spv2-stage.betcoapps.com/promotions");
    }

    @Test
    public void virtualSportsRouteTest() {
        mainPage.getVirtualSportsRoute();
        Assert.assertEquals(mainPage.getVirtualSportsRoute(), "http://spv2-stage.betcoapps.com/virtual-sports");
    }


//    @Test
//    public void changeAppLanguageToEnglish() {
//        mainPage.selectAppLanguage("eng")
//                .getLanguageText("Sign in");
//
//    }

}
