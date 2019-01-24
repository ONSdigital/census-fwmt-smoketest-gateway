Feature: Check all services are running and accessible

#####################################################################
#  RM-Adapter is not accessible from Jenkins                        #
#  Refer to confluence on how to test this manually                 #
#####################################################################
#
# @SmokeTest @RMAdapter @CheckRMAdapter
# Scenario: Check RMAdapter is running
#    When Check RMAdapter is running
#
# @SmokeTest @RMAdapter @CheckRabbit @CheckRabbitQueueActionField
# Scenario: Check RM Adapter can access Action.Field Rabbit Q
#    When RMAdapter can access the RabbitMQ queue "Action.Field"
#
# @SmokeTest @RMAdapter @CheckRabbit @CheckRabbitQueueAction.FieldDLQ
# Scenario: Check RM Adapter can access Action.FieldDLQ Rabbit Q
#    When RMAdapter can access the RabbitMQ queue "Action.FieldDLQ"
#
# @SmokeTest @RMAdapter @CheckRabbit @CheckRabbitQueueAdapter-jobSvc
# Scenario: Check RM Adapter can access adapter-jobSvc Rabbit Q
#    When RMAdapter can access the RabbitMQ queue "adapter-jobSvc"
#
# @SmokeTest @RMAdapter @CheckRabbit @CheckRabbitQueueAdapter-jobSvc.DLQ
# Scenario: Check RM Adapter can access adapter-jobSvc.DLQ Rabbit Q
#    When RMAdapter can access the RabbitMQ queue "adapter-jobSvc.DLQ"
#
# @SmokeTest @RMAdapter @CheckRabbit @CheckRabbitQueueJobsvc-adapter
# Scenario: Check RM Adapter can access jobSvc-adapter Rabbit Q
#    When RMAdapter can access the RabbitMQ queue "jobSvc-adapter"
#
# @SmokeTest @RMAdapter @CheckRabbit @CheckRabbitQueueJobSvc-adapter.DLQ
# Scenario: Check RM Adapter can access jobSvc-adapter.DLQ Rabbit Q
#    When RMAdapter can access the RabbitMQ queue "jobSvc-adapter.DLQ"
#
# @SmokeTest @RMAdapter @CheckRabbit @CheckRabbitRMadapter-rm
# Scenario: Check RM Adapter can access adapter-rm Rabbit Q
#    When RMAdapter can access the RabbitMQ queue "adapter-rm"
#
# @SmokeTest @RMAdapter @CheckRabbit @CheckRabbitRMaadapter-rm.DLQ
# Scenario: Check RM Adapter can access adapter-rm.DLQ Rabbit Q
#    When RMAdapter can access the RabbitMQ queue "adapter-rm.DLQ"
#
# @SmokeTest @RMAdapter @CheckRabbit @CheckRabbitRMrm-adapter.DLQ
# Scenario: Check RM Adapter can access rm-adapter.DLQ Rabbit Q
#    RMAdapter can access the queues
#####################################################################

  @SmokeTest @RMAdapter @CheckRabbit
  Scenario: Check RM Adapter can access rm-adapter.DLQ Rabbit Q
    When RMAdapter can access the queues

  @SmokeTest @JobService @CheckJobService
  Scenario: Check Job Service is running
    When Check Job Service is running

  @SmokeTest @JobService @CheckRabbit
  Scenario: Check JobService can access adapter-jobSvc Rabbit Q
    When JobService can access the queues

  @SmokeTest @CheckTotalMobile
  Scenario: Check Tmoblie is running
    When Check Tmoblie is running

