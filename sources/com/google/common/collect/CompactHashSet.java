package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public transient int[] f28045A;

    /* renamed from: B  reason: collision with root package name */
    public transient Object[] f28046B;
    public transient int C;
    public transient int D;

    /* renamed from: z  reason: collision with root package name */
    public transient Object f28047z;

    public CompactHashSet() {
        B(3);
    }

    public static CompactHashSet n() {
        return new CompactHashSet();
    }

    public static CompactHashSet p(int i2) {
        return new CompactHashSet(i2);
    }

    public void A() {
        this.C += 32;
    }

    public void B(int i2) {
        Preconditions.e(i2 >= 0, "Expected size must be >= 0");
        this.C = Ints.e(i2, 1, 1073741823);
    }

    public void C(int i2, Object obj, int i3, int i4) {
        Q(i2, CompactHashing.d(i3, 0, i4));
        P(i2, obj);
    }

    public void D(int i2, int i3) {
        Object J = J();
        int[] H = H();
        Object[] F = F();
        int size = size();
        int i4 = size - 1;
        if (i2 < i4) {
            Object obj = F[i4];
            F[i2] = obj;
            F[i4] = null;
            H[i2] = H[i4];
            H[i4] = 0;
            int d2 = Hashing.d(obj) & i3;
            int h2 = CompactHashing.h(J, d2);
            if (h2 == size) {
                CompactHashing.i(J, d2, i2 + 1);
                return;
            }
            while (true) {
                int i5 = h2 - 1;
                int i6 = H[i5];
                int c2 = CompactHashing.c(i6, i3);
                if (c2 == size) {
                    H[i5] = CompactHashing.d(i6, i2 + 1, i3);
                    return;
                }
                h2 = c2;
            }
        } else {
            F[i2] = null;
            H[i2] = 0;
        }
    }

    public boolean E() {
        return this.f28047z == null;
    }

    public final Object[] F() {
        Object[] objArr = this.f28046B;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] H() {
        int[] iArr = this.f28045A;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object J() {
        Object obj = this.f28047z;
        Objects.requireNonNull(obj);
        return obj;
    }

    public void K(int i2) {
        this.f28045A = Arrays.copyOf(H(), i2);
        this.f28046B = Arrays.copyOf(F(), i2);
    }

    public final void L(int i2) {
        int min;
        int length = H().length;
        if (i2 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            K(min);
        }
    }

    public final int M(int i2, int i3, int i4, int i5) {
        Object a2 = CompactHashing.a(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            CompactHashing.i(a2, i4 & i6, i5 + 1);
        }
        Object J = J();
        int[] H = H();
        for (int i7 = 0; i7 <= i2; i7++) {
            int h2 = CompactHashing.h(J, i7);
            while (h2 != 0) {
                int i8 = h2 - 1;
                int i9 = H[i8];
                int b2 = CompactHashing.b(i9, i2) | i7;
                int i10 = b2 & i6;
                int h3 = CompactHashing.h(a2, i10);
                CompactHashing.i(a2, i10, h2);
                H[i8] = CompactHashing.d(b2, h3, i6);
                h2 = CompactHashing.c(i9, i2);
            }
        }
        this.f28047z = a2;
        R(i6);
        return i6;
    }

    public final void P(int i2, Object obj) {
        F()[i2] = obj;
    }

    public final void Q(int i2, int i3) {
        H()[i2] = i3;
    }

    public final void R(int i2) {
        this.C = CompactHashing.d(this.C, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    public boolean add(Object obj) {
        if (E()) {
            i();
        }
        Set q2 = q();
        if (q2 != null) {
            return q2.add(obj);
        }
        int[] H = H();
        Object[] F = F();
        int i2 = this.D;
        int i3 = i2 + 1;
        int d2 = Hashing.d(obj);
        int z2 = z();
        int i4 = d2 & z2;
        int h2 = CompactHashing.h(J(), i4);
        if (h2 != 0) {
            int b2 = CompactHashing.b(d2, z2);
            int i5 = 0;
            while (true) {
                int i6 = h2 - 1;
                int i7 = H[i6];
                if (CompactHashing.b(i7, z2) == b2 && com.google.common.base.Objects.a(obj, F[i6])) {
                    return false;
                }
                int c2 = CompactHashing.c(i7, z2);
                i5++;
                if (c2 != 0) {
                    h2 = c2;
                } else if (i5 >= 9) {
                    return m().add(obj);
                } else {
                    if (i3 > z2) {
                        z2 = M(z2, CompactHashing.e(z2), d2, i2);
                    } else {
                        H[i6] = CompactHashing.d(i7, i3, z2);
                    }
                }
            }
        } else if (i3 > z2) {
            z2 = M(z2, CompactHashing.e(z2), d2, i2);
        } else {
            CompactHashing.i(J(), i4, i3);
        }
        L(i3);
        C(i2, obj, d2, z2);
        this.D = i3;
        A();
        return true;
    }

    public void clear() {
        if (!E()) {
            A();
            Set q2 = q();
            if (q2 != null) {
                this.C = Ints.e(size(), 3, 1073741823);
                q2.clear();
                this.f28047z = null;
                this.D = 0;
                return;
            }
            Arrays.fill(F(), 0, this.D, (Object) null);
            CompactHashing.g(J());
            Arrays.fill(H(), 0, this.D, 0);
            this.D = 0;
        }
    }

    public boolean contains(Object obj) {
        if (E()) {
            return false;
        }
        Set q2 = q();
        if (q2 != null) {
            return q2.contains(obj);
        }
        int d2 = Hashing.d(obj);
        int z2 = z();
        int h2 = CompactHashing.h(J(), d2 & z2);
        if (h2 == 0) {
            return false;
        }
        int b2 = CompactHashing.b(d2, z2);
        do {
            int i2 = h2 - 1;
            int u2 = u(i2);
            if (CompactHashing.b(u2, z2) == b2 && com.google.common.base.Objects.a(obj, s(i2))) {
                return true;
            }
            h2 = CompactHashing.c(u2, z2);
        } while (h2 != 0);
        return false;
    }

    public int h(int i2, int i3) {
        return i2 - 1;
    }

    public int i() {
        Preconditions.x(E(), "Arrays already allocated");
        int i2 = this.C;
        int j2 = CompactHashing.j(i2);
        this.f28047z = CompactHashing.a(j2);
        R(j2 - 1);
        this.f28045A = new int[i2];
        this.f28046B = new Object[i2];
        return i2;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator iterator() {
        Set q2 = q();
        return q2 != null ? q2.iterator() : new Iterator<E>() {

            /* renamed from: A  reason: collision with root package name */
            public int f28048A;

            /* renamed from: B  reason: collision with root package name */
            public int f28049B = -1;

            /* renamed from: z  reason: collision with root package name */
            public int f28050z;

            {
                this.f28050z = CompactHashSet.this.C;
                this.f28048A = CompactHashSet.this.v();
            }

            public final void b() {
                if (CompactHashSet.this.C != this.f28050z) {
                    throw new ConcurrentModificationException();
                }
            }

            public void c() {
                this.f28050z += 32;
            }

            public boolean hasNext() {
                return this.f28048A >= 0;
            }

            public Object next() {
                b();
                if (hasNext()) {
                    int i2 = this.f28048A;
                    this.f28049B = i2;
                    Object g2 = CompactHashSet.this.s(i2);
                    this.f28048A = CompactHashSet.this.w(this.f28048A);
                    return g2;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                b();
                CollectPreconditions.e(this.f28049B >= 0);
                c();
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.s(this.f28049B));
                this.f28048A = CompactHashSet.this.h(this.f28048A, this.f28049B);
                this.f28049B = -1;
            }
        };
    }

    public Set m() {
        Set o2 = o(z() + 1);
        int v2 = v();
        while (v2 >= 0) {
            o2.add(s(v2));
            v2 = w(v2);
        }
        this.f28047z = o2;
        this.f28045A = null;
        this.f28046B = null;
        A();
        return o2;
    }

    public final Set o(int i2) {
        return new LinkedHashSet(i2, 1.0f);
    }

    public Set q() {
        Object obj = this.f28047z;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public boolean remove(Object obj) {
        if (E()) {
            return false;
        }
        Set q2 = q();
        if (q2 != null) {
            return q2.remove(obj);
        }
        int z2 = z();
        int f2 = CompactHashing.f(obj, (Object) null, z2, J(), H(), F(), (Object[]) null);
        if (f2 == -1) {
            return false;
        }
        D(f2, z2);
        this.D--;
        A();
        return true;
    }

    public final Object s(int i2) {
        return F()[i2];
    }

    public int size() {
        Set q2 = q();
        return q2 != null ? q2.size() : this.D;
    }

    public Object[] toArray() {
        if (E()) {
            return new Object[0];
        }
        Set q2 = q();
        return q2 != null ? q2.toArray() : Arrays.copyOf(F(), this.D);
    }

    public final int u(int i2) {
        return H()[i2];
    }

    public int v() {
        return isEmpty() ? -1 : 0;
    }

    public int w(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.D) {
            return i3;
        }
        return -1;
    }

    public final int z() {
        return (1 << (this.C & 31)) - 1;
    }

    public CompactHashSet(int i2) {
        B(i2);
    }

    public Object[] toArray(Object[] objArr) {
        if (E()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set q2 = q();
        if (q2 != null) {
            return q2.toArray(objArr);
        }
        return ObjectArrays.j(F(), 0, this.D, objArr);
    }
}
