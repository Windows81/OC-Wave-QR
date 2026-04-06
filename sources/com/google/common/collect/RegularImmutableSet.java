package com.google.common.collect;

@ElementTypesAreNonnullByDefault
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final Object[] G;
    public static final RegularImmutableSet H;

    /* renamed from: B  reason: collision with root package name */
    public final transient Object[] f28515B;
    public final transient int C;
    public final transient Object[] D;
    public final transient int E;
    public final transient int F;

    static {
        Object[] objArr = new Object[0];
        G = objArr;
        H = new RegularImmutableSet(objArr, 0, objArr, 0, 0);
    }

    public RegularImmutableSet(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f28515B = objArr;
        this.C = i2;
        this.D = objArr2;
        this.E = i3;
        this.F = i4;
    }

    public ImmutableList B() {
        return ImmutableList.q(this.f28515B, this.F);
    }

    public boolean C() {
        return true;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.D;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int d2 = Hashing.d(obj);
        while (true) {
            int i2 = d2 & this.E;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            d2 = i2 + 1;
        }
    }

    public int g(Object[] objArr, int i2) {
        System.arraycopy(this.f28515B, 0, objArr, i2, this.F);
        return i2 + this.F;
    }

    public Object[] h() {
        return this.f28515B;
    }

    public int hashCode() {
        return this.C;
    }

    public int i() {
        return this.F;
    }

    public int m() {
        return 0;
    }

    public boolean n() {
        return false;
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return e().iterator();
    }

    public int size() {
        return this.F;
    }
}
