package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final IntArrayList C;

    /* renamed from: A  reason: collision with root package name */
    public int[] f32165A;

    /* renamed from: B  reason: collision with root package name */
    public int f32166B;

    static {
        IntArrayList intArrayList = new IntArrayList(new int[0], 0);
        C = intArrayList;
        intArrayList.r();
    }

    public IntArrayList(int[] iArr, int i2) {
        this.f32165A = iArr;
        this.f32166B = i2;
    }

    public static IntArrayList m() {
        return C;
    }

    private void n(int i2) {
        if (i2 < 0 || i2 >= this.f32166B) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    private String p(int i2) {
        return "Index:" + i2 + ", Size:" + this.f32166B;
    }

    public boolean addAll(Collection collection) {
        e();
        Internal.a(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i2 = intArrayList.f32166B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f32166B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f32165A;
            if (i4 > iArr.length) {
                this.f32165A = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(intArrayList.f32165A, 0, this.f32165A, this.f32166B, intArrayList.f32166B);
            this.f32166B = i4;
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
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.f32166B != intArrayList.f32166B) {
            return false;
        }
        int[] iArr = intArrayList.f32165A;
        for (int i2 = 0; i2 < this.f32166B; i2++) {
            if (this.f32165A[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public void add(int i2, Integer num) {
        i(i2, num.intValue());
    }

    public void g0(int i2) {
        e();
        int i3 = this.f32166B;
        int[] iArr = this.f32165A;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f32165A = iArr2;
        }
        int[] iArr3 = this.f32165A;
        int i4 = this.f32166B;
        this.f32166B = i4 + 1;
        iArr3[i4] = i2;
    }

    public int getInt(int i2) {
        n(i2);
        return this.f32165A[i2];
    }

    /* renamed from: h */
    public boolean add(Integer num) {
        g0(num.intValue());
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f32166B; i3++) {
            i2 = (i2 * 31) + this.f32165A[i3];
        }
        return i2;
    }

    public final void i(int i2, int i3) {
        int i4;
        e();
        if (i2 < 0 || i2 > (i4 = this.f32166B)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        int[] iArr = this.f32165A;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
        } else {
            int[] iArr2 = new int[(((i4 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f32165A, i2, iArr2, i2 + 1, this.f32166B - i2);
            this.f32165A = iArr2;
        }
        this.f32165A[i2] = i3;
        this.f32166B++;
        this.modCount++;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f32165A[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public Integer get(int i2) {
        return Integer.valueOf(getInt(i2));
    }

    /* renamed from: q */
    public Integer remove(int i2) {
        e();
        n(i2);
        int[] iArr = this.f32165A;
        int i3 = iArr[i2];
        int i4 = this.f32166B;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f32166B--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            int[] iArr = this.f32165A;
            System.arraycopy(iArr, i3, iArr, i2, this.f32166B - i3);
            this.f32166B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Integer set(int i2, Integer num) {
        return Integer.valueOf(u(i2, num.intValue()));
    }

    public int size() {
        return this.f32166B;
    }

    public int u(int i2, int i3) {
        e();
        n(i2);
        int[] iArr = this.f32165A;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }

    public Internal.IntList f(int i2) {
        if (i2 >= this.f32166B) {
            return new IntArrayList(Arrays.copyOf(this.f32165A, i2), this.f32166B);
        }
        throw new IllegalArgumentException();
    }
}
