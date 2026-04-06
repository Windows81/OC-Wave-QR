package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

@Metadata
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f43000b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f43001a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        Intrinsics.i(okHttpClient, "client");
        this.f43001a = okHttpClient;
    }

    public final Request a(Response response, String str) {
        String l2;
        HttpUrl r2;
        RequestBody requestBody = null;
        if (!this.f43001a.t() || (l2 = Response.l(response, "Location", (String) null, 2, (Object) null)) == null || (r2 = response.E().k().r(l2)) == null) {
            return null;
        }
        if (!Intrinsics.d(r2.s(), response.E().k().s()) && !this.f43001a.u()) {
            return null;
        }
        Request.Builder i2 = response.E().i();
        if (HttpMethod.b(str)) {
            int f2 = response.f();
            HttpMethod httpMethod = HttpMethod.f42988a;
            boolean z2 = httpMethod.d(str) || f2 == 308 || f2 == 307;
            if (!httpMethod.c(str) || f2 == 308 || f2 == 307) {
                if (z2) {
                    requestBody = response.E().a();
                }
                i2.f(str, requestBody);
            } else {
                i2.f("GET", (RequestBody) null);
            }
            if (!z2) {
                i2.g("Transfer-Encoding");
                i2.g("Content-Length");
                i2.g("Content-Type");
            }
        }
        if (!Util.j(response.E().k(), r2)) {
            i2.g("Authorization");
        }
        return i2.k(r2).b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r7.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Request b(okhttp3.Response r6, okhttp3.internal.connection.Exchange r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L_0x000e
            okhttp3.internal.connection.RealConnection r1 = r7.h()
            if (r1 == 0) goto L_0x000e
            okhttp3.Route r1 = r1.B()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            int r2 = r6.f()
            okhttp3.Request r3 = r6.E()
            java.lang.String r3 = r3.h()
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x00df
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto L_0x00df
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto L_0x00d4
            r4 = 421(0x1a5, float:5.9E-43)
            if (r2 == r4) goto L_0x00ad
            r7 = 503(0x1f7, float:7.05E-43)
            if (r2 == r7) goto L_0x0091
            r7 = 407(0x197, float:5.7E-43)
            if (r2 == r7) goto L_0x006f
            r7 = 408(0x198, float:5.72E-43)
            if (r2 == r7) goto L_0x003b
            switch(r2) {
                case 300: goto L_0x00df;
                case 301: goto L_0x00df;
                case 302: goto L_0x00df;
                case 303: goto L_0x00df;
                default: goto L_0x003a;
            }
        L_0x003a:
            return r0
        L_0x003b:
            okhttp3.OkHttpClient r1 = r5.f43001a
            boolean r1 = r1.M()
            if (r1 != 0) goto L_0x0044
            return r0
        L_0x0044:
            okhttp3.Request r1 = r6.E()
            okhttp3.RequestBody r1 = r1.a()
            if (r1 == 0) goto L_0x0055
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x0055
            return r0
        L_0x0055:
            okhttp3.Response r1 = r6.A()
            if (r1 == 0) goto L_0x0062
            int r1 = r1.f()
            if (r1 != r7) goto L_0x0062
            return r0
        L_0x0062:
            r7 = 0
            int r7 = r5.f(r6, r7)
            if (r7 <= 0) goto L_0x006a
            return r0
        L_0x006a:
            okhttp3.Request r6 = r6.E()
            return r6
        L_0x006f:
            kotlin.jvm.internal.Intrinsics.f(r1)
            java.net.Proxy r7 = r1.b()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r7 != r0) goto L_0x0089
            okhttp3.OkHttpClient r7 = r5.f43001a
            okhttp3.Authenticator r7 = r7.J()
            okhttp3.Request r6 = r7.a(r1, r6)
            return r6
        L_0x0089:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r6.<init>(r7)
            throw r6
        L_0x0091:
            okhttp3.Response r1 = r6.A()
            if (r1 == 0) goto L_0x009e
            int r1 = r1.f()
            if (r1 != r7) goto L_0x009e
            return r0
        L_0x009e:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r5.f(r6, r7)
            if (r7 != 0) goto L_0x00ac
            okhttp3.Request r6 = r6.E()
            return r6
        L_0x00ac:
            return r0
        L_0x00ad:
            okhttp3.Request r1 = r6.E()
            okhttp3.RequestBody r1 = r1.a()
            if (r1 == 0) goto L_0x00be
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x00be
            return r0
        L_0x00be:
            if (r7 == 0) goto L_0x00d3
            boolean r1 = r7.l()
            if (r1 != 0) goto L_0x00c7
            goto L_0x00d3
        L_0x00c7:
            okhttp3.internal.connection.RealConnection r7 = r7.h()
            r7.z()
            okhttp3.Request r6 = r6.E()
            return r6
        L_0x00d3:
            return r0
        L_0x00d4:
            okhttp3.OkHttpClient r7 = r5.f43001a
            okhttp3.Authenticator r7 = r7.g()
            okhttp3.Request r6 = r7.a(r1, r6)
            return r6
        L_0x00df:
            okhttp3.Request r6 = r5.a(r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.b(okhttp3.Response, okhttp3.internal.connection.Exchange):okhttp3.Request");
    }

    public final boolean c(IOException iOException, boolean z2) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z2 : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    public final boolean d(IOException iOException, RealCall realCall, Request request, boolean z2) {
        if (!this.f43001a.M()) {
            return false;
        }
        return (!z2 || !e(iOException, request)) && c(iOException, z2) && realCall.y();
    }

    public final boolean e(IOException iOException, Request request) {
        RequestBody a2 = request.a();
        return (a2 != null && a2.g()) || (iOException instanceof FileNotFoundException);
    }

    public final int f(Response response, int i2) {
        String l2 = Response.l(response, "Retry-After", (String) null, 2, (Object) null);
        if (l2 == null) {
            return i2;
        }
        if (!new Regex("\\d+").d(l2)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(l2);
        Intrinsics.h(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = r0.y().o(r7.y().b((okhttp3.ResponseBody) null).c()).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = r1.q();
        r6 = b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r6 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r0.m() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r1.B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r1.k(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r0.g() == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        r1.k(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = r7.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        okhttp3.internal.Util.m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r8 > 20) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            okhttp3.internal.http.RealInterceptorChain r11 = (okhttp3.internal.http.RealInterceptorChain) r11
            okhttp3.Request r0 = r11.k()
            okhttp3.internal.connection.RealCall r1 = r11.g()
            java.util.List r2 = kotlin.collections.CollectionsKt.m()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L_0x0018:
            r6 = r5
        L_0x0019:
            r1.j(r0, r6)
            boolean r6 = r1.A()     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x00d3
            okhttp3.Response r0 = r11.b(r0)     // Catch:{ RouteException -> 0x00b4, IOException -> 0x0099 }
            if (r7 == 0) goto L_0x0040
            okhttp3.Response$Builder r0 = r0.y()     // Catch:{ all -> 0x0042 }
            okhttp3.Response$Builder r6 = r7.y()     // Catch:{ all -> 0x0042 }
            okhttp3.Response$Builder r6 = r6.b(r4)     // Catch:{ all -> 0x0042 }
            okhttp3.Response r6 = r6.c()     // Catch:{ all -> 0x0042 }
            okhttp3.Response$Builder r0 = r0.o(r6)     // Catch:{ all -> 0x0042 }
            okhttp3.Response r0 = r0.c()     // Catch:{ all -> 0x0042 }
        L_0x0040:
            r7 = r0
            goto L_0x0045
        L_0x0042:
            r11 = move-exception
            goto L_0x00db
        L_0x0045:
            okhttp3.internal.connection.Exchange r0 = r1.q()     // Catch:{ all -> 0x0042 }
            okhttp3.Request r6 = r10.b(r7, r0)     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x005a
            boolean r11 = r0.m()     // Catch:{ all -> 0x0042 }
            if (r11 == 0) goto L_0x005a
            r1.B()     // Catch:{ all -> 0x0042 }
        L_0x005a:
            r1.k(r3)
            return r7
        L_0x005e:
            okhttp3.RequestBody r0 = r6.a()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.g()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006e
            r1.k(r3)
            return r7
        L_0x006e:
            okhttp3.ResponseBody r0 = r7.a()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0077
            okhttp3.internal.Util.m(r0)     // Catch:{ all -> 0x0042 }
        L_0x0077:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L_0x0082
            r1.k(r5)
            r0 = r6
            goto L_0x0018
        L_0x0082:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r0.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch:{ all -> 0x0042 }
            r0.append(r8)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0042 }
            r11.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x0099:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0042 }
            r9 = r9 ^ r5
            boolean r9 = r10.d(r6, r1, r0, r9)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00af
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0042 }
            java.util.List r2 = kotlin.collections.CollectionsKt.y0(r2, r6)     // Catch:{ all -> 0x0042 }
        L_0x00a9:
            r1.k(r5)
            r6 = r3
            goto L_0x0019
        L_0x00af:
            java.lang.Throwable r11 = okhttp3.internal.Util.b0(r6, r2)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00b4:
            r6 = move-exception
            java.io.IOException r9 = r6.c()     // Catch:{ all -> 0x0042 }
            boolean r9 = r10.d(r9, r1, r0, r3)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00ca
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0042 }
            java.io.IOException r6 = r6.b()     // Catch:{ all -> 0x0042 }
            java.util.List r2 = kotlin.collections.CollectionsKt.y0(r2, r6)     // Catch:{ all -> 0x0042 }
            goto L_0x00a9
        L_0x00ca:
            java.io.IOException r11 = r6.b()     // Catch:{ all -> 0x0042 }
            java.lang.Throwable r11 = okhttp3.internal.Util.b0(r11, r2)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00d3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00db:
            r1.k(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
