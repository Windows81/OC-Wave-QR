package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TextFieldDefaults$DecorationBox$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f11374A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ InteractionSource f11375B;
    public final /* synthetic */ TextFieldColors C;
    public final /* synthetic */ Shape D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f11376z;

    public TextFieldDefaults$DecorationBox$1(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape) {
        this.f11376z = z2;
        this.f11374A = z3;
        this.f11375B = interactionSource;
        this.C = textFieldColors;
        this.D = shape;
    }

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(417908150, i3, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:390)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11367a;
            textFieldDefaults.c(this.f11376z, this.f11374A, this.f11375B, Modifier.f15489d, this.C, this.D, textFieldDefaults.o(), textFieldDefaults.s(), composer, 114822144, 0);
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
