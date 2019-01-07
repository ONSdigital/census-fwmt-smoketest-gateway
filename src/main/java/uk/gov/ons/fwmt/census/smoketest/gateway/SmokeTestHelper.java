package uk.gov.ons.fwmt.census.smoketest.gateway;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpHeaders;

public final class SmokeTestHelper {
  public static void addBasicAuthentication(HttpHeaders headers, String username, String password) {
    final String plainCreds = username + ":" + password;
    byte[] plainCredsBytes = plainCreds.getBytes();
    byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
    String base64Creds = new String(base64CredsBytes);

    headers.add("Authorization", "Basic " + base64Creds);
  }
}
