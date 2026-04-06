package androidx.core.util;

import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata
public final class SparseArrayKt$keyIterator$1 extends IntIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SparseArray f20172A;

    /* renamed from: z  reason: collision with root package name */
    public int f20173z;

    public int b() {
        SparseArray sparseArray = this.f20172A;
        int i2 = this.f20173z;
        this.f20173z = i2 + 1;
        return sparseArray.keyAt(i2);
    }

    public boolean hasNext() {
        return this.f20173z < this.f20172A.size();
    }
}
