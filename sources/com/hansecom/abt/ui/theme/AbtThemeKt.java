package com.hansecom.abt.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AbtThemeKt {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if ((r14 & 1) != 0) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(boolean r10, kotlin.jvm.functions.Function2 r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = -1571549420(0xffffffffa2540f14, float:-2.873934E-18)
            androidx.compose.runtime.Composer r12 = r12.q(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x001f
            r1 = r14 & 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r12.d(r10)
            if (r1 == 0) goto L_0x001c
            r1 = 4
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r13
            goto L_0x0020
        L_0x001f:
            r1 = r13
        L_0x0020:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0027
            r1 = r1 | 48
            goto L_0x0037
        L_0x0027:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0037
            boolean r2 = r12.l(r11)
            if (r2 == 0) goto L_0x0034
            r2 = 32
            goto L_0x0036
        L_0x0034:
            r2 = 16
        L_0x0036:
            r1 = r1 | r2
        L_0x0037:
            r2 = r1 & 19
            r3 = 18
            if (r2 != r3) goto L_0x0049
            boolean r2 = r12.t()
            if (r2 != 0) goto L_0x0044
            goto L_0x0049
        L_0x0044:
            r12.B()
            goto L_0x00be
        L_0x0049:
            r12.p()
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0061
            boolean r2 = r12.J()
            if (r2 == 0) goto L_0x0057
            goto L_0x0061
        L_0x0057:
            r12.B()
            r2 = r14 & 1
            if (r2 == 0) goto L_0x006b
        L_0x005e:
            r1 = r1 & -15
            goto L_0x006b
        L_0x0061:
            r2 = r14 & 1
            if (r2 == 0) goto L_0x006b
            r10 = 0
            boolean r10 = androidx.compose.foundation.DarkThemeKt.a(r12, r10)
            goto L_0x005e
        L_0x006b:
            r12.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x007a
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.theme.AbtTheme (AbtTheme.kt:7)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x007a:
            com.hansecom.abt.ui.theme.OctaColorSchemes r0 = com.hansecom.abt.ui.theme.OctaColorSchemes.f38891b
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.c(r10)
            r2 = -92944498(0xfffffffffa75c78e, float:-3.1904005E35)
            r12.X(r2)
            java.lang.Object r2 = r12.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0099
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = com.hansecom.abt.ui.theme.OctaTypographyKt.a()
            r12.N(r2)
        L_0x0099:
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = (com.hansecom.abt.ui.theme.typography.AbtTypography) r2
            r12.M()
            com.hansecom.abt.ui.theme.OctaMenuItemStyle r3 = com.hansecom.abt.ui.theme.OctaMenuItemStyle.f38897a
            com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle r4 = r3.a(r10)
            int r1 = r1 << 12
            r3 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r3
            r8 = r1 | 48
            r9 = 20
            r3 = 0
            r5 = 0
            r1 = r0
            r6 = r11
            r7 = r12
            com.hansecom.abt.ui.theme.AbtBaseThemeKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00be
            androidx.compose.runtime.ComposerKt.X()
        L_0x00be:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x00cc
            com.hansecom.abt.ui.theme.f r0 = new com.hansecom.abt.ui.theme.f
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.theme.AbtThemeKt.b(boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(boolean z2, Function2 function2, int i2, int i3, Composer composer, int i4) {
        b(z2, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
