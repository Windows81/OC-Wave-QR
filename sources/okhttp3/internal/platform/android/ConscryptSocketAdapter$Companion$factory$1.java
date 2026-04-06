package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

@Metadata
public final class ConscryptSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    public boolean b(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        return ConscryptPlatform.f43182e.c() && Conscrypt.isConscrypt(sSLSocket);
    }

    public SocketAdapter c(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        return new ConscryptSocketAdapter();
    }
}
