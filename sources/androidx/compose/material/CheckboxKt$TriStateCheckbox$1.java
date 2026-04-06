package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CheckboxKt$TriStateCheckbox$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f7466A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7467B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ MutableInteractionSource D;
    public final /* synthetic */ CheckboxColors E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ToggleableState f7468z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$TriStateCheckbox$1(ToggleableState toggleableState, Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, int i2, int i3) {
        super(2);
        this.f7468z = toggleableState;
        this.f7466A = function0;
        this.f7467B = modifier;
        this.C = z2;
        this.D = mutableInteractionSource;
        this.E = checkboxColors;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        CheckboxKt.h(this.f7468z, this.f7466A, this.f7467B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
