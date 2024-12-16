package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
//fe 123

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchArea;

    @FindBy(xpath = "//span[text()='iphone 15']")
    public WebElement searchResult;

    @FindBy(xpath = "//img[@data-image-index='1']")
    public WebElement iphonePicture;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCartButton;

    @FindBy(css = "div.sw-atc-message")
    public WebElement addToCardText;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    public WebElement cookie;





}
