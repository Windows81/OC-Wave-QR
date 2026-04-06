package androidx.compose.foundation.lazy;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListKt$LazyList$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4377A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4378B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ FlingBehavior E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ OverscrollEffect G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Alignment.Horizontal I;
    public final /* synthetic */ Arrangement.Vertical J;
    public final /* synthetic */ Alignment.Vertical K;
    public final /* synthetic */ Arrangement.Horizontal L;
    public final /* synthetic */ Function1 M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f4379z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListKt$LazyList$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, boolean z3, FlingBehavior flingBehavior, boolean z4, OverscrollEffect overscrollEffect, int i2, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, Function1 function1, int i3, int i4, int i5) {
        super(2);
        this.f4379z = modifier;
        this.f4377A = lazyListState;
        this.f4378B = paddingValues;
        this.C = z2;
        this.D = z3;
        this.E = flingBehavior;
        this.F = z4;
        this.G = overscrollEffect;
        this.H = i2;
        this.I = horizontal;
        this.J = vertical;
        this.K = vertical2;
        this.L = horizontal2;
        this.M = function1;
        this.N = i3;
        this.O = i4;
        this.P = i5;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        Modifier modifier = this.f4379z;
        Modifier modifier2 = modifier;
        LazyListKt.a(modifier2, this.f4377A, this.f4378B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, composer2, RecomposeScopeImplKt.a(this.N | 1), RecomposeScopeImplKt.a(this.O), this.P);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
