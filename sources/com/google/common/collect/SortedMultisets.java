package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
final class SortedMultisets {

    public static class ElementSet<E> extends Multisets.ElementSet<E> implements SortedSet<E> {

        /* renamed from: z  reason: collision with root package name */
        public final SortedMultiset f28561z;

        public ElementSet(SortedMultiset sortedMultiset) {
            this.f28561z = sortedMultiset;
        }

        public Comparator comparator() {
            return m().comparator();
        }

        public Object first() {
            return SortedMultisets.d(m().firstEntry());
        }

        public SortedSet headSet(Object obj) {
            return m().E0(obj, BoundType.OPEN).k();
        }

        public Iterator iterator() {
            return Multisets.e(m().entrySet().iterator());
        }

        public Object last() {
            return SortedMultisets.d(m().lastEntry());
        }

        /* renamed from: n */
        public final SortedMultiset m() {
            return this.f28561z;
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return m().w1(obj, BoundType.CLOSED, obj2, BoundType.OPEN).k();
        }

        public SortedSet tailSet(Object obj) {
            return m().S0(obj, BoundType.CLOSED).k();
        }
    }

    public static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        public NavigableElementSet(SortedMultiset sortedMultiset) {
            super(sortedMultiset);
        }

        public Object ceiling(Object obj) {
            return SortedMultisets.c(m().S0(obj, BoundType.CLOSED).firstEntry());
        }

        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet descendingSet() {
            return new NavigableElementSet(m().e0());
        }

        public Object floor(Object obj) {
            return SortedMultisets.c(m().E0(obj, BoundType.CLOSED).lastEntry());
        }

        public NavigableSet headSet(Object obj, boolean z2) {
            return new NavigableElementSet(m().E0(obj, BoundType.f(z2)));
        }

        public Object higher(Object obj) {
            return SortedMultisets.c(m().S0(obj, BoundType.OPEN).firstEntry());
        }

        public Object lower(Object obj) {
            return SortedMultisets.c(m().E0(obj, BoundType.OPEN).lastEntry());
        }

        public Object pollFirst() {
            return SortedMultisets.c(m().pollFirstEntry());
        }

        public Object pollLast() {
            return SortedMultisets.c(m().pollLastEntry());
        }

        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return new NavigableElementSet(m().w1(obj, BoundType.f(z2), obj2, BoundType.f(z3)));
        }

        public NavigableSet tailSet(Object obj, boolean z2) {
            return new NavigableElementSet(m().S0(obj, BoundType.f(z2)));
        }
    }

    public static Object c(Multiset.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.a();
    }

    public static Object d(Multiset.Entry entry) {
        if (entry != null) {
            return entry.a();
        }
        throw new NoSuchElementException();
    }
}
