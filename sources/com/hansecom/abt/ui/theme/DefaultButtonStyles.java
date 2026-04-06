package com.hansecom.abt.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyles;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DefaultButtonStyles implements AbtButtonStyles {

    /* renamed from: a  reason: collision with root package name */
    public static final DefaultButtonStyles f38852a = new DefaultButtonStyles();

    public AbtButtonStyle a(Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(1930549162);
        if (ComposerKt.P()) {
            ComposerKt.Y(1930549162, i2, -1, "com.hansecom.abt.ui.theme.DefaultButtonStyles.<get-Tertiary> (DefaultButtonStyles.kt:32)");
        }
        AbtButtonStyle abtButtonStyle = new AbtButtonStyle(Color.f15975b.e(), AbtTheme.f38851a.b(composer2, 6).x(), 0, 0.0f, 0.0f, 28, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return abtButtonStyle;
    }

    public AbtButtonStyle b(Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(392402720);
        if (ComposerKt.P()) {
            ComposerKt.Y(392402720, i2, -1, "com.hansecom.abt.ui.theme.DefaultButtonStyles.<get-Destructive> (DefaultButtonStyles.kt:40)");
        }
        AbtTheme abtTheme = AbtTheme.f38851a;
        AbtButtonStyle abtButtonStyle = new AbtButtonStyle(abtTheme.b(composer2, 6).b(), abtTheme.b(composer2, 6).h(), 0, 0.0f, 0.0f, 28, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return abtButtonStyle;
    }

    public AbtButtonStyle c(Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(892791200);
        if (ComposerKt.P()) {
            ComposerKt.Y(892791200, i2, -1, "com.hansecom.abt.ui.theme.DefaultButtonStyles.<get-Primary> (DefaultButtonStyles.kt:15)");
        }
        AbtTheme abtTheme = AbtTheme.f38851a;
        AbtButtonStyle abtButtonStyle = new AbtButtonStyle(abtTheme.b(composer2, 6).x(), abtTheme.b(composer2, 6).o(), 0, 0.0f, 0.0f, 28, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return abtButtonStyle;
    }

    public AbtButtonStyle d(Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(-631374016);
        if (ComposerKt.P()) {
            ComposerKt.Y(-631374016, i2, -1, "com.hansecom.abt.ui.theme.DefaultButtonStyles.<get-InvertedSecondary> (DefaultButtonStyles.kt:65)");
        }
        AbtButtonStyle abtButtonStyle = new AbtButtonStyle(Color.f15975b.e(), AbtTheme.f38851a.b(composer2, 6).A(), 0, DefaultButtonStylesKt.f38853a, 0.0f, 20, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return abtButtonStyle;
    }

    public AbtButtonStyle e(Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(-860370144);
        if (ComposerKt.P()) {
            ComposerKt.Y(-860370144, i2, -1, "com.hansecom.abt.ui.theme.DefaultButtonStyles.<get-Secondary> (DefaultButtonStyles.kt:23)");
        }
        AbtButtonStyle abtButtonStyle = new AbtButtonStyle(Color.f15975b.e(), AbtTheme.f38851a.b(composer2, 6).x(), 0, DefaultButtonStylesKt.f38853a, 0.0f, 20, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return abtButtonStyle;
    }

    public AbtButtonStyle f(Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(1526703274);
        if (ComposerKt.P()) {
            ComposerKt.Y(1526703274, i2, -1, "com.hansecom.abt.ui.theme.DefaultButtonStyles.<get-DestructiveSecondary> (DefaultButtonStyles.kt:48)");
        }
        AbtButtonStyle abtButtonStyle = new AbtButtonStyle(Color.f15975b.e(), AbtTheme.f38851a.b(composer2, 6).b(), 0, DefaultButtonStylesKt.f38853a, 0.0f, 20, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return abtButtonStyle;
    }

    public AbtButtonStyle g(Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(-1939036928);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1939036928, i2, -1, "com.hansecom.abt.ui.theme.DefaultButtonStyles.<get-InvertedPrimary> (DefaultButtonStyles.kt:57)");
        }
        AbtTheme abtTheme = AbtTheme.f38851a;
        AbtButtonStyle abtButtonStyle = new AbtButtonStyle(abtTheme.b(composer2, 6).A(), abtTheme.b(composer2, 6).x(), 0, 0.0f, 0.0f, 28, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return abtButtonStyle;
    }
}
