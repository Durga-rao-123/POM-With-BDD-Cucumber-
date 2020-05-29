package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
		
		features={"classpath:SmartCredit_Feature"},
		glue= {"com.SmartCredit"},
		plugin = { "usage", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json" ,
				   "junit:target/cucumber-reports/Cucumber.xml" ,"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/report.html" },
		strict = true,
		monochrome = true
		)
 
public class RunnerLoginTest
{
	

}
