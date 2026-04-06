package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class SlotReader {

    /* renamed from: a  reason: collision with root package name */
    public final SlotTable f14841a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f14842b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14843c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f14844d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14845e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap f14846f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14847g;

    /* renamed from: h  reason: collision with root package name */
    public int f14848h;

    /* renamed from: i  reason: collision with root package name */
    public int f14849i;

    /* renamed from: j  reason: collision with root package name */
    public int f14850j = -1;

    /* renamed from: k  reason: collision with root package name */
    public final IntStack f14851k = new IntStack();

    /* renamed from: l  reason: collision with root package name */
    public int f14852l;

    /* renamed from: m  reason: collision with root package name */
    public int f14853m;

    /* renamed from: n  reason: collision with root package name */
    public int f14854n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14855o;

    public SlotReader(SlotTable slotTable) {
        this.f14841a = slotTable;
        this.f14842b = slotTable.s();
        int u2 = slotTable.u();
        this.f14843c = u2;
        this.f14844d = slotTable.v();
        this.f14845e = slotTable.w();
        this.f14849i = u2;
    }

    public final Object A(int i2) {
        return b(this.f14842b, i2);
    }

    public final Object B(int i2) {
        return C(this.f14848h, i2);
    }

    public final Object C(int i2, int i3) {
        int h2 = SlotTableKt.t(this.f14842b, i2);
        int i4 = i2 + 1;
        int i5 = h2 + i3;
        return i5 < (i4 < this.f14843c ? this.f14842b[(i4 * 5) + 4] : this.f14845e) ? this.f14844d[i5] : Composer.f14567a.a();
    }

    public final int D(int i2) {
        return this.f14842b[i2 * 5];
    }

    public final Object E(int i2) {
        return P(this.f14842b, i2);
    }

    public final int F(int i2) {
        return SlotTableKt.o(this.f14842b, i2);
    }

    public final boolean G(int i2) {
        return (this.f14842b[(i2 * 5) + 1] & 134217728) != 0;
    }

    public final boolean H(int i2) {
        return (this.f14842b[(i2 * 5) + 1] & 536870912) != 0;
    }

    public final boolean I() {
        return t() || this.f14848h == this.f14849i;
    }

    public final boolean J() {
        return (this.f14842b[(this.f14848h * 5) + 1] & 1073741824) != 0;
    }

    public final boolean K(int i2) {
        return (this.f14842b[(i2 * 5) + 1] & 1073741824) != 0;
    }

    public final Object L() {
        int i2;
        if (this.f14852l > 0 || (i2 = this.f14853m) >= this.f14854n) {
            this.f14855o = false;
            return Composer.f14567a.a();
        }
        this.f14855o = true;
        Object[] objArr = this.f14844d;
        this.f14853m = i2 + 1;
        return objArr[i2];
    }

    public final Object M(int i2) {
        int[] iArr = this.f14842b;
        if ((iArr[(i2 * 5) + 1] & 1073741824) != 0) {
            return N(iArr, i2);
        }
        return null;
    }

    public final Object N(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return (iArr[i3 + 1] & 1073741824) != 0 ? this.f14844d[iArr[i3 + 4]] : Composer.f14567a.a();
    }

    public final int O(int i2) {
        return this.f14842b[(i2 * 5) + 1] & 67108863;
    }

    public final Object P(int[] iArr, int i2) {
        if ((iArr[(i2 * 5) + 1] & 536870912) != 0) {
            return this.f14844d[SlotTableKt.r(iArr, i2)];
        }
        return null;
    }

    public final int Q(int i2) {
        return this.f14842b[(i2 * 5) + 2];
    }

    public final void R(int i2) {
        if (!(this.f14852l == 0)) {
            ComposerKt.v("Cannot reposition while in an empty region");
        }
        this.f14848h = i2;
        int i3 = this.f14843c;
        int i4 = i2 < i3 ? this.f14842b[(i2 * 5) + 2] : -1;
        if (i4 != this.f14850j) {
            this.f14850j = i4;
            if (i4 < 0) {
                this.f14849i = i3;
            } else {
                this.f14849i = i4 + SlotTableKt.o(this.f14842b, i4);
            }
            this.f14853m = 0;
            this.f14854n = 0;
        }
    }

    public final void S(int i2) {
        int c2 = SlotTableKt.o(this.f14842b, i2) + i2;
        int i3 = this.f14848h;
        if (!(i3 >= i2 && i3 <= c2)) {
            ComposerKt.v("Index " + i2 + " is not a parent of " + i3);
        }
        this.f14850j = i2;
        this.f14849i = c2;
        this.f14853m = 0;
        this.f14854n = 0;
    }

    public final int T() {
        int i2 = 1;
        if (!(this.f14852l == 0)) {
            ComposerKt.v("Cannot skip while in an empty region");
        }
        int[] iArr = this.f14842b;
        int i3 = this.f14848h;
        if ((iArr[(i3 * 5) + 1] & 1073741824) == 0) {
            i2 = iArr[(i3 * 5) + 1] & 67108863;
        }
        this.f14848h = i3 + SlotTableKt.o(iArr, i3);
        return i2;
    }

    public final void U() {
        if (!(this.f14852l == 0)) {
            ComposerKt.v("Cannot skip the enclosing group while in an empty region");
        }
        this.f14848h = this.f14849i;
        this.f14853m = 0;
        this.f14854n = 0;
    }

    public final int V(int i2) {
        int h2 = SlotTableKt.t(this.f14842b, i2);
        int i3 = i2 + 1;
        return (i3 < this.f14843c ? this.f14842b[(i3 * 5) + 4] : this.f14845e) - h2;
    }

    public final void W() {
        GroupSourceInformation groupSourceInformation;
        if (this.f14852l <= 0) {
            int i2 = this.f14850j;
            int i3 = this.f14848h;
            if (!(this.f14842b[(i3 * 5) + 2] == i2)) {
                PreconditionsKt.a("Invalid slot table detected");
            }
            HashMap hashMap = this.f14846f;
            if (!(hashMap == null || (groupSourceInformation = (GroupSourceInformation) hashMap.get(a(i2))) == null)) {
                groupSourceInformation.l(this.f14841a, i3);
            }
            IntStack intStack = this.f14851k;
            int i4 = this.f14853m;
            int i5 = this.f14854n;
            if (i4 == 0 && i5 == 0) {
                intStack.h(-1);
            } else {
                intStack.h(i4);
            }
            this.f14850j = i3;
            this.f14849i = SlotTableKt.o(this.f14842b, i3) + i3;
            int i6 = i3 + 1;
            this.f14848h = i6;
            this.f14853m = SlotTableKt.t(this.f14842b, i3);
            this.f14854n = i3 >= this.f14843c - 1 ? this.f14845e : this.f14842b[(i6 * 5) + 4];
        }
    }

    public final void X() {
        if (this.f14852l <= 0) {
            boolean z2 = true;
            if ((this.f14842b[(this.f14848h * 5) + 1] & 1073741824) == 0) {
                z2 = false;
            }
            if (!z2) {
                PreconditionsKt.a("Expected a node group");
            }
            W();
        }
    }

    public final Anchor a(int i2) {
        ArrayList p2 = this.f14841a.p();
        int g2 = SlotTableKt.s(p2, i2, this.f14843c);
        if (g2 >= 0) {
            return (Anchor) p2.get(g2);
        }
        Anchor anchor = new Anchor(i2);
        p2.add(-(g2 + 1), anchor);
        return anchor;
    }

    public final Object b(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 268435456) != 0 ? this.f14844d[SlotTableKt.m(iArr, i2)] : Composer.f14567a.a();
    }

    public final void c() {
        this.f14852l++;
    }

    public final void d() {
        this.f14847g = true;
        this.f14841a.h(this, this.f14846f);
        this.f14844d = new Object[0];
    }

    public final boolean e(int i2) {
        return (this.f14842b[(i2 * 5) + 1] & 67108864) != 0;
    }

    public final void f() {
        if (!(this.f14852l > 0)) {
            PreconditionsKt.a("Unbalanced begin/end empty");
        }
        this.f14852l--;
    }

    public final void g() {
        if (this.f14852l == 0) {
            if (!(this.f14848h == this.f14849i)) {
                ComposerKt.v("endGroup() not called at the end of a group");
            }
            int[] iArr = this.f14842b;
            int i2 = iArr[(this.f14850j * 5) + 2];
            this.f14850j = i2;
            this.f14849i = i2 < 0 ? this.f14843c : SlotTableKt.o(iArr, i2) + i2;
            int g2 = this.f14851k.g();
            if (g2 < 0) {
                this.f14853m = 0;
                this.f14854n = 0;
                return;
            }
            this.f14853m = g2;
            this.f14854n = i2 >= this.f14843c - 1 ? this.f14845e : this.f14842b[((i2 + 1) * 5) + 4];
        }
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        if (this.f14852l > 0) {
            return arrayList;
        }
        int i2 = this.f14848h;
        int i3 = 0;
        while (i2 < this.f14849i) {
            int[] iArr = this.f14842b;
            int i4 = i2 * 5;
            int i5 = iArr[i4];
            Object P = P(iArr, i2);
            int i6 = 1;
            int i7 = this.f14842b[i4 + 1];
            if ((1073741824 & i7) == 0) {
                i6 = i7 & 67108863;
            }
            arrayList.add(new KeyInfo(i5, P, i2, i6, i3));
            i2 += SlotTableKt.o(this.f14842b, i2);
            i3++;
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f14847g;
    }

    public final int j() {
        return this.f14849i;
    }

    public final int k() {
        return this.f14848h;
    }

    public final Object l() {
        int i2 = this.f14848h;
        if (i2 < this.f14849i) {
            return b(this.f14842b, i2);
        }
        return 0;
    }

    public final int m() {
        return this.f14849i;
    }

    public final int n() {
        int i2 = this.f14848h;
        if (i2 < this.f14849i) {
            return this.f14842b[i2 * 5];
        }
        return 0;
    }

    public final Object o() {
        int i2 = this.f14848h;
        if (i2 < this.f14849i) {
            return P(this.f14842b, i2);
        }
        return null;
    }

    public final int p() {
        return SlotTableKt.o(this.f14842b, this.f14848h);
    }

    public final int q() {
        return this.f14853m - SlotTableKt.t(this.f14842b, this.f14850j);
    }

    public final boolean r() {
        return this.f14855o;
    }

    public final boolean s() {
        int i2 = this.f14848h;
        return i2 < this.f14849i && (this.f14842b[(i2 * 5) + 1] & 536870912) != 0;
    }

    public final boolean t() {
        return this.f14852l > 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f14848h + ", key=" + n() + ", parent=" + this.f14850j + ", end=" + this.f14849i + ')';
    }

    public final int u() {
        return this.f14850j;
    }

    public final int v() {
        int i2 = this.f14850j;
        if (i2 >= 0) {
            return this.f14842b[(i2 * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final int w() {
        return this.f14854n - this.f14853m;
    }

    public final int x() {
        return this.f14843c;
    }

    public final int y() {
        return this.f14853m - SlotTableKt.t(this.f14842b, this.f14850j);
    }

    public final SlotTable z() {
        return this.f14841a;
    }
}
