package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

@ElementTypesAreNonnullByDefault
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {

    /* renamed from: A  reason: collision with root package name */
    public final ImmutableMap f28164A;

    public static class SerializedForm<V> implements Serializable {
    }

    public ImmutableMapValues(ImmutableMap immutableMap) {
        this.f28164A = immutableMap;
    }

    public boolean contains(Object obj) {
        return obj != null && Iterators.j(iterator(), obj);
    }

    public ImmutableList e() {
        final ImmutableList e2 = this.f28164A.entrySet().e();
        return new ImmutableList<V>(this) {
            public Object get(int i2) {
                return ((Map.Entry) e2.get(i2)).getValue();
            }

            public boolean n() {
                return true;
            }

            public int size() {
                return e2.size();
            }
        };
    }

    public boolean n() {
        return true;
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return new UnmodifiableIterator<V>() {

            /* renamed from: z  reason: collision with root package name */
            public final UnmodifiableIterator f28166z;

            {
                this.f28166z = ImmutableMapValues.this.f28164A.entrySet().iterator();
            }

            public boolean hasNext() {
                return this.f28166z.hasNext();
            }

            public Object next() {
                return ((Map.Entry) this.f28166z.next()).getValue();
            }
        };
    }

    public int size() {
        return this.f28164A.size();
    }
}
