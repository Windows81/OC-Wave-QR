package okhttp3.internal.http;

import com.lokalise.sdk.api.Params;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.GzipSource;
import okio.Okio;

@Metadata
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final CookieJar f42980a;

    public BridgeInterceptor(CookieJar cookieJar) {
        Intrinsics.i(cookieJar, "cookieJar");
        this.f42980a = cookieJar;
    }

    public final String a(List list) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.w();
            }
            Cookie cookie = (Cookie) next;
            if (i2 > 0) {
                sb.append("; ");
            }
            sb.append(cookie.e());
            sb.append('=');
            sb.append(cookie.g());
            i2 = i3;
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public Response intercept(Interceptor.Chain chain) {
        ResponseBody a2;
        Intrinsics.i(chain, "chain");
        Request m2 = chain.m();
        Request.Builder i2 = m2.i();
        RequestBody a3 = m2.a();
        if (a3 != null) {
            MediaType b2 = a3.b();
            if (b2 != null) {
                i2.d("Content-Type", b2.toString());
            }
            long a4 = a3.a();
            if (a4 != -1) {
                i2.d("Content-Length", String.valueOf(a4));
                i2.g("Transfer-Encoding");
            } else {
                i2.d("Transfer-Encoding", "chunked");
                i2.g("Content-Length");
            }
        }
        boolean z2 = false;
        if (m2.d("Host") == null) {
            i2.d("Host", Util.U(m2.k(), false, 1, (Object) null));
        }
        if (m2.d("Connection") == null) {
            i2.d("Connection", "Keep-Alive");
        }
        if (m2.d("Accept-Encoding") == null && m2.d("Range") == null) {
            i2.d("Accept-Encoding", "gzip");
            z2 = true;
        }
        List b3 = this.f42980a.b(m2.k());
        if (!b3.isEmpty()) {
            i2.d("Cookie", a(b3));
        }
        if (m2.d(Params.Headers.USER_AGENT) == null) {
            i2.d(Params.Headers.USER_AGENT, "okhttp/4.12.0");
        }
        Response b4 = chain.b(i2.b());
        HttpHeaders.f(this.f42980a, m2.k(), b4.m());
        Response.Builder r2 = b4.y().r(m2);
        if (z2 && StringsKt.B("gzip", Response.l(b4, "Content-Encoding", (String) null, 2, (Object) null), true) && HttpHeaders.b(b4) && (a2 = b4.a()) != null) {
            GzipSource gzipSource = new GzipSource(a2.j());
            r2.k(b4.m().i().i("Content-Encoding").i("Content-Length").f());
            r2.b(new RealResponseBody(Response.l(b4, "Content-Type", (String) null, 2, (Object) null), -1, Okio.d(gzipSource)));
        }
        return r2.c();
    }
}
