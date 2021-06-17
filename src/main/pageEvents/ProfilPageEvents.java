package main.pageEvents;

import main.pageObjects.ProfilPageElements;
import main.utils.ElementFetch;

public class ProfilPageEvents {
    public void clickMenuYourOrders(){
        ElementFetch element = new ElementFetch();
        element.getWebElement("XPATH", ProfilPageElements.btnYourOrder).click();
    }
    public void clickMenuYourProfile(){
        ElementFetch element = new ElementFetch();
        element.getWebElement("XPATH", ProfilPageElements.btnYourProfile).click();
    }
    public void listAccount(){
        ElementFetch element = new ElementFetch();
        element.getWebElement("CSS",ProfilPageElements.listAccount).click();
    }
}
