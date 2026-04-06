package org.apache.oltu.oauth2.common.message;

import java.util.Map;

public class OAuthResponse implements OAuthMessage {

    /* renamed from: a  reason: collision with root package name */
    public String f43543a;

    /* renamed from: b  reason: collision with root package name */
    public String f43544b;

    /* renamed from: c  reason: collision with root package name */
    public Map f43545c;

    public static class OAuthErrorResponseBuilder extends OAuthResponseBuilder {
    }

    public static class OAuthResponseBuilder {
    }

    public void a(String str) {
        this.f43544b = str;
    }

    public void b(String str, String str2) {
        this.f43545c.put(str, str2);
    }

    public String c() {
        return this.f43543a;
    }

    public void d(String str) {
        this.f43543a = str;
    }
}
