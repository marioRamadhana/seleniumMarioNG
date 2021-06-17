package test.java.uploadFile;

import main.pageEvents.HomePageEvents;
import main.pageEvents.LoginPageEvents;
import main.pageEvents.ProfilPageEvents;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.BaseTest;

public class updateProfil extends BaseTest {

//    @Test
//    public void successLogin(){
//        HomePageEvents home = new HomePageEvents();
//        LoginPageEvents login = new LoginPageEvents();
//        home.clickOnSignButton();
//        login.enterUsername();
//        login.clickBtnContinue();
//        login.enterPassword();
//        login.clickBtnSignin();
//        home.clickOnSignButton();
//        String expect = "Your Account";
//        String actual = driver.getTitle();
//        Assert.assertEquals(actual, expect);
//    }

//    @Test
//    public void openProfilpage(){
//        HomePageEvents home = new HomePageEvents();
//        LoginPageEvents login = new LoginPageEvents();
//        ProfilPageEvents profil = new ProfilPageEvents();
//        home.clickOnSignButton();
//        login.enterUsername();
//        login.clickBtnContinue();
//        login.enterPassword();
//        login.clickBtnSignin();
//        home.clickOnSignButton();
//        profil.clickMenuYourProfile();
//        String expect = "Manage your Profiles";
//        String actual = driver.getTitle();
//        Assert.assertEquals(actual, expect);
//        profil.listAccount();
//        String expect2 = "Mario Gilang Ramadhana";
//        String actual2 = driver.getTitle();
//        Assert.assertEquals(actual2, expect2);
//    }

    @Test
    public void showListMenuAccount(){
        HomePageEvents home = new HomePageEvents();
        LoginPageEvents login = new LoginPageEvents();
        ProfilPageEvents profil = new ProfilPageEvents();
        home.clickOnSignButton();
        login.enterUsername();
        login.clickBtnContinue();
        login.enterPassword();
        login.clickBtnSignin();
        home.hoverAccountMenu(driver);
    }



}
