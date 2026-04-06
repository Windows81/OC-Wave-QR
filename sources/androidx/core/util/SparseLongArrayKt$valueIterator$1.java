package androidx.core.util;

import android.util.SparseLongArray;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata
public final class SparseLongArrayKt$valueIterator$1 extends LongIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SparseLongArray f20186A;

    /* renamed from: z  reason: collision with root package name */
    public int f20187z;

    public long b() {
        SparseLongArray sparseLongArray = this.f20186A;
        int i2 = this.f20187z;
        this.f20187z = i2 + 1;
        return sparseLongArray.valueAt(i2);
    }

    public boolean hasNext() {
        return this.f20187z < this.f20186A.size();
    }
}
