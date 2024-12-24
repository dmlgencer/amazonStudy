package pages;

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



}