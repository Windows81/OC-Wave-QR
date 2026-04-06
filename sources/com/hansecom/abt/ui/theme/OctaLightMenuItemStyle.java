package com.hansecom.abt.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle;
import kotlin.Metadata;

@Metadata
public final class OctaLightMenuItemStyle implements AbtMenuItemStyle {

    /* renamed from: a  reason: collision with root package name */
    public static final OctaLightMenuItemStyle f38896a = new OctaLightMenuItemStyle();

    public long a(Composer composer, int i2) {
        composer.X(-1548105919);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1548105919, i2, -1, "com.hansecom.abt.ui.theme.OctaLightMenuItemStyle.<get-dividerColor> (OctaMenuItemStyle.kt:18)");
        }
        long u2 = AbtTheme.f38851a.b(composer, 6).u();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return u2;
    }

    public long b(Composer composer, int i2) {
        composer.X(-1739144383);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1739144383, i2, -1, "com.hansecom.abt.ui.theme.OctaLightMenuItemStyle.<get-contentColor> (OctaMenuItemStyle.kt:10)");
        }
        long x2 = AbtTheme.f38851a.b(composer, 6).x();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return x2;
    }

    public long c(Composer composer, int i2) {
        composer.X(-750267455);
        if (ComposerKt.P()) {
            ComposerKt.Y(-750267455, i2, -1, "com.hansecom.abt.ui.theme.OctaLightMenuItemStyle.<get-disabledContentColor> (OctaMenuItemStyle.kt:14)");
        }
        long a2 = AbtTheme.f38851a.b(composer, 6).a();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return a2;
    }
}
