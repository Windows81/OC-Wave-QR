package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzlb extends zzjm<Float> implements zzll<Float>, zzmx, RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public float[] f25620A;

    /* renamed from: B  reason: collision with root package name */
    public int f25621B;

    static {
        new zzlb(new float[0], 0, false);
    }

    public zzlb(float[] fArr, int i2, boolean z2) {
        super(z2);
        this.f25620A = fArr;
        this.f25621B = i2;
    }

    private final String i(int i2) {
        int i3 = this.f25621B;
        return "Index:" + i2 + ", Size:" + i3;
    }

    private final void m(int i2) {
        if (i2 < 0 || i2 >= this.f25621B) {
            throw new IndexOutOfBoundsException(i(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        e();
        if (i2 < 0 || i2 > (i3 = this.f25621B)) {
            throw new IndexOutOfBoundsException(i(i2));
        }
        float[] fArr = this.f25620A;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[(((i3 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f25620A, i2, fArr2, i2 + 1, this.f25621B - i2);
            this.f25620A = fArr2;
        }
        this.f25620A[i2] = floatValue;
        this.f25621B++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        e();
        zzle.e(collection);
        if (!(collection instanceof zzlb)) {
            return super.addAll(collection);
        }
        zzlb zzlb = (zzlb) collection;
        int i2 = zzlb.f25621B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f25621B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f25620A;
            if (i4 > fArr.length) {
                this.f25620A = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(zzlb.f25620A, 0, this.f25620A, this.f25621B, zzlb.f25621B);
            this.f25621B = i4;
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
        if (!(obj instanceof zzlb)) {
            return super.equals(obj);
        }
        zzlb zzlb = (zzlb) obj;
        if (this.f25621B != zzlb.f25621B) {
            return false;
        }
        float[] fArr = zzlb.f25620A;
        for (int i2 = 0; i2 < this.f25621B; i2++) {
            if (Float.floatToIntBits(this.f25620A[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final void g(float f2) {
        e();
        int i2 = this.f25621B;
        float[] fArr = this.f25620A;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f25620A = fArr2;
        }
        float[] fArr3 = this.f25620A;
        int i3 = this.f25621B;
        this.f25621B = i3 + 1;
        fArr3[i3] = f2;
    }

    public final /* synthetic */ Object get(int i2) {
        return Float.valueOf(h(i2));
    }

    public final float h(int i2) {
        m(i2);
        return this.f25620A[i2];
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f25621B; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f25620A[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f25620A[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ zzll j(int i2) {
        if (i2 >= this.f25621B) {
            return new zzlb(Arrays.copyOf(this.f25620A, i2), this.f25621B, true);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i2) {
        e();
        m(i2);
        float[] fArr = this.f25620A;
        float f2 = fArr[i2];
        int i3 = this.f25621B;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f25621B--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public final void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            float[] fArr = this.f25620A;
            System.arraycopy(fArr, i3, fArr, i2, this.f25621B - i3);
            this.f25621B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        e();
        m(i2);
        float[] fArr = this.f25620A;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f25621B;
    }

    public final /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
