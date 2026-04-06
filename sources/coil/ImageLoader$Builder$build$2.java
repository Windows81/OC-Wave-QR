package coil;

import coil.ImageLoader;
import coil.disk.DiskCache;
import coil.util.SingletonDiskCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ImageLoader$Builder$build$2 extends Lambda implements Function0<DiskCache> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImageLoader.Builder f23252z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageLoader$Builder$build$2(ImageLoader.Builder builder) {
        super(0);
        this.f23252z = builder;
    }

    /* renamed from: b */
    public final DiskCache invoke() {
        return SingletonDiskCache.f23761a.a(this.f23252z.f23242a);
    }
}
