package okhttp3.internal.http;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

@Metadata
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a  reason: collision with root package name */
    public final RealCall f42989a;

    /* renamed from: b  reason: collision with root package name */
    public final List f42990b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42991c;

    /* renamed from: d  reason: collision with root package name */
    public final Exchange f42992d;

    /* renamed from: e  reason: collision with root package name */
    public final Request f42993e;

    /* renamed from: f  reason: collision with root package name */
    public final int f42994f;

    /* renamed from: g  reason: collision with root package name */
    public final int f42995g;

    /* renamed from: h  reason: collision with root package name */
    public final int f42996h;

    /* renamed from: i  reason: collision with root package name */
    public int f42997i;

    public RealInterceptorChain(RealCall realCall, List list, int i2, Exchange exchange, Request request, int i3, int i4, int i5) {
        Intrinsics.i(realCall, "call");
        Intrinsics.i(list, "interceptors");
        Intrinsics.i(request, "request");
        this.f42989a = realCall;
        this.f42990b = list;
        this.f42991c = i2;
        this.f42992d = exchange;
        this.f42993e = request;
        this.f42994f = i3;
        this.f42995g = i4;
        this.f42996h = i5;
    }

    public static /* synthetic */ RealInterceptorChain f(RealInterceptorChain realInterceptorChain, int i2, Exchange exchange, Request request, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = realInterceptorChain.f42991c;
        }
        if ((i6 & 2) != 0) {
            exchange = realInterceptorChain.f42992d;
        }
        Exchange exchange2 = exchange;
        if ((i6 & 4) != 0) {
            request = realInterceptorChain.f42993e;
        }
        Request request2 = request;
        if ((i6 & 8) != 0) {
            i3 = realInterceptorChain.f42994f;
        }
        int i7 = i3;
        if ((i6 & 16) != 0) {
            i4 = realInterceptorChain.f42995g;
        }
        int i8 = i4;
        if ((i6 & 32) != 0) {
            i5 = realInterceptorChain.f42996h;
        }
        return realInterceptorChain.e(i2, exchange2, request2, i7, i8, i5);
    }

    public Interceptor.Chain a(int i2, TimeUnit timeUnit) {
        Intrinsics.i(timeUnit, "unit");
        if (this.f42992d == null) {
            return f(this, 0, (Exchange) null, (Request) null, Util.k("connectTimeout", (long) i2, timeUnit), 0, 0, 55, (Object) null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    public Response b(Request request) {
        Intrinsics.i(request, "request");
        if (this.f42991c < this.f42990b.size()) {
            this.f42997i++;
            Exchange exchange = this.f42992d;
            if (exchange != null) {
                if (!exchange.j().g(request.k())) {
                    throw new IllegalStateException(("network interceptor " + this.f42990b.get(this.f42991c - 1) + " must retain the same host and port").toString());
                } else if (this.f42997i != 1) {
                    throw new IllegalStateException(("network interceptor " + this.f42990b.get(this.f42991c - 1) + " must call proceed() exactly once").toString());
                }
            }
            RealInterceptorChain f2 = f(this, this.f42991c + 1, (Exchange) null, request, 0, 0, 0, 58, (Object) null);
            Interceptor interceptor = (Interceptor) this.f42990b.get(this.f42991c);
            Response intercept = interceptor.intercept(f2);
            if (intercept == null) {
                throw new NullPointerException("interceptor " + interceptor + " returned null");
            } else if (this.f42992d != null && this.f42991c + 1 < this.f42990b.size() && f2.f42997i != 1) {
                throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
            } else if (intercept.a() != null) {
                return intercept;
            } else {
                throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
            }
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public Connection c() {
        Exchange exchange = this.f42992d;
        if (exchange != null) {
            return exchange.h();
        }
        return null;
    }

    public Call call() {
        return this.f42989a;
    }

    public Interceptor.Chain d(int i2, TimeUnit timeUnit) {
        Intrinsics.i(timeUnit, "unit");
        if (this.f42992d == null) {
            return f(this, 0, (Exchange) null, (Request) null, 0, Util.k("readTimeout", (long) i2, timeUnit), 0, 47, (Object) null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    public final RealInterceptorChain e(int i2, Exchange exchange, Request request, int i3, int i4, int i5) {
        Intrinsics.i(request, "request");
        return new RealInterceptorChain(this.f42989a, this.f42990b, i2, exchange, request, i3, i4, i5);
    }

    public final RealCall g() {
        return this.f42989a;
    }

    public final int h() {
        return this.f42994f;
    }

    public final Exchange i() {
        return this.f42992d;
    }

    public final int j() {
        return this.f42995g;
    }

    public final Request k() {
        return this.f42993e;
    }

    public final int l() {
        return this.f42996h;
    }

    public Request m() {
        return this.f42993e;
    }

    public int n() {
        return this.f42995g;
    }
}
