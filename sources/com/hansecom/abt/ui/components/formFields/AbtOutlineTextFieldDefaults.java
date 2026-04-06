package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;

@Metadata
public final class AbtOutlineTextFieldDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final AbtOutlineTextFieldDefaults f38255a = new AbtOutlineTextFieldDefaults();

    public final TextFieldColors a(Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(-519065821);
        if (ComposerKt.P()) {
            ComposerKt.Y(-519065821, i2, -1, "com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldDefaults.<get-colors> (AbtOutlineTextField.kt:28)");
        }
        TextFieldColors g2 = OutlinedTextFieldDefaults.f10533a.g(composer2, 6);
        AbtTheme abtTheme = AbtTheme.f38851a;
        TextFieldColors d2 = TextFieldColors.d(g2, abtTheme.b(composer2, 6).q(), abtTheme.b(composer2, 6).q(), 0, 0, 0, 0, 0, 0, 0, 0, (TextSelectionColors) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, abtTheme.b(composer2, 6).a(), abtTheme.b(composer2, 6).a(), 0, 0, abtTheme.b(composer2, 6).a(), abtTheme.b(composer2, 6).a(), 0, abtTheme.b(composer2, 6).b(), 0, 0, 0, 0, 0, 0, 0, 0, 1744830460, 2042, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return d2;
    }
}
