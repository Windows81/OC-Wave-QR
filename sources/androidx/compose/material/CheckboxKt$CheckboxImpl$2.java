package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CheckboxKt$CheckboxImpl$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ToggleableState f7461A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7462B;
    public final /* synthetic */ CheckboxColors C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7463z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$2(boolean z2, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, int i2) {
        super(2);
        this.f7463z = z2;
        this.f7461A = toggleableState;
        this.f7462B = modifier;
        this.C = checkboxColors;
        this.D = i2;
    }

    public final void b(Composer composer, int i2) {
        CheckboxKt.b(this.f7463z, this.f7461A, this.f7462B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
