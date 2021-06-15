package test.java;

import main.pageEvents.HomePageEvents;
import main.pageEvents.LoginPageEvents;
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

}
