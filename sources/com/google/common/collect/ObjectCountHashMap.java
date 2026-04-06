package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
class ObjectCountHashMap<K> {

    /* renamed from: a  reason: collision with root package name */
    public transient Object[] f28478a;

    /* renamed from: b  reason: collision with root package name */
    public transient int[] f28479b;

    /* renamed from: c  reason: collision with root package name */
    public transient int f28480c;

    /* renamed from: d  reason: collision with root package name */
    public transient int f28481d;

    /* renamed from: e  reason: collision with root package name */
    public transient int[] f28482e;

    /* renamed from: f  reason: collision with root package name */
    public transient long[] f28483f;

    /* renamed from: g  reason: collision with root package name */
    public transient float f28484g;

    /* renamed from: h  reason: collision with root package name */
    public transient int f28485h;

    public class MapEntry extends Multisets.AbstractEntry<K> {

        /* renamed from: A  reason: collision with root package name */
        public int f28486A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f28488z;

        public MapEntry(int i2) {
            this.f28488z = ObjectCountHashMap.this.f28478a[i2];
            this.f28486A = i2;
        }

        public Object a() {
            return this.f28488z;
        }

        public void b() {
            int i2 = this.f28486A;
            if (i2 == -1 || i2 >= ObjectCountHashMap.this.C() || !Objects.a(this.f28488z, ObjectCountHashMap.this.f28478a[this.f28486A])) {
                this.f28486A = ObjectCountHashMap.this.m(this.f28488z);
            }
        }

        public int getCount() {
            b();
            int i2 = this.f28486A;
            if (i2 == -1) {
                return 0;
            }
            return ObjectCountHashMap.this.f28479b[i2];
        }
    }

    public ObjectCountHashMap() {
        n(3, 1.0f);
    }

    public static long D(long j2, int i2) {
        return (j2 & -4294967296L) | (4294967295L & ((long) i2));
    }

    public static ObjectCountHashMap b() {
        return new ObjectCountHashMap();
    }

    public static ObjectCountHashMap c(int i2) {
        return new ObjectCountHashMap(i2);
    }

    public static int h(long j2) {
        return (int) (j2 >>> 32);
    }

    public static int j(long j2) {
        return (int) j2;
    }

    public static long[] q(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    public static int[] r(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final void A(int i2) {
        if (this.f28482e.length >= 1073741824) {
            this.f28485h = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (((float) i2) * this.f28484g)) + 1;
        int[] r2 = r(i2);
        long[] jArr = this.f28483f;
        int length = r2.length - 1;
        for (int i4 = 0; i4 < this.f28480c; i4++) {
            int h2 = h(jArr[i4]);
            int i5 = h2 & length;
            int i6 = r2[i5];
            r2[i5] = i4;
            jArr[i4] = (((long) h2) << 32) | (((long) i6) & 4294967295L);
        }
        this.f28485h = i3;
        this.f28482e = r2;
    }

    public void B(int i2, int i3) {
        Preconditions.o(i2, this.f28480c);
        this.f28479b[i2] = i3;
    }

    public int C() {
        return this.f28480c;
    }

    public void a() {
        this.f28481d++;
        Arrays.fill(this.f28478a, 0, this.f28480c, (Object) null);
        Arrays.fill(this.f28479b, 0, this.f28480c, 0);
        Arrays.fill(this.f28482e, -1);
        Arrays.fill(this.f28483f, -1);
        this.f28480c = 0;
    }

    public void d(int i2) {
        if (i2 > this.f28483f.length) {
            y(i2);
        }
        if (i2 >= this.f28485h) {
            A(Math.max(2, Integer.highestOneBit(i2 - 1) << 1));
        }
    }

    public int e() {
        return this.f28480c == 0 ? -1 : 0;
    }

    public int f(Object obj) {
        int m2 = m(obj);
        if (m2 == -1) {
            return 0;
        }
        return this.f28479b[m2];
    }

    public Multiset.Entry g(int i2) {
        Preconditions.o(i2, this.f28480c);
        return new MapEntry(i2);
    }

    public Object i(int i2) {
        Preconditions.o(i2, this.f28480c);
        return this.f28478a[i2];
    }

    public int k(int i2) {
        Preconditions.o(i2, this.f28480c);
        return this.f28479b[i2];
    }

    public final int l() {
        return this.f28482e.length - 1;
    }

    public int m(Object obj) {
        int d2 = Hashing.d(obj);
        int i2 = this.f28482e[l() & d2];
        while (i2 != -1) {
            long j2 = this.f28483f[i2];
            if (h(j2) == d2 && Objects.a(obj, this.f28478a[i2])) {
                return i2;
            }
            i2 = j(j2);
        }
        return -1;
    }

    public void n(int i2, float f2) {
        boolean z2 = false;
        Preconditions.e(i2 >= 0, "Initial capacity must be non-negative");
        if (f2 > 0.0f) {
            z2 = true;
        }
        Preconditions.e(z2, "Illegal load factor");
        int a2 = Hashing.a(i2, (double) f2);
        this.f28482e = r(a2);
        this.f28484g = f2;
        this.f28478a = new Object[i2];
        this.f28479b = new int[i2];
        this.f28483f = q(i2);
        this.f28485h = Math.max(1, (int) (((float) a2) * f2));
    }

    public void o(int i2, Object obj, int i3, int i4) {
        this.f28483f[i2] = (((long) i4) << 32) | 4294967295L;
        this.f28478a[i2] = obj;
        this.f28479b[i2] = i3;
    }

    public void p(int i2) {
        int C = C() - 1;
        if (i2 < C) {
            Object[] objArr = this.f28478a;
            objArr[i2] = objArr[C];
            int[] iArr = this.f28479b;
            iArr[i2] = iArr[C];
            objArr[C] = null;
            iArr[C] = 0;
            long[] jArr = this.f28483f;
            long j2 = jArr[C];
            jArr[i2] = j2;
            jArr[C] = -1;
            int h2 = h(j2) & l();
            int[] iArr2 = this.f28482e;
            int i3 = iArr2[h2];
            if (i3 == C) {
                iArr2[h2] = i2;
                return;
            }
            while (true) {
                long j3 = this.f28483f[i3];
                int j4 = j(j3);
                if (j4 == C) {
                    this.f28483f[i3] = D(j3, i2);
                    return;
                }
                i3 = j4;
            }
        } else {
            this.f28478a[i2] = null;
            this.f28479b[i2] = 0;
            this.f28483f[i2] = -1;
        }
    }

    public int s(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f28480c) {
            return i3;
        }
        return -1;
    }

    public int t(int i2, int i3) {
        return i2 - 1;
    }

    public int u(Object obj, int i2) {
        CollectPreconditions.d(i2, "count");
        long[] jArr = this.f28483f;
        Object[] objArr = this.f28478a;
        int[] iArr = this.f28479b;
        int d2 = Hashing.d(obj);
        int l2 = l() & d2;
        int i3 = this.f28480c;
        int[] iArr2 = this.f28482e;
        int i4 = iArr2[l2];
        if (i4 == -1) {
            iArr2[l2] = i3;
        } else {
            while (true) {
                long j2 = jArr[i4];
                if (h(j2) != d2 || !Objects.a(obj, objArr[i4])) {
                    int j3 = j(j2);
                    if (j3 == -1) {
                        jArr[i4] = D(j2, i3);
                        break;
                    }
                    i4 = j3;
                } else {
                    int i5 = iArr[i4];
                    iArr[i4] = i2;
                    return i5;
                }
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            int i6 = i3 + 1;
            z(i6);
            o(i3, obj, i2, d2);
            this.f28480c = i6;
            if (i3 >= this.f28485h) {
                A(this.f28482e.length * 2);
            }
            this.f28481d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public int v(Object obj) {
        return w(obj, Hashing.d(obj));
    }

    public final int w(Object obj, int i2) {
        int l2 = l() & i2;
        int i3 = this.f28482e[l2];
        if (i3 == -1) {
            return 0;
        }
        int i4 = -1;
        while (true) {
            if (h(this.f28483f[i3]) != i2 || !Objects.a(obj, this.f28478a[i3])) {
                int j2 = j(this.f28483f[i3]);
                if (j2 == -1) {
                    return 0;
                }
                int i5 = j2;
                i4 = i3;
                i3 = i5;
            } else {
                int i6 = this.f28479b[i3];
                if (i4 == -1) {
                    this.f28482e[l2] = j(this.f28483f[i3]);
                } else {
                    long[] jArr = this.f28483f;
                    jArr[i4] = D(jArr[i4], j(jArr[i3]));
                }
                p(i3);
                this.f28480c--;
                this.f28481d++;
                return i6;
            }
        }
    }

    public int x(int i2) {
        return w(this.f28478a[i2], h(this.f28483f[i2]));
    }

    public void y(int i2) {
        this.f28478a = Arrays.copyOf(this.f28478a, i2);
        this.f28479b = Arrays.copyOf(this.f28479b, i2);
        long[] jArr = this.f28483f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1);
        }
        this.f28483f = copyOf;
    }

    public final void z(int i2) {
        int length = this.f28483f.length;
        if (i2 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                y(max);
            }
        }
    }

    public ObjectCountHashMap(ObjectCountHashMap objectCountHashMap) {
        n(objectCountHashMap.C(), 1.0f);
        int e2 = objectCountHashMap.e();
        while (e2 != -1) {
            u(objectCountHashMap.i(e2), objectCountHashMap.k(e2));
            e2 = objectCountHashMap.s(e2);
        }
    }

    public ObjectCountHashMap(int i2) {
        this(i2, 1.0f);
    }

    public ObjectCountHashMap(int i2, float f2) {
        n(i2, f2);
    }
}
