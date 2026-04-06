package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final DoubleArrayList C;

    /* renamed from: A  reason: collision with root package name */
    public double[] f32099A;

    /* renamed from: B  reason: collision with root package name */
    public int f32100B;

    static {
        DoubleArrayList doubleArrayList = new DoubleArrayList(new double[0], 0);
        C = doubleArrayList;
        doubleArrayList.r();
    }

    public DoubleArrayList(double[] dArr, int i2) {
        this.f32099A = dArr;
        this.f32100B = i2;
    }

    public static DoubleArrayList n() {
        return C;
    }

    private void o(int i2) {
        if (i2 < 0 || i2 >= this.f32100B) {
            throw new IndexOutOfBoundsException(s(i2));
        }
    }

    private String s(int i2) {
        return "Index:" + i2 + ", Size:" + this.f32100B;
    }

    public boolean addAll(Collection collection) {
        e();
        Internal.a(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i2 = doubleArrayList.f32100B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f32100B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f32099A;
            if (i4 > dArr.length) {
                this.f32099A = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(doubleArrayList.f32099A, 0, this.f32099A, this.f32100B, doubleArrayList.f32100B);
            this.f32100B = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.f32100B != doubleArrayList.f32100B) {
            return false;
        }
        double[] dArr = doubleArrayList.f32099A;
        for (int i2 = 0; i2 < this.f32100B; i2++) {
            if (Double.doubleToLongBits(this.f32099A[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void add(int i2, Double d2) {
        m(i2, d2.doubleValue());
    }

    /* renamed from: h */
    public boolean add(Double d2) {
        i(d2.doubleValue());
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f32100B; i3++) {
            i2 = (i2 * 31) + Internal.f(Double.doubleToLongBits(this.f32099A[i3]));
        }
        return i2;
    }

    public void i(double d2) {
        e();
        int i2 = this.f32100B;
        double[] dArr = this.f32099A;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f32099A = dArr2;
        }
        double[] dArr3 = this.f32099A;
        int i3 = this.f32100B;
        this.f32100B = i3 + 1;
        dArr3[i3] = d2;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f32099A[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void m(int i2, double d2) {
        int i3;
        e();
        if (i2 < 0 || i2 > (i3 = this.f32100B)) {
            throw new IndexOutOfBoundsException(s(i2));
        }
        double[] dArr = this.f32099A;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[(((i3 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f32099A, i2, dArr2, i2 + 1, this.f32100B - i2);
            this.f32099A = dArr2;
        }
        this.f32099A[i2] = d2;
        this.f32100B++;
        this.modCount++;
    }

    /* renamed from: p */
    public Double get(int i2) {
        return Double.valueOf(q(i2));
    }

    public double q(int i2) {
        o(i2);
        return this.f32099A[i2];
    }

    public void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            double[] dArr = this.f32099A;
            System.arraycopy(dArr, i3, dArr, i2, this.f32100B - i3);
            this.f32100B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f32100B;
    }

    /* renamed from: u */
    public Internal.DoubleList f(int i2) {
        if (i2 >= this.f32100B) {
            return new DoubleArrayList(Arrays.copyOf(this.f32099A, i2), this.f32100B);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: v */
    public Double remove(int i2) {
        e();
        o(i2);
        double[] dArr = this.f32099A;
        double d2 = dArr[i2];
        int i3 = this.f32100B;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f32100B--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    /* renamed from: w */
    public Double set(int i2, Double d2) {
        return Double.valueOf(z(i2, d2.doubleValue()));
    }

    public double z(int i2, double d2) {
        e();
        o(i2);
        double[] dArr = this.f32099A;
        double d3 = dArr[i2];
        dArr[i2] = d2;
        return d3;
    }
}
