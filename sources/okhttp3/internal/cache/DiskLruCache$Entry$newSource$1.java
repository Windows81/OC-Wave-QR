package okhttp3.internal.cache;

import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.internal.cache.DiskLruCache;
import okio.ForwardingSource;
import okio.Source;

@Metadata
public final class DiskLruCache$Entry$newSource$1 extends ForwardingSource {

    /* renamed from: A  reason: collision with root package name */
    public boolean f42848A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f42849B;
    public final /* synthetic */ DiskLruCache.Entry C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Entry$newSource$1(Source source, DiskLruCache diskLruCache, DiskLruCache.Entry entry) {
        super(source);
        this.f42849B = diskLruCache;
        this.C = entry;
    }

    public void close() {
        super.close();
        if (!this.f42848A) {
            this.f42848A = true;
            DiskLruCache diskLruCache = this.f42849B;
            DiskLruCache.Entry entry = this.C;
            synchronized (diskLruCache) {
                try {
                    entry.n(entry.f() - 1);
                    if (entry.f() == 0 && entry.i()) {
                        diskLruCache.T(entry);
                    }
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
