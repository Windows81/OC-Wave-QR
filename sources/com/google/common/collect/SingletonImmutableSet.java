package com.google.common.collect;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: B  reason: collision with root package name */
    public final transient Object f28553B;

    public SingletonImmutableSet(Object obj) {
        this.f28553B = Preconditions.q(obj);
    }

    public boolean contains(Object obj) {
        return this.f28553B.equals(obj);
    }

    public ImmutableList e() {
        return ImmutableList.E(this.f28553B);
    }

    public int g(Object[] objArr, int i2) {
        objArr[i2] = this.f28553B;
        return i2 + 1;
    }

    public final int hashCode() {
        return this.f28553B.hashCode();
    }

    public boolean n() {
        return false;
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return Iterators.G(this.f28553B);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.f28553B.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
