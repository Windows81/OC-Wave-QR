package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        /* renamed from: l */
        public ImmutableBiMap a() {
            return d();
        }

        /* renamed from: m */
        public ImmutableBiMap c() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        /* renamed from: n */
        public ImmutableBiMap d() {
            int i2 = this.f28153c;
            if (i2 == 0) {
                return ImmutableBiMap.t();
            }
            if (this.f28151a != null) {
                if (this.f28154d) {
                    this.f28152b = Arrays.copyOf(this.f28152b, i2 * 2);
                }
                ImmutableMap.Builder.k(this.f28152b, this.f28153c, this.f28151a);
            }
            this.f28154d = true;
            return new RegularImmutableBiMap(this.f28152b, this.f28153c);
        }

        /* renamed from: o */
        public Builder g(Object obj, Object obj2) {
            super.g(obj, obj2);
            return this;
        }

        /* renamed from: p */
        public Builder h(Map.Entry entry) {
            super.h(entry);
            return this;
        }

        /* renamed from: q */
        public Builder i(Iterable iterable) {
            super.i(iterable);
            return this;
        }

        /* renamed from: r */
        public Builder j(Map map) {
            super.j(map);
            return this;
        }
    }

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
    }

    public static ImmutableBiMap t() {
        return RegularImmutableBiMap.I;
    }

    /* renamed from: r */
    public final ImmutableSet h() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: s */
    public abstract ImmutableBiMap q1();

    /* renamed from: u */
    public ImmutableSet values() {
        return q1().keySet();
    }
}
