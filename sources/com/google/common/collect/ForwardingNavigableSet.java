package com.google.common.collect;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    public class StandardDescendingSet extends Sets.DescendingSet<E> {
    }

    public Object ceiling(Object obj) {
        return b0().ceiling(obj);
    }

    /* renamed from: d0 */
    public abstract NavigableSet b0();

    public Iterator descendingIterator() {
        return b0().descendingIterator();
    }

    public NavigableSet descendingSet() {
        return b0().descendingSet();
    }

    public Object floor(Object obj) {
        return b0().floor(obj);
    }

    public SortedSet h0(Object obj) {
        return headSet(obj, false);
    }

    public NavigableSet headSet(Object obj, boolean z2) {
        return b0().headSet(obj, z2);
    }

    public Object higher(Object obj) {
        return b0().higher(obj);
    }

    public SortedSet i0(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public SortedSet j0(Object obj) {
        return tailSet(obj, true);
    }

    public Object lower(Object obj) {
        return b0().lower(obj);
    }

    public Object pollFirst() {
        return b0().pollFirst();
    }

    public Object pollLast() {
        return b0().pollLast();
    }

    public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
        return b0().subSet(obj, z2, obj2, z3);
    }

    public NavigableSet tailSet(Object obj, boolean z2) {
        return b0().tailSet(obj, z2);
    }
}
