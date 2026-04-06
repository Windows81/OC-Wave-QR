package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridKt$LazyStaggeredGrid$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Orientation f5067A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyGridStaggeredGridSlotsProvider f5068B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ PaddingValues D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ FlingBehavior F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ OverscrollEffect H;
    public final /* synthetic */ float I;
    public final /* synthetic */ float J;
    public final /* synthetic */ Function1 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5069z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridKt$LazyStaggeredGrid$1(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Modifier modifier, PaddingValues paddingValues, boolean z2, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, float f2, float f3, Function1 function1, int i2, int i3, int i4) {
        super(2);
        this.f5069z = lazyStaggeredGridState;
        this.f5067A = orientation;
        this.f5068B = lazyGridStaggeredGridSlotsProvider;
        this.C = modifier;
        this.D = paddingValues;
        this.E = z2;
        this.F = flingBehavior;
        this.G = z3;
        this.H = overscrollEffect;
        this.I = f2;
        this.J = f3;
        this.K = function1;
        this.L = i2;
        this.M = i3;
        this.N = i4;
    }

    public final void b(Composer composer, int i2) {
        LazyStaggeredGridKt.a(this.f5069z, this.f5067A, this.f5068B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, composer, RecomposeScopeImplKt.a(this.L | 1), RecomposeScopeImplKt.a(this.M), this.N);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
