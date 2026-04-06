package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TypographyKt {

    /* renamed from: a  reason: collision with root package name */
    public static final LineHeightStyle f8939a;

    /* renamed from: b  reason: collision with root package name */
    public static final TextStyle f8940b;

    /* renamed from: c  reason: collision with root package name */
    public static final ProvidableCompositionLocal f8941c = CompositionLocalKt.j(TypographyKt$LocalTypography$1.f8942z);

    static {
        LineHeightStyle lineHeightStyle = r0;
        LineHeightStyle lineHeightStyle2 = new LineHeightStyle(LineHeightStyle.Alignment.f19061b.a(), LineHeightStyle.Trim.f19071b.b(), (DefaultConstructorMarker) null);
        f8939a = lineHeightStyle2;
        f8940b = TextStyle.c(TextStyle.f18499d.a(), 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, DefaultPlatformTextStyle_androidKt.a(), lineHeightStyle, 0, 0, (TextMotion) null, 15204351, (Object) null);
    }

    public static final TextStyle b() {
        return f8940b;
    }

    public static final ProvidableCompositionLocal c() {
        return f8941c;
    }

    public static final TextStyle d(TextStyle textStyle, FontFamily fontFamily) {
        return textStyle.j() != null ? textStyle : TextStyle.c(textStyle, 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777183, (Object) null);
    }
}
