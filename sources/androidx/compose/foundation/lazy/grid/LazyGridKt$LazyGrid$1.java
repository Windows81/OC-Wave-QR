package androidx.compose.foundation.lazy.grid;

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
public final class LazyGridKt$LazyGrid$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4604A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyGridSlotsProvider f4605B;
    public final /* synthetic */ PaddingValues C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ FlingBehavior F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ OverscrollEffect H;
    public final /* synthetic */ Arrangement.Vertical I;
    public final /* synthetic */ Arrangement.Horizontal J;
    public final /* synthetic */ Function1 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f4606z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridKt$LazyGrid$1(Modifier modifier, LazyGridState lazyGridState, LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z2, boolean z3, FlingBehavior flingBehavior, boolean z4, OverscrollEffect overscrollEffect, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function1 function1, int i2, int i3, int i4) {
        super(2);
        this.f4606z = modifier;
        this.f4604A = lazyGridState;
        this.f4605B = lazyGridSlotsProvider;
        this.C = paddingValues;
        this.D = z2;
        this.E = z3;
        this.F = flingBehavior;
        this.G = z4;
        this.H = overscrollEffect;
        this.I = vertical;
        this.J = horizontal;
        this.K = function1;
        this.L = i2;
        this.M = i3;
        this.N = i4;
    }

    public final void b(Composer composer, int i2) {
        LazyGridKt.a(this.f4606z, this.f4604A, this.f4605B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, composer, RecomposeScopeImplKt.a(this.L | 1), RecomposeScopeImplKt.a(this.M), this.N);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
