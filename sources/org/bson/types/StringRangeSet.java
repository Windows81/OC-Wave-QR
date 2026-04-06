package org.bson.types;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.bson.assertions.Assertions;

class StringRangeSet implements Set<String> {

    /* renamed from: A  reason: collision with root package name */
    public static final String[] f44043A = new String[1024];

    /* renamed from: z  reason: collision with root package name */
    public final int f44044z;

    static {
        int i2 = 0;
        while (true) {
            String[] strArr = f44043A;
            if (i2 < strArr.length) {
                strArr[i2] = String.valueOf(i2);
                i2++;
            } else {
                return;
            }
        }
    }

    public StringRangeSet(int i2) {
        Assertions.a("size >= 0", i2 >= 0);
        this.f44044z = i2;
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) obj);
            return parseInt >= 0 && parseInt < size();
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean add(String str) {
        throw new UnsupportedOperationException();
    }

    public final String i(int i2) {
        String[] strArr = f44043A;
        return i2 < strArr.length ? strArr[i2] : Integer.toString(i2);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator iterator() {
        return new Iterator<String>() {

            /* renamed from: z  reason: collision with root package name */
            public int f44046z = 0;

            /* renamed from: b */
            public String next() {
                if (hasNext()) {
                    StringRangeSet stringRangeSet = StringRangeSet.this;
                    int i2 = this.f44046z;
                    this.f44046z = i2 + 1;
                    return stringRangeSet.i(i2);
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                return this.f44046z < StringRangeSet.this.f44044z;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f44044z;
    }

    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        for (int i2 = 0; i2 < size(); i2++) {
            objArr[i2] = i(i2);
        }
        return objArr;
    }

    public Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        if (objArr.length >= size()) {
            objArr2 = objArr;
        } else {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f44044z);
        }
        for (int i2 = 0; i2 < size(); i2++) {
            objArr2[i2] = i(i2);
        }
        if (objArr.length > size()) {
            objArr[this.f44044z] = null;
        }
        return objArr2;
    }
}
