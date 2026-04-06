package org.bson.util;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.bson.assertions.Assertions;

abstract class AbstractCopyOnWriteMap<K, V, M extends Map<K, V>> implements ConcurrentMap<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public final transient Lock f44048A = new ReentrantLock();

    /* renamed from: B  reason: collision with root package name */
    public final View f44049B;

    /* renamed from: z  reason: collision with root package name */
    public volatile Map f44050z;

    public static abstract class CollectionView<E> implements Collection<E> {
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean contains(Object obj) {
            return e().contains(obj);
        }

        public final boolean containsAll(Collection collection) {
            return e().containsAll(collection);
        }

        public abstract Collection e();

        public boolean equals(Object obj) {
            return e().equals(obj);
        }

        public int hashCode() {
            return e().hashCode();
        }

        public final boolean isEmpty() {
            return e().isEmpty();
        }

        public final Iterator iterator() {
            return new UnmodifiableIterator(e().iterator());
        }

        public final int size() {
            return e().size();
        }

        public final Object[] toArray() {
            return e().toArray();
        }

        public String toString() {
            return e().toString();
        }

        public final Object[] toArray(Object[] objArr) {
            return e().toArray(objArr);
        }
    }

    public class EntrySet extends CollectionView<Map.Entry<K, V>> implements Set<Map.Entry<K, V>> {
        public EntrySet() {
        }

        public void clear() {
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                Map c2 = AbstractCopyOnWriteMap.this.c();
                c2.entrySet().clear();
                AbstractCopyOnWriteMap.this.g(c2);
            } finally {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
            }
        }

        public Collection e() {
            return AbstractCopyOnWriteMap.this.f44050z.entrySet();
        }

        public boolean remove(Object obj) {
            Map c2;
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                if (!contains(obj)) {
                    AbstractCopyOnWriteMap.this.f44048A.unlock();
                    return false;
                }
                c2 = AbstractCopyOnWriteMap.this.c();
                boolean remove = c2.entrySet().remove(obj);
                AbstractCopyOnWriteMap.this.g(c2);
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                return remove;
            } catch (Throwable th) {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                throw th;
            }
        }

        public boolean removeAll(Collection collection) {
            Map c2;
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                c2 = AbstractCopyOnWriteMap.this.c();
                boolean removeAll = c2.entrySet().removeAll(collection);
                AbstractCopyOnWriteMap.this.g(c2);
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                return removeAll;
            } catch (Throwable th) {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                throw th;
            }
        }

        public boolean retainAll(Collection collection) {
            Map c2;
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                c2 = AbstractCopyOnWriteMap.this.c();
                boolean retainAll = c2.entrySet().retainAll(collection);
                AbstractCopyOnWriteMap.this.g(c2);
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                return retainAll;
            } catch (Throwable th) {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                throw th;
            }
        }
    }

    public final class Immutable extends View<K, V> {
        public Immutable() {
        }

        public Set a() {
            return Collections.unmodifiableSet(AbstractCopyOnWriteMap.this.f44050z.entrySet());
        }

        public Set b() {
            return Collections.unmodifiableSet(AbstractCopyOnWriteMap.this.f44050z.keySet());
        }

        public Collection c() {
            return Collections.unmodifiableCollection(AbstractCopyOnWriteMap.this.f44050z.values());
        }
    }

    public class KeySet extends CollectionView<K> implements Set<K> {
        public KeySet() {
        }

        public void clear() {
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                Map c2 = AbstractCopyOnWriteMap.this.c();
                c2.keySet().clear();
                AbstractCopyOnWriteMap.this.g(c2);
            } finally {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
            }
        }

        public Collection e() {
            return AbstractCopyOnWriteMap.this.f44050z.keySet();
        }

        public boolean remove(Object obj) {
            return AbstractCopyOnWriteMap.this.remove(obj) != null;
        }

        public boolean removeAll(Collection collection) {
            Map c2;
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                c2 = AbstractCopyOnWriteMap.this.c();
                boolean removeAll = c2.keySet().removeAll(collection);
                AbstractCopyOnWriteMap.this.g(c2);
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                return removeAll;
            } catch (Throwable th) {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                throw th;
            }
        }

        public boolean retainAll(Collection collection) {
            Map c2;
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                c2 = AbstractCopyOnWriteMap.this.c();
                boolean retainAll = c2.keySet().retainAll(collection);
                AbstractCopyOnWriteMap.this.g(c2);
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                return retainAll;
            } catch (Throwable th) {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                throw th;
            }
        }
    }

    public final class Mutable extends View<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final transient KeySet f44054a;

        /* renamed from: b  reason: collision with root package name */
        public final transient EntrySet f44055b;

        /* renamed from: c  reason: collision with root package name */
        public final transient Values f44056c;

        public Mutable() {
            this.f44054a = new KeySet();
            this.f44055b = new EntrySet();
            this.f44056c = new Values();
        }

        public Set a() {
            return this.f44055b;
        }

        public Set b() {
            return this.f44054a;
        }

        public Collection c() {
            return this.f44056c;
        }
    }

    public static class UnmodifiableIterator<T> implements Iterator<T> {

        /* renamed from: z  reason: collision with root package name */
        public final Iterator f44058z;

        public UnmodifiableIterator(Iterator it) {
            this.f44058z = it;
        }

        public boolean hasNext() {
            return this.f44058z.hasNext();
        }

        public Object next() {
            return this.f44058z.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public final class Values extends CollectionView<V> {
        public Values() {
        }

        public void clear() {
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                Map c2 = AbstractCopyOnWriteMap.this.c();
                c2.values().clear();
                AbstractCopyOnWriteMap.this.g(c2);
            } finally {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
            }
        }

        public Collection e() {
            return AbstractCopyOnWriteMap.this.f44050z.values();
        }

        public boolean remove(Object obj) {
            Map c2;
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                if (!contains(obj)) {
                    AbstractCopyOnWriteMap.this.f44048A.unlock();
                    return false;
                }
                c2 = AbstractCopyOnWriteMap.this.c();
                boolean remove = c2.values().remove(obj);
                AbstractCopyOnWriteMap.this.g(c2);
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                return remove;
            } catch (Throwable th) {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                throw th;
            }
        }

        public boolean removeAll(Collection collection) {
            Map c2;
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                c2 = AbstractCopyOnWriteMap.this.c();
                boolean removeAll = c2.values().removeAll(collection);
                AbstractCopyOnWriteMap.this.g(c2);
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                return removeAll;
            } catch (Throwable th) {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                throw th;
            }
        }

        public boolean retainAll(Collection collection) {
            Map c2;
            AbstractCopyOnWriteMap.this.f44048A.lock();
            try {
                c2 = AbstractCopyOnWriteMap.this.c();
                boolean retainAll = c2.values().retainAll(collection);
                AbstractCopyOnWriteMap.this.g(c2);
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                return retainAll;
            } catch (Throwable th) {
                AbstractCopyOnWriteMap.this.f44048A.unlock();
                throw th;
            }
        }
    }

    public static abstract class View<K, V> {

        public enum Type {
            STABLE {
                public View d(AbstractCopyOnWriteMap abstractCopyOnWriteMap) {
                    abstractCopyOnWriteMap.getClass();
                    return new Immutable();
                }
            },
            LIVE {
                public View d(AbstractCopyOnWriteMap abstractCopyOnWriteMap) {
                    abstractCopyOnWriteMap.getClass();
                    return new Mutable();
                }
            };

            public abstract View d(AbstractCopyOnWriteMap abstractCopyOnWriteMap);
        }

        public abstract Set a();

        public abstract Set b();

        public abstract Collection c();
    }

    public AbstractCopyOnWriteMap(Map map, View.Type type) {
        this.f44050z = (Map) Assertions.d("delegate", e((Map) Assertions.d("map", map)));
        this.f44049B = ((View.Type) Assertions.d("viewType", type)).d(this);
    }

    public Map c() {
        this.f44048A.lock();
        try {
            return e(this.f44050z);
        } finally {
            this.f44048A.unlock();
        }
    }

    public final void clear() {
        this.f44048A.lock();
        try {
            g(e(Collections.emptyMap()));
        } finally {
            this.f44048A.unlock();
        }
    }

    public final boolean containsKey(Object obj) {
        return this.f44050z.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f44050z.containsValue(obj);
    }

    public abstract Map e(Map map);

    public final Set entrySet() {
        return this.f44049B.a();
    }

    public final boolean equals(Object obj) {
        return this.f44050z.equals(obj);
    }

    public final boolean f(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public void g(Map map) {
        this.f44050z = map;
    }

    public final Object get(Object obj) {
        return this.f44050z.get(obj);
    }

    public final int hashCode() {
        return this.f44050z.hashCode();
    }

    public final boolean isEmpty() {
        return this.f44050z.isEmpty();
    }

    public final Set keySet() {
        return this.f44049B.b();
    }

    public final Object put(Object obj, Object obj2) {
        Map c2;
        this.f44048A.lock();
        try {
            c2 = c();
            Object put = c2.put(obj, obj2);
            g(c2);
            this.f44048A.unlock();
            return put;
        } catch (Throwable th) {
            this.f44048A.unlock();
            throw th;
        }
    }

    public final void putAll(Map map) {
        this.f44048A.lock();
        try {
            Map c2 = c();
            c2.putAll(map);
            g(c2);
        } finally {
            this.f44048A.unlock();
        }
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3;
        Map c2;
        this.f44048A.lock();
        try {
            if (!this.f44050z.containsKey(obj)) {
                c2 = c();
                obj3 = c2.put(obj, obj2);
                g(c2);
            } else {
                obj3 = this.f44050z.get(obj);
            }
            this.f44048A.unlock();
            return obj3;
        } catch (Throwable th) {
            this.f44048A.unlock();
            throw th;
        }
    }

    public final Object remove(Object obj) {
        Map c2;
        this.f44048A.lock();
        try {
            if (!this.f44050z.containsKey(obj)) {
                this.f44048A.unlock();
                return null;
            }
            c2 = c();
            Object remove = c2.remove(obj);
            g(c2);
            this.f44048A.unlock();
            return remove;
        } catch (Throwable th) {
            this.f44048A.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean replace(Object obj, Object obj2, Object obj3) {
        this.f44048A.lock();
        try {
            if (this.f44050z.containsKey(obj)) {
                if (f(obj2, this.f44050z.get(obj))) {
                    Map c2 = c();
                    c2.put(obj, obj3);
                    g(c2);
                    this.f44048A.unlock();
                    return true;
                }
            }
            this.f44048A.unlock();
            return false;
        } catch (Throwable th) {
            this.f44048A.unlock();
            throw th;
        }
    }

    public final int size() {
        return this.f44050z.size();
    }

    public String toString() {
        return this.f44050z.toString();
    }

    public final Collection values() {
        return this.f44049B.c();
    }

    public Object replace(Object obj, Object obj2) {
        Map c2;
        this.f44048A.lock();
        try {
            if (!this.f44050z.containsKey(obj)) {
                this.f44048A.unlock();
                return null;
            }
            c2 = c();
            Object put = c2.put(obj, obj2);
            g(c2);
            this.f44048A.unlock();
            return put;
        } catch (Throwable th) {
            this.f44048A.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean remove(Object obj, Object obj2) {
        this.f44048A.lock();
        try {
            if (!this.f44050z.containsKey(obj) || !f(obj2, this.f44050z.get(obj))) {
                this.f44048A.unlock();
                return false;
            }
            Map c2 = c();
            c2.remove(obj);
            g(c2);
            this.f44048A.unlock();
            return true;
        } catch (Throwable th) {
            this.f44048A.unlock();
            throw th;
        }
    }
}
