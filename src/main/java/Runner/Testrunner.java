package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( // features is path of feature file name
		features = "C:\\Users\\Admin\\eclipse-workspace\\yahoo\\src\\main\\java\\Features\\login.feature",
		glue= {"StepDefinitions"},  // path of stepdefinition package name
		dryRun = false,  // its true we can check all steps are coded (methods are not
//		strict =true, 
//		stepNotifications = true;
		monochrome=true, // display the console output redable format
		//strict =true it will check any step is not defined in step defined file
		plugin= {"pretty","html:Reports/test-output.html","junit:Reports/cucumber.xml"}
		)

public class Testrunner {

}
