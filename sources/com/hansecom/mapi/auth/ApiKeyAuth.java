package com.hansecom.mapi.auth;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Metadata
public final class ApiKeyAuth implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final String f39105a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39106b;

    /* renamed from: c  reason: collision with root package name */
    public String f39107c;

    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.i(chain, "chain");
        Request m2 = chain.m();
        if (Intrinsics.d("query", this.f39105a)) {
            String query = m2.k().t().getQuery();
            String str = this.f39106b + '=' + this.f39107c;
            if (query != null) {
                str = query + '&' + str;
            }
            String str2 = str;
            try {
                URI t2 = m2.k().t();
                URI uri = new URI(t2.getScheme(), t2.getAuthority(), t2.getPath(), str2, t2.getFragment());
                Request.Builder i2 = m2.i();
                URL url = uri.toURL();
                Intrinsics.h(url, "toURL(...)");
                m2 = i2.j(url).b();
            } catch (URISyntaxException e2) {
                throw new IOException(e2);
            }
        } else if (Intrinsics.d("header", this.f39105a)) {
            m2 = m2.i().a(this.f39106b, this.f39107c).b();
        } else if (Intrinsics.d("cookie", this.f39105a)) {
            m2 = m2.i().a("Cookie", this.f39106b + '=' + this.f39107c).b();
        }
        return chain.b(m2);
    }
}
