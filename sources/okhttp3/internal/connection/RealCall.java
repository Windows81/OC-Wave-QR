package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;

@Metadata
public final class RealCall implements Call {

    /* renamed from: A  reason: collision with root package name */
    public final Request f42928A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f42929B;
    public final RealConnectionPool C;
    public final EventListener D;
    public final RealCall$timeout$1 E;
    public final AtomicBoolean F = new AtomicBoolean();
    public Object G;
    public ExchangeFinder H;
    public RealConnection I;
    public boolean J;
    public Exchange K;
    public boolean L;
    public boolean M;
    public boolean N = true;
    public volatile boolean O;
    public volatile Exchange P;
    public volatile RealConnection Q;

    /* renamed from: z  reason: collision with root package name */
    public final OkHttpClient f42930z;

    @Metadata
    public final class AsyncCall implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public volatile AtomicInteger f42931A = new AtomicInteger(0);

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ RealCall f42932B;

        /* renamed from: z  reason: collision with root package name */
        public final Callback f42933z;

        public AsyncCall(RealCall realCall, Callback callback) {
            Intrinsics.i(callback, "responseCallback");
            this.f42932B = realCall;
            this.f42933z = callback;
        }

        public final void a(ExecutorService executorService) {
            Intrinsics.i(executorService, "executorService");
            Dispatcher q2 = this.f42932B.l().q();
            if (!Util.f42805h || !Thread.holdsLock(q2)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    this.f42932B.v(interruptedIOException);
                    this.f42933z.c(this.f42932B, interruptedIOException);
                    this.f42932B.l().q().f(this);
                } catch (Throwable th) {
                    this.f42932B.l().q().f(this);
                    throw th;
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + q2);
            }
        }

        public final RealCall b() {
            return this.f42932B;
        }

        public final AtomicInteger c() {
            return this.f42931A;
        }

        public final String d() {
            return this.f42932B.r().k().i();
        }

        public final void e(AsyncCall asyncCall) {
            Intrinsics.i(asyncCall, "other");
            this.f42931A = asyncCall.f42931A;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[Catch:{ all -> 0x0072, all -> 0x0043 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x007b A[Catch:{ all -> 0x0072, all -> 0x0043 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x009b A[Catch:{ all -> 0x0072, all -> 0x0043 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                okhttp3.internal.connection.RealCall r1 = r8.f42932B
                java.lang.String r1 = r1.w()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.internal.connection.RealCall r1 = r8.f42932B
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r3 = r2.getName()
                r2.setName(r0)
                okhttp3.internal.connection.RealCall$timeout$1 r0 = r1.E     // Catch:{ all -> 0x0043 }
                r0.x()     // Catch:{ all -> 0x0043 }
                r0 = 0
                okhttp3.Response r0 = r1.s()     // Catch:{ IOException -> 0x0075, all -> 0x004a }
                r4 = 1
                okhttp3.Callback r5 = r8.f42933z     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
                r5.b(r1, r0)     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
                okhttp3.OkHttpClient r0 = r1.l()     // Catch:{ all -> 0x0043 }
                okhttp3.Dispatcher r0 = r0.q()     // Catch:{ all -> 0x0043 }
            L_0x003e:
                r0.f(r8)     // Catch:{ all -> 0x0043 }
                goto L_0x00a9
            L_0x0043:
                r0 = move-exception
                goto L_0x00b9
            L_0x0046:
                r0 = move-exception
                goto L_0x004e
            L_0x0048:
                r0 = move-exception
                goto L_0x0079
            L_0x004a:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L_0x004e:
                r1.cancel()     // Catch:{ all -> 0x0072 }
                if (r4 != 0) goto L_0x0074
                java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0072 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
                r5.<init>()     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = "canceled due to "
                r5.append(r6)     // Catch:{ all -> 0x0072 }
                r5.append(r0)     // Catch:{ all -> 0x0072 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
                r4.<init>(r5)     // Catch:{ all -> 0x0072 }
                kotlin.ExceptionsKt.a(r4, r0)     // Catch:{ all -> 0x0072 }
                okhttp3.Callback r5 = r8.f42933z     // Catch:{ all -> 0x0072 }
                r5.c(r1, r4)     // Catch:{ all -> 0x0072 }
                goto L_0x0074
            L_0x0072:
                r0 = move-exception
                goto L_0x00ad
            L_0x0074:
                throw r0     // Catch:{ all -> 0x0072 }
            L_0x0075:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L_0x0079:
                if (r4 == 0) goto L_0x009b
                okhttp3.internal.platform.Platform$Companion r4 = okhttp3.internal.platform.Platform.f43200a     // Catch:{ all -> 0x0072 }
                okhttp3.internal.platform.Platform r4 = r4.g()     // Catch:{ all -> 0x0072 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
                r5.<init>()     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = "Callback failure for "
                r5.append(r6)     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = r1.H()     // Catch:{ all -> 0x0072 }
                r5.append(r6)     // Catch:{ all -> 0x0072 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
                r6 = 4
                r4.k(r5, r6, r0)     // Catch:{ all -> 0x0072 }
                goto L_0x00a0
            L_0x009b:
                okhttp3.Callback r4 = r8.f42933z     // Catch:{ all -> 0x0072 }
                r4.c(r1, r0)     // Catch:{ all -> 0x0072 }
            L_0x00a0:
                okhttp3.OkHttpClient r0 = r1.l()     // Catch:{ all -> 0x0043 }
                okhttp3.Dispatcher r0 = r0.q()     // Catch:{ all -> 0x0043 }
                goto L_0x003e
            L_0x00a9:
                r2.setName(r3)
                return
            L_0x00ad:
                okhttp3.OkHttpClient r1 = r1.l()     // Catch:{ all -> 0x0043 }
                okhttp3.Dispatcher r1 = r1.q()     // Catch:{ all -> 0x0043 }
                r1.f(r8)     // Catch:{ all -> 0x0043 }
                throw r0     // Catch:{ all -> 0x0043 }
            L_0x00b9:
                r2.setName(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.AsyncCall.run():void");
        }
    }

    @Metadata
    public static final class CallReference extends WeakReference<RealCall> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f42934a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            Intrinsics.i(realCall, "referent");
            this.f42934a = obj;
        }

        public final Object a() {
            return this.f42934a;
        }
    }

    public RealCall(OkHttpClient okHttpClient, Request request, boolean z2) {
        Intrinsics.i(okHttpClient, "client");
        Intrinsics.i(request, "originalRequest");
        this.f42930z = okHttpClient;
        this.f42928A = request;
        this.f42929B = z2;
        this.C = okHttpClient.n().a();
        this.D = okHttpClient.s().a(this);
        RealCall$timeout$1 realCall$timeout$1 = new RealCall$timeout$1(this);
        realCall$timeout$1.h((long) okHttpClient.i(), TimeUnit.MILLISECONDS);
        this.E = realCall$timeout$1;
    }

    public boolean A() {
        return this.O;
    }

    public final void B() {
        if (!this.J) {
            this.J = true;
            this.E.y();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public Response D() {
        if (this.F.compareAndSet(false, true)) {
            this.E.x();
            g();
            try {
                this.f42930z.q().b(this);
                return s();
            } finally {
                this.f42930z.q().g(this);
            }
        } else {
            throw new IllegalStateException("Already Executed");
        }
    }

    public final IOException G(IOException iOException) {
        if (this.J || !this.E.y()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final String H() {
        StringBuilder sb = new StringBuilder();
        sb.append(A() ? "canceled " : "");
        sb.append(this.f42929B ? "web socket" : "call");
        sb.append(" to ");
        sb.append(w());
        return sb.toString();
    }

    public void cancel() {
        if (!this.O) {
            this.O = true;
            Exchange exchange = this.P;
            if (exchange != null) {
                exchange.b();
            }
            RealConnection realConnection = this.Q;
            if (realConnection != null) {
                realConnection.e();
            }
            this.D.g(this);
        }
    }

    public final void e(RealConnection realConnection) {
        Intrinsics.i(realConnection, "connection");
        if (Util.f42805h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        } else if (this.I == null) {
            this.I = realConnection;
            realConnection.o().add(new CallReference(this, this.G));
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final IOException f(IOException iOException) {
        Socket x2;
        boolean z2 = Util.f42805h;
        if (!z2 || !Thread.holdsLock(this)) {
            RealConnection realConnection = this.I;
            if (realConnection != null) {
                if (!z2 || !Thread.holdsLock(realConnection)) {
                    synchronized (realConnection) {
                        x2 = x();
                    }
                    if (this.I == null) {
                        if (x2 != null) {
                            Util.n(x2);
                        }
                        this.D.l(this, realConnection);
                    } else if (x2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
                }
            }
            IOException G2 = G(iOException);
            if (iOException != null) {
                EventListener eventListener = this.D;
                Intrinsics.f(G2);
                eventListener.e(this, G2);
            } else {
                this.D.d(this);
            }
            return G2;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public void f0(Callback callback) {
        Intrinsics.i(callback, "responseCallback");
        if (this.F.compareAndSet(false, true)) {
            g();
            this.f42930z.q().a(new AsyncCall(this, callback));
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    public final void g() {
        this.G = Platform.f43200a.g().i("response.body().close()");
        this.D.f(this);
    }

    /* renamed from: h */
    public RealCall clone() {
        return new RealCall(this.f42930z, this.f42928A, this.f42929B);
    }

    public final Address i(HttpUrl httpUrl) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (httpUrl.j()) {
            sSLSocketFactory = this.f42930z.O();
            hostnameVerifier = this.f42930z.w();
            certificatePinner = this.f42930z.k();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.i(), httpUrl.o(), this.f42930z.r(), this.f42930z.N(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.f42930z.J(), this.f42930z.I(), this.f42930z.H(), this.f42930z.o(), this.f42930z.K());
    }

    public final void j(Request request, boolean z2) {
        Intrinsics.i(request, "request");
        if (this.K == null) {
            synchronized (this) {
                if (this.M) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                } else if (!this.L) {
                    Unit unit = Unit.f40552a;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            if (z2) {
                this.H = new ExchangeFinder(this.C, i(request.k()), this, this.D);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void k(boolean z2) {
        Exchange exchange;
        synchronized (this) {
            if (this.N) {
                Unit unit = Unit.f40552a;
            } else {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (exchange = this.P) != null) {
            exchange.d();
        }
        this.K = null;
    }

    public final OkHttpClient l() {
        return this.f42930z;
    }

    public Request m() {
        return this.f42928A;
    }

    public final RealConnection n() {
        return this.I;
    }

    public final EventListener o() {
        return this.D;
    }

    public final boolean p() {
        return this.f42929B;
    }

    public final Exchange q() {
        return this.K;
    }

    public final Request r() {
        return this.f42928A;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response s() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.f42930z
            java.util.List r0 = r0.x()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.B(r2, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r11.f42930z
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r11.f42930z
            okhttp3.CookieJar r1 = r1.p()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r11.f42930z
            okhttp3.Cache r1 = r1.h()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.f42902a
            r2.add(r0)
            boolean r0 = r11.f42929B
            if (r0 != 0) goto L_0x004a
            okhttp3.OkHttpClient r0 = r11.f42930z
            java.util.List r0 = r0.z()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.B(r2, r0)
        L_0x004a:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r11.f42929B
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r9 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.Request r5 = r11.f42928A
            okhttp3.OkHttpClient r0 = r11.f42930z
            int r6 = r0.l()
            okhttp3.OkHttpClient r0 = r11.f42930z
            int r7 = r0.L()
            okhttp3.OkHttpClient r0 = r11.f42930z
            int r8 = r0.R()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.f42928A     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            okhttp3.Response r2 = r9.b(r2)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            boolean r3 = r11.A()     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            if (r3 != 0) goto L_0x0083
            r11.v(r0)
            return r2
        L_0x0083:
            okhttp3.internal.Util.m(r2)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            throw r2     // Catch:{ IOException -> 0x0090, all -> 0x008e }
        L_0x008e:
            r2 = move-exception
            goto L_0x00a0
        L_0x0090:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.v(r1)     // Catch:{ all -> 0x009c }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.Intrinsics.g(r1, r3)     // Catch:{ all -> 0x009c }
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00a0:
            if (r1 != 0) goto L_0x00a5
            r11.v(r0)
        L_0x00a5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.s():okhttp3.Response");
    }

    public final Exchange t(RealInterceptorChain realInterceptorChain) {
        Intrinsics.i(realInterceptorChain, "chain");
        synchronized (this) {
            if (!this.N) {
                throw new IllegalStateException("released");
            } else if (this.M) {
                throw new IllegalStateException("Check failed.");
            } else if (!this.L) {
                Unit unit = Unit.f40552a;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        ExchangeFinder exchangeFinder = this.H;
        Intrinsics.f(exchangeFinder);
        Exchange exchange = new Exchange(this, this.D, exchangeFinder, exchangeFinder.a(this.f42930z, realInterceptorChain));
        this.K = exchange;
        this.P = exchange;
        synchronized (this) {
            this.L = true;
            this.M = true;
        }
        if (!this.O) {
            return exchange;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[Catch:{ all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException u(okhttp3.internal.connection.Exchange r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            okhttp3.internal.connection.Exchange r0 = r1.P
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r0)
            if (r2 != 0) goto L_0x000e
            return r5
        L_0x000e:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L_0x0019
            boolean r0 = r1.L     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0019
        L_0x0017:
            r2 = move-exception
            goto L_0x0059
        L_0x0019:
            if (r4 == 0) goto L_0x0041
            boolean r0 = r1.M     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0041
        L_0x001f:
            if (r3 == 0) goto L_0x0023
            r1.L = r2     // Catch:{ all -> 0x0017 }
        L_0x0023:
            if (r4 == 0) goto L_0x0027
            r1.M = r2     // Catch:{ all -> 0x0017 }
        L_0x0027:
            boolean r3 = r1.L     // Catch:{ all -> 0x0017 }
            r4 = 1
            if (r3 != 0) goto L_0x0032
            boolean r0 = r1.M     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0032
            r0 = r4
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.M     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.N     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            r2 = r4
        L_0x003e:
            r3 = r2
            r2 = r0
            goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            kotlin.Unit r4 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0051
            r2 = 0
            r1.P = r2
            okhttp3.internal.connection.RealConnection r2 = r1.I
            if (r2 == 0) goto L_0x0051
            r2.t()
        L_0x0051:
            if (r3 == 0) goto L_0x0058
            java.io.IOException r2 = r1.f(r5)
            return r2
        L_0x0058:
            return r5
        L_0x0059:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.u(okhttp3.internal.connection.Exchange, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException v(IOException iOException) {
        boolean z2;
        synchronized (this) {
            try {
                z2 = false;
                if (this.N) {
                    this.N = false;
                    if (!this.L && !this.M) {
                        z2 = true;
                    }
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2 ? f(iOException) : iOException;
    }

    public final String w() {
        return this.f42928A.k().q();
    }

    public final Socket x() {
        RealConnection realConnection = this.I;
        Intrinsics.f(realConnection);
        if (!Util.f42805h || Thread.holdsLock(realConnection)) {
            List o2 = realConnection.o();
            Iterator it = o2.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (Intrinsics.d(((Reference) it.next()).get(), this)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                o2.remove(i2);
                this.I = null;
                if (o2.isEmpty()) {
                    realConnection.D(System.nanoTime());
                    if (this.C.c(realConnection)) {
                        return realConnection.F();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }

    public final boolean y() {
        ExchangeFinder exchangeFinder = this.H;
        Intrinsics.f(exchangeFinder);
        return exchangeFinder.e();
    }

    public final void z(RealConnection realConnection) {
        this.Q = realConnection;
    }
}
