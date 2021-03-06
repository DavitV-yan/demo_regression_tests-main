package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageProvider;

public class MainPageTests extends BaseTest implements PageProvider {
    String armenian = "arm";
    String english = "eng";
    String russian = "rus";


    @Test(groups = "smokeTest")
    public void switchToArmenianLanguageTest() {
        mainPage.changeAppLanguage(armenian);
        Assert.assertEquals(mainPage.getTextFromMainPage(), "Մեր մասին");
    }

    @Test(groups = "smokeTest")
    public void switchToEnglishLanguageTest() {
        mainPage.changeAppLanguage(english);
        Assert.assertEquals(mainPage.getTextFromMainPage(), "About");
    }

    @Test(groups = "smokeTest")
    public void switchToRussianLanguageTest() {
        mainPage.changeAppLanguage(russian);
        Assert.assertEquals(mainPage.getTextFromMainPage(), "О нас");
    }


}
