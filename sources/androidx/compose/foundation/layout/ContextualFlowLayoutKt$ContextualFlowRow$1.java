package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextualFlowLayoutKt$ContextualFlowRow$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f3844A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f3845B;
    public final /* synthetic */ Arrangement.Vertical C;
    public final /* synthetic */ Alignment.Vertical D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ ContextualFlowRowOverflow G;
    public final /* synthetic */ Function4 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f3846z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextualFlowLayoutKt$ContextualFlowRow$1(int i2, Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i3, int i4, ContextualFlowRowOverflow contextualFlowRowOverflow, Function4 function4, int i5, int i6) {
        super(2);
        this.f3846z = i2;
        this.f3844A = modifier;
        this.f3845B = horizontal;
        this.C = vertical;
        this.D = vertical2;
        this.E = i3;
        this.F = i4;
        this.G = contextualFlowRowOverflow;
        this.H = function4;
        this.I = i5;
        this.J = i6;
    }

    public final void b(Composer composer, int i2) {
        ContextualFlowLayoutKt.b(this.f3846z, this.f3844A, this.f3845B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
