package runner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "classpath:features",
		glue= "steps",
		tags= "@Scenario1", 
		//feature @Login , tags login to run all of them
		//we can use smoke pick and choose the tests that need to executed
		monochrome= true,
		dryRun = false,
		plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
		}

		)



public class TestRunner {
}