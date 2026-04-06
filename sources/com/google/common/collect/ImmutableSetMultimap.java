package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Serialization;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {
    public final transient ImmutableSet F;
    public transient ImmutableSet G;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        public Collection b() {
            return Platform.e();
        }

        public ImmutableSetMultimap d() {
            Collection entrySet = this.f28174a.entrySet();
            Comparator comparator = this.f28175b;
            if (comparator != null) {
                entrySet = Ordering.a(comparator).h().b(entrySet);
            }
            return ImmutableSetMultimap.w(entrySet, this.f28176c);
        }
    }

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: B  reason: collision with root package name */
        public final transient ImmutableSetMultimap f28204B;

        public EntrySet(ImmutableSetMultimap immutableSetMultimap) {
            this.f28204B = immutableSetMultimap;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f28204B.F(entry.getKey(), entry.getValue());
        }

        public boolean n() {
            return false;
        }

        /* renamed from: o */
        public UnmodifiableIterator iterator() {
            return this.f28204B.e();
        }

        public int size() {
            return this.f28204B.size();
        }
    }

    public static final class SetFieldSettersHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final Serialization.FieldSetter f28205a = Serialization.a(ImmutableSetMultimap.class, "emptySet");
    }

    public ImmutableSetMultimap(ImmutableMap immutableMap, int i2, Comparator comparator) {
        super(immutableMap, i2);
        this.F = u(comparator);
    }

    public static ImmutableSet A(Comparator comparator, Collection collection) {
        return comparator == null ? ImmutableSet.z(collection) : ImmutableSortedSet.M(comparator, collection);
    }

    public static ImmutableSet u(Comparator comparator) {
        return comparator == null ? ImmutableSet.D() : ImmutableSortedSet.S(comparator);
    }

    public static ImmutableSetMultimap w(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return y();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ImmutableSet A2 = A(comparator, (Collection) entry.getValue());
            if (!A2.isEmpty()) {
                builder.g(key, A2);
                i2 += A2.size();
            }
        }
        return new ImmutableSetMultimap(builder.d(), i2, comparator);
    }

    public static ImmutableSetMultimap y() {
        return EmptyImmutableSetMultimap.H;
    }

    /* renamed from: v */
    public ImmutableSet m() {
        ImmutableSet immutableSet = this.G;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.G = entrySet;
        return entrySet;
    }

    /* renamed from: x */
    public ImmutableSet p(Object obj) {
        return (ImmutableSet) MoreObjects.a((ImmutableSet) this.D.get(obj), this.F);
    }

    /* renamed from: z */
    public final ImmutableSet s(Object obj) {
        throw new UnsupportedOperationException();
    }
}
