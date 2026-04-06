package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import org.jspecify.nullness.NullMarked;

@NullMarked
@DoNotMock
public abstract class zzac extends AbstractCollection implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public static final Object[] f25279z = new Object[0];

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int e(Object[] objArr, int i2) {
        throw null;
    }

    public int g() {
        throw null;
    }

    public int h() {
        throw null;
    }

    public zzag i() {
        throw null;
    }

    /* renamed from: m */
    public abstract zzaj iterator();

    public abstract boolean n();

    public Object[] o() {
        throw null;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray() {
        return toArray(f25279z);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] o2 = o();
            if (o2 != null) {
                return Arrays.copyOfRange(o2, h(), g(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        e(objArr, 0);
        return objArr;
    }
}
