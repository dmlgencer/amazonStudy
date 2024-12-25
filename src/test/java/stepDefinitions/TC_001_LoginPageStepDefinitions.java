package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.TC_001_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_001_LoginPageStepDefinitions {
    TC_001_LoginPage loginPage = new TC_001_LoginPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user goes to amazon home page")
    public void user_goes_to_amazon_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_base_url"));
        ReusableMethods.waitFor(4);
    }

    @When("user hovers over the accounts and lists section")
    public void user_hovers_over_the_accounts_and_lists_section() {
        actions.moveToElement(loginPage.accountAndLists).perform();
        ReusableMethods.waitFor(1);
    }

    @When("user clicks the signIn button")
    public void user_clicks_the_sign_in_button() {
        loginPage.signInButton.click();
        ReusableMethods.waitFor(3);
        String expectedTitle = "Amazon Sign-In";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle, "NOT EQUAL!");
        ReusableMethods.waitFor(1);


    }

    @When("user clicks the sign in field and enter a valid email")
    public void user_clicks_the_sign_in_field_and_enter_a_valid_email() {
        loginPage.signInField.click();
        loginPage.signInField.sendKeys("damla.45gencer@gmail.com");
        ReusableMethods.waitFor(2);
    }

    @When("user clicks the continue button")
    public void user_clicks_the_continue_button() {
        loginPage.continueButton.click();
    }
}
