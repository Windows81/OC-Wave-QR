package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;

@Metadata
public final class LazyGridState implements ScrollableState {

    /* renamed from: x  reason: collision with root package name */
    public static final Companion f4721x = new Companion((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    public static final Saver f4722y = ListSaverKt.b(LazyGridState$Companion$Saver$1.f4746z, LazyGridState$Companion$Saver$2.f4747z);

    /* renamed from: a  reason: collision with root package name */
    public final LazyGridPrefetchStrategy f4723a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4724b;

    /* renamed from: c  reason: collision with root package name */
    public LazyGridMeasureResult f4725c;

    /* renamed from: d  reason: collision with root package name */
    public final LazyGridScrollPosition f4726d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f4727e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableInteractionSource f4728f;

    /* renamed from: g  reason: collision with root package name */
    public float f4729g;

    /* renamed from: h  reason: collision with root package name */
    public final ScrollableState f4730h;

    /* renamed from: i  reason: collision with root package name */
    public int f4731i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4732j;

    /* renamed from: k  reason: collision with root package name */
    public Remeasurement f4733k;

    /* renamed from: l  reason: collision with root package name */
    public final RemeasurementModifier f4734l;

    /* renamed from: m  reason: collision with root package name */
    public final AwaitFirstLayoutModifier f4735m;

    /* renamed from: n  reason: collision with root package name */
    public final LazyLayoutItemAnimator f4736n;

    /* renamed from: o  reason: collision with root package name */
    public final LazyLayoutBeyondBoundsInfo f4737o;

    /* renamed from: p  reason: collision with root package name */
    public final LazyLayoutPrefetchState f4738p;

    /* renamed from: q  reason: collision with root package name */
    public final LazyGridPrefetchScope f4739q;

    /* renamed from: r  reason: collision with root package name */
    public final LazyLayoutPinnedItemList f4740r;

    /* renamed from: s  reason: collision with root package name */
    public final MutableState f4741s;

    /* renamed from: t  reason: collision with root package name */
    public final MutableState f4742t;

    /* renamed from: u  reason: collision with root package name */
    public final MutableState f4743u;

    /* renamed from: v  reason: collision with root package name */
    public final MutableState f4744v;

    /* renamed from: w  reason: collision with root package name */
    public final LazyLayoutScrollDeltaBetweenPasses f4745w;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return LazyGridState.f4722y;
        }

        public Companion() {
        }
    }

    public LazyGridState(int i2, int i3, LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
        this.f4723a = lazyGridPrefetchStrategy;
        LazyGridScrollPosition lazyGridScrollPosition = new LazyGridScrollPosition(i2, i3);
        this.f4726d = lazyGridScrollPosition;
        this.f4727e = SnapshotStateKt.i(LazyGridStateKt.f4755a, SnapshotStateKt.k());
        this.f4728f = InteractionSourceKt.a();
        this.f4730h = ScrollableStateKt.a(new LazyGridState$scrollableState$1(this));
        this.f4732j = true;
        this.f4734l = new LazyGridState$remeasurementModifier$1(this);
        this.f4735m = new AwaitFirstLayoutModifier();
        this.f4736n = new LazyLayoutItemAnimator();
        this.f4737o = new LazyLayoutBeyondBoundsInfo();
        this.f4738p = new LazyLayoutPrefetchState(lazyGridPrefetchStrategy.b(), new LazyGridState$prefetchState$1(this, i2));
        this.f4739q = new LazyGridState$prefetchScope$1(this);
        this.f4740r = new LazyLayoutPinnedItemList();
        lazyGridScrollPosition.b();
        this.f4741s = ObservableScopeInvalidator.c((MutableState) null, 1, (DefaultConstructorMarker) null);
        this.f4742t = ObservableScopeInvalidator.c((MutableState) null, 1, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.FALSE;
        this.f4743u = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f4744v = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f4745w = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public static /* synthetic */ Object K(LazyGridState lazyGridState, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyGridState.J(i2, i3, continuation);
    }

    private void L(boolean z2) {
        this.f4744v.setValue(Boolean.valueOf(z2));
    }

    private void M(boolean z2) {
        this.f4743u.setValue(Boolean.valueOf(z2));
    }

    public static /* synthetic */ void m(LazyGridState lazyGridState, LazyGridMeasureResult lazyGridMeasureResult, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        lazyGridState.l(lazyGridMeasureResult, z2, z3);
    }

    public final LazyLayoutPinnedItemList A() {
        return this.f4740r;
    }

    public final MutableState B() {
        return this.f4741s;
    }

    public final LazyLayoutPrefetchState C() {
        return this.f4738p;
    }

    public final RemeasurementModifier D() {
        return this.f4734l;
    }

    public final float E() {
        return this.f4745w.b();
    }

    public final float F() {
        return this.f4729g;
    }

    public final int G() {
        return ((LazyGridMeasureResult) this.f4727e.getValue()).z();
    }

    public final void H(float f2, LazyGridLayoutInfo lazyGridLayoutInfo) {
        if (this.f4732j) {
            this.f4723a.d(this.f4739q, f2, lazyGridLayoutInfo);
        }
    }

    public final float I(float f2) {
        LazyGridMeasureResult lazyGridMeasureResult;
        if ((f2 < 0.0f && !f()) || (f2 > 0.0f && !d())) {
            return 0.0f;
        }
        if (!(Math.abs(this.f4729g) <= 0.5f)) {
            InlineClassHelperKt.c("entered drag with non-zero pending scroll");
        }
        float f3 = this.f4729g + f2;
        this.f4729g = f3;
        if (Math.abs(f3) > 0.5f) {
            float f4 = this.f4729g;
            int d2 = MathKt.d(f4);
            LazyGridMeasureResult l2 = ((LazyGridMeasureResult) this.f4727e.getValue()).l(d2, !this.f4724b);
            if (!(l2 == null || (lazyGridMeasureResult = this.f4725c) == null)) {
                LazyGridMeasureResult l3 = lazyGridMeasureResult != null ? lazyGridMeasureResult.l(d2, true) : null;
                if (l3 != null) {
                    this.f4725c = l3;
                } else {
                    l2 = null;
                }
            }
            if (l2 != null) {
                l(l2, this.f4724b, true);
                ObservableScopeInvalidator.f(this.f4741s);
                H(f4 - this.f4729g, l2);
            } else {
                Remeasurement remeasurement = this.f4733k;
                if (remeasurement != null) {
                    remeasurement.j();
                }
                H(f4 - this.f4729g, w());
            }
        }
        if (Math.abs(this.f4729g) <= 0.5f) {
            return f2;
        }
        float f5 = f2 - this.f4729g;
        this.f4729g = 0.0f;
        return f5;
    }

    public final Object J(int i2, int i3, Continuation continuation) {
        Object c2 = ScrollableState.c(this, (MutatePriority) null, new LazyGridState$scrollToItem$2(this, i2, i3, (Continuation) null), continuation, 1, (Object) null);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public final void N(int i2, int i3, boolean z2) {
        if (!(this.f4726d.a() == i2 && this.f4726d.c() == i3)) {
            this.f4736n.p();
        }
        this.f4726d.d(i2, i3);
        if (z2) {
            Remeasurement remeasurement = this.f4733k;
            if (remeasurement != null) {
                remeasurement.j();
                return;
            }
            return;
        }
        ObservableScopeInvalidator.f(this.f4742t);
    }

    public final int O(LazyGridItemProvider lazyGridItemProvider, int i2) {
        return this.f4726d.j(lazyGridItemProvider, i2);
    }

    public boolean a() {
        return this.f4730h.a();
    }

    public float b(float f2) {
        return this.f4730h.b(f2);
    }

    public boolean d() {
        return ((Boolean) this.f4744v.getValue()).booleanValue();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
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
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            kotlin.ResultKt.b(r8)
            goto L_0x005a
        L_0x0045:
            kotlin.ResultKt.b(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.f4735m
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
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.f4730h
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.e(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean f() {
        return ((Boolean) this.f4743u.getValue()).booleanValue();
    }

    public final void l(LazyGridMeasureResult lazyGridMeasureResult, boolean z2, boolean z3) {
        if (z2 || !this.f4724b) {
            if (z2) {
                this.f4724b = true;
            }
            this.f4729g -= lazyGridMeasureResult.o();
            this.f4727e.setValue(lazyGridMeasureResult);
            L(lazyGridMeasureResult.m());
            M(lazyGridMeasureResult.n());
            if (z3) {
                this.f4726d.i(lazyGridMeasureResult.v());
            } else {
                this.f4726d.h(lazyGridMeasureResult);
                if (this.f4732j) {
                    this.f4723a.c(this.f4739q, lazyGridMeasureResult);
                }
            }
            if (z2) {
                this.f4745w.c(lazyGridMeasureResult.y(), lazyGridMeasureResult.t(), lazyGridMeasureResult.p());
            }
            this.f4731i++;
            return;
        }
        this.f4725c = lazyGridMeasureResult;
    }

    public final LazyGridMeasureResult n() {
        return this.f4725c;
    }

    public final AwaitFirstLayoutModifier o() {
        return this.f4735m;
    }

    public final LazyLayoutBeyondBoundsInfo p() {
        return this.f4737o;
    }

    public final Density q() {
        return ((LazyGridMeasureResult) this.f4727e.getValue()).t();
    }

    public final int r() {
        return this.f4726d.a();
    }

    public final int s() {
        return this.f4726d.c();
    }

    public final boolean t() {
        return this.f4724b;
    }

    public final MutableInteractionSource u() {
        return this.f4728f;
    }

    public final LazyLayoutItemAnimator v() {
        return this.f4736n;
    }

    public final LazyGridLayoutInfo w() {
        return (LazyGridLayoutInfo) this.f4727e.getValue();
    }

    public final MutableState x() {
        return this.f4742t;
    }

    public final IntRange y() {
        return (IntRange) this.f4726d.b().getValue();
    }

    public final int z() {
        return G() * 100;
    }

    public LazyGridState(int i2, int i3) {
        this(i2, i3, LazyGridPrefetchStrategyKt.b(0, 1, (Object) null));
    }
}
