package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.openjsse.net.ssl.OpenJSSE;

@Metadata
public final class OpenJSSEPlatform extends Platform {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f43197e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f43198f;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f43199d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OpenJSSEPlatform a() {
            if (b()) {
                return new OpenJSSEPlatform((DefaultConstructorMarker) null);
            }
            return null;
        }

        public final boolean b() {
            return OpenJSSEPlatform.f43198f;
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion((DefaultConstructorMarker) null);
        f43197e = companion;
        boolean z2 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, companion.getClass().getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        f43198f = z2;
    }

    public /* synthetic */ OpenJSSEPlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.i(sSLSocket, "sslSocket");
        Intrinsics.i(list, "protocols");
        super.e(sSLSocket, str, list);
    }

    public String h(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        return super.h(sSLSocket);
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f43199d);
        Intrinsics.h(instance, "getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    public X509TrustManager p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f43199d);
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

    public OpenJSSEPlatform() {
        this.f43199d = new OpenJSSE();
    }
}
