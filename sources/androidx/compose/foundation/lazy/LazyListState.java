package androidx.compose.foundation.lazy;

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
import kotlin.ranges.IntRange;

@Metadata
public final class LazyListState implements ScrollableState {

    /* renamed from: x  reason: collision with root package name */
    public static final Companion f4463x = new Companion((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    public static final Saver f4464y = ListSaverKt.b(LazyListState$Companion$Saver$1.f4488z, LazyListState$Companion$Saver$2.f4489z);

    /* renamed from: a  reason: collision with root package name */
    public final LazyListPrefetchStrategy f4465a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4466b;

    /* renamed from: c  reason: collision with root package name */
    public LazyListMeasureResult f4467c;

    /* renamed from: d  reason: collision with root package name */
    public final LazyListScrollPosition f4468d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f4469e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableInteractionSource f4470f;

    /* renamed from: g  reason: collision with root package name */
    public float f4471g;

    /* renamed from: h  reason: collision with root package name */
    public final ScrollableState f4472h;

    /* renamed from: i  reason: collision with root package name */
    public int f4473i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4474j;

    /* renamed from: k  reason: collision with root package name */
    public Remeasurement f4475k;

    /* renamed from: l  reason: collision with root package name */
    public final RemeasurementModifier f4476l;

    /* renamed from: m  reason: collision with root package name */
    public final AwaitFirstLayoutModifier f4477m;

    /* renamed from: n  reason: collision with root package name */
    public final LazyLayoutItemAnimator f4478n;

    /* renamed from: o  reason: collision with root package name */
    public final LazyLayoutBeyondBoundsInfo f4479o;

    /* renamed from: p  reason: collision with root package name */
    public final LazyLayoutPrefetchState f4480p;

    /* renamed from: q  reason: collision with root package name */
    public final LazyListPrefetchScope f4481q;

    /* renamed from: r  reason: collision with root package name */
    public final LazyLayoutPinnedItemList f4482r;

    /* renamed from: s  reason: collision with root package name */
    public final MutableState f4483s;

    /* renamed from: t  reason: collision with root package name */
    public final MutableState f4484t;

    /* renamed from: u  reason: collision with root package name */
    public final MutableState f4485u;

    /* renamed from: v  reason: collision with root package name */
    public final MutableState f4486v;

    /* renamed from: w  reason: collision with root package name */
    public final LazyLayoutScrollDeltaBetweenPasses f4487w;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return LazyListState.f4464y;
        }

        public Companion() {
        }
    }

    public LazyListState(int i2, int i3, LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        this.f4465a = lazyListPrefetchStrategy;
        LazyListScrollPosition lazyListScrollPosition = new LazyListScrollPosition(i2, i3);
        this.f4468d = lazyListScrollPosition;
        this.f4469e = SnapshotStateKt.i(LazyListStateKt.f4497a, SnapshotStateKt.k());
        this.f4470f = InteractionSourceKt.a();
        this.f4472h = ScrollableStateKt.a(new LazyListState$scrollableState$1(this));
        this.f4474j = true;
        this.f4476l = new LazyListState$remeasurementModifier$1(this);
        this.f4477m = new AwaitFirstLayoutModifier();
        this.f4478n = new LazyLayoutItemAnimator();
        this.f4479o = new LazyLayoutBeyondBoundsInfo();
        this.f4480p = new LazyLayoutPrefetchState(lazyListPrefetchStrategy.b(), new LazyListState$prefetchState$1(this, i2));
        this.f4481q = new LazyListState$prefetchScope$1(this);
        this.f4482r = new LazyLayoutPinnedItemList();
        lazyListScrollPosition.b();
        this.f4483s = ObservableScopeInvalidator.c((MutableState) null, 1, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.FALSE;
        this.f4484t = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f4485u = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f4486v = ObservableScopeInvalidator.c((MutableState) null, 1, (DefaultConstructorMarker) null);
        this.f4487w = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public static /* synthetic */ Object J(LazyListState lazyListState, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyListState.I(i2, i3, continuation);
    }

    public static /* synthetic */ Object l(LazyListState lazyListState, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyListState.k(i2, i3, continuation);
    }

    public static /* synthetic */ void n(LazyListState lazyListState, LazyListMeasureResult lazyListMeasureResult, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        lazyListState.m(lazyListMeasureResult, z2, z3);
    }

    public final LazyLayoutPinnedItemList A() {
        return this.f4482r;
    }

    public final MutableState B() {
        return this.f4486v;
    }

    public final LazyLayoutPrefetchState C() {
        return this.f4480p;
    }

    public final RemeasurementModifier D() {
        return this.f4476l;
    }

    public final float E() {
        return this.f4487w.b();
    }

    public final float F() {
        return this.f4471g;
    }

    public final void G(float f2, LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.f4474j) {
            this.f4465a.c(this.f4481q, f2, lazyListLayoutInfo);
        }
    }

    public final float H(float f2) {
        LazyListMeasureResult lazyListMeasureResult;
        if ((f2 < 0.0f && !f()) || (f2 > 0.0f && !d())) {
            return 0.0f;
        }
        if (!(Math.abs(this.f4471g) <= 0.5f)) {
            InlineClassHelperKt.c("entered drag with non-zero pending scroll");
        }
        float f3 = this.f4471g + f2;
        this.f4471g = f3;
        if (Math.abs(f3) > 0.5f) {
            float f4 = this.f4471g;
            int round = Math.round(f4);
            LazyListMeasureResult l2 = ((LazyListMeasureResult) this.f4469e.getValue()).l(round, !this.f4466b);
            if (!(l2 == null || (lazyListMeasureResult = this.f4467c) == null)) {
                LazyListMeasureResult l3 = lazyListMeasureResult != null ? lazyListMeasureResult.l(round, true) : null;
                if (l3 != null) {
                    this.f4467c = l3;
                } else {
                    l2 = null;
                }
            }
            if (l2 != null) {
                m(l2, this.f4466b, true);
                ObservableScopeInvalidator.f(this.f4486v);
                G(f4 - this.f4471g, l2);
            } else {
                Remeasurement remeasurement = this.f4475k;
                if (remeasurement != null) {
                    remeasurement.j();
                }
                G(f4 - this.f4471g, x());
            }
        }
        if (Math.abs(this.f4471g) <= 0.5f) {
            return f2;
        }
        float f5 = f2 - this.f4471g;
        this.f4471g = 0.0f;
        return f5;
    }

    public final Object I(int i2, int i3, Continuation continuation) {
        Object c2 = ScrollableState.c(this, (MutatePriority) null, new LazyListState$scrollToItem$2(this, i2, i3, (Continuation) null), continuation, 1, (Object) null);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public final void K(boolean z2) {
        this.f4485u.setValue(Boolean.valueOf(z2));
    }

    public final void L(boolean z2) {
        this.f4484t.setValue(Boolean.valueOf(z2));
    }

    public final void M(int i2, int i3, boolean z2) {
        if (!(this.f4468d.a() == i2 && this.f4468d.c() == i3)) {
            this.f4478n.p();
        }
        this.f4468d.d(i2, i3);
        if (z2) {
            Remeasurement remeasurement = this.f4475k;
            if (remeasurement != null) {
                remeasurement.j();
                return;
            }
            return;
        }
        ObservableScopeInvalidator.f(this.f4483s);
    }

    public final int N(LazyListItemProvider lazyListItemProvider, int i2) {
        return this.f4468d.j(lazyListItemProvider, i2);
    }

    public boolean a() {
        return this.f4472h.a();
    }

    public float b(float f2) {
        return this.f4472h.b(f2);
    }

    public boolean d() {
        return ((Boolean) this.f4485u.getValue()).booleanValue();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
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
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            kotlin.ResultKt.b(r8)
            goto L_0x005a
        L_0x0045:
            kotlin.ResultKt.b(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.f4477m
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
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.f4472h
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.e(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean f() {
        return ((Boolean) this.f4484t.getValue()).booleanValue();
    }

    public final Object k(int i2, int i3, Continuation continuation) {
        Object c2 = ScrollableState.c(this, (MutatePriority) null, new LazyListState$animateScrollToItem$2(this, i2, i3, (Continuation) null), continuation, 1, (Object) null);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public final void m(LazyListMeasureResult lazyListMeasureResult, boolean z2, boolean z3) {
        if (z2 || !this.f4466b) {
            if (z2) {
                this.f4466b = true;
            }
            K(lazyListMeasureResult.m());
            L(lazyListMeasureResult.n());
            this.f4471g -= lazyListMeasureResult.p();
            this.f4469e.setValue(lazyListMeasureResult);
            if (z3) {
                this.f4468d.i(lazyListMeasureResult.w());
            } else {
                this.f4468d.h(lazyListMeasureResult);
                if (this.f4474j) {
                    this.f4465a.d(this.f4481q, lazyListMeasureResult);
                }
            }
            if (z2) {
                this.f4487w.c(lazyListMeasureResult.y(), lazyListMeasureResult.u(), lazyListMeasureResult.t());
            }
            this.f4473i++;
            return;
        }
        this.f4467c = lazyListMeasureResult;
    }

    public final LazyListMeasureResult o() {
        return this.f4467c;
    }

    public final AwaitFirstLayoutModifier p() {
        return this.f4477m;
    }

    public final LazyLayoutBeyondBoundsInfo q() {
        return this.f4479o;
    }

    public final Density r() {
        return ((LazyListMeasureResult) this.f4469e.getValue()).u();
    }

    public final int s() {
        return this.f4468d.a();
    }

    public final int t() {
        return this.f4468d.c();
    }

    public final boolean u() {
        return this.f4466b;
    }

    public final MutableInteractionSource v() {
        return this.f4470f;
    }

    public final LazyLayoutItemAnimator w() {
        return this.f4478n;
    }

    public final LazyListLayoutInfo x() {
        return (LazyListLayoutInfo) this.f4469e.getValue();
    }

    public final MutableState y() {
        return this.f4483s;
    }

    public final IntRange z() {
        return (IntRange) this.f4468d.b().getValue();
    }

    public LazyListState(int i2, int i3) {
        this(i2, i3, LazyListPrefetchStrategyKt.b(0, 1, (Object) null));
    }
}
