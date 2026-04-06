package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
final class CartesianList<E> extends AbstractList<List<E>> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final transient int[] f28020A;

    /* renamed from: z  reason: collision with root package name */
    public final transient ImmutableList f28021z;

    public boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List<Object> list = (List) obj;
        if (list.size() != this.f28021z.size()) {
            return false;
        }
        int i2 = 0;
        for (Object contains : list) {
            if (!((List) this.f28021z.get(i2)).contains(contains)) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* renamed from: h */
    public ImmutableList get(final int i2) {
        Preconditions.o(i2, size());
        return new ImmutableList<E>() {
            public Object get(int i2) {
                Preconditions.o(i2, size());
                return ((List) CartesianList.this.f28021z.get(i2)).get(CartesianList.this.i(i2, i2));
            }

            public boolean n() {
                return true;
            }

            public int size() {
                return CartesianList.this.f28021z.size();
            }
        };
    }

    public final int i(int i2, int i3) {
        return (i2 / this.f28020A[i3 + 1]) % ((List) this.f28021z.get(i3)).size();
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f28021z.size()) {
            return -1;
        }
        ListIterator listIterator = list.listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int indexOf = ((List) this.f28021z.get(nextIndex)).indexOf(listIterator.next());
            if (indexOf == -1) {
                return -1;
            }
            i2 += indexOf * this.f28020A[nextIndex + 1];
        }
        return i2;
    }

    public int lastIndexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f28021z.size()) {
            return -1;
        }
        ListIterator listIterator = list.listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int lastIndexOf = ((List) this.f28021z.get(nextIndex)).lastIndexOf(listIterator.next());
            if (lastIndexOf == -1) {
                return -1;
            }
            i2 += lastIndexOf * this.f28020A[nextIndex + 1];
        }
        return i2;
    }

    public int size() {
        return this.f28020A[0];
    }
}
