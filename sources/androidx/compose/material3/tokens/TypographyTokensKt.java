package androidx.compose.material3.tokens;

import androidx.compose.material3.internal.DefaultPlatformTextStyle_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
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
public final class TypographyTokensKt {

    /* renamed from: a  reason: collision with root package name */
    public static final LineHeightStyle f14383a;

    /* renamed from: b  reason: collision with root package name */
    public static final TextStyle f14384b;

    static {
        LineHeightStyle lineHeightStyle = r0;
        LineHeightStyle lineHeightStyle2 = new LineHeightStyle(LineHeightStyle.Alignment.f19061b.a(), LineHeightStyle.Trim.f19071b.b(), (DefaultConstructorMarker) null);
        f14383a = lineHeightStyle2;
        f14384b = TextStyle.c(TextStyle.f18499d.a(), 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, DefaultPlatformTextStyle_androidKt.a(), lineHeightStyle, 0, 0, (TextMotion) null, 15204351, (Object) null);
    }

    public static final TextStyle a() {
        return f14384b;
    }
}
