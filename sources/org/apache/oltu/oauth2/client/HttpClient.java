package org.apache.oltu.oauth2.client;

import java.util.Map;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthClientResponse;

public interface HttpClient {
    OAuthClientResponse a(OAuthClientRequest oAuthClientRequest, Map map, String str, Class cls);
}
