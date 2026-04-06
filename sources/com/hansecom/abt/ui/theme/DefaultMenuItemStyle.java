package com.hansecom.abt.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle;
import kotlin.Metadata;

@Metadata
public final class DefaultMenuItemStyle implements AbtMenuItemStyle {

    /* renamed from: a  reason: collision with root package name */
    public static final DefaultMenuItemStyle f38854a = new DefaultMenuItemStyle();

    public long a(Composer composer, int i2) {
        composer.X(-801577315);
        if (ComposerKt.P()) {
            ComposerKt.Y(-801577315, i2, -1, "com.hansecom.abt.ui.theme.DefaultMenuItemStyle.<get-dividerColor> (DefaultMenuItemStyle.kt:18)");
        }
        long u2 = AbtTheme.f38851a.b(composer, 6).u();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return u2;
    }

    public long b(Composer composer, int i2) {
        composer.X(1866164893);
        if (ComposerKt.P()) {
            ComposerKt.Y(1866164893, i2, -1, "com.hansecom.abt.ui.theme.DefaultMenuItemStyle.<get-contentColor> (DefaultMenuItemStyle.kt:10)");
        }
        long x2 = AbtTheme.f38851a.b(composer, 6).x();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return x2;
    }

    public long c(Composer composer, int i2) {
        composer.X(-1838388707);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1838388707, i2, -1, "com.hansecom.abt.ui.theme.DefaultMenuItemStyle.<get-disabledContentColor> (DefaultMenuItemStyle.kt:14)");
        }
        long a2 = AbtTheme.f38851a.b(composer, 6).a();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return a2;
    }
}
