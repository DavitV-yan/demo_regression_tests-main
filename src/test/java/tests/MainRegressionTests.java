package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageProvider;
import static data.TestData.*;

public class MainRegressionTests extends BaseTest implements PageProvider {
    private String sportRoute = BASE_URL+"/";
    private String inPlayRoute = BASE_URL+"/live";
    private String esportRoute = BASE_URL+"/esport";
    private String casinoRoute = BASE_URL+"/casino";
    private String liveCasinoRoute = BASE_URL+"/live-casino";
    private String gamesRoute = BASE_URL+"/games";
    private String promotionsRoute = BASE_URL+"/promotions";
    private String virtualSports = BASE_URL+"/virtual-sports";

     @Test (groups = "regressionTest", description = "Login test with valid user name and password")
     public void LogInTestValidCredentials() {
         mainPage.clickOnLoginButton()
                 .logIn(USER_EMAIL, USER_PASSWORD);
         Assert.assertEquals(mainPage.getUserCurrency(), USER_CURRENCY_AMD);
     }

//    @Test (groups = "regressionTest", description = "Login test with invalid user name and valid password")
//    public void LogInTestInvalidUserName() {
//        mainPage.clickOnLoginButton()
//                .logIn(USER_PASSWORD, USER_PASSWORD);
//        Assert.assertEquals(mainPage.getUserCurrency(), USER_CURRENCY_AMD);
//    }
//
//    @Test (groups = "regressionTest", description = "Login test with valid user name and invalid password")
//    public void LogInTestInvalidPassword() {
//        mainPage.clickOnLoginButton()
//                .logIn(USER_EMAIL, USER_EMAIL);
//        Assert.assertEquals(mainPage.getUserCurrency(), USER_CURRENCY_AMD);
//    }

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
