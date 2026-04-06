package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {
    public static final Comparator G = Ordering.e();
    public static final ImmutableSortedMap H = new ImmutableSortedMap(ImmutableSortedSet.S(Ordering.e()), ImmutableList.D());
    public final transient RegularImmutableSortedSet D;
    public final transient ImmutableList E;
    public transient ImmutableSortedMap F;

    /* renamed from: com.google.common.collect.ImmutableSortedMap$1  reason: invalid class name */
    class AnonymousClass1 implements Comparator<Map.Entry<Object, Object>> {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Comparator f28206z;

        /* renamed from: a */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            Objects.requireNonNull(entry);
            Objects.requireNonNull(entry2);
            return this.f28206z.compare(entry.getKey(), entry2.getKey());
        }
    }

    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {

        /* renamed from: f  reason: collision with root package name */
        public transient Object[] f28209f;

        /* renamed from: g  reason: collision with root package name */
        public transient Object[] f28210g;

        /* renamed from: h  reason: collision with root package name */
        public final Comparator f28211h;

        public final void e(int i2) {
            Object[] objArr = this.f28209f;
            if (i2 > objArr.length) {
                int d2 = ImmutableCollection.Builder.d(objArr.length, i2);
                this.f28209f = Arrays.copyOf(this.f28209f, d2);
                this.f28210g = Arrays.copyOf(this.f28210g, d2);
            }
        }

        /* renamed from: l */
        public ImmutableSortedMap a() {
            return d();
        }

        /* renamed from: m */
        public final ImmutableSortedMap c() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        /* renamed from: n */
        public ImmutableSortedMap d() {
            int i2 = this.f28153c;
            if (i2 == 0) {
                return ImmutableSortedMap.w(this.f28211h);
            }
            if (i2 != 1) {
                Object[] copyOf = Arrays.copyOf(this.f28209f, i2);
                Arrays.sort(copyOf, this.f28211h);
                Object[] objArr = new Object[this.f28153c];
                for (int i3 = 0; i3 < this.f28153c; i3++) {
                    if (i3 > 0) {
                        int i4 = i3 - 1;
                        if (this.f28211h.compare(copyOf[i4], copyOf[i3]) == 0) {
                            String valueOf = String.valueOf(copyOf[i4]);
                            String valueOf2 = String.valueOf(copyOf[i3]);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
                            sb.append("keys required to be distinct but compared as equal: ");
                            sb.append(valueOf);
                            sb.append(" and ");
                            sb.append(valueOf2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    Object obj = this.f28209f[i3];
                    Objects.requireNonNull(obj);
                    int binarySearch = Arrays.binarySearch(copyOf, obj, this.f28211h);
                    Object obj2 = this.f28210g[i3];
                    Objects.requireNonNull(obj2);
                    objArr[binarySearch] = obj2;
                }
                return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.p(copyOf), this.f28211h), ImmutableList.p(objArr));
            }
            Comparator comparator = this.f28211h;
            Object obj3 = this.f28209f[0];
            Objects.requireNonNull(obj3);
            Object obj4 = this.f28210g[0];
            Objects.requireNonNull(obj4);
            return ImmutableSortedMap.D(comparator, obj3, obj4);
        }

        /* renamed from: o */
        public Builder g(Object obj, Object obj2) {
            e(this.f28153c + 1);
            CollectPreconditions.a(obj, obj2);
            Object[] objArr = this.f28209f;
            int i2 = this.f28153c;
            objArr[i2] = obj;
            this.f28210g[i2] = obj2;
            this.f28153c = i2 + 1;
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

    public ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList) {
        this(regularImmutableSortedSet, immutableList, (ImmutableSortedMap) null);
    }

    public static ImmutableSortedMap C() {
        return H;
    }

    public static ImmutableSortedMap D(Comparator comparator, Object obj, Object obj2) {
        return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.E(obj), (Comparator) Preconditions.q(comparator)), ImmutableList.E(obj2));
    }

    public static ImmutableSortedMap w(Comparator comparator) {
        return Ordering.e().equals(comparator) ? C() : new ImmutableSortedMap(ImmutableSortedSet.S(comparator), ImmutableList.D());
    }

    /* renamed from: A */
    public ImmutableSortedSet n() {
        return this.D;
    }

    /* renamed from: B */
    public ImmutableSortedSet navigableKeySet() {
        return this.D;
    }

    /* renamed from: E */
    public ImmutableSortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    /* renamed from: F */
    public ImmutableSortedMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
        Preconditions.q(obj);
        Preconditions.q(obj2);
        Preconditions.l(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z3).tailMap(obj, z2);
    }

    /* renamed from: G */
    public ImmutableSortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    /* renamed from: I */
    public ImmutableSortedMap tailMap(Object obj, boolean z2) {
        return x(this.D.l0(Preconditions.q(obj), z2), size());
    }

    public Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public Object ceilingKey(Object obj) {
        return Maps.x(ceilingEntry(obj));
    }

    public Comparator comparator() {
        return n().comparator();
    }

    public ImmutableSet f() {
        return isEmpty() ? ImmutableSet.D() : new ImmutableMapEntrySet<K, V>() {
            public ImmutableList B() {
                return new ImmutableList<Map.Entry<K, V>>() {
                    /* renamed from: Q */
                    public Map.Entry get(int i2) {
                        return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.D.e().get(i2), ImmutableSortedMap.this.E.get(i2));
                    }

                    public boolean n() {
                        return true;
                    }

                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }
                };
            }

            public ImmutableMap K() {
                return ImmutableSortedMap.this;
            }

            /* renamed from: o */
            public UnmodifiableIterator iterator() {
                return e().iterator();
            }
        };
    }

    public Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().e().get(0);
    }

    public Object firstKey() {
        return n().first();
    }

    public Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public Object floorKey(Object obj) {
        return Maps.x(floorEntry(obj));
    }

    public ImmutableSet g() {
        throw new AssertionError("should never be called");
    }

    public Object get(Object obj) {
        int indexOf = this.D.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.E.get(indexOf);
    }

    public ImmutableCollection h() {
        throw new AssertionError("should never be called");
    }

    public Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public Object higherKey(Object obj) {
        return Maps.x(higherEntry(obj));
    }

    /* renamed from: i */
    public ImmutableSet entrySet() {
        return super.entrySet();
    }

    public boolean k() {
        return this.D.n() || this.E.n();
    }

    public Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().e().get(size() - 1);
    }

    public Object lastKey() {
        return n().last();
    }

    public Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public Object lowerKey(Object obj) {
        return Maps.x(lowerEntry(obj));
    }

    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public ImmutableCollection values() {
        return this.E;
    }

    public int size() {
        return this.E.size();
    }

    /* renamed from: u */
    public ImmutableSortedSet descendingKeySet() {
        return this.D.descendingSet();
    }

    /* renamed from: v */
    public ImmutableSortedMap descendingMap() {
        ImmutableSortedMap immutableSortedMap = this.F;
        return immutableSortedMap == null ? isEmpty() ? w(Ordering.a(comparator()).j()) : new ImmutableSortedMap((RegularImmutableSortedSet) this.D.descendingSet(), this.E.K(), this) : immutableSortedMap;
    }

    public final ImmutableSortedMap x(int i2, int i3) {
        return (i2 == 0 && i3 == size()) ? this : i2 == i3 ? w(comparator()) : new ImmutableSortedMap(this.D.j0(i2, i3), this.E.subList(i2, i3));
    }

    /* renamed from: y */
    public ImmutableSortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    /* renamed from: z */
    public ImmutableSortedMap headMap(Object obj, boolean z2) {
        return x(0, this.D.k0(Preconditions.q(obj), z2));
    }

    public ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList, ImmutableSortedMap immutableSortedMap) {
        this.D = regularImmutableSortedSet;
        this.E = immutableList;
        this.F = immutableSortedMap;
    }
}
