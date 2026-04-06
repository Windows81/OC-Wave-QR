package com.google.common.collect;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    public transient int[] E;
    public transient int[] F;
    public transient int G;
    public transient int H;

    public CompactLinkedHashSet(int i2) {
        super(i2);
    }

    public static CompactLinkedHashSet S(int i2) {
        return new CompactLinkedHashSet(i2);
    }

    public void B(int i2) {
        super.B(i2);
        this.G = -2;
        this.H = -2;
    }

    public void C(int i2, Object obj, int i3, int i4) {
        super.C(i2, obj, i3, i4);
        Y(this.H, i2);
        Y(i2, -2);
    }

    public void D(int i2, int i3) {
        int size = size() - 1;
        super.D(i2, i3);
        Y(U(i2), w(i2));
        if (i2 < size) {
            Y(U(size), i2);
            Y(i2, w(size));
        }
        V()[size] = 0;
        W()[size] = 0;
    }

    public void K(int i2) {
        super.K(i2);
        this.E = Arrays.copyOf(V(), i2);
        this.F = Arrays.copyOf(W(), i2);
    }

    public final int U(int i2) {
        return V()[i2] - 1;
    }

    public final int[] V() {
        int[] iArr = this.E;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int[] W() {
        int[] iArr = this.F;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final void X(int i2, int i3) {
        V()[i2] = i3 + 1;
    }

    public final void Y(int i2, int i3) {
        if (i2 == -2) {
            this.G = i3;
        } else {
            Z(i2, i3);
        }
        if (i3 == -2) {
            this.H = i2;
        } else {
            X(i3, i2);
        }
    }

    public final void Z(int i2, int i3) {
        W()[i2] = i3 + 1;
    }

    public void clear() {
        if (!E()) {
            this.G = -2;
            this.H = -2;
            int[] iArr = this.E;
            if (!(iArr == null || this.F == null)) {
                Arrays.fill(iArr, 0, size(), 0);
                Arrays.fill(this.F, 0, size(), 0);
            }
            super.clear();
        }
    }

    public int h(int i2, int i3) {
        return i2 >= size() ? i3 : i2;
    }

    public int i() {
        int i2 = super.i();
        this.E = new int[i2];
        this.F = new int[i2];
        return i2;
    }

    public Set m() {
        Set m2 = super.m();
        this.E = null;
        this.F = null;
        return m2;
    }

    public Object[] toArray() {
        return ObjectArrays.h(this);
    }

    public int v() {
        return this.G;
    }

    public int w(int i2) {
        return W()[i2] - 1;
    }

    public Object[] toArray(Object[] objArr) {
        return ObjectArrays.i(this, objArr);
    }
}
