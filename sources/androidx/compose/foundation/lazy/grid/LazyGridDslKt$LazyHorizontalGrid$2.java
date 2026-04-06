package androidx.compose.foundation.lazy.grid;

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
public final class LazyGridDslKt$LazyHorizontalGrid$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f4526A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4527B;
    public final /* synthetic */ PaddingValues C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Arrangement.Horizontal E;
    public final /* synthetic */ Arrangement.Vertical F;
    public final /* synthetic */ FlingBehavior G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GridCells f4528z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$LazyHorizontalGrid$2(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z3, Function1 function1, int i2, int i3) {
        super(2);
        this.f4528z = gridCells;
        this.f4526A = modifier;
        this.f4527B = lazyGridState;
        this.C = paddingValues;
        this.D = z2;
        this.E = horizontal;
        this.F = vertical;
        this.G = flingBehavior;
        this.H = z3;
        this.I = function1;
        this.J = i2;
        this.K = i3;
    }

    public final void b(Composer composer, int i2) {
        LazyGridDslKt.b(this.f4528z, this.f4526A, this.f4527B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, RecomposeScopeImplKt.a(this.J | 1), this.K);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
