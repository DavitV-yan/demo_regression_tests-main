package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageProvider;
import static data.TestData.*;
import static com.codeborne.selenide.Selenide.*;


public class LoginPageTests extends BaseTest implements PageProvider {
    
    @Test (groups = "regressionTest", description = "Login test with valid user name and password")
    public void LogInTestValidCredentials() {
        sleep(500);
        mainPage.clickOnLoginButton()
                .logIn(USER_EMAIL, USER_PASSWORD);
        Assert.assertEquals(mainPage.getUserCurrency(), USER_CURRENCY_AMD);
    }

  @Test (groups = "regressionTest", description = "Login test with invalid user name and valid password")
  public void LogInTestInvalidUserName() {
      sleep(500);
      mainPage.clickOnLoginButton()
              .logIn(USER_PASSWORD, USER_PASSWORD);
      Assert.assertEquals(loginPage.getErrorMessage(), ErrorMessageTextInLoginPage);
  }

  @Test (groups = "regressionTest", description = "Login test with valid user name and invalid password")
  public void LogInTestInvalidPassword() {
      mainPage.clickOnLoginButton()
              .logIn(USER_EMAIL, USER_EMAIL);
      Assert.assertEquals(loginPage.getErrorMessage(), ErrorMessageTextInLoginPage);
  }
}
