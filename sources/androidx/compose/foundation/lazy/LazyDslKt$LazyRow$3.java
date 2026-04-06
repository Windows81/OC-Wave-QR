package androidx.compose.foundation.lazy;

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
public final class LazyDslKt$LazyRow$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4320A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4321B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Arrangement.Horizontal D;
    public final /* synthetic */ Alignment.Vertical E;
    public final /* synthetic */ FlingBehavior F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f4322z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$LazyRow$3(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, Function1 function1, int i2, int i3) {
        super(2);
        this.f4322z = modifier;
        this.f4320A = lazyListState;
        this.f4321B = paddingValues;
        this.C = z2;
        this.D = horizontal;
        this.E = vertical;
        this.F = flingBehavior;
        this.G = function1;
        this.H = i2;
        this.I = i3;
    }

    public final void b(Composer composer, int i2) {
        LazyDslKt.d(this.f4322z, this.f4320A, this.f4321B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
