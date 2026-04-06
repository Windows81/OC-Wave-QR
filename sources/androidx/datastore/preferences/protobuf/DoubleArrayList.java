package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final DoubleArrayList C = new DoubleArrayList(new double[0], 0, false);

    /* renamed from: A  reason: collision with root package name */
    public double[] f20935A;

    /* renamed from: B  reason: collision with root package name */
    public int f20936B;

    public DoubleArrayList(double[] dArr, int i2, boolean z2) {
        super(z2);
        this.f20935A = dArr;
        this.f20936B = i2;
    }

    private void n(int i2) {
        if (i2 < 0 || i2 >= this.f20936B) {
            throw new IndexOutOfBoundsException(q(i2));
        }
    }

    private String q(int i2) {
        return "Index:" + i2 + ", Size:" + this.f20936B;
    }

    public boolean addAll(Collection collection) {
        e();
        Internal.a(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i2 = doubleArrayList.f20936B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f20936B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f20935A;
            if (i4 > dArr.length) {
                this.f20935A = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(doubleArrayList.f20935A, 0, this.f20935A, this.f20936B, doubleArrayList.f20936B);
            this.f20936B = i4;
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
        if (this.f20936B != doubleArrayList.f20936B) {
            return false;
        }
        double[] dArr = doubleArrayList.f20935A;
        for (int i2 = 0; i2 < this.f20936B; i2++) {
            if (Double.doubleToLongBits(this.f20935A[i2]) != Double.doubleToLongBits(dArr[i2])) {
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
        for (int i3 = 0; i3 < this.f20936B; i3++) {
            i2 = (i2 * 31) + Internal.f(Double.doubleToLongBits(this.f20935A[i3]));
        }
        return i2;
    }

    public void i(double d2) {
        e();
        int i2 = this.f20936B;
        double[] dArr = this.f20935A;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f20935A = dArr2;
        }
        double[] dArr3 = this.f20935A;
        int i3 = this.f20936B;
        this.f20936B = i3 + 1;
        dArr3[i3] = d2;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f20935A[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void m(int i2, double d2) {
        int i3;
        e();
        if (i2 < 0 || i2 > (i3 = this.f20936B)) {
            throw new IndexOutOfBoundsException(q(i2));
        }
        double[] dArr = this.f20935A;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[(((i3 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f20935A, i2, dArr2, i2 + 1, this.f20936B - i2);
            this.f20935A = dArr2;
        }
        this.f20935A[i2] = d2;
        this.f20936B++;
        this.modCount++;
    }

    /* renamed from: o */
    public Double get(int i2) {
        return Double.valueOf(p(i2));
    }

    public double p(int i2) {
        n(i2);
        return this.f20935A[i2];
    }

    public void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            double[] dArr = this.f20935A;
            System.arraycopy(dArr, i3, dArr, i2, this.f20936B - i3);
            this.f20936B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Double remove(int i2) {
        e();
        n(i2);
        double[] dArr = this.f20935A;
        double d2 = dArr[i2];
        int i3 = this.f20936B;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f20936B--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public int size() {
        return this.f20936B;
    }

    /* renamed from: u */
    public Double set(int i2, Double d2) {
        return Double.valueOf(v(i2, d2.doubleValue()));
    }

    public double v(int i2, double d2) {
        e();
        n(i2);
        double[] dArr = this.f20935A;
        double d3 = dArr[i2];
        dArr[i2] = d2;
        return d3;
    }

    public Internal.DoubleList f(int i2) {
        if (i2 >= this.f20936B) {
            return new DoubleArrayList(Arrays.copyOf(this.f20935A, i2), this.f20936B, true);
        }
        throw new IllegalArgumentException();
    }
}
