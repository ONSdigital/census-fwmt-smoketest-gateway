package uk.gov.ons.fwmt.census.smoketest.gateway.steps;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uk.gov.ons.fwmt.census.smoketest.gateway.JobServiceHelper;

public class JobServiceSteps {
  @Autowired
  private JobServiceHelper jobServiceHelper;

  @Given("^Check Job Service is running$")
  public void checkJobserviceRunning() throws Exception {
    Assert.assertTrue(jobServiceHelper.checkAppIsRunning());
  }

  @When("Check JobService can access rm-jobsvc-exchange Rabbit Q")
  public void check_JobService_can_access_rm_jobsvc_exchange_Rabbit_Q() {
    Assert.assertTrue(jobServiceHelper.canAccessRabbitQ("rm-jobsvc-exchange"));
  }

  @When("Check JobService can access adapter-jobSvc Rabbit Q")
  public void check_JobService_can_access_adapter_jobSvc_Rabbit_Q() {
    Assert.assertTrue(jobServiceHelper.canAccessRabbitQ("adapter-jobSvc"));
  }

  @When("Check JobService can access jobsvc-adapter Rabbit Q")
  public void check_JobService_can_access_jobsvc_adapter_Rabbit_Q() {
    Assert.assertTrue(jobServiceHelper.canAccessRabbitQ("jobsvc-adapter"));
  }

  @When("Check JobService can access adapter-rm Rabbit Q")
  public void check_JobService_can_access_adapter_rm_Rabbit_Q() {
    Assert.assertTrue(jobServiceHelper.canAccessRabbitQ("adapter-rm"));
  }

  @When("Check JobService can access adapter-jobSvc.DLQ Rabbit Q")
  public void check_JobService_can_access_adapter_jobSvc_DLQv_Rabbit_Q() {
    Assert.assertTrue(jobServiceHelper.canAccessRabbitQ("adapter-jobSvc.DLQ"));
  }

  @When("Check JobService can access jobSvc-adapter.DLQ Rabbit Q")
  public void check_JobService_can_access_jobSvc_adapter_DLQ_Rabbit_Q() {
    Assert.assertTrue(jobServiceHelper.canAccessRabbitQ("jobSvc-adapter.DLQ"));
  }

  @When("Check JobService can access rm-adapter.DLQ Rabbit Q")
  public void check_JobService_can_access_rm_adapter_DLQ_Rabbit_Q() {
    Assert.assertTrue(jobServiceHelper.canAccessRabbitQ("rm-adapter.DLQ"));
  }

  @When("Check JobService can access adapter-rm.DLQ Rabbit Q")
  public void check_JobService_can_access_adapter_rm_DLQ_Rabbit_Q() {
    Assert.assertTrue(jobServiceHelper.canAccessRabbitQ("adapter-rm.DLQ"));
  }
}
