package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

@ElementTypesAreNonnullByDefault
abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    public static class EntrySetSerializedForm<K, V> implements Serializable {
    }

    public static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {

        /* renamed from: B  reason: collision with root package name */
        public final transient ImmutableMap f28162B;
        public final transient ImmutableList C;

        public ImmutableList B() {
            return this.C;
        }

        public ImmutableMap K() {
            return this.f28162B;
        }

        public int g(Object[] objArr, int i2) {
            return this.C.g(objArr, i2);
        }

        /* renamed from: o */
        public UnmodifiableIterator iterator() {
            return this.C.iterator();
        }
    }

    public boolean C() {
        return K().j();
    }

    public abstract ImmutableMap K();

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = K().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    public int hashCode() {
        return K().hashCode();
    }

    public boolean n() {
        return K().k();
    }

    public int size() {
        return K().size();
    }
}
