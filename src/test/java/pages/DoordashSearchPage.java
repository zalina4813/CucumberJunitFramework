package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoordashSearchPage {

    public DoordashSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@aria-autocomplete='list']")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@kind='BUTTON/FLAT_SECONDARY']")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[contains(text(),'Restaurants near')]")
    public WebElement results;
}
