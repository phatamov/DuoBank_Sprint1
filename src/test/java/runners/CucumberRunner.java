package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@db_only", //"@regression", //"@smoke or @regression", //"@smoke and @regression", //"@smoke and not @regression",
        features = "src/test/resources/features",
        glue = "stepDefinitions"
//        ,dryRun = true

        ,plugin = {
        "pretty",   // detailed test run results on the console
        "html:target/built-in-html-report.html",  // generates built-in html report
        "json:target/cucumber.json"  // generates a json report that is needed for pretty html report
         },
        stepNotifications = true,   // shows detailed step results in report
        snippets = CucumberOptions.SnippetType.CAMELCASE  // generates snippets using camelCase
         )

public class CucumberRunner {
}
