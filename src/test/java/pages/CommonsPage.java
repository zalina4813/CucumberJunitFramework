package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonsPage {

    public CommonsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='number']")
    public WebElement calories_input;

    @FindBy(id = "num_meals_selector")
    public WebElement number_of_meals_dropdown;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement generate_button;

    @FindBy(xpath ="//input[@value='vegan']")
    public WebElement vegan;
}

