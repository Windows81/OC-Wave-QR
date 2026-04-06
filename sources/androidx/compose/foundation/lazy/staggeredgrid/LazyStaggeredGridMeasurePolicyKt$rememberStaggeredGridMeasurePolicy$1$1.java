package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Orientation f5111A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyGridStaggeredGridSlotsProvider f5112B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ PaddingValues D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ float F;
    public final /* synthetic */ CoroutineScope G;
    public final /* synthetic */ GraphicsContext H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5113z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Function0 function0, PaddingValues paddingValues, boolean z2, float f2, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        super(2);
        this.f5113z = lazyStaggeredGridState;
        this.f5111A = orientation;
        this.f5112B = lazyGridStaggeredGridSlotsProvider;
        this.C = function0;
        this.D = paddingValues;
        this.E = z2;
        this.F = f2;
        this.G = coroutineScope;
        this.H = graphicsContext;
    }

    public final LazyStaggeredGridMeasureResult b(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2) {
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        long j3 = j2;
        ObservableScopeInvalidator.a(this.f5113z.z());
        boolean z2 = this.f5113z.u() || lazyLayoutMeasureScope.w1();
        CheckScrollableContainerConstraintsKt.a(j3, this.f5111A);
        LazyStaggeredGridSlots a2 = this.f5112B.a(lazyLayoutMeasureScope2, j3);
        boolean z3 = this.f5111A == Orientation.Vertical;
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = (LazyStaggeredGridItemProvider) this.C.invoke();
        int P1 = lazyLayoutMeasureScope2.P1(LazyStaggeredGridMeasurePolicyKt.e(this.D, this.f5111A, this.E, lazyLayoutMeasureScope.getLayoutDirection()));
        int P12 = lazyLayoutMeasureScope2.P1(LazyStaggeredGridMeasurePolicyKt.d(this.D, this.f5111A, this.E, lazyLayoutMeasureScope.getLayoutDirection()));
        int P13 = lazyLayoutMeasureScope2.P1(LazyStaggeredGridMeasurePolicyKt.g(this.D, this.f5111A, lazyLayoutMeasureScope.getLayoutDirection()));
        int k2 = ((z3 ? Constraints.k(j2) : Constraints.l(j2)) - P1) - P12;
        long f2 = z3 ? IntOffset.f((((long) P1) & 4294967295L) | (((long) P13) << 32)) : IntOffset.f((((long) P13) & 4294967295L) | (((long) P1) << 32));
        PaddingValues paddingValues = this.D;
        int P14 = lazyLayoutMeasureScope2.P1(Dp.m(PaddingKt.g(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.f(paddingValues, lazyLayoutMeasureScope.getLayoutDirection())));
        PaddingValues paddingValues2 = this.D;
        LazyStaggeredGridMeasureResult k3 = LazyStaggeredGridMeasureKt.k(lazyLayoutMeasureScope, this.f5113z, LazyLayoutBeyondBoundsStateKt.a(lazyStaggeredGridItemProvider, this.f5113z.C(), this.f5113z.r()), lazyStaggeredGridItemProvider, a2, Constraints.d(j2, ConstraintsKt.g(j3, P14), 0, ConstraintsKt.f(j3, lazyLayoutMeasureScope2.P1(Dp.m(paddingValues2.d() + paddingValues2.a()))), 0, 10, (Object) null), z3, this.E, f2, k2, lazyLayoutMeasureScope2.P1(this.F), P1, P12, this.G, z2, lazyLayoutMeasureScope.w1(), this.f5113z.p(), this.H);
        LazyStaggeredGridState.l(this.f5113z, k3, lazyLayoutMeasureScope.w1(), false, 4, (Object) null);
        return k3;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((LazyLayoutMeasureScope) obj, ((Constraints) obj2).r());
    }
}
