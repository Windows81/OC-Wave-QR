package coil.network;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;

@Metadata
public final class CacheResponse$contentType$2 extends Lambda implements Function0<MediaType> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CacheResponse f23517z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CacheResponse$contentType$2(CacheResponse cacheResponse) {
        super(0);
        this.f23517z = cacheResponse;
    }

    /* renamed from: b */
    public final MediaType invoke() {
        String e2 = this.f23517z.d().e("Content-Type");
        if (e2 != null) {
            return MediaType.f42680e.b(e2);
        }
        return null;
    }
}
