package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
public final class Multimaps {

    public static final class AsMap<K, V> extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        public final Multimap C;

        public class EntrySet extends Maps.EntrySet<K, Collection<V>> {
            public EntrySet() {
            }

            public Iterator iterator() {
                return Maps.k(AsMap.this.C.keySet(), new Function<K, Collection<V>>() {
                    /* renamed from: a */
                    public Collection apply(Object obj) {
                        return AsMap.this.C.get(obj);
                    }
                });
            }

            public Map m() {
                return AsMap.this;
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AsMap.this.h(entry.getKey());
                return true;
            }
        }

        public AsMap(Multimap multimap) {
            this.C = (Multimap) Preconditions.q(multimap);
        }

        public Set a() {
            return new EntrySet();
        }

        public void clear() {
            this.C.clear();
        }

        public boolean containsKey(Object obj) {
            return this.C.containsKey(obj);
        }

        /* renamed from: f */
        public Collection get(Object obj) {
            if (containsKey(obj)) {
                return this.C.get(obj);
            }
            return null;
        }

        /* renamed from: g */
        public Collection remove(Object obj) {
            if (containsKey(obj)) {
                return this.C.h(obj);
            }
            return null;
        }

        public void h(Object obj) {
            this.C.keySet().remove(obj);
        }

        public boolean isEmpty() {
            return this.C.isEmpty();
        }

        public Set keySet() {
            return this.C.keySet();
        }

        public int size() {
            return this.C.keySet().size();
        }
    }

    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        public transient Supplier F;

        /* renamed from: C */
        public List r() {
            return (List) this.F.get();
        }

        public Map a() {
            return t();
        }

        public Set c() {
            return u();
        }
    }

    public static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
        public transient Supplier F;

        public Map a() {
            return t();
        }

        public Set c() {
            return u();
        }

        public Collection r() {
            return (Collection) this.F.get();
        }

        public Collection y(Collection collection) {
            return collection instanceof NavigableSet ? Sets.p((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        public Collection z(Object obj, Collection collection) {
            return collection instanceof List ? A(obj, (List) collection, (AbstractMapBasedMultimap.WrappedCollection) null) : collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, (AbstractMapBasedMultimap.WrappedCollection) null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, (AbstractMapBasedMultimap.WrappedCollection) null) : collection instanceof Set ? new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection) : new AbstractMapBasedMultimap.WrappedCollection(obj, collection, (AbstractMapBasedMultimap.WrappedCollection) null);
        }
    }

    public static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        public transient Supplier F;

        /* renamed from: C */
        public Set r() {
            return (Set) this.F.get();
        }

        public Map a() {
            return t();
        }

        public Set c() {
            return u();
        }

        public Collection y(Collection collection) {
            return collection instanceof NavigableSet ? Sets.p((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        public Collection z(Object obj, Collection collection) {
            return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, (AbstractMapBasedMultimap.WrappedCollection) null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, (AbstractMapBasedMultimap.WrappedCollection) null) : new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection);
        }
    }

    public static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        public transient Supplier F;

        /* renamed from: G */
        public SortedSet r() {
            return (SortedSet) this.F.get();
        }

        public Map a() {
            return t();
        }

        public Set c() {
            return u();
        }
    }

    public static abstract class Entries<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public void clear() {
            e().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e().F(entry.getKey(), entry.getValue());
        }

        public abstract Multimap e();

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e().remove(entry.getKey(), entry.getValue());
        }

        public int size() {
            return e().size();
        }
    }

    public static class Keys<K, V> extends AbstractMultiset<K> {

        /* renamed from: B  reason: collision with root package name */
        public final Multimap f28440B;

        public int L0(Object obj) {
            Collection collection = (Collection) Maps.I(this.f28440B.E(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public int N(Object obj, int i2) {
            CollectPreconditions.b(i2, "occurrences");
            if (i2 == 0) {
                return L0(obj);
            }
            Collection collection = (Collection) Maps.I(this.f28440B.E(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i2 >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i3 = 0; i3 < i2; i3++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        public void clear() {
            this.f28440B.clear();
        }

        public boolean contains(Object obj) {
            return this.f28440B.containsKey(obj);
        }

        public int h() {
            return this.f28440B.E().size();
        }

        public Iterator i() {
            throw new AssertionError("should never be called");
        }

        public Iterator iterator() {
            return Maps.w(this.f28440B.m().iterator());
        }

        public Set k() {
            return this.f28440B.keySet();
        }

        public Iterator m() {
            return new TransformedIterator<Map.Entry<K, Collection<V>>, Multiset.Entry<K>>(this, this.f28440B.E().entrySet().iterator()) {
                /* renamed from: c */
                public Multiset.Entry b(final Map.Entry entry) {
                    return new Multisets.AbstractEntry<K>(this) {
                        public Object a() {
                            return entry.getKey();
                        }

                        public int getCount() {
                            return ((Collection) entry.getValue()).size();
                        }
                    };
                }
            };
        }

        public int size() {
            return this.f28440B.size();
        }
    }

    public static class MapMultimap<K, V> extends AbstractMultimap<K, V> implements SetMultimap<K, V>, Serializable {
        public final Map D;

        public boolean F(Object obj, Object obj2) {
            return this.D.entrySet().contains(Maps.t(obj, obj2));
        }

        public Map a() {
            return new AsMap(this);
        }

        public Collection b() {
            throw new AssertionError("unreachable");
        }

        public Set c() {
            return this.D.keySet();
        }

        public void clear() {
            this.D.clear();
        }

        public boolean containsKey(Object obj) {
            return this.D.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return this.D.containsValue(obj);
        }

        public Collection d() {
            return this.D.values();
        }

        public Iterator e() {
            return this.D.entrySet().iterator();
        }

        public int hashCode() {
            return this.D.hashCode();
        }

        public boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            return this.D.entrySet().remove(Maps.t(obj, obj2));
        }

        public int size() {
            return this.D.size();
        }

        public Set get(final Object obj) {
            return new Sets.ImprovedAbstractSet<V>() {
                public Iterator iterator() {
                    return new Iterator<V>() {

                        /* renamed from: z  reason: collision with root package name */
                        public int f28445z;

                        public boolean hasNext() {
                            if (this.f28445z == 0) {
                                AnonymousClass1 r0 = AnonymousClass1.this;
                                if (MapMultimap.this.D.containsKey(obj)) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        public Object next() {
                            if (hasNext()) {
                                this.f28445z++;
                                AnonymousClass1 r0 = AnonymousClass1.this;
                                return NullnessCasts.a(MapMultimap.this.D.get(obj));
                            }
                            throw new NoSuchElementException();
                        }

                        public void remove() {
                            boolean z2 = true;
                            if (this.f28445z != 1) {
                                z2 = false;
                            }
                            CollectPreconditions.e(z2);
                            this.f28445z = -1;
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            MapMultimap.this.D.remove(obj);
                        }
                    };
                }

                public int size() {
                    return MapMultimap.this.D.containsKey(obj) ? 1 : 0;
                }
            };
        }

        public Set h(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.D.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.D.remove(obj));
            return hashSet;
        }

        public Set m() {
            return this.D.entrySet();
        }
    }

    public static final class TransformedEntriesListMultimap<K, V1, V2> extends TransformedEntriesMultimap<K, V1, V2> implements ListMultimap<K, V2> {
        public TransformedEntriesListMultimap(ListMultimap listMultimap, Maps.EntryTransformer entryTransformer) {
            super(listMultimap, entryTransformer);
        }

        /* renamed from: j */
        public List i(Object obj, Collection collection) {
            return Lists.n((List) collection, Maps.l(this.E, obj));
        }

        public List get(Object obj) {
            return i(obj, this.D.get(obj));
        }

        public List h(Object obj) {
            return i(obj, this.D.h(obj));
        }
    }

    public static class TransformedEntriesMultimap<K, V1, V2> extends AbstractMultimap<K, V2> {
        public final Multimap D;
        public final Maps.EntryTransformer E;

        public TransformedEntriesMultimap(Multimap multimap, Maps.EntryTransformer entryTransformer) {
            this.D = (Multimap) Preconditions.q(multimap);
            this.E = (Maps.EntryTransformer) Preconditions.q(entryTransformer);
        }

        public Map a() {
            return Maps.L(this.D.E(), new Maps.EntryTransformer<K, Collection<V1>, Collection<V2>>() {
                /* renamed from: b */
                public Collection a(Object obj, Collection collection) {
                    return TransformedEntriesMultimap.this.i(obj, collection);
                }
            });
        }

        public Collection b() {
            return new AbstractMultimap.Entries();
        }

        public Set c() {
            return this.D.keySet();
        }

        public void clear() {
            this.D.clear();
        }

        public boolean containsKey(Object obj) {
            return this.D.containsKey(obj);
        }

        public Collection d() {
            return Collections2.j(this.D.m(), Maps.f(this.E));
        }

        public Iterator e() {
            return Iterators.J(this.D.m().iterator(), Maps.e(this.E));
        }

        public Collection get(Object obj) {
            return i(obj, this.D.get(obj));
        }

        public Collection h(Object obj) {
            return i(obj, this.D.h(obj));
        }

        public Collection i(Object obj, Collection collection) {
            Function l2 = Maps.l(this.E, obj);
            return collection instanceof List ? Lists.n((List) collection, l2) : Collections2.j(collection, l2);
        }

        public boolean isEmpty() {
            return this.D.isEmpty();
        }

        public boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        public int size() {
            return this.D.size();
        }
    }

    public static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements ListMultimap<K, V> {
        /* renamed from: R */
        public ListMultimap Q() {
            return (ListMultimap) super.M();
        }

        public List get(Object obj) {
            return Collections.unmodifiableList(Q().get(obj));
        }

        public List h(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static class UnmodifiableMultimap<K, V> extends ForwardingMultimap<K, V> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public transient Collection f28447A;

        /* renamed from: B  reason: collision with root package name */
        public transient Set f28448B;
        public transient Map C;

        /* renamed from: z  reason: collision with root package name */
        public final Multimap f28449z;

        public Map E() {
            Map map = this.C;
            if (map != null) {
                return map;
            }
            Map unmodifiableMap = Collections.unmodifiableMap(Maps.P(this.f28449z.E(), new Function<Collection<V>, Collection<V>>(this) {
                /* renamed from: a */
                public Collection apply(Collection collection) {
                    return Multimaps.g(collection);
                }
            }));
            this.C = unmodifiableMap;
            return unmodifiableMap;
        }

        /* renamed from: Q */
        public Multimap M() {
            return this.f28449z;
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Collection get(Object obj) {
            return Multimaps.g(this.f28449z.get(obj));
        }

        public Collection h(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Set keySet() {
            Set set = this.f28448B;
            if (set != null) {
                return set;
            }
            Set unmodifiableSet = Collections.unmodifiableSet(this.f28449z.keySet());
            this.f28448B = unmodifiableSet;
            return unmodifiableSet;
        }

        public Collection m() {
            Collection collection = this.f28447A;
            if (collection != null) {
                return collection;
            }
            Collection b2 = Multimaps.f(this.f28449z.m());
            this.f28447A = b2;
            return b2;
        }

        public boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    public static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements SetMultimap<K, V> {
        /* renamed from: R */
        public SetMultimap Q() {
            return (SetMultimap) super.M();
        }

        public Set get(Object obj) {
            return Collections.unmodifiableSet(Q().get(obj));
        }

        public Set h(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Set m() {
            return Maps.T(Q().m());
        }
    }

    public static boolean c(Multimap multimap, Object obj) {
        if (obj == multimap) {
            return true;
        }
        if (obj instanceof Multimap) {
            return multimap.E().equals(((Multimap) obj).E());
        }
        return false;
    }

    public static ListMultimap d(ListMultimap listMultimap, Maps.EntryTransformer entryTransformer) {
        return new TransformedEntriesListMultimap(listMultimap, entryTransformer);
    }

    public static ListMultimap e(ListMultimap listMultimap, Function function) {
        Preconditions.q(function);
        return d(listMultimap, Maps.g(function));
    }

    public static Collection f(Collection collection) {
        return collection instanceof Set ? Maps.T((Set) collection) : new Maps.UnmodifiableEntries(Collections.unmodifiableCollection(collection));
    }

    public static Collection g(Collection collection) {
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        /* renamed from: S */
        public SortedSetMultimap R() {
            return (SortedSetMultimap) super.Q();
        }

        public SortedSet get(Object obj) {
            return Collections.unmodifiableSortedSet(R().get(obj));
        }

        public SortedSet h(Object obj) {
            throw new UnsupportedOperationException();
        }
    }
}
