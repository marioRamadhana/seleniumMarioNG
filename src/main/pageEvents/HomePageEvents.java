package main.pageEvents;

import main.pageObjects.HomePageElements;
import main.utils.ElementFetch;

public class HomePageEvents {

    public void clickOnSignButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.btnSignin).click();
    }

}
