package uk.gov.ons.census.fwmt.smoketest.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@PropertySource("classpath:application.properties")
public final class JobServiceHelper {

  @Value("${service.jobservice.url}")
  private String url;

  @Value("${service.jobservice.username}")
  private String username;

  @Value("${service.jobservice.password}")
  private String password;

  @Value("${service.jobservice.rabbitmqcheck.url}")
  private String rabbitCheckUrl;

  public boolean checkAppIsRunning() {
    HttpHeaders headers = new HttpHeaders();
    SmokeTestHelper.addBasicAuthentication(headers, username, password);

    RestTemplate restTemplate = new RestTemplate();

    HttpEntity<String> request = new HttpEntity<String>(headers);
    ResponseEntity<String> response = restTemplate
        .exchange(url + "/health", HttpMethod.GET, request, String.class);
    String result = response.getBody();

    // true if we can access the Job Service
    return (result != null) && result.contains("\"status\":\"UP\"");
  }

  public List<String> fetchAccessibleRabbitQueues() {
    HttpHeaders headers = new HttpHeaders();
    SmokeTestHelper.addBasicAuthentication(headers, username, password);

    RestTemplate restTemplate = new RestTemplate();

    HttpEntity<String> request = new HttpEntity<String>(headers);
    ResponseEntity<List<String>> response = restTemplate
        .exchange(rabbitCheckUrl, HttpMethod.GET, request, new ParameterizedTypeReference<List<String>>() {
        });
    List<String> result = response.getBody();

    return result;
  }
}
