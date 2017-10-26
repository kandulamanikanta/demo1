package soap.demo.executor;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import soap.demo.listeners.Reporter;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;



@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "soap.demo.listeners.ExtentCucumberFormatter:src/main/java/soap/demo/htmlReport/Qentelli_RPAPI_Report.html",
		"soap.demo.listeners.JSONFormatter:src/main/java/soap/demo/JSONReport/Qentelli_RPAPI_Report.json", 
		"html:src/main/java/soap/demo/cucumberReport/cucumber-html-report1",
		"rerun:target/rerun.txt" }, 
features = {"src\\test\\java\\soap\\demo\\features" }, glue = { "soap.demo.stepdefs" }, strict = true)
public class RPAPI_Executor {
	
	@AfterClass public static void setup() { 
	 Reporter.loadXMLConfig(new
	  File("D:\\workspace\\SOAPDEMO\\extent-config.xml"));
	  Reporter.setSystemInfo("user", System.getProperty("user.name"));
	  Reporter.setSystemInfo("os", "Windows");
	  Reporter.setTestRunnerOutput("Qentelli RPAPI Automation Test Reports");
	  }
	 
}
