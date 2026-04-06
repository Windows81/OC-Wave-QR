package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Handshake$peerCertificates$2 extends Lambda implements Function0<List<? extends Certificate>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f42653z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(Function0 function0) {
        super(0);
        this.f42653z = function0;
    }

    /* renamed from: b */
    public final List invoke() {
        try {
            return (List) this.f42653z.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return CollectionsKt.m();
        }
    }
}
