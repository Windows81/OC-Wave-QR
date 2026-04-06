package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

@Metadata
public final class ExchangeFinder {

    /* renamed from: a  reason: collision with root package name */
    public final RealConnectionPool f42918a;

    /* renamed from: b  reason: collision with root package name */
    public final Address f42919b;

    /* renamed from: c  reason: collision with root package name */
    public final RealCall f42920c;

    /* renamed from: d  reason: collision with root package name */
    public final EventListener f42921d;

    /* renamed from: e  reason: collision with root package name */
    public RouteSelector.Selection f42922e;

    /* renamed from: f  reason: collision with root package name */
    public RouteSelector f42923f;

    /* renamed from: g  reason: collision with root package name */
    public int f42924g;

    /* renamed from: h  reason: collision with root package name */
    public int f42925h;

    /* renamed from: i  reason: collision with root package name */
    public int f42926i;

    /* renamed from: j  reason: collision with root package name */
    public Route f42927j;

    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
        Intrinsics.i(realConnectionPool, "connectionPool");
        Intrinsics.i(address, "address");
        Intrinsics.i(realCall, "call");
        Intrinsics.i(eventListener, "eventListener");
        this.f42918a = realConnectionPool;
        this.f42919b = address;
        this.f42920c = realCall;
        this.f42921d = eventListener;
    }

    public final ExchangeCodec a(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) {
        Intrinsics.i(okHttpClient, "client");
        Intrinsics.i(realInterceptorChain, "chain");
        try {
            return c(realInterceptorChain.h(), realInterceptorChain.j(), realInterceptorChain.l(), okHttpClient.G(), okHttpClient.M(), !Intrinsics.d(realInterceptorChain.k().h(), "GET")).x(okHttpClient, realInterceptorChain);
        } catch (RouteException e2) {
            h(e2.c());
            throw e2;
        } catch (IOException e3) {
            h(e3);
            throw new RouteException(e3);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.connection.RealConnection b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r1 = r14
            okhttp3.internal.connection.RealCall r0 = r1.f42920c
            boolean r0 = r0.A()
            if (r0 != 0) goto L_0x0171
            okhttp3.internal.connection.RealCall r0 = r1.f42920c
            okhttp3.internal.connection.RealConnection r2 = r0.n()
            r3 = 0
            if (r2 == 0) goto L_0x005b
            monitor-enter(r2)
            boolean r0 = r2.q()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0030
            okhttp3.Route r0 = r2.B()     // Catch:{ all -> 0x002e }
            okhttp3.Address r0 = r0.a()     // Catch:{ all -> 0x002e }
            okhttp3.HttpUrl r0 = r0.l()     // Catch:{ all -> 0x002e }
            boolean r0 = r14.g(r0)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            r0 = r3
            goto L_0x0036
        L_0x002e:
            r0 = move-exception
            goto L_0x0059
        L_0x0030:
            okhttp3.internal.connection.RealCall r0 = r1.f42920c     // Catch:{ all -> 0x002e }
            java.net.Socket r0 = r0.x()     // Catch:{ all -> 0x002e }
        L_0x0036:
            kotlin.Unit r4 = kotlin.Unit.f40552a     // Catch:{ all -> 0x002e }
            monitor-exit(r2)
            okhttp3.internal.connection.RealCall r4 = r1.f42920c
            okhttp3.internal.connection.RealConnection r4 = r4.n()
            if (r4 == 0) goto L_0x004c
            if (r0 != 0) goto L_0x0044
            return r2
        L_0x0044:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x004c:
            if (r0 == 0) goto L_0x0051
            okhttp3.internal.Util.n(r0)
        L_0x0051:
            okhttp3.EventListener r0 = r1.f42921d
            okhttp3.internal.connection.RealCall r4 = r1.f42920c
            r0.l(r4, r2)
            goto L_0x005b
        L_0x0059:
            monitor-exit(r2)
            throw r0
        L_0x005b:
            r0 = 0
            r1.f42924g = r0
            r1.f42925h = r0
            r1.f42926i = r0
            okhttp3.internal.connection.RealConnectionPool r2 = r1.f42918a
            okhttp3.Address r4 = r1.f42919b
            okhttp3.internal.connection.RealCall r5 = r1.f42920c
            boolean r2 = r2.a(r4, r5, r3, r0)
            if (r2 == 0) goto L_0x007f
            okhttp3.internal.connection.RealCall r0 = r1.f42920c
            okhttp3.internal.connection.RealConnection r0 = r0.n()
            kotlin.jvm.internal.Intrinsics.f(r0)
            okhttp3.EventListener r2 = r1.f42921d
            okhttp3.internal.connection.RealCall r3 = r1.f42920c
            r2.k(r3, r0)
            return r0
        L_0x007f:
            okhttp3.Route r2 = r1.f42927j
            if (r2 == 0) goto L_0x008a
            kotlin.jvm.internal.Intrinsics.f(r2)
            r1.f42927j = r3
        L_0x0088:
            r4 = r3
            goto L_0x00ef
        L_0x008a:
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.f42922e
            if (r2 == 0) goto L_0x00a1
            kotlin.jvm.internal.Intrinsics.f(r2)
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x00a1
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.f42922e
            kotlin.jvm.internal.Intrinsics.f(r0)
            okhttp3.Route r2 = r0.c()
            goto L_0x0088
        L_0x00a1:
            okhttp3.internal.connection.RouteSelector r2 = r1.f42923f
            if (r2 != 0) goto L_0x00bc
            okhttp3.internal.connection.RouteSelector r2 = new okhttp3.internal.connection.RouteSelector
            okhttp3.Address r4 = r1.f42919b
            okhttp3.internal.connection.RealCall r5 = r1.f42920c
            okhttp3.OkHttpClient r5 = r5.l()
            okhttp3.internal.connection.RouteDatabase r5 = r5.v()
            okhttp3.internal.connection.RealCall r6 = r1.f42920c
            okhttp3.EventListener r7 = r1.f42921d
            r2.<init>(r4, r5, r6, r7)
            r1.f42923f = r2
        L_0x00bc:
            okhttp3.internal.connection.RouteSelector$Selection r2 = r2.c()
            r1.f42922e = r2
            java.util.List r4 = r2.a()
            okhttp3.internal.connection.RealCall r5 = r1.f42920c
            boolean r5 = r5.A()
            if (r5 != 0) goto L_0x0169
            okhttp3.internal.connection.RealConnectionPool r5 = r1.f42918a
            okhttp3.Address r6 = r1.f42919b
            okhttp3.internal.connection.RealCall r7 = r1.f42920c
            boolean r0 = r5.a(r6, r7, r4, r0)
            if (r0 == 0) goto L_0x00eb
            okhttp3.internal.connection.RealCall r0 = r1.f42920c
            okhttp3.internal.connection.RealConnection r0 = r0.n()
            kotlin.jvm.internal.Intrinsics.f(r0)
            okhttp3.EventListener r2 = r1.f42921d
            okhttp3.internal.connection.RealCall r3 = r1.f42920c
            r2.k(r3, r0)
            return r0
        L_0x00eb:
            okhttp3.Route r2 = r2.c()
        L_0x00ef:
            okhttp3.internal.connection.RealConnection r13 = new okhttp3.internal.connection.RealConnection
            okhttp3.internal.connection.RealConnectionPool r0 = r1.f42918a
            r13.<init>(r0, r2)
            okhttp3.internal.connection.RealCall r0 = r1.f42920c
            r0.z(r13)
            okhttp3.internal.connection.RealCall r11 = r1.f42920c     // Catch:{ all -> 0x0162 }
            okhttp3.EventListener r12 = r1.f42921d     // Catch:{ all -> 0x0162 }
            r5 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r5.g(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0162 }
            okhttp3.internal.connection.RealCall r0 = r1.f42920c
            r0.z(r3)
            okhttp3.internal.connection.RealCall r0 = r1.f42920c
            okhttp3.OkHttpClient r0 = r0.l()
            okhttp3.internal.connection.RouteDatabase r0 = r0.v()
            okhttp3.Route r3 = r13.B()
            r0.a(r3)
            okhttp3.internal.connection.RealConnectionPool r0 = r1.f42918a
            okhttp3.Address r3 = r1.f42919b
            okhttp3.internal.connection.RealCall r5 = r1.f42920c
            r6 = 1
            boolean r0 = r0.a(r3, r5, r4, r6)
            if (r0 == 0) goto L_0x0149
            okhttp3.internal.connection.RealCall r0 = r1.f42920c
            okhttp3.internal.connection.RealConnection r0 = r0.n()
            kotlin.jvm.internal.Intrinsics.f(r0)
            r1.f42927j = r2
            java.net.Socket r2 = r13.F()
            okhttp3.internal.Util.n(r2)
            okhttp3.EventListener r2 = r1.f42921d
            okhttp3.internal.connection.RealCall r3 = r1.f42920c
            r2.k(r3, r0)
            return r0
        L_0x0149:
            monitor-enter(r13)
            okhttp3.internal.connection.RealConnectionPool r0 = r1.f42918a     // Catch:{ all -> 0x015f }
            r0.e(r13)     // Catch:{ all -> 0x015f }
            okhttp3.internal.connection.RealCall r0 = r1.f42920c     // Catch:{ all -> 0x015f }
            r0.e(r13)     // Catch:{ all -> 0x015f }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x015f }
            monitor-exit(r13)
            okhttp3.EventListener r0 = r1.f42921d
            okhttp3.internal.connection.RealCall r2 = r1.f42920c
            r0.k(r2, r13)
            return r13
        L_0x015f:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0162:
            r0 = move-exception
            okhttp3.internal.connection.RealCall r2 = r1.f42920c
            r2.z(r3)
            throw r0
        L_0x0169:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0171:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.b(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final RealConnection c(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        while (true) {
            RealConnection b2 = b(i2, i3, i4, i5, z2);
            if (b2.v(z3)) {
                return b2;
            }
            b2.A();
            if (this.f42927j == null) {
                RouteSelector.Selection selection = this.f42922e;
                boolean z4 = true;
                if (selection != null ? selection.b() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.f42923f;
                    if (routeSelector != null) {
                        z4 = routeSelector.a();
                    }
                    if (!z4) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    public final Address d() {
        return this.f42919b;
    }

    public final boolean e() {
        RouteSelector routeSelector;
        if (this.f42924g == 0 && this.f42925h == 0 && this.f42926i == 0) {
            return false;
        }
        if (this.f42927j != null) {
            return true;
        }
        Route f2 = f();
        if (f2 != null) {
            this.f42927j = f2;
            return true;
        }
        RouteSelector.Selection selection = this.f42922e;
        if ((selection == null || !selection.b()) && (routeSelector = this.f42923f) != null) {
            return routeSelector.a();
        }
        return true;
    }

    public final Route f() {
        RealConnection n2;
        if (this.f42924g > 1 || this.f42925h > 1 || this.f42926i > 0 || (n2 = this.f42920c.n()) == null) {
            return null;
        }
        synchronized (n2) {
            if (n2.r() != 0) {
                return null;
            }
            if (!Util.j(n2.B().a().l(), this.f42919b.l())) {
                return null;
            }
            Route B2 = n2.B();
            return B2;
        }
    }

    public final boolean g(HttpUrl httpUrl) {
        Intrinsics.i(httpUrl, "url");
        HttpUrl l2 = this.f42919b.l();
        return httpUrl.o() == l2.o() && Intrinsics.d(httpUrl.i(), l2.i());
    }

    public final void h(IOException iOException) {
        Intrinsics.i(iOException, "e");
        this.f42927j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f43168z == ErrorCode.REFUSED_STREAM) {
            this.f42924g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f42925h++;
        } else {
            this.f42926i++;
        }
    }
}
