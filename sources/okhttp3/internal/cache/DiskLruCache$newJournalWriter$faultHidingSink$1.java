package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.Util;

@Metadata
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements Function1<IOException, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f42854z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.f42854z = diskLruCache;
    }

    public final void b(IOException iOException) {
        Intrinsics.i(iOException, "it");
        DiskLruCache diskLruCache = this.f42854z;
        if (!Util.f42805h || Thread.holdsLock(diskLruCache)) {
            this.f42854z.L = true;
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((IOException) obj);
        return Unit.f40552a;
    }
}
