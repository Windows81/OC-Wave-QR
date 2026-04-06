package okhttp3.internal.connection;

import com.lokalise.sdk.api.Params;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

@Metadata
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: t  reason: collision with root package name */
    public static final Companion f42936t = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public final RealConnectionPool f42937c;

    /* renamed from: d  reason: collision with root package name */
    public final Route f42938d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f42939e;

    /* renamed from: f  reason: collision with root package name */
    public Socket f42940f;

    /* renamed from: g  reason: collision with root package name */
    public Handshake f42941g;

    /* renamed from: h  reason: collision with root package name */
    public Protocol f42942h;

    /* renamed from: i  reason: collision with root package name */
    public Http2Connection f42943i;

    /* renamed from: j  reason: collision with root package name */
    public BufferedSource f42944j;

    /* renamed from: k  reason: collision with root package name */
    public BufferedSink f42945k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f42946l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f42947m;

    /* renamed from: n  reason: collision with root package name */
    public int f42948n;

    /* renamed from: o  reason: collision with root package name */
    public int f42949o;

    /* renamed from: p  reason: collision with root package name */
    public int f42950p;

    /* renamed from: q  reason: collision with root package name */
    public int f42951q = 1;

    /* renamed from: r  reason: collision with root package name */
    public final List f42952r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public long f42953s = Long.MAX_VALUE;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42954a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f42954a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.WhenMappings.<clinit>():void");
        }
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        Intrinsics.i(realConnectionPool, "connectionPool");
        Intrinsics.i(route, "route");
        this.f42937c = realConnectionPool;
        this.f42938d = route;
    }

    public final synchronized void A() {
        this.f42946l = true;
    }

    public Route B() {
        return this.f42938d;
    }

    public final boolean C(List list) {
        Iterable<Route> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Route route : iterable) {
            Proxy.Type type = route.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f42938d.b().type() == type2 && Intrinsics.d(this.f42938d.d(), route.d())) {
                return true;
            }
        }
        return false;
    }

    public final void D(long j2) {
        this.f42953s = j2;
    }

    public final void E(boolean z2) {
        this.f42946l = z2;
    }

    public Socket F() {
        Socket socket = this.f42940f;
        Intrinsics.f(socket);
        return socket;
    }

    public final void G(int i2) {
        Socket socket = this.f42940f;
        Intrinsics.f(socket);
        BufferedSource bufferedSource = this.f42944j;
        Intrinsics.f(bufferedSource);
        BufferedSink bufferedSink = this.f42945k;
        Intrinsics.f(bufferedSink);
        socket.setSoTimeout(0);
        Http2Connection a2 = new Http2Connection.Builder(true, TaskRunner.f42891i).q(socket, this.f42938d.a().l().i(), bufferedSource, bufferedSink).k(this).l(i2).a();
        this.f42943i = a2;
        this.f42951q = Http2Connection.b0.a().d();
        Http2Connection.U0(a2, false, (TaskRunner) null, 3, (Object) null);
    }

    public final boolean H(HttpUrl httpUrl) {
        Handshake handshake;
        if (!Util.f42805h || Thread.holdsLock(this)) {
            HttpUrl l2 = this.f42938d.a().l();
            if (httpUrl.o() != l2.o()) {
                return false;
            }
            if (Intrinsics.d(httpUrl.i(), l2.i())) {
                return true;
            }
            if (this.f42947m || (handshake = this.f42941g) == null) {
                return false;
            }
            Intrinsics.f(handshake);
            return f(httpUrl, handshake);
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final synchronized void I(RealCall realCall, IOException iOException) {
        try {
            Intrinsics.i(realCall, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).f43168z == ErrorCode.REFUSED_STREAM) {
                    int i2 = this.f42950p + 1;
                    this.f42950p = i2;
                    if (i2 > 1) {
                        this.f42946l = true;
                        this.f42948n++;
                    }
                } else if (((StreamResetException) iOException).f43168z != ErrorCode.CANCEL || !realCall.A()) {
                    this.f42946l = true;
                    this.f42948n++;
                }
            } else if (!w() || (iOException instanceof ConnectionShutdownException)) {
                this.f42946l = true;
                if (this.f42949o == 0) {
                    if (iOException != null) {
                        h(realCall.l(), this.f42938d, iOException);
                    }
                    this.f42948n++;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public Protocol a() {
        Protocol protocol = this.f42942h;
        Intrinsics.f(protocol);
        return protocol;
    }

    public synchronized void b(Http2Connection http2Connection, Settings settings) {
        Intrinsics.i(http2Connection, "connection");
        Intrinsics.i(settings, "settings");
        this.f42951q = settings.d();
    }

    public void c(Http2Stream http2Stream) {
        Intrinsics.i(http2Stream, "stream");
        http2Stream.d(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    public final void e() {
        Socket socket = this.f42939e;
        if (socket != null) {
            Util.n(socket);
        }
    }

    public final boolean f(HttpUrl httpUrl, Handshake handshake) {
        List d2 = handshake.d();
        if (d2.isEmpty()) {
            return false;
        }
        OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f43245a;
        String i2 = httpUrl.i();
        Object obj = d2.get(0);
        Intrinsics.g(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        return okHostnameVerifier.e(i2, (X509Certificate) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c A[Catch:{ IOException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            okhttp3.Protocol r0 = r7.f42942h
            if (r0 != 0) goto L_0x0157
            okhttp3.Route r0 = r7.f42938d
            okhttp3.Address r0 = r0.a()
            java.util.List r0 = r0.b()
            okhttp3.internal.connection.ConnectionSpecSelector r10 = new okhttp3.internal.connection.ConnectionSpecSelector
            r10.<init>(r0)
            okhttp3.Route r1 = r7.f42938d
            okhttp3.Address r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0080
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.f42600k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0073
            okhttp3.Route r0 = r7.f42938d
            okhttp3.Address r0 = r0.a()
            okhttp3.HttpUrl r0 = r0.l()
            java.lang.String r0 = r0.i()
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.f43200a
            okhttp3.internal.platform.Platform r1 = r1.g()
            boolean r1 = r1.j(r0)
            if (r1 == 0) goto L_0x0052
            goto L_0x0092
        L_0x0052:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0073:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0080:
            okhttp3.Route r0 = r7.f42938d
            okhttp3.Address r0 = r0.a()
            java.util.List r0 = r0.f()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014a
        L_0x0092:
            r11 = 0
            r12 = r11
        L_0x0094:
            okhttp3.Route r0 = r7.f42938d     // Catch:{ IOException -> 0x00b7 }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00b7 }
            if (r0 == 0) goto L_0x00bf
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.k(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00b7 }
            java.net.Socket r0 = r7.f42939e     // Catch:{ IOException -> 0x00b7 }
            if (r0 != 0) goto L_0x00b0
            goto L_0x00db
        L_0x00b0:
            r13 = r17
            r14 = r18
        L_0x00b4:
            r15 = r20
            goto L_0x00c7
        L_0x00b7:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00bc:
            r15 = r20
            goto L_0x0100
        L_0x00bf:
            r13 = r17
            r14 = r18
            r7.i(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00fe }
            goto L_0x00b4
        L_0x00c7:
            r7.n(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00fc }
            okhttp3.Route r0 = r7.f42938d     // Catch:{ IOException -> 0x00fc }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x00fc }
            okhttp3.Route r1 = r7.f42938d     // Catch:{ IOException -> 0x00fc }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x00fc }
            okhttp3.Protocol r2 = r7.f42942h     // Catch:{ IOException -> 0x00fc }
            r9.h(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00fc }
        L_0x00db:
            okhttp3.Route r0 = r7.f42938d
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00f5
            java.net.Socket r0 = r7.f42939e
            if (r0 == 0) goto L_0x00e8
            goto L_0x00f5
        L_0x00e8:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            long r0 = java.lang.System.nanoTime()
            r7.f42953s = r0
            return
        L_0x00fc:
            r0 = move-exception
            goto L_0x0100
        L_0x00fe:
            r0 = move-exception
            goto L_0x00bc
        L_0x0100:
            java.net.Socket r1 = r7.f42940f
            if (r1 == 0) goto L_0x0107
            okhttp3.internal.Util.n(r1)
        L_0x0107:
            java.net.Socket r1 = r7.f42939e
            if (r1 == 0) goto L_0x010e
            okhttp3.internal.Util.n(r1)
        L_0x010e:
            r7.f42940f = r11
            r7.f42939e = r11
            r7.f42944j = r11
            r7.f42945k = r11
            r7.f42941g = r11
            r7.f42942h = r11
            r7.f42943i = r11
            r1 = 1
            r7.f42951q = r1
            okhttp3.Route r1 = r7.f42938d
            java.net.InetSocketAddress r3 = r1.d()
            okhttp3.Route r1 = r7.f42938d
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.i(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x013c
            okhttp3.internal.connection.RouteException r12 = new okhttp3.internal.connection.RouteException
            r12.<init>(r0)
            goto L_0x013f
        L_0x013c:
            r12.a(r0)
        L_0x013f:
            if (r21 == 0) goto L_0x0149
            boolean r0 = r10.b(r0)
            if (r0 == 0) goto L_0x0149
            goto L_0x0094
        L_0x0149:
            throw r12
        L_0x014a:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0157:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.g(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void h(OkHttpClient okHttpClient, Route route, IOException iOException) {
        Intrinsics.i(okHttpClient, "client");
        Intrinsics.i(route, "failedRoute");
        Intrinsics.i(iOException, "failure");
        if (route.b().type() != Proxy.Type.DIRECT) {
            Address a2 = route.a();
            a2.i().connectFailed(a2.l().t(), route.b().address(), iOException);
        }
        okHttpClient.v().b(route);
    }

    public final void i(int i2, int i3, Call call, EventListener eventListener) {
        Socket socket;
        Proxy b2 = this.f42938d.b();
        Address a2 = this.f42938d.a();
        Proxy.Type type = b2.type();
        int i4 = type == null ? -1 : WhenMappings.f42954a[type.ordinal()];
        if (i4 == 1 || i4 == 2) {
            socket = a2.j().createSocket();
            Intrinsics.f(socket);
        } else {
            socket = new Socket(b2);
        }
        this.f42939e = socket;
        eventListener.j(call, this.f42938d.d(), b2);
        socket.setSoTimeout(i3);
        try {
            Platform.f43200a.g().f(socket, this.f42938d.d(), i2);
            try {
                this.f42944j = Okio.d(Okio.l(socket));
                this.f42945k = Okio.c(Okio.h(socket));
            } catch (NullPointerException e2) {
                if (Intrinsics.d(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f42938d.d());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(okhttp3.internal.connection.ConnectionSpecSelector r11) {
        /*
            r10 = this;
            okhttp3.Route r0 = r10.f42938d
            okhttp3.Address r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            kotlin.jvm.internal.Intrinsics.f(r1)     // Catch:{ all -> 0x0174 }
            java.net.Socket r3 = r10.f42939e     // Catch:{ all -> 0x0174 }
            okhttp3.HttpUrl r4 = r0.l()     // Catch:{ all -> 0x0174 }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x0174 }
            okhttp3.HttpUrl r5 = r0.l()     // Catch:{ all -> 0x0174 }
            int r5 = r5.o()     // Catch:{ all -> 0x0174 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            kotlin.jvm.internal.Intrinsics.g(r1, r3)     // Catch:{ all -> 0x0174 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x0174 }
            okhttp3.ConnectionSpec r11 = r11.a(r1)     // Catch:{ all -> 0x004c }
            boolean r3 = r11.h()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0050
            okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.f43200a     // Catch:{ all -> 0x004c }
            okhttp3.internal.platform.Platform r3 = r3.g()     // Catch:{ all -> 0x004c }
            okhttp3.HttpUrl r4 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x004c }
            java.util.List r5 = r0.f()     // Catch:{ all -> 0x004c }
            r3.e(r1, r4, r5)     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r11 = move-exception
            r2 = r1
            goto L_0x0175
        L_0x0050:
            r1.startHandshake()     // Catch:{ all -> 0x004c }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x004c }
            okhttp3.Handshake$Companion r4 = okhttp3.Handshake.f42646e     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "sslSocketSession"
            kotlin.jvm.internal.Intrinsics.h(r3, r5)     // Catch:{ all -> 0x004c }
            okhttp3.Handshake r4 = r4.a(r3)     // Catch:{ all -> 0x004c }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ all -> 0x004c }
            kotlin.jvm.internal.Intrinsics.f(r5)     // Catch:{ all -> 0x004c }
            okhttp3.HttpUrl r7 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r7 = r7.i()     // Catch:{ all -> 0x004c }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x004c }
            if (r3 != 0) goto L_0x0108
            java.util.List r11 = r4.d()     // Catch:{ all -> 0x004c }
            r3 = r11
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x004c }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x004c }
            if (r3 != 0) goto L_0x00e4
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.g(r11, r3)     // Catch:{ all -> 0x004c }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x004c }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r4.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x004c }
            okhttp3.HttpUrl r0 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x004c }
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x004c }
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.f42552c     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.a(r11)     // Catch:{ all -> 0x004c }
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x004c }
            r4.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x004c }
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.f43245a     // Catch:{ all -> 0x004c }
            java.util.List r11 = r0.a(r11)     // Catch:{ all -> 0x004c }
            r4.append(r11)     // Catch:{ all -> 0x004c }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x004c }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x004c }
            java.lang.String r11 = kotlin.text.StringsKt.l(r11, r2, r6, r2)     // Catch:{ all -> 0x004c }
            r3.<init>(r11)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x00e4:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r2.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x004c }
            okhttp3.HttpUrl r0 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x004c }
            r2.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x004c }
            r11.<init>(r0)     // Catch:{ all -> 0x004c }
            throw r11     // Catch:{ all -> 0x004c }
        L_0x0108:
            okhttp3.CertificatePinner r3 = r0.a()     // Catch:{ all -> 0x004c }
            kotlin.jvm.internal.Intrinsics.f(r3)     // Catch:{ all -> 0x004c }
            okhttp3.Handshake r5 = new okhttp3.Handshake     // Catch:{ all -> 0x004c }
            okhttp3.TlsVersion r6 = r4.e()     // Catch:{ all -> 0x004c }
            okhttp3.CipherSuite r7 = r4.a()     // Catch:{ all -> 0x004c }
            java.util.List r8 = r4.c()     // Catch:{ all -> 0x004c }
            okhttp3.internal.connection.RealConnection$connectTls$1 r9 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch:{ all -> 0x004c }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x004c }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x004c }
            r10.f42941g = r5     // Catch:{ all -> 0x004c }
            okhttp3.HttpUrl r0 = r0.l()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x004c }
            okhttp3.internal.connection.RealConnection$connectTls$2 r4 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch:{ all -> 0x004c }
            r4.<init>(r10)     // Catch:{ all -> 0x004c }
            r3.b(r0, r4)     // Catch:{ all -> 0x004c }
            boolean r11 = r11.h()     // Catch:{ all -> 0x004c }
            if (r11 == 0) goto L_0x0147
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.f43200a     // Catch:{ all -> 0x004c }
            okhttp3.internal.platform.Platform r11 = r11.g()     // Catch:{ all -> 0x004c }
            java.lang.String r2 = r11.h(r1)     // Catch:{ all -> 0x004c }
        L_0x0147:
            r10.f42940f = r1     // Catch:{ all -> 0x004c }
            okio.Source r11 = okio.Okio.l(r1)     // Catch:{ all -> 0x004c }
            okio.BufferedSource r11 = okio.Okio.d(r11)     // Catch:{ all -> 0x004c }
            r10.f42944j = r11     // Catch:{ all -> 0x004c }
            okio.Sink r11 = okio.Okio.h(r1)     // Catch:{ all -> 0x004c }
            okio.BufferedSink r11 = okio.Okio.c(r11)     // Catch:{ all -> 0x004c }
            r10.f42945k = r11     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0166
            okhttp3.Protocol$Companion r11 = okhttp3.Protocol.f42747A     // Catch:{ all -> 0x004c }
            okhttp3.Protocol r11 = r11.a(r2)     // Catch:{ all -> 0x004c }
            goto L_0x0168
        L_0x0166:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch:{ all -> 0x004c }
        L_0x0168:
            r10.f42942h = r11     // Catch:{ all -> 0x004c }
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.f43200a
            okhttp3.internal.platform.Platform r11 = r11.g()
            r11.b(r1)
            return
        L_0x0174:
            r11 = move-exception
        L_0x0175:
            if (r2 == 0) goto L_0x0180
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.f43200a
            okhttp3.internal.platform.Platform r0 = r0.g()
            r0.b(r2)
        L_0x0180:
            if (r2 == 0) goto L_0x0185
            okhttp3.internal.Util.n(r2)
        L_0x0185:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.j(okhttp3.internal.connection.ConnectionSpecSelector):void");
    }

    public final void k(int i2, int i3, int i4, Call call, EventListener eventListener) {
        Request m2 = m();
        HttpUrl k2 = m2.k();
        int i5 = 0;
        while (i5 < 21) {
            i(i2, i3, call, eventListener);
            m2 = l(i3, i4, m2, k2);
            if (m2 != null) {
                Socket socket = this.f42939e;
                if (socket != null) {
                    Util.n(socket);
                }
                this.f42939e = null;
                this.f42945k = null;
                this.f42944j = null;
                eventListener.h(call, this.f42938d.d(), this.f42938d.b(), (Protocol) null);
                i5++;
            } else {
                return;
            }
        }
    }

    public final Request l(int i2, int i3, Request request, HttpUrl httpUrl) {
        String str = "CONNECT " + Util.T(httpUrl, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.f42944j;
            Intrinsics.f(bufferedSource);
            BufferedSink bufferedSink = this.f42945k;
            Intrinsics.f(bufferedSink);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec((OkHttpClient) null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.u().h((long) i2, timeUnit);
            bufferedSink.u().h((long) i3, timeUnit);
            http1ExchangeCodec.A(request.f(), str);
            http1ExchangeCodec.a();
            Response.Builder d2 = http1ExchangeCodec.d(false);
            Intrinsics.f(d2);
            Response c2 = d2.r(request).c();
            http1ExchangeCodec.z(c2);
            int f2 = c2.f();
            if (f2 != 200) {
                if (f2 == 407) {
                    Request a2 = this.f42938d.a().h().a(this.f42938d, c2);
                    if (a2 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (StringsKt.B("close", Response.l(c2, "Connection", (String) null, 2, (Object) null), true)) {
                        return a2;
                    } else {
                        request = a2;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c2.f());
                }
            } else if (bufferedSource.s().l0() && bufferedSink.s().l0()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    public final Request m() {
        Request b2 = new Request.Builder().k(this.f42938d.a().l()).f("CONNECT", (RequestBody) null).d("Host", Util.T(this.f42938d.a().l(), true)).d("Proxy-Connection", "Keep-Alive").d(Params.Headers.USER_AGENT, "okhttp/4.12.0").b();
        Request a2 = this.f42938d.a().h().a(this.f42938d, new Response.Builder().r(b2).p(Protocol.HTTP_1_1).g(407).m("Preemptive Authenticate").b(Util.f42800c).s(-1).q(-1).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a2 == null ? b2 : a2;
    }

    public final void n(ConnectionSpecSelector connectionSpecSelector, int i2, Call call, EventListener eventListener) {
        if (this.f42938d.a().k() == null) {
            List f2 = this.f42938d.a().f();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (f2.contains(protocol)) {
                this.f42940f = this.f42939e;
                this.f42942h = protocol;
                G(i2);
                return;
            }
            this.f42940f = this.f42939e;
            this.f42942h = Protocol.HTTP_1_1;
            return;
        }
        eventListener.C(call);
        j(connectionSpecSelector);
        eventListener.B(call, this.f42941g);
        if (this.f42942h == Protocol.HTTP_2) {
            G(i2);
        }
    }

    public final List o() {
        return this.f42952r;
    }

    public final long p() {
        return this.f42953s;
    }

    public final boolean q() {
        return this.f42946l;
    }

    public final int r() {
        return this.f42948n;
    }

    public Handshake s() {
        return this.f42941g;
    }

    public final synchronized void t() {
        this.f42949o++;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f42938d.a().l().i());
        sb.append(':');
        sb.append(this.f42938d.a().l().o());
        sb.append(", proxy=");
        sb.append(this.f42938d.b());
        sb.append(" hostAddress=");
        sb.append(this.f42938d.d());
        sb.append(" cipherSuite=");
        Handshake handshake = this.f42941g;
        if (handshake == null || (obj = handshake.a()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f42942h);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(Address address, List list) {
        Intrinsics.i(address, "address");
        if (Util.f42805h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        } else if (this.f42952r.size() >= this.f42951q || this.f42946l || !this.f42938d.a().d(address)) {
            return false;
        } else {
            if (Intrinsics.d(address.l().i(), B().a().l().i())) {
                return true;
            }
            if (this.f42943i == null || list == null || !C(list) || address.e() != OkHostnameVerifier.f43245a || !H(address.l())) {
                return false;
            }
            try {
                CertificatePinner a2 = address.a();
                Intrinsics.f(a2);
                String i2 = address.l().i();
                Handshake s2 = s();
                Intrinsics.f(s2);
                a2.a(i2, s2.d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public final boolean v(boolean z2) {
        long j2;
        if (!Util.f42805h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f42939e;
            Intrinsics.f(socket);
            Socket socket2 = this.f42940f;
            Intrinsics.f(socket2);
            BufferedSource bufferedSource = this.f42944j;
            Intrinsics.f(bufferedSource);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            Http2Connection http2Connection = this.f42943i;
            if (http2Connection != null) {
                return http2Connection.g0(nanoTime);
            }
            synchronized (this) {
                j2 = nanoTime - this.f42953s;
            }
            if (j2 < 10000000000L || !z2) {
                return true;
            }
            return Util.G(socket2, bufferedSource);
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean w() {
        return this.f42943i != null;
    }

    public final ExchangeCodec x(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) {
        Intrinsics.i(okHttpClient, "client");
        Intrinsics.i(realInterceptorChain, "chain");
        Socket socket = this.f42940f;
        Intrinsics.f(socket);
        BufferedSource bufferedSource = this.f42944j;
        Intrinsics.f(bufferedSource);
        BufferedSink bufferedSink = this.f42945k;
        Intrinsics.f(bufferedSink);
        Http2Connection http2Connection = this.f42943i;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.n());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bufferedSource.u().h((long) realInterceptorChain.j(), timeUnit);
        bufferedSink.u().h((long) realInterceptorChain.l(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, bufferedSource, bufferedSink);
    }

    public final RealWebSocket.Streams y(Exchange exchange) {
        Intrinsics.i(exchange, "exchange");
        Socket socket = this.f42940f;
        Intrinsics.f(socket);
        BufferedSource bufferedSource = this.f42944j;
        Intrinsics.f(bufferedSource);
        BufferedSink bufferedSink = this.f42945k;
        Intrinsics.f(bufferedSink);
        socket.setSoTimeout(0);
        A();
        return new RealConnection$newWebSocketStreams$1(bufferedSource, bufferedSink, exchange);
    }

    public final synchronized void z() {
        this.f42947m = true;
    }
}
