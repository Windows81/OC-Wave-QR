package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f14778h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f14779i = 8;

    /* renamed from: a  reason: collision with root package name */
    public RecomposeScopeOwner f14780a;

    /* renamed from: b  reason: collision with root package name */
    public int f14781b;

    /* renamed from: c  reason: collision with root package name */
    public Anchor f14782c;

    /* renamed from: d  reason: collision with root package name */
    public Function2 f14783d;

    /* renamed from: e  reason: collision with root package name */
    public int f14784e;

    /* renamed from: f  reason: collision with root package name */
    public MutableObjectIntMap f14785f;

    /* renamed from: g  reason: collision with root package name */
    public MutableScatterMap f14786g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(SlotWriter slotWriter, List list, RecomposeScopeOwner recomposeScopeOwner) {
            Collection collection = list;
            if (!collection.isEmpty()) {
                int size = collection.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object b1 = slotWriter.b1((Anchor) list.get(i2), 0);
                    RecomposeScopeImpl recomposeScopeImpl = b1 instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) b1 : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.c(recomposeScopeOwner);
                    }
                }
            }
        }

        public final boolean b(SlotTable slotTable, List list) {
            Collection collection = list;
            if (collection.isEmpty()) {
                return false;
            }
            int size = collection.size();
            for (int i2 = 0; i2 < size; i2++) {
                Anchor anchor = (Anchor) list.get(i2);
                if (slotTable.J(anchor) && (slotTable.L(slotTable.g(anchor), 0) instanceof RecomposeScopeImpl)) {
                    return true;
                }
            }
            return false;
        }

        public Companion() {
        }
    }

    public RecomposeScopeImpl(RecomposeScopeOwner recomposeScopeOwner) {
        this.f14780a = recomposeScopeOwner;
    }

    public static final Unit g(RecomposeScopeImpl recomposeScopeImpl, int i2, MutableObjectIntMap mutableObjectIntMap, Composition composition) {
        int i3;
        RecomposeScopeImpl recomposeScopeImpl2 = recomposeScopeImpl;
        int i4 = i2;
        MutableObjectIntMap mutableObjectIntMap2 = mutableObjectIntMap;
        Composition composition2 = composition;
        if (recomposeScopeImpl2.f14784e == i4 && Intrinsics.d(mutableObjectIntMap2, recomposeScopeImpl2.f14785f) && (composition2 instanceof CompositionImpl)) {
            long[] jArr = mutableObjectIntMap2.f1931a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr[i5];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                Object obj = mutableObjectIntMap2.f1932b[i9];
                                boolean z2 = mutableObjectIntMap2.f1933c[i9] != i4;
                                if (z2) {
                                    CompositionImpl compositionImpl = (CompositionImpl) composition2;
                                    compositionImpl.S(obj, recomposeScopeImpl2);
                                    if (obj instanceof DerivedState) {
                                        compositionImpl.R((DerivedState) obj);
                                        MutableScatterMap mutableScatterMap = recomposeScopeImpl2.f14786g;
                                        if (mutableScatterMap != null) {
                                            mutableScatterMap.u(obj);
                                        }
                                    }
                                }
                                if (z2) {
                                    mutableObjectIntMap2.s(i9);
                                }
                                i3 = 8;
                            } else {
                                i3 = i6;
                            }
                            j2 >>= i3;
                            i8++;
                            i6 = i3;
                        }
                        if (i7 != i6) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                }
            }
        }
        return Unit.f40552a;
    }

    public final void A() {
        RecomposeScopeOwner recomposeScopeOwner = this.f14780a;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.c(this);
        }
        this.f14780a = null;
        this.f14785f = null;
        this.f14786g = null;
        this.f14783d = null;
    }

    public final void B() {
        MutableObjectIntMap mutableObjectIntMap;
        RecomposeScopeOwner recomposeScopeOwner = this.f14780a;
        if (recomposeScopeOwner != null && (mutableObjectIntMap = this.f14785f) != null) {
            J(true);
            try {
                Object[] objArr = mutableObjectIntMap.f1932b;
                int[] iArr = mutableObjectIntMap.f1933c;
                long[] jArr = mutableObjectIntMap.f1931a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j2) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    int i6 = iArr[i5];
                                    recomposeScopeOwner.b(obj);
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            } finally {
                J(false);
            }
        }
    }

    public final void C() {
        if (!r()) {
            N(true);
        }
    }

    public final void D(Anchor anchor) {
        this.f14782c = anchor;
    }

    public final void E(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 2 : i2 & -3;
    }

    public final void F(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 4 : i2 & -5;
    }

    public final void G(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 64 : i2 & -65;
    }

    public final void H(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 256 : i2 & -257;
    }

    public final void I(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 8 : i2 & -9;
    }

    public final void J(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 32 : i2 & -33;
    }

    public final void K(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 1024 : i2 & -1025;
    }

    public final void L(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 512 : i2 & -513;
    }

    public final void M(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 128 : i2 & -129;
    }

    public final void N(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 16 : i2 & -17;
    }

    public final void O(boolean z2) {
        int i2 = this.f14781b;
        this.f14781b = z2 ? i2 | 1 : i2 & -2;
    }

    public final void P(int i2) {
        this.f14784e = i2;
        N(false);
    }

    public void a(Function2 function2) {
        this.f14783d = function2;
    }

    public final void c(RecomposeScopeOwner recomposeScopeOwner) {
        this.f14780a = recomposeScopeOwner;
    }

    public final boolean d(DerivedState derivedState, MutableScatterMap mutableScatterMap) {
        Intrinsics.g(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy d2 = derivedState.d();
        if (d2 == null) {
            d2 = SnapshotStateKt.r();
        }
        return !d2.a(derivedState.s().a(), mutableScatterMap.e(derivedState));
    }

    public final void e(Composer composer) {
        Function2 function2 = this.f14783d;
        if (function2 != null) {
            function2.m(composer, 1);
            return;
        }
        throw new IllegalStateException("Invalid restart scope");
    }

    public final Function1 f(int i2) {
        int i3 = i2;
        MutableObjectIntMap mutableObjectIntMap = this.f14785f;
        if (mutableObjectIntMap == null || s()) {
            return null;
        }
        Object[] objArr = mutableObjectIntMap.f1932b;
        int[] iArr = mutableObjectIntMap.f1933c;
        long[] jArr = mutableObjectIntMap.f1931a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i4 = 0;
        while (true) {
            long j2 = jArr[i4];
            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j2) < 128) {
                        int i7 = (i4 << 3) + i6;
                        Object obj = objArr[i7];
                        if (iArr[i7] != i3) {
                            return new p(this, i3, mutableObjectIntMap);
                        }
                    }
                    j2 >>= 8;
                }
                if (i5 != 8) {
                    return null;
                }
            }
            if (i4 == length) {
                return null;
            }
            i4++;
        }
    }

    public final Anchor h() {
        return this.f14782c;
    }

    public final boolean i() {
        return this.f14783d != null;
    }

    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.f14780a;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.a(this, (Object) null);
        }
    }

    public final boolean j() {
        return (this.f14781b & 2) != 0;
    }

    public final boolean k() {
        return (this.f14781b & 4) != 0;
    }

    public final boolean l() {
        return (this.f14781b & 64) != 0;
    }

    public final boolean m() {
        return (this.f14781b & 256) != 0;
    }

    public final boolean n() {
        return (this.f14781b & 8) != 0;
    }

    public final boolean o() {
        return (this.f14781b & 32) != 0;
    }

    public final boolean p() {
        return (this.f14781b & 1024) != 0;
    }

    public final boolean q() {
        return (this.f14781b & 512) != 0;
    }

    public final boolean r() {
        return (this.f14781b & 128) != 0;
    }

    public final boolean s() {
        return (this.f14781b & 16) != 0;
    }

    public final boolean t() {
        return (this.f14781b & 1) != 0;
    }

    public final boolean u() {
        if (this.f14780a == null) {
            return false;
        }
        Anchor anchor = this.f14782c;
        return anchor != null ? anchor.b() : false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r0.a(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.InvalidationResult v(java.lang.Object r2) {
        /*
            r1 = this;
            androidx.compose.runtime.RecomposeScopeOwner r0 = r1.f14780a
            if (r0 == 0) goto L_0x000a
            androidx.compose.runtime.InvalidationResult r2 = r0.a(r1, r2)
            if (r2 != 0) goto L_0x000c
        L_0x000a:
            androidx.compose.runtime.InvalidationResult r2 = androidx.compose.runtime.InvalidationResult.IGNORED
        L_0x000c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.v(java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    public final boolean w() {
        return this.f14786g != null;
    }

    public final boolean x(Object obj) {
        MutableScatterMap mutableScatterMap;
        Object obj2 = obj;
        if (obj2 == null || (mutableScatterMap = this.f14786g) == null) {
            return true;
        }
        if (obj2 instanceof DerivedState) {
            return d((DerivedState) obj2, mutableScatterMap);
        }
        if (!(obj2 instanceof ScatterSet)) {
            return true;
        }
        ScatterSet scatterSet = (ScatterSet) obj2;
        if (scatterSet.e()) {
            Object[] objArr = scatterSet.f1967b;
            long[] jArr = scatterSet.f1966a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                Object obj3 = objArr[(i2 << 3) + i4];
                                if (!(obj3 instanceof DerivedState) || d((DerivedState) obj3, mutableScatterMap)) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public final void y(DerivedState derivedState, Object obj) {
        MutableScatterMap mutableScatterMap = this.f14786g;
        if (mutableScatterMap == null) {
            mutableScatterMap = new MutableScatterMap(0, 1, (DefaultConstructorMarker) null);
            this.f14786g = mutableScatterMap;
        }
        mutableScatterMap.x(derivedState, obj);
    }

    public final boolean z(Object obj) {
        if (o()) {
            return false;
        }
        MutableObjectIntMap mutableObjectIntMap = this.f14785f;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new MutableObjectIntMap(0, 1, (DefaultConstructorMarker) null);
            this.f14785f = mutableObjectIntMap;
        }
        return mutableObjectIntMap.q(obj, this.f14784e, -1) == this.f14784e;
    }
}
