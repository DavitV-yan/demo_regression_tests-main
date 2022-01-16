package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageProvider;

public class MainPageTests extends BaseTest implements PageProvider {
    String armenian = "'Հայերեն'";
    String english = "'English'";
    String russian = "'Русский'";


    @Test
    public void switchToArmenianLanguageTest() {
        mainPage.changeAppLanguage(armenian);
        Assert.assertEquals(mainPage.getTextFromMainPage(), "Մեր մասին");
    }

    @Test
    public void switchToEnglishLanguageTest() {
        mainPage.changeAppLanguage(english);
        Assert.assertEquals(mainPage.getTextFromMainPage(), "About");
    }

    @Test
    public void switchToRussianLanguageTest() {
        mainPage.changeAppLanguage(russian);
        Assert.assertEquals(mainPage.getTextFromMainPage(), "О нас");
    }


}
