package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

@Metadata
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f43218a;

    public AndroidSocketAdapter$Companion$factory$1(String str) {
        this.f43218a = str;
    }

    public boolean b(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        Intrinsics.h(name, "sslSocket.javaClass.name");
        return StringsKt.Q(name, this.f43218a + '.', false, 2, (Object) null);
    }

    public SocketAdapter c(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        return AndroidSocketAdapter.f43211f.b(sSLSocket.getClass());
    }
}
