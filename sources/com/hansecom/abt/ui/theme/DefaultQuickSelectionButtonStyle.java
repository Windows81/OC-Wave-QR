package com.hansecom.abt.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.components.quickSelectionButton.AbtQuickSelectionButtonStyle;
import kotlin.Metadata;

@Metadata
public final class DefaultQuickSelectionButtonStyle implements AbtQuickSelectionButtonStyle {

    /* renamed from: a  reason: collision with root package name */
    public static final DefaultQuickSelectionButtonStyle f38855a = new DefaultQuickSelectionButtonStyle();

    public float a(Composer composer, int i2) {
        composer.X(-79490640);
        if (ComposerKt.P()) {
            ComposerKt.Y(-79490640, i2, -1, "com.hansecom.abt.ui.theme.DefaultQuickSelectionButtonStyle.<get-cornerRadius> (DefaultQuickSelectionButtonStyle.kt:12)");
        }
        float m2 = Dp.m((float) 4);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return m2;
    }
}
