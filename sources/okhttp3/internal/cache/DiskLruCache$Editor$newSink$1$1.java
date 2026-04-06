package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.cache.DiskLruCache;

@Metadata
public final class DiskLruCache$Editor$newSink$1$1 extends Lambda implements Function1<IOException, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache.Editor f42836A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f42837z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.f42837z = diskLruCache;
        this.f42836A = editor;
    }

    public final void b(IOException iOException) {
        Intrinsics.i(iOException, "it");
        DiskLruCache diskLruCache = this.f42837z;
        DiskLruCache.Editor editor = this.f42836A;
        synchronized (diskLruCache) {
            editor.c();
            Unit unit = Unit.f40552a;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((IOException) obj);
        return Unit.f40552a;
    }
}
