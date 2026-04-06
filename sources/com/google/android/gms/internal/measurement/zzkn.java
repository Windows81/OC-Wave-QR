package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzkn extends zzjm<Double> implements zzll<Double>, zzmx, RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public double[] f25596A;

    /* renamed from: B  reason: collision with root package name */
    public int f25597B;

    static {
        new zzkn(new double[0], 0, false);
    }

    public zzkn(double[] dArr, int i2, boolean z2) {
        super(z2);
        this.f25596A = dArr;
        this.f25597B = i2;
    }

    private final String i(int i2) {
        int i3 = this.f25597B;
        return "Index:" + i2 + ", Size:" + i3;
    }

    private final void m(int i2) {
        if (i2 < 0 || i2 >= this.f25597B) {
            throw new IndexOutOfBoundsException(i(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        e();
        if (i2 < 0 || i2 > (i3 = this.f25597B)) {
            throw new IndexOutOfBoundsException(i(i2));
        }
        double[] dArr = this.f25596A;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[(((i3 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f25596A, i2, dArr2, i2 + 1, this.f25597B - i2);
            this.f25596A = dArr2;
        }
        this.f25596A[i2] = doubleValue;
        this.f25597B++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        e();
        zzle.e(collection);
        if (!(collection instanceof zzkn)) {
            return super.addAll(collection);
        }
        zzkn zzkn = (zzkn) collection;
        int i2 = zzkn.f25597B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f25597B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f25596A;
            if (i4 > dArr.length) {
                this.f25596A = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(zzkn.f25596A, 0, this.f25596A, this.f25597B, zzkn.f25597B);
            this.f25597B = i4;
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
        if (!(obj instanceof zzkn)) {
            return super.equals(obj);
        }
        zzkn zzkn = (zzkn) obj;
        if (this.f25597B != zzkn.f25597B) {
            return false;
        }
        double[] dArr = zzkn.f25596A;
        for (int i2 = 0; i2 < this.f25597B; i2++) {
            if (Double.doubleToLongBits(this.f25596A[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final void g(double d2) {
        e();
        int i2 = this.f25597B;
        double[] dArr = this.f25596A;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f25596A = dArr2;
        }
        double[] dArr3 = this.f25596A;
        int i3 = this.f25597B;
        this.f25597B = i3 + 1;
        dArr3[i3] = d2;
    }

    public final /* synthetic */ Object get(int i2) {
        return Double.valueOf(h(i2));
    }

    public final double h(int i2) {
        m(i2);
        return this.f25596A[i2];
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f25597B; i3++) {
            i2 = (i2 * 31) + zzle.b(Double.doubleToLongBits(this.f25596A[i3]));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f25596A[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ zzll j(int i2) {
        if (i2 >= this.f25597B) {
            return new zzkn(Arrays.copyOf(this.f25596A, i2), this.f25597B, true);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i2) {
        e();
        m(i2);
        double[] dArr = this.f25596A;
        double d2 = dArr[i2];
        int i3 = this.f25597B;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f25597B--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public final void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            double[] dArr = this.f25596A;
            System.arraycopy(dArr, i3, dArr, i2, this.f25597B - i3);
            this.f25597B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        e();
        m(i2);
        double[] dArr = this.f25596A;
        double d2 = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.f25597B;
    }

    public final /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
