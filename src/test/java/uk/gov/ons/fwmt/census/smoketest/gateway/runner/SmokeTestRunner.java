package uk.gov.ons.census.fwmt.smoketest.gateway.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = {"src/test/resources/smoketests.feature"}, glue = {
    "uk.gov.ons.census.fwmt.smoketest.gateway.steps"})
public class SmokeTestRunner {

}
