package okhttp3;

import com.lokalise.sdk.api.Params;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

@Metadata
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion d0 = new Companion((DefaultConstructorMarker) null);
    public static final List e0 = Util.w(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List f0 = Util.w(ConnectionSpec.f42598i, ConnectionSpec.f42600k);

    /* renamed from: A  reason: collision with root package name */
    public final ConnectionPool f42714A;

    /* renamed from: B  reason: collision with root package name */
    public final List f42715B;
    public final List C;
    public final EventListener.Factory D;
    public final boolean E;
    public final Authenticator F;
    public final boolean G;
    public final boolean H;
    public final CookieJar I;
    public final Cache J;
    public final Dns K;
    public final Proxy L;
    public final ProxySelector M;
    public final Authenticator N;
    public final SocketFactory O;
    public final SSLSocketFactory P;
    public final X509TrustManager Q;
    public final List R;
    public final List S;
    public final HostnameVerifier T;
    public final CertificatePinner U;
    public final CertificateChainCleaner V;
    public final int W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final long b0;
    public final RouteDatabase c0;

    /* renamed from: z  reason: collision with root package name */
    public final Dispatcher f42716z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return OkHttpClient.f0;
        }

        public final List b() {
            return OkHttpClient.e0;
        }

        public Companion() {
        }
    }

    public OkHttpClient(Builder builder) {
        ProxySelector proxySelector;
        Intrinsics.i(builder, "builder");
        this.f42716z = builder.m();
        this.f42714A = builder.j();
        this.f42715B = Util.V(builder.s());
        this.C = Util.V(builder.u());
        this.D = builder.o();
        this.E = builder.B();
        this.F = builder.d();
        this.G = builder.p();
        this.H = builder.q();
        this.I = builder.l();
        this.J = builder.e();
        this.K = builder.n();
        this.L = builder.x();
        if (builder.x() != null) {
            proxySelector = NullProxySelector.f43232a;
        } else {
            proxySelector = builder.z();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = NullProxySelector.f43232a;
            }
        }
        this.M = proxySelector;
        this.N = builder.y();
        this.O = builder.D();
        List k2 = builder.k();
        this.R = k2;
        this.S = builder.w();
        this.T = builder.r();
        this.W = builder.f();
        this.X = builder.i();
        this.Y = builder.A();
        this.Z = builder.F();
        this.a0 = builder.v();
        this.b0 = builder.t();
        RouteDatabase C2 = builder.C();
        this.c0 = C2 == null ? new RouteDatabase() : C2;
        Iterable iterable = k2;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ConnectionSpec) it.next()).f()) {
                    if (builder.E() != null) {
                        this.P = builder.E();
                        CertificateChainCleaner g2 = builder.g();
                        Intrinsics.f(g2);
                        this.V = g2;
                        X509TrustManager G2 = builder.G();
                        Intrinsics.f(G2);
                        this.Q = G2;
                        CertificatePinner h2 = builder.h();
                        Intrinsics.f(g2);
                        this.U = h2.e(g2);
                    } else {
                        Platform.Companion companion = Platform.f43200a;
                        X509TrustManager p2 = companion.g().p();
                        this.Q = p2;
                        Platform g3 = companion.g();
                        Intrinsics.f(p2);
                        this.P = g3.o(p2);
                        CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.f43244a;
                        Intrinsics.f(p2);
                        CertificateChainCleaner a2 = companion2.a(p2);
                        this.V = a2;
                        CertificatePinner h3 = builder.h();
                        Intrinsics.f(a2);
                        this.U = h3.e(a2);
                    }
                }
            }
        }
        this.P = null;
        this.V = null;
        this.Q = null;
        this.U = CertificatePinner.f42553d;
        P();
    }

    public Builder B() {
        return new Builder(this);
    }

    public final int G() {
        return this.a0;
    }

    public final List H() {
        return this.S;
    }

    public final Proxy I() {
        return this.L;
    }

    public final Authenticator J() {
        return this.N;
    }

    public final ProxySelector K() {
        return this.M;
    }

    public final int L() {
        return this.Y;
    }

    public final boolean M() {
        return this.E;
    }

    public final SocketFactory N() {
        return this.O;
    }

    public final SSLSocketFactory O() {
        SSLSocketFactory sSLSocketFactory = this.P;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final void P() {
        List list = this.f42715B;
        Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains((Object) null)) {
            List list2 = this.C;
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains((Object) null)) {
                Iterable<ConnectionSpec> iterable = this.R;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (ConnectionSpec f2 : iterable) {
                        if (f2.f()) {
                            if (this.P == null) {
                                throw new IllegalStateException("sslSocketFactory == null");
                            } else if (this.V == null) {
                                throw new IllegalStateException("certificateChainCleaner == null");
                            } else if (this.Q == null) {
                                throw new IllegalStateException("x509TrustManager == null");
                            } else {
                                return;
                            }
                        }
                    }
                }
                if (this.P != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (this.V != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (this.Q != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (!Intrinsics.d(this.U, CertificatePinner.f42553d)) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException(("Null network interceptor: " + this.C).toString());
            }
        } else {
            throw new IllegalStateException(("Null interceptor: " + this.f42715B).toString());
        }
    }

    public final int R() {
        return this.Z;
    }

    public final X509TrustManager T() {
        return this.Q;
    }

    public Call b(Request request) {
        Intrinsics.i(request, "request");
        return new RealCall(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final Authenticator g() {
        return this.F;
    }

    public final Cache h() {
        return this.J;
    }

    public final int i() {
        return this.W;
    }

    public final CertificateChainCleaner j() {
        return this.V;
    }

    public final CertificatePinner k() {
        return this.U;
    }

    public final int l() {
        return this.X;
    }

    public final ConnectionPool n() {
        return this.f42714A;
    }

    public final List o() {
        return this.R;
    }

    public final CookieJar p() {
        return this.I;
    }

    public final Dispatcher q() {
        return this.f42716z;
    }

    public final Dns r() {
        return this.K;
    }

    public final EventListener.Factory s() {
        return this.D;
    }

    public final boolean t() {
        return this.G;
    }

    public final boolean u() {
        return this.H;
    }

    public final RouteDatabase v() {
        return this.c0;
    }

    public final HostnameVerifier w() {
        return this.T;
    }

    public final List x() {
        return this.f42715B;
    }

    public final long y() {
        return this.b0;
    }

    public final List z() {
        return this.C;
    }

    @Metadata
    public static final class Builder {

        /* renamed from: A  reason: collision with root package name */
        public int f42717A;

        /* renamed from: B  reason: collision with root package name */
        public int f42718B;
        public long C;
        public RouteDatabase D;

        /* renamed from: a  reason: collision with root package name */
        public Dispatcher f42719a;

        /* renamed from: b  reason: collision with root package name */
        public ConnectionPool f42720b;

        /* renamed from: c  reason: collision with root package name */
        public final List f42721c;

        /* renamed from: d  reason: collision with root package name */
        public final List f42722d;

        /* renamed from: e  reason: collision with root package name */
        public EventListener.Factory f42723e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f42724f;

        /* renamed from: g  reason: collision with root package name */
        public Authenticator f42725g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f42726h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f42727i;

        /* renamed from: j  reason: collision with root package name */
        public CookieJar f42728j;

        /* renamed from: k  reason: collision with root package name */
        public Cache f42729k;

        /* renamed from: l  reason: collision with root package name */
        public Dns f42730l;

        /* renamed from: m  reason: collision with root package name */
        public Proxy f42731m;

        /* renamed from: n  reason: collision with root package name */
        public ProxySelector f42732n;

        /* renamed from: o  reason: collision with root package name */
        public Authenticator f42733o;

        /* renamed from: p  reason: collision with root package name */
        public SocketFactory f42734p;

        /* renamed from: q  reason: collision with root package name */
        public SSLSocketFactory f42735q;

        /* renamed from: r  reason: collision with root package name */
        public X509TrustManager f42736r;

        /* renamed from: s  reason: collision with root package name */
        public List f42737s;

        /* renamed from: t  reason: collision with root package name */
        public List f42738t;

        /* renamed from: u  reason: collision with root package name */
        public HostnameVerifier f42739u;

        /* renamed from: v  reason: collision with root package name */
        public CertificatePinner f42740v;

        /* renamed from: w  reason: collision with root package name */
        public CertificateChainCleaner f42741w;

        /* renamed from: x  reason: collision with root package name */
        public int f42742x;

        /* renamed from: y  reason: collision with root package name */
        public int f42743y;

        /* renamed from: z  reason: collision with root package name */
        public int f42744z;

        public Builder() {
            this.f42719a = new Dispatcher();
            this.f42720b = new ConnectionPool();
            this.f42721c = new ArrayList();
            this.f42722d = new ArrayList();
            this.f42723e = Util.g(EventListener.f42638b);
            this.f42724f = true;
            Authenticator authenticator = Authenticator.f42497b;
            this.f42725g = authenticator;
            this.f42726h = true;
            this.f42727i = true;
            this.f42728j = CookieJar.f42624b;
            this.f42730l = Dns.f42635b;
            this.f42733o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.h(socketFactory, "getDefault()");
            this.f42734p = socketFactory;
            Companion companion = OkHttpClient.d0;
            this.f42737s = companion.a();
            this.f42738t = companion.b();
            this.f42739u = OkHostnameVerifier.f43245a;
            this.f42740v = CertificatePinner.f42553d;
            this.f42743y = Params.Timeout.CONNECT_LONG;
            this.f42744z = Params.Timeout.CONNECT_LONG;
            this.f42717A = Params.Timeout.CONNECT_LONG;
            this.C = 1024;
        }

        public final int A() {
            return this.f42744z;
        }

        public final boolean B() {
            return this.f42724f;
        }

        public final RouteDatabase C() {
            return this.D;
        }

        public final SocketFactory D() {
            return this.f42734p;
        }

        public final SSLSocketFactory E() {
            return this.f42735q;
        }

        public final int F() {
            return this.f42717A;
        }

        public final X509TrustManager G() {
            return this.f42736r;
        }

        public final Builder H(long j2, TimeUnit timeUnit) {
            Intrinsics.i(timeUnit, "unit");
            this.f42744z = Util.k("timeout", j2, timeUnit);
            return this;
        }

        public final Builder I(long j2, TimeUnit timeUnit) {
            Intrinsics.i(timeUnit, "unit");
            this.f42717A = Util.k("timeout", j2, timeUnit);
            return this;
        }

        public final Builder a(Interceptor interceptor) {
            Intrinsics.i(interceptor, "interceptor");
            this.f42721c.add(interceptor);
            return this;
        }

        public final Builder b(Authenticator authenticator) {
            Intrinsics.i(authenticator, "authenticator");
            this.f42725g = authenticator;
            return this;
        }

        public final OkHttpClient c() {
            return new OkHttpClient(this);
        }

        public final Authenticator d() {
            return this.f42725g;
        }

        public final Cache e() {
            return this.f42729k;
        }

        public final int f() {
            return this.f42742x;
        }

        public final CertificateChainCleaner g() {
            return this.f42741w;
        }

        public final CertificatePinner h() {
            return this.f42740v;
        }

        public final int i() {
            return this.f42743y;
        }

        public final ConnectionPool j() {
            return this.f42720b;
        }

        public final List k() {
            return this.f42737s;
        }

        public final CookieJar l() {
            return this.f42728j;
        }

        public final Dispatcher m() {
            return this.f42719a;
        }

        public final Dns n() {
            return this.f42730l;
        }

        public final EventListener.Factory o() {
            return this.f42723e;
        }

        public final boolean p() {
            return this.f42726h;
        }

        public final boolean q() {
            return this.f42727i;
        }

        public final HostnameVerifier r() {
            return this.f42739u;
        }

        public final List s() {
            return this.f42721c;
        }

        public final long t() {
            return this.C;
        }

        public final List u() {
            return this.f42722d;
        }

        public final int v() {
            return this.f42718B;
        }

        public final List w() {
            return this.f42738t;
        }

        public final Proxy x() {
            return this.f42731m;
        }

        public final Authenticator y() {
            return this.f42733o;
        }

        public final ProxySelector z() {
            return this.f42732n;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            Intrinsics.i(okHttpClient, "okHttpClient");
            this.f42719a = okHttpClient.q();
            this.f42720b = okHttpClient.n();
            CollectionsKt.B(this.f42721c, okHttpClient.x());
            CollectionsKt.B(this.f42722d, okHttpClient.z());
            this.f42723e = okHttpClient.s();
            this.f42724f = okHttpClient.M();
            this.f42725g = okHttpClient.g();
            this.f42726h = okHttpClient.t();
            this.f42727i = okHttpClient.u();
            this.f42728j = okHttpClient.p();
            this.f42729k = okHttpClient.h();
            this.f42730l = okHttpClient.r();
            this.f42731m = okHttpClient.I();
            this.f42732n = okHttpClient.K();
            this.f42733o = okHttpClient.J();
            this.f42734p = okHttpClient.N();
            this.f42735q = okHttpClient.P;
            this.f42736r = okHttpClient.T();
            this.f42737s = okHttpClient.o();
            this.f42738t = okHttpClient.H();
            this.f42739u = okHttpClient.w();
            this.f42740v = okHttpClient.k();
            this.f42741w = okHttpClient.j();
            this.f42742x = okHttpClient.i();
            this.f42743y = okHttpClient.l();
            this.f42744z = okHttpClient.L();
            this.f42717A = okHttpClient.R();
            this.f42718B = okHttpClient.G();
            this.C = okHttpClient.y();
            this.D = okHttpClient.v();
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
