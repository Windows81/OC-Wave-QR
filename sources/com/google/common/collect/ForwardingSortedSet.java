package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    /* renamed from: b0 */
    public abstract SortedSet Z();

    public Comparator comparator() {
        return Z().comparator();
    }

    public Object first() {
        return Z().first();
    }

    public SortedSet headSet(Object obj) {
        return Z().headSet(obj);
    }

    public Object last() {
        return Z().last();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return Z().subSet(obj, obj2);
    }

    public SortedSet tailSet(Object obj) {
        return Z().tailSet(obj);
    }
}
