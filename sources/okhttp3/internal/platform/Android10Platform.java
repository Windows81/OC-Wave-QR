package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata
public final class Android10Platform extends Platform {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f43170e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f43171f = (Platform.f43200a.h() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: d  reason: collision with root package name */
    public final List f43172d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Platform a() {
            if (b()) {
                return new Android10Platform();
            }
            return null;
        }

        public final boolean b() {
            return Android10Platform.f43171f;
        }

        public Companion() {
        }
    }

    public Android10Platform() {
        SocketAdapter[] socketAdapterArr = {Android10SocketAdapter.f43203a.a(), new DeferredSocketAdapter(AndroidSocketAdapter.f43211f.d()), new DeferredSocketAdapter(ConscryptSocketAdapter.f43225a.a()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.f43219a.a())};
        ArrayList arrayList = new ArrayList();
        for (Object next : CollectionsKt.r(socketAdapterArr)) {
            if (((SocketAdapter) next).a()) {
                arrayList.add(next);
            }
        }
        this.f43172d = arrayList;
    }

    public CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        Intrinsics.i(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner a2 = AndroidCertificateChainCleaner.f43204d.a(x509TrustManager);
        return a2 != null ? a2 : super.c(x509TrustManager);
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Intrinsics.i(sSLSocket, "sslSocket");
        Intrinsics.i(list, "protocols");
        Iterator it = this.f43172d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).b(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.d(sSLSocket, str, list);
        }
    }

    public String h(SSLSocket sSLSocket) {
        Object obj;
        Intrinsics.i(sSLSocket, "sslSocket");
        Iterator it = this.f43172d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).b(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.c(sSLSocket);
        }
        return null;
    }

    public boolean j(String str) {
        Intrinsics.i(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
