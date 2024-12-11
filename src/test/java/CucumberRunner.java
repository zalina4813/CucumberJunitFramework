import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberReport.html", "json:testReport.json"},
        features = "src/test/resources/features",
        glue = "step_definitions",
        tags = "@vending",
        dryRun = true
)
public class CucumberRunner {
}
