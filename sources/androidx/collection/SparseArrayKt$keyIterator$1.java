package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata
public final class SparseArrayKt$keyIterator$1 extends IntIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SparseArrayCompat f2000A;

    /* renamed from: z  reason: collision with root package name */
    public int f2001z;

    public SparseArrayKt$keyIterator$1(SparseArrayCompat sparseArrayCompat) {
        this.f2000A = sparseArrayCompat;
    }

    public int b() {
        SparseArrayCompat sparseArrayCompat = this.f2000A;
        int i2 = this.f2001z;
        this.f2001z = i2 + 1;
        return sparseArrayCompat.j(i2);
    }

    public boolean hasNext() {
        return this.f2001z < this.f2000A.o();
    }
}
