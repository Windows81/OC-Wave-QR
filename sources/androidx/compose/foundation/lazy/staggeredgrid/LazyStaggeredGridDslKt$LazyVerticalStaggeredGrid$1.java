package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
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
public final class LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5000A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5001B;
    public final /* synthetic */ PaddingValues C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Arrangement.Horizontal F;
    public final /* synthetic */ FlingBehavior G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ OverscrollEffect I;
    public final /* synthetic */ Function1 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridCells f5002z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z2, float f2, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, Function1 function1, int i2, int i3, int i4) {
        super(2);
        this.f5002z = staggeredGridCells;
        this.f5000A = modifier;
        this.f5001B = lazyStaggeredGridState;
        this.C = paddingValues;
        this.D = z2;
        this.E = f2;
        this.F = horizontal;
        this.G = flingBehavior;
        this.H = z3;
        this.I = overscrollEffect;
        this.J = function1;
        this.K = i2;
        this.L = i3;
        this.M = i4;
    }

    public final void b(Composer composer, int i2) {
        LazyStaggeredGridDslKt.c(this.f5002z, this.f5000A, this.f5001B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, composer, RecomposeScopeImplKt.a(this.K | 1), RecomposeScopeImplKt.a(this.L), this.M);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
