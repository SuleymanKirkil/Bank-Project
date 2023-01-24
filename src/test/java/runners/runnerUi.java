package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features/UIFeatures",
        glue = {"stepDefinitions/UIStepDefs","stepDefinitions/hooks"},
        tags = "@US_01-TC_01_SSN_Box_Testing02",
        dryRun = false
)
public class runnerUi{
}

