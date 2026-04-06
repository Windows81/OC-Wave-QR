package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import kotlin.Metadata;

@Metadata
public final class HandwritingGesture_androidKt {
    public static final boolean A(int i2) {
        int type = Character.getType(i2);
        return type == 14 || type == 13 || i2 == 10;
    }

    public static final boolean B(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean C(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean D(int i2) {
        return C(i2) && !A(i2);
    }

    public static final long E(CharSequence charSequence, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            int c2 = CodepointHelpers_jvmKt.c(charSequence, i3);
            if (!C(c2)) {
                break;
            }
            i3 -= Character.charCount(c2);
        }
        while (i2 < charSequence.length()) {
            int b2 = CodepointHelpers_jvmKt.b(charSequence, i2);
            if (!C(b2)) {
                break;
            }
            i2 += CodepointHelpers_jvmKt.a(b2);
        }
        return TextRangeKt.b(i3, i2);
    }

    public static final long F(PointF pointF) {
        return Offset.e((((long) Float.floatToRawIntBits(pointF.x)) << 32) | (((long) Float.floatToRawIntBits(pointF.y)) & 4294967295L));
    }

    public static final long m(long j2, CharSequence charSequence) {
        int n2 = TextRange.n(j2);
        int i2 = TextRange.i(j2);
        int i3 = 10;
        int codePointBefore = n2 > 0 ? Character.codePointBefore(charSequence, n2) : 10;
        if (i2 < charSequence.length()) {
            i3 = Character.codePointAt(charSequence, i2);
        }
        if (D(codePointBefore) && (C(i3) || B(i3))) {
            do {
                n2 -= Character.charCount(codePointBefore);
                if (n2 == 0) {
                    break;
                }
                codePointBefore = Character.codePointBefore(charSequence, n2);
            } while (D(codePointBefore));
            return TextRangeKt.b(n2, i2);
        } else if (!D(i3)) {
            return j2;
        } else {
            if (!C(codePointBefore) && !B(codePointBefore)) {
                return j2;
            }
            do {
                i2 += Character.charCount(i3);
                if (i2 == charSequence.length()) {
                    break;
                }
                i3 = Character.codePointAt(charSequence, i2);
            } while (D(i3));
            return TextRangeKt.b(n2, i2);
        }
    }

    public static final EditCommand n(EditCommand... editCommandArr) {
        return new HandwritingGesture_androidKt$compoundEditCommand$1(editCommandArr);
    }

    public static final long o(long j2, long j3) {
        return TextRangeKt.b(Math.min(TextRange.n(j2), TextRange.n(j2)), Math.max(TextRange.i(j3), TextRange.i(j3)));
    }

    public static final int p(MultiParagraph multiParagraph, long j2, ViewConfiguration viewConfiguration) {
        float h2 = viewConfiguration != null ? viewConfiguration.h() : 0.0f;
        int i2 = (int) (4294967295L & j2);
        int q2 = multiParagraph.q(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) >= multiParagraph.v(q2) - h2 && Float.intBitsToFloat(i2) <= multiParagraph.l(q2) + h2) {
            int i3 = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i3) < (-h2) || Float.intBitsToFloat(i3) > multiParagraph.D() + h2) {
                return -1;
            }
            return q2;
        }
        return -1;
    }

    public static final int q(LegacyTextFieldState legacyTextFieldState, long j2, ViewConfiguration viewConfiguration) {
        TextLayoutResult f2;
        MultiParagraph w2;
        TextLayoutResultProxy l2 = legacyTextFieldState.l();
        if (l2 == null || (f2 = l2.f()) == null || (w2 = f2.w()) == null) {
            return -1;
        }
        return s(w2, j2, legacyTextFieldState.k(), viewConfiguration);
    }

    public static final int r(TextLayoutState textLayoutState, long j2, ViewConfiguration viewConfiguration) {
        MultiParagraph w2;
        TextLayoutResult f2 = textLayoutState.f();
        if (f2 == null || (w2 = f2.w()) == null) {
            return -1;
        }
        return s(w2, j2, textLayoutState.j(), viewConfiguration);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r10.w(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int s(androidx.compose.ui.text.MultiParagraph r7, long r8, androidx.compose.ui.layout.LayoutCoordinates r10, androidx.compose.ui.platform.ViewConfiguration r11) {
        /*
            r0 = -1
            if (r10 == 0) goto L_0x0027
            long r1 = r10.w(r8)
            int r8 = p(r7, r1, r11)
            if (r8 != r0) goto L_0x000e
            return r0
        L_0x000e:
            float r9 = r7.v(r8)
            float r8 = r7.l(r8)
            float r9 = r9 + r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r4 = r9 / r8
            r5 = 1
            r6 = 0
            r3 = 0
            long r8 = androidx.compose.ui.geometry.Offset.g(r1, r3, r4, r5, r6)
            int r7 = r7.x(r8)
            return r7
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.s(androidx.compose.ui.text.MultiParagraph, long, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.platform.ViewConfiguration):int");
    }

    public static final long t(TextLayoutResult textLayoutResult, long j2, long j3, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.f18496b.a();
        }
        long w2 = layoutCoordinates.w(j2);
        long w3 = layoutCoordinates.w(j3);
        int p2 = p(textLayoutResult.w(), w2, viewConfiguration);
        int p3 = p(textLayoutResult.w(), w3, viewConfiguration);
        if (p2 != -1) {
            if (p3 != -1) {
                p2 = Math.min(p2, p3);
            }
            p3 = p2;
        } else if (p3 == -1) {
            return TextRange.f18496b.a();
        }
        float v2 = (textLayoutResult.v(p3) + textLayoutResult.m(p3)) / ((float) 2);
        int i2 = (int) (w2 >> 32);
        int i3 = (int) (w3 >> 32);
        return textLayoutResult.w().C(new Rect(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), v2 - 0.1f, Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), v2 + 0.1f), TextGranularity.f18455b.a(), TextInclusionStrategy.f18459a.g());
    }

    public static final long u(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i2, TextInclusionStrategy textInclusionStrategy) {
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.f18496b.a() : multiParagraph.C(rect.B(layoutCoordinates.w(Offset.f15855b.c())), i2, textInclusionStrategy);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long v(androidx.compose.foundation.text.LegacyTextFieldState r1, androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.text.TextInclusionStrategy r4) {
        /*
            androidx.compose.foundation.text.TextLayoutResultProxy r0 = r1.l()
            if (r0 == 0) goto L_0x0011
            androidx.compose.ui.text.TextLayoutResult r0 = r0.f()
            if (r0 == 0) goto L_0x0011
            androidx.compose.ui.text.MultiParagraph r0 = r0.w()
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            androidx.compose.ui.layout.LayoutCoordinates r1 = r1.k()
            long r1 = u(r0, r2, r1, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.v(androidx.compose.foundation.text.LegacyTextFieldState, androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.text.TextInclusionStrategy):long");
    }

    public static final long w(TextLayoutState textLayoutState, Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult f2 = textLayoutState.f();
        return u(f2 != null ? f2.w() : null, rect, textLayoutState.j(), i2, textInclusionStrategy);
    }

    public static final long x(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i2, TextInclusionStrategy textInclusionStrategy) {
        long v2 = v(legacyTextFieldState, rect, i2, textInclusionStrategy);
        if (TextRange.h(v2)) {
            return TextRange.f18496b.a();
        }
        long v3 = v(legacyTextFieldState, rect2, i2, textInclusionStrategy);
        return TextRange.h(v3) ? TextRange.f18496b.a() : o(v2, v3);
    }

    public static final long y(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i2, TextInclusionStrategy textInclusionStrategy) {
        long w2 = w(textLayoutState, rect, i2, textInclusionStrategy);
        if (TextRange.h(w2)) {
            return TextRange.f18496b.a();
        }
        long w3 = w(textLayoutState, rect2, i2, textInclusionStrategy);
        return TextRange.h(w3) ? TextRange.f18496b.a() : o(w2, w3);
    }

    public static final boolean z(TextLayoutResult textLayoutResult, int i2) {
        int q2 = textLayoutResult.q(i2);
        return (i2 == textLayoutResult.u(q2) || i2 == TextLayoutResult.p(textLayoutResult, q2, false, 2, (Object) null)) ? textLayoutResult.y(i2) != textLayoutResult.c(i2) : textLayoutResult.c(i2) != textLayoutResult.c(i2 - 1);
    }
}
