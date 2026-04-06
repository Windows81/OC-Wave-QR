package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DeferredSocketAdapter implements SocketAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Factory f43227a;

    /* renamed from: b  reason: collision with root package name */
    public SocketAdapter f43228b;

    @Metadata
    public interface Factory {
        boolean b(SSLSocket sSLSocket);

        SocketAdapter c(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory factory) {
        Intrinsics.i(factory, "socketAdapterFactory");
        this.f43227a = factory;
    }

    public boolean a() {
        return true;
    }

    public boolean b(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        return this.f43227a.b(sSLSocket);
    }

    public String c(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        SocketAdapter e2 = e(sSLSocket);
        if (e2 != null) {
            return e2.c(sSLSocket);
        }
        return null;
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.i(sSLSocket, "sslSocket");
        Intrinsics.i(list, "protocols");
        SocketAdapter e2 = e(sSLSocket);
        if (e2 != null) {
            e2.d(sSLSocket, str, list);
        }
    }

    public final synchronized SocketAdapter e(SSLSocket sSLSocket) {
        try {
            if (this.f43228b == null && this.f43227a.b(sSLSocket)) {
                this.f43228b = this.f43227a.c(sSLSocket);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f43228b;
    }
}
