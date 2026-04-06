package androidx.core.util;

import android.util.LongSparseArray;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata
public final class LongSparseArrayKt$keyIterator$1 extends LongIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LongSparseArray f20147A;

    /* renamed from: z  reason: collision with root package name */
    public int f20148z;

    public long b() {
        LongSparseArray longSparseArray = this.f20147A;
        int i2 = this.f20148z;
        this.f20148z = i2 + 1;
        return longSparseArray.keyAt(i2);
    }

    public boolean hasNext() {
        return this.f20148z < this.f20147A.size();
    }
}
