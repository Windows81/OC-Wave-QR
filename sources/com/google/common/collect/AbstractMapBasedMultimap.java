package com.google.common.collect;

import WrappedCollection.WrappedIterator;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
    public transient Map D;
    public transient int E;

    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        public final transient Map C;

        public class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            public AsMapEntries() {
            }

            public boolean contains(Object obj) {
                return Collections2.g(AsMap.this.C.entrySet(), obj);
            }

            public Iterator iterator() {
                return new AsMapIterator();
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
                AbstractMapBasedMultimap.this.x(entry.getKey());
                return true;
            }
        }

        public class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: A  reason: collision with root package name */
            public Collection f27962A;

            /* renamed from: z  reason: collision with root package name */
            public final Iterator f27964z;

            public AsMapIterator() {
                this.f27964z = AsMap.this.C.entrySet().iterator();
            }

            /* renamed from: b */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f27964z.next();
                this.f27962A = (Collection) entry.getValue();
                return AsMap.this.g(entry);
            }

            public boolean hasNext() {
                return this.f27964z.hasNext();
            }

            public void remove() {
                Preconditions.x(this.f27962A != null, "no calls to next() since the last call to remove()");
                this.f27964z.remove();
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, this.f27962A.size());
                this.f27962A.clear();
                this.f27962A = null;
            }
        }

        public AsMap(Map map) {
            this.C = map;
        }

        public Set a() {
            return new AsMapEntries();
        }

        public void clear() {
            if (this.C == AbstractMapBasedMultimap.this.D) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.e(new AsMapIterator());
            }
        }

        public boolean containsKey(Object obj) {
            return Maps.H(this.C, obj);
        }

        /* renamed from: e */
        public Collection get(Object obj) {
            Collection collection = (Collection) Maps.I(this.C, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.z(obj, collection);
        }

        public boolean equals(Object obj) {
            return this == obj || this.C.equals(obj);
        }

        /* renamed from: f */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.C.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection r2 = AbstractMapBasedMultimap.this.r();
            r2.addAll(collection);
            AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, collection.size());
            collection.clear();
            return r2;
        }

        public Map.Entry g(Map.Entry entry) {
            Object key = entry.getKey();
            return Maps.t(key, AbstractMapBasedMultimap.this.z(key, (Collection) entry.getValue()));
        }

        public int hashCode() {
            return this.C.hashCode();
        }

        public Set keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        public int size() {
            return this.C.size();
        }

        public String toString() {
            return this.C.toString();
        }
    }

    public abstract class Itr<T> implements Iterator<T> {

        /* renamed from: A  reason: collision with root package name */
        public Object f27965A = null;

        /* renamed from: B  reason: collision with root package name */
        public Collection f27966B = null;
        public Iterator C = Iterators.o();

        /* renamed from: z  reason: collision with root package name */
        public final Iterator f27967z;

        public Itr() {
            this.f27967z = AbstractMapBasedMultimap.this.D.entrySet().iterator();
        }

        public abstract Object b(Object obj, Object obj2);

        public boolean hasNext() {
            return this.f27967z.hasNext() || this.C.hasNext();
        }

        public Object next() {
            if (!this.C.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f27967z.next();
                this.f27965A = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f27966B = collection;
                this.C = collection.iterator();
            }
            return b(NullnessCasts.a(this.f27965A), this.C.next());
        }

        public void remove() {
            this.C.remove();
            Collection collection = this.f27966B;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f27967z.remove();
            }
            AbstractMapBasedMultimap.l(AbstractMapBasedMultimap.this);
        }
    }

    public class KeySet extends Maps.KeySet<K, Collection<V>> {
        public KeySet(Map map) {
            super(map);
        }

        public void clear() {
            Iterators.e(iterator());
        }

        public boolean containsAll(Collection collection) {
            return m().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || m().keySet().equals(obj);
        }

        public int hashCode() {
            return m().keySet().hashCode();
        }

        public Iterator iterator() {
            final Iterator it = m().entrySet().iterator();
            return new Iterator<K>() {

                /* renamed from: z  reason: collision with root package name */
                public Map.Entry f27971z;

                public boolean hasNext() {
                    return it.hasNext();
                }

                public Object next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.f27971z = entry;
                    return entry.getKey();
                }

                public void remove() {
                    Preconditions.x(this.f27971z != null, "no calls to next() since the last call to remove()");
                    Collection collection = (Collection) this.f27971z.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, collection.size());
                    collection.clear();
                    this.f27971z = null;
                }
            };
        }

        public boolean remove(Object obj) {
            int i2;
            Collection collection = (Collection) m().remove(obj);
            if (collection != null) {
                i2 = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, i2);
            } else {
                i2 = 0;
            }
            return i2 > 0;
        }
    }

    public class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        public NavigableAsMap(NavigableMap navigableMap) {
            super(navigableMap);
        }

        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = j().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return g(ceilingEntry);
        }

        public Object ceilingKey(Object obj) {
            return j().ceilingKey(obj);
        }

        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap descendingMap() {
            return new NavigableAsMap(j().descendingMap());
        }

        public Map.Entry firstEntry() {
            Map.Entry firstEntry = j().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return g(firstEntry);
        }

        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = j().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return g(floorEntry);
        }

        public Object floorKey(Object obj) {
            return j().floorKey(obj);
        }

        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = j().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return g(higherEntry);
        }

        public Object higherKey(Object obj) {
            return j().higherKey(obj);
        }

        /* renamed from: k */
        public NavigableSet h() {
            return new NavigableKeySet(j());
        }

        public Map.Entry lastEntry() {
            Map.Entry lastEntry = j().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return g(lastEntry);
        }

        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = j().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return g(lowerEntry);
        }

        public Object lowerKey(Object obj) {
            return j().lowerKey(obj);
        }

        /* renamed from: m */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        /* renamed from: n */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        public NavigableSet navigableKeySet() {
            return keySet();
        }

        public Map.Entry o(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection r2 = AbstractMapBasedMultimap.this.r();
            r2.addAll((Collection) entry.getValue());
            it.remove();
            return Maps.t(entry.getKey(), AbstractMapBasedMultimap.this.y(r2));
        }

        /* renamed from: p */
        public NavigableMap j() {
            return (NavigableMap) super.j();
        }

        public Map.Entry pollFirstEntry() {
            return o(entrySet().iterator());
        }

        public Map.Entry pollLastEntry() {
            return o(descendingMap().entrySet().iterator());
        }

        /* renamed from: q */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        /* renamed from: r */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public NavigableMap headMap(Object obj, boolean z2) {
            return new NavigableAsMap(j().headMap(obj, z2));
        }

        public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return new NavigableAsMap(j().subMap(obj, z2, obj2, z3));
        }

        public NavigableMap tailMap(Object obj, boolean z2) {
            return new NavigableAsMap(j().tailMap(obj, z2));
        }
    }

    public class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        public NavigableKeySet(NavigableMap navigableMap) {
            super(navigableMap);
        }

        public Object ceiling(Object obj) {
            return n().ceilingKey(obj);
        }

        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet descendingSet() {
            return new NavigableKeySet(n().descendingMap());
        }

        public Object floor(Object obj) {
            return n().floorKey(obj);
        }

        public Object higher(Object obj) {
            return n().higherKey(obj);
        }

        public Object lower(Object obj) {
            return n().lowerKey(obj);
        }

        /* renamed from: o */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        /* renamed from: p */
        public NavigableMap n() {
            return (NavigableMap) super.n();
        }

        public Object pollFirst() {
            return Iterators.C(iterator());
        }

        public Object pollLast() {
            return Iterators.C(descendingIterator());
        }

        /* renamed from: q */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        /* renamed from: s */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public NavigableSet headSet(Object obj, boolean z2) {
            return new NavigableKeySet(n().headMap(obj, z2));
        }

        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return new NavigableKeySet(n().subMap(obj, z2, obj2, z3));
        }

        public NavigableSet tailSet(Object obj, boolean z2) {
            return new NavigableKeySet(n().tailMap(obj, z2));
        }
    }

    public class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
        public RandomAccessWrappedList(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, List list, WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }
    }

    public class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {
        public SortedSet E;

        public SortedAsMap(SortedMap sortedMap) {
            super(sortedMap);
        }

        public Comparator comparator() {
            return j().comparator();
        }

        public Object firstKey() {
            return j().firstKey();
        }

        /* renamed from: h */
        public SortedSet b() {
            return new SortedKeySet(j());
        }

        public SortedMap headMap(Object obj) {
            return new SortedAsMap(j().headMap(obj));
        }

        /* renamed from: i */
        public SortedSet keySet() {
            SortedSet sortedSet = this.E;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet h2 = b();
            this.E = h2;
            return h2;
        }

        public SortedMap j() {
            return (SortedMap) this.C;
        }

        public Object lastKey() {
            return j().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new SortedAsMap(j().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new SortedAsMap(j().tailMap(obj));
        }
    }

    public class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        public SortedKeySet(SortedMap sortedMap) {
            super(sortedMap);
        }

        public Comparator comparator() {
            return n().comparator();
        }

        public Object first() {
            return n().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new SortedKeySet(n().headMap(obj));
        }

        public Object last() {
            return n().lastKey();
        }

        public SortedMap n() {
            return (SortedMap) super.m();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new SortedKeySet(n().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new SortedKeySet(n().tailMap(obj));
        }
    }

    public class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        public WrappedNavigableSet(Object obj, NavigableSet navigableSet, WrappedCollection wrappedCollection) {
            super(obj, navigableSet, wrappedCollection);
        }

        public Object ceiling(Object obj) {
            return o().ceiling(obj);
        }

        public Iterator descendingIterator() {
            return new WrappedCollection.WrappedIterator(o().descendingIterator());
        }

        public NavigableSet descendingSet() {
            return q(o().descendingSet());
        }

        public Object floor(Object obj) {
            return o().floor(obj);
        }

        public NavigableSet headSet(Object obj, boolean z2) {
            return q(o().headSet(obj, z2));
        }

        public Object higher(Object obj) {
            return o().higher(obj);
        }

        public Object lower(Object obj) {
            return o().lower(obj);
        }

        /* renamed from: p */
        public NavigableSet o() {
            return (NavigableSet) super.o();
        }

        public Object pollFirst() {
            return Iterators.C(iterator());
        }

        public Object pollLast() {
            return Iterators.C(descendingIterator());
        }

        public final NavigableSet q(NavigableSet navigableSet) {
            return new WrappedNavigableSet(this.f27975z, navigableSet, g() == null ? this : g());
        }

        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return q(o().subSet(obj, z2, obj2, z3));
        }

        public NavigableSet tailSet(Object obj, boolean z2) {
            return q(o().tailSet(obj, z2));
        }
    }

    public class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        public WrappedSet(Object obj, Set set) {
            super(obj, set, (WrappedCollection) null);
        }

        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean m2 = Sets.m((Set) this.f27973A, collection);
            if (m2) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this, this.f27973A.size() - size);
                n();
            }
            return m2;
        }
    }

    public class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        public WrappedSortedSet(Object obj, SortedSet sortedSet, WrappedCollection wrappedCollection) {
            super(obj, sortedSet, wrappedCollection);
        }

        public Comparator comparator() {
            return o().comparator();
        }

        public Object first() {
            m();
            return o().first();
        }

        public SortedSet headSet(Object obj) {
            m();
            return new WrappedSortedSet(i(), o().headSet(obj), g() == null ? this : g());
        }

        public Object last() {
            m();
            return o().last();
        }

        public SortedSet o() {
            return (SortedSet) h();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            m();
            return new WrappedSortedSet(i(), o().subSet(obj, obj2), g() == null ? this : g());
        }

        public SortedSet tailSet(Object obj) {
            m();
            return new WrappedSortedSet(i(), o().tailSet(obj), g() == null ? this : g());
        }
    }

    public static /* synthetic */ int k(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i2 = abstractMapBasedMultimap.E;
        abstractMapBasedMultimap.E = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int l(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i2 = abstractMapBasedMultimap.E;
        abstractMapBasedMultimap.E = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int o(AbstractMapBasedMultimap abstractMapBasedMultimap, int i2) {
        int i3 = abstractMapBasedMultimap.E + i2;
        abstractMapBasedMultimap.E = i3;
        return i3;
    }

    public static /* synthetic */ int p(AbstractMapBasedMultimap abstractMapBasedMultimap, int i2) {
        int i3 = abstractMapBasedMultimap.E - i2;
        abstractMapBasedMultimap.E = i3;
        return i3;
    }

    public static Iterator w(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* access modifiers changed from: private */
    public void x(Object obj) {
        Collection collection = (Collection) Maps.J(this.D, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.E -= size;
        }
    }

    public final List A(Object obj, List list, WrappedCollection wrappedCollection) {
        return list instanceof RandomAccess ? new RandomAccessWrappedList(this, obj, list, wrappedCollection) : new WrappedList(obj, list, wrappedCollection);
    }

    public Map a() {
        return new AsMap(this.D);
    }

    public Collection b() {
        return this instanceof SetMultimap ? new AbstractMultimap.EntrySet(this) : new AbstractMultimap.Entries();
    }

    public Set c() {
        return new KeySet(this.D);
    }

    public void clear() {
        for (Collection clear : this.D.values()) {
            clear.clear();
        }
        this.D.clear();
        this.E = 0;
    }

    public boolean containsKey(Object obj) {
        return this.D.containsKey(obj);
    }

    public Collection d() {
        return new AbstractMultimap.Values();
    }

    public Iterator e() {
        return new AbstractMapBasedMultimap<K, V>.Itr<Map.Entry<K, V>>(this) {
            /* renamed from: c */
            public Map.Entry b(Object obj, Object obj2) {
                return Maps.t(obj, obj2);
            }
        };
    }

    public Iterator f() {
        return new AbstractMapBasedMultimap<K, V>.Itr<V>(this) {
            public Object b(Object obj, Object obj2) {
                return obj2;
            }
        };
    }

    public Collection get(Object obj) {
        Collection collection = (Collection) this.D.get(obj);
        if (collection == null) {
            collection = s(obj);
        }
        return z(obj, collection);
    }

    public Collection h(Object obj) {
        Collection collection = (Collection) this.D.remove(obj);
        if (collection == null) {
            return v();
        }
        Collection r2 = r();
        r2.addAll(collection);
        this.E -= collection.size();
        collection.clear();
        return y(r2);
    }

    public Collection m() {
        return super.m();
    }

    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.D.get(obj);
        if (collection == null) {
            Collection s2 = s(obj);
            if (s2.add(obj2)) {
                this.E++;
                this.D.put(obj, s2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.E++;
            return true;
        }
    }

    public abstract Collection r();

    public Collection s(Object obj) {
        return r();
    }

    public int size() {
        return this.E;
    }

    public final Map t() {
        Map map = this.D;
        return map instanceof NavigableMap ? new NavigableAsMap((NavigableMap) this.D) : map instanceof SortedMap ? new SortedAsMap((SortedMap) this.D) : new AsMap(this.D);
    }

    public final Set u() {
        Map map = this.D;
        return map instanceof NavigableMap ? new NavigableKeySet((NavigableMap) this.D) : map instanceof SortedMap ? new SortedKeySet((SortedMap) this.D) : new KeySet(this.D);
    }

    public Collection v() {
        return y(r());
    }

    public Collection y(Collection collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Collection z(Object obj, Collection collection) {
        return new WrappedCollection(obj, collection, (WrappedCollection) null);
    }

    public class WrappedCollection extends AbstractCollection<V> {

        /* renamed from: A  reason: collision with root package name */
        public Collection f27973A;

        /* renamed from: B  reason: collision with root package name */
        public final WrappedCollection f27974B;
        public final Collection C;

        /* renamed from: z  reason: collision with root package name */
        public final Object f27975z;

        public WrappedCollection(Object obj, Collection collection, WrappedCollection wrappedCollection) {
            this.f27975z = obj;
            this.f27973A = collection;
            this.f27974B = wrappedCollection;
            this.C = wrappedCollection == null ? null : wrappedCollection.h();
        }

        public boolean add(Object obj) {
            m();
            boolean isEmpty = this.f27973A.isEmpty();
            boolean add = this.f27973A.add(obj);
            if (add) {
                AbstractMapBasedMultimap.k(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    e();
                }
            }
            return add;
        }

        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f27973A.addAll(collection);
            if (addAll) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this, this.f27973A.size() - size);
                if (size == 0) {
                    e();
                }
            }
            return addAll;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f27973A.clear();
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, size);
                n();
            }
        }

        public boolean contains(Object obj) {
            m();
            return this.f27973A.contains(obj);
        }

        public boolean containsAll(Collection collection) {
            m();
            return this.f27973A.containsAll(collection);
        }

        public void e() {
            WrappedCollection wrappedCollection = this.f27974B;
            if (wrappedCollection != null) {
                wrappedCollection.e();
            } else {
                AbstractMapBasedMultimap.this.D.put(this.f27975z, this.f27973A);
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m();
            return this.f27973A.equals(obj);
        }

        public WrappedCollection g() {
            return this.f27974B;
        }

        public Collection h() {
            return this.f27973A;
        }

        public int hashCode() {
            m();
            return this.f27973A.hashCode();
        }

        public Object i() {
            return this.f27975z;
        }

        public Iterator iterator() {
            m();
            return new WrappedIterator();
        }

        public void m() {
            Collection collection;
            WrappedCollection wrappedCollection = this.f27974B;
            if (wrappedCollection != null) {
                wrappedCollection.m();
                if (this.f27974B.h() != this.C) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f27973A.isEmpty() && (collection = (Collection) AbstractMapBasedMultimap.this.D.get(this.f27975z)) != null) {
                this.f27973A = collection;
            }
        }

        public void n() {
            WrappedCollection wrappedCollection = this.f27974B;
            if (wrappedCollection != null) {
                wrappedCollection.n();
            } else if (this.f27973A.isEmpty()) {
                AbstractMapBasedMultimap.this.D.remove(this.f27975z);
            }
        }

        public boolean remove(Object obj) {
            m();
            boolean remove = this.f27973A.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.l(AbstractMapBasedMultimap.this);
                n();
            }
            return remove;
        }

        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f27973A.removeAll(collection);
            if (removeAll) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this, this.f27973A.size() - size);
                n();
            }
            return removeAll;
        }

        public boolean retainAll(Collection collection) {
            Preconditions.q(collection);
            int size = size();
            boolean retainAll = this.f27973A.retainAll(collection);
            if (retainAll) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this, this.f27973A.size() - size);
                n();
            }
            return retainAll;
        }

        public int size() {
            m();
            return this.f27973A.size();
        }

        public String toString() {
            m();
            return this.f27973A.toString();
        }

        public class WrappedIterator implements Iterator<V> {

            /* renamed from: A  reason: collision with root package name */
            public final Collection f27976A;

            /* renamed from: z  reason: collision with root package name */
            public final Iterator f27978z;

            public WrappedIterator() {
                Collection collection = WrappedCollection.this.f27973A;
                this.f27976A = collection;
                this.f27978z = AbstractMapBasedMultimap.w(collection);
            }

            public Iterator b() {
                c();
                return this.f27978z;
            }

            public void c() {
                WrappedCollection.this.m();
                if (WrappedCollection.this.f27973A != this.f27976A) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                c();
                return this.f27978z.hasNext();
            }

            public Object next() {
                c();
                return this.f27978z.next();
            }

            public void remove() {
                this.f27978z.remove();
                AbstractMapBasedMultimap.l(AbstractMapBasedMultimap.this);
                WrappedCollection.this.n();
            }

            public WrappedIterator(Iterator it) {
                this.f27976A = WrappedCollection.this.f27973A;
                this.f27978z = it;
            }
        }
    }

    public class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {

        public class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedIterator implements ListIterator<V> {
            public WrappedListIterator() {
                super();
            }

            public void add(Object obj) {
                boolean isEmpty = WrappedList.this.isEmpty();
                d().add(obj);
                AbstractMapBasedMultimap.k(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    WrappedList.this.e();
                }
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.AbstractMapBasedMultimap$WrappedList$WrappedListIterator, com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection$WrappedIterator] */
            public final ListIterator d() {
                return (ListIterator) b();
            }

            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            public int nextIndex() {
                return d().nextIndex();
            }

            public Object previous() {
                return d().previous();
            }

            public int previousIndex() {
                return d().previousIndex();
            }

            public void set(Object obj) {
                d().set(obj);
            }

            public WrappedListIterator(int i2) {
                super(WrappedList.this.o().listIterator(i2));
            }
        }

        public WrappedList(Object obj, List list, WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }

        public void add(int i2, Object obj) {
            m();
            boolean isEmpty = h().isEmpty();
            o().add(i2, obj);
            AbstractMapBasedMultimap.k(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                e();
            }
        }

        public boolean addAll(int i2, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = o().addAll(i2, collection);
            if (addAll) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this, h().size() - size);
                if (size == 0) {
                    e();
                }
            }
            return addAll;
        }

        public Object get(int i2) {
            m();
            return o().get(i2);
        }

        public int indexOf(Object obj) {
            m();
            return o().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            m();
            return o().lastIndexOf(obj);
        }

        public ListIterator listIterator() {
            m();
            return new WrappedListIterator();
        }

        public List o() {
            return (List) h();
        }

        public Object remove(int i2) {
            m();
            Object remove = o().remove(i2);
            AbstractMapBasedMultimap.l(AbstractMapBasedMultimap.this);
            n();
            return remove;
        }

        public Object set(int i2, Object obj) {
            m();
            return o().set(i2, obj);
        }

        public List subList(int i2, int i3) {
            m();
            return AbstractMapBasedMultimap.this.A(i(), o().subList(i2, i3), g() == null ? this : g());
        }

        public ListIterator listIterator(int i2) {
            m();
            return new WrappedListIterator(i2);
        }
    }
}
