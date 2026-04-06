package com.google.common.collect;

import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

@ElementTypesAreNonnullByDefault
final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {

    /* renamed from: B  reason: collision with root package name */
    public final transient EnumSet f28142B;
    public transient int C;

    public static class EnumSerializedForm<E extends Enum<E>> implements Serializable {
    }

    public boolean C() {
        return true;
    }

    public boolean contains(Object obj) {
        return this.f28142B.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        if (collection instanceof ImmutableEnumSet) {
            collection = ((ImmutableEnumSet) collection).f28142B;
        }
        return this.f28142B.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            obj = ((ImmutableEnumSet) obj).f28142B;
        }
        return this.f28142B.equals(obj);
    }

    public int hashCode() {
        int i2 = this.C;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f28142B.hashCode();
        this.C = hashCode;
        return hashCode;
    }

    public boolean isEmpty() {
        return this.f28142B.isEmpty();
    }

    public boolean n() {
        return false;
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return Iterators.K(this.f28142B.iterator());
    }

    public int size() {
        return this.f28142B.size();
    }

    public String toString() {
        return this.f28142B.toString();
    }
}
