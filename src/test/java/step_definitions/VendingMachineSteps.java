package step_definitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class VendingMachineSteps {

    WebDriver driver = Driver.getDriver();

    @Given("the vending machine is powered on")
    public void the_vending_machine_is_powered_on() {

    }
    @Given("the vending machine has stock of {string}")
    public void the_vending_machine_has_stock_of(String string) {

    }
    @When("the user inserts ${double}")
    public void the_user_inserts_$(Double double1) {

    }
    @When("the user selects {string}")
    public void the_user_selects(String string) {

    }
    @Then("the vending machine dispenses {string}")
    public void the_vending_machine_dispenses(String string) {

    }
    @Then("the vending machine displays {string}")
    public void the_vending_machine_displays(String string) {

    }
}
