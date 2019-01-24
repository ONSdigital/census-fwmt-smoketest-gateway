package uk.gov.ons.fwmt.census.smoketest.gateway;

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
public final class RMAdapterHelper {
  @Value("${service.rmadmpter.url}")
  private String url;

  @Value("${service.rmadmpter.rabbitmqcheck.url}")
  private String rabbitCheckUrl;

  @Value("${service.rmadmpter.username}")
  private String username;

  @Value("${service.rmadmpter.password}")
  private String password;

  public boolean checkAppIsRunning() {
    HttpHeaders headers = new HttpHeaders();
    SmokeTestHelper.addBasicAuthentication(headers, username, password);

    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> request = new HttpEntity<String>(headers);
    ResponseEntity<String> result = restTemplate
        .exchange(url + "/health", HttpMethod.GET, request, String.class);

    // true if we can access the RM adapter
    return result.getBody().contains("\"status\":\"UP\"");
  }

  public List<String> fetchAccessibleRabbitQueues() {
    HttpHeaders headers = new HttpHeaders();
    SmokeTestHelper.addBasicAuthentication(headers, username, password);

    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> request = new HttpEntity<String>(headers);
    ResponseEntity<List<String>> response = restTemplate
        .exchange(rabbitCheckUrl, HttpMethod.GET, request, new ParameterizedTypeReference<List<String>>() {
        });

    // true if we can access RabbitMQ
    List<String> result = response.getBody();
    return result;
  }

}
