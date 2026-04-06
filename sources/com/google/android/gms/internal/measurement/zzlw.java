package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzlw extends zzjm<Long> implements zzli, zzmx, RandomAccess {
    public static final zzlw C = new zzlw(new long[0], 0, false);

    /* renamed from: A  reason: collision with root package name */
    public long[] f25644A;

    /* renamed from: B  reason: collision with root package name */
    public int f25645B;

    public zzlw(long[] jArr, int i2, boolean z2) {
        super(z2);
        this.f25644A = jArr;
        this.f25645B = i2;
    }

    public static zzlw h() {
        return C;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        e();
        if (i2 < 0 || i2 > (i3 = this.f25645B)) {
            throw new IndexOutOfBoundsException(i(i2));
        }
        long[] jArr = this.f25644A;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[(((i3 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f25644A, i2, jArr2, i2 + 1, this.f25645B - i2);
            this.f25644A = jArr2;
        }
        this.f25644A[i2] = longValue;
        this.f25645B++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        e();
        zzle.e(collection);
        if (!(collection instanceof zzlw)) {
            return super.addAll(collection);
        }
        zzlw zzlw = (zzlw) collection;
        int i2 = zzlw.f25645B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f25645B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f25644A;
            if (i4 > jArr.length) {
                this.f25644A = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(zzlw.f25644A, 0, this.f25644A, this.f25645B, zzlw.f25645B);
            this.f25645B = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlw)) {
            return super.equals(obj);
        }
        zzlw zzlw = (zzlw) obj;
        if (this.f25645B != zzlw.f25645B) {
            return false;
        }
        long[] jArr = zzlw.f25644A;
        for (int i2 = 0; i2 < this.f25645B; i2++) {
            if (this.f25644A[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j2) {
        e();
        int i2 = this.f25645B;
        long[] jArr = this.f25644A;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f25644A = jArr2;
        }
        long[] jArr3 = this.f25644A;
        int i3 = this.f25645B;
        this.f25645B = i3 + 1;
        jArr3[i3] = j2;
    }

    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(t(i2));
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f25645B; i3++) {
            i2 = (i2 * 31) + zzle.b(this.f25644A[i3]);
        }
        return i2;
    }

    public final String i(int i2) {
        int i3 = this.f25645B;
        return "Index:" + i2 + ", Size:" + i3;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f25644A[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void m(int i2) {
        if (i2 < 0 || i2 >= this.f25645B) {
            throw new IndexOutOfBoundsException(i(i2));
        }
    }

    public final /* synthetic */ Object remove(int i2) {
        e();
        m(i2);
        long[] jArr = this.f25644A;
        long j2 = jArr[i2];
        int i3 = this.f25645B;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f25645B--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    public final void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            long[] jArr = this.f25644A;
            System.arraycopy(jArr, i3, jArr, i2, this.f25645B - i3);
            this.f25645B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        e();
        m(i2);
        long[] jArr = this.f25644A;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    public final int size() {
        return this.f25645B;
    }

    public final long t(int i2) {
        m(i2);
        return this.f25644A[i2];
    }

    /* renamed from: x */
    public final zzli j(int i2) {
        if (i2 >= this.f25645B) {
            return new zzlw(Arrays.copyOf(this.f25644A, i2), this.f25645B, true);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
