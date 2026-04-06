package androidx.compose.ui.text.font;

import kotlin.Metadata;

@Metadata
public final class FontSynthesis_androidKt {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(int r5, java.lang.Object r6, androidx.compose.ui.text.font.Font r7, androidx.compose.ui.text.font.FontWeight r8, int r9) {
        /*
            boolean r0 = r6 instanceof android.graphics.Typeface
            if (r0 != 0) goto L_0x0005
            return r6
        L_0x0005:
            boolean r0 = androidx.compose.ui.text.font.FontSynthesis.k(r5)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0033
            androidx.compose.ui.text.font.FontWeight r0 = r7.a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r8)
            if (r0 != 0) goto L_0x0033
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r3 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.a(r0)
            int r3 = r8.compareTo(r3)
            if (r3 < 0) goto L_0x0033
            androidx.compose.ui.text.font.FontWeight r3 = r7.a()
            androidx.compose.ui.text.font.FontWeight r0 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.a(r0)
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L_0x0033
            r0 = r2
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            boolean r5 = androidx.compose.ui.text.font.FontSynthesis.j(r5)
            if (r5 == 0) goto L_0x0046
            int r5 = r7.c()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.f(r9, r5)
            if (r5 != 0) goto L_0x0046
            r5 = r2
            goto L_0x0047
        L_0x0046:
            r5 = r1
        L_0x0047:
            if (r5 != 0) goto L_0x004c
            if (r0 != 0) goto L_0x004c
            return r6
        L_0x004c:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 >= r4) goto L_0x006c
            if (r5 == 0) goto L_0x0061
            androidx.compose.ui.text.font.FontStyle$Companion r5 = androidx.compose.ui.text.font.FontStyle.f18724b
            int r5 = r5.a()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.f(r9, r5)
            if (r5 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            int r5 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.b(r0, r1)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            goto L_0x009e
        L_0x006c:
            if (r0 == 0) goto L_0x0073
            int r8 = r8.y()
            goto L_0x007b
        L_0x0073:
            androidx.compose.ui.text.font.FontWeight r8 = r7.a()
            int r8 = r8.y()
        L_0x007b:
            if (r5 == 0) goto L_0x0088
            androidx.compose.ui.text.font.FontStyle$Companion r5 = androidx.compose.ui.text.font.FontStyle.f18724b
            int r5 = r5.a()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.f(r9, r5)
            goto L_0x0096
        L_0x0088:
            int r5 = r7.c()
            androidx.compose.ui.text.font.FontStyle$Companion r7 = androidx.compose.ui.text.font.FontStyle.f18724b
            int r7 = r7.a()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.f(r5, r7)
        L_0x0096:
            androidx.compose.ui.text.font.TypefaceHelperMethodsApi28 r7 = androidx.compose.ui.text.font.TypefaceHelperMethodsApi28.f18765a
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = r7.a(r6, r8, r5)
        L_0x009e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontSynthesis_androidKt.a(int, java.lang.Object, androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.FontWeight, int):java.lang.Object");
    }
}
