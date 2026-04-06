package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final Object[] f40635A;

    /* renamed from: B  reason: collision with root package name */
    public final int f40636B;
    public int C;
    public int D;

    public RingBuffer(Object[] objArr, int i2) {
        Intrinsics.i(objArr, "buffer");
        this.f40635A = objArr;
        if (i2 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i2).toString());
        } else if (i2 <= objArr.length) {
            this.f40636B = objArr.length;
            this.D = i2;
        } else {
            throw new IllegalArgumentException(("ring buffer filled size: " + i2 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
    }

    public int g() {
        return this.D;
    }

    public Object get(int i2) {
        AbstractList.f40564z.b(i2, size());
        return this.f40635A[(this.C + i2) % this.f40636B];
    }

    public Iterator iterator() {
        return new RingBuffer$iterator$1(this);
    }

    public final void o(Object obj) {
        if (!q()) {
            this.f40635A[(this.C + size()) % this.f40636B] = obj;
            this.D = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public final RingBuffer p(int i2) {
        Object[] objArr;
        int i3 = this.f40636B;
        int j2 = RangesKt.j(i3 + (i3 >> 1) + 1, i2);
        if (this.C == 0) {
            objArr = Arrays.copyOf(this.f40635A, j2);
            Intrinsics.h(objArr, "copyOf(...)");
        } else {
            objArr = toArray(new Object[j2]);
        }
        return new RingBuffer(objArr, size());
    }

    public final boolean q() {
        return size() == this.f40636B;
    }

    public final void s(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i2).toString());
        } else if (i2 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i2 + ", size = " + size()).toString());
        } else if (i2 > 0) {
            int i3 = this.C;
            int m2 = (i3 + i2) % this.f40636B;
            if (i3 > m2) {
                ArraysKt.w(this.f40635A, (Object) null, i3, this.f40636B);
                ArraysKt.w(this.f40635A, (Object) null, 0, m2);
            } else {
                ArraysKt.w(this.f40635A, (Object) null, i3, m2);
            }
            this.C = m2;
            this.D = size() - i2;
        }
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            Intrinsics.h(objArr, "copyOf(...)");
        }
        int size = size();
        int i2 = this.C;
        int i3 = 0;
        int i4 = 0;
        while (i4 < size && i2 < this.f40636B) {
            objArr[i4] = this.f40635A[i2];
            i4++;
            i2++;
        }
        while (i4 < size) {
            objArr[i4] = this.f40635A[i3];
            i4++;
            i3++;
        }
        return CollectionsKt.f(size, objArr);
    }

    public RingBuffer(int i2) {
        this(new Object[i2], 0);
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
