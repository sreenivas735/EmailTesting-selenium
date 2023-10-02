package Cucumber;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.awt.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources", // need to provide the path of where feature classes are presented
        glue = "Cucumber",// need to provide the only package name where the test classes are presented
        tags = "@alltests", // need to provide the tags
        plugin = {"pretty", "html:target/my-files.html"},// need to provide the location to save the test reports

        dryRun = true

)
public class TestRunner {

}
