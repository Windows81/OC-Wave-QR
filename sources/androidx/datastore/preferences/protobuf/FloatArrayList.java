package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final FloatArrayList C = new FloatArrayList(new float[0], 0, false);

    /* renamed from: A  reason: collision with root package name */
    public float[] f20980A;

    /* renamed from: B  reason: collision with root package name */
    public int f20981B;

    public FloatArrayList(float[] fArr, int i2, boolean z2) {
        super(z2);
        this.f20980A = fArr;
        this.f20981B = i2;
    }

    private void n(int i2) {
        if (i2 < 0 || i2 >= this.f20981B) {
            throw new IndexOutOfBoundsException(q(i2));
        }
    }

    private String q(int i2) {
        return "Index:" + i2 + ", Size:" + this.f20981B;
    }

    public boolean addAll(Collection collection) {
        e();
        Internal.a(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i2 = floatArrayList.f20981B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f20981B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f20980A;
            if (i4 > fArr.length) {
                this.f20980A = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(floatArrayList.f20980A, 0, this.f20980A, this.f20981B, floatArrayList.f20981B);
            this.f20981B = i4;
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
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.f20981B != floatArrayList.f20981B) {
            return false;
        }
        float[] fArr = floatArrayList.f20980A;
        for (int i2 = 0; i2 < this.f20981B; i2++) {
            if (Float.floatToIntBits(this.f20980A[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void add(int i2, Float f2) {
        m(i2, f2.floatValue());
    }

    /* renamed from: h */
    public boolean add(Float f2) {
        i(f2.floatValue());
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f20981B; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f20980A[i3]);
        }
        return i2;
    }

    public void i(float f2) {
        e();
        int i2 = this.f20981B;
        float[] fArr = this.f20980A;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f20980A = fArr2;
        }
        float[] fArr3 = this.f20980A;
        int i3 = this.f20981B;
        this.f20981B = i3 + 1;
        fArr3[i3] = f2;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f20980A[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void m(int i2, float f2) {
        int i3;
        e();
        if (i2 < 0 || i2 > (i3 = this.f20981B)) {
            throw new IndexOutOfBoundsException(q(i2));
        }
        float[] fArr = this.f20980A;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[(((i3 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f20980A, i2, fArr2, i2 + 1, this.f20981B - i2);
            this.f20980A = fArr2;
        }
        this.f20980A[i2] = f2;
        this.f20981B++;
        this.modCount++;
    }

    /* renamed from: o */
    public Float get(int i2) {
        return Float.valueOf(p(i2));
    }

    public float p(int i2) {
        n(i2);
        return this.f20980A[i2];
    }

    public void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            float[] fArr = this.f20980A;
            System.arraycopy(fArr, i3, fArr, i2, this.f20981B - i3);
            this.f20981B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Float remove(int i2) {
        e();
        n(i2);
        float[] fArr = this.f20980A;
        float f2 = fArr[i2];
        int i3 = this.f20981B;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f20981B--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public int size() {
        return this.f20981B;
    }

    /* renamed from: u */
    public Float set(int i2, Float f2) {
        return Float.valueOf(v(i2, f2.floatValue()));
    }

    public float v(int i2, float f2) {
        e();
        n(i2);
        float[] fArr = this.f20980A;
        float f3 = fArr[i2];
        fArr[i2] = f2;
        return f3;
    }

    public Internal.FloatList f(int i2) {
        if (i2 >= this.f20981B) {
            return new FloatArrayList(Arrays.copyOf(this.f20980A, i2), this.f20981B, true);
        }
        throw new IllegalArgumentException();
    }
}
