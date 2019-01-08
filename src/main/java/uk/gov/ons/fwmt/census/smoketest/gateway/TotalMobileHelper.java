package uk.gov.ons.fwmt.census.smoketest.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@PropertySource("classpath:application.properties")
public final class TotalMobileHelper {
  @Value("${service.tm.username}")
  private String username;

  @Value("${service.tm.password}")
  private String password;

  @Value("${service.tm.url}")
  private String url;

  @Value("${service.tm.casesPath}")
  private String casesPath;

  public boolean checkAppIsRunning() {
    HttpHeaders headers = new HttpHeaders();
    SmokeTestHelper.addBasicAuthentication(headers, username, password);
    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> request = new HttpEntity<String>(headers);
    // TODO remember that the mock returns a 501 Unimplemented for this endpoint, which should be fixed
    ResponseEntity<String> response = restTemplate.exchange(url + casesPath, HttpMethod.GET, request, String.class);
    HttpStatus result = response.getStatusCode();

    // true if TM is running
    return HttpStatus.OK.equals(result);
  }
}
