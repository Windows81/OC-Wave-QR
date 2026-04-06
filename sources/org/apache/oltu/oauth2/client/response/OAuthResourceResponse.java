package org.apache.oltu.oauth2.client.response;

import java.io.InputStream;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OAuthResourceResponse extends OAuthClientResponse {

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f43518h = LoggerFactory.f(OAuthResourceResponse.class);

    /* renamed from: g  reason: collision with root package name */
    public InputStream f43519g;

    public int b() {
        return this.f43514c;
    }

    public void c(InputStream inputStream, String str, int i2, Map map) {
        k(inputStream);
        g(str);
        i(i2);
        h(map);
    }

    public void f(String str) {
        this.f43512a = str;
    }

    public void g(String str) {
        this.f43513b = str;
    }

    public void i(int i2) {
        this.f43514c = i2;
    }

    public void k(InputStream inputStream) {
        this.f43519g = inputStream;
    }
}
