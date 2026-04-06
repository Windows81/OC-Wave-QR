package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Sink;
import okio.Source;

@Metadata
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f43115g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final List f43116h = Util.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i  reason: collision with root package name */
    public static final List f43117i = Util.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final RealConnection f43118a;

    /* renamed from: b  reason: collision with root package name */
    public final RealInterceptorChain f43119b;

    /* renamed from: c  reason: collision with root package name */
    public final Http2Connection f43120c;

    /* renamed from: d  reason: collision with root package name */
    public volatile Http2Stream f43121d;

    /* renamed from: e  reason: collision with root package name */
    public final Protocol f43122e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f43123f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(Request request) {
            Intrinsics.i(request, "request");
            Headers f2 = request.f();
            ArrayList arrayList = new ArrayList(f2.size() + 4);
            arrayList.add(new Header(Header.f43032g, request.h()));
            arrayList.add(new Header(Header.f43033h, RequestLine.f42999a.c(request.k())));
            String d2 = request.d("Host");
            if (d2 != null) {
                arrayList.add(new Header(Header.f43035j, d2));
            }
            arrayList.add(new Header(Header.f43034i, request.k().s()));
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                String h2 = f2.h(i2);
                Locale locale = Locale.US;
                Intrinsics.h(locale, "US");
                String lowerCase = h2.toLowerCase(locale);
                Intrinsics.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.f43116h.contains(lowerCase) || (Intrinsics.d(lowerCase, "te") && Intrinsics.d(f2.o(i2), "trailers"))) {
                    arrayList.add(new Header(lowerCase, f2.o(i2)));
                }
            }
            return arrayList;
        }

        public final Response.Builder b(Headers headers, Protocol protocol) {
            Intrinsics.i(headers, "headerBlock");
            Intrinsics.i(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            StatusLine statusLine = null;
            for (int i2 = 0; i2 < size; i2++) {
                String h2 = headers.h(i2);
                String o2 = headers.o(i2);
                if (Intrinsics.d(h2, ":status")) {
                    StatusLine.Companion companion = StatusLine.f43002d;
                    statusLine = companion.a("HTTP/1.1 " + o2);
                } else if (!Http2ExchangeCodec.f43117i.contains(h2)) {
                    builder.d(h2, o2);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().p(protocol).g(statusLine.f43004b).m(statusLine.f43005c).k(builder.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        Intrinsics.i(okHttpClient, "client");
        Intrinsics.i(realConnection, "connection");
        Intrinsics.i(realInterceptorChain, "chain");
        Intrinsics.i(http2Connection, "http2Connection");
        this.f43118a = realConnection;
        this.f43119b = realInterceptorChain;
        this.f43120c = http2Connection;
        List H = okHttpClient.H();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f43122e = !H.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    public void a() {
        Http2Stream http2Stream = this.f43121d;
        Intrinsics.f(http2Stream);
        http2Stream.n().close();
    }

    public void b(Request request) {
        Intrinsics.i(request, "request");
        if (this.f43121d == null) {
            this.f43121d = this.f43120c.n0(f43115g.a(request), request.a() != null);
            if (!this.f43123f) {
                Http2Stream http2Stream = this.f43121d;
                Intrinsics.f(http2Stream);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                http2Stream.v().h((long) this.f43119b.j(), timeUnit);
                Http2Stream http2Stream2 = this.f43121d;
                Intrinsics.f(http2Stream2);
                http2Stream2.E().h((long) this.f43119b.l(), timeUnit);
                return;
            }
            Http2Stream http2Stream3 = this.f43121d;
            Intrinsics.f(http2Stream3);
            http2Stream3.f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public Source c(Response response) {
        Intrinsics.i(response, "response");
        Http2Stream http2Stream = this.f43121d;
        Intrinsics.f(http2Stream);
        return http2Stream.p();
    }

    public void cancel() {
        this.f43123f = true;
        Http2Stream http2Stream = this.f43121d;
        if (http2Stream != null) {
            http2Stream.f(ErrorCode.CANCEL);
        }
    }

    public Response.Builder d(boolean z2) {
        Http2Stream http2Stream = this.f43121d;
        if (http2Stream != null) {
            Response.Builder b2 = f43115g.b(http2Stream.C(), this.f43122e);
            if (!z2 || b2.h() != 100) {
                return b2;
            }
            return null;
        }
        throw new IOException("stream wasn't created");
    }

    public RealConnection e() {
        return this.f43118a;
    }

    public void f() {
        this.f43120c.flush();
    }

    public long g(Response response) {
        Intrinsics.i(response, "response");
        if (!HttpHeaders.b(response)) {
            return 0;
        }
        return Util.v(response);
    }

    public Sink h(Request request, long j2) {
        Intrinsics.i(request, "request");
        Http2Stream http2Stream = this.f43121d;
        Intrinsics.f(http2Stream);
        return http2Stream.n();
    }
}
