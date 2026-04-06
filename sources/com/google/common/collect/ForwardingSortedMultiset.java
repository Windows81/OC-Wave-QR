package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.NavigableSet;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    public abstract class StandardDescendingMultiset extends DescendingMultiset<E> {
        public final /* synthetic */ ForwardingSortedMultiset C;

        public SortedMultiset d0() {
            return this.C;
        }
    }

    public class StandardElementSet extends SortedMultisets.NavigableElementSet<E> {
    }

    public SortedMultiset E0(Object obj, BoundType boundType) {
        return Z().E0(obj, boundType);
    }

    public SortedMultiset S0(Object obj, BoundType boundType) {
        return Z().S0(obj, boundType);
    }

    /* renamed from: a0 */
    public abstract SortedMultiset Z();

    public Comparator comparator() {
        return Z().comparator();
    }

    public SortedMultiset e0() {
        return Z().e0();
    }

    public Multiset.Entry firstEntry() {
        return Z().firstEntry();
    }

    public Multiset.Entry lastEntry() {
        return Z().lastEntry();
    }

    public Multiset.Entry pollFirstEntry() {
        return Z().pollFirstEntry();
    }

    public Multiset.Entry pollLastEntry() {
        return Z().pollLastEntry();
    }

    public SortedMultiset w1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return Z().w1(obj, boundType, obj2, boundType2);
    }

    public NavigableSet k() {
        return Z().k();
    }
}
