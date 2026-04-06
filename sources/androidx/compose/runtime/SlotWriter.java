package androidx.compose.runtime;

import androidx.collection.IntSetKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.Composer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SlotWriter {

    /* renamed from: y  reason: collision with root package name */
    public static final Companion f14863y = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f14864z = 8;

    /* renamed from: a  reason: collision with root package name */
    public final SlotTable f14865a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f14866b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f14867c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f14868d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap f14869e;

    /* renamed from: f  reason: collision with root package name */
    public MutableIntObjectMap f14870f;

    /* renamed from: g  reason: collision with root package name */
    public int f14871g;

    /* renamed from: h  reason: collision with root package name */
    public int f14872h;

    /* renamed from: i  reason: collision with root package name */
    public int f14873i;

    /* renamed from: j  reason: collision with root package name */
    public int f14874j;

    /* renamed from: k  reason: collision with root package name */
    public int f14875k;

    /* renamed from: l  reason: collision with root package name */
    public int f14876l;

    /* renamed from: m  reason: collision with root package name */
    public int f14877m;

    /* renamed from: n  reason: collision with root package name */
    public int f14878n;

    /* renamed from: o  reason: collision with root package name */
    public int f14879o;

    /* renamed from: p  reason: collision with root package name */
    public final IntStack f14880p = new IntStack();

    /* renamed from: q  reason: collision with root package name */
    public final IntStack f14881q = new IntStack();

    /* renamed from: r  reason: collision with root package name */
    public final IntStack f14882r = new IntStack();

    /* renamed from: s  reason: collision with root package name */
    public MutableIntObjectMap f14883s;

    /* renamed from: t  reason: collision with root package name */
    public int f14884t;

    /* renamed from: u  reason: collision with root package name */
    public int f14885u;

    /* renamed from: v  reason: collision with root package name */
    public int f14886v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14887w;

    /* renamed from: x  reason: collision with root package name */
    public MutableIntList f14888x;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ List c(Companion companion, SlotWriter slotWriter, int i2, SlotWriter slotWriter2, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
            if ((i3 & 32) != 0) {
                z4 = true;
            }
            return companion.b(slotWriter, i2, slotWriter2, z2, z3, z4);
        }

        public final List b(SlotWriter slotWriter, int i2, SlotWriter slotWriter2, boolean z2, boolean z3, boolean z4) {
            int i3;
            ArrayList arrayList;
            SlotWriter slotWriter3 = slotWriter;
            int i4 = i2;
            SlotWriter slotWriter4 = slotWriter2;
            int k0 = slotWriter.k0(i2);
            int i5 = i4 + k0;
            int b2 = slotWriter.N(i2);
            int b3 = slotWriter3.N(i5);
            int i6 = b3 - b2;
            boolean a2 = slotWriter.K(i2);
            slotWriter4.p0(k0);
            slotWriter4.q0(i6, slotWriter2.b0());
            if (slotWriter.f14871g < i5) {
                slotWriter3.z0(i5);
            }
            if (slotWriter.f14875k < b3) {
                slotWriter3.B0(b3, i5);
            }
            int[] i7 = slotWriter2.f14866b;
            int b0 = slotWriter2.b0();
            int i8 = b0 * 5;
            ArraysKt.j(slotWriter.f14866b, i7, i8, i4 * 5, i5 * 5);
            Object[] k2 = slotWriter2.f14867c;
            int g2 = slotWriter2.f14873i;
            System.arraycopy(slotWriter.f14867c, b2, k2, g2, i6);
            int d0 = slotWriter2.d0();
            i7[i8 + 2] = d0;
            int i9 = b0 - i4;
            int i10 = b0 + k0;
            int c2 = g2 - slotWriter4.O(i7, b0);
            int m2 = slotWriter2.f14877m;
            boolean z5 = a2;
            int l2 = slotWriter2.f14876l;
            int length = k2.length;
            int i11 = g2;
            int i12 = m2;
            int i13 = i8;
            int i14 = b0;
            while (true) {
                i3 = 0;
                if (i14 >= i10) {
                    break;
                }
                if (i14 != b0) {
                    int i15 = (i14 * 5) + 2;
                    i7[i15] = i7[i15] + i9;
                }
                int i16 = b0;
                int c3 = slotWriter4.O(i7, i14) + c2;
                if (i12 >= i14) {
                    i3 = slotWriter2.f14875k;
                }
                int i17 = i10;
                i7[(i14 * 5) + 4] = slotWriter4.Q(c3, i3, l2, length);
                if (i14 == i12) {
                    i12++;
                }
                i14++;
                i10 = i17;
                b0 = i16;
            }
            int i18 = i10;
            slotWriter4.f14877m = i12;
            int e2 = SlotTableKt.q(slotWriter.f14868d, i4, slotWriter.e0());
            int e3 = SlotTableKt.q(slotWriter.f14868d, i5, slotWriter.e0());
            if (e2 < e3) {
                ArrayList f2 = slotWriter.f14868d;
                ArrayList arrayList2 = new ArrayList(e3 - e2);
                for (int i19 = e2; i19 < e3; i19++) {
                    Anchor anchor = (Anchor) f2.get(i19);
                    anchor.c(anchor.a() + i9);
                    arrayList2.add(anchor);
                }
                slotWriter2.f14868d.addAll(SlotTableKt.q(slotWriter2.f14868d, slotWriter2.b0(), slotWriter2.e0()), arrayList2);
                f2.subList(e2, e3).clear();
                arrayList = arrayList2;
            } else {
                arrayList = CollectionsKt.m();
            }
            Collection collection = arrayList;
            if (!collection.isEmpty()) {
                HashMap o2 = slotWriter.f14869e;
                HashMap o3 = slotWriter2.f14869e;
                if (!(o2 == null || o3 == null)) {
                    int size = collection.size();
                    for (int i20 = 0; i20 < size; i20++) {
                        Anchor anchor2 = (Anchor) arrayList.get(i20);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) o2.get(anchor2);
                        if (groupSourceInformation != null) {
                            o2.remove(anchor2);
                            o3.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int d02 = slotWriter2.d0();
            GroupSourceInformation g1 = slotWriter4.g1(d0);
            int i21 = 1;
            if (g1 != null) {
                int i22 = d02 + 1;
                int b02 = slotWriter2.b0();
                int i23 = -1;
                while (i22 < b02) {
                    i23 = i22;
                    i22 = SlotTableKt.o(slotWriter2.f14866b, i22) + i22;
                }
                g1.b(slotWriter4, i23, b02);
            }
            int H0 = slotWriter.H0(i2);
            if (z4) {
                if (z2) {
                    if (H0 >= 0) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        slotWriter.i1();
                        slotWriter3.A(H0 - slotWriter.b0());
                        slotWriter.i1();
                    }
                    slotWriter3.A(i4 - slotWriter.b0());
                    boolean O0 = slotWriter.O0();
                    if (i3 != 0) {
                        slotWriter.Z0();
                        slotWriter.R();
                        slotWriter.Z0();
                        slotWriter.R();
                    }
                    i3 = O0;
                } else {
                    i3 = slotWriter3.P0(i4, k0);
                    slotWriter3.Q0(b2, i6, i4 - 1);
                }
            }
            if (i3 != 0) {
                ComposerKt.v("Unexpectedly removed anchors");
            }
            int j2 = slotWriter2.f14879o;
            int i24 = i7[i13 + 1];
            if ((1073741824 & i24) == 0) {
                i21 = i24 & 67108863;
            }
            slotWriter4.f14879o = j2 + i21;
            if (z3) {
                slotWriter4.f14884t = i18;
                slotWriter4.f14873i = i11 + i6;
            }
            if (z5) {
                slotWriter4.r1(d0);
            }
            return arrayList;
        }

        public Companion() {
        }
    }

    public SlotWriter(SlotTable slotTable) {
        this.f14865a = slotTable;
        this.f14866b = slotTable.s();
        this.f14867c = slotTable.v();
        this.f14868d = slotTable.p();
        this.f14869e = slotTable.z();
        this.f14870f = slotTable.q();
        this.f14871g = slotTable.u();
        this.f14872h = (this.f14866b.length / 5) - slotTable.u();
        this.f14875k = slotTable.w();
        this.f14876l = this.f14867c.length - slotTable.w();
        this.f14877m = slotTable.u();
        this.f14885u = slotTable.u();
        this.f14886v = -1;
    }

    public static /* synthetic */ void v0(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotWriter.f14886v;
        }
        slotWriter.u0(i2);
    }

    public final void A(int i2) {
        boolean z2 = false;
        if (!(i2 >= 0)) {
            ComposerKt.v("Cannot seek backwards");
        }
        if (!(this.f14878n <= 0)) {
            PreconditionsKt.b("Cannot call seek() while inserting");
        }
        if (i2 != 0) {
            int i3 = this.f14884t + i2;
            if (i3 >= this.f14886v && i3 <= this.f14885u) {
                z2 = true;
            }
            if (!z2) {
                ComposerKt.v("Cannot seek outside the current group (" + this.f14886v + '-' + this.f14885u + ')');
            }
            this.f14884t = i3;
            int O = O(this.f14866b, h0(i3));
            this.f14873i = O;
            this.f14874j = O;
        }
    }

    /* JADX INFO: finally extract failed */
    public final List A0(int i2, SlotTable slotTable, int i3) {
        if (!(this.f14878n <= 0 && k0(this.f14884t + i2) == 1)) {
            ComposerKt.v("Check failed");
        }
        int i4 = this.f14884t;
        int i5 = this.f14873i;
        int i6 = this.f14874j;
        A(i2);
        i1();
        F();
        SlotWriter F = slotTable.F();
        try {
            List c2 = Companion.c(f14863y, F, i3, this, false, true, false, 32, (Object) null);
            F.J(true);
            S();
            R();
            this.f14884t = i4;
            this.f14873i = i5;
            this.f14874j = i6;
            return c2;
        } catch (Throwable th) {
            F.J(false);
            throw th;
        }
    }

    public final Anchor B(int i2) {
        ArrayList arrayList = this.f14868d;
        int g2 = SlotTableKt.s(arrayList, i2, e0());
        if (g2 >= 0) {
            return (Anchor) arrayList.get(g2);
        }
        if (i2 > this.f14871g) {
            i2 = -(e0() - i2);
        }
        Anchor anchor = new Anchor(i2);
        arrayList.add(-(g2 + 1), anchor);
        return anchor;
    }

    public final void B0(int i2, int i3) {
        int i4 = this.f14876l;
        int i5 = this.f14875k;
        int i6 = this.f14877m;
        if (i5 != i2) {
            Object[] objArr = this.f14867c;
            if (i2 < i5) {
                System.arraycopy(objArr, i2, objArr, i2 + i4, i5 - i2);
            } else {
                int i7 = i5 + i4;
                System.arraycopy(objArr, i7, objArr, i5, (i2 + i4) - i7);
            }
        }
        int min = Math.min(i3 + 1, e0());
        if (i6 != min) {
            int length = this.f14867c.length - i4;
            if (min < i6) {
                int h0 = h0(min);
                int h02 = h0(i6);
                int i8 = this.f14871g;
                while (h0 < h02) {
                    int i9 = (h0 * 5) + 4;
                    int i10 = this.f14866b[i9];
                    if (!(i10 >= 0)) {
                        ComposerKt.v("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f14866b[i9] = -((length - i10) + 1);
                    h0++;
                    if (h0 == i8) {
                        h0 += this.f14872h;
                    }
                }
            } else {
                int h03 = h0(i6);
                int h04 = h0(min);
                while (h03 < h04) {
                    int i11 = (h03 * 5) + 4;
                    int i12 = this.f14866b[i11];
                    if (!(i12 < 0)) {
                        ComposerKt.v("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f14866b[i11] = i12 + length + 1;
                    h03++;
                    if (h03 == this.f14871g) {
                        h03 += this.f14872h;
                    }
                }
            }
            this.f14877m = min;
        }
        this.f14875k = i2;
    }

    public final int C(Anchor anchor) {
        int a2 = anchor.a();
        return a2 < 0 ? a2 + e0() : a2;
    }

    public final List C0(Anchor anchor, int i2, SlotWriter slotWriter) {
        if (!(slotWriter.f14878n > 0)) {
            ComposerKt.v("Check failed");
        }
        if (!(this.f14878n == 0)) {
            ComposerKt.v("Check failed");
        }
        if (!anchor.b()) {
            ComposerKt.v("Check failed");
        }
        int C = C(anchor) + i2;
        int i3 = this.f14884t;
        if (!(i3 <= C && C < this.f14885u)) {
            ComposerKt.v("Check failed");
        }
        int H0 = H0(C);
        int k0 = k0(C);
        int F0 = t0(C) ? 1 : F0(C);
        List c2 = Companion.c(f14863y, this, C, slotWriter, false, false, false, 32, (Object) null);
        r1(H0);
        boolean z2 = F0 > 0;
        while (H0 >= i3) {
            int h0 = h0(H0);
            int[] iArr = this.f14866b;
            SlotTableKt.w(iArr, h0, SlotTableKt.o(iArr, h0) - k0);
            if (z2) {
                int[] iArr2 = this.f14866b;
                int i4 = iArr2[(h0 * 5) + 1];
                if ((1073741824 & i4) != 0) {
                    z2 = false;
                } else {
                    SlotTableKt.y(iArr2, h0, (i4 & 67108863) - F0);
                }
            }
            H0 = H0(H0);
        }
        if (z2) {
            if (!(this.f14879o >= F0)) {
                ComposerKt.v("Check failed");
            }
            this.f14879o -= F0;
        }
        return c2;
    }

    public final void D(Anchor anchor, Object obj) {
        if (!(this.f14878n == 0)) {
            ComposerKt.v("Can only append a slot if not current inserting");
        }
        int i2 = this.f14873i;
        int i3 = this.f14874j;
        int C = C(anchor);
        int O = O(this.f14866b, h0(C + 1));
        this.f14873i = O;
        this.f14874j = O;
        q0(1, C);
        if (i2 >= O) {
            i2++;
            i3++;
        }
        this.f14867c[O] = obj;
        this.f14873i = i2;
        this.f14874j = i3;
    }

    public final Object D0(int i2) {
        int h0 = h0(i2);
        int[] iArr = this.f14866b;
        if ((iArr[(h0 * 5) + 1] & 1073741824) != 0) {
            return this.f14867c[P(G0(iArr, h0))];
        }
        return null;
    }

    public final int E(int[] iArr, int i2) {
        return O(iArr, i2) + Integer.bitCount(iArr[(i2 * 5) + 1] >> 29);
    }

    public final Object E0(Anchor anchor) {
        return D0(anchor.e(this));
    }

    public final void F() {
        int i2 = this.f14878n;
        this.f14878n = i2 + 1;
        if (i2 == 0) {
            T0();
        }
    }

    public final int F0(int i2) {
        return this.f14866b[(h0(i2) * 5) + 1] & 67108863;
    }

    public final boolean G(int i2) {
        int i3 = i2 + 1;
        int k0 = i2 + k0(i2);
        while (i3 < k0) {
            if ((this.f14866b[(h0(i3) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            i3 += k0(i3);
        }
        return false;
    }

    public final int G0(int[] iArr, int i2) {
        return O(iArr, i2);
    }

    public final Object H(int i2) {
        int P = P(i2);
        Object[] objArr = this.f14867c;
        Object obj = objArr[P];
        objArr[P] = Composer.f14567a.a();
        return obj;
    }

    public final int H0(int i2) {
        return I0(this.f14866b, i2);
    }

    public final void I() {
        int i2 = this.f14875k;
        ArraysKt.w(this.f14867c, (Object) null, i2, this.f14876l + i2);
    }

    public final int I0(int[] iArr, int i2) {
        return J0(iArr[(h0(i2) * 5) + 2]);
    }

    public final void J(boolean z2) {
        this.f14887w = true;
        if (z2 && this.f14880p.f14682b == 0) {
            z0(e0());
            B0(this.f14867c.length - this.f14876l, this.f14871g);
            I();
            M0();
        }
        this.f14865a.i(this, this.f14866b, this.f14871g, this.f14867c, this.f14875k, this.f14868d, this.f14869e, this.f14870f);
    }

    public final int J0(int i2) {
        return i2 > -2 ? i2 : e0() + i2 + 2;
    }

    public final boolean K(int i2) {
        return i2 >= 0 && (this.f14866b[(h0(i2) * 5) + 1] & 201326592) != 0;
    }

    public final int K0(int i2, int i3) {
        return i2 < i3 ? i2 : -((e0() - i2) + 2);
    }

    public final boolean L(int i2) {
        return i2 >= 0 && (this.f14866b[(h0(i2) * 5) + 1] & 67108864) != 0;
    }

    public final Object L0(Object obj) {
        Object X0 = X0();
        W0(obj);
        return X0;
    }

    public final int M(int i2, int i3, int i4) {
        return i2 < 0 ? (i4 - i3) + i2 + 1 : i2;
    }

    public final void M0() {
        MutableIntList mutableIntList = this.f14888x;
        if (mutableIntList != null) {
            while (PrioritySet.f(mutableIntList)) {
                s1(PrioritySet.h(mutableIntList), mutableIntList);
            }
        }
    }

    public final int N(int i2) {
        return O(this.f14866b, h0(i2));
    }

    public final boolean N0(int i2, int i3, HashMap hashMap) {
        int i4 = i3 + i2;
        int e2 = SlotTableKt.q(this.f14868d, i4, X() - this.f14872h);
        if (e2 >= this.f14868d.size()) {
            e2--;
        }
        int i5 = e2 + 1;
        boolean z2 = false;
        int i6 = 0;
        while (e2 >= 0) {
            Anchor anchor = (Anchor) this.f14868d.get(e2);
            int C = C(anchor);
            if (C < i2) {
                break;
            }
            if (C < i4) {
                anchor.c(Integer.MIN_VALUE);
                if (hashMap != null) {
                    GroupSourceInformation groupSourceInformation = (GroupSourceInformation) hashMap.remove(anchor);
                }
                if (i6 == 0) {
                    i6 = e2 + 1;
                }
                i5 = e2;
            }
            e2--;
        }
        if (i5 < i6) {
            z2 = true;
        }
        if (z2) {
            this.f14868d.subList(i5, i6).clear();
        }
        return z2;
    }

    public final int O(int[] iArr, int i2) {
        return i2 >= X() ? this.f14867c.length - this.f14876l : M(iArr[(i2 * 5) + 4], this.f14876l, this.f14867c.length);
    }

    public final boolean O0() {
        Anchor n1;
        if (!(this.f14878n == 0)) {
            ComposerKt.v("Cannot remove group while inserting");
        }
        int i2 = this.f14884t;
        int i3 = this.f14873i;
        int O = O(this.f14866b, h0(i2));
        int Y0 = Y0();
        GroupSourceInformation g1 = g1(this.f14886v);
        if (!(g1 == null || (n1 = n1(i2)) == null)) {
            g1.k(n1);
        }
        MutableIntList mutableIntList = this.f14888x;
        if (mutableIntList != null) {
            while (PrioritySet.f(mutableIntList) && PrioritySet.g(mutableIntList) >= i2) {
                PrioritySet.h(mutableIntList);
            }
        }
        boolean P0 = P0(i2, this.f14884t - i2);
        Q0(O, this.f14873i - O, i2 - 1);
        this.f14884t = i2;
        this.f14873i = i3;
        this.f14879o -= Y0;
        return P0;
    }

    public final int P(int i2) {
        return i2 + (this.f14876l * (i2 < this.f14875k ? 0 : 1));
    }

    public final boolean P0(int i2, int i3) {
        boolean z2 = false;
        if (i3 > 0) {
            ArrayList arrayList = this.f14868d;
            z0(i2);
            if (!arrayList.isEmpty()) {
                z2 = N0(i2, i3, this.f14869e);
            }
            this.f14871g = i2;
            this.f14872h += i3;
            int i4 = this.f14877m;
            if (i4 > i2) {
                this.f14877m = Math.max(i2, i4 - i3);
            }
            int i5 = this.f14885u;
            if (i5 >= this.f14871g) {
                this.f14885u = i5 - i3;
            }
            int i6 = this.f14886v;
            if (L(i6)) {
                r1(i6);
            }
        }
        return z2;
    }

    public final int Q(int i2, int i3, int i4, int i5) {
        return i2 > i3 ? -(((i5 - i4) - i2) + 1) : i2;
    }

    public final void Q0(int i2, int i3, int i4) {
        if (i3 > 0) {
            int i5 = this.f14876l;
            int i6 = i2 + i3;
            B0(i6, i4);
            this.f14875k = i2;
            this.f14876l = i5 + i3;
            ArraysKt.w(this.f14867c, (Object) null, i2, i6);
            int i7 = this.f14874j;
            if (i7 >= i2) {
                this.f14874j = i7 - i3;
            }
        }
    }

    public final int R() {
        MutableObjectList mutableObjectList;
        int i2 = 0;
        boolean z2 = this.f14878n > 0;
        int i3 = this.f14884t;
        int i4 = this.f14885u;
        int i5 = this.f14886v;
        int h0 = h0(i5);
        int i6 = this.f14879o;
        int i7 = i3 - i5;
        int i8 = (h0 * 5) + 1;
        boolean z3 = (this.f14866b[i8] & 1073741824) != 0;
        if (z2) {
            MutableIntObjectMap mutableIntObjectMap = this.f14883s;
            if (!(mutableIntObjectMap == null || (mutableObjectList = (MutableObjectList) mutableIntObjectMap.b(i5)) == null)) {
                Object[] objArr = mutableObjectList.f1937a;
                int i9 = mutableObjectList.f1938b;
                for (int i10 = 0; i10 < i9; i10++) {
                    L0(objArr[i10]);
                }
                MutableObjectList mutableObjectList2 = (MutableObjectList) mutableIntObjectMap.o(i5);
            }
            SlotTableKt.w(this.f14866b, h0, i7);
            SlotTableKt.y(this.f14866b, h0, i6);
            this.f14879o = this.f14882r.g() + (z3 ? 1 : i6);
            int I0 = I0(this.f14866b, i5);
            this.f14886v = I0;
            int e0 = I0 < 0 ? e0() : h0(I0 + 1);
            if (e0 >= 0) {
                i2 = O(this.f14866b, e0);
            }
            this.f14873i = i2;
            this.f14874j = i2;
        } else {
            if (!(i3 == i4)) {
                ComposerKt.v("Expected to be at the end of a group");
            }
            int c2 = SlotTableKt.o(this.f14866b, h0);
            int[] iArr = this.f14866b;
            int i11 = iArr[i8] & 67108863;
            SlotTableKt.w(iArr, h0, i7);
            SlotTableKt.y(this.f14866b, h0, i6);
            int g2 = this.f14880p.g();
            S0();
            this.f14886v = g2;
            int I02 = I0(this.f14866b, i5);
            int g3 = this.f14882r.g();
            this.f14879o = g3;
            if (I02 == g2) {
                if (!z3) {
                    i2 = i6 - i11;
                }
                this.f14879o = g3 + i2;
            } else {
                int i12 = i7 - c2;
                int i13 = z3 ? 0 : i6 - i11;
                if (!(i12 == 0 && i13 == 0)) {
                    while (I02 != 0 && I02 != g2 && (i13 != 0 || i12 != 0)) {
                        int h02 = h0(I02);
                        if (i12 != 0) {
                            SlotTableKt.w(this.f14866b, h02, SlotTableKt.o(this.f14866b, h02) + i12);
                        }
                        if (i13 != 0) {
                            int[] iArr2 = this.f14866b;
                            SlotTableKt.y(iArr2, h02, (iArr2[(h02 * 5) + 1] & 67108863) + i13);
                        }
                        int[] iArr3 = this.f14866b;
                        if ((iArr3[(h02 * 5) + 1] & 1073741824) != 0) {
                            i13 = 0;
                        }
                        I02 = I0(iArr3, I02);
                    }
                }
                this.f14879o += i13;
            }
        }
        return i6;
    }

    public final void R0() {
        if (!(this.f14878n == 0)) {
            ComposerKt.v("Cannot reset when inserting");
        }
        M0();
        this.f14884t = 0;
        this.f14885u = X() - this.f14872h;
        this.f14873i = 0;
        this.f14874j = 0;
        this.f14879o = 0;
    }

    public final void S() {
        boolean z2 = false;
        if (!(this.f14878n > 0)) {
            PreconditionsKt.b("Unbalanced begin/end insert");
        }
        int i2 = this.f14878n - 1;
        this.f14878n = i2;
        if (i2 == 0) {
            if (this.f14882r.f14682b == this.f14880p.f14682b) {
                z2 = true;
            }
            if (!z2) {
                ComposerKt.v("startGroup/endGroup mismatch while inserting");
            }
            S0();
        }
    }

    public final int S0() {
        int X = (X() - this.f14872h) - this.f14881q.g();
        this.f14885u = X;
        return X;
    }

    public final void T(int i2) {
        boolean z2 = false;
        if (!(this.f14878n <= 0)) {
            ComposerKt.v("Cannot call ensureStarted() while inserting");
        }
        int i3 = this.f14886v;
        if (i3 != i2) {
            if (i2 >= i3 && i2 < this.f14885u) {
                z2 = true;
            }
            if (!z2) {
                ComposerKt.v("Started group at " + i2 + " must be a subgroup of the group at " + i3);
            }
            int i4 = this.f14884t;
            int i5 = this.f14873i;
            int i6 = this.f14874j;
            this.f14884t = i2;
            i1();
            this.f14884t = i4;
            this.f14873i = i5;
            this.f14874j = i6;
        }
    }

    public final void T0() {
        this.f14881q.h((X() - this.f14872h) - this.f14885u);
    }

    public final void U(Anchor anchor) {
        T(anchor.e(this));
    }

    public final void U0(Anchor anchor) {
        A(anchor.e(this) - this.f14884t);
    }

    public final void V(int i2, int i3, int i4) {
        int K0 = K0(i2, this.f14871g);
        while (i4 < i3) {
            this.f14866b[(h0(i4) * 5) + 2] = K0;
            int c2 = SlotTableKt.o(this.f14866b, h0(i4)) + i4;
            V(i4, c2, i4 + 1);
            i4 = c2;
        }
    }

    public final Object V0(int i2, int i3, Object obj) {
        int P = P(d1(i2, i3));
        Object[] objArr = this.f14867c;
        Object obj2 = objArr[P];
        objArr[P] = obj;
        return obj2;
    }

    public final void W(int i2, Function2 function2) {
        int i3;
        int i4;
        Anchor a2;
        int i5 = i2;
        Function2 function22 = function2;
        int H0 = H0(i2);
        int e0 = e0();
        int k0 = k0(i2) + i5;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i6 = i5;
        MutableIntSet mutableIntSet = null;
        MutableIntList mutableIntList = null;
        while (i6 < k0) {
            int N = N(i6);
            int i7 = i6 + 1;
            int N2 = N(i7);
            while (true) {
                i3 = 0;
                if (N >= N2) {
                    break;
                }
                Object obj = this.f14867c[P(N)];
                if (!(obj instanceof RememberObserverHolder) || (a2 = ((RememberObserverHolder) obj).a()) == null || !a2.b()) {
                    function22.m(Integer.valueOf(N), obj);
                } else {
                    int C = C(a2);
                    if (mutableIntSet == null) {
                        mutableIntSet = IntSetKt.b();
                    }
                    if (mutableIntList == null) {
                        mutableIntList = new MutableIntList(0, 1, defaultConstructorMarker);
                    }
                    mutableIntSet.g(C);
                    mutableIntList.k(C);
                    mutableIntList.k(N);
                }
                N++;
            }
            int H02 = i7 < e0 ? H0(i7) : -1;
            if (H02 != i6) {
                while (true) {
                    if (mutableIntList == null || mutableIntSet == null || !mutableIntSet.r(i6)) {
                        i4 = e0;
                    } else {
                        int i8 = mutableIntList.f1784b;
                        int i9 = i8 / 2;
                        int i10 = i3;
                        int i11 = i10;
                        while (i11 < i9) {
                            int i12 = i11 * 2;
                            int i13 = e0;
                            int e2 = mutableIntList.e(i12);
                            if (e2 == i6) {
                                int e3 = mutableIntList.e(i12 + 1);
                                function22.m(Integer.valueOf(e3), this.f14867c[P(e3)]);
                            } else if (i12 != i10) {
                                int i14 = i10 + 1;
                                mutableIntList.q(i10, e2);
                                i10 += 2;
                                mutableIntList.q(i14, mutableIntList.e(i12 + 1));
                            } else {
                                i10 += 2;
                            }
                            i11++;
                            function22 = function2;
                            e0 = i13;
                        }
                        i4 = e0;
                        if (i10 != i8) {
                            mutableIntList.p(i10, i8);
                        }
                    }
                    if (i6 == i5 || H0 == H02) {
                        break;
                    }
                    i6 = H0;
                    e0 = i4;
                    i3 = 0;
                    H0 = H0(H0);
                    function22 = function2;
                }
            } else {
                i4 = e0;
            }
            function22 = function2;
            H0 = H02;
            i6 = i7;
            e0 = i4;
            defaultConstructorMarker = null;
        }
    }

    public final void W0(Object obj) {
        if (!(this.f14873i <= this.f14874j)) {
            ComposerKt.v("Writing to an invalid slot");
        }
        this.f14867c[P(this.f14873i - 1)] = obj;
    }

    public final int X() {
        return this.f14866b.length / 5;
    }

    public final Object X0() {
        if (this.f14878n > 0) {
            q0(1, this.f14886v);
        }
        Object[] objArr = this.f14867c;
        int i2 = this.f14873i;
        this.f14873i = i2 + 1;
        return objArr[P(i2)];
    }

    public final boolean Y() {
        return this.f14887w;
    }

    public final int Y0() {
        int h0 = h0(this.f14884t);
        int c2 = this.f14884t + SlotTableKt.o(this.f14866b, h0);
        this.f14884t = c2;
        this.f14873i = O(this.f14866b, h0(c2));
        int i2 = this.f14866b[(h0 * 5) + 1];
        if ((1073741824 & i2) != 0) {
            return 1;
        }
        return i2 & 67108863;
    }

    public final boolean Z() {
        return this.f14870f != null;
    }

    public final void Z0() {
        int i2 = this.f14885u;
        this.f14884t = i2;
        this.f14873i = O(this.f14866b, h0(i2));
    }

    public final boolean a0() {
        return this.f14869e != null;
    }

    public final Object a1(int i2, int i3) {
        int c1 = c1(this.f14866b, h0(i2));
        int O = O(this.f14866b, h0(i2 + 1));
        int i4 = i3 + c1;
        if (c1 > i4 || i4 >= O) {
            return Composer.f14567a.a();
        }
        return this.f14867c[P(i4)];
    }

    public final int b0() {
        return this.f14884t;
    }

    public final Object b1(Anchor anchor, int i2) {
        return a1(C(anchor), i2);
    }

    public final int c0() {
        return this.f14885u;
    }

    public final int c1(int[] iArr, int i2) {
        return i2 >= X() ? this.f14867c.length - this.f14876l : M(SlotTableKt.t(iArr, i2), this.f14876l, this.f14867c.length);
    }

    public final int d0() {
        return this.f14886v;
    }

    public final int d1(int i2, int i3) {
        int c1 = c1(this.f14866b, h0(i2));
        int i4 = c1 + i3;
        if (!(i4 >= c1 && i4 < O(this.f14866b, h0(i2 + 1)))) {
            ComposerKt.v("Write to an invalid slot index " + i3 + " for group " + i2);
        }
        return i4;
    }

    public final int e0() {
        return X() - this.f14872h;
    }

    public final int e1(int i2) {
        return O(this.f14866b, h0(i2 + 1));
    }

    public final SlotTable f0() {
        return this.f14865a;
    }

    public final int f1(int i2) {
        return c1(this.f14866b, h0(i2));
    }

    public final Object g0(int i2) {
        int h0 = h0(i2);
        int[] iArr = this.f14866b;
        return (iArr[(h0 * 5) + 1] & 268435456) != 0 ? this.f14867c[E(iArr, h0)] : Composer.f14567a.a();
    }

    public final GroupSourceInformation g1(int i2) {
        Anchor n1;
        HashMap hashMap = this.f14869e;
        if (hashMap == null || (n1 = n1(i2)) == null) {
            return null;
        }
        return (GroupSourceInformation) hashMap.get(n1);
    }

    public final int h0(int i2) {
        return i2 + (this.f14872h * (i2 < this.f14871g ? 0 : 1));
    }

    public final void h1(int i2, Object obj, Object obj2) {
        k1(i2, obj, false, obj2);
    }

    public final int i0(int i2) {
        return this.f14866b[h0(i2) * 5];
    }

    public final void i1() {
        if (!(this.f14878n == 0)) {
            ComposerKt.v("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.f14567a;
        k1(0, companion.a(), false, companion.a());
    }

    public final Object j0(int i2) {
        int h0 = h0(i2);
        int[] iArr = this.f14866b;
        if ((iArr[(h0 * 5) + 1] & 536870912) != 0) {
            return this.f14867c[SlotTableKt.r(iArr, h0)];
        }
        return null;
    }

    public final void j1(int i2, Object obj) {
        k1(i2, obj, false, Composer.f14567a.a());
    }

    public final int k0(int i2) {
        return SlotTableKt.o(this.f14866b, h0(i2));
    }

    public final void k1(int i2, Object obj, boolean z2, Object obj2) {
        int i3;
        GroupSourceInformation g1;
        Object obj3 = obj;
        Object obj4 = obj2;
        int i4 = this.f14886v;
        boolean z3 = this.f14878n > 0;
        this.f14882r.h(this.f14879o);
        if (z3) {
            int i5 = this.f14884t;
            int O = O(this.f14866b, h0(i5));
            p0(1);
            this.f14873i = O;
            this.f14874j = O;
            int h0 = h0(i5);
            Composer.Companion companion = Composer.f14567a;
            boolean z4 = obj3 != companion.a();
            boolean z5 = !z2 && obj4 != companion.a();
            int Q = Q(O, this.f14875k, this.f14876l, this.f14867c.length);
            SlotTableKt.p(this.f14866b, h0, i2, z2, z4, z5, this.f14886v, (Q < 0 || this.f14877m >= i5) ? Q : -(((this.f14867c.length - this.f14876l) - Q) + 1));
            int i6 = (z2 ? 1 : 0) + (z4 ? 1 : 0) + (z5 ? 1 : 0);
            if (i6 > 0) {
                q0(i6, i5);
                Object[] objArr = this.f14867c;
                int i7 = this.f14873i;
                if (z2) {
                    objArr[i7] = obj4;
                    i7++;
                }
                if (z4) {
                    objArr[i7] = obj3;
                    i7++;
                }
                if (z5) {
                    objArr[i7] = obj4;
                    i7++;
                }
                this.f14873i = i7;
            }
            this.f14879o = 0;
            i3 = i5 + 1;
            this.f14886v = i5;
            this.f14884t = i3;
            if (i4 >= 0 && (g1 = g1(i4)) != null) {
                g1.m(this, i5);
            }
        } else {
            this.f14880p.h(i4);
            T0();
            int i8 = this.f14884t;
            int h02 = h0(i8);
            if (!Intrinsics.d(obj4, Composer.f14567a.a())) {
                if (z2) {
                    v1(obj4);
                } else {
                    q1(obj4);
                }
            }
            this.f14873i = c1(this.f14866b, h02);
            this.f14874j = O(this.f14866b, h0(this.f14884t + 1));
            int[] iArr = this.f14866b;
            this.f14879o = iArr[(h02 * 5) + 1] & 67108863;
            this.f14886v = i8;
            this.f14884t = i8 + 1;
            i3 = i8 + SlotTableKt.o(iArr, h02);
        }
        this.f14885u = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r3 = (androidx.collection.MutableObjectList) r1.b(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l0(int r3) {
        /*
            r2 = this;
            int r0 = r2.f14873i
            int r1 = r2.f1(r3)
            int r0 = r0 - r1
            androidx.collection.MutableIntObjectMap r1 = r2.f14883s
            if (r1 == 0) goto L_0x0018
            java.lang.Object r3 = r1.b(r3)
            androidx.collection.MutableObjectList r3 = (androidx.collection.MutableObjectList) r3
            if (r3 == 0) goto L_0x0018
            int r3 = r3.e()
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.l0(int):int");
    }

    public final void l1(int i2, Object obj) {
        k1(i2, obj, true, Composer.f14567a.a());
    }

    public final boolean m0(int i2) {
        return n0(i2, this.f14884t);
    }

    public final void m1(int i2) {
        boolean z2 = false;
        if (!(i2 > 0)) {
            ComposerKt.v("Check failed");
        }
        int i3 = this.f14886v;
        int c1 = c1(this.f14866b, h0(i3));
        int O = O(this.f14866b, h0(i3 + 1)) - i2;
        if (O >= c1) {
            z2 = true;
        }
        if (!z2) {
            ComposerKt.v("Check failed");
        }
        Q0(O, i2, i3);
        int i4 = this.f14873i;
        if (i4 >= c1) {
            this.f14873i = i4 - i2;
        }
    }

    public final boolean n0(int i2, int i3) {
        int i4;
        int k0;
        if (i3 == this.f14886v) {
            i4 = this.f14885u;
        } else {
            if (i3 > this.f14880p.f(0)) {
                k0 = k0(i3);
            } else {
                int b2 = this.f14880p.b(i3);
                if (b2 < 0) {
                    k0 = k0(i3);
                } else {
                    i4 = (X() - this.f14872h) - this.f14881q.d(b2);
                }
            }
            i4 = k0 + i3;
        }
        return i2 > i3 && i2 < i4;
    }

    public final Anchor n1(int i2) {
        if (i2 < 0 || i2 >= e0()) {
            return null;
        }
        return SlotTableKt.n(this.f14868d, i2, e0());
    }

    public final boolean o0(int i2) {
        int i3 = this.f14886v;
        return (i2 > i3 && i2 < this.f14885u) || (i3 == 0 && i2 == 0);
    }

    public final Object o1(Object obj) {
        if (this.f14878n <= 0 || this.f14873i == this.f14875k) {
            return L0(obj);
        }
        MutableIntObjectMap mutableIntObjectMap = this.f14883s;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap(0, 1, (DefaultConstructorMarker) null);
        }
        this.f14883s = mutableIntObjectMap;
        int i2 = this.f14886v;
        Object b2 = mutableIntObjectMap.b(i2);
        if (b2 == null) {
            b2 = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);
            mutableIntObjectMap.r(i2, b2);
        }
        ((MutableObjectList) b2).n(obj);
        return Composer.f14567a.a();
    }

    public final void p0(int i2) {
        if (i2 > 0) {
            int i3 = this.f14884t;
            z0(i3);
            int i4 = this.f14871g;
            int i5 = this.f14872h;
            int[] iArr = this.f14866b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i2) {
                int max = Math.max(Math.max(length * 2, i6 + i2), 32);
                int[] iArr2 = new int[(max * 5)];
                int i8 = max - i6;
                ArraysKt.j(iArr, iArr2, 0, 0, i4 * 5);
                ArraysKt.j(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                this.f14866b = iArr2;
                i5 = i8;
            }
            int i9 = this.f14885u;
            if (i9 >= i4) {
                this.f14885u = i9 + i2;
            }
            int i10 = i4 + i2;
            this.f14871g = i10;
            this.f14872h = i5 - i2;
            int N = i6 > 0 ? N(i3 + i2) : 0;
            if (this.f14877m >= i4) {
                i7 = this.f14875k;
            }
            int Q = Q(N, i7, this.f14876l, this.f14867c.length);
            for (int i11 = i4; i11 < i10; i11++) {
                this.f14866b[(i11 * 5) + 4] = Q;
            }
            int i12 = this.f14877m;
            if (i12 >= i4) {
                this.f14877m = i12 + i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r5 = (androidx.compose.runtime.Anchor) r3.f14868d.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        r0 = (androidx.compose.runtime.Anchor) r3.f14868d.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p1(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f14872h
            int r1 = r3.X()
            int r1 = r1 - r0
            if (r4 >= r5) goto L_0x002e
            java.util.ArrayList r0 = r3.f14868d
            int r4 = androidx.compose.runtime.SlotTableKt.q(r0, r4, r1)
        L_0x000f:
            java.util.ArrayList r0 = r3.f14868d
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x0053
            java.util.ArrayList r0 = r3.f14868d
            java.lang.Object r0 = r0.get(r4)
            androidx.compose.runtime.Anchor r0 = (androidx.compose.runtime.Anchor) r0
            int r2 = r0.a()
            if (r2 >= 0) goto L_0x0053
            int r2 = r2 + r1
            if (r2 >= r5) goto L_0x0053
            r0.c(r2)
            int r4 = r4 + 1
            goto L_0x000f
        L_0x002e:
            java.util.ArrayList r4 = r3.f14868d
            int r4 = androidx.compose.runtime.SlotTableKt.q(r4, r5, r1)
        L_0x0034:
            java.util.ArrayList r5 = r3.f14868d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0053
            java.util.ArrayList r5 = r3.f14868d
            java.lang.Object r5 = r5.get(r4)
            androidx.compose.runtime.Anchor r5 = (androidx.compose.runtime.Anchor) r5
            int r0 = r5.a()
            if (r0 < 0) goto L_0x0053
            int r0 = r1 - r0
            int r0 = -r0
            r5.c(r0)
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.p1(int, int):void");
    }

    public final void q0(int i2, int i3) {
        if (i2 > 0) {
            B0(this.f14873i, i3);
            int i4 = this.f14875k;
            int i5 = this.f14876l;
            if (i5 < i2) {
                Object[] objArr = this.f14867c;
                int length = objArr.length;
                int i6 = length - i5;
                int max = Math.max(Math.max(length * 2, i6 + i2), 32);
                Object[] objArr2 = new Object[max];
                for (int i7 = 0; i7 < max; i7++) {
                    objArr2[i7] = null;
                }
                int i8 = max - i6;
                int i9 = i5 + i4;
                System.arraycopy(objArr, 0, objArr2, 0, i4);
                System.arraycopy(objArr, i9, objArr2, i4 + i8, length - i9);
                this.f14867c = objArr2;
                i5 = i8;
            }
            int i10 = this.f14874j;
            if (i10 >= i4) {
                this.f14874j = i10 + i2;
            }
            this.f14875k = i4 + i2;
            this.f14876l = i5 - i2;
        }
    }

    public final void q1(Object obj) {
        int h0 = h0(this.f14884t);
        boolean z2 = true;
        if ((this.f14866b[(h0 * 5) + 1] & 268435456) == 0) {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.v("Updating the data of a group that was not created with a data slot");
        }
        this.f14867c[P(E(this.f14866b, h0))] = obj;
    }

    public final boolean r0() {
        return this.f14884t == this.f14885u;
    }

    public final void r1(int i2) {
        if (i2 >= 0) {
            MutableIntList mutableIntList = this.f14888x;
            if (mutableIntList == null) {
                mutableIntList = PrioritySet.c((MutableIntList) null, 1, (DefaultConstructorMarker) null);
                this.f14888x = mutableIntList;
            }
            PrioritySet.a(mutableIntList, i2);
        }
    }

    public final boolean s0() {
        int i2 = this.f14884t;
        return i2 < this.f14885u && (this.f14866b[(h0(i2) * 5) + 1] & 1073741824) != 0;
    }

    public final void s1(int i2, MutableIntList mutableIntList) {
        int h0 = h0(i2);
        boolean G = G(i2);
        int[] iArr = this.f14866b;
        boolean z2 = true;
        if ((iArr[(h0 * 5) + 1] & 67108864) == 0) {
            z2 = false;
        }
        if (z2 != G) {
            SlotTableKt.v(iArr, h0, G);
            int H0 = H0(i2);
            if (H0 >= 0) {
                PrioritySet.a(mutableIntList, H0);
            }
        }
    }

    public final boolean t0(int i2) {
        return (this.f14866b[(h0(i2) * 5) + 1] & 1073741824) != 0;
    }

    public final void t1(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 4] = Q(i3, this.f14875k, this.f14876l, this.f14867c.length);
    }

    public String toString() {
        return "SlotWriter(current = " + this.f14884t + " end=" + this.f14885u + " size = " + e0() + " gap=" + this.f14871g + '-' + (this.f14871g + this.f14872h) + ')';
    }

    public final void u0(int i2) {
        int h0 = h0(i2);
        int[] iArr = this.f14866b;
        int i3 = (h0 * 5) + 1;
        if ((iArr[i3] & 134217728) == 0) {
            SlotTableKt.x(iArr, h0, true);
            if ((this.f14866b[i3] & 67108864) == 0) {
                r1(H0(i2));
            }
        }
    }

    public final void u1(Anchor anchor, Object obj) {
        w1(anchor.e(this), obj);
    }

    public final void v1(Object obj) {
        w1(this.f14884t, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = (androidx.compose.runtime.Anchor) r5.f14868d.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w0(int r6, int r7, int r8) {
        /*
            r5 = this;
            int r8 = r8 + r6
            int r0 = r5.e0()
            java.util.ArrayList r1 = r5.f14868d
            int r1 = androidx.compose.runtime.SlotTableKt.q(r1, r6, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 < 0) goto L_0x0036
        L_0x0012:
            java.util.ArrayList r3 = r5.f14868d
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0036
            java.util.ArrayList r3 = r5.f14868d
            java.lang.Object r3 = r3.get(r1)
            androidx.compose.runtime.Anchor r3 = (androidx.compose.runtime.Anchor) r3
            int r4 = r5.C(r3)
            if (r4 < r6) goto L_0x0036
            if (r4 >= r8) goto L_0x0036
            r2.add(r3)
            java.util.ArrayList r3 = r5.f14868d
            java.lang.Object r3 = r3.remove(r1)
            androidx.compose.runtime.Anchor r3 = (androidx.compose.runtime.Anchor) r3
            goto L_0x0012
        L_0x0036:
            int r7 = r7 - r6
            int r6 = r2.size()
            r8 = 0
        L_0x003c:
            if (r8 >= r6) goto L_0x0065
            java.lang.Object r1 = r2.get(r8)
            androidx.compose.runtime.Anchor r1 = (androidx.compose.runtime.Anchor) r1
            int r3 = r5.C(r1)
            int r3 = r3 + r7
            int r4 = r5.f14871g
            if (r3 < r4) goto L_0x0054
            int r4 = r0 - r3
            int r4 = -r4
            r1.c(r4)
            goto L_0x0057
        L_0x0054:
            r1.c(r3)
        L_0x0057:
            java.util.ArrayList r4 = r5.f14868d
            int r3 = androidx.compose.runtime.SlotTableKt.q(r4, r3, r0)
            java.util.ArrayList r4 = r5.f14868d
            r4.add(r3, r1)
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.w0(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w1(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.h0(r5)
            int[] r1 = r4.f14866b
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0015
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Updating the node of a group at "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            androidx.compose.runtime.ComposerKt.v(r5)
        L_0x0031:
            java.lang.Object[] r5 = r4.f14867c
            int[] r1 = r4.f14866b
            int r0 = r4.G0(r1, r0)
            int r0 = r4.P(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.w1(int, java.lang.Object):void");
    }

    public final List x0(SlotTable slotTable, int i2, boolean z2) {
        boolean z3 = false;
        z3 = true;
        if (!(this.f14878n > 0 ? z3 : z3)) {
            ComposerKt.v("Check failed");
        }
        if (i2 == 0 && this.f14884t == 0 && this.f14865a.u() == 0 && SlotTableKt.o(slotTable.s(), i2) == slotTable.u()) {
            int[] iArr = this.f14866b;
            Object[] objArr = this.f14867c;
            ArrayList arrayList = this.f14868d;
            HashMap hashMap = this.f14869e;
            MutableIntObjectMap mutableIntObjectMap = this.f14870f;
            int[] s2 = slotTable.s();
            int u2 = slotTable.u();
            Object[] v2 = slotTable.v();
            int w2 = slotTable.w();
            HashMap z4 = slotTable.z();
            MutableIntObjectMap q2 = slotTable.q();
            this.f14866b = s2;
            this.f14867c = v2;
            this.f14868d = slotTable.p();
            this.f14871g = u2;
            this.f14872h = (s2.length / 5) - u2;
            this.f14875k = w2;
            this.f14876l = v2.length - w2;
            this.f14877m = u2;
            this.f14869e = z4;
            this.f14870f = q2;
            slotTable.K(iArr, 0, objArr, 0, arrayList, hashMap, mutableIntObjectMap);
            return this.f14868d;
        }
        SlotWriter F = slotTable.F();
        try {
            return f14863y.b(F, i2, this, true, true, z2);
        } finally {
            F.J(z3);
        }
    }

    public final void x1() {
        this.f14869e = this.f14865a.z();
        this.f14870f = this.f14865a.q();
    }

    public final void y0(int i2) {
        if (!(this.f14878n == 0)) {
            ComposerKt.v("Cannot move a group while inserting");
        }
        if (!(i2 >= 0)) {
            ComposerKt.v("Parameter offset is out of bounds");
        }
        if (i2 != 0) {
            int i3 = this.f14884t;
            int i4 = this.f14886v;
            int i5 = this.f14885u;
            int i6 = i3;
            for (int i7 = i2; i7 > 0; i7--) {
                i6 += SlotTableKt.o(this.f14866b, h0(i6));
                if (!(i6 <= i5)) {
                    ComposerKt.v("Parameter offset is out of bounds");
                }
            }
            int c2 = SlotTableKt.o(this.f14866b, h0(i6));
            int O = O(this.f14866b, h0(this.f14884t));
            int O2 = O(this.f14866b, h0(i6));
            int i8 = i6 + c2;
            int O3 = O(this.f14866b, h0(i8));
            int i9 = O3 - O2;
            q0(i9, Math.max(this.f14884t - 1, 0));
            p0(c2);
            int[] iArr = this.f14866b;
            int h0 = h0(i8) * 5;
            ArraysKt.j(iArr, iArr, h0(i3) * 5, h0, (c2 * 5) + h0);
            if (i9 > 0) {
                Object[] objArr = this.f14867c;
                int P = P(O2 + i9);
                System.arraycopy(objArr, P, objArr, O, P(O3 + i9) - P);
            }
            int i10 = O2 + i9;
            int i11 = i10 - O;
            int i12 = this.f14875k;
            int i13 = this.f14876l;
            int length = this.f14867c.length;
            int i14 = this.f14877m;
            int i15 = i3 + c2;
            int i16 = i3;
            while (i16 < i15) {
                int h02 = h0(i16);
                int i17 = i12;
                int i18 = i11;
                t1(iArr, h02, Q(O(iArr, h02) - i11, i14 < h02 ? 0 : i17, i13, length));
                i16++;
                i12 = i17;
                i11 = i18;
            }
            w0(i8, i3, c2);
            if (P0(i8, c2)) {
                ComposerKt.v("Unexpectedly removed anchors");
            }
            V(i4, this.f14885u, i3);
            if (i9 > 0) {
                Q0(i10, i9, i8 - 1);
            }
        }
    }

    public final void z0(int i2) {
        int i3;
        int i4 = this.f14872h;
        int i5 = this.f14871g;
        if (i5 != i2) {
            if (!this.f14868d.isEmpty()) {
                p1(i5, i2);
            }
            if (i4 > 0) {
                int[] iArr = this.f14866b;
                int i6 = i2 * 5;
                int i7 = i4 * 5;
                int i8 = i5 * 5;
                if (i2 < i5) {
                    ArraysKt.j(iArr, iArr, i7 + i6, i6, i8);
                } else {
                    ArraysKt.j(iArr, iArr, i8, i8 + i7, i6 + i7);
                }
            }
            if (i2 < i5) {
                i5 = i2 + i4;
            }
            int X = X();
            if (!(i3 < X)) {
                ComposerKt.v("Check failed");
            }
            while (i3 < X) {
                int i9 = (i3 * 5) + 2;
                int i10 = this.f14866b[i9];
                int K0 = K0(J0(i10), i2);
                if (K0 != i10) {
                    this.f14866b[i9] = K0;
                }
                i3++;
                if (i3 == i2) {
                    i3 += i4;
                }
            }
        }
        this.f14871g = i2;
    }
}
