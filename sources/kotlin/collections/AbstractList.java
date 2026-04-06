package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public static final Companion f40564z = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: " + i3 + ", size: " + i4);
            } else if (i2 > i3) {
                throw new IllegalArgumentException("startIndex: " + i2 + " > endIndex: " + i3);
            }
        }

        public final void b(int i2, int i3) {
            if (i2 < 0 || i2 >= i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public final void c(int i2, int i3) {
            if (i2 < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public final void d(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
            } else if (i2 > i3) {
                throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
            }
        }

        public final int e(int i2, int i3) {
            int i4 = i2 + (i2 >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            return i4 - 2147483639 > 0 ? i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i4;
        }

        public final boolean f(Collection collection, Collection collection2) {
            Intrinsics.i(collection, "c");
            Intrinsics.i(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object d2 : collection) {
                if (!Intrinsics.d(d2, it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection collection) {
            Intrinsics.i(collection, "c");
            Iterator it = collection.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i2 = (i2 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i2;
        }

        public Companion() {
        }
    }

    @Metadata
    public class IteratorImpl implements Iterator<E>, KMappedMarker {

        /* renamed from: z  reason: collision with root package name */
        public int f40566z;

        public IteratorImpl() {
        }

        public final int b() {
            return this.f40566z;
        }

        public final void c(int i2) {
            this.f40566z = i2;
        }

        public boolean hasNext() {
            return this.f40566z < AbstractList.this.size();
        }

        public Object next() {
            if (hasNext()) {
                AbstractList abstractList = AbstractList.this;
                int i2 = this.f40566z;
                this.f40566z = i2 + 1;
                return abstractList.get(i2);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata
    public class ListIteratorImpl extends AbstractList<E>.IteratorImpl implements ListIterator<E>, KMappedMarker {
        public ListIteratorImpl(int i2) {
            super();
            AbstractList.f40564z.c(i2, AbstractList.this.size());
            c(i2);
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return b() > 0;
        }

        public int nextIndex() {
            return b();
        }

        public Object previous() {
            if (hasPrevious()) {
                AbstractList abstractList = AbstractList.this;
                c(b() - 1);
                return abstractList.get(b());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return b() - 1;
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata
    public static final class SubList<E> extends AbstractList<E> implements RandomAccess {

        /* renamed from: A  reason: collision with root package name */
        public final AbstractList f40568A;

        /* renamed from: B  reason: collision with root package name */
        public final int f40569B;
        public int C;

        public SubList(AbstractList abstractList, int i2, int i3) {
            Intrinsics.i(abstractList, "list");
            this.f40568A = abstractList;
            this.f40569B = i2;
            AbstractList.f40564z.d(i2, i3, abstractList.size());
            this.C = i3 - i2;
        }

        public int g() {
            return this.C;
        }

        public Object get(int i2) {
            AbstractList.f40564z.b(i2, this.C);
            return this.f40568A.get(this.f40569B + i2);
        }
    }

    public void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f40564z.f(this, (Collection) obj);
    }

    public abstract Object get(int i2);

    public int hashCode() {
        return f40564z.g(this);
    }

    public int indexOf(Object obj) {
        int i2 = 0;
        for (Object d2 : this) {
            if (Intrinsics.d(d2, obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public Iterator iterator() {
        return new IteratorImpl();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.d(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ListIteratorImpl(0);
    }

    public Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i2, int i3) {
        return new SubList(this, i2, i3);
    }

    public ListIterator listIterator(int i2) {
        return new ListIteratorImpl(i2);
    }
}
