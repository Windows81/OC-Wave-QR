package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f43204d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManager f43205b;

    /* renamed from: c  reason: collision with root package name */
    public final X509TrustManagerExtensions f43206c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AndroidCertificateChainCleaner a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            Intrinsics.i(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public Companion() {
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.i(x509TrustManager, "trustManager");
        Intrinsics.i(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f43205b = x509TrustManager;
        this.f43206c = x509TrustManagerExtensions;
    }

    public List a(List list, String str) {
        Intrinsics.i(list, "chain");
        Intrinsics.i(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f43206c.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            Intrinsics.h(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).f43205b == this.f43205b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f43205b);
    }
}
