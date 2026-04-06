package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* renamed from: A  reason: collision with root package name */
    public transient ImmutableList f28201A;

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {

        /* renamed from: d  reason: collision with root package name */
        public Object[] f28202d;

        /* renamed from: e  reason: collision with root package name */
        public int f28203e;

        public Builder() {
            super(4);
        }

        /* renamed from: i */
        public Builder e(Object obj) {
            Preconditions.q(obj);
            if (this.f28202d == null || ImmutableSet.u(this.f28138b) > this.f28202d.length) {
                this.f28202d = null;
                super.a(obj);
                return this;
            }
            k(obj);
            return this;
        }

        public Builder j(Iterator it) {
            Preconditions.q(it);
            while (it.hasNext()) {
                e(it.next());
            }
            return this;
        }

        public final void k(Object obj) {
            Objects.requireNonNull(this.f28202d);
            int length = this.f28202d.length - 1;
            int hashCode = obj.hashCode();
            int c2 = Hashing.c(hashCode);
            while (true) {
                int i2 = c2 & length;
                Object[] objArr = this.f28202d;
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    objArr[i2] = obj;
                    this.f28203e += hashCode;
                    super.a(obj);
                    return;
                } else if (!obj2.equals(obj)) {
                    c2 = i2 + 1;
                } else {
                    return;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.common.collect.ImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.common.collect.RegularImmutableSet} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.common.collect.ImmutableSet l() {
            /*
                r8 = this;
                int r0 = r8.f28138b
                if (r0 == 0) goto L_0x005d
                r1 = 1
                if (r0 == r1) goto L_0x0050
                java.lang.Object[] r2 = r8.f28202d
                if (r2 == 0) goto L_0x003c
                int r0 = com.google.common.collect.ImmutableSet.u(r0)
                java.lang.Object[] r2 = r8.f28202d
                int r2 = r2.length
                if (r0 != r2) goto L_0x003c
                int r0 = r8.f28138b
                java.lang.Object[] r2 = r8.f28137a
                int r2 = r2.length
                boolean r0 = com.google.common.collect.ImmutableSet.J(r0, r2)
                if (r0 == 0) goto L_0x0029
                java.lang.Object[] r0 = r8.f28137a
                int r2 = r8.f28138b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            L_0x0027:
                r3 = r0
                goto L_0x002c
            L_0x0029:
                java.lang.Object[] r0 = r8.f28137a
                goto L_0x0027
            L_0x002c:
                com.google.common.collect.RegularImmutableSet r0 = new com.google.common.collect.RegularImmutableSet
                int r4 = r8.f28203e
                java.lang.Object[] r5 = r8.f28202d
                int r2 = r5.length
                int r6 = r2 + -1
                int r7 = r8.f28138b
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x004a
            L_0x003c:
                int r0 = r8.f28138b
                java.lang.Object[] r2 = r8.f28137a
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.v(r0, r2)
                int r2 = r0.size()
                r8.f28138b = r2
            L_0x004a:
                r8.f28139c = r1
                r1 = 0
                r8.f28202d = r1
                return r0
            L_0x0050:
                java.lang.Object[] r0 = r8.f28137a
                r1 = 0
                r0 = r0[r1]
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.E(r0)
                return r0
            L_0x005d:
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.D()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSet.Builder.l():com.google.common.collect.ImmutableSet");
        }
    }

    public static class SerializedForm implements Serializable {
    }

    public static ImmutableSet A(Iterator it) {
        if (!it.hasNext()) {
            return D();
        }
        Object next = it.next();
        return !it.hasNext() ? E(next) : new Builder().e(next).j(it).l();
    }

    public static ImmutableSet D() {
        return RegularImmutableSet.H;
    }

    public static ImmutableSet E(Object obj) {
        return new SingletonImmutableSet(obj);
    }

    public static ImmutableSet F(Object obj, Object obj2, Object obj3) {
        return v(3, obj, obj2, obj3);
    }

    public static ImmutableSet H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Preconditions.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return v(length, objArr2);
    }

    public static boolean J(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    public static Builder s() {
        return new Builder();
    }

    public static int u(int i2) {
        int max = Math.max(i2, 2);
        boolean z2 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z2 = false;
        }
        Preconditions.e(z2, "collection too large");
        return 1073741824;
    }

    public static ImmutableSet v(int i2, Object... objArr) {
        if (i2 == 0) {
            return D();
        }
        if (i2 != 1) {
            int u2 = u(i2);
            Object[] objArr2 = new Object[u2];
            int i3 = u2 - 1;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                Object a2 = ObjectArrays.a(objArr[i6], i6);
                int hashCode = a2.hashCode();
                int c2 = Hashing.c(hashCode);
                while (true) {
                    int i7 = c2 & i3;
                    Object obj = objArr2[i7];
                    if (obj == null) {
                        objArr[i5] = a2;
                        objArr2[i7] = a2;
                        i4 += hashCode;
                        i5++;
                        break;
                    } else if (obj.equals(a2)) {
                        break;
                    } else {
                        c2++;
                    }
                }
            }
            Arrays.fill(objArr, i5, i2, (Object) null);
            if (i5 == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                return new SingletonImmutableSet(obj2);
            } else if (u(i5) < u2 / 2) {
                return v(i5, objArr);
            } else {
                if (J(i5, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i5);
                }
                return new RegularImmutableSet(objArr, i4, objArr2, i3, i5);
            }
        } else {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return E(obj3);
        }
    }

    public static ImmutableSet w(Iterable iterable) {
        return iterable instanceof Collection ? z((Collection) iterable) : A(iterable.iterator());
    }

    public static ImmutableSet z(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.n()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return v(array.length, array);
    }

    public ImmutableList B() {
        return ImmutableList.p(toArray());
    }

    public boolean C() {
        return false;
    }

    public ImmutableList e() {
        ImmutableList immutableList = this.f28201A;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList B2 = B();
        this.f28201A = B2;
        return B2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !C() || !((ImmutableSet) obj).C() || hashCode() == obj.hashCode()) {
            return Sets.b(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return Sets.f(this);
    }

    /* renamed from: o */
    public abstract UnmodifiableIterator iterator();
}
