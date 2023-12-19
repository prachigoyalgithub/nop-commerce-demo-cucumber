import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;



public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals(new LoginPage().getWelcomeText(), "Login page is not displayed");
    }


    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password0) {
        new LoginPage().enterPassword(password0);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should log in successfully")
    public void iShouldLogInSuccessfully() {
        Assert.assertEquals(new LoginPage().getErrorMessage().substring(0,equals()), "Login Unsuccessful Message Not Displayed");
    }

    private int equals() {
        return 0;
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errormessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage().substring(0, errormessage.length()), errormessage, "Login Unsuccessful Message Not Displayed");
    }

    @Then("verify that {string} message display")
    public void verifyThatMessageDisplay(String arg0) {

    }

    @Given("Click on login link")
    public void clickOnLoginLink() {
    }

    @Given("I open the application")
    public void iOpenTheApplication() {
    }

    @When("I click on the login link")
    public void iClickOnTheLoginLink() {
    }

    @And("I enter {string} in the email field")
    public void iEnterInTheEmailField(String arg0) {
    }

    @And("I enter {string} in the password field")
    public void iEnterInThePasswordField(String arg0) {
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
    }


    @Then("I should see the logout link")
    public void iShouldSeeTheLogoutLink() {
        Assert.assertTrue(new HomePage().verifyThatElementIsDisplayed(),"LogOut link is not available");
    }

    @When("I click on the logout link")
    public void iClickOnTheLogoutLink() {
    }

    @Then("I should see the login link")
    public void iShouldSeeTheLoginLink() {
    }
}
