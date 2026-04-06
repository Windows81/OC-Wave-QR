package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

@Metadata
public final class ConscryptSocketAdapter implements SocketAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f43225a = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final DeferredSocketAdapter.Factory f43226b = new ConscryptSocketAdapter$Companion$factory$1();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DeferredSocketAdapter.Factory a() {
            return ConscryptSocketAdapter.f43226b;
        }

        public Companion() {
        }
    }

    public boolean a() {
        return ConscryptPlatform.f43182e.c();
    }

    public boolean b(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public String c(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.i(sSLSocket, "sslSocket");
        Intrinsics.i(list, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Platform.f43200a.b(list).toArray(new String[0]));
        }
    }
}
