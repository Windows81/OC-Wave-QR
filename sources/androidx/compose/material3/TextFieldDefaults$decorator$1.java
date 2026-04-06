package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TextFieldDefaults$decorator$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f11378A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ InteractionSource f11379B;
    public final /* synthetic */ TextFieldColors C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f11380z;

    public TextFieldDefaults$decorator$1(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors) {
        this.f11380z = z2;
        this.f11378A = z3;
        this.f11379B = interactionSource;
        this.C = textFieldColors;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(245572296, i2, -1, "androidx.compose.material3.TextFieldDefaults.decorator.<anonymous> (TextFieldDefaults.kt:168)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11367a;
            textFieldDefaults.c(this.f11380z, this.f11378A, this.f11379B, (Modifier) null, this.C, textFieldDefaults.r(composer, 6), textFieldDefaults.o(), textFieldDefaults.s(), composer, 114819072, 8);
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
