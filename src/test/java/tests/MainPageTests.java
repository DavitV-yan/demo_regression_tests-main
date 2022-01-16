package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MainPage;

import static pages.PageProvider.mainPage;

public class MainPageTests extends BaseTest {
    String armenian = "'Հայերեն'";
    String english = "'English'";
    String russian = "'Русский'";


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
