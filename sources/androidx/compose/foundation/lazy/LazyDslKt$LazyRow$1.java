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
public final class LazyDslKt$LazyRow$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4314A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4315B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Arrangement.Horizontal D;
    public final /* synthetic */ Alignment.Vertical E;
    public final /* synthetic */ FlingBehavior F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ OverscrollEffect H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f4316z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$LazyRow$1(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, Function1 function1, int i2, int i3) {
        super(2);
        this.f4316z = modifier;
        this.f4314A = lazyListState;
        this.f4315B = paddingValues;
        this.C = z2;
        this.D = horizontal;
        this.E = vertical;
        this.F = flingBehavior;
        this.G = z3;
        this.H = overscrollEffect;
        this.I = function1;
        this.J = i2;
        this.K = i3;
    }

    public final void b(Composer composer, int i2) {
        LazyDslKt.e(this.f4316z, this.f4314A, this.f4315B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, RecomposeScopeImplKt.a(this.J | 1), this.K);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
