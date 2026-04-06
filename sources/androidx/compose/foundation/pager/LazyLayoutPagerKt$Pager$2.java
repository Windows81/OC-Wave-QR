package androidx.compose.foundation.pager;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.Orientation;
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
public final class LazyLayoutPagerKt$Pager$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PagerState f5230A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f5231B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Orientation D;
    public final /* synthetic */ TargetedFlingBehavior E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ OverscrollEffect G;
    public final /* synthetic */ int H;
    public final /* synthetic */ float I;
    public final /* synthetic */ PageSize J;
    public final /* synthetic */ NestedScrollConnection K;
    public final /* synthetic */ Function1 L;
    public final /* synthetic */ Alignment.Horizontal M;
    public final /* synthetic */ Alignment.Vertical N;
    public final /* synthetic */ SnapPosition O;
    public final /* synthetic */ Function4 P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f5232z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$Pager$2(Modifier modifier, PagerState pagerState, PaddingValues paddingValues, boolean z2, Orientation orientation, TargetedFlingBehavior targetedFlingBehavior, boolean z3, OverscrollEffect overscrollEffect, int i2, float f2, PageSize pageSize, NestedScrollConnection nestedScrollConnection, Function1 function1, Alignment.Horizontal horizontal, Alignment.Vertical vertical, SnapPosition snapPosition, Function4 function4, int i3, int i4, int i5) {
        super(2);
        this.f5232z = modifier;
        this.f5230A = pagerState;
        this.f5231B = paddingValues;
        this.C = z2;
        this.D = orientation;
        this.E = targetedFlingBehavior;
        this.F = z3;
        this.G = overscrollEffect;
        this.H = i2;
        this.I = f2;
        this.J = pageSize;
        this.K = nestedScrollConnection;
        this.L = function1;
        this.M = horizontal;
        this.N = vertical;
        this.O = snapPosition;
        this.P = function4;
        this.Q = i3;
        this.R = i4;
        this.S = i5;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        Modifier modifier = this.f5232z;
        Modifier modifier2 = modifier;
        LazyLayoutPagerKt.a(modifier2, this.f5230A, this.f5231B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, composer2, RecomposeScopeImplKt.a(this.Q | 1), RecomposeScopeImplKt.a(this.R), this.S);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
