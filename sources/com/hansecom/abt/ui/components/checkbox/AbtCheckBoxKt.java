package com.hansecom.abt.ui.components.checkbox;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AbtCheckBoxKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(boolean r48, kotlin.jvm.functions.Function1 r49, androidx.compose.ui.Modifier r50, boolean r51, androidx.compose.runtime.Composer r52, int r53, int r54) {
        /*
            r5 = r53
            r0 = 172871641(0xa4dcfd9, float:9.909483E-33)
            r1 = r52
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r54 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r5 | 6
            r3 = r2
            r2 = r48
            goto L_0x0029
        L_0x0015:
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r48
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r5
            goto L_0x0029
        L_0x0026:
            r2 = r48
            r3 = r5
        L_0x0029:
            r4 = r54 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r4 = r49
            goto L_0x0044
        L_0x0032:
            r4 = r5 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r49
            boolean r6 = r1.l(r4)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r54 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r7 = r50
            goto L_0x005f
        L_0x004d:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004a
            r7 = r50
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r8
        L_0x005f:
            r8 = r54 & 8
            if (r8 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r9 = r51
            goto L_0x007a
        L_0x0068:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0065
            r9 = r51
            boolean r10 = r1.d(r9)
            if (r10 == 0) goto L_0x0077
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r10
        L_0x007a:
            r10 = r3 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x008d
            boolean r10 = r1.t()
            if (r10 != 0) goto L_0x0087
            goto L_0x008d
        L_0x0087:
            r1.B()
            r3 = r7
            goto L_0x014b
        L_0x008d:
            if (r6 == 0) goto L_0x0093
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            r15 = r6
            goto L_0x0094
        L_0x0093:
            r15 = r7
        L_0x0094:
            if (r8 == 0) goto L_0x009a
            r6 = 1
            r16 = r6
            goto L_0x009c
        L_0x009a:
            r16 = r9
        L_0x009c:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x00a8
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.ui.components.checkbox.AbtCheckBox (AbtCheckBox.kt:21)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r6, r7)
        L_0x00a8:
            androidx.compose.material3.CheckboxDefaults r0 = androidx.compose.material3.CheckboxDefaults.f9383a
            int r6 = androidx.compose.material3.CheckboxDefaults.f9385c
            androidx.compose.material3.CheckboxColors r17 = r0.a(r1, r6)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r6 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r0.b(r1, r6)
            long r32 = r7.x()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r0.b(r1, r6)
            long r34 = r7.x()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r0.b(r1, r6)
            long r18 = r7.a()
            r24 = 14
            r25 = 0
            r20 = 1052938076(0x3ec28f5c, float:0.38)
            r21 = 0
            r22 = 0
            r23 = 0
            long r38 = androidx.compose.ui.graphics.Color.l(r18, r20, r21, r22, r23, r24, r25)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r0.b(r1, r6)
            long r18 = r7.z()
            androidx.compose.ui.graphics.Color$Companion r7 = androidx.compose.ui.graphics.Color.f15975b
            long r20 = r7.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r22 = r8.x()
            long r24 = r7.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r40 = r8.x()
            r46 = 14
            r47 = 0
            r42 = 1052938076(0x3ec28f5c, float:0.38)
            r43 = 0
            r44 = 0
            r45 = 0
            long r26 = androidx.compose.ui.graphics.Color.l(r40, r42, r43, r44, r45, r46, r47)
            long r28 = r7.e()
            long r30 = r7.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r0.b(r1, r6)
            long r40 = r7.x()
            long r36 = androidx.compose.ui.graphics.Color.l(r40, r42, r43, r44, r45, r46, r47)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r1, r6)
            long r40 = r0.a()
            androidx.compose.material3.CheckboxColors r10 = r17.e(r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40)
            r13 = r3 & 8190(0x1ffe, float:1.1477E-41)
            r14 = 32
            r11 = 0
            r6 = r48
            r7 = r49
            r8 = r15
            r9 = r16
            r12 = r1
            androidx.compose.material3.CheckboxKt.f(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0148
            androidx.compose.runtime.ComposerKt.X()
        L_0x0148:
            r3 = r15
            r9 = r16
        L_0x014b:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x0163
            com.hansecom.abt.ui.components.checkbox.a r8 = new com.hansecom.abt.ui.components.checkbox.a
            r0 = r8
            r1 = r48
            r2 = r49
            r4 = r9
            r5 = r53
            r6 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.checkbox.AbtCheckBoxKt.b(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(boolean z2, Function1 function1, Modifier modifier, boolean z3, int i2, int i3, Composer composer, int i4) {
        b(z2, function1, modifier, z3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
