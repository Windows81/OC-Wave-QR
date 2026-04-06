package org.bson;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class LazyBSONList extends LazyBSONObject implements List {

    public class LazyBSONListIterator implements Iterator {

        /* renamed from: A  reason: collision with root package name */
        public BsonType f43678A;

        /* renamed from: z  reason: collision with root package name */
        public final BsonBinaryReader f43680z;

        public LazyBSONListIterator() {
            BsonBinaryReader m2 = LazyBSONList.this.m();
            this.f43680z = m2;
            m2.Z0();
        }

        public boolean hasNext() {
            if (this.f43678A == null) {
                this.f43678A = this.f43680z.t1();
            }
            return this.f43678A != BsonType.END_OF_DOCUMENT;
        }

        public Object next() {
            if (hasNext()) {
                this.f43678A = null;
                this.f43680z.h1();
                return LazyBSONList.this.s(this.f43680z);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported");
        }
    }

    public LazyBSONList(byte[] bArr, int i2, LazyBSONCallback lazyBSONCallback) {
        super(bArr, i2, lazyBSONCallback);
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Object is read only");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Object is read only");
    }

    public void clear() {
        throw new UnsupportedOperationException("Object is read only");
    }

    public boolean contains(Object obj) {
        return indexOf(obj) > -1;
    }

    public boolean containsAll(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        return hashSet.containsAll(collection);
    }

    public Object get(int i2) {
        return e(String.valueOf(i2));
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public Iterator iterator() {
        return new LazyBSONListIterator();
    }

    public int lastIndexOf(Object obj) {
        Iterator it = iterator();
        int i2 = -1;
        int i3 = 0;
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Operation is not supported instance of this type");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Object is read only");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Object is read only");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Object is read only");
    }

    public Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Object is read only");
    }

    public int size() {
        return keySet().size();
    }

    public List subList(int i2, int i3) {
        throw new UnsupportedOperationException("Operation is not supported");
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException("Operation is not supported");
    }

    public void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Object is read only");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Object is read only");
    }

    public ListIterator listIterator(int i2) {
        throw new UnsupportedOperationException("Operation is not supported instance of this type");
    }

    public Object remove(int i2) {
        throw new UnsupportedOperationException("Object is read only");
    }

    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException("Operation is not supported");
    }
}
