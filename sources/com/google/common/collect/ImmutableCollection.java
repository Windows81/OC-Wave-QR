package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public static final Object[] f28136z = new Object[0];

    public static abstract class ArrayBasedBuilder<E> extends Builder<E> {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f28137a;

        /* renamed from: b  reason: collision with root package name */
        public int f28138b = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f28139c;

        public ArrayBasedBuilder(int i2) {
            CollectPreconditions.b(i2, "initialCapacity");
            this.f28137a = new Object[i2];
        }

        /* renamed from: e */
        public ArrayBasedBuilder a(Object obj) {
            Preconditions.q(obj);
            h(this.f28138b + 1);
            Object[] objArr = this.f28137a;
            int i2 = this.f28138b;
            this.f28138b = i2 + 1;
            objArr[i2] = obj;
            return this;
        }

        public Builder f(Object... objArr) {
            g(objArr, objArr.length);
            return this;
        }

        public final void g(Object[] objArr, int i2) {
            ObjectArrays.c(objArr, i2);
            h(this.f28138b + i2);
            System.arraycopy(objArr, 0, this.f28137a, this.f28138b, i2);
            this.f28138b += i2;
        }

        public final void h(int i2) {
            Object[] objArr = this.f28137a;
            if (objArr.length < i2) {
                this.f28137a = Arrays.copyOf(objArr, Builder.d(objArr.length, i2));
                this.f28139c = false;
            } else if (this.f28139c) {
                this.f28137a = (Object[]) objArr.clone();
                this.f28139c = false;
            }
        }
    }

    @DoNotMock
    public static abstract class Builder<E> {
        public static int d(int i2, int i3) {
            if (i3 >= 0) {
                int i4 = i2 + (i2 >> 1) + 1;
                if (i4 < i3) {
                    i4 = Integer.highestOneBit(i3 - 1) << 1;
                }
                if (i4 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i4;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        public abstract Builder a(Object obj);

        public Builder b(Iterable iterable) {
            for (Object a2 : iterable) {
                a(a2);
            }
            return this;
        }

        public Builder c(Iterator it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    public ImmutableList e() {
        return isEmpty() ? ImmutableList.D() : ImmutableList.p(toArray());
    }

    public int g(Object[] objArr, int i2) {
        UnmodifiableIterator o2 = iterator();
        while (o2.hasNext()) {
            objArr[i2] = o2.next();
            i2++;
        }
        return i2;
    }

    public Object[] h() {
        return null;
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public int m() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean n();

    /* renamed from: o */
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

    public final Object[] toArray() {
        return toArray(f28136z);
    }

    public final Object[] toArray(Object[] objArr) {
        Preconditions.q(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] h2 = h();
            if (h2 != null) {
                return Platform.a(h2, m(), i(), objArr);
            }
            objArr = ObjectArrays.g(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        g(objArr, 0);
        return objArr;
    }
}
