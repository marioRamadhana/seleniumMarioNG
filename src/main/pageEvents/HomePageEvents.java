package main.pageEvents;

import main.pageObjects.HomePageElements;
import main.utils.ElementFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageEvents {

    public void clickOnSignButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.btnSignin).click();
    }
    public void hoverAccountMenu(WebDriver driver){
        ElementFetch elementFetch = new ElementFetch();
        Actions actions = new Actions(driver);
        WebElement target = elementFetch.getWebElement("CSS", HomePageElements.listMenuAccount);
        actions.moveToElement(target).perform();
//        elementFetch.getWebElement("XPATH", HomePageElements.subWatchlist).click();
    }


}
