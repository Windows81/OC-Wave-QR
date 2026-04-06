package androidx.compose.foundation.lazy.staggeredgrid;

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
public final class LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f4997A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f4998B;
    public final /* synthetic */ PaddingValues C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Arrangement.Vertical E;
    public final /* synthetic */ float F;
    public final /* synthetic */ FlingBehavior G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridCells f4999z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$2(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, float f2, FlingBehavior flingBehavior, boolean z3, Function1 function1, int i2, int i3) {
        super(2);
        this.f4999z = staggeredGridCells;
        this.f4997A = modifier;
        this.f4998B = lazyStaggeredGridState;
        this.C = paddingValues;
        this.D = z2;
        this.E = vertical;
        this.F = f2;
        this.G = flingBehavior;
        this.H = z3;
        this.I = function1;
        this.J = i2;
        this.K = i3;
    }

    public final void b(Composer composer, int i2) {
        LazyStaggeredGridDslKt.b(this.f4999z, this.f4997A, this.f4998B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, RecomposeScopeImplKt.a(this.J | 1), this.K);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
