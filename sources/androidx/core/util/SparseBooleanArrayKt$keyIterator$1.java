package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata
public final class SparseBooleanArrayKt$keyIterator$1 extends IntIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SparseBooleanArray f20176A;

    /* renamed from: z  reason: collision with root package name */
    public int f20177z;

    public int b() {
        SparseBooleanArray sparseBooleanArray = this.f20176A;
        int i2 = this.f20177z;
        this.f20177z = i2 + 1;
        return sparseBooleanArray.keyAt(i2);
    }

    public boolean hasNext() {
        return this.f20177z < this.f20176A.size();
    }
}
