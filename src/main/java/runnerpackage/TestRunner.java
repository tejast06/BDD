package runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\DELL\\eclipse-workspace\\BDD\\src\\main\\java\\feature\\login.feature"
		,glue = {"stepdefinition"}
		
		)

public class TestRunner {

}
