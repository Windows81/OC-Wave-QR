package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

@ElementTypesAreNonnullByDefault
abstract class AbstractSortedMultiset<E> extends AbstractMultiset<E> implements SortedMultiset<E> {

    /* renamed from: B  reason: collision with root package name */
    public final Comparator f27993B;
    public transient SortedMultiset C;

    public AbstractSortedMultiset() {
        this(Ordering.e());
    }

    public Comparator comparator() {
        return this.f27993B;
    }

    public Iterator descendingIterator() {
        return Multisets.i(e0());
    }

    public SortedMultiset e0() {
        SortedMultiset sortedMultiset = this.C;
        if (sortedMultiset != null) {
            return sortedMultiset;
        }
        SortedMultiset n2 = n();
        this.C = n2;
        return n2;
    }

    public Multiset.Entry firstEntry() {
        Iterator m2 = m();
        if (m2.hasNext()) {
            return (Multiset.Entry) m2.next();
        }
        return null;
    }

    public Multiset.Entry lastEntry() {
        Iterator p2 = p();
        if (p2.hasNext()) {
            return (Multiset.Entry) p2.next();
        }
        return null;
    }

    public SortedMultiset n() {
        return new DescendingMultiset<E>() {
            public Iterator b0() {
                return AbstractSortedMultiset.this.p();
            }

            public SortedMultiset d0() {
                return AbstractSortedMultiset.this;
            }

            public Iterator iterator() {
                return AbstractSortedMultiset.this.descendingIterator();
            }
        };
    }

    /* renamed from: o */
    public NavigableSet e() {
        return new SortedMultisets.NavigableElementSet(this);
    }

    public abstract Iterator p();

    public Multiset.Entry pollFirstEntry() {
        Iterator m2 = m();
        if (!m2.hasNext()) {
            return null;
        }
        Multiset.Entry entry = (Multiset.Entry) m2.next();
        Multiset.Entry g2 = Multisets.g(entry.a(), entry.getCount());
        m2.remove();
        return g2;
    }

    public Multiset.Entry pollLastEntry() {
        Iterator p2 = p();
        if (!p2.hasNext()) {
            return null;
        }
        Multiset.Entry entry = (Multiset.Entry) p2.next();
        Multiset.Entry g2 = Multisets.g(entry.a(), entry.getCount());
        p2.remove();
        return g2;
    }

    public SortedMultiset w1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        Preconditions.q(boundType);
        Preconditions.q(boundType2);
        return S0(obj, boundType).E0(obj2, boundType2);
    }

    public AbstractSortedMultiset(Comparator comparator) {
        this.f27993B = (Comparator) Preconditions.q(comparator);
    }

    public NavigableSet k() {
        return (NavigableSet) super.k();
    }
}
