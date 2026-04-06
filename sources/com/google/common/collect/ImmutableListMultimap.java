package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        public ImmutableListMultimap d() {
            return (ImmutableListMultimap) super.a();
        }

        public Builder e(Object obj, Object obj2) {
            super.c(obj, obj2);
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap immutableMap, int i2) {
        super(immutableMap, i2);
    }

    public static Builder u() {
        return new Builder();
    }

    public static ImmutableListMultimap v(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return x();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            ImmutableList w2 = comparator == null ? ImmutableList.w(collection2) : ImmutableList.L(comparator, collection2);
            if (!w2.isEmpty()) {
                builder.g(key, w2);
                i2 += w2.size();
            }
        }
        return new ImmutableListMultimap(builder.d(), i2);
    }

    public static ImmutableListMultimap x() {
        return EmptyImmutableListMultimap.F;
    }

    public static ImmutableListMultimap y(Object obj, Object obj2) {
        Builder u2 = u();
        u2.e(obj, obj2);
        return u2.d();
    }

    /* renamed from: w */
    public ImmutableList p(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.D.get(obj);
        return immutableList == null ? ImmutableList.D() : immutableList;
    }

    /* renamed from: z */
    public final ImmutableList s(Object obj) {
        throw new UnsupportedOperationException();
    }
}
