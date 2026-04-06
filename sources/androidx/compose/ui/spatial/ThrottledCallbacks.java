package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ThrottledCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final MutableIntObjectMap f18184a = IntObjectMapKt.c();

    /* renamed from: b  reason: collision with root package name */
    public Entry f18185b;

    /* renamed from: c  reason: collision with root package name */
    public long f18186c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f18187d;

    /* renamed from: e  reason: collision with root package name */
    public long f18188e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f18189f;

    @Metadata
    public final class Entry implements DelegatableNode.RegistrationHandle {

        /* renamed from: a  reason: collision with root package name */
        public final int f18190a;

        /* renamed from: b  reason: collision with root package name */
        public final long f18191b;

        /* renamed from: c  reason: collision with root package name */
        public final long f18192c;

        /* renamed from: d  reason: collision with root package name */
        public final DelegatableNode f18193d;

        /* renamed from: e  reason: collision with root package name */
        public final Function1 f18194e;

        /* renamed from: f  reason: collision with root package name */
        public Entry f18195f;

        /* renamed from: g  reason: collision with root package name */
        public long f18196g;

        /* renamed from: h  reason: collision with root package name */
        public long f18197h;

        /* renamed from: i  reason: collision with root package name */
        public long f18198i;

        /* renamed from: j  reason: collision with root package name */
        public long f18199j = -1;

        public Entry(int i2, long j2, long j3, DelegatableNode delegatableNode, Function1 function1) {
            this.f18190a = i2;
            this.f18191b = j2;
            this.f18192c = j3;
            this.f18193d = delegatableNode;
            this.f18194e = function1;
            this.f18198i = -j2;
        }

        public void a() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            if (!throttledCallbacks.o(throttledCallbacks.j(), this.f18190a, this)) {
                boolean unused = ThrottledCallbacks.this.q(this);
            }
        }

        public final void b(long j2, long j3, long j4, long j5, float[] fArr) {
            RelativeLayoutBounds a2 = ThrottledCallbacksKt.a(this.f18193d, j2, j3, j4, j5, fArr);
            if (a2 != null) {
                this.f18194e.invoke(a2);
            }
        }

        public final long c() {
            return this.f18197h;
        }

        public final long d() {
            return this.f18192c;
        }

        public final long e() {
            return this.f18198i;
        }

        public final long f() {
            return this.f18199j;
        }

        public final Entry g() {
            return this.f18195f;
        }

        public final DelegatableNode h() {
            return this.f18193d;
        }

        public final long i() {
            return this.f18191b;
        }

        public final long j() {
            return this.f18196g;
        }

        public final void k(long j2) {
            this.f18197h = j2;
        }

        public final void l(long j2) {
            this.f18198i = j2;
        }

        public final void m(long j2) {
            this.f18199j = j2;
        }

        public final void n(Entry entry) {
            this.f18195f = entry;
        }

        public final void o(long j2) {
            this.f18196g = j2;
        }
    }

    public ThrottledCallbacks() {
        IntOffset.Companion companion = IntOffset.f19160b;
        this.f18187d = companion.b();
        this.f18188e = companion.b();
    }

    public final long c(Entry entry, long j2, long j3, float[] fArr, long j4, long j5) {
        Entry entry2 = entry;
        long j6 = j4;
        if (entry.d() > 0 && entry.f() > 0) {
            if (j6 - entry.f() > entry.d()) {
                entry.l(j6);
                entry.m(-1);
                entry.b(entry.j(), entry.c(), j2, j3, fArr);
            } else {
                return Math.min(j5, entry.f() + entry.d());
            }
        }
        return j5;
    }

    public final void d(Entry entry, long j2, long j3, float[] fArr, long j4) {
        Entry entry2 = entry;
        long j5 = j4;
        boolean z2 = j5 - entry.e() > entry.i();
        boolean z3 = entry.d() == 0;
        entry2.m(j5);
        if (z2 && z3) {
            entry2.l(j5);
            entry.b(entry.j(), entry.c(), j2, j3, fArr);
        }
        if (!z3) {
            long j6 = this.f18186c;
            long d2 = entry.d() + j5;
            if (j6 > 0 && d2 < j6) {
                this.f18186c = j6;
            }
        }
    }

    public final void e(long j2) {
        long j3 = this.f18187d;
        long j4 = this.f18188e;
        float[] fArr = this.f18189f;
        Entry entry = this.f18185b;
        if (entry != null) {
            for (Entry entry2 = entry; entry2 != null; entry2 = entry2.g()) {
                LayoutNode o2 = DelegatableNodeKt.o(entry2.h());
                long w0 = o2.w0();
                long e0 = o2.e0();
                entry2.o(w0);
                entry2.k((((long) (IntOffset.l(w0) + ((int) (e0 & 4294967295L)))) & 4294967295L) | (((long) (IntOffset.k(w0) + ((int) (e0 >> 32)))) << 32));
                d(entry2, j3, j4, fArr, j2);
            }
        }
    }

    public final void f(long j2) {
        long[] jArr;
        int i2;
        int i3;
        long j3 = this.f18187d;
        long j4 = this.f18188e;
        float[] fArr = this.f18189f;
        MutableIntObjectMap mutableIntObjectMap = this.f18184a;
        Object[] objArr = mutableIntObjectMap.f1794c;
        long[] jArr2 = mutableIntObjectMap.f1792a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr2[i4];
                if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    long j6 = j5;
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j6 & 255) < 128) {
                            Entry entry = (Entry) objArr[(i4 << 3) + i7];
                            while (entry != null) {
                                d(entry, j3, j4, fArr, j2);
                                entry = entry.g();
                                i5 = i5;
                                i7 = i7;
                                i6 = i6;
                                i4 = i4;
                                jArr2 = jArr2;
                                length = length;
                            }
                        }
                        int i8 = i5;
                        j6 >>= i8;
                        i7++;
                        i5 = i8;
                        i6 = i6;
                        i4 = i4;
                        jArr2 = jArr2;
                        length = length;
                    }
                    int i9 = i4;
                    jArr = jArr2;
                    int i10 = length;
                    if (i6 == i5) {
                        i2 = i9;
                        i3 = i10;
                    } else {
                        return;
                    }
                } else {
                    jArr = jArr2;
                    i2 = i4;
                    i3 = length;
                }
                if (i2 != i3) {
                    i4 = i2 + 1;
                    length = i3;
                    jArr2 = jArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(int i2, long j2, long j3, long j4) {
        for (Entry entry = (Entry) this.f18184a.b(i2); entry != null; entry = entry.g()) {
            h(entry, j2, j3, j4);
        }
    }

    public final void h(Entry entry, long j2, long j3, long j4) {
        Entry entry2 = entry;
        long j5 = j4;
        long e2 = entry.e();
        long i2 = entry.i();
        long d2 = entry.d();
        boolean z2 = false;
        boolean z3 = j5 - e2 >= i2;
        boolean z4 = d2 == 0;
        boolean z5 = i2 == 0;
        entry.o(j2);
        entry2.k(j3);
        if ((!z4 && !z5) || z4) {
            z2 = true;
        }
        if (z3 && z2) {
            entry2.m(-1);
            entry2.l(j5);
            entry.b(j2, j3, this.f18187d, this.f18188e, this.f18189f);
        } else if (!z4) {
            entry2.m(j5);
            long j6 = this.f18186c;
            long j7 = j5 + d2;
            if (j6 > 0 && j7 < j6) {
                this.f18186c = j6;
            }
        }
    }

    public final long i() {
        return this.f18186c;
    }

    public final MutableIntObjectMap j() {
        return this.f18184a;
    }

    public final long k() {
        return this.f18188e;
    }

    public final float[] l() {
        return this.f18189f;
    }

    public final long m() {
        return this.f18187d;
    }

    public final Entry n(MutableIntObjectMap mutableIntObjectMap, int i2, Entry entry) {
        Object b2 = mutableIntObjectMap.b(i2);
        if (b2 == null) {
            mutableIntObjectMap.r(i2, entry);
            b2 = entry;
        }
        Entry entry2 = (Entry) b2;
        if (entry2 != entry) {
            while (entry2.g() != null) {
                entry2 = entry2.g();
                Intrinsics.f(entry2);
            }
            entry2.n(entry);
        }
        return entry;
    }

    public final boolean o(MutableIntObjectMap mutableIntObjectMap, int i2, Entry entry) {
        Entry entry2 = (Entry) mutableIntObjectMap.o(i2);
        if (entry2 == null) {
            return false;
        }
        if (Intrinsics.d(entry2, entry)) {
            Entry g2 = entry.g();
            entry.n((Entry) null);
            if (g2 != null) {
                mutableIntObjectMap.n(i2, g2);
            }
        } else {
            mutableIntObjectMap.n(i2, entry2);
            while (true) {
                if (entry2 == null) {
                    break;
                }
                Entry g3 = entry2.g();
                if (g3 == null) {
                    return false;
                }
                if (g3 == entry) {
                    entry2.n(entry.g());
                    entry.n((Entry) null);
                    break;
                }
                entry2 = entry2.g();
            }
        }
        return true;
    }

    public final DelegatableNode.RegistrationHandle p(int i2, long j2, long j3, DelegatableNode delegatableNode, Function1 function1) {
        int i3 = i2;
        return n(this.f18184a, i2, new Entry(i2, j2, j3 == 0 ? j2 : j3, delegatableNode, function1));
    }

    public final boolean q(Entry entry) {
        Entry entry2 = this.f18185b;
        if (entry2 == entry) {
            this.f18185b = entry2.g();
            entry.n((Entry) null);
            return true;
        }
        Entry g2 = entry2 != null ? entry2.g() : null;
        while (true) {
            Entry entry3 = g2;
            Entry entry4 = entry2;
            entry2 = entry3;
            if (entry2 == null) {
                return false;
            }
            if (entry2 == entry) {
                if (entry4 != null) {
                    entry4.n(entry2.g());
                }
                entry.n((Entry) null);
                return true;
            }
            g2 = entry2.g();
        }
    }

    public final void r(long j2) {
        float[] fArr;
        long j3;
        long j4;
        Object[] objArr;
        long[] jArr;
        int i2;
        int i3;
        Object[] objArr2;
        float[] fArr2;
        int i4;
        long[] jArr2;
        int i5;
        long j5;
        int i6;
        int i7;
        int i8;
        if (this.f18186c <= j2) {
            long j6 = this.f18187d;
            long j7 = this.f18188e;
            float[] fArr3 = this.f18189f;
            MutableIntObjectMap mutableIntObjectMap = this.f18184a;
            Object[] objArr3 = mutableIntObjectMap.f1794c;
            long[] jArr3 = mutableIntObjectMap.f1792a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                j4 = Long.MAX_VALUE;
                int i9 = 0;
                while (true) {
                    long j8 = jArr3[i9];
                    if ((((~j8) << 7) & j8 & -9187201950435737472L) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        long j9 = j8;
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j9 & 255) < 128) {
                                long j10 = j4;
                                Entry entry = (Entry) objArr3[(i9 << 3) + i12];
                                while (entry != null) {
                                    j10 = c(entry, j6, j7, fArr3, j2, j10);
                                    entry = entry.g();
                                    i10 = i10;
                                    i11 = i11;
                                    i12 = i12;
                                    j6 = j6;
                                    i9 = i9;
                                    jArr3 = jArr3;
                                    length = length;
                                    fArr3 = fArr3;
                                    objArr3 = objArr3;
                                }
                                i6 = i12;
                                i5 = i9;
                                jArr2 = jArr3;
                                i4 = length;
                                fArr2 = fArr3;
                                objArr2 = objArr3;
                                j5 = j6;
                                i7 = i11;
                                i8 = i10;
                                j4 = j10;
                            } else {
                                i6 = i12;
                                i5 = i9;
                                jArr2 = jArr3;
                                i4 = length;
                                fArr2 = fArr3;
                                objArr2 = objArr3;
                                j5 = j6;
                                i7 = i11;
                                i8 = i10;
                            }
                            j9 >>= i8;
                            i12 = i6 + 1;
                            i10 = i8;
                            i11 = i7;
                            j6 = j5;
                            i9 = i5;
                            jArr3 = jArr2;
                            length = i4;
                            fArr3 = fArr2;
                            objArr3 = objArr2;
                        }
                        int i13 = i9;
                        jArr = jArr3;
                        int i14 = length;
                        fArr = fArr3;
                        objArr = objArr3;
                        j3 = j6;
                        if (i11 != i10) {
                            break;
                        }
                        i2 = i13;
                        i3 = i14;
                    } else {
                        jArr = jArr3;
                        fArr = fArr3;
                        objArr = objArr3;
                        j3 = j6;
                        i2 = i9;
                        i3 = length;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i9 = i2 + 1;
                    length = i3;
                    j6 = j3;
                    jArr3 = jArr;
                    fArr3 = fArr;
                    objArr3 = objArr;
                }
            } else {
                fArr = fArr3;
                j3 = j6;
                j4 = Long.MAX_VALUE;
            }
            Entry entry2 = this.f18185b;
            if (entry2 != null) {
                long j11 = j4;
                for (Entry entry3 = entry2; entry3 != null; entry3 = entry3.g()) {
                    j11 = c(entry3, j3, j7, fArr, j2, j11);
                }
                j4 = j11;
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = -1;
            }
            this.f18186c = j4;
        }
    }

    public final boolean s(long j2, long j3, float[] fArr) {
        boolean z2;
        if (!IntOffset.j(j3, this.f18187d)) {
            this.f18187d = j3;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!IntOffset.j(j2, this.f18188e)) {
            this.f18188e = j2;
            z2 = true;
        }
        if (fArr == null) {
            return z2;
        }
        this.f18189f = fArr;
        return true;
    }
}
