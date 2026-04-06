package com.google.common.collect;

import com.google.common.base.Converter;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
public final class Maps {

    public static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {
        public final Map C;
        public final Predicate D;

        public AbstractFilteredMap(Map map, Predicate predicate) {
            this.C = map;
            this.D = predicate;
        }

        public Collection c() {
            return new FilteredMapValues(this, this.C, this.D);
        }

        public boolean containsKey(Object obj) {
            return this.C.containsKey(obj) && e(obj, this.C.get(obj));
        }

        public boolean e(Object obj, Object obj2) {
            return this.D.apply(Maps.t(obj, obj2));
        }

        public Object get(Object obj) {
            Object obj2 = this.C.get(obj);
            if (obj2 == null || !e(obj, obj2)) {
                return null;
            }
            return obj2;
        }

        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        public Object put(Object obj, Object obj2) {
            Preconditions.d(e(obj, obj2));
            return this.C.put(obj, obj2);
        }

        public void putAll(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                Preconditions.d(e(entry.getKey(), entry.getValue()));
            }
            this.C.putAll(map);
        }

        public Object remove(Object obj) {
            if (containsKey(obj)) {
                return this.C.remove(obj);
            }
            return null;
        }
    }

    public static class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {
        public final Set C;
        public final Function D;

        public AsMapView(Set set, Function function) {
            this.C = (Set) Preconditions.q(set);
            this.D = (Function) Preconditions.q(function);
        }

        public Set a() {
            return new EntrySet<K, V>() {
                public Iterator iterator() {
                    return Maps.k(AsMapView.this.e(), AsMapView.this.D);
                }

                public Map m() {
                    return AsMapView.this;
                }
            };
        }

        public Set b() {
            return Maps.F(e());
        }

        public Collection c() {
            return Collections2.j(this.C, this.D);
        }

        public void clear() {
            e().clear();
        }

        public boolean containsKey(Object obj) {
            return e().contains(obj);
        }

        public Set e() {
            return this.C;
        }

        public Object get(Object obj) {
            if (Collections2.g(e(), obj)) {
                return this.D.apply(obj);
            }
            return null;
        }

        public Object remove(Object obj) {
            if (e().remove(obj)) {
                return this.D.apply(obj);
            }
            return null;
        }

        public int size() {
            return e().size();
        }
    }

    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final BiMap f28377A;

        public static Object h(BiMap biMap, Object obj) {
            Object obj2 = biMap.get(obj);
            Preconditions.j(obj2 != null, "No non-null mapping present for input: %s", obj);
            return obj2;
        }

        public Object d(Object obj) {
            return h(this.f28377A.q1(), obj);
        }

        public Object e(Object obj) {
            return h(this.f28377A, obj);
        }

        public boolean equals(Object obj) {
            if (obj instanceof BiMapConverter) {
                return this.f28377A.equals(((BiMapConverter) obj).f28377A);
            }
            return false;
        }

        public int hashCode() {
            return this.f28377A.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28377A);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18);
            sb.append("Maps.asConverter(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public transient Set f28378A;

        /* renamed from: B  reason: collision with root package name */
        public transient NavigableSet f28379B;

        /* renamed from: z  reason: collision with root package name */
        public transient Comparator f28380z;

        private static Ordering W(Comparator comparator) {
            return Ordering.a(comparator).j();
        }

        /* renamed from: Q */
        public final Map M() {
            return V();
        }

        public Set S() {
            return new EntrySet<K, V>() {
                public Iterator iterator() {
                    return DescendingMap.this.U();
                }

                public Map m() {
                    return DescendingMap.this;
                }
            };
        }

        public abstract Iterator U();

        public abstract NavigableMap V();

        public Map.Entry ceilingEntry(Object obj) {
            return V().floorEntry(obj);
        }

        public Object ceilingKey(Object obj) {
            return V().floorKey(obj);
        }

        public Comparator comparator() {
            Comparator comparator = this.f28380z;
            if (comparator != null) {
                return comparator;
            }
            Comparator comparator2 = V().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.e();
            }
            Ordering W = W(comparator2);
            this.f28380z = W;
            return W;
        }

        public NavigableSet descendingKeySet() {
            return V().navigableKeySet();
        }

        public NavigableMap descendingMap() {
            return V();
        }

        public Set entrySet() {
            Set set = this.f28378A;
            if (set != null) {
                return set;
            }
            Set S = S();
            this.f28378A = S;
            return S;
        }

        public Map.Entry firstEntry() {
            return V().lastEntry();
        }

        public Object firstKey() {
            return V().lastKey();
        }

        public Map.Entry floorEntry(Object obj) {
            return V().ceilingEntry(obj);
        }

        public Object floorKey(Object obj) {
            return V().ceilingKey(obj);
        }

        public NavigableMap headMap(Object obj, boolean z2) {
            return V().tailMap(obj, z2).descendingMap();
        }

        public Map.Entry higherEntry(Object obj) {
            return V().lowerEntry(obj);
        }

        public Object higherKey(Object obj) {
            return V().lowerKey(obj);
        }

        public Set keySet() {
            return navigableKeySet();
        }

        public Map.Entry lastEntry() {
            return V().firstEntry();
        }

        public Object lastKey() {
            return V().firstKey();
        }

        public Map.Entry lowerEntry(Object obj) {
            return V().higherEntry(obj);
        }

        public Object lowerKey(Object obj) {
            return V().higherKey(obj);
        }

        public NavigableSet navigableKeySet() {
            NavigableSet navigableSet = this.f28379B;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableKeySet navigableKeySet = new NavigableKeySet(this);
            this.f28379B = navigableKeySet;
            return navigableKeySet;
        }

        public Map.Entry pollFirstEntry() {
            return V().pollLastEntry();
        }

        public Map.Entry pollLastEntry() {
            return V().pollFirstEntry();
        }

        public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return V().subMap(obj2, z3, obj, z2).descendingMap();
        }

        public NavigableMap tailMap(Object obj, boolean z2) {
            return V().headMap(obj, z2).descendingMap();
        }

        public String toString() {
            return R();
        }

        public Collection values() {
            return new Values(this);
        }

        public SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        public SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    public enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        KEY {
            /* renamed from: f */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: f */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }
    }

    public static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        public void clear() {
            m().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object I = Maps.I(m(), key);
            if (Objects.a(I, entry.getValue())) {
                return I != null || m().containsKey(key);
            }
            return false;
        }

        public boolean isEmpty() {
            return m().isEmpty();
        }

        public abstract Map m();

        public boolean remove(Object obj) {
            if (!contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            return m().keySet().remove(((Map.Entry) obj).getKey());
        }

        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.q(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.n(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.q(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet i2 = Sets.i(collection.size());
                for (Object next : collection) {
                    if (contains(next) && (next instanceof Map.Entry)) {
                        i2.add(((Map.Entry) next).getKey());
                    }
                }
                return m().keySet().retainAll(i2);
            }
        }

        public int size() {
            return m().size();
        }
    }

    public interface EntryTransformer<K, V1, V2> {
        Object a(Object obj, Object obj2);
    }

    public static final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {
        public final BiMap F;

        /* renamed from: com.google.common.collect.Maps$FilteredEntryBiMap$1  reason: invalid class name */
        class AnonymousClass1 implements Predicate<Map.Entry<Object, Object>> {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ Predicate f28385z;

            /* renamed from: a */
            public boolean apply(Map.Entry entry) {
                return this.f28385z.apply(Maps.t(entry.getValue(), entry.getKey()));
            }
        }

        public BiMap q1() {
            return this.F;
        }

        public Set values() {
            return this.F.keySet();
        }
    }

    public static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {
        public final Set E;

        public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            public EntrySet() {
            }

            /* renamed from: Z */
            public Set Q() {
                return FilteredEntryMap.this.E;
            }

            public Iterator iterator() {
                return new TransformedIterator<Map.Entry<K, V>, Map.Entry<K, V>>(FilteredEntryMap.this.E.iterator()) {
                    /* renamed from: c */
                    public Map.Entry b(final Map.Entry entry) {
                        return new ForwardingMapEntry<K, V>() {
                            /* renamed from: Q */
                            public Map.Entry M() {
                                return entry;
                            }

                            public Object setValue(Object obj) {
                                Preconditions.d(FilteredEntryMap.this.e(getKey(), obj));
                                return super.setValue(obj);
                            }
                        };
                    }
                };
            }
        }

        public class KeySet extends KeySet<K, V> {
            public KeySet() {
                super(FilteredEntryMap.this);
            }

            public boolean remove(Object obj) {
                if (!FilteredEntryMap.this.containsKey(obj)) {
                    return false;
                }
                FilteredEntryMap.this.C.remove(obj);
                return true;
            }

            public boolean removeAll(Collection collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.f(filteredEntryMap.C, filteredEntryMap.D, collection);
            }

            public boolean retainAll(Collection collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.g(filteredEntryMap.C, filteredEntryMap.D, collection);
            }

            public Object[] toArray() {
                return Lists.j(iterator()).toArray();
            }

            public Object[] toArray(Object[] objArr) {
                return Lists.j(iterator()).toArray(objArr);
            }
        }

        public FilteredEntryMap(Map map, Predicate predicate) {
            super(map, predicate);
            this.E = Sets.d(map.entrySet(), this.D);
        }

        public static boolean f(Map map, Predicate predicate, Collection collection) {
            Iterator it = map.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (predicate.apply(entry) && collection.contains(entry.getKey())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        public static boolean g(Map map, Predicate predicate, Collection collection) {
            Iterator it = map.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (predicate.apply(entry) && !collection.contains(entry.getKey())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        public Set a() {
            return new EntrySet();
        }

        public Set b() {
            return new KeySet();
        }
    }

    public static class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final Predicate f28391A;

        /* renamed from: B  reason: collision with root package name */
        public final Map f28392B;

        /* renamed from: z  reason: collision with root package name */
        public final NavigableMap f28393z;

        public FilteredEntryNavigableMap(NavigableMap navigableMap, Predicate predicate) {
            this.f28393z = (NavigableMap) Preconditions.q(navigableMap);
            this.f28391A = predicate;
            this.f28392B = new FilteredEntryMap(navigableMap, predicate);
        }

        public Iterator a() {
            return Iterators.p(this.f28393z.entrySet().iterator(), this.f28391A);
        }

        public Iterator b() {
            return Iterators.p(this.f28393z.descendingMap().entrySet().iterator(), this.f28391A);
        }

        public void clear() {
            this.f28392B.clear();
        }

        public Comparator comparator() {
            return this.f28393z.comparator();
        }

        public boolean containsKey(Object obj) {
            return this.f28392B.containsKey(obj);
        }

        public NavigableMap descendingMap() {
            return Maps.p(this.f28393z.descendingMap(), this.f28391A);
        }

        public Set entrySet() {
            return this.f28392B.entrySet();
        }

        public Object get(Object obj) {
            return this.f28392B.get(obj);
        }

        public NavigableMap headMap(Object obj, boolean z2) {
            return Maps.p(this.f28393z.headMap(obj, z2), this.f28391A);
        }

        public boolean isEmpty() {
            return !Iterables.b(this.f28393z.entrySet(), this.f28391A);
        }

        public NavigableSet navigableKeySet() {
            return new NavigableKeySet<K, V>(this) {
                public boolean removeAll(Collection collection) {
                    return FilteredEntryMap.f(FilteredEntryNavigableMap.this.f28393z, FilteredEntryNavigableMap.this.f28391A, collection);
                }

                public boolean retainAll(Collection collection) {
                    return FilteredEntryMap.g(FilteredEntryNavigableMap.this.f28393z, FilteredEntryNavigableMap.this.f28391A, collection);
                }
            };
        }

        public Map.Entry pollFirstEntry() {
            return (Map.Entry) Iterables.i(this.f28393z.entrySet(), this.f28391A);
        }

        public Map.Entry pollLastEntry() {
            return (Map.Entry) Iterables.i(this.f28393z.descendingMap().entrySet(), this.f28391A);
        }

        public Object put(Object obj, Object obj2) {
            return this.f28392B.put(obj, obj2);
        }

        public void putAll(Map map) {
            this.f28392B.putAll(map);
        }

        public Object remove(Object obj) {
            return this.f28392B.remove(obj);
        }

        public int size() {
            return this.f28392B.size();
        }

        public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return Maps.p(this.f28393z.subMap(obj, z2, obj2, z3), this.f28391A);
        }

        public NavigableMap tailMap(Object obj, boolean z2) {
            return Maps.p(this.f28393z.tailMap(obj, z2), this.f28391A);
        }

        public Collection values() {
            return new FilteredMapValues(this, this.f28393z, this.f28391A);
        }
    }

    public static class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        public class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            public SortedKeySet() {
                super();
            }

            public Comparator comparator() {
                return FilteredEntrySortedMap.this.j().comparator();
            }

            public Object first() {
                return FilteredEntrySortedMap.this.firstKey();
            }

            public SortedSet headSet(Object obj) {
                return (SortedSet) FilteredEntrySortedMap.this.headMap(obj).keySet();
            }

            public Object last() {
                return FilteredEntrySortedMap.this.lastKey();
            }

            public SortedSet subSet(Object obj, Object obj2) {
                return (SortedSet) FilteredEntrySortedMap.this.subMap(obj, obj2).keySet();
            }

            public SortedSet tailSet(Object obj) {
                return (SortedSet) FilteredEntrySortedMap.this.tailMap(obj).keySet();
            }
        }

        public FilteredEntrySortedMap(SortedMap sortedMap, Predicate predicate) {
            super(sortedMap, predicate);
        }

        public Comparator comparator() {
            return j().comparator();
        }

        public Object firstKey() {
            return keySet().iterator().next();
        }

        /* renamed from: h */
        public SortedSet b() {
            return new SortedKeySet();
        }

        public SortedMap headMap(Object obj) {
            return new FilteredEntrySortedMap(j().headMap(obj), this.D);
        }

        /* renamed from: i */
        public SortedSet keySet() {
            return (SortedSet) super.keySet();
        }

        public SortedMap j() {
            return (SortedMap) this.C;
        }

        public Object lastKey() {
            SortedMap j2 = j();
            while (true) {
                Object lastKey = j2.lastKey();
                if (e(lastKey, NullnessCasts.a(this.C.get(lastKey)))) {
                    return lastKey;
                }
                j2 = j().headMap(lastKey);
            }
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new FilteredEntrySortedMap(j().subMap(obj, obj2), this.D);
        }

        public SortedMap tailMap(Object obj) {
            return new FilteredEntrySortedMap(j().tailMap(obj), this.D);
        }
    }

    public static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {
        public final Predicate E;

        public FilteredKeyMap(Map map, Predicate predicate, Predicate predicate2) {
            super(map, predicate2);
            this.E = predicate;
        }

        public Set a() {
            return Sets.d(this.C.entrySet(), this.D);
        }

        public Set b() {
            return Sets.d(this.C.keySet(), this.E);
        }

        public boolean containsKey(Object obj) {
            return this.C.containsKey(obj) && this.E.apply(obj);
        }
    }

    public static final class FilteredMapValues<K, V> extends Values<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final Map f28396A;

        /* renamed from: B  reason: collision with root package name */
        public final Predicate f28397B;

        public FilteredMapValues(Map map, Map map2, Predicate predicate) {
            super(map);
            this.f28396A = map2;
            this.f28397B = predicate;
        }

        public boolean remove(Object obj) {
            Iterator it = this.f28396A.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (this.f28397B.apply(entry) && Objects.a(entry.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public boolean removeAll(Collection collection) {
            Iterator it = this.f28396A.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (this.f28397B.apply(entry) && collection.contains(entry.getValue())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        public boolean retainAll(Collection collection) {
            Iterator it = this.f28396A.entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (this.f28397B.apply(entry) && !collection.contains(entry.getValue())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        public Object[] toArray() {
            return Lists.j(iterator()).toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return Lists.j(iterator()).toArray(objArr);
        }
    }

    public static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
        public abstract Iterator a();

        public void clear() {
            Iterators.e(a());
        }

        public Set entrySet() {
            return new EntrySet<K, V>() {
                public Iterator iterator() {
                    return IteratorBasedAbstractMap.this.a();
                }

                public Map m() {
                    return IteratorBasedAbstractMap.this;
                }
            };
        }
    }

    public static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {

        /* renamed from: z  reason: collision with root package name */
        public final Map f28399z;

        public KeySet(Map map) {
            this.f28399z = (Map) Preconditions.q(map);
        }

        public void clear() {
            m().clear();
        }

        public boolean contains(Object obj) {
            return m().containsKey(obj);
        }

        public boolean isEmpty() {
            return m().isEmpty();
        }

        public Iterator iterator() {
            return Maps.w(m().entrySet().iterator());
        }

        public Map m() {
            return this.f28399z;
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            m().remove(obj);
            return true;
        }

        public int size() {
            return m().size();
        }
    }

    public static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final Map f28400a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f28401b;

        /* renamed from: c  reason: collision with root package name */
        public final Map f28402c;

        /* renamed from: d  reason: collision with root package name */
        public final Map f28403d;

        public Map a() {
            return this.f28400a;
        }

        public Map b() {
            return this.f28403d;
        }

        public Map c() {
            return this.f28401b;
        }

        public Map d() {
            return this.f28402c;
        }

        public boolean e() {
            return this.f28400a.isEmpty() && this.f28401b.isEmpty() && this.f28403d.isEmpty();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDifference)) {
                return false;
            }
            MapDifference mapDifference = (MapDifference) obj;
            return a().equals(mapDifference.a()) && c().equals(mapDifference.c()) && d().equals(mapDifference.d()) && b().equals(mapDifference.b());
        }

        public int hashCode() {
            return Objects.b(a(), c(), d(), b());
        }

        public String toString() {
            if (e()) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.f28400a.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.f28400a);
            }
            if (!this.f28401b.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.f28401b);
            }
            if (!this.f28403d.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.f28403d);
            }
            return sb.toString();
        }
    }

    public static final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final Function f28404A;

        /* renamed from: z  reason: collision with root package name */
        public final NavigableSet f28405z;

        public NavigableAsMapView(NavigableSet navigableSet, Function function) {
            this.f28405z = (NavigableSet) Preconditions.q(navigableSet);
            this.f28404A = (Function) Preconditions.q(function);
        }

        public Iterator a() {
            return Maps.k(this.f28405z, this.f28404A);
        }

        public Iterator b() {
            return descendingMap().entrySet().iterator();
        }

        public void clear() {
            this.f28405z.clear();
        }

        public Comparator comparator() {
            return this.f28405z.comparator();
        }

        public NavigableMap descendingMap() {
            return Maps.i(this.f28405z.descendingSet(), this.f28404A);
        }

        public Object get(Object obj) {
            if (Collections2.g(this.f28405z, obj)) {
                return this.f28404A.apply(obj);
            }
            return null;
        }

        public NavigableMap headMap(Object obj, boolean z2) {
            return Maps.i(this.f28405z.headSet(obj, z2), this.f28404A);
        }

        public NavigableSet navigableKeySet() {
            return Maps.E(this.f28405z);
        }

        public int size() {
            return this.f28405z.size();
        }

        public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return Maps.i(this.f28405z.subSet(obj, z2, obj2, z3), this.f28404A);
        }

        public NavigableMap tailMap(Object obj, boolean z2) {
            return Maps.i(this.f28405z.tailSet(obj, z2), this.f28404A);
        }
    }

    public static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
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
            return n().descendingKeySet();
        }

        public Object floor(Object obj) {
            return n().floorKey(obj);
        }

        public NavigableSet headSet(Object obj, boolean z2) {
            return n().headMap(obj, z2).navigableKeySet();
        }

        public Object higher(Object obj) {
            return n().higherKey(obj);
        }

        public Object lower(Object obj) {
            return n().lowerKey(obj);
        }

        /* renamed from: o */
        public NavigableMap n() {
            return (NavigableMap) this.f28399z;
        }

        public Object pollFirst() {
            return Maps.x(n().pollFirstEntry());
        }

        public Object pollLast() {
            return Maps.x(n().pollLastEntry());
        }

        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return n().subMap(obj, z2, obj2, z3).navigableKeySet();
        }

        public NavigableSet tailSet(Object obj, boolean z2) {
            return n().tailMap(obj, z2).navigableKeySet();
        }

        public SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        public SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    public static class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        public SortedAsMapView(SortedSet sortedSet, Function function) {
            super(sortedSet, function);
        }

        public Comparator comparator() {
            return e().comparator();
        }

        /* renamed from: f */
        public SortedSet e() {
            return (SortedSet) super.e();
        }

        public Object firstKey() {
            return e().first();
        }

        public SortedMap headMap(Object obj) {
            return Maps.j(e().headSet(obj), this.D);
        }

        public Set keySet() {
            return Maps.G(e());
        }

        public Object lastKey() {
            return e().last();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return Maps.j(e().subSet(obj, obj2), this.D);
        }

        public SortedMap tailMap(Object obj) {
            return Maps.j(e().tailSet(obj), this.D);
        }
    }

    public static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        public SortedKeySet(SortedMap sortedMap) {
            super(sortedMap);
        }

        public Comparator comparator() {
            return m().comparator();
        }

        public Object first() {
            return m().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new SortedKeySet(m().headMap(obj));
        }

        public Object last() {
            return m().lastKey();
        }

        /* renamed from: n */
        public SortedMap m() {
            return (SortedMap) super.m();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new SortedKeySet(m().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new SortedKeySet(m().tailMap(obj));
        }
    }

    public static class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        public SortedMap a() {
            return (SortedMap) super.a();
        }

        public SortedMap b() {
            return (SortedMap) super.b();
        }

        public SortedMap c() {
            return (SortedMap) super.c();
        }

        public SortedMap d() {
            return (SortedMap) super.d();
        }
    }

    public static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {

        /* renamed from: A  reason: collision with root package name */
        public final EntryTransformer f28406A;

        /* renamed from: z  reason: collision with root package name */
        public final Map f28407z;

        public TransformedEntriesMap(Map map, EntryTransformer entryTransformer) {
            this.f28407z = (Map) Preconditions.q(map);
            this.f28406A = (EntryTransformer) Preconditions.q(entryTransformer);
        }

        public Iterator a() {
            return Iterators.J(this.f28407z.entrySet().iterator(), Maps.e(this.f28406A));
        }

        public void clear() {
            this.f28407z.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f28407z.containsKey(obj);
        }

        public Object get(Object obj) {
            Object obj2 = this.f28407z.get(obj);
            if (obj2 != null || this.f28407z.containsKey(obj)) {
                return this.f28406A.a(obj, NullnessCasts.a(obj2));
            }
            return null;
        }

        public Set keySet() {
            return this.f28407z.keySet();
        }

        public Object remove(Object obj) {
            if (this.f28407z.containsKey(obj)) {
                return this.f28406A.a(obj, NullnessCasts.a(this.f28407z.remove(obj)));
            }
            return null;
        }

        public int size() {
            return this.f28407z.size();
        }

        public Collection values() {
            return new Values(this);
        }
    }

    public static class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        public TransformedEntriesNavigableMap(NavigableMap navigableMap, EntryTransformer entryTransformer) {
            super(navigableMap, entryTransformer);
        }

        /* renamed from: c */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        public Map.Entry ceilingEntry(Object obj) {
            return h(b().ceilingEntry(obj));
        }

        public Object ceilingKey(Object obj) {
            return b().ceilingKey(obj);
        }

        public NavigableSet descendingKeySet() {
            return b().descendingKeySet();
        }

        public NavigableMap descendingMap() {
            return Maps.M(b().descendingMap(), this.f28406A);
        }

        /* renamed from: e */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        /* renamed from: f */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        public Map.Entry firstEntry() {
            return h(b().firstEntry());
        }

        public Map.Entry floorEntry(Object obj) {
            return h(b().floorEntry(obj));
        }

        public Object floorKey(Object obj) {
            return b().floorKey(obj);
        }

        /* renamed from: g */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public final Map.Entry h(Map.Entry entry) {
            if (entry == null) {
                return null;
            }
            return Maps.O(this.f28406A, entry);
        }

        public Map.Entry higherEntry(Object obj) {
            return h(b().higherEntry(obj));
        }

        public Object higherKey(Object obj) {
            return b().higherKey(obj);
        }

        public Map.Entry lastEntry() {
            return h(b().lastEntry());
        }

        public Map.Entry lowerEntry(Object obj) {
            return h(b().lowerEntry(obj));
        }

        public Object lowerKey(Object obj) {
            return b().lowerKey(obj);
        }

        public NavigableSet navigableKeySet() {
            return b().navigableKeySet();
        }

        public Map.Entry pollFirstEntry() {
            return h(b().pollFirstEntry());
        }

        public Map.Entry pollLastEntry() {
            return h(b().pollLastEntry());
        }

        public NavigableMap headMap(Object obj, boolean z2) {
            return Maps.M(b().headMap(obj, z2), this.f28406A);
        }

        public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return Maps.M(b().subMap(obj, z2, obj2, z3), this.f28406A);
        }

        public NavigableMap tailMap(Object obj, boolean z2) {
            return Maps.M(b().tailMap(obj, z2), this.f28406A);
        }
    }

    public static class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        public TransformedEntriesSortedMap(SortedMap sortedMap, EntryTransformer entryTransformer) {
            super(sortedMap, entryTransformer);
        }

        public SortedMap b() {
            return (SortedMap) this.f28407z;
        }

        public Comparator comparator() {
            return b().comparator();
        }

        public Object firstKey() {
            return b().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return Maps.N(b().headMap(obj), this.f28406A);
        }

        public Object lastKey() {
            return b().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return Maps.N(b().subMap(obj, obj2), this.f28406A);
        }

        public SortedMap tailMap(Object obj) {
            return Maps.N(b().tailMap(obj), this.f28406A);
        }
    }

    public static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final BiMap f28408A;

        /* renamed from: B  reason: collision with root package name */
        public BiMap f28409B;
        public transient Set C;

        /* renamed from: z  reason: collision with root package name */
        public final Map f28410z;

        public UnmodifiableBiMap(BiMap biMap, BiMap biMap2) {
            this.f28410z = Collections.unmodifiableMap(biMap);
            this.f28408A = biMap;
            this.f28409B = biMap2;
        }

        /* renamed from: Q */
        public Map M() {
            return this.f28410z;
        }

        public BiMap q1() {
            BiMap biMap = this.f28409B;
            if (biMap != null) {
                return biMap;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.f28408A.q1(), this);
            this.f28409B = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        public Set values() {
            Set set = this.C;
            if (set != null) {
                return set;
            }
            Set unmodifiableSet = Collections.unmodifiableSet(this.f28408A.values());
            this.C = unmodifiableSet;
            return unmodifiableSet;
        }
    }

    public static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {

        /* renamed from: z  reason: collision with root package name */
        public final Collection f28411z;

        public UnmodifiableEntries(Collection collection) {
            this.f28411z = collection;
        }

        /* renamed from: Q */
        public Collection M() {
            return this.f28411z;
        }

        public Iterator iterator() {
            return Maps.S(this.f28411z.iterator());
        }

        public Object[] toArray() {
            return V();
        }

        public Object[] toArray(Object[] objArr) {
            return W(objArr);
        }
    }

    public static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        public UnmodifiableEntrySet(Set set) {
            super(set);
        }

        public boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        public int hashCode() {
            return Sets.f(this);
        }
    }

    public static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public transient UnmodifiableNavigableMap f28412A;

        /* renamed from: z  reason: collision with root package name */
        public final NavigableMap f28413z;

        public UnmodifiableNavigableMap(NavigableMap navigableMap) {
            this.f28413z = navigableMap;
        }

        /* renamed from: S */
        public SortedMap Q() {
            return Collections.unmodifiableSortedMap(this.f28413z);
        }

        public Map.Entry ceilingEntry(Object obj) {
            return Maps.V(this.f28413z.ceilingEntry(obj));
        }

        public Object ceilingKey(Object obj) {
            return this.f28413z.ceilingKey(obj);
        }

        public NavigableSet descendingKeySet() {
            return Sets.p(this.f28413z.descendingKeySet());
        }

        public NavigableMap descendingMap() {
            UnmodifiableNavigableMap unmodifiableNavigableMap = this.f28412A;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap unmodifiableNavigableMap2 = new UnmodifiableNavigableMap(this.f28413z.descendingMap(), this);
            this.f28412A = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        public Map.Entry firstEntry() {
            return Maps.V(this.f28413z.firstEntry());
        }

        public Map.Entry floorEntry(Object obj) {
            return Maps.V(this.f28413z.floorEntry(obj));
        }

        public Object floorKey(Object obj) {
            return this.f28413z.floorKey(obj);
        }

        public SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public Map.Entry higherEntry(Object obj) {
            return Maps.V(this.f28413z.higherEntry(obj));
        }

        public Object higherKey(Object obj) {
            return this.f28413z.higherKey(obj);
        }

        public Set keySet() {
            return navigableKeySet();
        }

        public Map.Entry lastEntry() {
            return Maps.V(this.f28413z.lastEntry());
        }

        public Map.Entry lowerEntry(Object obj) {
            return Maps.V(this.f28413z.lowerEntry(obj));
        }

        public Object lowerKey(Object obj) {
            return this.f28413z.lowerKey(obj);
        }

        public NavigableSet navigableKeySet() {
            return Sets.p(this.f28413z.navigableKeySet());
        }

        public final Map.Entry pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        public final Map.Entry pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        public SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public NavigableMap headMap(Object obj, boolean z2) {
            return Maps.U(this.f28413z.headMap(obj, z2));
        }

        public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return Maps.U(this.f28413z.subMap(obj, z2, obj2, z3));
        }

        public NavigableMap tailMap(Object obj, boolean z2) {
            return Maps.U(this.f28413z.tailMap(obj, z2));
        }

        public UnmodifiableNavigableMap(NavigableMap navigableMap, UnmodifiableNavigableMap unmodifiableNavigableMap) {
            this.f28413z = navigableMap;
            this.f28412A = unmodifiableNavigableMap;
        }
    }

    public static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f28414a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f28415b;

        public Object a() {
            return this.f28415b;
        }

        public Object b() {
            return this.f28414a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof MapDifference.ValueDifference)) {
                return false;
            }
            MapDifference.ValueDifference valueDifference = (MapDifference.ValueDifference) obj;
            return Objects.a(this.f28414a, valueDifference.b()) && Objects.a(this.f28415b, valueDifference.a());
        }

        public int hashCode() {
            return Objects.b(this.f28414a, this.f28415b);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28414a);
            String valueOf2 = String.valueOf(this.f28415b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length());
            sb.append("(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class Values<K, V> extends AbstractCollection<V> {

        /* renamed from: z  reason: collision with root package name */
        public final Map f28416z;

        public Values(Map map) {
            this.f28416z = (Map) Preconditions.q(map);
        }

        public void clear() {
            e().clear();
        }

        public boolean contains(Object obj) {
            return e().containsValue(obj);
        }

        public final Map e() {
            return this.f28416z;
        }

        public boolean isEmpty() {
            return e().isEmpty();
        }

        public Iterator iterator() {
            return Maps.X(e().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : e().entrySet()) {
                    if (Objects.a(obj, entry.getValue())) {
                        e().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.q(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet h2 = Sets.h();
                for (Map.Entry entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        h2.add(entry.getKey());
                    }
                }
                return e().keySet().removeAll(h2);
            }
        }

        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.q(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet h2 = Sets.h();
                for (Map.Entry entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        h2.add(entry.getKey());
                    }
                }
                return e().keySet().retainAll(h2);
            }
        }

        public int size() {
            return e().size();
        }
    }

    public static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public transient Set f28417A;

        /* renamed from: B  reason: collision with root package name */
        public transient Collection f28418B;

        /* renamed from: z  reason: collision with root package name */
        public transient Set f28419z;

        public abstract Set a();

        public Set b() {
            return new KeySet(this);
        }

        public Collection c() {
            return new Values(this);
        }

        public Set entrySet() {
            Set set = this.f28419z;
            if (set != null) {
                return set;
            }
            Set a2 = a();
            this.f28419z = a2;
            return a2;
        }

        public Set keySet() {
            Set set = this.f28417A;
            if (set != null) {
                return set;
            }
            Set b2 = b();
            this.f28417A = b2;
            return b2;
        }

        public Collection values() {
            Collection collection = this.f28418B;
            if (collection != null) {
                return collection;
            }
            Collection c2 = c();
            this.f28418B = c2;
            return c2;
        }
    }

    public static IdentityHashMap A() {
        return new IdentityHashMap();
    }

    public static LinkedHashMap B() {
        return new LinkedHashMap();
    }

    public static LinkedHashMap C(int i2) {
        return new LinkedHashMap(m(i2));
    }

    public static boolean D(Collection collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.remove(R((Map.Entry) obj));
    }

    public static NavigableSet E(final NavigableSet navigableSet) {
        return new ForwardingNavigableSet<Object>() {
            public boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection collection) {
                throw new UnsupportedOperationException();
            }

            /* renamed from: d0 */
            public NavigableSet b0() {
                return navigableSet;
            }

            public NavigableSet descendingSet() {
                return Maps.E(super.descendingSet());
            }

            public SortedSet headSet(Object obj) {
                return Maps.G(super.headSet(obj));
            }

            public SortedSet subSet(Object obj, Object obj2) {
                return Maps.G(super.subSet(obj, obj2));
            }

            public SortedSet tailSet(Object obj) {
                return Maps.G(super.tailSet(obj));
            }

            public NavigableSet headSet(Object obj, boolean z2) {
                return Maps.E(super.headSet(obj, z2));
            }

            public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
                return Maps.E(super.subSet(obj, z2, obj2, z3));
            }

            public NavigableSet tailSet(Object obj, boolean z2) {
                return Maps.E(super.tailSet(obj, z2));
            }
        };
    }

    public static Set F(final Set set) {
        return new ForwardingSet<Object>() {
            /* renamed from: Z */
            public Set Q() {
                return set;
            }

            public boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection collection) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static SortedSet G(final SortedSet sortedSet) {
        return new ForwardingSortedSet<Object>() {
            public boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection collection) {
                throw new UnsupportedOperationException();
            }

            /* renamed from: b0 */
            public SortedSet Z() {
                return sortedSet;
            }

            public SortedSet headSet(Object obj) {
                return Maps.G(super.headSet(obj));
            }

            public SortedSet subSet(Object obj, Object obj2) {
                return Maps.G(super.subSet(obj, obj2));
            }

            public SortedSet tailSet(Object obj) {
                return Maps.G(super.tailSet(obj));
            }
        };
    }

    public static boolean H(Map map, Object obj) {
        Preconditions.q(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object I(Map map, Object obj) {
        Preconditions.q(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Object J(Map map, Object obj) {
        Preconditions.q(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String K(Map map) {
        StringBuilder f2 = Collections2.f(map.size());
        f2.append('{');
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z2) {
                f2.append(", ");
            }
            f2.append(entry.getKey());
            f2.append('=');
            f2.append(entry.getValue());
            z2 = false;
        }
        f2.append('}');
        return f2.toString();
    }

    public static Map L(Map map, EntryTransformer entryTransformer) {
        return new TransformedEntriesMap(map, entryTransformer);
    }

    public static NavigableMap M(NavigableMap navigableMap, EntryTransformer entryTransformer) {
        return new TransformedEntriesNavigableMap(navigableMap, entryTransformer);
    }

    public static SortedMap N(SortedMap sortedMap, EntryTransformer entryTransformer) {
        return new TransformedEntriesSortedMap(sortedMap, entryTransformer);
    }

    public static Map.Entry O(final EntryTransformer entryTransformer, final Map.Entry entry) {
        Preconditions.q(entryTransformer);
        Preconditions.q(entry);
        return new AbstractMapEntry<Object, Object>() {
            public Object getKey() {
                return entry.getKey();
            }

            public Object getValue() {
                return entryTransformer.a(entry.getKey(), entry.getValue());
            }
        };
    }

    public static Map P(Map map, Function function) {
        return L(map, g(function));
    }

    public static SortedMap Q(SortedMap sortedMap, Function function) {
        return N(sortedMap, g(function));
    }

    public static Map.Entry R(final Map.Entry entry) {
        Preconditions.q(entry);
        return new AbstractMapEntry<Object, Object>() {
            public Object getKey() {
                return entry.getKey();
            }

            public Object getValue() {
                return entry.getValue();
            }
        };
    }

    public static UnmodifiableIterator S(final Iterator it) {
        return new UnmodifiableIterator<Map.Entry<Object, Object>>() {
            /* renamed from: b */
            public Map.Entry next() {
                return Maps.R((Map.Entry) it.next());
            }

            public boolean hasNext() {
                return it.hasNext();
            }
        };
    }

    public static Set T(Set set) {
        return new UnmodifiableEntrySet(Collections.unmodifiableSet(set));
    }

    public static NavigableMap U(NavigableMap navigableMap) {
        Preconditions.q(navigableMap);
        return navigableMap instanceof UnmodifiableNavigableMap ? navigableMap : new UnmodifiableNavigableMap(navigableMap);
    }

    public static Map.Entry V(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return R(entry);
    }

    public static Function W() {
        return EntryFunction.VALUE;
    }

    public static Iterator X(Iterator it) {
        return new TransformedIterator<Map.Entry<Object, Object>, Object>(it) {
            /* renamed from: c */
            public Object b(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }

    public static Object Y(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public static Predicate Z(Predicate predicate) {
        return Predicates.e(predicate, W());
    }

    public static Function e(final EntryTransformer entryTransformer) {
        Preconditions.q(entryTransformer);
        return new Function<Map.Entry<Object, Object>, Map.Entry<Object, Object>>() {
            /* renamed from: a */
            public Map.Entry apply(Map.Entry entry) {
                return Maps.O(EntryTransformer.this, entry);
            }
        };
    }

    public static Function f(final EntryTransformer entryTransformer) {
        Preconditions.q(entryTransformer);
        return new Function<Map.Entry<Object, Object>, Object>() {
            /* renamed from: a */
            public Object apply(Map.Entry entry) {
                return EntryTransformer.this.a(entry.getKey(), entry.getValue());
            }
        };
    }

    public static EntryTransformer g(final Function function) {
        Preconditions.q(function);
        return new EntryTransformer<Object, Object, Object>() {
            public Object a(Object obj, Object obj2) {
                return Function.this.apply(obj2);
            }
        };
    }

    public static Map h(Set set, Function function) {
        return new AsMapView(set, function);
    }

    public static NavigableMap i(NavigableSet navigableSet, Function function) {
        return new NavigableAsMapView(navigableSet, function);
    }

    public static SortedMap j(SortedSet sortedSet, Function function) {
        return new SortedAsMapView(sortedSet, function);
    }

    public static Iterator k(Set set, final Function function) {
        return new TransformedIterator<Object, Map.Entry<Object, Object>>(set.iterator()) {
            /* renamed from: c */
            public Map.Entry b(Object obj) {
                return Maps.t(obj, function.apply(obj));
            }
        };
    }

    public static Function l(final EntryTransformer entryTransformer, final Object obj) {
        Preconditions.q(entryTransformer);
        return new Function<Object, Object>() {
            public Object apply(Object obj) {
                return EntryTransformer.this.a(obj, obj);
            }
        };
    }

    public static int m(int i2) {
        if (i2 < 3) {
            CollectPreconditions.b(i2, "expectedSize");
            return i2 + 1;
        } else if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static boolean n(Collection collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.contains(R((Map.Entry) obj));
    }

    public static boolean o(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static NavigableMap p(NavigableMap navigableMap, Predicate predicate) {
        Preconditions.q(predicate);
        return navigableMap instanceof FilteredEntryNavigableMap ? r((FilteredEntryNavigableMap) navigableMap, predicate) : new FilteredEntryNavigableMap((NavigableMap) Preconditions.q(navigableMap), predicate);
    }

    public static Map q(AbstractFilteredMap abstractFilteredMap, Predicate predicate) {
        return new FilteredEntryMap(abstractFilteredMap.C, Predicates.c(abstractFilteredMap.D, predicate));
    }

    public static NavigableMap r(FilteredEntryNavigableMap filteredEntryNavigableMap, Predicate predicate) {
        return new FilteredEntryNavigableMap(filteredEntryNavigableMap.f28393z, Predicates.c(filteredEntryNavigableMap.f28391A, predicate));
    }

    public static Map s(Map map, Predicate predicate) {
        Preconditions.q(predicate);
        Predicate y2 = y(predicate);
        return map instanceof AbstractFilteredMap ? q((AbstractFilteredMap) map, y2) : new FilteredKeyMap((Map) Preconditions.q(map), predicate, y2);
    }

    public static Map.Entry t(Object obj, Object obj2) {
        return new ImmutableEntry(obj, obj2);
    }

    public static ImmutableMap u(Collection collection) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i2 = 0;
        for (Object g2 : collection) {
            builder.g(g2, Integer.valueOf(i2));
            i2++;
        }
        return builder.d();
    }

    public static Function v() {
        return EntryFunction.KEY;
    }

    public static Iterator w(Iterator it) {
        return new TransformedIterator<Map.Entry<Object, Object>, Object>(it) {
            /* renamed from: c */
            public Object b(Map.Entry entry) {
                return entry.getKey();
            }
        };
    }

    public static Object x(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static Predicate y(Predicate predicate) {
        return Predicates.e(predicate, v());
    }

    public static HashMap z() {
        return new HashMap();
    }
}
