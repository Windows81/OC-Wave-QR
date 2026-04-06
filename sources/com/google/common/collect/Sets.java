package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.math.IntMath;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
public final class Sets {

    /* renamed from: com.google.common.collect.Sets$4  reason: invalid class name */
    class AnonymousClass4 extends SetView<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Set f28530A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Set f28531z;

        public boolean contains(Object obj) {
            return this.f28530A.contains(obj) ^ this.f28531z.contains(obj);
        }

        /* renamed from: e */
        public UnmodifiableIterator iterator() {
            final Iterator it = this.f28531z.iterator();
            final Iterator it2 = this.f28530A.iterator();
            return new AbstractIterator<Object>() {
                public Object b() {
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!AnonymousClass4.this.f28530A.contains(next)) {
                            return next;
                        }
                    }
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (!AnonymousClass4.this.f28531z.contains(next2)) {
                            return next2;
                        }
                    }
                    return c();
                }
            };
        }

        public boolean isEmpty() {
            return this.f28531z.equals(this.f28530A);
        }

        public int size() {
            int i2 = 0;
            for (Object contains : this.f28531z) {
                if (!this.f28530A.contains(contains)) {
                    i2++;
                }
            }
            for (Object contains2 : this.f28530A) {
                if (!this.f28531z.contains(contains2)) {
                    i2++;
                }
            }
            return i2;
        }
    }

    /* renamed from: com.google.common.collect.Sets$5  reason: invalid class name */
    class AnonymousClass5 extends AbstractSet<Set<Object>> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ ImmutableMap f28533A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f28534z;

        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            return set.size() == this.f28534z && this.f28533A.keySet().containsAll(set);
        }

        public Iterator iterator() {
            return new AbstractIterator<Set<Object>>() {

                /* renamed from: B  reason: collision with root package name */
                public final BitSet f28535B;

                {
                    this.f28535B = new BitSet(AnonymousClass5.this.f28533A.size());
                }

                /* renamed from: e */
                public Set b() {
                    if (this.f28535B.isEmpty()) {
                        this.f28535B.set(0, AnonymousClass5.this.f28534z);
                    } else {
                        int nextSetBit = this.f28535B.nextSetBit(0);
                        int nextClearBit = this.f28535B.nextClearBit(nextSetBit);
                        if (nextClearBit == AnonymousClass5.this.f28533A.size()) {
                            return (Set) c();
                        }
                        int i2 = (nextClearBit - nextSetBit) - 1;
                        this.f28535B.set(0, i2);
                        this.f28535B.clear(i2, nextClearBit);
                        this.f28535B.set(nextClearBit);
                    }
                    final BitSet bitSet = (BitSet) this.f28535B.clone();
                    return new AbstractSet<Object>() {
                        public boolean contains(Object obj) {
                            Integer num = (Integer) AnonymousClass5.this.f28533A.get(obj);
                            return num != null && bitSet.get(num.intValue());
                        }

                        public Iterator iterator() {
                            return new AbstractIterator<Object>() {

                                /* renamed from: B  reason: collision with root package name */
                                public int f28538B = -1;

                                public Object b() {
                                    int nextSetBit = bitSet.nextSetBit(this.f28538B + 1);
                                    this.f28538B = nextSetBit;
                                    return nextSetBit == -1 ? c() : AnonymousClass5.this.f28533A.keySet().e().get(this.f28538B);
                                }
                            };
                        }

                        public int size() {
                            return AnonymousClass5.this.f28534z;
                        }
                    };
                }
            };
        }

        public int size() {
            return IntMath.a(this.f28533A.size(), this.f28534z);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28533A.keySet());
            int i2 = this.f28534z;
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Sets.combinations(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {

        /* renamed from: A  reason: collision with root package name */
        public final transient CartesianList f28539A;

        /* renamed from: z  reason: collision with root package name */
        public final transient ImmutableList f28540z;

        /* renamed from: com.google.common.collect.Sets$CartesianSet$1  reason: invalid class name */
        class AnonymousClass1 extends ImmutableList<List<Object>> {

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ ImmutableList f28541B;

            /* renamed from: Q */
            public List get(int i2) {
                return ((ImmutableSet) this.f28541B.get(i2)).e();
            }

            public boolean n() {
                return true;
            }

            public int size() {
                return this.f28541B.size();
            }
        }

        /* renamed from: Q */
        public Collection M() {
            return this.f28539A;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List<Object> list = (List) obj;
            if (list.size() != this.f28540z.size()) {
                return false;
            }
            int i2 = 0;
            for (Object contains : list) {
                if (!((ImmutableSet) this.f28540z.get(i2)).contains(contains)) {
                    return false;
                }
                i2++;
            }
            return true;
        }

        public boolean equals(Object obj) {
            return obj instanceof CartesianSet ? this.f28540z.equals(((CartesianSet) obj).f28540z) : super.equals(obj);
        }

        public int hashCode() {
            int i2 = 1;
            int size = size() - 1;
            for (int i3 = 0; i3 < this.f28540z.size(); i3++) {
                size = ~(~(size * 31));
            }
            UnmodifiableIterator o2 = this.f28540z.iterator();
            while (o2.hasNext()) {
                Set set = (Set) o2.next();
                i2 = ~(~((i2 * 31) + ((size() / set.size()) * set.hashCode())));
            }
            return ~(~(i2 + size));
        }
    }

    public static class DescendingSet<E> extends ForwardingNavigableSet<E> {

        /* renamed from: z  reason: collision with root package name */
        public final NavigableSet f28542z;

        public static Ordering k0(Comparator comparator) {
            return Ordering.a(comparator).j();
        }

        public Object ceiling(Object obj) {
            return this.f28542z.floor(obj);
        }

        public Comparator comparator() {
            Comparator comparator = this.f28542z.comparator();
            return comparator == null ? Ordering.e().j() : k0(comparator);
        }

        /* renamed from: d0 */
        public NavigableSet b0() {
            return this.f28542z;
        }

        public Iterator descendingIterator() {
            return this.f28542z.iterator();
        }

        public NavigableSet descendingSet() {
            return this.f28542z;
        }

        public Object first() {
            return this.f28542z.last();
        }

        public Object floor(Object obj) {
            return this.f28542z.ceiling(obj);
        }

        public NavigableSet headSet(Object obj, boolean z2) {
            return this.f28542z.tailSet(obj, z2).descendingSet();
        }

        public Object higher(Object obj) {
            return this.f28542z.lower(obj);
        }

        public Iterator iterator() {
            return this.f28542z.descendingIterator();
        }

        public Object last() {
            return this.f28542z.first();
        }

        public Object lower(Object obj) {
            return this.f28542z.higher(obj);
        }

        public Object pollFirst() {
            return this.f28542z.pollLast();
        }

        public Object pollLast() {
            return this.f28542z.pollFirst();
        }

        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return this.f28542z.subSet(obj2, z3, obj, z2).descendingSet();
        }

        public NavigableSet tailSet(Object obj, boolean z2) {
            return this.f28542z.headSet(obj, z2).descendingSet();
        }

        public Object[] toArray() {
            return V();
        }

        public String toString() {
            return Y();
        }

        public SortedSet headSet(Object obj) {
            return h0(obj);
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return i0(obj, obj2);
        }

        public SortedSet tailSet(Object obj) {
            return j0(obj);
        }

        public Object[] toArray(Object[] objArr) {
            return W(objArr);
        }
    }

    public static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        public FilteredNavigableSet(NavigableSet navigableSet, Predicate predicate) {
            super(navigableSet, predicate);
        }

        public Object ceiling(Object obj) {
            return Iterables.g(g().tailSet(obj, true), this.f28023A, (Object) null);
        }

        public Iterator descendingIterator() {
            return Iterators.p(g().descendingIterator(), this.f28023A);
        }

        public NavigableSet descendingSet() {
            return Sets.c(g().descendingSet(), this.f28023A);
        }

        public Object floor(Object obj) {
            return Iterators.r(g().headSet(obj, true).descendingIterator(), this.f28023A, (Object) null);
        }

        public NavigableSet g() {
            return (NavigableSet) this.f28024z;
        }

        public NavigableSet headSet(Object obj, boolean z2) {
            return Sets.c(g().headSet(obj, z2), this.f28023A);
        }

        public Object higher(Object obj) {
            return Iterables.g(g().tailSet(obj, false), this.f28023A, (Object) null);
        }

        public Object last() {
            return Iterators.q(g().descendingIterator(), this.f28023A);
        }

        public Object lower(Object obj) {
            return Iterators.r(g().headSet(obj, false).descendingIterator(), this.f28023A, (Object) null);
        }

        public Object pollFirst() {
            return Iterables.i(g(), this.f28023A);
        }

        public Object pollLast() {
            return Iterables.i(g().descendingSet(), this.f28023A);
        }

        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return Sets.c(g().subSet(obj, z2, obj2, z3), this.f28023A);
        }

        public NavigableSet tailSet(Object obj, boolean z2) {
            return Sets.c(g().tailSet(obj, z2), this.f28023A);
        }
    }

    public static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        public FilteredSet(Set set, Predicate predicate) {
            super(set, predicate);
        }

        public boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        public int hashCode() {
            return Sets.f(this);
        }
    }

    public static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        public FilteredSortedSet(SortedSet sortedSet, Predicate predicate) {
            super(sortedSet, predicate);
        }

        public Comparator comparator() {
            return ((SortedSet) this.f28024z).comparator();
        }

        public Object first() {
            return Iterators.q(this.f28024z.iterator(), this.f28023A);
        }

        public SortedSet headSet(Object obj) {
            return new FilteredSortedSet(((SortedSet) this.f28024z).headSet(obj), this.f28023A);
        }

        public Object last() {
            SortedSet sortedSet = (SortedSet) this.f28024z;
            while (true) {
                Object last = sortedSet.last();
                if (this.f28023A.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new FilteredSortedSet(((SortedSet) this.f28024z).subSet(obj, obj2), this.f28023A);
        }

        public SortedSet tailSet(Object obj) {
            return new FilteredSortedSet(((SortedSet) this.f28024z).tailSet(obj), this.f28023A);
        }
    }

    public static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        public boolean removeAll(Collection collection) {
            return Sets.m(this, collection);
        }

        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) Preconditions.q(collection));
        }
    }

    public static final class PowerSet<E> extends AbstractSet<Set<E>> {

        /* renamed from: z  reason: collision with root package name */
        public final ImmutableMap f28543z;

        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f28543z.keySet().containsAll((Set) obj);
        }

        public boolean equals(Object obj) {
            return obj instanceof PowerSet ? this.f28543z.keySet().equals(((PowerSet) obj).f28543z.keySet()) : super.equals(obj);
        }

        public int hashCode() {
            return this.f28543z.keySet().hashCode() << (this.f28543z.size() - 1);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator iterator() {
            return new AbstractIndexedListIterator<Set<E>>(size()) {
                /* renamed from: c */
                public Set b(int i2) {
                    return new SubSet(PowerSet.this.f28543z, i2);
                }
            };
        }

        public int size() {
            return 1 << this.f28543z.size();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28543z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 10);
            sb.append("powerSet(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static abstract class SetView<E> extends AbstractSet<E> {
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public abstract UnmodifiableIterator iterator();

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public SetView() {
        }
    }

    public static final class SubSet<E> extends AbstractSet<E> {

        /* renamed from: A  reason: collision with root package name */
        public final int f28545A;

        /* renamed from: z  reason: collision with root package name */
        public final ImmutableMap f28546z;

        public SubSet(ImmutableMap immutableMap, int i2) {
            this.f28546z = immutableMap;
            this.f28545A = i2;
        }

        public boolean contains(Object obj) {
            Integer num = (Integer) this.f28546z.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.f28545A) != 0) {
                    return true;
                }
            }
            return false;
        }

        public Iterator iterator() {
            return new UnmodifiableIterator<E>() {

                /* renamed from: A  reason: collision with root package name */
                public int f28547A;

                /* renamed from: z  reason: collision with root package name */
                public final ImmutableList f28549z;

                {
                    this.f28549z = SubSet.this.f28546z.keySet().e();
                    this.f28547A = SubSet.this.f28545A;
                }

                public boolean hasNext() {
                    return this.f28547A != 0;
                }

                public Object next() {
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f28547A);
                    if (numberOfTrailingZeros != 32) {
                        this.f28547A &= ~(1 << numberOfTrailingZeros);
                        return this.f28549z.get(numberOfTrailingZeros);
                    }
                    throw new NoSuchElementException();
                }
            };
        }

        public int size() {
            return Integer.bitCount(this.f28545A);
        }
    }

    public static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final SortedSet f28550A;

        /* renamed from: B  reason: collision with root package name */
        public transient UnmodifiableNavigableSet f28551B;

        /* renamed from: z  reason: collision with root package name */
        public final NavigableSet f28552z;

        public UnmodifiableNavigableSet(NavigableSet navigableSet) {
            this.f28552z = (NavigableSet) Preconditions.q(navigableSet);
            this.f28550A = Collections.unmodifiableSortedSet(navigableSet);
        }

        /* renamed from: b0 */
        public SortedSet Z() {
            return this.f28550A;
        }

        public Object ceiling(Object obj) {
            return this.f28552z.ceiling(obj);
        }

        public Iterator descendingIterator() {
            return Iterators.K(this.f28552z.descendingIterator());
        }

        public NavigableSet descendingSet() {
            UnmodifiableNavigableSet unmodifiableNavigableSet = this.f28551B;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet unmodifiableNavigableSet2 = new UnmodifiableNavigableSet(this.f28552z.descendingSet());
            this.f28551B = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.f28551B = this;
            return unmodifiableNavigableSet2;
        }

        public Object floor(Object obj) {
            return this.f28552z.floor(obj);
        }

        public NavigableSet headSet(Object obj, boolean z2) {
            return Sets.p(this.f28552z.headSet(obj, z2));
        }

        public Object higher(Object obj) {
            return this.f28552z.higher(obj);
        }

        public Object lower(Object obj) {
            return this.f28552z.lower(obj);
        }

        public Object pollFirst() {
            throw new UnsupportedOperationException();
        }

        public Object pollLast() {
            throw new UnsupportedOperationException();
        }

        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return Sets.p(this.f28552z.subSet(obj, z2, obj2, z3));
        }

        public NavigableSet tailSet(Object obj, boolean z2) {
            return Sets.p(this.f28552z.tailSet(obj, z2));
        }
    }

    public static SetView a(final Set set, final Set set2) {
        Preconditions.r(set, "set1");
        Preconditions.r(set2, "set2");
        return new SetView<Object>() {
            public boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }

            /* renamed from: e */
            public UnmodifiableIterator iterator() {
                return new AbstractIterator<Object>() {

                    /* renamed from: B  reason: collision with root package name */
                    public final Iterator f28529B;

                    {
                        this.f28529B = set.iterator();
                    }

                    public Object b() {
                        while (this.f28529B.hasNext()) {
                            Object next = this.f28529B.next();
                            if (!set2.contains(next)) {
                                return next;
                            }
                        }
                        return c();
                    }
                };
            }

            public boolean isEmpty() {
                return set2.containsAll(set);
            }

            public int size() {
                int i2 = 0;
                for (Object contains : set) {
                    if (!set2.contains(contains)) {
                        i2++;
                    }
                }
                return i2;
            }
        };
    }

    public static boolean b(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static NavigableSet c(NavigableSet navigableSet, Predicate predicate) {
        if (!(navigableSet instanceof FilteredSet)) {
            return new FilteredNavigableSet((NavigableSet) Preconditions.q(navigableSet), (Predicate) Preconditions.q(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) navigableSet;
        return new FilteredNavigableSet((NavigableSet) filteredSet.f28024z, Predicates.c(filteredSet.f28023A, predicate));
    }

    public static Set d(Set set, Predicate predicate) {
        if (set instanceof SortedSet) {
            return e((SortedSet) set, predicate);
        }
        if (!(set instanceof FilteredSet)) {
            return new FilteredSet((Set) Preconditions.q(set), (Predicate) Preconditions.q(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) set;
        return new FilteredSet((Set) filteredSet.f28024z, Predicates.c(filteredSet.f28023A, predicate));
    }

    public static SortedSet e(SortedSet sortedSet, Predicate predicate) {
        if (!(sortedSet instanceof FilteredSet)) {
            return new FilteredSortedSet((SortedSet) Preconditions.q(sortedSet), (Predicate) Preconditions.q(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) sortedSet;
        return new FilteredSortedSet((SortedSet) filteredSet.f28024z, Predicates.c(filteredSet.f28023A, predicate));
    }

    public static int f(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    public static SetView g(final Set set, final Set set2) {
        Preconditions.r(set, "set1");
        Preconditions.r(set2, "set2");
        return new SetView<Object>() {
            public boolean contains(Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            public boolean containsAll(Collection collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }

            /* renamed from: e */
            public UnmodifiableIterator iterator() {
                return new AbstractIterator<Object>() {

                    /* renamed from: B  reason: collision with root package name */
                    public final Iterator f28526B;

                    {
                        this.f28526B = set.iterator();
                    }

                    public Object b() {
                        while (this.f28526B.hasNext()) {
                            Object next = this.f28526B.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return c();
                    }
                };
            }

            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            public int size() {
                int i2 = 0;
                for (Object contains : set) {
                    if (set2.contains(contains)) {
                        i2++;
                    }
                }
                return i2;
            }
        };
    }

    public static HashSet h() {
        return new HashSet();
    }

    public static HashSet i(int i2) {
        return new HashSet(Maps.m(i2));
    }

    public static Set j() {
        return Collections.newSetFromMap(Maps.A());
    }

    public static LinkedHashSet k() {
        return new LinkedHashSet();
    }

    public static LinkedHashSet l(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet k2 = k();
        Iterables.a(k2, iterable);
        return k2;
    }

    public static boolean m(Set set, Collection collection) {
        Preconditions.q(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).k();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? n(set, collection.iterator()) : Iterators.D(set.iterator(), collection);
    }

    public static boolean n(Set set, Iterator it) {
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= set.remove(it.next());
        }
        return z2;
    }

    public static SetView o(final Set set, final Set set2) {
        Preconditions.r(set, "set1");
        Preconditions.r(set2, "set2");
        return new SetView<Object>() {
            public boolean contains(Object obj) {
                return set.contains(obj) || set2.contains(obj);
            }

            /* renamed from: e */
            public UnmodifiableIterator iterator() {
                return new AbstractIterator<Object>() {

                    /* renamed from: B  reason: collision with root package name */
                    public final Iterator f28523B;
                    public final Iterator C;

                    {
                        this.f28523B = set.iterator();
                        this.C = set2.iterator();
                    }

                    public Object b() {
                        if (this.f28523B.hasNext()) {
                            return this.f28523B.next();
                        }
                        while (this.C.hasNext()) {
                            Object next = this.C.next();
                            if (!set.contains(next)) {
                                return next;
                            }
                        }
                        return c();
                    }
                };
            }

            public boolean isEmpty() {
                return set.isEmpty() && set2.isEmpty();
            }

            public int size() {
                int size = set.size();
                for (Object contains : set2) {
                    if (!set.contains(contains)) {
                        size++;
                    }
                }
                return size;
            }
        };
    }

    public static NavigableSet p(NavigableSet navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }
}
