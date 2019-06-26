package runner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Equipo\\Documents\\medife\\3\\cucumber_with_extentReport\\features", //the path of the feature files
		glue={"stepDefinitions"}, //the path of the step definition files
				plugin= {"pretty",
						"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html",
						"html:target/cucumber-reports"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false, //to check the mapping is proper between feature file and step def file
		tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)


public class RunCukesTest{

@AfterClass
public static void setup() {
Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
Reporter.setSystemInfo("User Name", "Matias Veron");
Reporter.setSystemInfo("Medife", "ERS - 1");
Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
Reporter.setSystemInfo("Environment", "TEST");
Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
}
	
	    }
	
