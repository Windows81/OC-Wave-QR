package okhttp3.logging;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

@Metadata
public final class LoggingEventListener extends EventListener {

    /* renamed from: c  reason: collision with root package name */
    public final HttpLoggingInterceptor.Logger f43314c;

    /* renamed from: d  reason: collision with root package name */
    public long f43315d;

    @Metadata
    public static class Factory implements EventListener.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final HttpLoggingInterceptor.Logger f43316a;

        public EventListener a(Call call) {
            Intrinsics.i(call, "call");
            return new LoggingEventListener(this.f43316a, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger);
    }

    public void A(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "response");
        D("satisfactionFailure: " + response);
    }

    public void B(Call call, Handshake handshake) {
        Intrinsics.i(call, "call");
        D("secureConnectEnd: " + handshake);
    }

    public void C(Call call) {
        Intrinsics.i(call, "call");
        D("secureConnectStart");
    }

    public final void D(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f43315d);
        HttpLoggingInterceptor.Logger logger = this.f43314c;
        logger.a('[' + millis + " ms] " + str);
    }

    public void a(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "cachedResponse");
        D("cacheConditionalHit: " + response);
    }

    public void b(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "response");
        D("cacheHit: " + response);
    }

    public void c(Call call) {
        Intrinsics.i(call, "call");
        D("cacheMiss");
    }

    public void d(Call call) {
        Intrinsics.i(call, "call");
        D("callEnd");
    }

    public void e(Call call, IOException iOException) {
        Intrinsics.i(call, "call");
        Intrinsics.i(iOException, "ioe");
        D("callFailed: " + iOException);
    }

    public void f(Call call) {
        Intrinsics.i(call, "call");
        this.f43315d = System.nanoTime();
        D("callStart: " + call.m());
    }

    public void g(Call call) {
        Intrinsics.i(call, "call");
        D("canceled");
    }

    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.i(call, "call");
        Intrinsics.i(inetSocketAddress, "inetSocketAddress");
        Intrinsics.i(proxy, "proxy");
        D("connectEnd: " + protocol);
    }

    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        Intrinsics.i(call, "call");
        Intrinsics.i(inetSocketAddress, "inetSocketAddress");
        Intrinsics.i(proxy, "proxy");
        Intrinsics.i(iOException, "ioe");
        D("connectFailed: " + protocol + ' ' + iOException);
    }

    public void j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.i(call, "call");
        Intrinsics.i(inetSocketAddress, "inetSocketAddress");
        Intrinsics.i(proxy, "proxy");
        D("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    public void k(Call call, Connection connection) {
        Intrinsics.i(call, "call");
        Intrinsics.i(connection, "connection");
        D("connectionAcquired: " + connection);
    }

    public void l(Call call, Connection connection) {
        Intrinsics.i(call, "call");
        Intrinsics.i(connection, "connection");
        D("connectionReleased");
    }

    public void m(Call call, String str, List list) {
        Intrinsics.i(call, "call");
        Intrinsics.i(str, "domainName");
        Intrinsics.i(list, "inetAddressList");
        D("dnsEnd: " + list);
    }

    public void n(Call call, String str) {
        Intrinsics.i(call, "call");
        Intrinsics.i(str, "domainName");
        D("dnsStart: " + str);
    }

    public void o(Call call, HttpUrl httpUrl, List list) {
        Intrinsics.i(call, "call");
        Intrinsics.i(httpUrl, "url");
        Intrinsics.i(list, "proxies");
        D("proxySelectEnd: " + list);
    }

    public void p(Call call, HttpUrl httpUrl) {
        Intrinsics.i(call, "call");
        Intrinsics.i(httpUrl, "url");
        D("proxySelectStart: " + httpUrl);
    }

    public void q(Call call, long j2) {
        Intrinsics.i(call, "call");
        D("requestBodyEnd: byteCount=" + j2);
    }

    public void r(Call call) {
        Intrinsics.i(call, "call");
        D("requestBodyStart");
    }

    public void s(Call call, IOException iOException) {
        Intrinsics.i(call, "call");
        Intrinsics.i(iOException, "ioe");
        D("requestFailed: " + iOException);
    }

    public void t(Call call, Request request) {
        Intrinsics.i(call, "call");
        Intrinsics.i(request, "request");
        D("requestHeadersEnd");
    }

    public void u(Call call) {
        Intrinsics.i(call, "call");
        D("requestHeadersStart");
    }

    public void v(Call call, long j2) {
        Intrinsics.i(call, "call");
        D("responseBodyEnd: byteCount=" + j2);
    }

    public void w(Call call) {
        Intrinsics.i(call, "call");
        D("responseBodyStart");
    }

    public void x(Call call, IOException iOException) {
        Intrinsics.i(call, "call");
        Intrinsics.i(iOException, "ioe");
        D("responseFailed: " + iOException);
    }

    public void y(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "response");
        D("responseHeadersEnd: " + response);
    }

    public void z(Call call) {
        Intrinsics.i(call, "call");
        D("responseHeadersStart");
    }

    public LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.f43314c = logger;
    }
}
