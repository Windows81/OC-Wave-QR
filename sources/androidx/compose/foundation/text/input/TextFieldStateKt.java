package androidx.compose.foundation.text.input;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextFieldStateKt {
    public static final List b(TextRange textRange, MutableVector mutableVector) {
        if (mutableVector != null && mutableVector.p() != 0) {
            return CollectionsKt.M0(mutableVector.k());
        }
        if (textRange == null || TextRange.h(textRange.r())) {
            return CollectionsKt.m();
        }
        SpanStyle spanStyle = r1;
        SpanStyle spanStyle2 = new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.f19089b.d(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null);
        return CollectionsKt.e(new AnnotatedString.Range(spanStyle, TextRange.l(textRange.r()), TextRange.k(textRange.r())));
    }
}
