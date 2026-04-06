package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okio.Okio;
import okio.Sink;

@Metadata
public final class CacheInterceptor implements Interceptor {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f42809b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Cache f42810a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Headers c(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                String h2 = headers.h(i2);
                String o2 = headers.o(i2);
                if ((!StringsKt.B("Warning", h2, true) || !StringsKt.Q(o2, "1", false, 2, (Object) null)) && (d(h2) || !e(h2) || headers2.e(h2) == null)) {
                    builder.d(h2, o2);
                }
            }
            int size2 = headers2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String h3 = headers2.h(i3);
                if (!d(h3) && e(h3)) {
                    builder.d(h3, headers2.o(i3));
                }
            }
            return builder.f();
        }

        public final boolean d(String str) {
            return StringsKt.B("Content-Length", str, true) || StringsKt.B("Content-Encoding", str, true) || StringsKt.B("Content-Type", str, true);
        }

        public final boolean e(String str) {
            return !StringsKt.B("Connection", str, true) && !StringsKt.B("Keep-Alive", str, true) && !StringsKt.B("Proxy-Authenticate", str, true) && !StringsKt.B("Proxy-Authorization", str, true) && !StringsKt.B("TE", str, true) && !StringsKt.B("Trailers", str, true) && !StringsKt.B("Transfer-Encoding", str, true) && !StringsKt.B("Upgrade", str, true);
        }

        public final Response f(Response response) {
            return (response != null ? response.a() : null) != null ? response.y().b((ResponseBody) null).c() : response;
        }

        public Companion() {
        }
    }

    public CacheInterceptor(Cache cache) {
        this.f42810a = cache;
    }

    public final Response a(CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        Sink b2 = cacheRequest.b();
        ResponseBody a2 = response.a();
        Intrinsics.f(a2);
        CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 cacheInterceptor$cacheWritingResponse$cacheWritingSource$1 = new CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(a2.j(), cacheRequest, Okio.c(b2));
        return response.y().b(new RealResponseBody(Response.l(response, "Content-Type", (String) null, 2, (Object) null), response.a().d(), Okio.d(cacheInterceptor$cacheWritingResponse$cacheWritingSource$1))).c();
    }

    public Response intercept(Interceptor.Chain chain) {
        EventListener eventListener;
        ResponseBody a2;
        ResponseBody a3;
        Intrinsics.i(chain, "chain");
        Call call = chain.call();
        Cache cache = this.f42810a;
        RealCall realCall = null;
        Response b2 = cache != null ? cache.b(chain.m()) : null;
        CacheStrategy b3 = new CacheStrategy.Factory(System.currentTimeMillis(), chain.m(), b2).b();
        Request b4 = b3.b();
        Response a4 = b3.a();
        Cache cache2 = this.f42810a;
        if (cache2 != null) {
            cache2.m(b3);
        }
        if (call instanceof RealCall) {
            realCall = (RealCall) call;
        }
        if (realCall == null || (eventListener = realCall.o()) == null) {
            eventListener = EventListener.f42638b;
        }
        if (!(b2 == null || a4 != null || (a3 = b2.a()) == null)) {
            Util.m(a3);
        }
        if (b4 == null && a4 == null) {
            Response c2 = new Response.Builder().r(chain.m()).p(Protocol.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(Util.f42800c).s(-1).q(System.currentTimeMillis()).c();
            eventListener.A(call, c2);
            return c2;
        } else if (b4 == null) {
            Intrinsics.f(a4);
            Response c3 = a4.y().d(f42809b.f(a4)).c();
            eventListener.b(call, c3);
            return c3;
        } else {
            if (a4 != null) {
                eventListener.a(call, a4);
            } else if (this.f42810a != null) {
                eventListener.c(call);
            }
            try {
                Response b5 = chain.b(b4);
                if (!(b5 != null || b2 == null || a2 == null)) {
                }
                if (a4 != null) {
                    if (b5 == null || b5.f() != 304) {
                        ResponseBody a5 = a4.a();
                        if (a5 != null) {
                            Util.m(a5);
                        }
                    } else {
                        Response.Builder y2 = a4.y();
                        Companion companion = f42809b;
                        Response c4 = y2.k(companion.c(a4.m(), b5.m())).s(b5.F()).q(b5.D()).d(companion.f(a4)).n(companion.f(b5)).c();
                        ResponseBody a6 = b5.a();
                        Intrinsics.f(a6);
                        a6.close();
                        Cache cache3 = this.f42810a;
                        Intrinsics.f(cache3);
                        cache3.l();
                        this.f42810a.r(a4, c4);
                        eventListener.b(call, c4);
                        return c4;
                    }
                }
                Intrinsics.f(b5);
                Response.Builder y3 = b5.y();
                Companion companion2 = f42809b;
                Response c5 = y3.d(companion2.f(a4)).n(companion2.f(b5)).c();
                if (this.f42810a != null) {
                    if (HttpHeaders.b(c5) && CacheStrategy.f42814c.a(c5, b4)) {
                        Response a7 = a(this.f42810a.f(c5), c5);
                        if (a4 != null) {
                            eventListener.c(call);
                        }
                        return a7;
                    } else if (HttpMethod.f42988a.a(b4.h())) {
                        try {
                            this.f42810a.g(b4);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c5;
            } finally {
                if (!(b2 == null || (a2 = b2.a()) == null)) {
                    Util.m(a2);
                }
            }
        }
    }
}
