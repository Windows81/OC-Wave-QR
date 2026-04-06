package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class ExposedDropdownMenuDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final ExposedDropdownMenuDefaults f7814a = new ExposedDropdownMenuDefaults();

    public final void a(boolean z2, Function0 function0, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(876077373);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.d(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function0) ? 32 : 16;
        }
        if (q2.E((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                function0 = ExposedDropdownMenuDefaults$TrailingIcon$1.f7815z;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(876077373, i4, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:235)");
            }
            IconButtonKt.a(function0, SemanticsModifierKt.a(Modifier.f15489d, ExposedDropdownMenuDefaults$TrailingIcon$2.f7816z), false, (MutableInteractionSource) null, ComposableLambdaKt.e(726122713, true, new ExposedDropdownMenuDefaults$TrailingIcon$3(z2), q2, 54), q2, ((i4 >> 3) & 14) | 24576, 12);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Function0 function02 = function0;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ExposedDropdownMenuDefaults$TrailingIcon$4(this, z2, function02, i2, i3));
        }
    }
}
