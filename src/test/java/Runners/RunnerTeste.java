package Runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/PesquisarVideoYoutube.feature",
		//features = "src/test/resources/features",
		glue = "Steps",
		tags = {"@OperarVideo,@VerVideo"},
		//plugin = {"pretty", "html:target/report-html"},
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)
public class RunnerTeste {

}
