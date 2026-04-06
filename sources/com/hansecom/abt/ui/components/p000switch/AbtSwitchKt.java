package com.hansecom.abt.ui.components.p000switch;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.switch.AbtSwitchKt  reason: invalid package */
public final class AbtSwitchKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(boolean r53, kotlin.jvm.functions.Function1 r54, androidx.compose.ui.Modifier r55, boolean r56, androidx.compose.runtime.Composer r57, int r58, int r59) {
        /*
            r5 = r58
            r0 = 1693270570(0x64ed422a, float:3.5013168E22)
            r1 = r57
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r59 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r5 | 6
            r3 = r2
            r2 = r53
            goto L_0x0029
        L_0x0015:
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r53
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
            r2 = r53
            r3 = r5
        L_0x0029:
            r4 = r59 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r4 = r54
            goto L_0x0044
        L_0x0032:
            r4 = r5 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r54
            boolean r6 = r1.l(r4)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r59 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r7 = r55
            goto L_0x005f
        L_0x004d:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004a
            r7 = r55
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r8
        L_0x005f:
            r8 = r59 & 8
            if (r8 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r9 = r56
            goto L_0x007a
        L_0x0068:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0065
            r9 = r56
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
            goto L_0x01bf
        L_0x008d:
            if (r6 == 0) goto L_0x0094
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            r16 = r6
            goto L_0x0096
        L_0x0094:
            r16 = r7
        L_0x0096:
            if (r8 == 0) goto L_0x009c
            r6 = 1
            r17 = r6
            goto L_0x009e
        L_0x009c:
            r17 = r9
        L_0x009e:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x00aa
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.ui.components.switch.AbtSwitch (AbtSwitch.kt:21)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r6, r7)
        L_0x00aa:
            androidx.compose.material3.SwitchDefaults r0 = androidx.compose.material3.SwitchDefaults.f11247a
            int r6 = androidx.compose.material3.SwitchDefaults.f11249c
            androidx.compose.material3.SwitchColors r18 = r0.a(r1, r6)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r6 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r0.b(r1, r6)
            long r19 = r7.o()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r0.b(r1, r6)
            long r21 = r7.x()
            androidx.compose.ui.graphics.Color$Companion r7 = androidx.compose.ui.graphics.Color.f15975b
            long r23 = r7.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r25 = r8.o()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r27 = r8.o()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r29 = r8.a()
            r35 = 14
            r36 = 0
            r31 = 1053609165(0x3ecccccd, float:0.4)
            r32 = 0
            r33 = 0
            r34 = 0
            long r29 = androidx.compose.ui.graphics.Color.l(r29, r31, r32, r33, r34, r35, r36)
            long r31 = r7.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r33 = r8.o()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r35 = r8.o()
            r41 = 14
            r42 = 0
            r37 = 1053609165(0x3ecccccd, float:0.4)
            r38 = 0
            r39 = 0
            r40 = 0
            long r35 = androidx.compose.ui.graphics.Color.l(r35, r37, r38, r39, r40, r41, r42)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r37 = r8.x()
            r43 = 14
            r44 = 0
            r39 = 1053609165(0x3ecccccd, float:0.4)
            r41 = 0
            r42 = 0
            long r37 = androidx.compose.ui.graphics.Color.l(r37, r39, r40, r41, r42, r43, r44)
            long r39 = r7.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r41 = r8.o()
            r47 = 14
            r48 = 0
            r43 = 1053609165(0x3ecccccd, float:0.4)
            r44 = 0
            r45 = 0
            r46 = 0
            long r41 = androidx.compose.ui.graphics.Color.l(r41, r43, r44, r45, r46, r47, r48)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r43 = r8.o()
            r49 = 14
            r50 = 0
            r45 = 1053609165(0x3ecccccd, float:0.4)
            r47 = 0
            r48 = 0
            long r43 = androidx.compose.ui.graphics.Color.l(r43, r45, r46, r47, r48, r49, r50)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r0.b(r1, r6)
            long r45 = r8.a()
            r51 = 14
            r52 = 0
            r47 = 1053609165(0x3ecccccd, float:0.4)
            r49 = 0
            r50 = 0
            long r45 = androidx.compose.ui.graphics.Color.l(r45, r47, r48, r49, r50, r51, r52)
            long r47 = r7.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r1, r6)
            long r6 = r0.o()
            r12 = 14
            r13 = 0
            r8 = 1053609165(0x3ecccccd, float:0.4)
            r9 = 0
            r10 = 0
            r11 = 0
            long r49 = androidx.compose.ui.graphics.Color.l(r6, r8, r9, r10, r11, r12, r13)
            androidx.compose.material3.SwitchColors r11 = r18.b(r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49)
            r0 = r3 & 1022(0x3fe, float:1.432E-42)
            int r3 = r3 << 3
            r6 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r6
            r14 = r0 | r3
            r15 = 72
            r9 = 0
            r12 = 0
            r6 = r53
            r7 = r54
            r8 = r16
            r10 = r17
            r13 = r1
            androidx.compose.material3.SwitchKt.c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01bb
            androidx.compose.runtime.ComposerKt.X()
        L_0x01bb:
            r3 = r16
            r9 = r17
        L_0x01bf:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x01d7
            com.hansecom.abt.ui.components.switch.a r8 = new com.hansecom.abt.ui.components.switch.a
            r0 = r8
            r1 = r53
            r2 = r54
            r4 = r9
            r5 = r58
            r6 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.p000switch.AbtSwitchKt.b(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(boolean z2, Function1 function1, Modifier modifier, boolean z3, int i2, int i3, Composer composer, int i4) {
        b(z2, function1, modifier, z3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
