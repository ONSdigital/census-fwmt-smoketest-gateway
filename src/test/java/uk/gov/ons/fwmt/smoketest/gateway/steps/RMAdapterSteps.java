package uk.gov.ons.fwmt.smoketest.gateway.steps;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uk.gov.ons.fwmt.smoketest.gateway.RMAdapterHelper;

public class RMAdapterSteps {
  @Autowired
  private RMAdapterHelper rmAdapterHelper;
  
  @Given("^Check RmAdpater is running$")
  public void checkAdpaterRunning() throws Exception {
    Assert.assertTrue(rmAdapterHelper.checkAppIsRunning());
  }

  @When("Check RM Adapter can access Action.Field Rabbit Q")
  public void check_RM_Adapter_can_access_Action_Field_Rabbit_Q() {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ("Action.Field"));    
  }

  @When("Check RM Adapter can access rm-jobsvc-exchange Rabbit Q")
  public void check_RM_Adapter_can_access_rm_jobsvc_exchange_Rabbit_Q() {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ("rm-jobsvc-exchange"));    
  }
  @When("Check RM Adapter can access adapter-jobSvc Rabbit Q")
  public void check_RM_Adapter_can_access_adapter_jobSvc_Rabbit_Q() {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ("adapter-jobSvc"));    
  }

  @When("Check RM Adapter can access jobsvc-adapter Rabbit Q")
  public void check_RM_Adapter_can_access_jobsvc_adapter_Rabbit_Q() {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ("jobsvc-adapter"));    
  }

  @When("Check RM Adapter can access adapter-rm Rabbit Q")
  public void check_RM_Adapter_can_access_adapter_rm_Rabbit_Q() {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ("adapter-rm"));    
  }

  @When("Check RM Adapter can access adapter-jobSvc.DLQ Rabbit Q")
  public void check_RM_Adapter_can_access_adapter_jobSvc_DLQ_Rabbit_Q() {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ("adapter-jobSvc.DLQ"));    
  }

  @When("Check RM Adapter can access jobSvc-adapter.DLQ Rabbit Q")
  public void check_RM_Adapter_can_access_jobSvc_adapter_DLQ_Rabbit_Q() {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ("jobSvc-adapter.DLQ"));    
  }

  @When("Check RM Adapter can access rm-adapter.DLQ Rabbit Q")
  public void check_RM_Adapter_can_access_rm_adapter_DLQ_Rabbit_Q() {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ("rm-adapter.DLQ"));    
  }

  @When("Check RM Adapter can access adapter-rm.DLQ Rabbit Q")
  public void check_RM_Adapter_can_access_adapter_rm_DLQ_Rabbit_Q() {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ("adapter-rm.DLQ"));    
  }

  @When("Check RM Adapter can access Action.FieldDLQ Rabbit Q")
  public void check_RM_Adapter_can_access_Action_FieldDLQ_Rabbit_Q() {
    Assert.assertTrue(rmAdapterHelper.canAccessRabbitQ("Action.FieldDLQ"));    
  }

}
