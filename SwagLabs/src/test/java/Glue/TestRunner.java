package Glue;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\Swaglabs.feature",
        glue = "Glue",
        tags = "@allScenarios",
        plugin = {"pretty", "html:target/Swaglabs-reports.html"},
        dryRun = false

)

public class TestRunner {
}
