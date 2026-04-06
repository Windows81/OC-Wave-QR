package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata
public final class CertificatePinner$check$1 extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f42560A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f42561B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f42562z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.f42562z = certificatePinner;
        this.f42560A = list;
        this.f42561B = str;
    }

    /* renamed from: b */
    public final List invoke() {
        List list;
        CertificateChainCleaner d2 = this.f42562z.d();
        if (d2 == null || (list = d2.a(this.f42560A, this.f42561B)) == null) {
            list = this.f42560A;
        }
        Iterable<Certificate> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (Certificate certificate : iterable) {
            Intrinsics.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
