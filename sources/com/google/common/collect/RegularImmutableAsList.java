package com.google.common.collect;

@ElementTypesAreNonnullByDefault
class RegularImmutableAsList<E> extends ImmutableAsList<E> {

    /* renamed from: B  reason: collision with root package name */
    public final ImmutableCollection f28508B;
    public final ImmutableList C;

    /* renamed from: C */
    public UnmodifiableListIterator listIterator(int i2) {
        return this.C.listIterator(i2);
    }

    public ImmutableCollection Q() {
        return this.f28508B;
    }

    public int g(Object[] objArr, int i2) {
        return this.C.g(objArr, i2);
    }

    public Object get(int i2) {
        return this.C.get(i2);
    }

    public Object[] h() {
        return this.C.h();
    }

    public int i() {
        return this.C.i();
    }

    public int m() {
        return this.C.m();
    }
}
