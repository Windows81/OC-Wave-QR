package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzjq extends zzjm<Boolean> implements zzll<Boolean>, zzmx, RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public boolean[] f25563A;

    /* renamed from: B  reason: collision with root package name */
    public int f25564B;

    static {
        new zzjq(new boolean[0], 0, false);
    }

    public zzjq(boolean[] zArr, int i2, boolean z2) {
        super(z2);
        this.f25563A = zArr;
        this.f25564B = i2;
    }

    private final void m(int i2) {
        if (i2 < 0 || i2 >= this.f25564B) {
            throw new IndexOutOfBoundsException(i(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i2 < 0 || i2 > (i3 = this.f25564B)) {
            throw new IndexOutOfBoundsException(i(i2));
        }
        boolean[] zArr = this.f25563A;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[(((i3 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f25563A, i2, zArr2, i2 + 1, this.f25564B - i2);
            this.f25563A = zArr2;
        }
        this.f25563A[i2] = booleanValue;
        this.f25564B++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        e();
        zzle.e(collection);
        if (!(collection instanceof zzjq)) {
            return super.addAll(collection);
        }
        zzjq zzjq = (zzjq) collection;
        int i2 = zzjq.f25564B;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f25564B;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f25563A;
            if (i4 > zArr.length) {
                this.f25563A = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(zzjq.f25563A, 0, this.f25563A, this.f25564B, zzjq.f25564B);
            this.f25564B = i4;
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
        if (!(obj instanceof zzjq)) {
            return super.equals(obj);
        }
        zzjq zzjq = (zzjq) obj;
        if (this.f25564B != zzjq.f25564B) {
            return false;
        }
        boolean[] zArr = zzjq.f25563A;
        for (int i2 = 0; i2 < this.f25564B; i2++) {
            if (this.f25563A[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void g(boolean z2) {
        e();
        int i2 = this.f25564B;
        boolean[] zArr = this.f25563A;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f25563A = zArr2;
        }
        boolean[] zArr3 = this.f25563A;
        int i3 = this.f25564B;
        this.f25564B = i3 + 1;
        zArr3[i3] = z2;
    }

    public final /* synthetic */ Object get(int i2) {
        return Boolean.valueOf(h(i2));
    }

    public final boolean h(int i2) {
        m(i2);
        return this.f25563A[i2];
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f25564B; i3++) {
            i2 = (i2 * 31) + zzle.c(this.f25563A[i3]);
        }
        return i2;
    }

    public final String i(int i2) {
        int i3 = this.f25564B;
        return "Index:" + i2 + ", Size:" + i3;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f25563A[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ zzll j(int i2) {
        if (i2 >= this.f25564B) {
            return new zzjq(Arrays.copyOf(this.f25563A, i2), this.f25564B, true);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i2) {
        e();
        m(i2);
        boolean[] zArr = this.f25563A;
        boolean z2 = zArr[i2];
        int i3 = this.f25564B;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f25564B--;
        this.modCount++;
        return Boolean.valueOf(z2);
    }

    public final void removeRange(int i2, int i3) {
        e();
        if (i3 >= i2) {
            boolean[] zArr = this.f25563A;
            System.arraycopy(zArr, i3, zArr, i2, this.f25564B - i3);
            this.f25564B -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        m(i2);
        boolean[] zArr = this.f25563A;
        boolean z2 = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z2);
    }

    public final int size() {
        return this.f25564B;
    }

    public final /* synthetic */ boolean add(Object obj) {
        g(((Boolean) obj).booleanValue());
        return true;
    }
}
