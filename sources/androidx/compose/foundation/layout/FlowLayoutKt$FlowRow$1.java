package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FlowLayoutKt$FlowRow$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f3946A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f3947B;
    public final /* synthetic */ Alignment.Vertical C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ FlowRowOverflow F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f3948z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$FlowRow$1(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, FlowRowOverflow flowRowOverflow, Function3 function3, int i4, int i5) {
        super(2);
        this.f3948z = modifier;
        this.f3946A = horizontal;
        this.f3947B = vertical;
        this.C = vertical2;
        this.D = i2;
        this.E = i3;
        this.F = flowRowOverflow;
        this.G = function3;
        this.H = i4;
        this.I = i5;
    }

    public final void b(Composer composer, int i2) {
        FlowLayoutKt.c(this.f3948z, this.f3946A, this.f3947B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
