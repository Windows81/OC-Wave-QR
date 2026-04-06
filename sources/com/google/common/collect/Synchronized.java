package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
final class Synchronized {

    public static class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        public transient Set E;
        public transient Collection F;

        public SynchronizedAsMap(Map map, Object obj) {
            super(map, obj);
        }

        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        public Set entrySet() {
            Set set;
            synchronized (this.f28595A) {
                try {
                    if (this.E == null) {
                        this.E = new SynchronizedAsMapEntries(g().entrySet(), this.f28595A);
                    }
                    set = this.E;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        public Collection values() {
            Collection collection;
            synchronized (this.f28595A) {
                try {
                    if (this.F == null) {
                        this.F = new SynchronizedAsMapValues(g().values(), this.f28595A);
                    }
                    collection = this.F;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        public Collection get(Object obj) {
            Collection collection;
            synchronized (this.f28595A) {
                Collection collection2 = (Collection) super.get(obj);
                if (collection2 == null) {
                    collection = null;
                } else {
                    collection = Synchronized.p(collection2, this.f28595A);
                }
            }
            return collection;
        }
    }

    public static class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        public SynchronizedAsMapValues(Collection collection, Object obj) {
            super(collection, obj);
        }

        public Iterator iterator() {
            return new TransformedIterator<Collection<V>, Collection<V>>(super.iterator()) {
                /* renamed from: c */
                public Collection b(Collection collection) {
                    return Synchronized.p(collection, SynchronizedAsMapValues.this.f28595A);
                }
            };
        }
    }

    public static class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {
        public transient Set E;
        public transient BiMap F;

        public SynchronizedBiMap(BiMap biMap, Object obj, BiMap biMap2) {
            super(biMap, obj);
            this.F = biMap2;
        }

        /* renamed from: i */
        public BiMap g() {
            return (BiMap) super.g();
        }

        public BiMap q1() {
            BiMap biMap;
            synchronized (this.f28595A) {
                try {
                    if (this.F == null) {
                        this.F = new SynchronizedBiMap(g().q1(), this.f28595A, this);
                    }
                    biMap = this.F;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return biMap;
        }

        public Set values() {
            Set set;
            synchronized (this.f28595A) {
                try {
                    if (this.E == null) {
                        this.E = Synchronized.m(g().values(), this.f28595A);
                    }
                    set = this.E;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    public static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        public boolean add(Object obj) {
            boolean add;
            synchronized (this.f28595A) {
                add = g().add(obj);
            }
            return add;
        }

        public boolean addAll(Collection collection) {
            boolean addAll;
            synchronized (this.f28595A) {
                addAll = g().addAll(collection);
            }
            return addAll;
        }

        public void clear() {
            synchronized (this.f28595A) {
                g().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean contains;
            synchronized (this.f28595A) {
                contains = g().contains(obj);
            }
            return contains;
        }

        public boolean containsAll(Collection collection) {
            boolean containsAll;
            synchronized (this.f28595A) {
                containsAll = g().containsAll(collection);
            }
            return containsAll;
        }

        public Collection g() {
            return (Collection) super.e();
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f28595A) {
                isEmpty = g().isEmpty();
            }
            return isEmpty;
        }

        public Iterator iterator() {
            return g().iterator();
        }

        public boolean remove(Object obj) {
            boolean remove;
            synchronized (this.f28595A) {
                remove = g().remove(obj);
            }
            return remove;
        }

        public boolean removeAll(Collection collection) {
            boolean removeAll;
            synchronized (this.f28595A) {
                removeAll = g().removeAll(collection);
            }
            return removeAll;
        }

        public boolean retainAll(Collection collection) {
            boolean retainAll;
            synchronized (this.f28595A) {
                retainAll = g().retainAll(collection);
            }
            return retainAll;
        }

        public int size() {
            int size;
            synchronized (this.f28595A) {
                size = g().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f28595A) {
                array = g().toArray();
            }
            return array;
        }

        public SynchronizedCollection(Collection collection, Object obj) {
            super(collection, obj);
        }

        public Object[] toArray(Object[] objArr) {
            Object[] array;
            synchronized (this.f28595A) {
                array = g().toArray(objArr);
            }
            return array;
        }
    }

    public static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        public void addFirst(Object obj) {
            synchronized (this.f28595A) {
                i().addFirst(obj);
            }
        }

        public void addLast(Object obj) {
            synchronized (this.f28595A) {
                i().addLast(obj);
            }
        }

        public Iterator descendingIterator() {
            Iterator descendingIterator;
            synchronized (this.f28595A) {
                descendingIterator = i().descendingIterator();
            }
            return descendingIterator;
        }

        public Object getFirst() {
            Object first;
            synchronized (this.f28595A) {
                first = i().getFirst();
            }
            return first;
        }

        public Object getLast() {
            Object last;
            synchronized (this.f28595A) {
                last = i().getLast();
            }
            return last;
        }

        public boolean offerFirst(Object obj) {
            boolean offerFirst;
            synchronized (this.f28595A) {
                offerFirst = i().offerFirst(obj);
            }
            return offerFirst;
        }

        public boolean offerLast(Object obj) {
            boolean offerLast;
            synchronized (this.f28595A) {
                offerLast = i().offerLast(obj);
            }
            return offerLast;
        }

        /* renamed from: p */
        public Deque i() {
            return (Deque) super.g();
        }

        public Object peekFirst() {
            Object peekFirst;
            synchronized (this.f28595A) {
                peekFirst = i().peekFirst();
            }
            return peekFirst;
        }

        public Object peekLast() {
            Object peekLast;
            synchronized (this.f28595A) {
                peekLast = i().peekLast();
            }
            return peekLast;
        }

        public Object pollFirst() {
            Object pollFirst;
            synchronized (this.f28595A) {
                pollFirst = i().pollFirst();
            }
            return pollFirst;
        }

        public Object pollLast() {
            Object pollLast;
            synchronized (this.f28595A) {
                pollLast = i().pollLast();
            }
            return pollLast;
        }

        public Object pop() {
            Object pop;
            synchronized (this.f28595A) {
                pop = i().pop();
            }
            return pop;
        }

        public void push(Object obj) {
            synchronized (this.f28595A) {
                i().push(obj);
            }
        }

        public Object removeFirst() {
            Object removeFirst;
            synchronized (this.f28595A) {
                removeFirst = i().removeFirst();
            }
            return removeFirst;
        }

        public boolean removeFirstOccurrence(Object obj) {
            boolean removeFirstOccurrence;
            synchronized (this.f28595A) {
                removeFirstOccurrence = i().removeFirstOccurrence(obj);
            }
            return removeFirstOccurrence;
        }

        public Object removeLast() {
            Object removeLast;
            synchronized (this.f28595A) {
                removeLast = i().removeLast();
            }
            return removeLast;
        }

        public boolean removeLastOccurrence(Object obj) {
            boolean removeLastOccurrence;
            synchronized (this.f28595A) {
                removeLastOccurrence = i().removeLastOccurrence(obj);
            }
            return removeLastOccurrence;
        }
    }

    public static class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        public SynchronizedEntry(Map.Entry entry, Object obj) {
            super(entry, obj);
        }

        public boolean equals(Object obj) {
            boolean equals;
            synchronized (this.f28595A) {
                equals = g().equals(obj);
            }
            return equals;
        }

        public Map.Entry g() {
            return (Map.Entry) super.e();
        }

        public Object getKey() {
            Object key;
            synchronized (this.f28595A) {
                key = g().getKey();
            }
            return key;
        }

        public Object getValue() {
            Object value;
            synchronized (this.f28595A) {
                value = g().getValue();
            }
            return value;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f28595A) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        public Object setValue(Object obj) {
            Object value;
            synchronized (this.f28595A) {
                value = g().setValue(obj);
            }
            return value;
        }
    }

    public static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        public SynchronizedList(List list, Object obj) {
            super(list, obj);
        }

        public void add(int i2, Object obj) {
            synchronized (this.f28595A) {
                g().add(i2, obj);
            }
        }

        public boolean addAll(int i2, Collection collection) {
            boolean addAll;
            synchronized (this.f28595A) {
                addAll = g().addAll(i2, collection);
            }
            return addAll;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f28595A) {
                equals = g().equals(obj);
            }
            return equals;
        }

        public Object get(int i2) {
            Object obj;
            synchronized (this.f28595A) {
                obj = g().get(i2);
            }
            return obj;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f28595A) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        /* renamed from: i */
        public List g() {
            return (List) super.g();
        }

        public int indexOf(Object obj) {
            int indexOf;
            synchronized (this.f28595A) {
                indexOf = g().indexOf(obj);
            }
            return indexOf;
        }

        public int lastIndexOf(Object obj) {
            int lastIndexOf;
            synchronized (this.f28595A) {
                lastIndexOf = g().lastIndexOf(obj);
            }
            return lastIndexOf;
        }

        public ListIterator listIterator() {
            return g().listIterator();
        }

        public Object remove(int i2) {
            Object remove;
            synchronized (this.f28595A) {
                remove = g().remove(i2);
            }
            return remove;
        }

        public Object set(int i2, Object obj) {
            Object obj2;
            synchronized (this.f28595A) {
                obj2 = g().set(i2, obj);
            }
            return obj2;
        }

        public List subList(int i2, int i3) {
            List b2;
            synchronized (this.f28595A) {
                b2 = Synchronized.h(g().subList(i2, i3), this.f28595A);
            }
            return b2;
        }

        public ListIterator listIterator(int i2) {
            return g().listIterator(i2);
        }
    }

    public static class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements ListMultimap<K, V> {
        /* renamed from: i */
        public ListMultimap g() {
            return (ListMultimap) super.g();
        }

        public List get(Object obj) {
            List b2;
            synchronized (this.f28595A) {
                b2 = Synchronized.h(g().get(obj), this.f28595A);
            }
            return b2;
        }

        public List h(Object obj) {
            List h2;
            synchronized (this.f28595A) {
                h2 = g().h(obj);
            }
            return h2;
        }
    }

    public static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {

        /* renamed from: B  reason: collision with root package name */
        public transient Set f28591B;
        public transient Collection C;
        public transient Set D;

        public SynchronizedMap(Map map, Object obj) {
            super(map, obj);
        }

        public void clear() {
            synchronized (this.f28595A) {
                g().clear();
            }
        }

        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.f28595A) {
                containsKey = g().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.f28595A) {
                containsValue = g().containsValue(obj);
            }
            return containsValue;
        }

        public Set entrySet() {
            Set set;
            synchronized (this.f28595A) {
                try {
                    if (this.D == null) {
                        this.D = Synchronized.m(g().entrySet(), this.f28595A);
                    }
                    set = this.D;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f28595A) {
                equals = g().equals(obj);
            }
            return equals;
        }

        public Map g() {
            return (Map) super.e();
        }

        public Object get(Object obj) {
            Object obj2;
            synchronized (this.f28595A) {
                obj2 = g().get(obj);
            }
            return obj2;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f28595A) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f28595A) {
                isEmpty = g().isEmpty();
            }
            return isEmpty;
        }

        public Set keySet() {
            Set set;
            synchronized (this.f28595A) {
                try {
                    if (this.f28591B == null) {
                        this.f28591B = Synchronized.m(g().keySet(), this.f28595A);
                    }
                    set = this.f28591B;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        public Object put(Object obj, Object obj2) {
            Object put;
            synchronized (this.f28595A) {
                put = g().put(obj, obj2);
            }
            return put;
        }

        public void putAll(Map map) {
            synchronized (this.f28595A) {
                g().putAll(map);
            }
        }

        public Object remove(Object obj) {
            Object remove;
            synchronized (this.f28595A) {
                remove = g().remove(obj);
            }
            return remove;
        }

        public int size() {
            int size;
            synchronized (this.f28595A) {
                size = g().size();
            }
            return size;
        }

        public Collection values() {
            Collection collection;
            synchronized (this.f28595A) {
                try {
                    if (this.C == null) {
                        this.C = Synchronized.g(g().values(), this.f28595A);
                    }
                    collection = this.C;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    public static class SynchronizedMultimap<K, V> extends SynchronizedObject implements Multimap<K, V> {

        /* renamed from: B  reason: collision with root package name */
        public transient Set f28592B;
        public transient Collection C;
        public transient Map D;

        public Map E() {
            Map map;
            synchronized (this.f28595A) {
                try {
                    if (this.D == null) {
                        this.D = new SynchronizedAsMap(g().E(), this.f28595A);
                    }
                    map = this.D;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return map;
        }

        public boolean F(Object obj, Object obj2) {
            boolean F;
            synchronized (this.f28595A) {
                F = g().F(obj, obj2);
            }
            return F;
        }

        public void clear() {
            synchronized (this.f28595A) {
                g().clear();
            }
        }

        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.f28595A) {
                containsKey = g().containsKey(obj);
            }
            return containsKey;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f28595A) {
                equals = g().equals(obj);
            }
            return equals;
        }

        public Multimap g() {
            return (Multimap) super.e();
        }

        public Collection get(Object obj) {
            Collection d2;
            synchronized (this.f28595A) {
                d2 = Synchronized.p(g().get(obj), this.f28595A);
            }
            return d2;
        }

        public Collection h(Object obj) {
            Collection h2;
            synchronized (this.f28595A) {
                h2 = g().h(obj);
            }
            return h2;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f28595A) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f28595A) {
                isEmpty = g().isEmpty();
            }
            return isEmpty;
        }

        public Set keySet() {
            Set set;
            synchronized (this.f28595A) {
                try {
                    if (this.f28592B == null) {
                        this.f28592B = Synchronized.q(g().keySet(), this.f28595A);
                    }
                    set = this.f28592B;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        public Collection m() {
            Collection collection;
            synchronized (this.f28595A) {
                try {
                    if (this.C == null) {
                        this.C = Synchronized.p(g().m(), this.f28595A);
                    }
                    collection = this.C;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        public boolean put(Object obj, Object obj2) {
            boolean put;
            synchronized (this.f28595A) {
                put = g().put(obj, obj2);
            }
            return put;
        }

        public boolean remove(Object obj, Object obj2) {
            boolean remove;
            synchronized (this.f28595A) {
                remove = g().remove(obj, obj2);
            }
            return remove;
        }

        public int size() {
            int size;
            synchronized (this.f28595A) {
                size = g().size();
            }
            return size;
        }
    }

    public static class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements Multiset<E> {

        /* renamed from: B  reason: collision with root package name */
        public transient Set f28593B;
        public transient Set C;

        public int L0(Object obj) {
            int L0;
            synchronized (this.f28595A) {
                L0 = g().L0(obj);
            }
            return L0;
        }

        public int N(Object obj, int i2) {
            int N;
            synchronized (this.f28595A) {
                N = g().N(obj, i2);
            }
            return N;
        }

        public int T(Object obj, int i2) {
            int T;
            synchronized (this.f28595A) {
                T = g().T(obj, i2);
            }
            return T;
        }

        public Set entrySet() {
            Set set;
            synchronized (this.f28595A) {
                try {
                    if (this.C == null) {
                        this.C = Synchronized.q(g().entrySet(), this.f28595A);
                    }
                    set = this.C;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f28595A) {
                equals = g().equals(obj);
            }
            return equals;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f28595A) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        /* renamed from: i */
        public Multiset g() {
            return (Multiset) super.g();
        }

        public Set k() {
            Set set;
            synchronized (this.f28595A) {
                try {
                    if (this.f28593B == null) {
                        this.f28593B = Synchronized.q(g().k(), this.f28595A);
                    }
                    set = this.f28593B;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        public int n0(Object obj, int i2) {
            int n0;
            synchronized (this.f28595A) {
                n0 = g().n0(obj, i2);
            }
            return n0;
        }

        public boolean t0(Object obj, int i2, int i3) {
            boolean t0;
            synchronized (this.f28595A) {
                t0 = g().t0(obj, i2, i3);
            }
            return t0;
        }
    }

    public static class SynchronizedObject implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Object f28595A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28596z;

        public SynchronizedObject(Object obj, Object obj2) {
            this.f28596z = Preconditions.q(obj);
            this.f28595A = obj2 == null ? this : obj2;
        }

        public Object e() {
            return this.f28596z;
        }

        public String toString() {
            String obj;
            synchronized (this.f28595A) {
                obj = this.f28596z.toString();
            }
            return obj;
        }
    }

    public static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        public Object element() {
            Object element;
            synchronized (this.f28595A) {
                element = g().element();
            }
            return element;
        }

        /* renamed from: i */
        public Queue g() {
            return (Queue) super.g();
        }

        public boolean offer(Object obj) {
            boolean offer;
            synchronized (this.f28595A) {
                offer = g().offer(obj);
            }
            return offer;
        }

        public Object peek() {
            Object peek;
            synchronized (this.f28595A) {
                peek = g().peek();
            }
            return peek;
        }

        public Object poll() {
            Object poll;
            synchronized (this.f28595A) {
                poll = g().poll();
            }
            return poll;
        }

        public Object remove() {
            Object remove;
            synchronized (this.f28595A) {
                remove = g().remove();
            }
            return remove;
        }
    }

    public static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        public SynchronizedRandomAccessList(List list, Object obj) {
            super(list, obj);
        }
    }

    public static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        public SynchronizedSet(Set set, Object obj) {
            super(set, obj);
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f28595A) {
                equals = g().equals(obj);
            }
            return equals;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f28595A) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        /* renamed from: i */
        public Set g() {
            return (Set) super.g();
        }
    }

    public static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {
        public transient Set E;

        /* renamed from: i */
        public SetMultimap g() {
            return (SetMultimap) super.g();
        }

        public Set get(Object obj) {
            Set m2;
            synchronized (this.f28595A) {
                m2 = Synchronized.m(g().get(obj), this.f28595A);
            }
            return m2;
        }

        public Set h(Object obj) {
            Set h2;
            synchronized (this.f28595A) {
                h2 = g().h(obj);
            }
            return h2;
        }

        public Set m() {
            Set set;
            synchronized (this.f28595A) {
                try {
                    if (this.E == null) {
                        this.E = Synchronized.m(g().m(), this.f28595A);
                    }
                    set = this.E;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    public static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        public SynchronizedSortedMap(SortedMap sortedMap, Object obj) {
            super(sortedMap, obj);
        }

        public Comparator comparator() {
            Comparator comparator;
            synchronized (this.f28595A) {
                comparator = g().comparator();
            }
            return comparator;
        }

        public Object firstKey() {
            Object firstKey;
            synchronized (this.f28595A) {
                firstKey = g().firstKey();
            }
            return firstKey;
        }

        public SortedMap headMap(Object obj) {
            SortedMap n2;
            synchronized (this.f28595A) {
                n2 = Synchronized.n(g().headMap(obj), this.f28595A);
            }
            return n2;
        }

        /* renamed from: i */
        public SortedMap g() {
            return (SortedMap) super.g();
        }

        public Object lastKey() {
            Object lastKey;
            synchronized (this.f28595A) {
                lastKey = g().lastKey();
            }
            return lastKey;
        }

        public SortedMap subMap(Object obj, Object obj2) {
            SortedMap n2;
            synchronized (this.f28595A) {
                n2 = Synchronized.n(g().subMap(obj, obj2), this.f28595A);
            }
            return n2;
        }

        public SortedMap tailMap(Object obj) {
            SortedMap n2;
            synchronized (this.f28595A) {
                n2 = Synchronized.n(g().tailMap(obj), this.f28595A);
            }
            return n2;
        }
    }

    public static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        public SynchronizedSortedSet(SortedSet sortedSet, Object obj) {
            super(sortedSet, obj);
        }

        public Comparator comparator() {
            Comparator comparator;
            synchronized (this.f28595A) {
                comparator = i().comparator();
            }
            return comparator;
        }

        public Object first() {
            Object first;
            synchronized (this.f28595A) {
                first = i().first();
            }
            return first;
        }

        public SortedSet headSet(Object obj) {
            SortedSet a2;
            synchronized (this.f28595A) {
                a2 = Synchronized.o(i().headSet(obj), this.f28595A);
            }
            return a2;
        }

        public Object last() {
            Object last;
            synchronized (this.f28595A) {
                last = i().last();
            }
            return last;
        }

        /* renamed from: p */
        public SortedSet i() {
            return (SortedSet) super.g();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            SortedSet a2;
            synchronized (this.f28595A) {
                a2 = Synchronized.o(i().subSet(obj, obj2), this.f28595A);
            }
            return a2;
        }

        public SortedSet tailSet(Object obj) {
            SortedSet a2;
            synchronized (this.f28595A) {
                a2 = Synchronized.o(i().tailSet(obj), this.f28595A);
            }
            return a2;
        }
    }

    public static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements Table<R, C, V> {
        public Map D() {
            Map i2;
            synchronized (this.f28595A) {
                i2 = Synchronized.i(Maps.P(g().D(), new Function<Map<R, V>, Map<R, V>>() {
                    /* renamed from: a */
                    public Map apply(Map map) {
                        return Synchronized.i(map, SynchronizedTable.this.f28595A);
                    }
                }), this.f28595A);
            }
            return i2;
        }

        public void clear() {
            synchronized (this.f28595A) {
                g().clear();
            }
        }

        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.f28595A) {
                containsValue = g().containsValue(obj);
            }
            return containsValue;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f28595A) {
                equals = g().equals(obj);
            }
            return equals;
        }

        public Table g() {
            return (Table) super.e();
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.f28595A) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        public Map o() {
            Map i2;
            synchronized (this.f28595A) {
                i2 = Synchronized.i(Maps.P(g().o(), new Function<Map<C, V>, Map<C, V>>() {
                    /* renamed from: a */
                    public Map apply(Map map) {
                        return Synchronized.i(map, SynchronizedTable.this.f28595A);
                    }
                }), this.f28595A);
            }
            return i2;
        }

        public int size() {
            int size;
            synchronized (this.f28595A) {
                size = g().size();
            }
            return size;
        }

        public Collection values() {
            Collection e2;
            synchronized (this.f28595A) {
                e2 = Synchronized.g(g().values(), this.f28595A);
            }
            return e2;
        }

        public Set z() {
            Set m2;
            synchronized (this.f28595A) {
                m2 = Synchronized.m(g().z(), this.f28595A);
            }
            return m2;
        }
    }

    public static Collection g(Collection collection, Object obj) {
        return new SynchronizedCollection(collection, obj);
    }

    public static List h(List list, Object obj) {
        return list instanceof RandomAccess ? new SynchronizedRandomAccessList(list, obj) : new SynchronizedList(list, obj);
    }

    public static Map i(Map map, Object obj) {
        return new SynchronizedMap(map, obj);
    }

    public static NavigableMap j(NavigableMap navigableMap, Object obj) {
        return new SynchronizedNavigableMap(navigableMap, obj);
    }

    public static NavigableSet k(NavigableSet navigableSet, Object obj) {
        return new SynchronizedNavigableSet(navigableSet, obj);
    }

    public static Map.Entry l(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new SynchronizedEntry(entry, obj);
    }

    public static Set m(Set set, Object obj) {
        return new SynchronizedSet(set, obj);
    }

    public static SortedMap n(SortedMap sortedMap, Object obj) {
        return new SynchronizedSortedMap(sortedMap, obj);
    }

    public static SortedSet o(SortedSet sortedSet, Object obj) {
        return new SynchronizedSortedSet(sortedSet, obj);
    }

    public static Collection p(Collection collection, Object obj) {
        return collection instanceof SortedSet ? o((SortedSet) collection, obj) : collection instanceof Set ? m((Set) collection, obj) : collection instanceof List ? h((List) collection, obj) : g(collection, obj);
    }

    public static Set q(Set set, Object obj) {
        return set instanceof SortedSet ? o((SortedSet) set, obj) : m(set, obj);
    }

    public static class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        /* renamed from: p */
        public SortedSetMultimap i() {
            return (SortedSetMultimap) super.g();
        }

        public SortedSet get(Object obj) {
            SortedSet a2;
            synchronized (this.f28595A) {
                a2 = Synchronized.o(i().get(obj), this.f28595A);
            }
            return a2;
        }

        public SortedSet h(Object obj) {
            SortedSet h2;
            synchronized (this.f28595A) {
                h2 = i().h(obj);
            }
            return h2;
        }
    }

    public static class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
        public transient NavigableSet E;
        public transient NavigableMap F;
        public transient NavigableSet G;

        public SynchronizedNavigableMap(NavigableMap navigableMap, Object obj) {
            super(navigableMap, obj);
        }

        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry f2;
            synchronized (this.f28595A) {
                f2 = Synchronized.l(i().ceilingEntry(obj), this.f28595A);
            }
            return f2;
        }

        public Object ceilingKey(Object obj) {
            Object ceilingKey;
            synchronized (this.f28595A) {
                ceilingKey = i().ceilingKey(obj);
            }
            return ceilingKey;
        }

        public NavigableSet descendingKeySet() {
            synchronized (this.f28595A) {
                try {
                    NavigableSet navigableSet = this.E;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet k2 = Synchronized.k(i().descendingKeySet(), this.f28595A);
                    this.E = k2;
                    return k2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public NavigableMap descendingMap() {
            synchronized (this.f28595A) {
                try {
                    NavigableMap navigableMap = this.F;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    NavigableMap j2 = Synchronized.j(i().descendingMap(), this.f28595A);
                    this.F = j2;
                    return j2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public Map.Entry firstEntry() {
            Map.Entry f2;
            synchronized (this.f28595A) {
                f2 = Synchronized.l(i().firstEntry(), this.f28595A);
            }
            return f2;
        }

        public Map.Entry floorEntry(Object obj) {
            Map.Entry f2;
            synchronized (this.f28595A) {
                f2 = Synchronized.l(i().floorEntry(obj), this.f28595A);
            }
            return f2;
        }

        public Object floorKey(Object obj) {
            Object floorKey;
            synchronized (this.f28595A) {
                floorKey = i().floorKey(obj);
            }
            return floorKey;
        }

        public NavigableMap headMap(Object obj, boolean z2) {
            NavigableMap j2;
            synchronized (this.f28595A) {
                j2 = Synchronized.j(i().headMap(obj, z2), this.f28595A);
            }
            return j2;
        }

        public Map.Entry higherEntry(Object obj) {
            Map.Entry f2;
            synchronized (this.f28595A) {
                f2 = Synchronized.l(i().higherEntry(obj), this.f28595A);
            }
            return f2;
        }

        public Object higherKey(Object obj) {
            Object higherKey;
            synchronized (this.f28595A) {
                higherKey = i().higherKey(obj);
            }
            return higherKey;
        }

        public Set keySet() {
            return navigableKeySet();
        }

        public Map.Entry lastEntry() {
            Map.Entry f2;
            synchronized (this.f28595A) {
                f2 = Synchronized.l(i().lastEntry(), this.f28595A);
            }
            return f2;
        }

        public Map.Entry lowerEntry(Object obj) {
            Map.Entry f2;
            synchronized (this.f28595A) {
                f2 = Synchronized.l(i().lowerEntry(obj), this.f28595A);
            }
            return f2;
        }

        public Object lowerKey(Object obj) {
            Object lowerKey;
            synchronized (this.f28595A) {
                lowerKey = i().lowerKey(obj);
            }
            return lowerKey;
        }

        public NavigableSet navigableKeySet() {
            synchronized (this.f28595A) {
                try {
                    NavigableSet navigableSet = this.G;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet k2 = Synchronized.k(i().navigableKeySet(), this.f28595A);
                    this.G = k2;
                    return k2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: p */
        public NavigableMap i() {
            return (NavigableMap) super.g();
        }

        public Map.Entry pollFirstEntry() {
            Map.Entry f2;
            synchronized (this.f28595A) {
                f2 = Synchronized.l(i().pollFirstEntry(), this.f28595A);
            }
            return f2;
        }

        public Map.Entry pollLastEntry() {
            Map.Entry f2;
            synchronized (this.f28595A) {
                f2 = Synchronized.l(i().pollLastEntry(), this.f28595A);
            }
            return f2;
        }

        public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            NavigableMap j2;
            synchronized (this.f28595A) {
                j2 = Synchronized.j(i().subMap(obj, z2, obj2, z3), this.f28595A);
            }
            return j2;
        }

        public NavigableMap tailMap(Object obj, boolean z2) {
            NavigableMap j2;
            synchronized (this.f28595A) {
                j2 = Synchronized.j(i().tailMap(obj, z2), this.f28595A);
            }
            return j2;
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

    public static class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {

        /* renamed from: B  reason: collision with root package name */
        public transient NavigableSet f28594B;

        public SynchronizedNavigableSet(NavigableSet navigableSet, Object obj) {
            super(navigableSet, obj);
        }

        public Object ceiling(Object obj) {
            Object ceiling;
            synchronized (this.f28595A) {
                ceiling = p().ceiling(obj);
            }
            return ceiling;
        }

        public Iterator descendingIterator() {
            return p().descendingIterator();
        }

        public NavigableSet descendingSet() {
            synchronized (this.f28595A) {
                try {
                    NavigableSet navigableSet = this.f28594B;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet k2 = Synchronized.k(p().descendingSet(), this.f28595A);
                    this.f28594B = k2;
                    return k2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public Object floor(Object obj) {
            Object floor;
            synchronized (this.f28595A) {
                floor = p().floor(obj);
            }
            return floor;
        }

        public NavigableSet headSet(Object obj, boolean z2) {
            NavigableSet k2;
            synchronized (this.f28595A) {
                k2 = Synchronized.k(p().headSet(obj, z2), this.f28595A);
            }
            return k2;
        }

        public Object higher(Object obj) {
            Object higher;
            synchronized (this.f28595A) {
                higher = p().higher(obj);
            }
            return higher;
        }

        public Object lower(Object obj) {
            Object lower;
            synchronized (this.f28595A) {
                lower = p().lower(obj);
            }
            return lower;
        }

        public Object pollFirst() {
            Object pollFirst;
            synchronized (this.f28595A) {
                pollFirst = p().pollFirst();
            }
            return pollFirst;
        }

        public Object pollLast() {
            Object pollLast;
            synchronized (this.f28595A) {
                pollLast = p().pollLast();
            }
            return pollLast;
        }

        /* renamed from: q */
        public NavigableSet p() {
            return (NavigableSet) super.i();
        }

        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            NavigableSet k2;
            synchronized (this.f28595A) {
                k2 = Synchronized.k(p().subSet(obj, z2, obj2, z3), this.f28595A);
            }
            return k2;
        }

        public NavigableSet tailSet(Object obj, boolean z2) {
            NavigableSet k2;
            synchronized (this.f28595A) {
                k2 = Synchronized.k(p().tailSet(obj, z2), this.f28595A);
            }
            return k2;
        }

        public SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        public SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }
    }

    public static class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        public SynchronizedAsMapEntries(Set set, Object obj) {
            super(set, obj);
        }

        public boolean contains(Object obj) {
            boolean n2;
            synchronized (this.f28595A) {
                n2 = Maps.n(g(), obj);
            }
            return n2;
        }

        public boolean containsAll(Collection collection) {
            boolean b2;
            synchronized (this.f28595A) {
                b2 = Collections2.b(g(), collection);
            }
            return b2;
        }

        public boolean equals(Object obj) {
            boolean b2;
            if (obj == this) {
                return true;
            }
            synchronized (this.f28595A) {
                b2 = Sets.b(g(), obj);
            }
            return b2;
        }

        public Iterator iterator() {
            return new TransformedIterator<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>>(super.iterator()) {
                /* renamed from: c */
                public Map.Entry b(final Map.Entry entry) {
                    return new ForwardingMapEntry<K, Collection<V>>() {
                        /* renamed from: Q */
                        public Map.Entry M() {
                            return entry;
                        }

                        /* renamed from: S */
                        public Collection getValue() {
                            return Synchronized.p((Collection) entry.getValue(), SynchronizedAsMapEntries.this.f28595A);
                        }
                    };
                }
            };
        }

        public boolean remove(Object obj) {
            boolean D;
            synchronized (this.f28595A) {
                D = Maps.D(g(), obj);
            }
            return D;
        }

        public boolean removeAll(Collection collection) {
            boolean D;
            synchronized (this.f28595A) {
                D = Iterators.D(g().iterator(), collection);
            }
            return D;
        }

        public boolean retainAll(Collection collection) {
            boolean F;
            synchronized (this.f28595A) {
                F = Iterators.F(g().iterator(), collection);
            }
            return F;
        }

        public Object[] toArray() {
            Object[] h2;
            synchronized (this.f28595A) {
                h2 = ObjectArrays.h(g());
            }
            return h2;
        }

        public Object[] toArray(Object[] objArr) {
            Object[] i2;
            synchronized (this.f28595A) {
                i2 = ObjectArrays.i(g(), objArr);
            }
            return i2;
        }
    }
}
