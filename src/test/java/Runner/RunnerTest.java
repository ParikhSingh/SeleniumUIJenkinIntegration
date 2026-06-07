package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/main/resources/Features/Registration.feature",
        glue = {"Stepdef", "TestMangement"},
        monochrome = true,
        publish = true,
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        }
)

public class RunnerTest {
}