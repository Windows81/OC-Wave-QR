package org.apache.oltu.oauth2.client.request;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest;

public class OAuthBearerClientRequest extends OAuthClientRequest.OAuthRequestBuilder {
    public OAuthBearerClientRequest(String str) {
        super(str);
    }

    public OAuthBearerClientRequest c(String str) {
        this.f43510b.put("access_token", str);
        return this;
    }
}
