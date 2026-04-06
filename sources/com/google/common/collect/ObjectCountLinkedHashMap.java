package com.google.common.collect;

import java.util.Arrays;

@ElementTypesAreNonnullByDefault
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {

    /* renamed from: i  reason: collision with root package name */
    public transient long[] f28489i;

    /* renamed from: j  reason: collision with root package name */
    public transient int f28490j;

    /* renamed from: k  reason: collision with root package name */
    public transient int f28491k;

    public ObjectCountLinkedHashMap(int i2) {
        this(i2, 1.0f);
    }

    public final int E(int i2) {
        return (int) (this.f28489i[i2] >>> 32);
    }

    public final int F(int i2) {
        return (int) this.f28489i[i2];
    }

    public final void G(int i2, int i3) {
        long[] jArr = this.f28489i;
        jArr[i2] = (jArr[i2] & 4294967295L) | (((long) i3) << 32);
    }

    public final void H(int i2, int i3) {
        if (i2 == -2) {
            this.f28490j = i3;
        } else {
            I(i2, i3);
        }
        if (i3 == -2) {
            this.f28491k = i2;
        } else {
            G(i3, i2);
        }
    }

    public final void I(int i2, int i3) {
        long[] jArr = this.f28489i;
        jArr[i2] = (jArr[i2] & -4294967296L) | (((long) i3) & 4294967295L);
    }

    public void a() {
        super.a();
        this.f28490j = -2;
        this.f28491k = -2;
    }

    public int e() {
        int i2 = this.f28490j;
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    public void n(int i2, float f2) {
        super.n(i2, f2);
        this.f28490j = -2;
        this.f28491k = -2;
        long[] jArr = new long[i2];
        this.f28489i = jArr;
        Arrays.fill(jArr, -1);
    }

    public void o(int i2, Object obj, int i3, int i4) {
        super.o(i2, obj, i3, i4);
        H(this.f28491k, i2);
        H(i2, -2);
    }

    public void p(int i2) {
        int C = C() - 1;
        H(E(i2), F(i2));
        if (i2 < C) {
            H(E(C), i2);
            H(i2, F(C));
        }
        super.p(i2);
    }

    public int s(int i2) {
        int F = F(i2);
        if (F == -2) {
            return -1;
        }
        return F;
    }

    public int t(int i2, int i3) {
        return i2 == C() ? i3 : i2;
    }

    public void y(int i2) {
        super.y(i2);
        long[] jArr = this.f28489i;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        this.f28489i = copyOf;
        Arrays.fill(copyOf, length, i2, -1);
    }

    public ObjectCountLinkedHashMap(int i2, float f2) {
        super(i2, f2);
    }
}
