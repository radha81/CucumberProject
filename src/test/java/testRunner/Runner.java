package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},tags = "@SupplierTest",  monochrome = true,glue = {"stepDefinations"},plugin = {"pretty","html:target/cucumber/report.html"})
public class Runner extends AbstractTestNGCucumberTests{

}
