package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class zzag extends zzac implements List, RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public static final zzak f25282A = new zzae(zzai.D, 0);

    public static zzag q(Object[] objArr, int i2) {
        return i2 == 0 ? zzai.D : new zzai(objArr, i2);
    }

    public static zzag s(Collection collection) {
        if (collection instanceof zzac) {
            zzag i2 = ((zzac) collection).i();
            if (!i2.n()) {
                return i2;
            }
            Object[] array = i2.toArray();
            return q(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzah.a(array2, length);
        return q(array2, length);
    }

    public static zzag u() {
        return zzai.D;
    }

    public static zzag v(Object obj) {
        Object[] objArr = {obj};
        zzah.a(objArr, 1);
        return q(objArr, 1);
    }

    public static zzag w(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzah.a(objArr, 2);
        return q(objArr, 2);
    }

    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public int e(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i2 = 0;
                    while (i2 < size) {
                        if (zzr.a(get(i2), list.get(i2))) {
                            i2++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzr.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    public final zzag i() {
        return this;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public final zzaj m() {
        return listIterator(0);
    }

    /* renamed from: p */
    public zzag subList(int i2, int i3) {
        zzs.c(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? zzai.D : new zzaf(this, i2, i4);
    }

    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: z */
    public final zzak listIterator(int i2) {
        zzs.b(i2, size(), "index");
        return isEmpty() ? f25282A : new zzae(this, i2);
    }
}
