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

    public void clikBtnRegister(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.btnRegister).click();
    }

    public void enterPassword(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("CSS", LoginPageElements.password).sendKeys(Constants.password);
    }

    public void clickBtnSignin(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("CSS", LoginPageElements.btnSignIn).click();
    }
}
