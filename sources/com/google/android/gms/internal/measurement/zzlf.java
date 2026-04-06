package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzlf extends zzjm<Integer> implements zzlj, zzmx, RandomAccess {
    public static final zzlf C = new zzlf(new int[0], 0, false);

    /* renamed from: A  reason: collision with root package name */
    public int[] f25635A;

    /* renamed from: B  reason: collision with root package name */
    public int f25636B;

    public zzlf(int[] iArr, int i2, boolean z2) {
        super(z2);
        this.f25635A = iArr;
        this.f25636B = i2;
    }

    public static zzlf h() {
        return C;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i2 < 0 || i2 > (i3 = this.f25636B)) {
            throw new IndexOutOfBoundsException(m(i2));
        }
        int[] iArr = this.f25635A;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f25635A, i2, iArr2, i2 + 1, this.f25636B - i2);
            this.f25635A = iArr2;
        }
        this.f25635A[i2] = intValue;
        this.f25636B++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        e();
        zzle.e(collection);
        if (!(collection instanceof zzlf)) {
            return super.addAll(collection);
        }
        zzlf zzlf = (zzlf) collection;
        int i2 = zzlf.f25636B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f25636B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f25635A;
            if (i4 > iArr.length) {
                this.f25635A = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(zzlf.f25635A, 0, this.f25635A, this.f25636B, zzlf.f25636B);
            this.f25636B = i4;
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
        if (!(obj instanceof zzlf)) {
            return super.equals(obj);
        }
        zzlf zzlf = (zzlf) obj;
        if (this.f25636B != zzlf.f25636B) {
            return false;
        }
        int[] iArr = zzlf.f25635A;
        for (int i2 = 0; i2 < this.f25636B; i2++) {
            if (this.f25635A[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int g(int i2) {
        n(i2);
        return this.f25635A[i2];
    }

    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(g(i2));
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f25636B; i3++) {
            i2 = (i2 * 31) + this.f25635A[i3];
        }
        return i2;
    }

    public final void i(int i2) {
        e();
        int i3 = this.f25636B;
        int[] iArr = this.f25635A;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f25635A = iArr2;
        }
        int[] iArr3 = this.f25635A;
        int i4 = this.f25636B;
        this.f25636B = i4 + 1;
        iArr3[i4] = i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f25635A[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final String m(int i2) {
        int i3 = this.f25636B;
        return "Index:" + i2 + ", Size:" + i3;
    }

    public final void n(int i2) {
        if (i2 < 0 || i2 >= this.f25636B) {
            throw new IndexOutOfBoundsException(m(i2));
        }
    }

    public final /* synthetic */ Object remove(int i2) {
        e();
        n(i2);
        int[] iArr = this.f25635A;
        int i3 = iArr[i2];
        int i4 = this.f25636B;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f25636B--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public final void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            int[] iArr = this.f25635A;
            System.arraycopy(iArr, i3, iArr, i2, this.f25636B - i3);
            this.f25636B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        n(i2);
        int[] iArr = this.f25635A;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.f25636B;
    }

    /* renamed from: x */
    public final zzlj j(int i2) {
        if (i2 >= this.f25636B) {
            return new zzlf(Arrays.copyOf(this.f25635A, i2), this.f25636B, true);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
