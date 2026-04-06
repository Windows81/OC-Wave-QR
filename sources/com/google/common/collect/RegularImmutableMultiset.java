package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset F = new RegularImmutableMultiset(ObjectCountHashMap.b());
    public final transient ObjectCountHashMap C;
    public final transient int D;
    public transient ImmutableSet E;

    public final class ElementSet extends IndexedImmutableSet<E> {
        public ElementSet() {
        }

        public boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        public Object get(int i2) {
            return RegularImmutableMultiset.this.C.i(i2);
        }

        public boolean n() {
            return true;
        }

        public int size() {
            return RegularImmutableMultiset.this.C.C();
        }
    }

    public static class SerializedForm implements Serializable {
    }

    public RegularImmutableMultiset(ObjectCountHashMap objectCountHashMap) {
        this.C = objectCountHashMap;
        long j2 = 0;
        for (int i2 = 0; i2 < objectCountHashMap.C(); i2++) {
            j2 += (long) objectCountHashMap.k(i2);
        }
        this.D = Ints.k(j2);
    }

    public int L0(Object obj) {
        return this.C.f(obj);
    }

    public boolean n() {
        return false;
    }

    /* renamed from: s */
    public ImmutableSet k() {
        ImmutableSet immutableSet = this.E;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.E = elementSet;
        return elementSet;
    }

    public int size() {
        return this.D;
    }

    public Multiset.Entry v(int i2) {
        return this.C.g(i2);
    }
}
