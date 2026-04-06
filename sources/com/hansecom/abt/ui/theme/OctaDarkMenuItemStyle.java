package com.hansecom.abt.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle;
import kotlin.Metadata;

@Metadata
public final class OctaDarkMenuItemStyle implements AbtMenuItemStyle {

    /* renamed from: a  reason: collision with root package name */
    public static final OctaDarkMenuItemStyle f38895a = new OctaDarkMenuItemStyle();

    public long a(Composer composer, int i2) {
        composer.X(995967017);
        if (ComposerKt.P()) {
            ComposerKt.Y(995967017, i2, -1, "com.hansecom.abt.ui.theme.OctaDarkMenuItemStyle.<get-dividerColor> (OctaMenuItemStyle.kt:33)");
        }
        long u2 = AbtTheme.f38851a.b(composer, 6).u();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return u2;
    }

    public long b(Composer composer, int i2) {
        composer.X(19973161);
        if (ComposerKt.P()) {
            ComposerKt.Y(19973161, i2, -1, "com.hansecom.abt.ui.theme.OctaDarkMenuItemStyle.<get-contentColor> (OctaMenuItemStyle.kt:25)");
        }
        long q2 = AbtTheme.f38851a.b(composer, 6).q();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return q2;
    }

    public long c(Composer composer, int i2) {
        composer.X(328967081);
        if (ComposerKt.P()) {
            ComposerKt.Y(328967081, i2, -1, "com.hansecom.abt.ui.theme.OctaDarkMenuItemStyle.<get-disabledContentColor> (OctaMenuItemStyle.kt:29)");
        }
        long a2 = AbtTheme.f38851a.b(composer, 6).a();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return a2;
    }
}
