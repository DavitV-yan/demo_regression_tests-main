package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageProvider;

public class MainRegressionTests extends BaseTest implements PageProvider {

    protected String userEmail = "davit.vardanyan@betconstruct.com";
    protected String userPassword = "Test1235";
    private String userCurrency = "AMD";
    private String sportRoute = "http://spv2-stage.betcoapps.com/";
    private String inPlayRoute = "http://spv2-stage.betcoapps.com/live";
    private String esportRoute = "http://spv2-stage.betcoapps.com/esport";
    private String casinoRoute = "http://spv2-stage.betcoapps.com/casino";
    private String liveCasinoRoute = "http://spv2-stage.betcoapps.com/live-casino";
    private String gamesRoute = "http://spv2-stage.betcoapps.com/games";
    private String promotionsRoute = "http://spv2-stage.betcoapps.com/promotions";
    private String virtualSports = "http://spv2-stage.betcoapps.com/virtual-sports";

    @Test
    public void LogInTest() {
        mainPage.clickOnLoginButton()
                .logIn(userEmail, userPassword);
        Assert.assertEquals(mainPage.getUserCurrency(), userCurrency);
    }

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
