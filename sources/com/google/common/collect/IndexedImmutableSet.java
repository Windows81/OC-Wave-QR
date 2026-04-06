package com.google.common.collect;

@ElementTypesAreNonnullByDefault
abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    public ImmutableList B() {
        return new ImmutableList<E>() {
            public Object get(int i2) {
                return IndexedImmutableSet.this.get(i2);
            }

            public boolean n() {
                return IndexedImmutableSet.this.n();
            }

            public int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }

    public int g(Object[] objArr, int i2) {
        return e().g(objArr, i2);
    }

    public abstract Object get(int i2);

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return e().iterator();
    }
}
