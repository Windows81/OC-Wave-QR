package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class OutlinedTextFieldDefaults$decorator$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10542A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ InteractionSource f10543B;
    public final /* synthetic */ TextFieldColors C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f10544z;

    public OutlinedTextFieldDefaults$decorator$1(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors) {
        this.f10544z = z2;
        this.f10542A = z3;
        this.f10543B = interactionSource;
        this.C = textFieldColors;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-163468598, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator.<anonymous> (TextFieldDefaults.kt:983)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f10533a;
            outlinedTextFieldDefaults.c(this.f10544z, this.f10542A, this.f10543B, (Modifier) null, this.C, outlinedTextFieldDefaults.p(composer, 6), outlinedTextFieldDefaults.m(), outlinedTextFieldDefaults.q(), composer, 114819072, 8);
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
