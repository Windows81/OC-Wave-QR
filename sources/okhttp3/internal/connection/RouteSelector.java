package okhttp3.internal.connection;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

@Metadata
public final class RouteSelector {

    /* renamed from: i  reason: collision with root package name */
    public static final Companion f42969i = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Address f42970a;

    /* renamed from: b  reason: collision with root package name */
    public final RouteDatabase f42971b;

    /* renamed from: c  reason: collision with root package name */
    public final Call f42972c;

    /* renamed from: d  reason: collision with root package name */
    public final EventListener f42973d;

    /* renamed from: e  reason: collision with root package name */
    public List f42974e = CollectionsKt.m();

    /* renamed from: f  reason: collision with root package name */
    public int f42975f;

    /* renamed from: g  reason: collision with root package name */
    public List f42976g = CollectionsKt.m();

    /* renamed from: h  reason: collision with root package name */
    public final List f42977h = new ArrayList();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            Intrinsics.i(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.h(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.h(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Selection {

        /* renamed from: a  reason: collision with root package name */
        public final List f42978a;

        /* renamed from: b  reason: collision with root package name */
        public int f42979b;

        public Selection(List list) {
            Intrinsics.i(list, "routes");
            this.f42978a = list;
        }

        public final List a() {
            return this.f42978a;
        }

        public final boolean b() {
            return this.f42979b < this.f42978a.size();
        }

        public final Route c() {
            if (b()) {
                List list = this.f42978a;
                int i2 = this.f42979b;
                this.f42979b = i2 + 1;
                return (Route) list.get(i2);
            }
            throw new NoSuchElementException();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        Intrinsics.i(address, "address");
        Intrinsics.i(routeDatabase, "routeDatabase");
        Intrinsics.i(call, "call");
        Intrinsics.i(eventListener, "eventListener");
        this.f42970a = address;
        this.f42971b = routeDatabase;
        this.f42972c = call;
        this.f42973d = eventListener;
        f(address.l(), address.g());
    }

    public static final List g(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        if (proxy != null) {
            return CollectionsKt.e(proxy);
        }
        URI t2 = httpUrl.t();
        if (t2.getHost() == null) {
            return Util.w(Proxy.NO_PROXY);
        }
        List<Proxy> select = routeSelector.f42970a.i().select(t2);
        Collection collection = select;
        if (collection == null || collection.isEmpty()) {
            return Util.w(Proxy.NO_PROXY);
        }
        Intrinsics.h(select, "proxiesOrNull");
        return Util.V(select);
    }

    public final boolean a() {
        return b() || !this.f42977h.isEmpty();
    }

    public final boolean b() {
        return this.f42975f < this.f42974e.size();
    }

    public final Selection c() {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (b()) {
                Proxy d2 = d();
                for (InetSocketAddress route : this.f42976g) {
                    Route route2 = new Route(this.f42970a, d2, route);
                    if (this.f42971b.c(route2)) {
                        this.f42977h.add(route2);
                    } else {
                        arrayList.add(route2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                CollectionsKt.B(arrayList, this.f42977h);
                this.f42977h.clear();
            }
            return new Selection(arrayList);
        }
        throw new NoSuchElementException();
    }

    public final Proxy d() {
        if (b()) {
            List list = this.f42974e;
            int i2 = this.f42975f;
            this.f42975f = i2 + 1;
            Proxy proxy = (Proxy) list.get(i2);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f42970a.l().i() + "; exhausted proxy configurations: " + this.f42974e);
    }

    public final void e(Proxy proxy) {
        String str;
        int i2;
        List<InetAddress> list;
        ArrayList arrayList = new ArrayList();
        this.f42976g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f42970a.l().i();
            i2 = this.f42970a.l().o();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                Companion companion = f42969i;
                Intrinsics.h(address, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = companion.a(inetSocketAddress);
                i2 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        }
        if (1 > i2 || i2 >= 65536) {
            throw new SocketException("No route to " + str + ':' + i2 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i2));
        } else {
            if (Util.i(str)) {
                list = CollectionsKt.e(InetAddress.getByName(str));
            } else {
                this.f42973d.n(this.f42972c, str);
                list = this.f42970a.c().a(str);
                if (!list.isEmpty()) {
                    this.f42973d.m(this.f42972c, str, list);
                } else {
                    throw new UnknownHostException(this.f42970a.c() + " returned no addresses for " + str);
                }
            }
            for (InetAddress inetSocketAddress2 : list) {
                arrayList.add(new InetSocketAddress(inetSocketAddress2, i2));
            }
        }
    }

    public final void f(HttpUrl httpUrl, Proxy proxy) {
        this.f42973d.p(this.f42972c, httpUrl);
        List g2 = g(proxy, httpUrl, this);
        this.f42974e = g2;
        this.f42975f = 0;
        this.f42973d.o(this.f42972c, httpUrl, g2);
    }
}
