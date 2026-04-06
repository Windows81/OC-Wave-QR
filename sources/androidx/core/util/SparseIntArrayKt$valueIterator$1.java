package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata
public final class SparseIntArrayKt$valueIterator$1 extends IntIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SparseIntArray f20182A;

    /* renamed from: z  reason: collision with root package name */
    public int f20183z;

    public int b() {
        SparseIntArray sparseIntArray = this.f20182A;
        int i2 = this.f20183z;
        this.f20183z = i2 + 1;
        return sparseIntArray.valueAt(i2);
    }

    public boolean hasNext() {
        return this.f20183z < this.f20182A.size();
    }
}
