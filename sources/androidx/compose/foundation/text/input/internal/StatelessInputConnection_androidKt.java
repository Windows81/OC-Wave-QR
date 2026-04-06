package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.content.PlatformTransferableContent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class StatelessInputConnection_androidKt {
    public static final FontFamily b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface typeface = Typeface.DEFAULT;
        if (Intrinsics.d(create, typeface) || Intrinsics.d(create, Typeface.create(typeface, 0))) {
            create = null;
        }
        if (create != null) {
            return AndroidTypeface_androidKt.a(create);
        }
        return null;
    }

    public static final AnnotatedString.Annotation c(Object obj) {
        Object obj2 = obj;
        if (obj2 instanceof BackgroundColorSpan) {
            return new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.b(((BackgroundColorSpan) obj2).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63487, (DefaultConstructorMarker) null);
        }
        if (obj2 instanceof ForegroundColorSpan) {
            return new SpanStyle(ColorKt.b(((ForegroundColorSpan) obj2).getForegroundColor()), 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null);
        }
        if (obj2 instanceof StrikethroughSpan) {
            return new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.f19089b.b(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null);
        }
        if (obj2 instanceof StyleSpan) {
            return f((StyleSpan) obj2);
        }
        if (obj2 instanceof TypefaceSpan) {
            return g((TypefaceSpan) obj2);
        }
        if (obj2 instanceof UnderlineSpan) {
            return new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.f19089b.d(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null);
        }
        return null;
    }

    public static final List d(Spanned spanned) {
        ArrayList arrayList = null;
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            AnnotatedString.Annotation c2 = c(obj);
            if (c2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new AnnotatedString.Range(c2, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
            }
        }
        return arrayList;
    }

    public static final ExtractedText e(TextFieldCharSequence textFieldCharSequence) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldCharSequence;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.l(textFieldCharSequence.g());
        extractedText.selectionEnd = TextRange.k(textFieldCharSequence.g());
        extractedText.flags = StringsKt.V(textFieldCharSequence, 10, false, 2, (Object) null) ^ true ? 1 : 0;
        return extractedText;
    }

    public static final SpanStyle f(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new SpanStyle(0, 0, FontWeight.f18746A.b(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null);
        }
        if (style == 2) {
            return new SpanStyle(0, 0, (FontWeight) null, FontStyle.c(FontStyle.f18724b.a()), (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (DefaultConstructorMarker) null);
        }
        if (style != 3) {
            return null;
        }
        return new SpanStyle(0, 0, FontWeight.f18746A.b(), FontStyle.c(FontStyle.f18724b.a()), (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (DefaultConstructorMarker) null);
    }

    public static final SpanStyle g(TypefaceSpan typefaceSpan) {
        String family = typefaceSpan.getFamily();
        FontFamily.Companion companion = FontFamily.f18695A;
        return new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, Intrinsics.d(family, companion.a().n()) ? companion.a() : Intrinsics.d(family, companion.c().n()) ? companion.c() : Intrinsics.d(family, companion.d().n()) ? companion.d() : Intrinsics.d(family, companion.e().n()) ? companion.e() : b(typefaceSpan.getFamily()), (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (DefaultConstructorMarker) null);
    }

    public static final TransferableContent h(InputContentInfoCompat inputContentInfoCompat, Bundle bundle) {
        ClipEntry a2 = AndroidClipboardManager_androidKt.a(new ClipData(inputContentInfoCompat.b(), new ClipData.Item(inputContentInfoCompat.a())));
        int c2 = TransferableContent.Source.f3207b.c();
        ClipMetadata b2 = AndroidClipboardManager_androidKt.b(inputContentInfoCompat.b());
        Uri c3 = inputContentInfoCompat.c();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new TransferableContent(a2, b2, c2, new PlatformTransferableContent(c3, bundle), (DefaultConstructorMarker) null);
    }
}
