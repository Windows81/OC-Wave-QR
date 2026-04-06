package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;

@Metadata
public final class AndroidParagraphHelper_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidParagraphHelper_androidKt$NoopSpan$1 f18951a = new AndroidParagraphHelper_androidKt$NoopSpan$1();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r15 = r15.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence a(java.lang.String r8, float r9, androidx.compose.ui.text.TextStyle r10, java.util.List r11, java.util.List r12, androidx.compose.ui.unit.Density r13, kotlin.jvm.functions.Function4 r14, boolean r15) {
        /*
            r0 = 0
            if (r15 == 0) goto L_0x0047
            boolean r15 = androidx.emoji2.text.EmojiCompat.k()
            if (r15 == 0) goto L_0x0047
            androidx.compose.ui.text.PlatformTextStyle r15 = r10.w()
            if (r15 == 0) goto L_0x001e
            androidx.compose.ui.text.PlatformParagraphStyle r15 = r15.a()
            if (r15 == 0) goto L_0x001e
            int r15 = r15.b()
            androidx.compose.ui.text.EmojiSupportMatch r15 = androidx.compose.ui.text.EmojiSupportMatch.d(r15)
            goto L_0x001f
        L_0x001e:
            r15 = 0
        L_0x001f:
            androidx.compose.ui.text.EmojiSupportMatch$Companion r1 = androidx.compose.ui.text.EmojiSupportMatch.f18271b
            int r1 = r1.a()
            if (r15 != 0) goto L_0x0029
            r6 = r0
            goto L_0x0032
        L_0x0029:
            int r15 = r15.j()
            boolean r15 = androidx.compose.ui.text.EmojiSupportMatch.g(r15, r1)
            r6 = r15
        L_0x0032:
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.c()
            int r4 = r8.length()
            r5 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r2 = r8
            java.lang.CharSequence r15 = r1.u(r2, r3, r4, r5, r6)
            kotlin.jvm.internal.Intrinsics.f(r15)
            goto L_0x0048
        L_0x0047:
            r15 = r8
        L_0x0048:
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x0073
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x0073
            androidx.compose.ui.text.style.TextIndent r1 = r10.D()
            androidx.compose.ui.text.style.TextIndent$Companion r2 = androidx.compose.ui.text.style.TextIndent.f19111c
            androidx.compose.ui.text.style.TextIndent r2 = r2.a()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 == 0) goto L_0x0073
            long r1 = r10.s()
            long r1 = androidx.compose.ui.unit.TextUnit.f(r1)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0073
            return r15
        L_0x0073:
            boolean r1 = r15 instanceof android.text.Spannable
            if (r1 == 0) goto L_0x007a
            android.text.Spannable r15 = (android.text.Spannable) r15
            goto L_0x0080
        L_0x007a:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r15)
            r15 = r1
        L_0x0080:
            androidx.compose.ui.text.style.TextDecoration r1 = r10.A()
            androidx.compose.ui.text.style.TextDecoration$Companion r2 = androidx.compose.ui.text.style.TextDecoration.f19089b
            androidx.compose.ui.text.style.TextDecoration r2 = r2.d()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 == 0) goto L_0x0099
            androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1 r1 = f18951a
            int r8 = r8.length()
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.w(r15, r1, r0, r8)
        L_0x0099:
            boolean r8 = b(r10)
            if (r8 == 0) goto L_0x00ad
            androidx.compose.ui.text.style.LineHeightStyle r8 = r10.t()
            if (r8 != 0) goto L_0x00ad
            long r0 = r10.s()
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.t(r15, r0, r9, r13)
            goto L_0x00c4
        L_0x00ad:
            androidx.compose.ui.text.style.LineHeightStyle r8 = r10.t()
            if (r8 != 0) goto L_0x00b9
            androidx.compose.ui.text.style.LineHeightStyle$Companion r8 = androidx.compose.ui.text.style.LineHeightStyle.f19056d
            androidx.compose.ui.text.style.LineHeightStyle r8 = r8.a()
        L_0x00b9:
            r7 = r8
            long r3 = r10.s()
            r2 = r15
            r5 = r9
            r6 = r13
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.s(r2, r3, r5, r6, r7)
        L_0x00c4:
            androidx.compose.ui.text.style.TextIndent r8 = r10.D()
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.A(r15, r8, r9, r13)
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.y(r15, r10, r11, r13, r14)
            androidx.compose.ui.text.style.TextIndent r8 = r10.D()
            androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.l(r15, r11, r9, r13, r8)
            androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt.d(r15, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt.a(java.lang.String, float, androidx.compose.ui.text.TextStyle, java.util.List, java.util.List, androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function4, boolean):java.lang.CharSequence");
    }

    public static final boolean b(TextStyle textStyle) {
        PlatformParagraphStyle a2;
        PlatformTextStyle w2 = textStyle.w();
        if (w2 == null || (a2 = w2.a()) == null) {
            return false;
        }
        return a2.c();
    }
}
