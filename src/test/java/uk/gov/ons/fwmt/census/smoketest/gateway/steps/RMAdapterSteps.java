package uk.gov.ons.census.fwmt.smoketest.gateway.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import uk.gov.ons.census.fwmt.smoketest.gateway.RMAdapterHelper;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RMAdapterSteps {
  @Autowired
  private RMAdapterHelper rmAdapterHelper;

  @Given("^Check RMAdapter is running$")
  public void checkAdapterRunning() {
    Assert.assertTrue(rmAdapterHelper.checkAppIsRunning());
  }

  @When("RMAdapter can access the queues")
  public void RMAdapter_can_access_rabbitmq_queue() {
    final List<String> result = rmAdapterHelper.fetchAccessibleRabbitQueues();
    assertThat(result)
        .containsOnly("gateway.feedback", "gateway.feedback.DLQ", "gateway.actions", "gateway.actions.DLQ",
            "Action.Field", "Action.FieldDLQ", "rm.feedback", "rm.feedback.DLQ");
  }

}
