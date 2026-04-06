package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class EventListener {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f42637a = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final EventListener f42638b = new EventListener$Companion$NONE$1();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public interface Factory {
        EventListener a(Call call);
    }

    public void A(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "response");
    }

    public void B(Call call, Handshake handshake) {
        Intrinsics.i(call, "call");
    }

    public void C(Call call) {
        Intrinsics.i(call, "call");
    }

    public void a(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "cachedResponse");
    }

    public void b(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "response");
    }

    public void c(Call call) {
        Intrinsics.i(call, "call");
    }

    public void d(Call call) {
        Intrinsics.i(call, "call");
    }

    public void e(Call call, IOException iOException) {
        Intrinsics.i(call, "call");
        Intrinsics.i(iOException, "ioe");
    }

    public void f(Call call) {
        Intrinsics.i(call, "call");
    }

    public void g(Call call) {
        Intrinsics.i(call, "call");
    }

    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.i(call, "call");
        Intrinsics.i(inetSocketAddress, "inetSocketAddress");
        Intrinsics.i(proxy, "proxy");
    }

    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        Intrinsics.i(call, "call");
        Intrinsics.i(inetSocketAddress, "inetSocketAddress");
        Intrinsics.i(proxy, "proxy");
        Intrinsics.i(iOException, "ioe");
    }

    public void j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.i(call, "call");
        Intrinsics.i(inetSocketAddress, "inetSocketAddress");
        Intrinsics.i(proxy, "proxy");
    }

    public void k(Call call, Connection connection) {
        Intrinsics.i(call, "call");
        Intrinsics.i(connection, "connection");
    }

    public void l(Call call, Connection connection) {
        Intrinsics.i(call, "call");
        Intrinsics.i(connection, "connection");
    }

    public void m(Call call, String str, List list) {
        Intrinsics.i(call, "call");
        Intrinsics.i(str, "domainName");
        Intrinsics.i(list, "inetAddressList");
    }

    public void n(Call call, String str) {
        Intrinsics.i(call, "call");
        Intrinsics.i(str, "domainName");
    }

    public void o(Call call, HttpUrl httpUrl, List list) {
        Intrinsics.i(call, "call");
        Intrinsics.i(httpUrl, "url");
        Intrinsics.i(list, "proxies");
    }

    public void p(Call call, HttpUrl httpUrl) {
        Intrinsics.i(call, "call");
        Intrinsics.i(httpUrl, "url");
    }

    public void q(Call call, long j2) {
        Intrinsics.i(call, "call");
    }

    public void r(Call call) {
        Intrinsics.i(call, "call");
    }

    public void s(Call call, IOException iOException) {
        Intrinsics.i(call, "call");
        Intrinsics.i(iOException, "ioe");
    }

    public void t(Call call, Request request) {
        Intrinsics.i(call, "call");
        Intrinsics.i(request, "request");
    }

    public void u(Call call) {
        Intrinsics.i(call, "call");
    }

    public void v(Call call, long j2) {
        Intrinsics.i(call, "call");
    }

    public void w(Call call) {
        Intrinsics.i(call, "call");
    }

    public void x(Call call, IOException iOException) {
        Intrinsics.i(call, "call");
        Intrinsics.i(iOException, "ioe");
    }

    public void y(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "response");
    }

    public void z(Call call) {
        Intrinsics.i(call, "call");
    }
}
