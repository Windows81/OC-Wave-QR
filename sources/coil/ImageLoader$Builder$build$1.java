package coil;

import coil.ImageLoader;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ImageLoader$Builder$build$1 extends Lambda implements Function0<MemoryCache> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImageLoader.Builder f23251z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageLoader$Builder$build$1(ImageLoader.Builder builder) {
        super(0);
        this.f23251z = builder;
    }

    /* renamed from: b */
    public final MemoryCache invoke() {
        return new MemoryCache.Builder(this.f23251z.f23242a).a();
    }
}
