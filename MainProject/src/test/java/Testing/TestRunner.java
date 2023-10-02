package Testing;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\features\\testingpage.feature",
        glue = "Test",
        tags = "@makemytrip",
        plugin = {"pretty", "html:target/makemytrip-reports.html" }

)
public class TestRunner {
}
