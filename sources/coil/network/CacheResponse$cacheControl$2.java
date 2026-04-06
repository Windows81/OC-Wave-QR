package coil.network;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.CacheControl;

@Metadata
public final class CacheResponse$cacheControl$2 extends Lambda implements Function0<CacheControl> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CacheResponse f23516z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CacheResponse$cacheControl$2(CacheResponse cacheResponse) {
        super(0);
        this.f23516z = cacheResponse;
    }

    /* renamed from: b */
    public final CacheControl invoke() {
        return CacheControl.f42528n.b(this.f23516z.d());
    }
}
