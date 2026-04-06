package okhttp3.internal.tls;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.Platform;

@Metadata
public abstract class CertificateChainCleaner {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f43244a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CertificateChainCleaner a(X509TrustManager x509TrustManager) {
            Intrinsics.i(x509TrustManager, "trustManager");
            return Platform.f43200a.g().c(x509TrustManager);
        }

        public Companion() {
        }
    }

    public abstract List a(List list, String str);
}
