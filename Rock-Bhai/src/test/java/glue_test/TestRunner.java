package glue_test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\Rockybhai.feature",
        glue = "glue_test",
        tags = "@Rocky-all",
        plugin = {"pretty", "html:target/reports1.html"}

)
public class TestRunner {


}
