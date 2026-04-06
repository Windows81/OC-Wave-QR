package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.Metadata;
import kotlin.collections.BooleanIterator;

@Metadata
public final class SparseBooleanArrayKt$valueIterator$1 extends BooleanIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SparseBooleanArray f20178A;

    /* renamed from: z  reason: collision with root package name */
    public int f20179z;

    public boolean b() {
        SparseBooleanArray sparseBooleanArray = this.f20178A;
        int i2 = this.f20179z;
        this.f20179z = i2 + 1;
        return sparseBooleanArray.valueAt(i2);
    }

    public boolean hasNext() {
        return this.f20179z < this.f20178A.size();
    }
}
