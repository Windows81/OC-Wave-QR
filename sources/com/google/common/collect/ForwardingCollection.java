package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    /* renamed from: Q */
    public abstract Collection M();

    public boolean R(Collection collection) {
        return Iterators.a(this, collection.iterator());
    }

    public boolean S(Collection collection) {
        return Collections2.b(this, collection);
    }

    public boolean U(Collection collection) {
        return Iterators.F(iterator(), collection);
    }

    public Object[] V() {
        return toArray(new Object[size()]);
    }

    public Object[] W(Object[] objArr) {
        return ObjectArrays.i(this, objArr);
    }

    public String Y() {
        return Collections2.i(this);
    }

    public boolean add(Object obj) {
        return M().add(obj);
    }

    public boolean addAll(Collection collection) {
        return M().addAll(collection);
    }

    public void clear() {
        M().clear();
    }

    public boolean contains(Object obj) {
        return M().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return M().containsAll(collection);
    }

    public boolean isEmpty() {
        return M().isEmpty();
    }

    public Iterator iterator() {
        return M().iterator();
    }

    public boolean remove(Object obj) {
        return M().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return M().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return M().retainAll(collection);
    }

    public int size() {
        return M().size();
    }

    public Object[] toArray() {
        return M().toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return M().toArray(objArr);
    }
}
