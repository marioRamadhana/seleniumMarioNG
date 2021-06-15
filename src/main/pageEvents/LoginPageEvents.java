package main.pageEvents;

import main.pageObjects.LoginPageElements;
import main.utils.Constants;
import main.utils.ElementFetch;
import org.testng.Assert;

public class LoginPageEvents {


    public void verifyLoginPage(){
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.signTitle).size()>0, "Login Page Not Open");
    }

    public void enterUsername(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("CSS",LoginPageElements.username).sendKeys(Constants.email);
    }

    public void clickBtnContinue(){
        ElementFetch elementFetch= new ElementFetch();
        elementFetch.getWebElement("CSS",LoginPageElements.btnContinue).click();
    }
}
