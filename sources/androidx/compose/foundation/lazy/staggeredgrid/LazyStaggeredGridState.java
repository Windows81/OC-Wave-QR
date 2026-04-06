package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;

@Metadata
public final class LazyStaggeredGridState implements ScrollableState {

    /* renamed from: y  reason: collision with root package name */
    public static final Companion f5185y = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public static final Saver f5186z = ListSaverKt.b(LazyStaggeredGridState$Companion$Saver$1.f5211z, LazyStaggeredGridState$Companion$Saver$2.f5212z);

    /* renamed from: a  reason: collision with root package name */
    public boolean f5187a;

    /* renamed from: b  reason: collision with root package name */
    public LazyStaggeredGridMeasureResult f5188b;

    /* renamed from: c  reason: collision with root package name */
    public final LazyStaggeredGridScrollPosition f5189c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f5190d;

    /* renamed from: e  reason: collision with root package name */
    public final LazyStaggeredGridLaneInfo f5191e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableState f5192f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f5193g;

    /* renamed from: h  reason: collision with root package name */
    public Remeasurement f5194h;

    /* renamed from: i  reason: collision with root package name */
    public final RemeasurementModifier f5195i;

    /* renamed from: j  reason: collision with root package name */
    public final AwaitFirstLayoutModifier f5196j;

    /* renamed from: k  reason: collision with root package name */
    public final LazyLayoutBeyondBoundsInfo f5197k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5198l;

    /* renamed from: m  reason: collision with root package name */
    public final LazyLayoutPrefetchState f5199m;

    /* renamed from: n  reason: collision with root package name */
    public final ScrollableState f5200n;

    /* renamed from: o  reason: collision with root package name */
    public float f5201o;

    /* renamed from: p  reason: collision with root package name */
    public int f5202p;

    /* renamed from: q  reason: collision with root package name */
    public int f5203q;

    /* renamed from: r  reason: collision with root package name */
    public final Map f5204r;

    /* renamed from: s  reason: collision with root package name */
    public final MutableInteractionSource f5205s;

    /* renamed from: t  reason: collision with root package name */
    public final LazyLayoutPinnedItemList f5206t;

    /* renamed from: u  reason: collision with root package name */
    public final LazyLayoutItemAnimator f5207u;

    /* renamed from: v  reason: collision with root package name */
    public final MutableState f5208v;

    /* renamed from: w  reason: collision with root package name */
    public final MutableState f5209w;

    /* renamed from: x  reason: collision with root package name */
    public final LazyLayoutScrollDeltaBetweenPasses f5210x;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return LazyStaggeredGridState.f5186z;
        }

        public Companion() {
        }
    }

    public LazyStaggeredGridState(int[] iArr, int[] iArr2, PrefetchScheduler prefetchScheduler) {
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.f5189c = lazyStaggeredGridScrollPosition;
        this.f5190d = SnapshotStateKt.i(LazyStaggeredGridMeasureResultKt.b(), SnapshotStateKt.k());
        this.f5191e = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.f5192f = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5193g = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f5195i = new LazyStaggeredGridState$remeasurementModifier$1(this);
        this.f5196j = new AwaitFirstLayoutModifier();
        this.f5197k = new LazyLayoutBeyondBoundsInfo();
        this.f5198l = true;
        this.f5199m = new LazyLayoutPrefetchState(prefetchScheduler, (Function1) null, 2, (DefaultConstructorMarker) null);
        this.f5200n = ScrollableStateKt.a(new LazyStaggeredGridState$scrollableState$1(this));
        this.f5203q = -1;
        this.f5204r = new LinkedHashMap();
        this.f5205s = InteractionSourceKt.a();
        this.f5206t = new LazyLayoutPinnedItemList();
        this.f5207u = new LazyLayoutItemAnimator();
        lazyStaggeredGridScrollPosition.e();
        this.f5208v = ObservableScopeInvalidator.c((MutableState) null, 1, (DefaultConstructorMarker) null);
        this.f5209w = ObservableScopeInvalidator.c((MutableState) null, 1, (DefaultConstructorMarker) null);
        this.f5210x = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public static /* synthetic */ void J(LazyStaggeredGridState lazyStaggeredGridState, float f2, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lazyStaggeredGridMeasureResult = (LazyStaggeredGridMeasureResult) lazyStaggeredGridState.f5190d.getValue();
        }
        lazyStaggeredGridState.I(f2, lazyStaggeredGridMeasureResult);
    }

    public static /* synthetic */ Object N(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyStaggeredGridState.M(i2, i3, continuation);
    }

    private void O(boolean z2) {
        this.f5193g.setValue(Boolean.valueOf(z2));
    }

    private void P(boolean z2) {
        this.f5192f.setValue(Boolean.valueOf(z2));
    }

    public static /* synthetic */ void l(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        lazyStaggeredGridState.k(lazyStaggeredGridMeasureResult, z2, z3);
    }

    public final MutableInteractionSource A() {
        return this.f5205s;
    }

    public final IntRange B() {
        return (IntRange) this.f5189c.e().getValue();
    }

    public final LazyLayoutPinnedItemList C() {
        return this.f5206t;
    }

    public final MutableState D() {
        return this.f5208v;
    }

    public final LazyLayoutPrefetchState E() {
        return this.f5199m;
    }

    public final RemeasurementModifier F() {
        return this.f5195i;
    }

    public final float G() {
        return this.f5210x.b();
    }

    public final LazyStaggeredGridScrollPosition H() {
        return this.f5189c;
    }

    public final void I(float f2, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        int i2;
        if (this.f5198l && !lazyStaggeredGridMeasureResult.k().isEmpty()) {
            boolean z2 = f2 < 0.0f;
            int index = z2 ? ((LazyStaggeredGridMeasuredItem) CollectionsKt.p0(lazyStaggeredGridMeasureResult.k())).getIndex() : ((LazyStaggeredGridMeasuredItem) CollectionsKt.e0(lazyStaggeredGridMeasureResult.k())).getIndex();
            if (index != this.f5203q) {
                this.f5203q = index;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LazyStaggeredGridSlots v2 = lazyStaggeredGridMeasureResult.v();
                int length = v2.b().length;
                for (int i3 = 0; i3 < length; i3++) {
                    index = z2 ? this.f5191e.e(index, i3) : this.f5191e.f(index, i3);
                    if (index < 0 || index >= lazyStaggeredGridMeasureResult.h() || linkedHashSet.contains(Integer.valueOf(index))) {
                        break;
                    }
                    linkedHashSet.add(Integer.valueOf(index));
                    if (!this.f5204r.containsKey(Integer.valueOf(index))) {
                        boolean a2 = lazyStaggeredGridMeasureResult.w().a(index);
                        int i4 = a2 ? 0 : i3;
                        int i5 = a2 ? length : 1;
                        if (i5 == 1) {
                            i2 = v2.b()[i4];
                        } else {
                            int i6 = v2.a()[i4];
                            int i7 = (i4 + i5) - 1;
                            i2 = (v2.a()[i7] + v2.b()[i7]) - i6;
                        }
                        this.f5204r.put(Integer.valueOf(index), this.f5199m.e(index, lazyStaggeredGridMeasureResult.e() == Orientation.Vertical ? Constraints.f19137b.e(i2) : Constraints.f19137b.d(i2)));
                    }
                }
                n(linkedHashSet);
            }
        }
    }

    public final float K(float f2) {
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult;
        if ((f2 < 0.0f && !f()) || (f2 > 0.0f && !d())) {
            return 0.0f;
        }
        if (!(Math.abs(this.f5201o) <= 0.5f)) {
            InlineClassHelperKt.c("entered drag with non-zero pending scroll");
        }
        float f3 = this.f5201o + f2;
        this.f5201o = f3;
        if (Math.abs(f3) > 0.5f) {
            float f4 = this.f5201o;
            int d2 = MathKt.d(f4);
            LazyStaggeredGridMeasureResult g2 = ((LazyStaggeredGridMeasureResult) this.f5190d.getValue()).g(d2, !this.f5187a);
            if (!(g2 == null || (lazyStaggeredGridMeasureResult = this.f5188b) == null)) {
                LazyStaggeredGridMeasureResult g3 = lazyStaggeredGridMeasureResult != null ? lazyStaggeredGridMeasureResult.g(d2, true) : null;
                if (g3 != null) {
                    this.f5188b = g3;
                } else {
                    g2 = null;
                }
            }
            if (g2 != null) {
                k(g2, this.f5187a, true);
                ObservableScopeInvalidator.f(this.f5208v);
                I(f4 - this.f5201o, g2);
            } else {
                Remeasurement remeasurement = this.f5194h;
                if (remeasurement != null) {
                    remeasurement.j();
                }
                J(this, f4 - this.f5201o, (LazyStaggeredGridMeasureResult) null, 2, (Object) null);
            }
        }
        if (Math.abs(this.f5201o) <= 0.5f) {
            return f2;
        }
        float f5 = f2 - this.f5201o;
        this.f5201o = 0.0f;
        return f5;
    }

    public final float L(boolean z2) {
        return (z2 || !this.f5187a) ? this.f5201o : G();
    }

    public final Object M(int i2, int i3, Continuation continuation) {
        Object c2 = ScrollableState.c(this, (MutatePriority) null, new LazyStaggeredGridState$scrollToItem$2(this, i2, i3, (Continuation) null), continuation, 1, (Object) null);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public final void Q(int i2, int i3, boolean z2) {
        boolean z3 = (this.f5189c.c() == i2 && this.f5189c.f() == i3) ? false : true;
        if (z3) {
            this.f5207u.p();
        }
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult = (LazyStaggeredGridMeasureResult) this.f5190d.getValue();
        LazyStaggeredGridItemInfo a2 = LazyStaggeredGridMeasureResultKt.a(lazyStaggeredGridMeasureResult, i2);
        if (a2 == null || !z3) {
            this.f5189c.h(i2, i3);
        } else {
            int l2 = (lazyStaggeredGridMeasureResult.e() == Orientation.Vertical ? IntOffset.l(a2.e()) : IntOffset.k(a2.e())) + i3;
            int length = lazyStaggeredGridMeasureResult.t().length;
            int[] iArr = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = lazyStaggeredGridMeasureResult.t()[i4] + l2;
            }
            this.f5189c.m(iArr);
        }
        if (z2) {
            Remeasurement remeasurement = this.f5194h;
            if (remeasurement != null) {
                remeasurement.j();
                return;
            }
            return;
        }
        ObservableScopeInvalidator.f(this.f5209w);
    }

    public final int[] R(LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr) {
        return this.f5189c.n(lazyLayoutItemProvider, iArr);
    }

    public boolean a() {
        return this.f5200n.a();
    }

    public float b(float f2) {
        return this.f5200n.b(f2);
    }

    public boolean d() {
        return ((Boolean) this.f5193g.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(androidx.compose.foundation.MutatePriority r6, kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r8)
            goto L_0x006c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.E
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r6 = r0.D
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.C
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r2
            kotlin.ResultKt.b(r8)
            goto L_0x005a
        L_0x0045:
            kotlin.ResultKt.b(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.f5196j
            r0.C = r5
            r0.D = r6
            r0.E = r7
            r0.H = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r5
        L_0x005a:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.f5200n
            r2 = 0
            r0.C = r2
            r0.D = r2
            r0.E = r2
            r0.H = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.e(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean f() {
        return ((Boolean) this.f5192f.getValue()).booleanValue();
    }

    public final void k(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z2, boolean z3) {
        if (z2 || !this.f5187a) {
            if (z2) {
                this.f5187a = true;
            }
            this.f5201o -= lazyStaggeredGridMeasureResult.m();
            this.f5190d.setValue(lazyStaggeredGridMeasureResult);
            if (z3) {
                this.f5189c.m(lazyStaggeredGridMeasureResult.t());
            } else {
                this.f5189c.l(lazyStaggeredGridMeasureResult);
                m(lazyStaggeredGridMeasureResult);
            }
            O(lazyStaggeredGridMeasureResult.j());
            P(lazyStaggeredGridMeasureResult.l());
            if (z2) {
                this.f5210x.c(lazyStaggeredGridMeasureResult.u(), lazyStaggeredGridMeasureResult.o(), lazyStaggeredGridMeasureResult.n());
            }
            this.f5202p++;
            return;
        }
        this.f5188b = lazyStaggeredGridMeasureResult;
    }

    public final void m(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List k2 = lazyStaggeredGridLayoutInfo.k();
        if (this.f5203q != -1 && !k2.isEmpty()) {
            int index = ((LazyStaggeredGridItemInfo) CollectionsKt.e0(k2)).getIndex();
            int index2 = ((LazyStaggeredGridItemInfo) CollectionsKt.p0(k2)).getIndex();
            int i2 = this.f5203q;
            if (index > i2 || i2 > index2) {
                this.f5203q = -1;
                for (LazyLayoutPrefetchState.PrefetchHandle cancel : this.f5204r.values()) {
                    cancel.cancel();
                }
                this.f5204r.clear();
            }
        }
    }

    public final void n(Set set) {
        Iterator it = this.f5204r.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!set.contains(entry.getKey())) {
                ((LazyLayoutPrefetchState.PrefetchHandle) entry.getValue()).cancel();
                it.remove();
            }
        }
    }

    public final int[] o(int i2, int i3) {
        int[] iArr = new int[i3];
        if (((LazyStaggeredGridMeasureResult) this.f5190d.getValue()).w().a(i2)) {
            ArraysKt.x(iArr, i2, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.f5191e.d(i2 + i3);
        int h2 = this.f5191e.h(i2);
        int i4 = 0;
        if (!(h2 == -2 || h2 == -1)) {
            if (h2 >= 0) {
                i4 = 1;
            }
            if (i4 == 0) {
                InlineClassHelperKt.a("Expected positive lane number, got " + h2 + " instead.");
            }
            i4 = Math.min(h2, i3);
        }
        int i5 = i4;
        int i6 = i5 - 1;
        int i7 = i2;
        while (true) {
            if (-1 >= i6) {
                break;
            }
            i7 = this.f5191e.f(i7, i6);
            iArr[i6] = i7;
            if (i7 == -1) {
                ArraysKt.x(iArr, -1, 0, i6, 2, (Object) null);
                break;
            }
            i6--;
        }
        iArr[i5] = i2;
        for (int i8 = i5 + 1; i8 < i3; i8++) {
            i2 = this.f5191e.e(i2, i8);
            iArr[i8] = i2;
        }
        return iArr;
    }

    public final LazyStaggeredGridMeasureResult p() {
        return this.f5188b;
    }

    public final AwaitFirstLayoutModifier q() {
        return this.f5196j;
    }

    public final LazyLayoutBeyondBoundsInfo r() {
        return this.f5197k;
    }

    public final int s() {
        return this.f5189c.c();
    }

    public final int t() {
        return this.f5189c.f();
    }

    public final boolean u() {
        return this.f5187a;
    }

    public final LazyLayoutItemAnimator v() {
        return this.f5207u;
    }

    public final int w() {
        return ((LazyStaggeredGridMeasureResult) this.f5190d.getValue()).v().b().length;
    }

    public final LazyStaggeredGridLaneInfo x() {
        return this.f5191e;
    }

    public final LazyStaggeredGridLayoutInfo y() {
        return (LazyStaggeredGridLayoutInfo) this.f5190d.getValue();
    }

    public final MutableState z() {
        return this.f5209w;
    }

    public LazyStaggeredGridState(int i2, int i3) {
        this(new int[]{i2}, new int[]{i3}, (PrefetchScheduler) null);
    }
}
