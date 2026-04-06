package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Orientation f5314A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f5315B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ float D;
    public final /* synthetic */ PageSize E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Alignment.Vertical H;
    public final /* synthetic */ Alignment.Horizontal I;
    public final /* synthetic */ int J;
    public final /* synthetic */ SnapPosition K;
    public final /* synthetic */ CoroutineScope L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f5316z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(PagerState pagerState, Orientation orientation, PaddingValues paddingValues, boolean z2, float f2, PageSize pageSize, Function0 function0, Function0 function02, Alignment.Vertical vertical, Alignment.Horizontal horizontal, int i2, SnapPosition snapPosition, CoroutineScope coroutineScope) {
        super(2);
        this.f5316z = pagerState;
        this.f5314A = orientation;
        this.f5315B = paddingValues;
        this.C = z2;
        this.D = f2;
        this.E = pageSize;
        this.F = function0;
        this.G = function02;
        this.H = vertical;
        this.I = horizontal;
        this.J = i2;
        this.K = snapPosition;
        this.L = coroutineScope;
    }

    /* JADX INFO: finally extract failed */
    public final PagerMeasureResult b(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2) {
        Orientation orientation;
        long j3;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        long j4 = j2;
        ObservableScopeInvalidator.a(this.f5316z.E());
        Orientation orientation2 = this.f5314A;
        Orientation orientation3 = Orientation.Vertical;
        boolean z2 = orientation2 == orientation3;
        CheckScrollableContainerConstraintsKt.a(j4, z2 ? orientation3 : Orientation.Horizontal);
        int P1 = z2 ? lazyLayoutMeasureScope2.P1(this.f5315B.b(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope2.P1(PaddingKt.g(this.f5315B, lazyLayoutMeasureScope.getLayoutDirection()));
        int P12 = z2 ? lazyLayoutMeasureScope2.P1(this.f5315B.c(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope2.P1(PaddingKt.f(this.f5315B, lazyLayoutMeasureScope.getLayoutDirection()));
        int P13 = lazyLayoutMeasureScope2.P1(this.f5315B.d());
        int P14 = lazyLayoutMeasureScope2.P1(this.f5315B.a());
        int i2 = P13 + P14;
        int i3 = P1 + P12;
        int i4 = z2 ? i2 : i3;
        int i5 = (!z2 || this.C) ? (!z2 || !this.C) ? (z2 || this.C) ? P12 : P1 : P14 : P13;
        int i6 = i4 - i5;
        long i7 = ConstraintsKt.i(j4, -i3, -i2);
        this.f5316z.g0(lazyLayoutMeasureScope2);
        int P15 = lazyLayoutMeasureScope2.P1(this.D);
        int k2 = z2 ? Constraints.k(j2) - i2 : Constraints.l(j2) - i3;
        if (!this.C || k2 > 0) {
            orientation = orientation3;
            j3 = IntOffset.f((((long) P1) << 32) | (((long) P13) & 4294967295L));
        } else {
            if (!z2) {
                P1 += k2;
            }
            if (z2) {
                P13 += k2;
            }
            orientation = orientation3;
            j3 = IntOffset.f((((long) P13) & 4294967295L) | (((long) P1) << 32));
        }
        long j5 = j3;
        int e2 = RangesKt.e(this.E.a(lazyLayoutMeasureScope2, k2, P15), 0);
        Orientation orientation4 = orientation;
        this.f5316z.h0(ConstraintsKt.b(0, this.f5314A == orientation4 ? Constraints.l(i7) : e2, 0, this.f5314A != orientation4 ? Constraints.k(i7) : e2, 5, (Object) null));
        PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = (PagerLazyLayoutItemProvider) this.F.invoke();
        int i8 = k2 + i5 + i6;
        Snapshot.Companion companion = Snapshot.f15255e;
        PagerState pagerState = this.f5316z;
        SnapPosition snapPosition = this.K;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            int W = pagerState.W(pagerLazyLayoutItemProvider, pagerState.v());
            int g3 = PagerKt.g(snapPosition, i8, e2, P15, i5, i6, pagerState.v(), pagerState.w(), pagerState.H());
            Unit unit = Unit.f40552a;
            companion.m(d2, f2, g2);
            List a2 = LazyLayoutBeyondBoundsStateKt.a(pagerLazyLayoutItemProvider, this.f5316z.L(), this.f5316z.u());
            int intValue = ((Number) this.G.invoke()).intValue();
            MutableState M = this.f5316z.M();
            Orientation orientation5 = this.f5314A;
            Alignment.Vertical vertical = this.H;
            Alignment.Horizontal horizontal = this.I;
            boolean z3 = this.C;
            int i9 = this.J;
            SnapPosition snapPosition2 = this.K;
            CoroutineScope coroutineScope = this.L;
            PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1 = r2;
            PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1 pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$12 = new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1(lazyLayoutMeasureScope, j2, i3, i2);
            PagerMeasureResult h2 = PagerMeasureKt.h(lazyLayoutMeasureScope, intValue, pagerLazyLayoutItemProvider, k2, i5, i6, P15, W, g3, i7, orientation5, vertical, horizontal, z3, j5, e2, i9, a2, snapPosition2, M, coroutineScope, pagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1);
            PagerState.p(this.f5316z, h2, lazyLayoutMeasureScope.w1(), false, 4, (Object) null);
            return h2;
        } catch (Throwable th) {
            companion.m(d2, f2, g2);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((LazyLayoutMeasureScope) obj, ((Constraints) obj2).r());
    }
}
