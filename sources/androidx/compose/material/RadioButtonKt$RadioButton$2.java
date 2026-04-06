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
public final class RadioButtonKt$RadioButton$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f8228A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f8229B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ MutableInteractionSource D;
    public final /* synthetic */ RadioButtonColors E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8230z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$2(boolean z2, Function0 function0, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, RadioButtonColors radioButtonColors, int i2, int i3) {
        super(2);
        this.f8230z = z2;
        this.f8228A = function0;
        this.f8229B = modifier;
        this.C = z3;
        this.D = mutableInteractionSource;
        this.E = radioButtonColors;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        RadioButtonKt.a(this.f8230z, this.f8228A, this.f8229B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
