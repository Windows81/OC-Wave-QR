package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    public transient long[] J;
    public transient int K;
    public transient int L;
    public final boolean M;

    public int B() {
        return this.K;
    }

    public int C(int i2) {
        return ((int) e0(i2)) - 1;
    }

    public void G(int i2) {
        super.G(i2);
        this.K = -2;
        this.L = -2;
    }

    public void I(int i2, Object obj, Object obj2, int i3, int i4) {
        super.I(i2, obj, obj2, i3, i4);
        i0(this.L, i2);
        i0(i2, -2);
    }

    public void L(int i2, int i3) {
        int size = size() - 1;
        super.L(i2, i3);
        i0(d0(i2), C(i2));
        if (i2 < size) {
            i0(d0(size), i2);
            i0(i2, C(size));
        }
        g0(size, 0);
    }

    public void T(int i2) {
        super.T(i2);
        this.J = Arrays.copyOf(f0(), i2);
    }

    public void clear() {
        if (!M()) {
            this.K = -2;
            this.L = -2;
            long[] jArr = this.J;
            if (jArr != null) {
                Arrays.fill(jArr, 0, size(), 0);
            }
            super.clear();
        }
    }

    public final int d0(int i2) {
        return ((int) (e0(i2) >>> 32)) - 1;
    }

    public final long e0(int i2) {
        return f0()[i2];
    }

    public final long[] f0() {
        long[] jArr = this.J;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void g0(int i2, long j2) {
        f0()[i2] = j2;
    }

    public final void h0(int i2, int i3) {
        g0(i2, (e0(i2) & 4294967295L) | (((long) (i3 + 1)) << 32));
    }

    public final void i0(int i2, int i3) {
        if (i2 == -2) {
            this.K = i3;
        } else {
            j0(i2, i3);
        }
        if (i3 == -2) {
            this.L = i2;
        } else {
            h0(i3, i2);
        }
    }

    public final void j0(int i2, int i3) {
        g0(i2, (e0(i2) & -4294967296L) | (((long) (i3 + 1)) & 4294967295L));
    }

    public void p(int i2) {
        if (this.M) {
            i0(d0(i2), C(i2));
            i0(this.L, i2);
            i0(i2, -2);
            E();
        }
    }

    public int q(int i2, int i3) {
        return i2 >= size() ? i3 : i2;
    }

    public int r() {
        int r2 = super.r();
        this.J = new long[r2];
        return r2;
    }

    public Map s() {
        Map s2 = super.s();
        this.J = null;
        return s2;
    }

    public Map v(int i2) {
        return new LinkedHashMap(i2, 1.0f, this.M);
    }
}
