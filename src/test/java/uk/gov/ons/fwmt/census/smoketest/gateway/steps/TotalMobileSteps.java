package uk.gov.ons.census.fwmt.smoketest.gateway.steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import uk.gov.ons.census.fwmt.smoketest.gateway.TotalMobileHelper;

public class TotalMobileSteps {
  @Autowired
  private TotalMobileHelper totalMobileHelper;

  @Given("^Check Tmoblie is running$")
  public void checkTmobileRunning() {
    Assert.assertTrue(totalMobileHelper.checkAppIsRunning());
  }
}
