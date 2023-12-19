import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class ComputerSteps {
    @When("I click on computer link")
    public void iClickOnComputerLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("I should see the {string} text message computer page")
    public void iShouldSeeTheTextMessageComputerPage(String arg0) {
        Assert.assertEquals(new ComputerPage().getComputersText(), arg0);
    }

    @And("I click on desktop link")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopsLink();
    }

    @Then("I should see the {string} text message desktop page")
    public void iShouldSeeTheTextMessageDesktopPage(String arg0) {
        Assert.assertEquals(new DesktopPage().getDesktopsText(), arg0);
    }

    @And("I click on build computer link")
    public void iClickOnBuildComputerLink() {
        new DesktopPage().clickOnDisplay();
    }

    @And("I select {string} processor")
    public void iSelectProcessor(String arg0) {
        new BuildYourOwnComputerPage().selectProcessorFieldDropDownOption(arg0);
    }

    @And("I select {string} hdd button")
    public void iSelectHddButton(String arg0) {
        new BuildYourOwnComputerPage().selectRAMFieldDropDownOption(arg0);
    }

    @And("I select {string} ram")
    public void iSelectRam(String arg0) {

        if (Objects.equals(arg0, "320 GB")) {
            new BuildYourOwnComputerPage().clickOnHDD320GBRadioButton();
        } else {
            new BuildYourOwnComputerPage().clickOnHDD400GBRadioButton();
        }
    }

    @And("I select {string} os")
    public void iSelectOs(String arg0) {
        if (Objects.equals(arg0, "Vista Home [+$50.00]")) {
            new BuildYourOwnComputerPage().clickOnOSVistaHomeRadioButton();
        } else {
            new BuildYourOwnComputerPage().clickOnOSVistaPremiumRadioButton();
        }
    }

    @And("I select {string} software")
    public void iSelectSoftware(String arg0) {
        new BuildYourOwnComputerPage().clickOnSoftwareMicrosoftOfficeCheckBox();
        if (Objects.equals(arg0, "Microsoft Office [+$50.00]")) {
            new BuildYourOwnComputerPage().clickOnSoftwareMicrosoftOfficeCheckBox();
        } else if (Objects.equals(arg0, "Acrobat Reader [+$10.00]")) {
            new BuildYourOwnComputerPage().clickOnSoftwareAcrobatReaderCheckBox();
        } else {
            new BuildYourOwnComputerPage().clickOnSoftwareTotalCommanderCheckBox();
        }
    }


    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("I should see the {string} success message")
    public void iShouldSeeTheSuccessMessage(String arg0) {

            Assert.assertEquals(new BuildYourOwnComputerPage().getAddToCartSuccessfulMessage(), arg0);
        }


    }


