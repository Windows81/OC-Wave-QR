package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList D = new RegularImmutableList(new Object[0], 0);

    /* renamed from: B  reason: collision with root package name */
    public final transient Object[] f28509B;
    public final transient int C;

    public RegularImmutableList(Object[] objArr, int i2) {
        this.f28509B = objArr;
        this.C = i2;
    }

    public int g(Object[] objArr, int i2) {
        System.arraycopy(this.f28509B, 0, objArr, i2, this.C);
        return i2 + this.C;
    }

    public Object get(int i2) {
        Preconditions.o(i2, this.C);
        Object obj = this.f28509B[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    public Object[] h() {
        return this.f28509B;
    }

    public int i() {
        return this.C;
    }

    public int m() {
        return 0;
    }

    public boolean n() {
        return false;
    }

    public int size() {
        return this.C;
    }
}
