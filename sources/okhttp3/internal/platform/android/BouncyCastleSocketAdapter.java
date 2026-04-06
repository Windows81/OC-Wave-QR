package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

@Metadata
public final class BouncyCastleSocketAdapter implements SocketAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f43219a = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final DeferredSocketAdapter.Factory f43220b = new BouncyCastleSocketAdapter$Companion$factory$1();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DeferredSocketAdapter.Factory a() {
            return BouncyCastleSocketAdapter.f43220b;
        }

        public Companion() {
        }
    }

    public boolean a() {
        return BouncyCastlePlatform.f43179e.b();
    }

    public boolean b(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        return false;
    }

    public String c(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.d(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.i(sSLSocket, "sslSocket");
        Intrinsics.i(list, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) Platform.f43200a.b(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
