package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.math.IntMath;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
public final class Collections2 {

    public static class FilteredCollection<E> extends AbstractCollection<E> {

        /* renamed from: A  reason: collision with root package name */
        public final Predicate f28023A;

        /* renamed from: z  reason: collision with root package name */
        public final Collection f28024z;

        public FilteredCollection(Collection collection, Predicate predicate) {
            this.f28024z = collection;
            this.f28023A = predicate;
        }

        public boolean add(Object obj) {
            Preconditions.d(this.f28023A.apply(obj));
            return this.f28024z.add(obj);
        }

        public boolean addAll(Collection collection) {
            for (Object apply : collection) {
                Preconditions.d(this.f28023A.apply(apply));
            }
            return this.f28024z.addAll(collection);
        }

        public void clear() {
            Iterables.j(this.f28024z, this.f28023A);
        }

        public boolean contains(Object obj) {
            if (Collections2.g(this.f28024z, obj)) {
                return this.f28023A.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            return Collections2.b(this, collection);
        }

        public FilteredCollection e(Predicate predicate) {
            return new FilteredCollection(this.f28024z, Predicates.c(this.f28023A, predicate));
        }

        public boolean isEmpty() {
            return !Iterables.b(this.f28024z, this.f28023A);
        }

        public Iterator iterator() {
            return Iterators.p(this.f28024z.iterator(), this.f28023A);
        }

        public boolean remove(Object obj) {
            return contains(obj) && this.f28024z.remove(obj);
        }

        public boolean removeAll(Collection collection) {
            Iterator it = this.f28024z.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f28023A.apply(next) && collection.contains(next)) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        public boolean retainAll(Collection collection) {
            Iterator it = this.f28024z.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f28023A.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        public int size() {
            int i2 = 0;
            for (Object apply : this.f28024z) {
                if (this.f28023A.apply(apply)) {
                    i2++;
                }
            }
            return i2;
        }

        public Object[] toArray() {
            return Lists.j(iterator()).toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return Lists.j(iterator()).toArray(objArr);
        }
    }

    public static final class OrderedPermutationCollection<E> extends AbstractCollection<List<E>> {

        /* renamed from: A  reason: collision with root package name */
        public final Comparator f28025A;

        /* renamed from: B  reason: collision with root package name */
        public final int f28026B;

        /* renamed from: z  reason: collision with root package name */
        public final ImmutableList f28027z;

        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return Collections2.e(this.f28027z, (List) obj);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator iterator() {
            return new OrderedPermutationIterator(this.f28027z, this.f28025A);
        }

        public int size() {
            return this.f28026B;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28027z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 30);
            sb.append("orderedPermutationCollection(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {

        /* renamed from: B  reason: collision with root package name */
        public List f28028B;
        public final Comparator C;

        public OrderedPermutationIterator(List list, Comparator comparator) {
            this.f28028B = Lists.i(list);
            this.C = comparator;
        }

        public void e() {
            int g2 = g();
            if (g2 == -1) {
                this.f28028B = null;
                return;
            }
            Objects.requireNonNull(this.f28028B);
            Collections.swap(this.f28028B, g2, h(g2));
            Collections.reverse(this.f28028B.subList(g2 + 1, this.f28028B.size()));
        }

        /* renamed from: f */
        public List b() {
            List list = this.f28028B;
            if (list == null) {
                return (List) c();
            }
            ImmutableList w2 = ImmutableList.w(list);
            e();
            return w2;
        }

        public int g() {
            Objects.requireNonNull(this.f28028B);
            for (int size = this.f28028B.size() - 2; size >= 0; size--) {
                if (this.C.compare(this.f28028B.get(size), this.f28028B.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        public int h(int i2) {
            Objects.requireNonNull(this.f28028B);
            Object obj = this.f28028B.get(i2);
            for (int size = this.f28028B.size() - 1; size > i2; size--) {
                if (this.C.compare(obj, this.f28028B.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    public static final class PermutationCollection<E> extends AbstractCollection<List<E>> {

        /* renamed from: z  reason: collision with root package name */
        public final ImmutableList f28029z;

        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return Collections2.e(this.f28029z, (List) obj);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator iterator() {
            return new PermutationIterator(this.f28029z);
        }

        public int size() {
            return IntMath.e(this.f28029z.size());
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28029z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append("permutations(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class PermutationIterator<E> extends AbstractIterator<List<E>> {

        /* renamed from: B  reason: collision with root package name */
        public final List f28030B;
        public final int[] C;
        public final int[] D;
        public int E = Integer.MAX_VALUE;

        public PermutationIterator(List list) {
            this.f28030B = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.C = iArr;
            int[] iArr2 = new int[size];
            this.D = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
        }

        public void e() {
            int size = this.f28030B.size() - 1;
            this.E = size;
            if (size != -1) {
                int i2 = 0;
                while (true) {
                    int[] iArr = this.C;
                    int i3 = this.E;
                    int i4 = iArr[i3];
                    int i5 = this.D[i3] + i4;
                    if (i5 < 0) {
                        g();
                    } else if (i5 != i3 + 1) {
                        Collections.swap(this.f28030B, (i3 - i4) + i2, (i3 - i5) + i2);
                        this.C[this.E] = i5;
                        return;
                    } else if (i3 != 0) {
                        i2++;
                        g();
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: f */
        public List b() {
            if (this.E <= 0) {
                return (List) c();
            }
            ImmutableList w2 = ImmutableList.w(this.f28030B);
            e();
            return w2;
        }

        public void g() {
            int[] iArr = this.D;
            int i2 = this.E;
            iArr[i2] = -iArr[i2];
            this.E = i2 - 1;
        }
    }

    public static class TransformedCollection<F, T> extends AbstractCollection<T> {

        /* renamed from: A  reason: collision with root package name */
        public final Function f28031A;

        /* renamed from: z  reason: collision with root package name */
        public final Collection f28032z;

        public TransformedCollection(Collection collection, Function function) {
            this.f28032z = (Collection) Preconditions.q(collection);
            this.f28031A = (Function) Preconditions.q(function);
        }

        public void clear() {
            this.f28032z.clear();
        }

        public boolean isEmpty() {
            return this.f28032z.isEmpty();
        }

        public Iterator iterator() {
            return Iterators.J(this.f28032z.iterator(), this.f28031A);
        }

        public int size() {
            return this.f28032z.size();
        }
    }

    public static boolean b(Collection collection, Collection collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public static ObjectCountHashMap c(Collection collection) {
        ObjectCountHashMap objectCountHashMap = new ObjectCountHashMap();
        for (Object next : collection) {
            objectCountHashMap.u(next, objectCountHashMap.f(next) + 1);
        }
        return objectCountHashMap;
    }

    public static Collection d(Collection collection, Predicate predicate) {
        return collection instanceof FilteredCollection ? ((FilteredCollection) collection).e(predicate) : new FilteredCollection((Collection) Preconditions.q(collection), (Predicate) Preconditions.q(predicate));
    }

    public static boolean e(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ObjectCountHashMap c2 = c(list);
        ObjectCountHashMap c3 = c(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (c2.k(i2) != c3.f(c2.i(i2))) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder f(int i2) {
        CollectPreconditions.b(i2, "size");
        return new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824));
    }

    public static boolean g(Collection collection, Object obj) {
        Preconditions.q(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean h(Collection collection, Object obj) {
        Preconditions.q(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static String i(Collection collection) {
        StringBuilder f2 = f(collection.size());
        f2.append('[');
        boolean z2 = true;
        for (Object next : collection) {
            if (!z2) {
                f2.append(", ");
            }
            if (next == collection) {
                f2.append("(this Collection)");
            } else {
                f2.append(next);
            }
            z2 = false;
        }
        f2.append(']');
        return f2.toString();
    }

    public static Collection j(Collection collection, Function function) {
        return new TransformedCollection(collection, function);
    }
}
