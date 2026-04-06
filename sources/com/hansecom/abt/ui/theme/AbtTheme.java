package com.hansecom.abt.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyles;
import com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle;
import com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme;
import com.hansecom.abt.ui.theme.typography.AbtTypography;
import com.hansecom.abt.ui.theme.typography.AbtTypographyKt;
import kotlin.Metadata;

@Metadata
public final class AbtTheme {

    /* renamed from: a  reason: collision with root package name */
    public static final AbtTheme f38851a = new AbtTheme();

    public final AbtButtonStyles a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(980663226, i2, -1, "com.hansecom.abt.ui.theme.AbtTheme.<get-buttonStyles> (AbtBaseTheme.kt:79)");
        }
        AbtButtonStyles abtButtonStyles = (AbtButtonStyles) composer.C(AbtBaseThemeKt.l());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return abtButtonStyles;
    }

    public final AbtColorScheme b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(929406696, i2, -1, "com.hansecom.abt.ui.theme.AbtTheme.<get-colorScheme> (AbtBaseTheme.kt:69)");
        }
        AbtColorScheme abtColorScheme = (AbtColorScheme) composer.C(AbtBaseThemeKt.m());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return abtColorScheme;
    }

    public final AbtMenuItemStyle c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-859537185, i2, -1, "com.hansecom.abt.ui.theme.AbtTheme.<get-menuItemStyle> (AbtBaseTheme.kt:84)");
        }
        AbtMenuItemStyle abtMenuItemStyle = (AbtMenuItemStyle) composer.C(AbtBaseThemeKt.n());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return abtMenuItemStyle;
    }

    public final AbtTypography d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1373382527, i2, -1, "com.hansecom.abt.ui.theme.AbtTheme.<get-typography> (AbtBaseTheme.kt:74)");
        }
        AbtTypography abtTypography = (AbtTypography) composer.C(AbtTypographyKt.d());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return abtTypography;
    }
}
