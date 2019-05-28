package ContextIs;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)


@CucumberOptions(features = ".", tags = "@test", dryRun = false, monochrome = true, plugin = {"pretty:target/cucumber-htmlreport.text", "json:target/cucmber-report.json"})

public class RunTest {
}
