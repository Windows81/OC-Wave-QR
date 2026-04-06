package androidx.compose.ui.text.android;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata
public final class LayoutIntrinsics_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18543a = true;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (androidx.compose.ui.text.android.SpannedExtensions_androidKt.a(r2, androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean d(float r1, java.lang.CharSequence r2, android.text.TextPaint r3) {
        /*
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0006
            goto L_0x0024
        L_0x0006:
            boolean r1 = r2 instanceof android.text.Spanned
            if (r1 == 0) goto L_0x001c
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanPx> r1 = androidx.compose.ui.text.android.style.LetterSpacingSpanPx.class
            boolean r1 = androidx.compose.ui.text.android.SpannedExtensions_androidKt.a(r2, r1)
            if (r1 != 0) goto L_0x0026
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanEm> r1 = androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class
            boolean r1 = androidx.compose.ui.text.android.SpannedExtensions_androidKt.a(r2, r1)
            if (r1 != 0) goto L_0x0026
        L_0x001c:
            float r1 = r3.getLetterSpacing()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            r1 = 0
            goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutIntrinsics_androidKt.d(float, java.lang.CharSequence, android.text.TextPaint):boolean");
    }

    public static final CharSequence e(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        Class<CharacterStyle> cls = CharacterStyle.class;
        if (!SpannedExtensions_androidKt.a(spanned, cls)) {
            return charSequence;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), cls);
        if (characterStyleArr == null || characterStyleArr.length == 0) {
            return charSequence;
        }
        SpannableString spannableString = null;
        for (CharacterStyle characterStyle : characterStyleArr) {
            if (!(characterStyle instanceof MetricAffectingSpan)) {
                if (spannableString == null) {
                    spannableString = new SpannableString(charSequence);
                }
                spannableString.removeSpan(characterStyle);
            }
        }
        return spannableString != null ? spannableString : charSequence;
    }
}
