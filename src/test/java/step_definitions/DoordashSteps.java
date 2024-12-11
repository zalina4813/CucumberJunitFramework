package step_definitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.DoordashSearchPage;
import utilities.Driver;

public class DoordashSteps {

    WebDriver driver = Driver.getDriver();
    DoordashSearchPage doordashSearchPage = new DoordashSearchPage();

    @Given("user is doordash homepage")
    public void user_is_doordash_homepage() {
       driver.get("https://www.doordash.com/");
    }

    @When("the user enters {string} in the address search bar")
    public void the_user_enters_in_the_address_search_bar(String address) {
       doordashSearchPage.searchBar.sendKeys(address);
    }

    @When("the user clicks on the search button")
    public void the_user_clicks_on_the_search_button() {
        doordashSearchPage.searchButton.click();
    }

    @Then("user should see a list of restaurants available near {string}")
    public void user_should_see_a_list_of_restaurants_available_near(String address) {
        if (doordashSearchPage.results.getText().contains("Restaurants near")) {
            System.out.println("Restaurants are displayed near " + address);
        } else {
            throw new AssertionError("No restaurants found near the provided address!");
        }
    }
}



