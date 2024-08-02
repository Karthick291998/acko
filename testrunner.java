package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\karth\\eclipse-workspace\\proj\\src\\test\\resources\\FeatureFiles",glue={"stepDefinition","hooks"},dryRun=false,monochrome=true,plugin={"html:screenshots","json:target/fbreport.json"})
public class testrunner {

}
