package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

@Metadata
public final class AndroidParagraphIntrinsics_androidKt {
    public static final ParagraphIntrinsics a(String str, TextStyle textStyle, List list, List list2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean c(androidx.compose.ui.text.TextStyle r1) {
        /*
            androidx.compose.ui.text.PlatformTextStyle r1 = r1.w()
            if (r1 == 0) goto L_0x0015
            androidx.compose.ui.text.PlatformParagraphStyle r1 = r1.a()
            if (r1 == 0) goto L_0x0015
            int r1 = r1.b()
            androidx.compose.ui.text.EmojiSupportMatch r1 = androidx.compose.ui.text.EmojiSupportMatch.d(r1)
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            androidx.compose.ui.text.EmojiSupportMatch$Companion r0 = androidx.compose.ui.text.EmojiSupportMatch.f18271b
            int r0 = r0.c()
            if (r1 != 0) goto L_0x0020
            r1 = 0
            goto L_0x0028
        L_0x0020:
            int r1 = r1.j()
            boolean r1 = androidx.compose.ui.text.EmojiSupportMatch.g(r1, r0)
        L_0x0028:
            r1 = r1 ^ 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.c(androidx.compose.ui.text.TextStyle):boolean");
    }

    public static final int d(int i2, LocaleList localeList) {
        Locale locale;
        TextDirection.Companion companion = TextDirection.f19094b;
        if (TextDirection.j(i2, companion.b())) {
            return 2;
        }
        if (!TextDirection.j(i2, companion.c())) {
            if (TextDirection.j(i2, companion.d())) {
                return 0;
            }
            if (TextDirection.j(i2, companion.e())) {
                return 1;
            }
            if (TextDirection.j(i2, companion.a()) ? true : TextDirection.j(i2, companion.f())) {
                if (localeList == null || (locale = localeList.h(0).a()) == null) {
                    locale = Locale.getDefault();
                }
                int a2 = TextUtilsCompat.a(locale);
                if (a2 == 0 || a2 != 1) {
                    return 2;
                }
            } else {
                throw new IllegalStateException("Invalid TextDirection.");
            }
        }
        return 3;
    }
}
