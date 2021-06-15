package main.pageEvents;

import main.pageObjects.RegisterPageElements;
import main.utils.Constants;
import main.utils.ElementFetch;

public class RegisterPageEvents {
    public void inpUsername(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("CSS", RegisterPageElements.username).sendKeys(Constants.name);
    }
    public void inpEmail(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("CSS", RegisterPageElements.email).sendKeys(Constants.email);
    }
    public void inpPassword(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("CSS", RegisterPageElements.password).sendKeys(Constants.password);
    }
    public void inpConfirmPassword(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("CSS", RegisterPageElements.confirmPassword).sendKeys(Constants.password);
    }
}
