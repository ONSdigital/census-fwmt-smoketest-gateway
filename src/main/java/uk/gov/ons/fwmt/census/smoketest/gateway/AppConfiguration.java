package uk.gov.ons.fwmt.census.smoketest.gateway;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"uk.gov.ons.fwmt.census.smoketest.*"})
@PropertySource("classpath:application.properties")
public class AppConfiguration {
}
