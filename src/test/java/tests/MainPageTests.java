package tests;

import org.testng.annotations.Test;

import pages.MainPage;

public class MainPageTests extends BaseTest{
    MainPage mainPage = new MainPage();

    @Test
    public void changeLanguageTest(){
        mainPage.changeLanguage();
    }
}
