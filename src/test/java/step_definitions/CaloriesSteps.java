package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.CommonsPage;
import utilities.Driver;

public class CaloriesSteps {
    WebDriver driver = Driver.getDriver();
    CommonsPage commonsPage = new CommonsPage();

    @Given("user goes to {string}")
    public void user_goes_to(String url) {
        driver.get(url);
    }

    @Given("user enters {int} calories")
    public void user_enters_calories(Integer amountOfCalories) {
        commonsPage.calories_input.sendKeys(amountOfCalories.toString());
        System.out.println("User entered calories: " + amountOfCalories);

    }

    @Then("user selects {int} meals")
    public void user_selects_meals(Integer amountOfMeals) {
        Select select = new Select(commonsPage.number_of_meals_dropdown);
        select.selectByValue(amountOfMeals.toString());
        System.out.println("User selected the meals: " + amountOfMeals);
    }

    @Then("user clicks on generate")
    public void user_clicks_on_generate() {
        commonsPage.generate_button.click();
        System.out.println("User clicked on generate button");
    }

    @Then("verify {int} meals are generated")
    public void verify_meals_are_generated(Integer amountOfMeals) {
        Assert.assertEquals(4, (int) amountOfMeals);
    }

    @Then("user selects vegan")
    public void user_selects_vegan() {
        commonsPage.vegan.click();
    }
}