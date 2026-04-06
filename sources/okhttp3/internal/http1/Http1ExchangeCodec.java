package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;

@Metadata
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f43009h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f43010a;

    /* renamed from: b  reason: collision with root package name */
    public final RealConnection f43011b;

    /* renamed from: c  reason: collision with root package name */
    public final BufferedSource f43012c;

    /* renamed from: d  reason: collision with root package name */
    public final BufferedSink f43013d;

    /* renamed from: e  reason: collision with root package name */
    public int f43014e;

    /* renamed from: f  reason: collision with root package name */
    public final HeadersReader f43015f;

    /* renamed from: g  reason: collision with root package name */
    public Headers f43016g;

    @Metadata
    public abstract class AbstractSource implements Source {

        /* renamed from: A  reason: collision with root package name */
        public boolean f43017A;

        /* renamed from: z  reason: collision with root package name */
        public final ForwardingTimeout f43019z;

        public AbstractSource() {
            this.f43019z = new ForwardingTimeout(Http1ExchangeCodec.this.f43012c.u());
        }

        public final boolean a() {
            return this.f43017A;
        }

        public final void b() {
            if (Http1ExchangeCodec.this.f43014e != 6) {
                if (Http1ExchangeCodec.this.f43014e == 5) {
                    Http1ExchangeCodec.this.r(this.f43019z);
                    Http1ExchangeCodec.this.f43014e = 6;
                    return;
                }
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.f43014e);
            }
        }

        public final void c(boolean z2) {
            this.f43017A = z2;
        }

        public long o1(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "sink");
            try {
                return Http1ExchangeCodec.this.f43012c.o1(buffer, j2);
            } catch (IOException e2) {
                Http1ExchangeCodec.this.e().A();
                b();
                throw e2;
            }
        }

        public Timeout u() {
            return this.f43019z;
        }
    }

    @Metadata
    public final class ChunkedSink implements Sink {

        /* renamed from: A  reason: collision with root package name */
        public boolean f43020A;

        /* renamed from: z  reason: collision with root package name */
        public final ForwardingTimeout f43022z;

        public ChunkedSink() {
            this.f43022z = new ForwardingTimeout(Http1ExchangeCodec.this.f43013d.u());
        }

        public void N0(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "source");
            if (this.f43020A) {
                throw new IllegalStateException("closed");
            } else if (j2 != 0) {
                Http1ExchangeCodec.this.f43013d.Q0(j2);
                Http1ExchangeCodec.this.f43013d.K0("\r\n");
                Http1ExchangeCodec.this.f43013d.N0(buffer, j2);
                Http1ExchangeCodec.this.f43013d.K0("\r\n");
            }
        }

        public synchronized void close() {
            if (!this.f43020A) {
                this.f43020A = true;
                Http1ExchangeCodec.this.f43013d.K0("0\r\n\r\n");
                Http1ExchangeCodec.this.r(this.f43022z);
                Http1ExchangeCodec.this.f43014e = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f43020A) {
                Http1ExchangeCodec.this.f43013d.flush();
            }
        }

        public Timeout u() {
            return this.f43022z;
        }
    }

    @Metadata
    public final class ChunkedSource extends AbstractSource {
        public final HttpUrl C;
        public long D = -1;
        public boolean E = true;
        public final /* synthetic */ Http1ExchangeCodec F;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            Intrinsics.i(httpUrl, "url");
            this.F = http1ExchangeCodec;
            this.C = httpUrl;
        }

        public void close() {
            if (!a()) {
                if (this.E && !Util.s(this, 100, TimeUnit.MILLISECONDS)) {
                    this.F.e().A();
                    b();
                }
                c(true);
            }
        }

        public final void d() {
            if (this.D != -1) {
                this.F.f43012c.a1();
            }
            try {
                this.D = this.F.f43012c.A1();
                String obj = StringsKt.f1(this.F.f43012c.a1()).toString();
                if (this.D < 0 || (obj.length() > 0 && !StringsKt.Q(obj, ";", false, 2, (Object) null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.D + obj + '\"');
                } else if (this.D == 0) {
                    this.E = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.F;
                    http1ExchangeCodec.f43016g = http1ExchangeCodec.f43015f.a();
                    OkHttpClient j2 = this.F.f43010a;
                    Intrinsics.f(j2);
                    CookieJar p2 = j2.p();
                    HttpUrl httpUrl = this.C;
                    Headers o2 = this.F.f43016g;
                    Intrinsics.f(o2);
                    HttpHeaders.f(p2, httpUrl, o2);
                    b();
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        public long o1(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "sink");
            if (j2 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            } else if (a()) {
                throw new IllegalStateException("closed");
            } else if (!this.E) {
                return -1;
            } else {
                long j3 = this.D;
                if (j3 == 0 || j3 == -1) {
                    d();
                    if (!this.E) {
                        return -1;
                    }
                }
                long o1 = super.o1(buffer, Math.min(j2, this.D));
                if (o1 != -1) {
                    this.D -= o1;
                    return o1;
                }
                this.F.e().A();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public final class FixedLengthSource extends AbstractSource {
        public long C;

        public FixedLengthSource(long j2) {
            super();
            this.C = j2;
            if (j2 == 0) {
                b();
            }
        }

        public void close() {
            if (!a()) {
                if (this.C != 0 && !Util.s(this, 100, TimeUnit.MILLISECONDS)) {
                    Http1ExchangeCodec.this.e().A();
                    b();
                }
                c(true);
            }
        }

        public long o1(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "sink");
            if (j2 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            } else if (!a()) {
                long j3 = this.C;
                if (j3 == 0) {
                    return -1;
                }
                long o1 = super.o1(buffer, Math.min(j3, j2));
                if (o1 != -1) {
                    long j4 = this.C - o1;
                    this.C = j4;
                    if (j4 == 0) {
                        b();
                    }
                    return o1;
                }
                Http1ExchangeCodec.this.e().A();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    @Metadata
    public final class KnownLengthSink implements Sink {

        /* renamed from: A  reason: collision with root package name */
        public boolean f43023A;

        /* renamed from: z  reason: collision with root package name */
        public final ForwardingTimeout f43025z;

        public KnownLengthSink() {
            this.f43025z = new ForwardingTimeout(Http1ExchangeCodec.this.f43013d.u());
        }

        public void N0(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "source");
            if (!this.f43023A) {
                Util.l(buffer.n0(), 0, j2);
                Http1ExchangeCodec.this.f43013d.N0(buffer, j2);
                return;
            }
            throw new IllegalStateException("closed");
        }

        public void close() {
            if (!this.f43023A) {
                this.f43023A = true;
                Http1ExchangeCodec.this.r(this.f43025z);
                Http1ExchangeCodec.this.f43014e = 3;
            }
        }

        public void flush() {
            if (!this.f43023A) {
                Http1ExchangeCodec.this.f43013d.flush();
            }
        }

        public Timeout u() {
            return this.f43025z;
        }
    }

    @Metadata
    public final class UnknownLengthSource extends AbstractSource {
        public boolean C;

        public UnknownLengthSource() {
            super();
        }

        public void close() {
            if (!a()) {
                if (!this.C) {
                    b();
                }
                c(true);
            }
        }

        public long o1(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "sink");
            if (j2 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            } else if (a()) {
                throw new IllegalStateException("closed");
            } else if (this.C) {
                return -1;
            } else {
                long o1 = super.o1(buffer, j2);
                if (o1 != -1) {
                    return o1;
                }
                this.C = true;
                b();
                return -1;
            }
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        Intrinsics.i(realConnection, "connection");
        Intrinsics.i(bufferedSource, "source");
        Intrinsics.i(bufferedSink, "sink");
        this.f43010a = okHttpClient;
        this.f43011b = realConnection;
        this.f43012c = bufferedSource;
        this.f43013d = bufferedSink;
        this.f43015f = new HeadersReader(bufferedSource);
    }

    public final void A(Headers headers, String str) {
        Intrinsics.i(headers, "headers");
        Intrinsics.i(str, "requestLine");
        if (this.f43014e == 0) {
            this.f43013d.K0(str).K0("\r\n");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f43013d.K0(headers.h(i2)).K0(": ").K0(headers.o(i2)).K0("\r\n");
            }
            this.f43013d.K0("\r\n");
            this.f43014e = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f43014e).toString());
    }

    public void a() {
        this.f43013d.flush();
    }

    public void b(Request request) {
        Intrinsics.i(request, "request");
        RequestLine requestLine = RequestLine.f42999a;
        Proxy.Type type = e().B().b().type();
        Intrinsics.h(type, "connection.route().proxy.type()");
        A(request.f(), requestLine.a(request, type));
    }

    public Source c(Response response) {
        Intrinsics.i(response, "response");
        if (!HttpHeaders.b(response)) {
            return w(0);
        }
        if (t(response)) {
            return v(response.E().k());
        }
        long v2 = Util.v(response);
        return v2 != -1 ? w(v2) : y();
    }

    public void cancel() {
        e().e();
    }

    public Response.Builder d(boolean z2) {
        int i2 = this.f43014e;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            try {
                StatusLine a2 = StatusLine.f43002d.a(this.f43015f.b());
                Response.Builder k2 = new Response.Builder().p(a2.f43003a).g(a2.f43004b).m(a2.f43005c).k(this.f43015f.a());
                if (z2 && a2.f43004b == 100) {
                    return null;
                }
                int i3 = a2.f43004b;
                if (i3 == 100) {
                    this.f43014e = 3;
                    return k2;
                } else if (102 > i3 || i3 >= 200) {
                    this.f43014e = 4;
                    return k2;
                } else {
                    this.f43014e = 3;
                    return k2;
                }
            } catch (EOFException e2) {
                String q2 = e().B().a().l().q();
                throw new IOException("unexpected end of stream on " + q2, e2);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f43014e).toString());
        }
    }

    public RealConnection e() {
        return this.f43011b;
    }

    public void f() {
        this.f43013d.flush();
    }

    public long g(Response response) {
        Intrinsics.i(response, "response");
        if (!HttpHeaders.b(response)) {
            return 0;
        }
        if (t(response)) {
            return -1;
        }
        return Util.v(response);
    }

    public Sink h(Request request, long j2) {
        Intrinsics.i(request, "request");
        if (request.a() != null && request.a().f()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (s(request)) {
            return u();
        } else {
            if (j2 != -1) {
                return x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final void r(ForwardingTimeout forwardingTimeout) {
        Timeout k2 = forwardingTimeout.k();
        forwardingTimeout.l(Timeout.f43454f);
        k2.b();
        k2.c();
    }

    public final boolean s(Request request) {
        return StringsKt.B("chunked", request.d("Transfer-Encoding"), true);
    }

    public final boolean t(Response response) {
        return StringsKt.B("chunked", Response.l(response, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    public final Sink u() {
        if (this.f43014e == 1) {
            this.f43014e = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.f43014e).toString());
    }

    public final Source v(HttpUrl httpUrl) {
        if (this.f43014e == 4) {
            this.f43014e = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.f43014e).toString());
    }

    public final Source w(long j2) {
        if (this.f43014e == 4) {
            this.f43014e = 5;
            return new FixedLengthSource(j2);
        }
        throw new IllegalStateException(("state: " + this.f43014e).toString());
    }

    public final Sink x() {
        if (this.f43014e == 1) {
            this.f43014e = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.f43014e).toString());
    }

    public final Source y() {
        if (this.f43014e == 4) {
            this.f43014e = 5;
            e().A();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.f43014e).toString());
    }

    public final void z(Response response) {
        Intrinsics.i(response, "response");
        long v2 = Util.v(response);
        if (v2 != -1) {
            Source w2 = w(v2);
            Util.M(w2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            w2.close();
        }
    }
}
