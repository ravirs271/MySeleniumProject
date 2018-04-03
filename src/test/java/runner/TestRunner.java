package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"features"},
		glue={"com.test.abc"},
		plugin={"html:target/Destination"},
		tags="@123"
		)
public class TestRunner
{

}
