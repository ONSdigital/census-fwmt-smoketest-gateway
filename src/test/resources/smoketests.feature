Feature: Check all services are running and accessible

 @SmokeTest, @RMAdpter, @CheckRMAdpater
 Scenario: Check RmAdpater is running
    When Check RmAdpater is running

 @SmokeTest, @RMAdpter, @CheckRabbitRMActionField
 Scenario: Check RM Adapter can access Action.Field Rabbit Q
    When Check RM Adapter can access Action.Field Rabbit Q
    
 @SmokeTest, @RMAdpter, @CheckRabbitRMadapter-jobSvc
 Scenario: Check RM Adapter can access adapter-jobSvc Rabbit Q
    When Check RM Adapter can access adapter-jobSvc Rabbit Q

 @SmokeTest, @RMAdpter, @CheckRabbitRMjobsvc-adapter
 Scenario: Check RM Adapter can access jobsvc-adapter Rabbit Q
    When Check RM Adapter can access jobsvc-adapter Rabbit Q

 @SmokeTest, @RMAdpter, @CheckRabbitRMadapter-rm
 Scenario: Check RM Adapter can access adapter-rm Rabbit Q
    When Check RM Adapter can access adapter-rm Rabbit Q


 @SmokeTest, @RMAdpter, @CheckRabbitRMadapter-jobSvc.DLQ
 Scenario: Check RM Adapter can access adapter-jobSvc.DLQ Rabbit Q
    When Check RM Adapter can access adapter-jobSvc.DLQ Rabbit Q

 @SmokeTest, @RMAdpter, @CheckRabbitRMjobSvc-adapter.DLQ
 Scenario: Check RM Adapter can access jobSvc-adapter.DLQ Rabbit Q
    When Check RM Adapter can access jobSvc-adapter.DLQ Rabbit Q

 @SmokeTest, @RMAdpter, @CheckRabbitRMrm-adapter.DLQ
 Scenario: Check RM Adapter can access rm-adapter.DLQ Rabbit Q
    When Check RM Adapter can access rm-adapter.DLQ Rabbit Q

 @SmokeTest, @RMAdpter, @CheckRabbitRMaadapter-rm.DLQ
 Scenario: Check RM Adapter can access adapter-rm.DLQ Rabbit Q
    When Check RM Adapter can access adapter-rm.DLQ Rabbit Q

 @SmokeTest, @RMAdpter, @CheckRabbitRMAction.FieldDLQ
 Scenario: Check RM Adapter can access Action.FieldDLQ Rabbit Q
    When Check RM Adapter can access Action.FieldDLQ Rabbit Q


 @SmokeTest, @JobServ, @CheckJobService
 Scenario: Check Job Service is running
    When Check Job Service is running
    
 @SmokeTest, @JobService, @CheckRabbitJobServiceadapter-jobSvc
 Scenario: Check JobService can access adapter-jobSvc Rabbit Q
    When Check JobService can access adapter-jobSvc Rabbit Q

 @SmokeTest, @JobService, @CheckRabbitJobServicejobsvc-adapter
 Scenario: Check JobService can access jobsvc-adapter Rabbit Q
    When Check JobService can access jobsvc-adapter Rabbit Q

 @SmokeTest, @JobService, @CheckRabbitJobServiceadapter-rm
 Scenario: Check JobService can access adapter-rm Rabbit Q
    When Check JobService can access adapter-rm Rabbit Q



@SmokeTest, @JobService, @CheckRabbitJobServiceadapter-jobSvc.DLQ
 Scenario: Check JobService can access adapter-jobSvc.DLQ Rabbit Q
    When Check JobService can access adapter-jobSvc.DLQ Rabbit Q

@SmokeTest, @JobService, @CheckRabbitJobServicejobSvc-adapter.DLQ
 Scenario: Check JobService can access jobSvc-adapter.DLQ Rabbit Q
    When Check JobService can access jobSvc-adapter.DLQ Rabbit Q

@SmokeTest, @JobService, @CheckRabbitJobServicerm-adapter.DLQ
 Scenario: Check JobService can access rm-adapter.DLQ Rabbit Q
    When Check JobService can access rm-adapter.DLQ Rabbit Q

@SmokeTest, @JobService, @CheckRabbitJobServiceadapter-rm.DLQ
 Scenario: Check JobService can access adapter-rm.DLQ Rabbit Q
    When Check JobService can access adapter-rm.DLQ Rabbit Q


 @SmokeTest, @CheckTotalMobile
 Scenario: Check Tmoblie is running
    When Check Tmoblie is running
    
    
