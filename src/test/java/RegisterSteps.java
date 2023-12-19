import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();

    }

    @Then("I should see the register text")
    public void iShouldSeeTheRegisterText(String ExpectedMessage) {
        Assert.assertEquals(new RegisterPage().getWelcomeText(), ExpectedMessage);
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
        
    }

    @Then("I should see the error message {string} in first name field")
    public void iShouldSeeTheErrorMessageInFirstNameField(String arg0) {
        Assert.assertEquals(new RegisterPage().getFirstNameRequiredMessage(), arg0);
    }

    @And("I should see the error message {string} in last name field")
    public void iShouldSeeTheErrorMessageInLastNameField(String arg0) {
        Assert.assertEquals(new RegisterPage().getLastNameRequiredMessage(), arg0);
    }

    @And("I should see the error message {string} in email field")
    public void iShouldSeeTheErrorMessageInEmailField(String arg0) {
        Assert.assertEquals(new RegisterPage().getEmailRequiredMessage(), arg0); 
    }

    @And("I should see the error message {string} in password field")
    public void iShouldSeeTheErrorMessageInPasswordField(String arg0) {
        Assert.assertEquals(new RegisterPage().getPasswordRequiredMessage(), arg0);
    }

    @And("I should see the error message {string} in confirm password field")
    public void iShouldSeeTheErrorMessageInConfirmPasswordField(String arg0) {
        Assert.assertEquals(new RegisterPage().getConfirmPasswordRequiredMessage(), arg0);
    }

    @And("I click on female radio button")
    public void iClickOnFemaleRadioButton() {
        new RegisterPage().clickOnMaleGenderRadioButton();
    }

    @And("I enter {string} in first name field")
    public void iEnterInFirstNameField(String arg0) {
        new RegisterPage().sendDataToFirstNameField(arg0);
    }

    @And("I enter {string} in last name field")
    public void iEnterInLastNameField(String arg0) {
        new RegisterPage().sendDataToLastNameField(arg0);
    }

    @And("I select {string} day")
    public void iSelectDay(String arg0) {
        new RegisterPage().selectDate(arg0);
    }

    @And("I select {string} month")
    public void iSelectMonth(String arg0) {
        new RegisterPage().selectMonth(arg0);
    }

    @And("I select {string} year")
    public void iSelectYear(String arg0) {
        new RegisterPage().selectYear(arg0);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String arg0) {
        new RegisterPage().sendDataToConfirmPasswordField(arg0);
    }

    @Then("I should see the registered message {string}")
    public void iShouldSeeTheRegisteredMessage(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getDataFromConfirmationMessage(), expectedMessage);
    }
    }

