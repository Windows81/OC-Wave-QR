package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata
public final class LongSparseArrayKt$keyIterator$1 extends LongIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LongSparseArray f1845A;

    /* renamed from: z  reason: collision with root package name */
    public int f1846z;

    public long b() {
        LongSparseArray longSparseArray = this.f1845A;
        int i2 = this.f1846z;
        this.f1846z = i2 + 1;
        return longSparseArray.k(i2);
    }

    public boolean hasNext() {
        return this.f1846z < this.f1845A.o();
    }
}
