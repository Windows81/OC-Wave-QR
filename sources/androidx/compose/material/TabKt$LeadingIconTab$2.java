package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabKt$LeadingIconTab$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f8653A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8654B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ MutableInteractionSource F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8655z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$LeadingIconTab$2(boolean z2, Function0 function0, Function2 function2, Function2 function22, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, long j2, long j3, int i2, int i3) {
        super(2);
        this.f8655z = z2;
        this.f8653A = function0;
        this.f8654B = function2;
        this.C = function22;
        this.D = modifier;
        this.E = z3;
        this.F = mutableInteractionSource;
        this.G = j2;
        this.H = j3;
        this.I = i2;
        this.J = i3;
    }

    public final void b(Composer composer, int i2) {
        TabKt.a(this.f8655z, this.f8653A, this.f8654B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
