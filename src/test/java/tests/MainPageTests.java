package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MainPage;

public class MainPageTests extends BaseTest {
    String armenian = "'Հայերեն'";
    String english = "'English'";
    String russian = "'Русский'";

    MainPage mainPage = new MainPage();

    @Test
    public void switchToArmenianLanguageTest(){
        mainPage.changeAppLanguage(armenian);
        Assert.assertEquals(mainPage.getTextfromMainPage(), "Մեր մասին");
    }

    @Test
    public void switchToEnglishLanguageTest(){
        mainPage.changeAppLanguage(english);
        Assert.assertEquals(mainPage.getTextfromMainPage(), "About");
    }

    @Test
    public void switchToRussianLanguageTest(){
        mainPage.changeAppLanguage(russian);
        Assert.assertEquals(mainPage.getTextfromMainPage(), "О нас");
    }
}
