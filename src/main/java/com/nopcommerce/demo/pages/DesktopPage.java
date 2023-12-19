package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;
    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;
    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement display;

    public String getDesktopsText() {
        String message = getTextFromElement(desktopsText);
        log.info("Getting text from : " + desktopsText.toString());
        return message;
    }

    public String clickOnSortBy() {
        String message = getTextFromElement(sortBy);
        log.info("Getting text from : " + sortBy.toString());
        return message;

    }

    public String clickOnDisplay() {
        String message = getTextFromElement(display);
        log.info("Getting text from : " + display.toString());
        return message;
    }
}




