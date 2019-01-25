package uk.gov.ons.fwmt.census.smoketest.gateway.steps;

import cucumber.api.java.en.Given;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import uk.gov.ons.fwmt.census.smoketest.gateway.AppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfiguration.class)
@SpringBootTest
public class SpringGlue {
  @Given("^Spring is set up$")
  public void setupSpring() {
    // this stub step ensures that the Spring Boot context is configured
    // it does not need to appear in a .feature file to function
  }
}
