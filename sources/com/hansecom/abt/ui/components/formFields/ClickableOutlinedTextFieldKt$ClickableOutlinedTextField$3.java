package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ClickableOutlinedTextFieldKt$ClickableOutlinedTextField$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38265z;

    public ClickableOutlinedTextFieldKt$ClickableOutlinedTextField$3(String str) {
        this.f38265z = str;
    }

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1875754359, i3, -1, "com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextField.<anonymous> (ClickableOutlinedTextField.kt:41)");
            }
            TextKt.j(this.f38265z, (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(composer, 6).a(), composer, 0, 0, 131070);
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
