package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Route {

    /* renamed from: a  reason: collision with root package name */
    public final Address f42792a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f42793b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f42794c;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Intrinsics.i(address, "address");
        Intrinsics.i(proxy, "proxy");
        Intrinsics.i(inetSocketAddress, "socketAddress");
        this.f42792a = address;
        this.f42793b = proxy;
        this.f42794c = inetSocketAddress;
    }

    public final Address a() {
        return this.f42792a;
    }

    public final Proxy b() {
        return this.f42793b;
    }

    public final boolean c() {
        return this.f42792a.k() != null && this.f42793b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f42794c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            return Intrinsics.d(route.f42792a, this.f42792a) && Intrinsics.d(route.f42793b, this.f42793b) && Intrinsics.d(route.f42794c, this.f42794c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f42792a.hashCode()) * 31) + this.f42793b.hashCode()) * 31) + this.f42794c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f42794c + '}';
    }
}
