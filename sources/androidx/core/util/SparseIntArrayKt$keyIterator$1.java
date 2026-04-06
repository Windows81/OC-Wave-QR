package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata
public final class SparseIntArrayKt$keyIterator$1 extends IntIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SparseIntArray f20180A;

    /* renamed from: z  reason: collision with root package name */
    public int f20181z;

    public int b() {
        SparseIntArray sparseIntArray = this.f20180A;
        int i2 = this.f20181z;
        this.f20181z = i2 + 1;
        return sparseIntArray.keyAt(i2);
    }

    public boolean hasNext() {
        return this.f20181z < this.f20180A.size();
    }
}
