package glue_test;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src\\test\\resources\\emailloginpage.feature",
        glue = "glue_test",
        tags = "@login-invalidates",
        plugin ={"pretty", "html:target/reports-email-loginpage-invalid-creds.html" }

)
public class TestRunner {
}
