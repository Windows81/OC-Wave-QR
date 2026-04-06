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
public final class LazyDslKt$LazyColumn$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4308A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4309B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Arrangement.Vertical D;
    public final /* synthetic */ Alignment.Horizontal E;
    public final /* synthetic */ FlingBehavior F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f4310z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$LazyColumn$2(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, Function1 function1, int i2, int i3) {
        super(2);
        this.f4310z = modifier;
        this.f4308A = lazyListState;
        this.f4309B = paddingValues;
        this.C = z2;
        this.D = vertical;
        this.E = horizontal;
        this.F = flingBehavior;
        this.G = z3;
        this.H = function1;
        this.I = i2;
        this.J = i3;
    }

    public final void b(Composer composer, int i2) {
        LazyDslKt.c(this.f4310z, this.f4308A, this.f4309B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
