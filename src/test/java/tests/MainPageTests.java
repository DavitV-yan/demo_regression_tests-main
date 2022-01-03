package tests;

import org.testng.annotations.Test;

import pages.MainPage;

public class MainPageTests extends BaseTest {
    String hay = "'Հայերեն'";
    MainPage mainPage = new MainPage();

    @Test
    public void changeLanguageTest() {
        mainPage.changeAppLanguage(hay);
    }
}
