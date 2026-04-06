package org.apache.oltu.oauth2.client.response;

import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.token.BasicOAuthToken;
import org.apache.oltu.oauth2.common.token.OAuthToken;
import org.apache.oltu.oauth2.common.utils.JSONUtils;

public class OAuthJSONAccessTokenResponse extends OAuthAccessTokenResponse {
    public void f(String str) {
        try {
            this.f43512a = str;
            this.f43517f = JSONUtils.b(str);
        } catch (Throwable unused) {
            throw OAuthProblemException.c("unsupported_response_type", "Invalid response! Response body is not application/json encoded");
        }
    }

    public void g(String str) {
        this.f43513b = str;
    }

    public void i(int i2) {
        this.f43514c = i2;
    }

    public String k() {
        return a("access_token");
    }

    public Long l() {
        String a2 = a("expires_in");
        if (a2 == null) {
            return null;
        }
        return Long.valueOf(a2);
    }

    public OAuthToken m() {
        return new BasicOAuthToken(k(), p(), l(), n(), o());
    }

    public String n() {
        return a("refresh_token");
    }

    public String o() {
        return a("scope");
    }

    public String p() {
        return a("token_type");
    }
}
