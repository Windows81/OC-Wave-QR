package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata
public final class RealConnection$connectTls$1 extends Lambda implements Function0<List<? extends Certificate>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Handshake f42955A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Address f42956B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f42957z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f42957z = certificatePinner;
        this.f42955A = handshake;
        this.f42956B = address;
    }

    /* renamed from: b */
    public final List invoke() {
        CertificateChainCleaner d2 = this.f42957z.d();
        Intrinsics.f(d2);
        return d2.a(this.f42955A.d(), this.f42956B.l().i());
    }
}
