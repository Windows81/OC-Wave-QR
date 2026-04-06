package com.hansecom.abt.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextStyleExtKt {
    public static final TextStyle a(TextStyle textStyle, Composer composer, int i2) {
        Composer composer2 = composer;
        Intrinsics.i(textStyle, "<this>");
        composer2.X(-1122605108);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1122605108, i2, -1, "com.hansecom.abt.util.unscaled (TextStyleExt.kt:16)");
        }
        TextStyle c2 = TextStyle.c(textStyle, 0, b(textStyle.l(), composer2, 0), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return c2;
    }

    public static final long b(long j2, Composer composer, int i2) {
        composer.X(-2127386576);
        if (ComposerKt.P()) {
            ComposerKt.Y(-2127386576, i2, -1, "com.hansecom.abt.util.unscaled (TextStyleExt.kt:9)");
        }
        long h2 = TextUnitKt.h(TextUnit.h(j2) / ((Density) composer.C(CompositionLocalsKt.g())).u1());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return h2;
    }
}
