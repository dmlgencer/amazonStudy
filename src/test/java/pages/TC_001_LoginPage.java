package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_001_LoginPage {
    public TC_001_LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-labelledby ='Account & Lists']")
    public WebElement accountAndLists;

    @FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
    public WebElement signInButton;

    @FindBy(id = "ap_email")
    public WebElement signInField;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement passwordField;

    @FindBy(id = "signInSubmit")
    public WebElement sigInSubmitButton;

    @FindBy(xpath = "//span[text()='Hello, Damla']")
    public WebElement helloDamlaText;


}
