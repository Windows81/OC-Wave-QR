package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public transient AbstractBiMap f27940A;

    /* renamed from: B  reason: collision with root package name */
    public transient Set f27941B;
    public transient Set C;
    public transient Set D;

    /* renamed from: z  reason: collision with root package name */
    public transient Map f27942z;

    public class BiMapEntry extends ForwardingMapEntry<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final Map.Entry f27947z;

        public BiMapEntry(Map.Entry entry) {
            this.f27947z = entry;
        }

        /* renamed from: Q */
        public Map.Entry M() {
            return this.f27947z;
        }

        public Object setValue(Object obj) {
            AbstractBiMap.this.Z(obj);
            Preconditions.x(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (Objects.a(obj, getValue())) {
                return obj;
            }
            Preconditions.j(!AbstractBiMap.this.containsValue(obj), "value already present: %s", obj);
            Object value = this.f27947z.setValue(obj);
            Preconditions.x(Objects.a(obj, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap.this.i0(getKey(), true, value, obj);
            return value;
        }
    }

    public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {

        /* renamed from: z  reason: collision with root package name */
        public final Set f27949z;

        public EntrySet() {
            this.f27949z = AbstractBiMap.this.f27942z.entrySet();
        }

        /* renamed from: Z */
        public Set Q() {
            return this.f27949z;
        }

        public void clear() {
            AbstractBiMap.this.clear();
        }

        public boolean contains(Object obj) {
            return Maps.n(Q(), obj);
        }

        public boolean containsAll(Collection collection) {
            return S(collection);
        }

        public Iterator iterator() {
            return AbstractBiMap.this.a0();
        }

        public boolean remove(Object obj) {
            if (!this.f27949z.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            AbstractBiMap.this.f27940A.f27942z.remove(entry.getValue());
            this.f27949z.remove(entry);
            return true;
        }

        public boolean removeAll(Collection collection) {
            return a0(collection);
        }

        public boolean retainAll(Collection collection) {
            return U(collection);
        }

        public Object[] toArray() {
            return V();
        }

        public Object[] toArray(Object[] objArr) {
            return W(objArr);
        }
    }

    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        public /* bridge */ /* synthetic */ Object M() {
            return AbstractBiMap.super.M();
        }

        public Object Y(Object obj) {
            return this.f27940A.Z(obj);
        }

        public Object Z(Object obj) {
            return this.f27940A.Y(obj);
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return AbstractBiMap.super.values();
        }
    }

    public class KeySet extends ForwardingSet<K> {
        public KeySet() {
        }

        /* renamed from: Z */
        public Set Q() {
            return AbstractBiMap.this.f27942z.keySet();
        }

        public void clear() {
            AbstractBiMap.this.clear();
        }

        public Iterator iterator() {
            return Maps.w(AbstractBiMap.this.entrySet().iterator());
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            Object unused = AbstractBiMap.this.d0(obj);
            return true;
        }

        public boolean removeAll(Collection collection) {
            return a0(collection);
        }

        public boolean retainAll(Collection collection) {
            return U(collection);
        }
    }

    public class ValueSet extends ForwardingSet<V> {

        /* renamed from: z  reason: collision with root package name */
        public final Set f27952z;

        public ValueSet() {
            this.f27952z = AbstractBiMap.this.f27940A.keySet();
        }

        /* renamed from: Z */
        public Set Q() {
            return this.f27952z;
        }

        public Iterator iterator() {
            return Maps.X(AbstractBiMap.this.entrySet().iterator());
        }

        public Object[] toArray() {
            return V();
        }

        public String toString() {
            return Y();
        }

        public Object[] toArray(Object[] objArr) {
            return W(objArr);
        }
    }

    /* renamed from: Q */
    public Map M() {
        return this.f27942z;
    }

    public Object Y(Object obj) {
        return obj;
    }

    public Object Z(Object obj) {
        return obj;
    }

    public Iterator a0() {
        final Iterator it = this.f27942z.entrySet().iterator();
        return new Iterator<Map.Entry<K, V>>() {

            /* renamed from: z  reason: collision with root package name */
            public Map.Entry f27945z;

            /* renamed from: b */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) it.next();
                this.f27945z = entry;
                return new BiMapEntry(entry);
            }

            public boolean hasNext() {
                return it.hasNext();
            }

            public void remove() {
                Map.Entry entry = this.f27945z;
                if (entry != null) {
                    Object value = entry.getValue();
                    it.remove();
                    AbstractBiMap.this.h0(value);
                    this.f27945z = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        };
    }

    public final Object b0(Object obj, Object obj2, boolean z2) {
        Y(obj);
        Z(obj2);
        boolean containsKey = containsKey(obj);
        if (containsKey && Objects.a(obj2, get(obj))) {
            return obj2;
        }
        if (z2) {
            q1().remove(obj2);
        } else {
            Preconditions.j(!containsValue(obj2), "value already present: %s", obj2);
        }
        Object put = this.f27942z.put(obj, obj2);
        i0(obj, containsKey, put, obj2);
        return put;
    }

    public void clear() {
        this.f27942z.clear();
        this.f27940A.f27942z.clear();
    }

    public boolean containsValue(Object obj) {
        return this.f27940A.containsKey(obj);
    }

    public final Object d0(Object obj) {
        Object a2 = NullnessCasts.a(this.f27942z.remove(obj));
        h0(a2);
        return a2;
    }

    public Set entrySet() {
        Set set = this.D;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.D = entrySet;
        return entrySet;
    }

    public final void h0(Object obj) {
        this.f27940A.f27942z.remove(obj);
    }

    public final void i0(Object obj, boolean z2, Object obj2, Object obj3) {
        if (z2) {
            h0(NullnessCasts.a(obj2));
        }
        this.f27940A.f27942z.put(obj3, obj);
    }

    public Set keySet() {
        Set set = this.f27941B;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f27941B = keySet;
        return keySet;
    }

    public Object put(Object obj, Object obj2) {
        return b0(obj, obj2, false);
    }

    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public BiMap q1() {
        return this.f27940A;
    }

    public Object remove(Object obj) {
        if (containsKey(obj)) {
            return d0(obj);
        }
        return null;
    }

    public Set values() {
        Set set = this.C;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.C = valueSet;
        return valueSet;
    }
}
