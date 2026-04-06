package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        Object a();

        int getCount();

        String toString();
    }

    int L0(Object obj);

    int N(Object obj, int i2);

    int T(Object obj, int i2);

    boolean contains(Object obj);

    boolean containsAll(Collection collection);

    Set entrySet();

    boolean equals(Object obj);

    int hashCode();

    Iterator iterator();

    Set k();

    int n0(Object obj, int i2);

    boolean remove(Object obj);

    int size();

    boolean t0(Object obj, int i2, int i3);
}
