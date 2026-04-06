package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    /* renamed from: Z */
    public abstract List Q();

    public void add(int i2, Object obj) {
        Q().add(i2, obj);
    }

    public boolean addAll(int i2, Collection collection) {
        return Q().addAll(i2, collection);
    }

    public boolean equals(Object obj) {
        return obj == this || Q().equals(obj);
    }

    public Object get(int i2) {
        return Q().get(i2);
    }

    public int hashCode() {
        return Q().hashCode();
    }

    public int indexOf(Object obj) {
        return Q().indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return Q().lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return Q().listIterator();
    }

    public Object remove(int i2) {
        return Q().remove(i2);
    }

    public Object set(int i2, Object obj) {
        return Q().set(i2, obj);
    }

    public List subList(int i2, int i3) {
        return Q().subList(i2, i3);
    }

    public ListIterator listIterator(int i2) {
        return Q().listIterator(i2);
    }
}
