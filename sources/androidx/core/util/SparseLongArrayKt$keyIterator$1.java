package androidx.core.util;

import android.util.SparseLongArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata
public final class SparseLongArrayKt$keyIterator$1 extends IntIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SparseLongArray f20184A;

    /* renamed from: z  reason: collision with root package name */
    public int f20185z;

    public int b() {
        SparseLongArray sparseLongArray = this.f20184A;
        int i2 = this.f20185z;
        this.f20185z = i2 + 1;
        return sparseLongArray.keyAt(i2);
    }

    public boolean hasNext() {
        return this.f20185z < this.f20184A.size();
    }
}
