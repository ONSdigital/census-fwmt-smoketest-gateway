package uk.gov.ons.fwmt.smoketest.gateway;

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

  @Value("${service.tm.wsdl}")
  private String wsdlPath;

  public boolean checkAppIsRunning(){
    HttpHeaders headers = new HttpHeaders();
    SmokeTestHelper.addBasicAuthentication(headers, username, password);
    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> request = new HttpEntity<String>(headers);
    ResponseEntity<String> response = restTemplate.exchange(url+wsdlPath, HttpMethod.GET, request, String.class);
    HttpStatus result = response.getStatusCode();

    boolean isRunning = HttpStatus.OK.equals(result);
    return isRunning;
  }
}
