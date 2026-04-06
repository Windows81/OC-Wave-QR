package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public abstract class PagerState implements ScrollableState {

    /* renamed from: A  reason: collision with root package name */
    public final AwaitFirstLayoutModifier f5352A;

    /* renamed from: B  reason: collision with root package name */
    public final MutableState f5353B;
    public final RemeasurementModifier C;
    public long D;
    public final LazyLayoutPinnedItemList E;
    public final MutableState F;
    public final MutableState G;
    public final MutableState H;
    public final MutableState I;
    public final MutableState J;
    public final MutableState K;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5354a;

    /* renamed from: b  reason: collision with root package name */
    public PagerMeasureResult f5355b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f5356c;

    /* renamed from: d  reason: collision with root package name */
    public final PagerScrollPosition f5357d;

    /* renamed from: e  reason: collision with root package name */
    public int f5358e;

    /* renamed from: f  reason: collision with root package name */
    public int f5359f;

    /* renamed from: g  reason: collision with root package name */
    public long f5360g;

    /* renamed from: h  reason: collision with root package name */
    public long f5361h;

    /* renamed from: i  reason: collision with root package name */
    public float f5362i;

    /* renamed from: j  reason: collision with root package name */
    public float f5363j;

    /* renamed from: k  reason: collision with root package name */
    public final ScrollableState f5364k;

    /* renamed from: l  reason: collision with root package name */
    public int f5365l;

    /* renamed from: m  reason: collision with root package name */
    public int f5366m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5367n;

    /* renamed from: o  reason: collision with root package name */
    public int f5368o;

    /* renamed from: p  reason: collision with root package name */
    public LazyLayoutPrefetchState.PrefetchHandle f5369p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5370q;

    /* renamed from: r  reason: collision with root package name */
    public MutableState f5371r;

    /* renamed from: s  reason: collision with root package name */
    public Density f5372s;

    /* renamed from: t  reason: collision with root package name */
    public final MutableInteractionSource f5373t;

    /* renamed from: u  reason: collision with root package name */
    public final MutableIntState f5374u;

    /* renamed from: v  reason: collision with root package name */
    public final MutableIntState f5375v;

    /* renamed from: w  reason: collision with root package name */
    public final State f5376w;

    /* renamed from: x  reason: collision with root package name */
    public final State f5377x;

    /* renamed from: y  reason: collision with root package name */
    public final LazyLayoutPrefetchState f5378y;

    /* renamed from: z  reason: collision with root package name */
    public final LazyLayoutBeyondBoundsInfo f5379z;

    public PagerState(int i2, float f2, PrefetchScheduler prefetchScheduler) {
        double d2 = (double) f2;
        boolean z2 = false;
        if (-0.5d <= d2 && d2 <= 0.5d) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("currentPageOffsetFraction " + f2 + " is not within the range -0.5 to 0.5");
        }
        this.f5356c = SnapshotStateKt__SnapshotStateKt.e(Offset.d(Offset.f15855b.c()), (SnapshotMutationPolicy) null, 2, (Object) null);
        PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i2, f2, this);
        this.f5357d = pagerScrollPosition;
        this.f5358e = i2;
        this.f5360g = Long.MAX_VALUE;
        this.f5364k = ScrollableStateKt.a(new PagerState$scrollableState$1(this));
        this.f5367n = true;
        this.f5368o = -1;
        this.f5371r = SnapshotStateKt.i(PagerStateKt.j(), SnapshotStateKt.k());
        this.f5372s = PagerStateKt.f5388c;
        this.f5373t = InteractionSourceKt.a();
        this.f5374u = SnapshotIntStateKt.a(-1);
        this.f5375v = SnapshotIntStateKt.a(i2);
        this.f5376w = SnapshotStateKt.d(SnapshotStateKt.r(), new PagerState$settledPage$2(this));
        this.f5377x = SnapshotStateKt.d(SnapshotStateKt.r(), new PagerState$targetPage$2(this));
        this.f5378y = new LazyLayoutPrefetchState(prefetchScheduler, new PagerState$prefetchState$1(this));
        this.f5379z = new LazyLayoutBeyondBoundsInfo();
        this.f5352A = new AwaitFirstLayoutModifier();
        this.f5353B = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.C = new PagerState$remeasurementModifier$1(this);
        this.D = ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null);
        this.E = new LazyLayoutPinnedItemList();
        pagerScrollPosition.d();
        this.F = ObservableScopeInvalidator.c((MutableState) null, 1, (DefaultConstructorMarker) null);
        this.G = ObservableScopeInvalidator.c((MutableState) null, 1, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.FALSE;
        this.H = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.I = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.J = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.K = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public static /* synthetic */ void a0(PagerState pagerState, int i2, float f2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                f2 = 0.0f;
            }
            pagerState.Z(i2, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: androidx.compose.foundation.MutatePriority} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object b0(androidx.compose.foundation.pager.PagerState r5, androidx.compose.foundation.MutatePriority r6, kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerState$scroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState$scroll$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r5 = r0.C
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.ResultKt.b(r8)
            goto L_0x007b
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            java.lang.Object r5 = r0.E
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r5 = r0.D
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.C
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.ResultKt.b(r8)
            goto L_0x005c
        L_0x004a:
            kotlin.ResultKt.b(r8)
            r0.C = r5
            r0.D = r6
            r0.E = r7
            r0.H = r4
            java.lang.Object r8 = r5.q(r0)
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            boolean r8 = r5.a()
            if (r8 != 0) goto L_0x0069
            int r8 = r5.v()
            r5.k0(r8)
        L_0x0069:
            androidx.compose.foundation.gestures.ScrollableState r8 = r5.f5364k
            r0.C = r5
            r2 = 0
            r0.D = r2
            r0.E = r2
            r0.H = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r6 = -1
            r5.i0(r6)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.b0(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object d0(PagerState pagerState, int i2, float f2, Continuation continuation, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                f2 = 0.0f;
            }
            return pagerState.c0(i2, f2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
    }

    private final void e0(boolean z2) {
        this.I.setValue(Boolean.valueOf(z2));
    }

    private final void f0(boolean z2) {
        this.H.setValue(Boolean.valueOf(z2));
    }

    public static /* synthetic */ Object n(PagerState pagerState, int i2, float f2, AnimationSpec animationSpec, Continuation continuation, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                animationSpec = AnimationSpecKt.l(0.0f, 0.0f, (Object) null, 7, (Object) null);
            }
            return pagerState.m(i2, f2, animationSpec, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
    }

    public static /* synthetic */ void p(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z2, boolean z3, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z3 = false;
            }
            pagerState.o(pagerMeasureResult, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
    }

    public final MutableInteractionSource A() {
        return this.f5373t;
    }

    public boolean B() {
        return ((Boolean) this.J.getValue()).booleanValue();
    }

    public final PagerLayoutInfo C() {
        return (PagerLayoutInfo) this.f5371r.getValue();
    }

    public final long D() {
        return this.f5360g;
    }

    public final MutableState E() {
        return this.G;
    }

    public final long F() {
        return this.f5361h;
    }

    public final IntRange G() {
        return (IntRange) this.f5357d.d().getValue();
    }

    public abstract int H();

    public final int I() {
        return ((PagerMeasureResult) this.f5371r.getValue()).k();
    }

    public final int J() {
        return I() + K();
    }

    public final int K() {
        return ((PagerMeasureResult) this.f5371r.getValue()).l();
    }

    public final LazyLayoutPinnedItemList L() {
        return this.E;
    }

    public final MutableState M() {
        return this.F;
    }

    public final float N() {
        return Math.min(this.f5372s.B1(PagerStateKt.i()), ((float) I()) / 2.0f) / ((float) I());
    }

    public final LazyLayoutPrefetchState O() {
        return this.f5378y;
    }

    public final int P() {
        return this.f5374u.e();
    }

    public final Remeasurement Q() {
        return (Remeasurement) this.f5353B.getValue();
    }

    public final RemeasurementModifier R() {
        return this.C;
    }

    public final int S() {
        return this.f5375v.e();
    }

    public final long T() {
        return ((Offset) this.f5356c.getValue()).t();
    }

    public final boolean U(float f2) {
        if (C().e() != Orientation.Vertical ? Math.signum(f2) != Math.signum(-Float.intBitsToFloat((int) (T() >> 32))) : Math.signum(f2) != Math.signum(-Float.intBitsToFloat((int) (T() & 4294967295L)))) {
            return V();
        }
    }

    public final boolean V() {
        return ((int) Float.intBitsToFloat((int) (T() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (T() & 4294967295L))) == 0;
    }

    public final int W(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2) {
        return this.f5357d.e(pagerLazyLayoutItemProvider, i2);
    }

    public final void X(float f2, PagerLayoutInfo pagerLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (this.f5367n && !pagerLayoutInfo.i().isEmpty()) {
            boolean z2 = f2 > 0.0f;
            int index = z2 ? ((PageInfo) CollectionsKt.p0(pagerLayoutInfo.i())).getIndex() + pagerLayoutInfo.m() + 1 : (((PageInfo) CollectionsKt.e0(pagerLayoutInfo.i())).getIndex() - pagerLayoutInfo.m()) - 1;
            if (index >= 0 && index < H()) {
                if (index != this.f5368o) {
                    if (!(this.f5370q == z2 || (prefetchHandle3 = this.f5369p) == null)) {
                        prefetchHandle3.cancel();
                    }
                    this.f5370q = z2;
                    this.f5368o = index;
                    this.f5369p = this.f5378y.e(index, this.D);
                }
                if (z2) {
                    if (((float) ((((PageInfo) CollectionsKt.p0(pagerLayoutInfo.i())).f() + (pagerLayoutInfo.k() + pagerLayoutInfo.l())) - pagerLayoutInfo.g())) < f2 && (prefetchHandle2 = this.f5369p) != null) {
                        prefetchHandle2.a();
                    }
                } else if (((float) (pagerLayoutInfo.j() - ((PageInfo) CollectionsKt.e0(pagerLayoutInfo.i())).f())) < (-f2) && (prefetchHandle = this.f5369p) != null) {
                    prefetchHandle.a();
                }
            }
        }
    }

    public final float Y(float f2) {
        PagerMeasureResult pagerMeasureResult;
        long a2 = PagerScrollPositionKt.a(this);
        float f3 = this.f5362i + f2;
        long f4 = MathKt.f(f3);
        this.f5362i = f3 - ((float) f4);
        if (Math.abs(f2) < 1.0E-4f) {
            return f2;
        }
        long j2 = f4 + a2;
        long q2 = RangesKt.q(j2, this.f5361h, this.f5360g);
        int i2 = (j2 > q2 ? 1 : (j2 == q2 ? 0 : -1));
        boolean z2 = false;
        boolean z3 = i2 != 0;
        long j3 = q2 - a2;
        float f5 = (float) j3;
        this.f5363j = f5;
        if (Math.abs(j3) != 0) {
            this.J.setValue(Boolean.valueOf(f5 > 0.0f));
            MutableState mutableState = this.K;
            if (f5 < 0.0f) {
                z2 = true;
            }
            mutableState.setValue(Boolean.valueOf(z2));
        }
        int i3 = (int) j3;
        int i4 = -i3;
        PagerMeasureResult o2 = ((PagerMeasureResult) this.f5371r.getValue()).o(i4);
        if (!(o2 == null || (pagerMeasureResult = this.f5355b) == null)) {
            PagerMeasureResult o3 = pagerMeasureResult != null ? pagerMeasureResult.o(i4) : null;
            if (o3 != null) {
                this.f5355b = o3;
            } else {
                o2 = null;
            }
        }
        if (o2 != null) {
            o(o2, this.f5354a, true);
            ObservableScopeInvalidator.f(this.F);
            this.f5366m++;
        } else {
            this.f5357d.a(i3);
            Remeasurement Q = Q();
            if (Q != null) {
                Q.j();
            }
            this.f5365l++;
        }
        return (z3 ? Long.valueOf(j3) : Float.valueOf(f2)).floatValue();
    }

    public final void Z(int i2, float f2) {
        if (a()) {
            Job unused = BuildersKt__Builders_commonKt.d(((PagerMeasureResult) this.f5371r.getValue()).u(), (CoroutineContext) null, (CoroutineStart) null, new PagerState$requestScrollToPage$1(this, (Continuation) null), 3, (Object) null);
        }
        m0(i2, f2, false);
    }

    public boolean a() {
        return this.f5364k.a();
    }

    public float b(float f2) {
        return this.f5364k.b(f2);
    }

    public final Object c0(int i2, float f2, Continuation continuation) {
        Object c2 = ScrollableState.c(this, (MutatePriority) null, new PagerState$scrollToPage$2(this, f2, i2, (Continuation) null), continuation, 1, (Object) null);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public final boolean d() {
        return ((Boolean) this.I.getValue()).booleanValue();
    }

    public Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        return b0(this, mutatePriority, function2, continuation);
    }

    public final boolean f() {
        return ((Boolean) this.H.getValue()).booleanValue();
    }

    public final void g0(Density density) {
        this.f5372s = density;
    }

    public final void h0(long j2) {
        this.D = j2;
    }

    public final void i0(int i2) {
        this.f5374u.k(i2);
    }

    public final void j0(Remeasurement remeasurement) {
        this.f5353B.setValue(remeasurement);
    }

    public final void k0(int i2) {
        this.f5375v.k(i2);
    }

    public final void l0(long j2) {
        this.f5356c.setValue(Offset.d(j2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(int r12, float r13, androidx.compose.animation.core.AnimationSpec r14, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            if (r0 == 0) goto L_0x0014
            r0 = r15
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.I = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r0.<init>(r11, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r4.G
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.I
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r3) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            kotlin.ResultKt.b(r15)
            goto L_0x00c5
        L_0x002f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0037:
            float r13 = r4.F
            int r12 = r4.E
            java.lang.Object r14 = r4.D
            androidx.compose.animation.core.AnimationSpec r14 = (androidx.compose.animation.core.AnimationSpec) r14
            java.lang.Object r1 = r4.C
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            kotlin.ResultKt.b(r15)
        L_0x0046:
            r9 = r14
            goto L_0x0076
        L_0x0048:
            kotlin.ResultKt.b(r15)
            int r15 = r11.v()
            if (r12 != r15) goto L_0x005a
            float r15 = r11.w()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            int r15 = r11.H()
            if (r15 != 0) goto L_0x0063
        L_0x0060:
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x0063:
            r4.C = r11
            r4.D = r14
            r4.E = r12
            r4.F = r13
            r4.I = r3
            java.lang.Object r15 = r11.q(r4)
            if (r15 != r0) goto L_0x0074
            return r0
        L_0x0074:
            r1 = r11
            goto L_0x0046
        L_0x0076:
            double r14 = (double) r13
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            r6 = 0
            if (r5 > 0) goto L_0x0085
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 > 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r3 = r6
        L_0x0086:
            if (r3 != 0) goto L_0x00a1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "pageOffsetFraction "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            androidx.compose.foundation.internal.InlineClassHelperKt.a(r14)
        L_0x00a1:
            int r7 = r1.s(r12)
            int r12 = r1.J()
            float r12 = (float) r12
            float r8 = r13 * r12
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 r3 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3
            r10 = 0
            r5 = r3
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 0
            r4.C = r12
            r4.D = r12
            r4.I = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = androidx.compose.foundation.gestures.ScrollableState.c(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L_0x00c5
            return r0
        L_0x00c5:
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.m(int, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m0(int i2, float f2, boolean z2) {
        this.f5357d.f(i2, f2);
        if (z2) {
            Remeasurement Q = Q();
            if (Q != null) {
                Q.j();
                return;
            }
            return;
        }
        ObservableScopeInvalidator.f(this.G);
    }

    public final void n0(PagerMeasureResult pagerMeasureResult) {
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            if (Math.abs(this.f5363j) > 0.5f && this.f5367n && U(this.f5363j)) {
                X(this.f5363j, pagerMeasureResult);
            }
            Unit unit = Unit.f40552a;
            companion.m(d2, f2, g2);
        } catch (Throwable th) {
            companion.m(d2, f2, g2);
            throw th;
        }
    }

    public final void o(PagerMeasureResult pagerMeasureResult, boolean z2, boolean z3) {
        if (z2 || !this.f5354a) {
            if (z2) {
                this.f5354a = true;
            }
            if (z3) {
                this.f5357d.j(pagerMeasureResult.w());
            } else {
                this.f5357d.k(pagerMeasureResult);
                r(pagerMeasureResult);
            }
            this.f5371r.setValue(pagerMeasureResult);
            f0(pagerMeasureResult.t());
            e0(pagerMeasureResult.p());
            MeasuredPage x2 = pagerMeasureResult.x();
            if (x2 != null) {
                this.f5358e = x2.getIndex();
            }
            this.f5359f = pagerMeasureResult.y();
            n0(pagerMeasureResult);
            this.f5360g = PagerStateKt.g(pagerMeasureResult, H());
            this.f5361h = PagerStateKt.h(pagerMeasureResult, H());
            return;
        }
        this.f5355b = pagerMeasureResult;
    }

    public final void o0(ScrollScope scrollScope, int i2) {
        i0(s(i2));
    }

    public final Object q(Continuation continuation) {
        Object b2 = this.f5352A.b(continuation);
        return b2 == IntrinsicsKt.f() ? b2 : Unit.f40552a;
    }

    public final void r(PagerLayoutInfo pagerLayoutInfo) {
        if (this.f5368o != -1 && !pagerLayoutInfo.i().isEmpty()) {
            if (this.f5368o != (this.f5370q ? ((PageInfo) CollectionsKt.p0(pagerLayoutInfo.i())).getIndex() + pagerLayoutInfo.m() + 1 : (((PageInfo) CollectionsKt.e0(pagerLayoutInfo.i())).getIndex() - pagerLayoutInfo.m()) - 1)) {
                this.f5368o = -1;
                LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.f5369p;
                if (prefetchHandle != null) {
                    prefetchHandle.cancel();
                }
                this.f5369p = null;
            }
        }
    }

    public final int s(int i2) {
        if (H() > 0) {
            return RangesKt.o(i2, 0, H() - 1);
        }
        return 0;
    }

    public final AwaitFirstLayoutModifier t() {
        return this.f5352A;
    }

    public final LazyLayoutBeyondBoundsInfo u() {
        return this.f5379z;
    }

    public final int v() {
        return this.f5357d.b();
    }

    public final float w() {
        return this.f5357d.c();
    }

    public final Density x() {
        return this.f5372s;
    }

    public final int y() {
        return this.f5358e;
    }

    public final int z() {
        return this.f5359f;
    }

    public PagerState(int i2, float f2) {
        this(i2, f2, (PrefetchScheduler) null);
    }
}
