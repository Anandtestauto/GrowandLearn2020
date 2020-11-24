package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/features/F04_DeleteLead.feature",
                 glue="steps",
                 monochrome =true,
                 snippets = SnippetType.CAMELCASE)
public class RunLogin extends AbstractTestNGCucumberTests {

}
