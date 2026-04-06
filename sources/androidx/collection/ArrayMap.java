package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    public EntrySet C;
    public KeySet D;
    public ValueCollection E;

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        public Iterator iterator() {
            return new MapIterator();
        }

        public int size() {
            return ArrayMap.this.size();
        }
    }

    public final class KeyIterator extends IndexBasedArrayIterator<K> {
        public KeyIterator() {
            super(ArrayMap.this.size());
        }

        public Object b(int i2) {
            return ArrayMap.this.g(i2);
        }

        public void c(int i2) {
            ArrayMap.this.h(i2);
        }
    }

    public final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public int f1719A = -1;

        /* renamed from: B  reason: collision with root package name */
        public boolean f1720B;

        /* renamed from: z  reason: collision with root package name */
        public int f1721z;

        public MapIterator() {
            this.f1721z = ArrayMap.this.size() - 1;
        }

        /* renamed from: b */
        public Map.Entry next() {
            if (hasNext()) {
                this.f1719A++;
                this.f1720B = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f1720B) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return ContainerHelpersKt.c(entry.getKey(), ArrayMap.this.g(this.f1719A)) && ContainerHelpersKt.c(entry.getValue(), ArrayMap.this.j(this.f1719A));
            }
        }

        public Object getKey() {
            if (this.f1720B) {
                return ArrayMap.this.g(this.f1719A);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object getValue() {
            if (this.f1720B) {
                return ArrayMap.this.j(this.f1719A);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f1719A < this.f1721z;
        }

        public int hashCode() {
            if (this.f1720B) {
                Object g2 = ArrayMap.this.g(this.f1719A);
                Object j2 = ArrayMap.this.j(this.f1719A);
                int i2 = 0;
                int hashCode = g2 == null ? 0 : g2.hashCode();
                if (j2 != null) {
                    i2 = j2.hashCode();
                }
                return hashCode ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f1720B) {
                ArrayMap.this.h(this.f1719A);
                this.f1719A--;
                this.f1721z--;
                this.f1720B = false;
                return;
            }
            throw new IllegalStateException();
        }

        public Object setValue(Object obj) {
            if (this.f1720B) {
                return ArrayMap.this.i(this.f1719A, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class ValueIterator extends IndexBasedArrayIterator<V> {
        public ValueIterator() {
            super(ArrayMap.this.size());
        }

        public Object b(int i2) {
            return ArrayMap.this.j(i2);
        }

        public void c(int i2) {
            ArrayMap.this.h(i2);
        }
    }

    public ArrayMap() {
    }

    public static boolean m(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public Set entrySet() {
        EntrySet entrySet = this.C;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.C = entrySet2;
        return entrySet2;
    }

    public Object get(Object obj) {
        return super.get(obj);
    }

    public boolean k(Collection collection) {
        for (Object containsKey : collection) {
            if (!containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public Set keySet() {
        KeySet keySet = this.D;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.D = keySet2;
        return keySet2;
    }

    public boolean n(Collection collection) {
        int size = size();
        for (Object remove : collection) {
            remove(remove);
        }
        return size != size();
    }

    public boolean o(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(g(size2))) {
                h(size2);
            }
        }
        return size != size();
    }

    public void putAll(Map map) {
        b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Object remove(Object obj) {
        return super.remove(obj);
    }

    public Collection values() {
        ValueCollection valueCollection = this.E;
        if (valueCollection != null) {
            return valueCollection;
        }
        ValueCollection valueCollection2 = new ValueCollection();
        this.E = valueCollection2;
        return valueCollection2;
    }

    public ArrayMap(int i2) {
        super(i2);
    }

    public final class KeySet implements Set<K> {
        public KeySet() {
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            ArrayMap.this.clear();
        }

        public boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        public boolean containsAll(Collection collection) {
            return ArrayMap.this.k(collection);
        }

        public boolean equals(Object obj) {
            return ArrayMap.m(this, obj);
        }

        public int hashCode() {
            int i2 = 0;
            for (int size = ArrayMap.this.size() - 1; size >= 0; size--) {
                Object g2 = ArrayMap.this.g(size);
                i2 += g2 == null ? 0 : g2.hashCode();
            }
            return i2;
        }

        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        public Iterator iterator() {
            return new KeyIterator();
        }

        public boolean remove(Object obj) {
            int e2 = ArrayMap.this.e(obj);
            if (e2 < 0) {
                return false;
            }
            ArrayMap.this.h(e2);
            return true;
        }

        public boolean removeAll(Collection collection) {
            return ArrayMap.this.n(collection);
        }

        public boolean retainAll(Collection collection) {
            return ArrayMap.this.o(collection);
        }

        public int size() {
            return ArrayMap.this.size();
        }

        public Object[] toArray() {
            int size = ArrayMap.this.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = ArrayMap.this.g(i2);
            }
            return objArr;
        }

        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = ArrayMap.this.g(i2);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public final class ValueCollection implements Collection<V> {
        public ValueCollection() {
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            ArrayMap.this.clear();
        }

        public boolean contains(Object obj) {
            return ArrayMap.this.a(obj) >= 0;
        }

        public boolean containsAll(Collection collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        public Iterator iterator() {
            return new ValueIterator();
        }

        public boolean remove(Object obj) {
            int a2 = ArrayMap.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            ArrayMap.this.h(a2);
            return true;
        }

        public boolean removeAll(Collection collection) {
            int size = ArrayMap.this.size();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size) {
                if (collection.contains(ArrayMap.this.j(i2))) {
                    ArrayMap.this.h(i2);
                    i2--;
                    size--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        public boolean retainAll(Collection collection) {
            int size = ArrayMap.this.size();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size) {
                if (!collection.contains(ArrayMap.this.j(i2))) {
                    ArrayMap.this.h(i2);
                    i2--;
                    size--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        public int size() {
            return ArrayMap.this.size();
        }

        public Object[] toArray() {
            int size = ArrayMap.this.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = ArrayMap.this.j(i2);
            }
            return objArr;
        }

        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = ArrayMap.this.j(i2);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }
}
