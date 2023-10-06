package Glue_test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\automation.feature",
        glue = "Glue_test",
        plugin = {"pretty", "html:target/reports_automation.html"},
        tags = "@automation-textbox"
)

public class TestRunner {
}
