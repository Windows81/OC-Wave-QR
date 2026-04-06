package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Handshake;

@Metadata
public final class RealConnection$connectTls$2 extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RealConnection f42958z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.f42958z = realConnection;
    }

    /* renamed from: b */
    public final List invoke() {
        Handshake d2 = this.f42958z.f42941g;
        Intrinsics.f(d2);
        Iterable<Certificate> d3 = d2.d();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(d3, 10));
        for (Certificate certificate : d3) {
            Intrinsics.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
