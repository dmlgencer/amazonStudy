package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt",

        },
        monochrome = true,
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        dryRun = false,
        tags = "@amazon_login"

)


public class Runner {
}
