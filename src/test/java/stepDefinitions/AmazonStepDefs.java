package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AmazonStepDefs {

    AmazonPage amazonPage = new AmazonPage();


    @Given("user goes to url")
    public void user_goes_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_tr_base_url"));
        ReusableMethods.waitFor(2);
    }

    @Then("verify the page is true")
    public void verify_the_page_is_true() {
        String currentPage = "https://www.amazon.com.tr/";
        Assert.assertEquals(currentPage, Driver.getDriver().getCurrentUrl());
        ReusableMethods.waitFor(2);
        amazonPage.searchButton.click();
        ReusableMethods.waitFor(2);
        //deneme

    }


}
