package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f14856A;

    /* renamed from: B  reason: collision with root package name */
    public Object[] f14857B = new Object[0];
    public int C;
    public int D;
    public final Object E = new Object();
    public boolean F;
    public int G;
    public ArrayList H = new ArrayList();
    public HashMap I;
    public MutableIntObjectMap J;

    /* renamed from: z  reason: collision with root package name */
    public int[] f14858z = new int[0];

    public final int A() {
        return this.G;
    }

    public final boolean B() {
        return this.F;
    }

    public final boolean C(int i2, Anchor anchor) {
        if (this.F) {
            ComposerKt.v("Writer is active");
        }
        if (!(i2 >= 0 && i2 < this.f14856A)) {
            ComposerKt.v("Invalid group index");
        }
        if (J(anchor)) {
            int c2 = SlotTableKt.o(this.f14858z, i2) + i2;
            int a2 = anchor.a();
            if (i2 <= a2 && a2 < c2) {
                return true;
            }
        }
        return false;
    }

    public final boolean D(Anchor anchor, Anchor anchor2) {
        int a2 = anchor.a();
        int c2 = SlotTableKt.o(this.f14858z, a2) + a2;
        int a3 = anchor2.a();
        return a2 <= a3 && a3 < c2;
    }

    public final SlotReader E() {
        if (!this.F) {
            this.D++;
            return new SlotReader(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending");
    }

    public final SlotWriter F() {
        if (this.F) {
            ComposerKt.v("Cannot start a writer when another writer is pending");
        }
        if (!(this.D <= 0)) {
            ComposerKt.v("Cannot start a writer when a reader is pending");
        }
        this.F = true;
        this.G++;
        return new SlotWriter(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.compose.runtime.SlotTableKt.g(r3.H, r4.a(), r3.f14856A);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J(androidx.compose.runtime.Anchor r4) {
        /*
            r3 = this;
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0022
            java.util.ArrayList r0 = r3.H
            int r1 = r4.a()
            int r2 = r3.f14856A
            int r0 = androidx.compose.runtime.SlotTableKt.s(r0, r1, r2)
            if (r0 < 0) goto L_0x0022
            java.util.ArrayList r1 = r3.H
            java.lang.Object r0 = r1.get(r0)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r0, r4)
            if (r4 == 0) goto L_0x0022
            r4 = 1
            goto L_0x0023
        L_0x0022:
            r4 = 0
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotTable.J(androidx.compose.runtime.Anchor):boolean");
    }

    public final void K(int[] iArr, int i2, Object[] objArr, int i3, ArrayList arrayList, HashMap hashMap, MutableIntObjectMap mutableIntObjectMap) {
        this.f14858z = iArr;
        this.f14856A = i2;
        this.f14857B = objArr;
        this.C = i3;
        this.H = arrayList;
        this.I = hashMap;
        this.J = mutableIntObjectMap;
    }

    public final Object L(int i2, int i3) {
        int h2 = SlotTableKt.t(this.f14858z, i2);
        int i4 = i2 + 1;
        return (i3 < 0 || i3 >= (i4 < this.f14856A ? this.f14858z[(i4 * 5) + 4] : this.f14857B.length) - h2) ? Composer.f14567a.a() : this.f14857B[h2 + i3];
    }

    public final GroupSourceInformation M(int i2) {
        Anchor O;
        HashMap hashMap = this.I;
        if (hashMap == null || (O = O(i2)) == null) {
            return null;
        }
        return (GroupSourceInformation) hashMap.get(O);
    }

    public final Anchor O(int i2) {
        int i3;
        if (this.F) {
            ComposerKt.v("use active SlotWriter to crate an anchor for location instead");
        }
        if (i2 < 0 || i2 >= (i3 = this.f14856A)) {
            return null;
        }
        return SlotTableKt.n(this.H, i2, i3);
    }

    public final Anchor e(int i2) {
        if (this.F) {
            ComposerKt.v("use active SlotWriter to create an anchor location instead");
        }
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.f14856A) {
            z2 = true;
        }
        if (!z2) {
            PreconditionsKt.a("Parameter index is out of range");
        }
        ArrayList arrayList = this.H;
        int g2 = SlotTableKt.s(arrayList, i2, this.f14856A);
        if (g2 >= 0) {
            return (Anchor) arrayList.get(g2);
        }
        Anchor anchor = new Anchor(i2);
        arrayList.add(-(g2 + 1), anchor);
        return anchor;
    }

    public final int g(Anchor anchor) {
        if (this.F) {
            ComposerKt.v("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.b()) {
            PreconditionsKt.a("Anchor refers to a group that was removed");
        }
        return anchor.a();
    }

    public final void h(SlotReader slotReader, HashMap hashMap) {
        if (!(slotReader.z() == this && this.D > 0)) {
            ComposerKt.v("Unexpected reader close()");
        }
        this.D--;
        if (hashMap != null) {
            synchronized (this.E) {
                try {
                    HashMap hashMap2 = this.I;
                    if (hashMap2 != null) {
                        hashMap2.putAll(hashMap);
                    } else {
                        this.I = hashMap;
                    }
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void i(SlotWriter slotWriter, int[] iArr, int i2, Object[] objArr, int i3, ArrayList arrayList, HashMap hashMap, MutableIntObjectMap mutableIntObjectMap) {
        if (!(slotWriter.f0() == this && this.F)) {
            PreconditionsKt.a("Unexpected writer close()");
        }
        this.F = false;
        K(iArr, i2, objArr, i3, arrayList, hashMap, mutableIntObjectMap);
    }

    public boolean isEmpty() {
        return this.f14856A == 0;
    }

    public Iterator iterator() {
        return new GroupIterator(this, 0, this.f14856A);
    }

    public final void m() {
        this.J = new MutableIntObjectMap(0, 1, (DefaultConstructorMarker) null);
    }

    public final void n() {
        this.I = new HashMap();
    }

    public final boolean o() {
        return this.f14856A > 0 && (this.f14858z[1] & 67108864) != 0;
    }

    public final ArrayList p() {
        return this.H;
    }

    public final MutableIntObjectMap q() {
        return this.J;
    }

    public final int[] s() {
        return this.f14858z;
    }

    public final int u() {
        return this.f14856A;
    }

    public final Object[] v() {
        return this.f14857B;
    }

    public final int w() {
        return this.C;
    }

    public final HashMap z() {
        return this.I;
    }
}
