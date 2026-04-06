package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata
public final class TextStyleKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18504a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f18504a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyleKt.WhenMappings.<clinit>():void");
        }
    }

    public static final PlatformTextStyle b(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.a(platformSpanStyle, platformParagraphStyle);
    }

    public static final TextStyle c(TextStyle textStyle, TextStyle textStyle2, float f2) {
        return new TextStyle(SpanStyleKt.c(textStyle.N(), textStyle2.N(), f2), ParagraphStyleKt.b(textStyle.M(), textStyle2.M(), f2));
    }

    public static final TextStyle d(TextStyle textStyle, LayoutDirection layoutDirection) {
        return new TextStyle(SpanStyleKt.h(textStyle.y()), ParagraphStyleKt.e(textStyle.v(), layoutDirection), textStyle.w());
    }

    public static final int e(LayoutDirection layoutDirection, int i2) {
        TextDirection.Companion companion = TextDirection.f19094b;
        if (TextDirection.j(i2, companion.a())) {
            int i3 = WhenMappings.f18504a[layoutDirection.ordinal()];
            if (i3 == 1) {
                return companion.b();
            }
            if (i3 == 2) {
                return companion.c();
            }
            throw new NoWhenBranchMatchedException();
        } else if (!TextDirection.j(i2, companion.f())) {
            return i2;
        } else {
            int i4 = WhenMappings.f18504a[layoutDirection.ordinal()];
            if (i4 == 1) {
                return companion.d();
            }
            if (i4 == 2) {
                return companion.e();
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
