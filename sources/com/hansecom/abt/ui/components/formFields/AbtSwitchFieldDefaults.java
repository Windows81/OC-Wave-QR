package com.hansecom.abt.ui.components.formFields;

import androidx.compose.material3.SwitchColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AbtSwitchFieldDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final AbtSwitchFieldDefaults f38259a = new AbtSwitchFieldDefaults();

    public final SwitchColors a(Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(1171629489);
        if (ComposerKt.P()) {
            ComposerKt.Y(1171629489, i2, -1, "com.hansecom.abt.ui.components.formFields.AbtSwitchFieldDefaults.<get-colors> (SwitchField.kt:26)");
        }
        AbtTheme abtTheme = AbtTheme.f38851a;
        long o2 = abtTheme.b(composer2, 6).o();
        long x2 = abtTheme.b(composer2, 6).x();
        long x3 = abtTheme.b(composer2, 6).x();
        Color.Companion companion = Color.f15975b;
        SwitchColors switchColors = new SwitchColors(o2, x2, x3, companion.f(), abtTheme.b(composer2, 6).o(), abtTheme.b(composer2, 6).a(), abtTheme.b(composer2, 6).a(), companion.f(), abtTheme.b(composer2, 6).o(), abtTheme.b(composer2, 6).x(), abtTheme.b(composer2, 6).x(), companion.f(), abtTheme.b(composer2, 6).o(), abtTheme.b(composer2, 6).a(), abtTheme.b(composer2, 6).a(), companion.f(), (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return switchColors;
    }
}
