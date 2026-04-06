package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

@Metadata
public final class AndroidPlatform extends Platform {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f43173f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f43174g;

    /* renamed from: d  reason: collision with root package name */
    public final List f43175d;

    /* renamed from: e  reason: collision with root package name */
    public final CloseGuard f43176e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Platform a() {
            if (b()) {
                return new AndroidPlatform();
            }
            return null;
        }

        public final boolean b() {
            return AndroidPlatform.f43174g;
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class CustomTrustRootIndex implements TrustRootIndex {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f43177a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f43178b;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            Intrinsics.i(x509TrustManager, "trustManager");
            Intrinsics.i(method, "findByIssuerAndSignatureMethod");
            this.f43177a = x509TrustManager;
            this.f43178b = method;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            Intrinsics.i(x509Certificate, "cert");
            try {
                Object invoke = this.f43178b.invoke(this.f43177a, new Object[]{x509Certificate});
                Intrinsics.g(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return Intrinsics.d(this.f43177a, customTrustRootIndex.f43177a) && Intrinsics.d(this.f43178b, customTrustRootIndex.f43178b);
        }

        public int hashCode() {
            return (this.f43177a.hashCode() * 31) + this.f43178b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f43177a + ", findByIssuerAndSignatureMethod=" + this.f43178b + ')';
        }
    }

    static {
        boolean z2 = false;
        if (Platform.f43200a.h() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f43174g = z2;
    }

    public AndroidPlatform() {
        SocketAdapter[] socketAdapterArr = {StandardAndroidSocketAdapter.Companion.b(StandardAndroidSocketAdapter.f43229j, (String) null, 1, (Object) null), new DeferredSocketAdapter(AndroidSocketAdapter.f43211f.d()), new DeferredSocketAdapter(ConscryptSocketAdapter.f43225a.a()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.f43219a.a())};
        ArrayList arrayList = new ArrayList();
        for (Object next : CollectionsKt.r(socketAdapterArr)) {
            if (((SocketAdapter) next).a()) {
                arrayList.add(next);
            }
        }
        this.f43175d = arrayList;
        this.f43176e = CloseGuard.f43221d.a();
    }

    public CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        Intrinsics.i(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner a2 = AndroidCertificateChainCleaner.f43204d.a(x509TrustManager);
        return a2 != null ? a2 : super.c(x509TrustManager);
    }

    public TrustRootIndex d(X509TrustManager x509TrustManager) {
        Intrinsics.i(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            Intrinsics.h(declaredMethod, "method");
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Intrinsics.i(sSLSocket, "sslSocket");
        Intrinsics.i(list, "protocols");
        Iterator it = this.f43175d.iterator();
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

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        Intrinsics.i(socket, "socket");
        Intrinsics.i(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    public String h(SSLSocket sSLSocket) {
        Object obj;
        Intrinsics.i(sSLSocket, "sslSocket");
        Iterator it = this.f43175d.iterator();
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

    public Object i(String str) {
        Intrinsics.i(str, "closer");
        return this.f43176e.a(str);
    }

    public boolean j(String str) {
        Intrinsics.i(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public void m(String str, Object obj) {
        Intrinsics.i(str, "message");
        if (!this.f43176e.b(obj)) {
            Platform.l(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
