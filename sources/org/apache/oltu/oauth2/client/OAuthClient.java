package org.apache.oltu.oauth2.client;

import java.util.HashMap;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;

public class OAuthClient {

    /* renamed from: a  reason: collision with root package name */
    public HttpClient f43505a;

    public OAuthAccessTokenResponse a(OAuthClientRequest oAuthClientRequest, Class cls) {
        return b(oAuthClientRequest, "POST", cls);
    }

    public OAuthAccessTokenResponse b(OAuthClientRequest oAuthClientRequest, String str, Class cls) {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        return (OAuthAccessTokenResponse) this.f43505a.a(oAuthClientRequest, hashMap, str, cls);
    }

    public OAuthJSONAccessTokenResponse c(OAuthClientRequest oAuthClientRequest) {
        return (OAuthJSONAccessTokenResponse) a(oAuthClientRequest, OAuthJSONAccessTokenResponse.class);
    }
}
