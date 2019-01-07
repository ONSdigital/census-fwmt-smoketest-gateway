package uk.gov.ons.fwmt.census.smoketest.gateway.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import uk.gov.ons.fwmt.census.smoketest.gateway.RMAdapterHelper;

public class RMAdapterSteps {
  @Autowired
  private RMAdapterHelper rmAdapterHelper;

  @Given("^Check RMAdapter is running$")
  public void checkAdapterRunning() {
    Assert.assertTrue(rmAdapterHelper.checkAppIsRunning());
  }

  @When("RMAdapter can access the RabbitMQ queue {string}")
  public void jobService_can_access_rabbitmq_queue(String queueName) {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ(queueName));
  }

}
