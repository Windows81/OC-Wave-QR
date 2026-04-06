package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
public final class Lists {

    /* renamed from: com.google.common.collect.Lists$1  reason: invalid class name */
    class AnonymousClass1 extends RandomAccessListWrapper<Object> {
        public ListIterator listIterator(int i2) {
            return this.f28301z.listIterator(i2);
        }
    }

    /* renamed from: com.google.common.collect.Lists$2  reason: invalid class name */
    class AnonymousClass2 extends AbstractListWrapper<Object> {
        public ListIterator listIterator(int i2) {
            return this.f28301z.listIterator(i2);
        }
    }

    public static class AbstractListWrapper<E> extends AbstractList<E> {

        /* renamed from: z  reason: collision with root package name */
        public final List f28301z;

        public void add(int i2, Object obj) {
            this.f28301z.add(i2, obj);
        }

        public boolean addAll(int i2, Collection collection) {
            return this.f28301z.addAll(i2, collection);
        }

        public boolean contains(Object obj) {
            return this.f28301z.contains(obj);
        }

        public Object get(int i2) {
            return this.f28301z.get(i2);
        }

        public Object remove(int i2) {
            return this.f28301z.remove(i2);
        }

        public Object set(int i2, Object obj) {
            return this.f28301z.set(i2, obj);
        }

        public int size() {
            return this.f28301z.size();
        }
    }

    public static final class CharSequenceAsList extends AbstractList<Character> {

        /* renamed from: z  reason: collision with root package name */
        public final CharSequence f28302z;

        /* renamed from: e */
        public Character get(int i2) {
            Preconditions.o(i2, size());
            return Character.valueOf(this.f28302z.charAt(i2));
        }

        public int size() {
            return this.f28302z.length();
        }
    }

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {

        /* renamed from: A  reason: collision with root package name */
        public final Object[] f28303A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28304z;

        public Object get(int i2) {
            Preconditions.o(i2, size());
            return i2 == 0 ? this.f28304z : this.f28303A[i2 - 1];
        }

        public int size() {
            return IntMath.i(this.f28303A.length, 1);
        }
    }

    public static class Partition<T> extends AbstractList<List<T>> {

        /* renamed from: A  reason: collision with root package name */
        public final int f28305A;

        /* renamed from: z  reason: collision with root package name */
        public final List f28306z;

        /* renamed from: e */
        public List get(int i2) {
            Preconditions.o(i2, size());
            int i3 = this.f28305A;
            int i4 = i2 * i3;
            return this.f28306z.subList(i4, Math.min(i3 + i4, this.f28306z.size()));
        }

        public boolean isEmpty() {
            return this.f28306z.isEmpty();
        }

        public int size() {
            return IntMath.d(this.f28306z.size(), this.f28305A, RoundingMode.CEILING);
        }
    }

    public static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
    }

    public static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
    }

    public static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        public RandomAccessReverseList(List list) {
            super(list);
        }
    }

    public static class ReverseList<T> extends AbstractList<T> {

        /* renamed from: z  reason: collision with root package name */
        public final List f28307z;

        public ReverseList(List list) {
            this.f28307z = (List) Preconditions.q(list);
        }

        public void add(int i2, Object obj) {
            this.f28307z.add(i(i2), obj);
        }

        public void clear() {
            this.f28307z.clear();
        }

        public List g() {
            return this.f28307z;
        }

        public Object get(int i2) {
            return this.f28307z.get(h(i2));
        }

        public final int h(int i2) {
            int size = size();
            Preconditions.o(i2, size);
            return (size - 1) - i2;
        }

        public final int i(int i2) {
            int size = size();
            Preconditions.t(i2, size);
            return size - i2;
        }

        public Iterator iterator() {
            return listIterator();
        }

        public ListIterator listIterator(int i2) {
            final ListIterator listIterator = this.f28307z.listIterator(i(i2));
            return new ListIterator<T>() {

                /* renamed from: z  reason: collision with root package name */
                public boolean f28310z;

                public void add(Object obj) {
                    listIterator.add(obj);
                    listIterator.previous();
                    this.f28310z = false;
                }

                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                public Object next() {
                    if (hasNext()) {
                        this.f28310z = true;
                        return listIterator.previous();
                    }
                    throw new NoSuchElementException();
                }

                public int nextIndex() {
                    return ReverseList.this.i(listIterator.nextIndex());
                }

                public Object previous() {
                    if (hasPrevious()) {
                        this.f28310z = true;
                        return listIterator.next();
                    }
                    throw new NoSuchElementException();
                }

                public int previousIndex() {
                    return nextIndex() - 1;
                }

                public void remove() {
                    CollectPreconditions.e(this.f28310z);
                    listIterator.remove();
                    this.f28310z = false;
                }

                public void set(Object obj) {
                    Preconditions.w(this.f28310z);
                    listIterator.set(obj);
                }
            };
        }

        public Object remove(int i2) {
            return this.f28307z.remove(h(i2));
        }

        public void removeRange(int i2, int i3) {
            subList(i2, i3).clear();
        }

        public Object set(int i2, Object obj) {
            return this.f28307z.set(h(i2), obj);
        }

        public int size() {
            return this.f28307z.size();
        }

        public List subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            return Lists.m(this.f28307z.subList(i(i3), i(i2)));
        }
    }

    public static final class StringAsImmutableList extends ImmutableList<Character> {

        /* renamed from: B  reason: collision with root package name */
        public final String f28311B;

        public StringAsImmutableList(String str) {
            this.f28311B = str;
        }

        /* renamed from: M */
        public ImmutableList subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            return Lists.a(this.f28311B.substring(i2, i3));
        }

        /* renamed from: Q */
        public Character get(int i2) {
            Preconditions.o(i2, size());
            return Character.valueOf(this.f28311B.charAt(i2));
        }

        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.f28311B.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.f28311B.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public boolean n() {
            return false;
        }

        public int size() {
            return this.f28311B.length();
        }
    }

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Function f28312A;

        /* renamed from: z  reason: collision with root package name */
        public final List f28313z;

        public TransformingRandomAccessList(List list, Function function) {
            this.f28313z = (List) Preconditions.q(list);
            this.f28312A = (Function) Preconditions.q(function);
        }

        public void clear() {
            this.f28313z.clear();
        }

        public Object get(int i2) {
            return this.f28312A.apply(this.f28313z.get(i2));
        }

        public boolean isEmpty() {
            return this.f28313z.isEmpty();
        }

        public Iterator iterator() {
            return listIterator();
        }

        public ListIterator listIterator(int i2) {
            return new TransformedListIterator<F, T>(this.f28313z.listIterator(i2)) {
                public Object b(Object obj) {
                    return TransformingRandomAccessList.this.f28312A.apply(obj);
                }
            };
        }

        public Object remove(int i2) {
            return this.f28312A.apply(this.f28313z.remove(i2));
        }

        public int size() {
            return this.f28313z.size();
        }
    }

    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Function f28315A;

        /* renamed from: z  reason: collision with root package name */
        public final List f28316z;

        public TransformingSequentialList(List list, Function function) {
            this.f28316z = (List) Preconditions.q(list);
            this.f28315A = (Function) Preconditions.q(function);
        }

        public void clear() {
            this.f28316z.clear();
        }

        public ListIterator listIterator(int i2) {
            return new TransformedListIterator<F, T>(this.f28316z.listIterator(i2)) {
                public Object b(Object obj) {
                    return TransformingSequentialList.this.f28315A.apply(obj);
                }
            };
        }

        public int size() {
            return this.f28316z.size();
        }
    }

    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {

        /* renamed from: A  reason: collision with root package name */
        public final Object f28318A;

        /* renamed from: B  reason: collision with root package name */
        public final Object[] f28319B;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28320z;

        public Object get(int i2) {
            if (i2 == 0) {
                return this.f28320z;
            }
            if (i2 == 1) {
                return this.f28318A;
            }
            Preconditions.o(i2, size());
            return this.f28319B[i2 - 2];
        }

        public int size() {
            return IntMath.i(this.f28319B.length, 2);
        }
    }

    public static ImmutableList a(String str) {
        return new StringAsImmutableList((String) Preconditions.q(str));
    }

    public static int b(int i2) {
        CollectPreconditions.b(i2, "arraySize");
        return Ints.k(((long) i2) + 5 + ((long) (i2 / 10)));
    }

    public static boolean c(List list, Object obj) {
        if (obj == Preconditions.q(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return Iterators.l(list.iterator(), list2.iterator());
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!Objects.a(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int e(List list, Object obj) {
        int size = list.size();
        int i2 = 0;
        if (obj == null) {
            while (i2 < size) {
                if (list.get(i2) == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        while (i2 < size) {
            if (obj.equals(list.get(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList h() {
        return new ArrayList();
    }

    public static ArrayList i(Iterable iterable) {
        Preconditions.q(iterable);
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : j(iterable.iterator());
    }

    public static ArrayList j(Iterator it) {
        ArrayList h2 = h();
        Iterators.a(h2, it);
        return h2;
    }

    public static ArrayList k(int i2) {
        CollectPreconditions.b(i2, "initialArraySize");
        return new ArrayList(i2);
    }

    public static ArrayList l(int i2) {
        return new ArrayList(b(i2));
    }

    public static List m(List list) {
        return list instanceof ImmutableList ? ((ImmutableList) list).K() : list instanceof ReverseList ? ((ReverseList) list).g() : list instanceof RandomAccess ? new RandomAccessReverseList(list) : new ReverseList(list);
    }

    public static List n(List list, Function function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }
}
