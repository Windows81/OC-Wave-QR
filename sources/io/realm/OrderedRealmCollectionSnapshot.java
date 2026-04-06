package io.realm;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class OrderedRealmCollectionSnapshot<E> extends OrderedRealmCollectionImpl<E> {
    public int E;

    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        super.add(i2, obj);
    }

    public /* bridge */ /* synthetic */ boolean addAll(int i2, Collection collection) {
        return super.addAll(i2, collection);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        return super.get(i2);
    }

    public boolean isLoaded() {
        return true;
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    public /* bridge */ /* synthetic */ Object remove(int i2) {
        return super.remove(i2);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        return super.set(i2, obj);
    }

    public int size() {
        if (this.E == -1) {
            this.E = super.size();
        }
        return this.E;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
        return super.listIterator(i2);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }
}
