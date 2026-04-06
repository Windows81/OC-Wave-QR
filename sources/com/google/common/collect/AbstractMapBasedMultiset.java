package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {

    /* renamed from: B  reason: collision with root package name */
    public transient ObjectCountHashMap f27979B;
    public transient long C;

    public abstract class Itr<T> implements Iterator<T> {

        /* renamed from: A  reason: collision with root package name */
        public int f27980A = -1;

        /* renamed from: B  reason: collision with root package name */
        public int f27981B;

        /* renamed from: z  reason: collision with root package name */
        public int f27982z;

        public Itr() {
            this.f27982z = AbstractMapBasedMultiset.this.f27979B.e();
            this.f27981B = AbstractMapBasedMultiset.this.f27979B.f28481d;
        }

        public final void b() {
            if (AbstractMapBasedMultiset.this.f27979B.f28481d != this.f27981B) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object c(int i2);

        public boolean hasNext() {
            b();
            return this.f27982z >= 0;
        }

        public Object next() {
            if (hasNext()) {
                Object c2 = c(this.f27982z);
                int i2 = this.f27982z;
                this.f27980A = i2;
                this.f27982z = AbstractMapBasedMultiset.this.f27979B.s(i2);
                return c2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            b();
            CollectPreconditions.e(this.f27980A != -1);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.C -= (long) abstractMapBasedMultiset.f27979B.x(this.f27980A);
            this.f27982z = AbstractMapBasedMultiset.this.f27979B.t(this.f27982z, this.f27980A);
            this.f27980A = -1;
            this.f27981B = AbstractMapBasedMultiset.this.f27979B.f28481d;
        }
    }

    public AbstractMapBasedMultiset(int i2) {
        this.f27979B = o(i2);
    }

    public final int L0(Object obj) {
        return this.f27979B.f(obj);
    }

    public final int N(Object obj, int i2) {
        if (i2 == 0) {
            return L0(obj);
        }
        Preconditions.g(i2 > 0, "occurrences cannot be negative: %s", i2);
        int m2 = this.f27979B.m(obj);
        if (m2 == -1) {
            return 0;
        }
        int k2 = this.f27979B.k(m2);
        if (k2 > i2) {
            this.f27979B.B(m2, k2 - i2);
        } else {
            this.f27979B.x(m2);
            i2 = k2;
        }
        this.C -= (long) i2;
        return k2;
    }

    public final int T(Object obj, int i2) {
        if (i2 == 0) {
            return L0(obj);
        }
        boolean z2 = true;
        Preconditions.g(i2 > 0, "occurrences cannot be negative: %s", i2);
        int m2 = this.f27979B.m(obj);
        if (m2 == -1) {
            this.f27979B.u(obj, i2);
            this.C += (long) i2;
            return 0;
        }
        int k2 = this.f27979B.k(m2);
        long j2 = (long) i2;
        long j3 = ((long) k2) + j2;
        if (j3 > 2147483647L) {
            z2 = false;
        }
        Preconditions.i(z2, "too many occurrences: %s", j3);
        this.f27979B.B(m2, (int) j3);
        this.C += j2;
        return k2;
    }

    public final void clear() {
        this.f27979B.a();
        this.C = 0;
    }

    public final int h() {
        return this.f27979B.C();
    }

    public final Iterator i() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() {
            public Object c(int i2) {
                return AbstractMapBasedMultiset.this.f27979B.i(i2);
            }
        };
    }

    public final Iterator iterator() {
        return Multisets.i(this);
    }

    public final Iterator m() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() {
            /* renamed from: d */
            public Multiset.Entry c(int i2) {
                return AbstractMapBasedMultiset.this.f27979B.g(i2);
            }
        };
    }

    public void n(Multiset multiset) {
        Preconditions.q(multiset);
        int e2 = this.f27979B.e();
        while (e2 >= 0) {
            multiset.T(this.f27979B.i(e2), this.f27979B.k(e2));
            e2 = this.f27979B.s(e2);
        }
    }

    public final int n0(Object obj, int i2) {
        CollectPreconditions.b(i2, "count");
        ObjectCountHashMap objectCountHashMap = this.f27979B;
        int v2 = i2 == 0 ? objectCountHashMap.v(obj) : objectCountHashMap.u(obj, i2);
        this.C += (long) (i2 - v2);
        return v2;
    }

    public abstract ObjectCountHashMap o(int i2);

    public final int size() {
        return Ints.k(this.C);
    }

    public final boolean t0(Object obj, int i2, int i3) {
        CollectPreconditions.b(i2, "oldCount");
        CollectPreconditions.b(i3, "newCount");
        int m2 = this.f27979B.m(obj);
        if (m2 == -1) {
            if (i2 != 0) {
                return false;
            }
            if (i3 > 0) {
                this.f27979B.u(obj, i3);
                this.C += (long) i3;
            }
            return true;
        } else if (this.f27979B.k(m2) != i2) {
            return false;
        } else {
            if (i3 == 0) {
                this.f27979B.x(m2);
                this.C -= (long) i2;
            } else {
                this.f27979B.B(m2, i3);
                this.C += (long) (i3 - i2);
            }
            return true;
        }
    }
}
