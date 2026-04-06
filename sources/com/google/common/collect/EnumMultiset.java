package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {

    /* renamed from: B  reason: collision with root package name */
    public transient Class f28082B;
    public transient Enum[] C;
    public transient int[] D;
    public transient int E;
    public transient long F;

    public abstract class Itr<T> implements Iterator<T> {

        /* renamed from: A  reason: collision with root package name */
        public int f28085A = -1;

        /* renamed from: z  reason: collision with root package name */
        public int f28087z = 0;

        public Itr() {
        }

        public abstract Object b(int i2);

        public boolean hasNext() {
            while (this.f28087z < EnumMultiset.this.C.length) {
                int[] o2 = EnumMultiset.this.D;
                int i2 = this.f28087z;
                if (o2[i2] > 0) {
                    return true;
                }
                this.f28087z = i2 + 1;
            }
            return false;
        }

        public Object next() {
            if (hasNext()) {
                Object b2 = b(this.f28087z);
                int i2 = this.f28087z;
                this.f28085A = i2;
                this.f28087z = i2 + 1;
                return b2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            CollectPreconditions.e(this.f28085A >= 0);
            if (EnumMultiset.this.D[this.f28085A] > 0) {
                EnumMultiset.p(EnumMultiset.this);
                EnumMultiset enumMultiset = EnumMultiset.this;
                EnumMultiset.q(enumMultiset, (long) enumMultiset.D[this.f28085A]);
                EnumMultiset.this.D[this.f28085A] = 0;
            }
            this.f28085A = -1;
        }
    }

    public static /* synthetic */ int p(EnumMultiset enumMultiset) {
        int i2 = enumMultiset.E;
        enumMultiset.E = i2 - 1;
        return i2;
    }

    public static /* synthetic */ long q(EnumMultiset enumMultiset, long j2) {
        long j3 = enumMultiset.F - j2;
        enumMultiset.F = j3;
        return j3;
    }

    public int L0(Object obj) {
        if (obj == null || !v(obj)) {
            return 0;
        }
        return this.D[((Enum) obj).ordinal()];
    }

    public int N(Object obj, int i2) {
        if (obj == null || !v(obj)) {
            return 0;
        }
        Enum enumR = (Enum) obj;
        CollectPreconditions.b(i2, "occurrences");
        if (i2 == 0) {
            return L0(obj);
        }
        int ordinal = enumR.ordinal();
        int[] iArr = this.D;
        int i3 = iArr[ordinal];
        if (i3 == 0) {
            return 0;
        }
        if (i3 <= i2) {
            iArr[ordinal] = 0;
            this.E--;
            this.F -= (long) i3;
        } else {
            iArr[ordinal] = i3 - i2;
            this.F -= (long) i2;
        }
        return i3;
    }

    public void clear() {
        Arrays.fill(this.D, 0);
        this.F = 0;
        this.E = 0;
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public int h() {
        return this.E;
    }

    public Iterator i() {
        return new EnumMultiset<E>.Itr<E>() {
            /* renamed from: c */
            public Enum b(int i2) {
                return EnumMultiset.this.C[i2];
            }
        };
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Iterator iterator() {
        return Multisets.i(this);
    }

    public /* bridge */ /* synthetic */ Set k() {
        return super.k();
    }

    public Iterator m() {
        return new EnumMultiset<E>.Itr<Multiset.Entry<E>>() {
            /* renamed from: c */
            public Multiset.Entry b(final int i2) {
                return new Multisets.AbstractEntry<E>() {
                    /* renamed from: b */
                    public Enum a() {
                        return EnumMultiset.this.C[i2];
                    }

                    public int getCount() {
                        return EnumMultiset.this.D[i2];
                    }
                };
            }
        };
    }

    /* renamed from: s */
    public int T(Enum enumR, int i2) {
        u(enumR);
        CollectPreconditions.b(i2, "occurrences");
        if (i2 == 0) {
            return L0(enumR);
        }
        int ordinal = enumR.ordinal();
        int i3 = this.D[ordinal];
        long j2 = (long) i2;
        long j3 = ((long) i3) + j2;
        Preconditions.i(j3 <= 2147483647L, "too many occurrences: %s", j3);
        this.D[ordinal] = (int) j3;
        if (i3 == 0) {
            this.E++;
        }
        this.F += j2;
        return i3;
    }

    public int size() {
        return Ints.k(this.F);
    }

    public /* bridge */ /* synthetic */ boolean t0(Object obj, int i2, int i3) {
        return super.t0(obj, i2, i3);
    }

    public final void u(Object obj) {
        Preconditions.q(obj);
        if (!v(obj)) {
            String valueOf = String.valueOf(this.f28082B);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 21 + valueOf2.length());
            sb.append("Expected an ");
            sb.append(valueOf);
            sb.append(" but got ");
            sb.append(valueOf2);
            throw new ClassCastException(sb.toString());
        }
    }

    public final boolean v(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum enumR = (Enum) obj;
        int ordinal = enumR.ordinal();
        Enum[] enumArr = this.C;
        return ordinal < enumArr.length && enumArr[ordinal] == enumR;
    }

    /* renamed from: w */
    public int n0(Enum enumR, int i2) {
        u(enumR);
        CollectPreconditions.b(i2, "count");
        int ordinal = enumR.ordinal();
        int[] iArr = this.D;
        int i3 = iArr[ordinal];
        iArr[ordinal] = i2;
        this.F += (long) (i2 - i3);
        if (i3 == 0 && i2 > 0) {
            this.E++;
        } else if (i3 > 0 && i2 == 0) {
            this.E--;
        }
        return i3;
    }
}
