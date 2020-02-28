package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        tags="@SmokeTest",
        features={"src/test/resources"},
        glue={"stepDefinition"},
        dryRun=false
)

public class smokeTestRunner {

}
