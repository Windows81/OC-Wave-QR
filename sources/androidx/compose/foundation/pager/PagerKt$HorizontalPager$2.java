package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PagerKt$HorizontalPager$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5274A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f5275B;
    public final /* synthetic */ PageSize C;
    public final /* synthetic */ int D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Alignment.Vertical F;
    public final /* synthetic */ TargetedFlingBehavior G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ Function1 J;
    public final /* synthetic */ NestedScrollConnection K;
    public final /* synthetic */ SnapPosition L;
    public final /* synthetic */ Function4 M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f5276z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerKt$HorizontalPager$2(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i2, float f2, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z2, boolean z3, Function1 function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, Function4 function4, int i3, int i4, int i5) {
        super(2);
        this.f5276z = pagerState;
        this.f5274A = modifier;
        this.f5275B = paddingValues;
        this.C = pageSize;
        this.D = i2;
        this.E = f2;
        this.F = vertical;
        this.G = targetedFlingBehavior;
        this.H = z2;
        this.I = z3;
        this.J = function1;
        this.K = nestedScrollConnection;
        this.L = snapPosition;
        this.M = function4;
        this.N = i3;
        this.O = i4;
        this.P = i5;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        PagerState pagerState = this.f5276z;
        PagerState pagerState2 = pagerState;
        PagerKt.b(pagerState2, this.f5274A, this.f5275B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, composer2, RecomposeScopeImplKt.a(this.N | 1), RecomposeScopeImplKt.a(this.O), this.P);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
