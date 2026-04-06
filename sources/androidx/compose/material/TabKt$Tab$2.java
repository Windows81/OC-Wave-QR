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
public final class TabKt$Tab$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f8658A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f8659B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ MutableInteractionSource F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8660z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$2(boolean z2, Function0 function0, Modifier modifier, boolean z3, Function2 function2, Function2 function22, MutableInteractionSource mutableInteractionSource, long j2, long j3, int i2, int i3) {
        super(2);
        this.f8660z = z2;
        this.f8658A = function0;
        this.f8659B = modifier;
        this.C = z3;
        this.D = function2;
        this.E = function22;
        this.F = mutableInteractionSource;
        this.G = j2;
        this.H = j3;
        this.I = i2;
        this.J = i3;
    }

    public final void b(Composer composer, int i2) {
        TabKt.b(this.f8660z, this.f8658A, this.f8659B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
