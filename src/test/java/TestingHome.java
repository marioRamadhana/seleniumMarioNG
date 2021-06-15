package test.java;

import main.pageEvents.HomePageEvents;
import main.pageEvents.LoginPageEvents;
import org.testng.annotations.Test;

public class TestingHome extends BaseTest{

    @Test
    public void sampleTest(){
        HomePageEvents home = new HomePageEvents();
        LoginPageEvents login = new LoginPageEvents();
        home.clickOnSignButton();
        login.verifyLoginPage();
        login.enterUsername();
        login.clickBtnContinue();
    }

    @Test
    public void testOne(){
        HomePageEvents home = new HomePageEvents();
        LoginPageEvents login = new LoginPageEvents();
        home.clickOnSignButton();
        login.verifyLoginPage();
    }
}
