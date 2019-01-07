package uk.gov.ons.fwmt.census.smoketest.gateway.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import uk.gov.ons.fwmt.census.smoketest.gateway.JobServiceHelper;

public class JobServiceSteps {
  @Autowired
  private JobServiceHelper jobServiceHelper;

  @Given("^Check Job Service is running$")
  public void checkJobserviceRunning() {
    Assert.assertTrue(jobServiceHelper.checkAppIsRunning());
  }

  @When("JobService can access the RabbitMQ queue {string}")
  public void jobService_can_access_rabbitmq_queue(String queueName) {
    Assert.assertTrue(jobServiceHelper.canAccessRabbitQ(queueName));
  }
}
