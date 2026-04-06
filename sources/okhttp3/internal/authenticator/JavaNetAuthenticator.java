package okhttp3.internal.authenticator;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

@Metadata
public final class JavaNetAuthenticator implements Authenticator {

    /* renamed from: d  reason: collision with root package name */
    public final Dns f42807d;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42808a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f42808a = iArr;
        }
    }

    public JavaNetAuthenticator(Dns dns) {
        Intrinsics.i(dns, "defaultDns");
        this.f42807d = dns;
    }

    public Request a(Route route, Response response) {
        Proxy proxy;
        Dns dns;
        PasswordAuthentication passwordAuthentication;
        Address a2;
        Intrinsics.i(response, "response");
        List<Challenge> d2 = response.d();
        Request E = response.E();
        HttpUrl k2 = E.k();
        boolean z2 = response.f() == 407;
        if (route == null || (proxy = route.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : d2) {
            if (StringsKt.B("Basic", challenge.c(), true)) {
                if (route == null || (a2 = route.a()) == null || (dns = a2.c()) == null) {
                    dns = this.f42807d;
                }
                if (z2) {
                    SocketAddress address = proxy.address();
                    Intrinsics.g(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.h(proxy, "proxy");
                    passwordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, b(proxy, k2, dns), inetSocketAddress.getPort(), k2.s(), challenge.b(), challenge.c(), k2.u(), Authenticator.RequestorType.PROXY);
                } else {
                    String i2 = k2.i();
                    Intrinsics.h(proxy, "proxy");
                    passwordAuthentication = java.net.Authenticator.requestPasswordAuthentication(i2, b(proxy, k2, dns), k2.o(), k2.s(), challenge.b(), challenge.c(), k2.u(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z2 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthentication.getUserName();
                    Intrinsics.h(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    Intrinsics.h(password, "auth.password");
                    return E.i().d(str, Credentials.a(userName, new String(password), challenge.a())).b();
                }
            }
        }
        return null;
    }

    public final InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.f42808a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.e0(dns.a(httpUrl.i()));
        }
        SocketAddress address = proxy.address();
        Intrinsics.g(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        Intrinsics.h(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dns.f42635b : dns);
    }
}
