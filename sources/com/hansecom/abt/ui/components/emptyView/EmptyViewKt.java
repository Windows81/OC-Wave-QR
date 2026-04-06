package com.hansecom.abt.ui.components.emptyView;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class EmptyViewKt {
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.Modifier r38, java.lang.Integer r39, java.lang.String r40, java.lang.CharSequence r41, java.lang.String r42, java.lang.String r43, java.lang.Integer r44, kotlin.jvm.functions.Function0 r45, boolean r46, androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            r1 = r38
            r2 = r39
            r0 = r40
            r3 = r41
            r15 = r48
            r13 = r49
            r4 = 128(0x80, float:1.794E-43)
            r5 = 32
            r14 = 16
            r6 = 2
            r7 = 4
            r12 = 48
            r8 = 256(0x100, float:3.59E-43)
            r11 = 6
            java.lang.String r9 = "modifier"
            kotlin.jvm.internal.Intrinsics.i(r1, r9)
            java.lang.String r9 = "title"
            kotlin.jvm.internal.Intrinsics.i(r0, r9)
            java.lang.String r9 = "description"
            kotlin.jvm.internal.Intrinsics.i(r3, r9)
            r9 = 2028152107(0x78e3252b, float:3.6856414E34)
            r10 = r47
            androidx.compose.runtime.Composer r10 = r10.q(r9)
            r9 = 1
            r17 = r13 & 1
            if (r17 == 0) goto L_0x0039
            r17 = r15 | 6
            goto L_0x004d
        L_0x0039:
            r17 = r15 & 6
            if (r17 != 0) goto L_0x004b
            boolean r17 = r10.W(r1)
            if (r17 == 0) goto L_0x0046
            r17 = r7
            goto L_0x0048
        L_0x0046:
            r17 = r6
        L_0x0048:
            r17 = r15 | r17
            goto L_0x004d
        L_0x004b:
            r17 = r15
        L_0x004d:
            r6 = r6 & r13
            if (r6 == 0) goto L_0x0055
            r17 = r17 | 48
        L_0x0052:
            r6 = r17
            goto L_0x0065
        L_0x0055:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0052
            boolean r6 = r10.W(r2)
            if (r6 == 0) goto L_0x0061
            r6 = r5
            goto L_0x0062
        L_0x0061:
            r6 = r14
        L_0x0062:
            r17 = r17 | r6
            goto L_0x0052
        L_0x0065:
            r7 = r7 & r13
            if (r7 == 0) goto L_0x006b
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0079
        L_0x006b:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0079
            boolean r7 = r10.W(r0)
            if (r7 == 0) goto L_0x0077
            r7 = r8
            goto L_0x0078
        L_0x0077:
            r7 = r4
        L_0x0078:
            r6 = r6 | r7
        L_0x0079:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0080
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0090
        L_0x0080:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0090
            boolean r7 = r10.l(r3)
            if (r7 == 0) goto L_0x008d
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x008f
        L_0x008d:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x008f:
            r6 = r6 | r7
        L_0x0090:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0099
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0096:
            r14 = r42
            goto L_0x00ac
        L_0x0099:
            r14 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0096
            r14 = r42
            boolean r17 = r10.W(r14)
            if (r17 == 0) goto L_0x00a8
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00aa
        L_0x00a8:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00aa:
            r6 = r6 | r17
        L_0x00ac:
            r17 = r13 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00b7
            r6 = r6 | r18
            r5 = r43
            goto L_0x00ca
        L_0x00b7:
            r18 = r15 & r18
            r5 = r43
            if (r18 != 0) goto L_0x00ca
            boolean r18 = r10.W(r5)
            if (r18 == 0) goto L_0x00c6
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c8
        L_0x00c6:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c8:
            r6 = r6 | r18
        L_0x00ca:
            r18 = r13 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00d5
            r6 = r6 | r19
            r12 = r44
            goto L_0x00e8
        L_0x00d5:
            r19 = r15 & r19
            r12 = r44
            if (r19 != 0) goto L_0x00e8
            boolean r19 = r10.W(r12)
            if (r19 == 0) goto L_0x00e4
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r6 = r6 | r19
        L_0x00e8:
            r4 = r4 & r13
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00f2
            r6 = r6 | r19
            r11 = r45
            goto L_0x0105
        L_0x00f2:
            r19 = r15 & r19
            r11 = r45
            if (r19 != 0) goto L_0x0105
            boolean r19 = r10.l(r11)
            if (r19 == 0) goto L_0x0101
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0103
        L_0x0101:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0103:
            r6 = r6 | r19
        L_0x0105:
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r19 = r15 & r19
            if (r19 != 0) goto L_0x0121
            r9 = r13 & 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x011a
            r9 = r46
            boolean r19 = r10.d(r9)
            if (r19 == 0) goto L_0x011c
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011a:
            r9 = r46
        L_0x011c:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r6 = r6 | r19
            goto L_0x0123
        L_0x0121:
            r9 = r46
        L_0x0123:
            r19 = 38347923(0x2492493, float:1.4777644E-37)
            r8 = r6 & r19
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r8 != r0) goto L_0x013e
            boolean r0 = r10.t()
            if (r0 != 0) goto L_0x0134
            goto L_0x013e
        L_0x0134:
            r10.B()
            r6 = r5
            r4 = r10
            r8 = r11
            r7 = r12
            r5 = r14
            goto L_0x038e
        L_0x013e:
            r10.p()
            r0 = 1
            r8 = r15 & 1
            r0 = 0
            r15 = 0
            if (r8 == 0) goto L_0x0166
            boolean r8 = r10.J()
            if (r8 == 0) goto L_0x014f
            goto L_0x0166
        L_0x014f:
            r10.B()
            r4 = 256(0x100, float:3.59E-43)
            r4 = r4 & r13
            if (r4 == 0) goto L_0x015b
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r4
        L_0x015b:
            r34 = r9
        L_0x015d:
            r33 = r11
            r32 = r12
            r31 = r14
            r14 = r5
            r12 = r6
            goto L_0x018d
        L_0x0166:
            if (r7 == 0) goto L_0x0169
            r14 = r15
        L_0x0169:
            if (r17 == 0) goto L_0x016c
            r5 = r15
        L_0x016c:
            if (r18 == 0) goto L_0x016f
            r12 = r15
        L_0x016f:
            if (r4 == 0) goto L_0x0172
            r11 = r15
        L_0x0172:
            r4 = 256(0x100, float:3.59E-43)
            r4 = r4 & r13
            if (r4 == 0) goto L_0x015b
            if (r11 == 0) goto L_0x0187
            if (r14 == 0) goto L_0x0187
            int r4 = r14.length()
            if (r4 != 0) goto L_0x0182
            goto L_0x0187
        L_0x0182:
            r4 = 1
        L_0x0183:
            r7 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            goto L_0x0189
        L_0x0187:
            r4 = r0
            goto L_0x0183
        L_0x0189:
            r6 = r6 & r7
            r34 = r4
            goto L_0x015d
        L_0x018d:
            r10.U()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x019f
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.ui.components.emptyView.EmptyView (EmptyView.kt:32)"
            r6 = 2028152107(0x78e3252b, float:3.6856414E34)
            androidx.compose.runtime.ComposerKt.Y(r6, r12, r4, r5)
        L_0x019f:
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r4 = r4.b()
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r5 = r5.g()
            r6 = 54
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.ColumnKt.a(r4, r5, r10, r6)
            int r5 = androidx.compose.runtime.ComposablesKt.a(r10, r0)
            androidx.compose.runtime.CompositionLocalMap r6 = r10.I()
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.ComposedModifierKt.e(r10, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r9 = r8.a()
            androidx.compose.runtime.Applier r11 = r10.v()
            if (r11 != 0) goto L_0x01cc
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01cc:
            r10.s()
            boolean r11 = r10.n()
            if (r11 == 0) goto L_0x01d9
            r10.y(r9)
            goto L_0x01dc
        L_0x01d9:
            r10.K()
        L_0x01dc:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r11 = r8.c()
            androidx.compose.runtime.Updater.g(r9, r4, r11)
            kotlin.jvm.functions.Function2 r4 = r8.e()
            androidx.compose.runtime.Updater.g(r9, r6, r4)
            kotlin.jvm.functions.Function2 r4 = r8.b()
            boolean r6 = r9.n()
            if (r6 != 0) goto L_0x0206
            java.lang.Object r6 = r9.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r11)
            if (r6 != 0) goto L_0x0214
        L_0x0206:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.N(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.A(r5, r4)
        L_0x0214:
            kotlin.jvm.functions.Function2 r4 = r8.d()
            androidx.compose.runtime.Updater.g(r9, r7, r4)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r4 = 1321583849(0x4ec5c4e9, float:1.65900813E9)
            r10.X(r4)
            if (r2 != 0) goto L_0x0226
            goto L_0x0251
        L_0x0226:
            int r4 = r39.intValue()
            androidx.compose.ui.graphics.painter.Painter r16 = androidx.compose.ui.res.PainterResources_androidKt.c(r4, r10, r0)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r4 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r10, r4)
            long r19 = r0.x()
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r4 = 48
            float r5 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.ui.Modifier r18 = androidx.compose.foundation.layout.SizeKt.t(r0, r4)
            r22 = 432(0x1b0, float:6.05E-43)
            r23 = 0
            r17 = 0
            r21 = r10
            androidx.compose.material3.IconKt.d(r16, r17, r18, r19, r21, r22, r23)
        L_0x0251:
            r10.M()
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r4 = 32
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.t(r0, r4)
            r11 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r4, r10, r11)
            r8 = 0
            r9 = 1
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r0, r8, r9, r15)
            androidx.compose.ui.text.style.TextAlign$Companion r30 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r7 = r30.a()
            com.hansecom.abt.ui.theme.AbtTheme r5 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r5.b(r10, r11)
            long r16 = r6.q()
            r15 = r5
            r5 = r16
            com.hansecom.abt.ui.theme.typography.AbtTypography r16 = r15.d(r10, r11)
            androidx.compose.ui.text.TextStyle r24 = r16.l()
            androidx.compose.ui.text.style.TextAlign r16 = androidx.compose.ui.text.style.TextAlign.h(r7)
            int r7 = r12 >> 6
            r7 = r7 & 14
            r17 = 48
            r26 = r7 | 48
            r27 = 0
            r28 = 130040(0x1fbf8, float:1.82225E-40)
            r7 = 0
            r18 = 0
            r8 = r18
            r18 = 0
            r42 = r10
            r10 = r18
            r11 = r18
            r29 = r12
            r35 = r17
            r12 = r18
            r17 = 0
            r36 = r14
            r13 = r17
            r17 = 0
            r37 = r15
            r15 = r17
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r3 = r40
            r25 = r42
            androidx.compose.material3.TextKt.j(r3, r4, r5, r7, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3 = 16
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.t(r0, r3)
            r14 = r42
            r12 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r3, r14, r12)
            r3 = 1
            r11 = 0
            r13 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r0, r11, r3, r13)
            int r5 = r30.a()
            r6 = r37
            com.hansecom.abt.ui.theme.typography.AbtTypography r6 = r6.d(r14, r12)
            androidx.compose.ui.text.TextStyle r23 = r6.b()
            androidx.compose.ui.text.style.TextAlign r15 = androidx.compose.ui.text.style.TextAlign.h(r5)
            int r5 = r29 >> 9
            r5 = r5 & 14
            r25 = r5 | 48
            r26 = 0
            r27 = 65020(0xfdfc, float:9.1112E-41)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r16 = 0
            r11 = r16
            r16 = 0
            r12 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r18 = 0
            r22 = 0
            r3 = r41
            r24 = r42
            com.hansecom.abt.ui.components.AbtTextKt.c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = 1321609096(0x4ec62788, float:1.66223974E9)
            r4 = r42
            r4.X(r3)
            if (r34 == 0) goto L_0x0374
            if (r33 == 0) goto L_0x0374
            r3 = 24
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.t(r0, r3)
            r5 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r3, r4, r5)
            r3 = 1
            r5 = 0
            r6 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r0, r6, r3, r5)
            r5 = r36
            if (r5 == 0) goto L_0x034b
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.platform.TestTagKt.a(r0, r5)
            if (r6 != 0) goto L_0x034a
            goto L_0x034b
        L_0x034a:
            r0 = r6
        L_0x034b:
            androidx.compose.ui.Modifier r16 = r3.o0(r0)
            int r0 = r29 >> 21
            r0 = r0 & 14
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r29 & r3
            r0 = r0 | r3
            int r3 = r29 >> 3
            r6 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r6
            r23 = r0 | r3
            r24 = 76
            r17 = 0
            r18 = 0
            r21 = 0
            r15 = r33
            r19 = r31
            r20 = r32
            r22 = r4
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0376
        L_0x0374:
            r5 = r36
        L_0x0376:
            r4.M()
            r4.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0385
            androidx.compose.runtime.ComposerKt.X()
        L_0x0385:
            r6 = r5
            r5 = r31
            r7 = r32
            r8 = r33
            r9 = r34
        L_0x038e:
            androidx.compose.runtime.ScopeUpdateScope r12 = r4.x()
            if (r12 == 0) goto L_0x03a9
            y.a r13 = new y.a
            r0 = r13
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r10 = r48
            r11 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x03a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.emptyView.EmptyViewKt.b(androidx.compose.ui.Modifier, java.lang.Integer, java.lang.String, java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(Modifier modifier, Integer num, String str, CharSequence charSequence, String str2, String str3, Integer num2, Function0 function0, boolean z2, int i2, int i3, Composer composer, int i4) {
        b(modifier, num, str, charSequence, str2, str3, num2, function0, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
