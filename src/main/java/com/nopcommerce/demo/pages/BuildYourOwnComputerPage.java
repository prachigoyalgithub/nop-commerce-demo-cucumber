package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.aventstack.extentreports.Status.PASS;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;

    @CacheLookup
    @FindBy(xpath = "(//select[@id='product_attribute_1'])[1]")
    WebElement processorDropdown;
    @CacheLookup
    @FindBy(xpath = "(//select[@id='product_attribute_2'])[1]")
    WebElement ramDropdown;
    @CacheLookup
    //@FindBy(xpath = "(//input[@id='product_attribute_3_6'])[1]")
    @FindBy(css = "#product_attribute_3_6")
    WebElement hddRadioButton;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='product_attribute_4_8'])[1]")
    //@FindBy(xpath = "(//ul[@class='option-list'])[2]")
    WebElement osRadioButton;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='product_attribute_5_10'])[1]")
    //@FindBy(xpath = "(//ul[@class='option-list'])[3]")
    WebElement softwareRadioButton;
    @CacheLookup
    @FindBy(xpath = "(//button[@id='add-to-cart-button-1'])[1]")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.bar-notification-container:nth-child(6) div.bar-notification.success > p.content")
    WebElement addedToShoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='option-list']//li//label")
    List<WebElement> radioButtonSelection;


    public String clickOnBuildYourOwnComputerProduct() {
        String message = ("Click On build your own computer product");
        log.info(PASS);
        return message;
    }
    public void selectProcessorFieldDropDownOption (String option){
        selectByVisibleTextFromDropDown(processorDropdown, option);
        log.info("Selecting processor from drop-down : " + processorDropdown.toString());
    }

    public void selectRAMFieldDropDownOption (String option){
        selectByVisibleTextFromDropDown(ramDropdown, option);
        log.info("Selecting RAM from drop-down : " + ramDropdown.toString());
    }

    public void clickOnHDD320GBRadioButton () {
        clickOnElement(hddRadioButton);
        log.info("Selecting 320GB HDD : " + hddRadioButton.toString());
    }

    public void clickOnHDD400GBRadioButton () {
        clickOnElement(osRadioButton);
        log.info("Selecting 400GB HDD : " + osRadioButton.toString());
    }

    public void clickOnOSVistaHomeRadioButton() {
        clickOnElement(softwareRadioButton);
        log.info("Selecting Vista Home OS : " + softwareRadioButton.toString());
    }

    public void clickOnOSVistaPremiumRadioButton() {
        clickOnElement(softwareRadioButton);
        log.info("Selecting Vista Premier OS : " + softwareRadioButton.toString());
    }

    public void clickOnSoftwareMicrosoftOfficeCheckBox() {
        clickOnElement(softwareRadioButton);
        log.info("Clicking on Microsoft Office Software : " + softwareRadioButton.toString());
    }

    public void clickOnSoftwareAcrobatReaderCheckBox() {
        clickOnElement((By) radioButtonSelection);
        log.info("Clicking on Acrobat Reader Software : " + radioButtonSelection.toString());
    }

    public void clickOnSoftwareTotalCommanderCheckBox() {
        clickOnElement(softwareRadioButton);
        log.info("Clicking on Total Commander Software : " + softwareRadioButton.toString());
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
        log.info("Clicking on Add to Cart : " + addToCartButton.toString());
    }

    public String getAddToCartSuccessfulMessage () {
        log.info("Getting Add to cart success message : " + addedToShoppingCartText.toString());
        return getTextFromElement(addedToShoppingCartText);
    }

}






