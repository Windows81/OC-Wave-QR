package com.hansecom.abt.ui.theme;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.theme.typography.AbtTypography;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class OctaTypographyKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TextStyle f38898a;

    /* renamed from: b  reason: collision with root package name */
    public static final FontWeight f38899b;

    /* renamed from: c  reason: collision with root package name */
    public static final FontWeight f38900c;

    /* renamed from: d  reason: collision with root package name */
    public static final FontWeight f38901d;

    static {
        TextStyle a2 = TextStyle.f18499d.a();
        int i2 = R.font.f33033i;
        FontWeight.Companion companion = FontWeight.f18746A;
        FontFamily b2 = FontFamilyKt.b(FontKt.b(i2, companion.i(), 0, 0, 12, (Object) null), FontKt.b(R.font.f33028d, companion.d(), 0, 0, 12, (Object) null), FontKt.b(R.font.f33029e, companion.e(), 0, 0, 12, (Object) null), FontKt.b(R.font.f33031g, companion.g(), 0, 0, 12, (Object) null), FontKt.b(R.font.f33030f, companion.f(), 0, 0, 12, (Object) null), FontKt.b(R.font.f33032h, companion.h(), 0, 0, 12, (Object) null), FontKt.b(R.font.f33026b, companion.b(), 0, 0, 12, (Object) null), FontKt.b(R.font.f33027c, companion.c(), 0, 0, 12, (Object) null), FontKt.b(R.font.f33025a, companion.a(), 0, 0, 12, (Object) null));
        PlatformTextStyle platformTextStyle = r2;
        PlatformTextStyle platformTextStyle2 = new PlatformTextStyle(false);
        LineHeightStyle lineHeightStyle = r2;
        LineHeightStyle lineHeightStyle2 = new LineHeightStyle(LineHeightStyle.Alignment.f19061b.a(), LineHeightStyle.Trim.f19071b.b(), (DefaultConstructorMarker) null);
        f38898a = TextStyle.c(a2, 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, b2, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, platformTextStyle, lineHeightStyle, 0, 0, (TextMotion) null, 15204319, (Object) null);
        f38899b = companion.j();
        f38900c = companion.k();
        f38901d = companion.l();
    }

    public static final AbtTypography a() {
        TextStyle textStyle = f38898a;
        FontWeight fontWeight = f38900c;
        TextStyle c2 = TextStyle.c(textStyle, 0, TextUnitKt.i(48), fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(56), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null);
        FontWeight fontWeight2 = f38901d;
        TextStyle c3 = TextStyle.c(textStyle, 0, TextUnitKt.i(34), fontWeight2, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(36), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null);
        FontWeight fontWeight3 = f38899b;
        return new AbtTypography(c2, c3, TextStyle.c(textStyle, 0, TextUnitKt.i(32), fontWeight3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(32), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null), TextStyle.c(textStyle, 0, TextUnitKt.i(28), fontWeight2, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(30), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null), TextStyle.c(textStyle, 0, TextUnitKt.i(22), fontWeight2, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null), TextStyle.c(textStyle, 0, TextUnitKt.i(20), fontWeight2, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(23), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null), TextStyle.c(textStyle, 0, TextUnitKt.i(17), fontWeight2, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null), TextStyle.c(textStyle, 0, TextUnitKt.i(17), fontWeight3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null), TextStyle.c(textStyle, 0, TextUnitKt.i(16), fontWeight3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null), TextStyle.c(textStyle, 0, TextUnitKt.i(16), fontWeight2, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(19), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null), TextStyle.c(textStyle, 0, TextUnitKt.i(12), fontWeight2, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null), TextStyle.c(textStyle, 0, TextUnitKt.i(12), fontWeight3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null), TextStyle.c(textStyle, 0, TextUnitKt.i(11), fontWeight3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, TextUnitKt.i(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.i(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646009, (Object) null));
    }
}
