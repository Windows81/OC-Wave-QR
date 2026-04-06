package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

@Metadata
public final class Exchange {

    /* renamed from: a  reason: collision with root package name */
    public final RealCall f42907a;

    /* renamed from: b  reason: collision with root package name */
    public final EventListener f42908b;

    /* renamed from: c  reason: collision with root package name */
    public final ExchangeFinder f42909c;

    /* renamed from: d  reason: collision with root package name */
    public final ExchangeCodec f42910d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42911e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f42912f;

    /* renamed from: g  reason: collision with root package name */
    public final RealConnection f42913g;

    @Metadata
    public final class RequestBodySink extends ForwardingSink {

        /* renamed from: A  reason: collision with root package name */
        public final long f42914A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f42915B;
        public long C;
        public boolean D;
        public final /* synthetic */ Exchange E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, Sink sink, long j2) {
            super(sink);
            Intrinsics.i(sink, "delegate");
            this.E = exchange;
            this.f42914A = j2;
        }

        private final IOException a(IOException iOException) {
            if (this.f42915B) {
                return iOException;
            }
            this.f42915B = true;
            return this.E.a(this.C, false, true, iOException);
        }

        public void N0(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "source");
            if (!this.D) {
                long j3 = this.f42914A;
                if (j3 == -1 || this.C + j2 <= j3) {
                    try {
                        super.N0(buffer, j2);
                        this.C += j2;
                    } catch (IOException e2) {
                        throw a(e2);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f42914A + " bytes but received " + (this.C + j2));
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.D) {
                this.D = true;
                long j2 = this.f42914A;
                if (j2 == -1 || this.C == j2) {
                    try {
                        super.close();
                        a((IOException) null);
                    } catch (IOException e2) {
                        throw a(e2);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                super.flush();
            } catch (IOException e2) {
                throw a(e2);
            }
        }
    }

    @Metadata
    public final class ResponseBodySource extends ForwardingSource {

        /* renamed from: A  reason: collision with root package name */
        public final long f42916A;

        /* renamed from: B  reason: collision with root package name */
        public long f42917B;
        public boolean C = true;
        public boolean D;
        public boolean E;
        public final /* synthetic */ Exchange F;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, Source source, long j2) {
            super(source);
            Intrinsics.i(source, "delegate");
            this.F = exchange;
            this.f42916A = j2;
            if (j2 == 0) {
                b((IOException) null);
            }
        }

        public final IOException b(IOException iOException) {
            if (this.D) {
                return iOException;
            }
            this.D = true;
            if (iOException == null && this.C) {
                this.C = false;
                this.F.i().w(this.F.g());
            }
            return this.F.a(this.f42917B, true, false, iOException);
        }

        public void close() {
            if (!this.E) {
                this.E = true;
                try {
                    super.close();
                    b((IOException) null);
                } catch (IOException e2) {
                    throw b(e2);
                }
            }
        }

        public long o1(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "sink");
            if (!this.E) {
                try {
                    long o1 = a().o1(buffer, j2);
                    if (this.C) {
                        this.C = false;
                        this.F.i().w(this.F.g());
                    }
                    if (o1 == -1) {
                        b((IOException) null);
                        return -1;
                    }
                    long j3 = this.f42917B + o1;
                    long j4 = this.f42916A;
                    if (j4 != -1) {
                        if (j3 > j4) {
                            throw new ProtocolException("expected " + this.f42916A + " bytes but received " + j3);
                        }
                    }
                    this.f42917B = j3;
                    if (j3 == j4) {
                        b((IOException) null);
                    }
                    return o1;
                } catch (IOException e2) {
                    throw b(e2);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        Intrinsics.i(realCall, "call");
        Intrinsics.i(eventListener, "eventListener");
        Intrinsics.i(exchangeFinder, "finder");
        Intrinsics.i(exchangeCodec, "codec");
        this.f42907a = realCall;
        this.f42908b = eventListener;
        this.f42909c = exchangeFinder;
        this.f42910d = exchangeCodec;
        this.f42913g = exchangeCodec.e();
    }

    public final IOException a(long j2, boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            u(iOException);
        }
        if (z3) {
            if (iOException != null) {
                this.f42908b.s(this.f42907a, iOException);
            } else {
                this.f42908b.q(this.f42907a, j2);
            }
        }
        if (z2) {
            if (iOException != null) {
                this.f42908b.x(this.f42907a, iOException);
            } else {
                this.f42908b.v(this.f42907a, j2);
            }
        }
        return this.f42907a.u(this, z3, z2, iOException);
    }

    public final void b() {
        this.f42910d.cancel();
    }

    public final Sink c(Request request, boolean z2) {
        Intrinsics.i(request, "request");
        this.f42911e = z2;
        RequestBody a2 = request.a();
        Intrinsics.f(a2);
        long a3 = a2.a();
        this.f42908b.r(this.f42907a);
        return new RequestBodySink(this, this.f42910d.h(request, a3), a3);
    }

    public final void d() {
        this.f42910d.cancel();
        this.f42907a.u(this, true, true, (IOException) null);
    }

    public final void e() {
        try {
            this.f42910d.a();
        } catch (IOException e2) {
            this.f42908b.s(this.f42907a, e2);
            u(e2);
            throw e2;
        }
    }

    public final void f() {
        try {
            this.f42910d.f();
        } catch (IOException e2) {
            this.f42908b.s(this.f42907a, e2);
            u(e2);
            throw e2;
        }
    }

    public final RealCall g() {
        return this.f42907a;
    }

    public final RealConnection h() {
        return this.f42913g;
    }

    public final EventListener i() {
        return this.f42908b;
    }

    public final ExchangeFinder j() {
        return this.f42909c;
    }

    public final boolean k() {
        return this.f42912f;
    }

    public final boolean l() {
        return !Intrinsics.d(this.f42909c.d().l().i(), this.f42913g.B().a().l().i());
    }

    public final boolean m() {
        return this.f42911e;
    }

    public final RealWebSocket.Streams n() {
        this.f42907a.B();
        return this.f42910d.e().y(this);
    }

    public final void o() {
        this.f42910d.e().A();
    }

    public final void p() {
        this.f42907a.u(this, true, false, (IOException) null);
    }

    public final ResponseBody q(Response response) {
        Intrinsics.i(response, "response");
        try {
            String l2 = Response.l(response, "Content-Type", (String) null, 2, (Object) null);
            long g2 = this.f42910d.g(response);
            return new RealResponseBody(l2, g2, Okio.d(new ResponseBodySource(this, this.f42910d.c(response), g2)));
        } catch (IOException e2) {
            this.f42908b.x(this.f42907a, e2);
            u(e2);
            throw e2;
        }
    }

    public final Response.Builder r(boolean z2) {
        try {
            Response.Builder d2 = this.f42910d.d(z2);
            if (d2 != null) {
                d2.l(this);
            }
            return d2;
        } catch (IOException e2) {
            this.f42908b.x(this.f42907a, e2);
            u(e2);
            throw e2;
        }
    }

    public final void s(Response response) {
        Intrinsics.i(response, "response");
        this.f42908b.y(this.f42907a, response);
    }

    public final void t() {
        this.f42908b.z(this.f42907a);
    }

    public final void u(IOException iOException) {
        this.f42912f = true;
        this.f42909c.h(iOException);
        this.f42910d.e().I(this.f42907a, iOException);
    }

    public final void v() {
        a(-1, true, true, (IOException) null);
    }

    public final void w(Request request) {
        Intrinsics.i(request, "request");
        try {
            this.f42908b.u(this.f42907a);
            this.f42910d.b(request);
            this.f42908b.t(this.f42907a, request);
        } catch (IOException e2) {
            this.f42908b.s(this.f42907a, e2);
            u(e2);
            throw e2;
        }
    }
}
