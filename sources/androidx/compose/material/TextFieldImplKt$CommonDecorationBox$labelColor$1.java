package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends Lambda implements Function3<InputPhase, Composer, Integer, Color> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f8786A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8787B;
    public final /* synthetic */ InteractionSource C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f8788z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(TextFieldColors textFieldColors, boolean z2, boolean z3, InteractionSource interactionSource) {
        super(3);
        this.f8788z = textFieldColors;
        this.f8786A = z2;
        this.f8787B = z3;
        this.C = interactionSource;
    }

    public final long b(InputPhase inputPhase, Composer composer, int i2) {
        composer.X(-1272940975);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1272940975, i2, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:95)");
        }
        long v2 = ((Color) this.f8788z.j(this.f8786A, inputPhase == InputPhase.UnfocusedEmpty ? false : this.f8787B, this.C, composer, 0).getValue()).v();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return v2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return Color.h(b((InputPhase) obj, (Composer) obj2, ((Number) obj3).intValue()));
    }
}
