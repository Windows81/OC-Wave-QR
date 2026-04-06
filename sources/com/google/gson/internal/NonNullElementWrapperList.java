package com.google.gson.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.RandomAccess;

public class NonNullElementWrapperList<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList f31745z;

    public void add(int i2, Object obj) {
        this.f31745z.add(i2, e(obj));
    }

    public void clear() {
        this.f31745z.clear();
    }

    public boolean contains(Object obj) {
        return this.f31745z.contains(obj);
    }

    public final Object e(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Element must be non-null");
    }

    public boolean equals(Object obj) {
        return this.f31745z.equals(obj);
    }

    public Object get(int i2) {
        return this.f31745z.get(i2);
    }

    public int hashCode() {
        return this.f31745z.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f31745z.indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return this.f31745z.lastIndexOf(obj);
    }

    public Object remove(int i2) {
        return this.f31745z.remove(i2);
    }

    public boolean removeAll(Collection collection) {
        return this.f31745z.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return this.f31745z.retainAll(collection);
    }

    public Object set(int i2, Object obj) {
        return this.f31745z.set(i2, e(obj));
    }

    public int size() {
        return this.f31745z.size();
    }

    public Object[] toArray() {
        return this.f31745z.toArray();
    }

    public boolean remove(Object obj) {
        return this.f31745z.remove(obj);
    }

    public Object[] toArray(Object[] objArr) {
        return this.f31745z.toArray(objArr);
    }
}
