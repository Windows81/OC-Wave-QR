package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDefaults$OutlinedTextFieldDecorationBox$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f8747A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ InteractionSource f8748B;
    public final /* synthetic */ TextFieldColors C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8749z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$OutlinedTextFieldDecorationBox$3(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors) {
        super(2);
        this.f8749z = z2;
        this.f8747A = z3;
        this.f8748B = interactionSource;
        this.C = textFieldColors;
    }

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1261916269, i3, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:745)");
            }
            TextFieldDefaults.f8730a.a(this.f8749z, this.f8747A, this.f8748B, this.C, (Shape) null, 0.0f, 0.0f, composer, 12582912, 112);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
