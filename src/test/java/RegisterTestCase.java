package test.java;

import main.pageEvents.HomePageEvents;
import main.pageEvents.LoginPageEvents;
import main.pageEvents.RegisterPageEvents;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTestCase extends BaseTest {

    @Test
    public void P_Register(){
        HomePageEvents home = new HomePageEvents();
        LoginPageEvents login = new LoginPageEvents();
        home.clickOnSignButton();
        login.clikBtnRegister();
        String expect = "Amazon Registration";
        String actual = driver.getTitle();
//        Assert.assertTrue(actual,expect);
        Assert.assertEquals(actual,expect);
    }

    @Test
    public void Register(){
        HomePageEvents home = new HomePageEvents();
        LoginPageEvents login = new LoginPageEvents();
        RegisterPageEvents reg = new RegisterPageEvents();
        home.clickOnSignButton();
        login.clikBtnRegister();
        reg.inpEmail();
        reg.inpUsername();
        reg.inpPassword();
        reg.inpPassword();
    }

}
