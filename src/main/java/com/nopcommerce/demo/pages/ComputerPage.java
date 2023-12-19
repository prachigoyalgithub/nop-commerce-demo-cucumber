package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerText;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Notebooks']")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Software']")
    WebElement softwareLink;


    public String getComputersText() {
        String message = getTextFromElement(computerText);
        log.info("Getting text from : " + computerText.toString());
        return message;

    }

    public void clickOnDesktopsLink() {
        clickOnElement(desktopsLink);
        log.info("Clicking On Desktops menu : " + desktopsLink.toString());
    }

    public void clickOnNotebookLink() {
        clickOnElement(notebooksLink);
        log.info("Clicking On Notebook menu : " + notebooksLink.toString());

    }

    public void clickOnSoftwareLink() {
        clickOnElement(softwareLink);
        log.info("Clicking On Notebook menu : " + softwareLink.toString());
    }
}





