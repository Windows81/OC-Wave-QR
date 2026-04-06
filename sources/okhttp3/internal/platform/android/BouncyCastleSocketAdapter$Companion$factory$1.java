package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

@Metadata
public final class BouncyCastleSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    public boolean b(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        boolean b2 = BouncyCastlePlatform.f43179e.b();
        return false;
    }

    public SocketAdapter c(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        return new BouncyCastleSocketAdapter();
    }
}
