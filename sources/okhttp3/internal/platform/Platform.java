package okhttp3.internal.platform;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okio.Buffer;

@Metadata
public class Platform {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f43200a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile Platform f43201b;

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f43202c = Logger.getLogger(OkHttpClient.class.getName());

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List b(List list) {
            Intrinsics.i(list, "protocols");
            ArrayList<Protocol> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (((Protocol) next) != Protocol.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
            for (Protocol protocol : arrayList) {
                arrayList2.add(protocol.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List list) {
            Intrinsics.i(list, "protocols");
            Buffer buffer = new Buffer();
            for (String str : b(list)) {
                buffer.writeByte(str.length());
                buffer.K0(str);
            }
            return buffer.h0();
        }

        public final Platform d() {
            AndroidLog.f43207a.b();
            Platform a2 = Android10Platform.f43170e.a();
            if (a2 != null) {
                return a2;
            }
            Platform a3 = AndroidPlatform.f43173f.a();
            Intrinsics.f(a3);
            return a3;
        }

        public final Platform e() {
            OpenJSSEPlatform a2;
            BouncyCastlePlatform a3;
            ConscryptPlatform b2;
            if (j() && (b2 = ConscryptPlatform.f43182e.b()) != null) {
                return b2;
            }
            if (i() && (a3 = BouncyCastlePlatform.f43179e.a()) != null) {
                return a3;
            }
            if (k() && (a2 = OpenJSSEPlatform.f43197e.a()) != null) {
                return a2;
            }
            Jdk9Platform a4 = Jdk9Platform.f43195d.a();
            if (a4 != null) {
                return a4;
            }
            Platform a5 = Jdk8WithJettyBootPlatform.f43186i.a();
            return a5 != null ? a5 : new Platform();
        }

        public final Platform f() {
            return h() ? d() : e();
        }

        public final Platform g() {
            return Platform.f43201b;
        }

        public final boolean h() {
            return Intrinsics.d("Dalvik", System.getProperty("java.vm.name"));
        }

        public final boolean i() {
            return Intrinsics.d("BC", Security.getProviders()[0].getName());
        }

        public final boolean j() {
            return Intrinsics.d("Conscrypt", Security.getProviders()[0].getName());
        }

        public final boolean k() {
            return Intrinsics.d("OpenJSSE", Security.getProviders()[0].getName());
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion((DefaultConstructorMarker) null);
        f43200a = companion;
        f43201b = companion.f();
    }

    public static /* synthetic */ void l(Platform platform, String str, int i2, Throwable th, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 4;
            }
            if ((i3 & 4) != 0) {
                th = null;
            }
            platform.k(str, i2, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
    }

    public CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        Intrinsics.i(x509TrustManager, "trustManager");
        return new BasicCertificateChainCleaner(d(x509TrustManager));
    }

    public TrustRootIndex d(X509TrustManager x509TrustManager) {
        Intrinsics.i(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        Intrinsics.h(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.i(sSLSocket, "sslSocket");
        Intrinsics.i(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        Intrinsics.i(socket, "socket");
        Intrinsics.i(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i2);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        return null;
    }

    public Object i(String str) {
        Intrinsics.i(str, "closer");
        if (f43202c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean j(String str) {
        Intrinsics.i(str, "hostname");
        return true;
    }

    public void k(String str, int i2, Throwable th) {
        Intrinsics.i(str, "message");
        f43202c.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void m(String str, Object obj) {
        Intrinsics.i(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(str, 5, (Throwable) obj);
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLS");
        Intrinsics.h(instance, "getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        Intrinsics.i(x509TrustManager, "trustManager");
        try {
            SSLContext n2 = n();
            n2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = n2.getSocketFactory();
            Intrinsics.h(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    public X509TrustManager p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        Intrinsics.f(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.g(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.h(arrays, "toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.h(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
