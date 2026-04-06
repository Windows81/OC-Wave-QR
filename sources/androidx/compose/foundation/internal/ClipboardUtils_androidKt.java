package androidx.compose.foundation.internal;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ClipboardUtils_androidKt {
    public static final AnnotatedString a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), (List) null, 2, (DefaultConstructorMarker) null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i2 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int m0 = ArraysKt.m0(annotationArr);
        if (m0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i2];
                if (Intrinsics.d(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new AnnotatedString.Range(new DecodeHelper(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i2 == m0) {
                    break;
                }
                i2++;
            }
        }
        return new AnnotatedString(charSequence.toString(), arrayList, (List) null, 4, (DefaultConstructorMarker) null);
    }

    public static final CharSequence b(AnnotatedString annotatedString) {
        if (annotatedString.h().isEmpty()) {
            return annotatedString.k();
        }
        SpannableString spannableString = new SpannableString(annotatedString.k());
        EncodeHelper encodeHelper = new EncodeHelper();
        List h2 = annotatedString.h();
        int size = h2.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) h2.get(i2);
            int b2 = range.b();
            int c2 = range.c();
            encodeHelper.q();
            encodeHelper.e((SpanStyle) range.a());
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeHelper.p()), b2, c2, 33);
        }
        return spannableString;
    }

    public static final boolean c(ClipEntry clipEntry) {
        return ClipboardUtils.a(clipEntry);
    }

    public static final AnnotatedString d(ClipEntry clipEntry) {
        return ClipboardUtils.b(clipEntry);
    }

    public static final String e(ClipEntry clipEntry) {
        return ClipboardUtils.c(clipEntry);
    }

    public static final ClipEntry f(AnnotatedString annotatedString) {
        return ClipboardUtils.d(annotatedString);
    }
}
