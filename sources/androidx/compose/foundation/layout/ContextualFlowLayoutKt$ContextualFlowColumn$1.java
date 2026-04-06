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
public final class ContextualFlowLayoutKt$ContextualFlowColumn$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f3840A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f3841B;
    public final /* synthetic */ Arrangement.Horizontal C;
    public final /* synthetic */ Alignment.Horizontal D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ ContextualFlowColumnOverflow G;
    public final /* synthetic */ Function4 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f3842z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextualFlowLayoutKt$ContextualFlowColumn$1(int i2, Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i3, int i4, ContextualFlowColumnOverflow contextualFlowColumnOverflow, Function4 function4, int i5, int i6) {
        super(2);
        this.f3842z = i2;
        this.f3840A = modifier;
        this.f3841B = vertical;
        this.C = horizontal;
        this.D = horizontal2;
        this.E = i3;
        this.F = i4;
        this.G = contextualFlowColumnOverflow;
        this.H = function4;
        this.I = i5;
        this.J = i6;
    }

    public final void b(Composer composer, int i2) {
        ContextualFlowLayoutKt.a(this.f3842z, this.f3840A, this.f3841B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
