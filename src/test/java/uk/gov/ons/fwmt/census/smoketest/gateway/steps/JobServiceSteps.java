package uk.gov.ons.census.fwmt.smoketest.gateway.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import uk.gov.ons.census.fwmt.smoketest.gateway.JobServiceHelper;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JobServiceSteps {
  @Autowired
  private JobServiceHelper jobServiceHelper;

  @Given("^Check Job Service is running$")
  public void checkJobserviceRunning() {
    Assert.assertTrue(jobServiceHelper.checkAppIsRunning());
  }

  @When("JobService can access the queues")
  public void jobService_can_access_queues() {
    final List<String> result = jobServiceHelper.fetchAccessibleRabbitQueues();
    assertThat(result)
        .containsOnly("gateway.feedback", "gateway.feedback.DLQ", "gateway.actions", "gateway.actions.DLQ");
  }
}
