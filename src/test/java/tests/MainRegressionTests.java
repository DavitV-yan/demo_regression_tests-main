package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageProvider;
import static data.TestData.*;

public class MainRegressionTests extends BaseTest implements PageProvider {
    private String sportRoute = "http://spv2-stage.betcoapps.com/";
    private String inPlayRoute = "http://spv2-stage.betcoapps.com/live";
    private String esportRoute = "http://spv2-stage.betcoapps.com/esport";
    private String casinoRoute = "http://spv2-stage.betcoapps.com/casino";
    private String liveCasinoRoute = "http://spv2-stage.betcoapps.com/live-casino";
    private String gamesRoute = "http://spv2-stage.betcoapps.com/games";
    private String promotionsRoute = "http://spv2-stage.betcoapps.com/promotions";
    private String virtualSports = "http://spv2-stage.betcoapps.com/virtual-sports";

    @Test (groups = "regressionTest")
    public void LogInTest() {
        mainPage.clickOnLoginButton()
                .logIn(USER_EMAIL, USER_PASSWORD);
        Assert.assertEquals(mainPage.getUserCurrency(), USER_CURRENCY_AMD);
    }

    @Test (groups = {"smokeTest"})
    public void sportRouteTest() {
        Assert.assertEquals(mainPage.getSportRoute(), sportRoute);
    }

    @Test (groups = {"smokeTest"})
    public void inPlayRouteTest() {
        Assert.assertEquals(mainPage.getInPlayRoute(), inPlayRoute);
    }

    @Test (groups = {"smokeTest"})
    public void esportRouteTest() {
        Assert.assertEquals(mainPage.getEsportRoute(), esportRoute);
    }

    @Test (groups = {"smokeTest"})
    public void casinoRouteTest() {
        Assert.assertEquals(mainPage.getCasinoRoute(), casinoRoute);
    }

    @Test (groups = {"smokeTest"})
    public void liveCsinoRouteTest() {
        Assert.assertEquals(mainPage.getLiveCasinoRoute(), liveCasinoRoute);
    }

    @Test (groups = {"smokeTest"})
    public void gamesRouteTest() {
        Assert.assertEquals(mainPage.getGamesRoute(), gamesRoute);
    }

    @Test (groups = {"smokeTest"})
    public void promotionsRouteTest() {
        Assert.assertEquals(mainPage.getPromotionsRoute(), promotionsRoute);
    }

    @Test (groups = {"smokeTest"})
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
