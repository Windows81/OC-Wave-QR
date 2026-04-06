package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CheckboxKt$Checkbox$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f7455A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7456B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ MutableInteractionSource D;
    public final /* synthetic */ CheckboxColors E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7457z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$Checkbox$2(boolean z2, Function1 function1, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, int i2, int i3) {
        super(2);
        this.f7457z = z2;
        this.f7455A = function1;
        this.f7456B = modifier;
        this.C = z3;
        this.D = mutableInteractionSource;
        this.E = checkboxColors;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        CheckboxKt.a(this.f7457z, this.f7455A, this.f7456B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
