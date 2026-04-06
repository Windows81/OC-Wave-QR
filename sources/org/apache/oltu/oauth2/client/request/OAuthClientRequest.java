package org.apache.oltu.oauth2.client.request;

import java.util.HashMap;
import java.util.Map;
import org.apache.oltu.oauth2.common.message.OAuthMessage;
import org.apache.oltu.oauth2.common.parameters.BodyURLEncodedParametersApplier;
import org.apache.oltu.oauth2.common.parameters.OAuthParametersApplier;

public class OAuthClientRequest implements OAuthMessage {

    /* renamed from: a  reason: collision with root package name */
    public String f43506a;

    /* renamed from: b  reason: collision with root package name */
    public String f43507b;

    /* renamed from: c  reason: collision with root package name */
    public Map f43508c = new HashMap();

    public static class AuthenticationRequestBuilder extends OAuthRequestBuilder {
    }

    public static abstract class OAuthRequestBuilder {

        /* renamed from: a  reason: collision with root package name */
        public OAuthParametersApplier f43509a;

        /* renamed from: b  reason: collision with root package name */
        public Map f43510b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public String f43511c;

        public OAuthRequestBuilder(String str) {
            this.f43511c = str;
        }

        public OAuthClientRequest a() {
            OAuthClientRequest oAuthClientRequest = new OAuthClientRequest(this.f43511c);
            BodyURLEncodedParametersApplier bodyURLEncodedParametersApplier = new BodyURLEncodedParametersApplier();
            this.f43509a = bodyURLEncodedParametersApplier;
            return (OAuthClientRequest) bodyURLEncodedParametersApplier.a(oAuthClientRequest, this.f43510b);
        }

        public OAuthClientRequest b() {
            OAuthClientRequest oAuthClientRequest = new OAuthClientRequest(this.f43511c);
            ClientHeaderParametersApplier clientHeaderParametersApplier = new ClientHeaderParametersApplier();
            this.f43509a = clientHeaderParametersApplier;
            return (OAuthClientRequest) clientHeaderParametersApplier.a(oAuthClientRequest, this.f43510b);
        }
    }

    public static class TokenRequestBuilder extends OAuthRequestBuilder {
    }

    public OAuthClientRequest(String str) {
        this.f43506a = str;
    }

    public void a(String str) {
        this.f43507b = str;
    }

    public void b(String str, String str2) {
        this.f43508c.put(str, str2);
    }

    public String c() {
        return this.f43506a;
    }

    public void d(String str) {
        this.f43506a = str;
    }

    public String e() {
        return this.f43507b;
    }

    public Map f() {
        return this.f43508c;
    }
}
