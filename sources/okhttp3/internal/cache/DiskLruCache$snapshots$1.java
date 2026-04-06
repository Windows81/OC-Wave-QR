package okhttp3.internal.cache;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import okhttp3.internal.cache.DiskLruCache;

@Metadata
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public DiskLruCache.Snapshot f42855A;

    /* renamed from: B  reason: collision with root package name */
    public DiskLruCache.Snapshot f42856B;
    public final /* synthetic */ DiskLruCache C;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f42857z;

    /* renamed from: b */
    public DiskLruCache.Snapshot next() {
        if (hasNext()) {
            DiskLruCache.Snapshot snapshot = this.f42855A;
            this.f42856B = snapshot;
            this.f42855A = null;
            Intrinsics.f(snapshot);
            return snapshot;
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        if (this.f42855A != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.C;
        synchronized (diskLruCache) {
            if (diskLruCache.A()) {
                return false;
            }
            while (this.f42857z.hasNext()) {
                DiskLruCache.Entry entry = (DiskLruCache.Entry) this.f42857z.next();
                if (entry != null) {
                    DiskLruCache.Snapshot r2 = entry.r();
                    if (r2 != null) {
                        this.f42855A = r2;
                        return true;
                    }
                }
            }
            Unit unit = Unit.f40552a;
            return false;
        }
    }

    public void remove() {
        DiskLruCache.Snapshot snapshot = this.f42856B;
        if (snapshot != null) {
            try {
                this.C.S(snapshot.c());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f42856B = null;
                throw th;
            }
            this.f42856B = null;
            return;
        }
        throw new IllegalStateException("remove() before next()");
    }
}
