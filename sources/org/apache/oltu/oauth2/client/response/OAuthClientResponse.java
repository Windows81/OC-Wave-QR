package org.apache.oltu.oauth2.client.response;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.oltu.oauth2.client.validator.OAuthClientValidator;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

public abstract class OAuthClientResponse {

    /* renamed from: a  reason: collision with root package name */
    public String f43512a;

    /* renamed from: b  reason: collision with root package name */
    public String f43513b;

    /* renamed from: c  reason: collision with root package name */
    public int f43514c;

    /* renamed from: d  reason: collision with root package name */
    public Map f43515d;

    /* renamed from: e  reason: collision with root package name */
    public OAuthClientValidator f43516e;

    /* renamed from: f  reason: collision with root package name */
    public Map f43517f;

    public String a(String str) {
        Object obj = this.f43517f.get(str);
        if (obj == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    public int b() {
        return this.f43514c;
    }

    public void c(InputStream inputStream, String str, int i2, Map map) {
        try {
            d(OAuthUtils.n(inputStream), str, i2);
        } catch (IOException e2) {
            throw OAuthProblemException.b(e2.getMessage());
        }
    }

    public void d(String str, String str2, int i2) {
        e(str, str2, i2, new HashMap());
    }

    public void e(String str, String str2, int i2, Map map) {
        f(str);
        g(str2);
        i(i2);
        h(map);
        j();
    }

    public void f(String str) {
        throw new UnsupportedOperationException();
    }

    public abstract void g(String str);

    public void h(Map map) {
        this.f43515d = map;
    }

    public abstract void i(int i2);

    public void j() {
        this.f43516e.a(this);
    }
}
