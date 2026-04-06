package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

final class zzmy<E> extends zzjm<E> implements RandomAccess {
    public static final zzmy C = new zzmy(new Object[0], 0, false);

    /* renamed from: A  reason: collision with root package name */
    public Object[] f25686A;

    /* renamed from: B  reason: collision with root package name */
    public int f25687B;

    public zzmy(Object[] objArr, int i2, boolean z2) {
        super(z2);
        this.f25686A = objArr;
        this.f25687B = i2;
    }

    public static zzmy i() {
        return C;
    }

    public final void add(int i2, Object obj) {
        int i3;
        e();
        if (i2 < 0 || i2 > (i3 = this.f25687B)) {
            throw new IndexOutOfBoundsException(g(i2));
        }
        Object[] objArr = this.f25686A;
        if (i3 < objArr.length) {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
        } else {
            Object[] objArr2 = new Object[(((i3 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.f25686A, i2, objArr2, i2 + 1, this.f25687B - i2);
            this.f25686A = objArr2;
        }
        this.f25686A[i2] = obj;
        this.f25687B++;
        this.modCount++;
    }

    public final String g(int i2) {
        int i3 = this.f25687B;
        return "Index:" + i2 + ", Size:" + i3;
    }

    public final Object get(int i2) {
        h(i2);
        return this.f25686A[i2];
    }

    public final void h(int i2) {
        if (i2 < 0 || i2 >= this.f25687B) {
            throw new IndexOutOfBoundsException(g(i2));
        }
    }

    public final /* synthetic */ zzll j(int i2) {
        if (i2 >= this.f25687B) {
            return new zzmy(Arrays.copyOf(this.f25686A, i2), this.f25687B, true);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i2) {
        e();
        h(i2);
        Object[] objArr = this.f25686A;
        Object obj = objArr[i2];
        int i3 = this.f25687B;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.f25687B--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i2, Object obj) {
        e();
        h(i2);
        Object[] objArr = this.f25686A;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f25687B;
    }

    public final boolean add(Object obj) {
        e();
        int i2 = this.f25687B;
        Object[] objArr = this.f25686A;
        if (i2 == objArr.length) {
            this.f25686A = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f25686A;
        int i3 = this.f25687B;
        this.f25687B = i3 + 1;
        objArr2[i3] = obj;
        this.modCount++;
        return true;
    }
}
