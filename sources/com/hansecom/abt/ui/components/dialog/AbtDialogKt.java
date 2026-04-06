package com.hansecom.abt.ui.components.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AbtDialogKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.hansecom.abt.ui.components.dialog.AbtDialogState r47, com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r48, com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r49, kotlin.jvm.functions.Function0 r50, boolean r51, androidx.compose.runtime.Composer r52, int r53, int r54) {
        /*
            r1 = r47
            r6 = r53
            r0 = 651478154(0x26d4c48a, float:1.4763727E-15)
            r2 = r52
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r54 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0015
            r3 = r6 | 6
            goto L_0x0025
        L_0x0015:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0024
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x0021
            r3 = 4
            goto L_0x0022
        L_0x0021:
            r3 = r4
        L_0x0022:
            r3 = r3 | r6
            goto L_0x0025
        L_0x0024:
            r3 = r6
        L_0x0025:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x003e
            r5 = r54 & 2
            if (r5 != 0) goto L_0x0038
            r5 = r48
            boolean r7 = r2.W(r5)
            if (r7 == 0) goto L_0x003a
            r7 = 32
            goto L_0x003c
        L_0x0038:
            r5 = r48
        L_0x003a:
            r7 = 16
        L_0x003c:
            r3 = r3 | r7
            goto L_0x0040
        L_0x003e:
            r5 = r48
        L_0x0040:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0059
            r7 = r54 & 4
            if (r7 != 0) goto L_0x0053
            r7 = r49
            boolean r8 = r2.W(r7)
            if (r8 == 0) goto L_0x0055
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0053:
            r7 = r49
        L_0x0055:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r3 = r3 | r8
            goto L_0x005b
        L_0x0059:
            r7 = r49
        L_0x005b:
            r8 = r54 & 8
            if (r8 == 0) goto L_0x0064
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0061:
            r9 = r50
            goto L_0x0076
        L_0x0064:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0061
            r9 = r50
            boolean r10 = r2.l(r9)
            if (r10 == 0) goto L_0x0073
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r3 = r3 | r10
        L_0x0076:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x008f
            r10 = r54 & 16
            if (r10 != 0) goto L_0x0089
            r10 = r51
            boolean r11 = r2.d(r10)
            if (r11 == 0) goto L_0x008b
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008d
        L_0x0089:
            r10 = r51
        L_0x008b:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r3 = r3 | r11
            goto L_0x0091
        L_0x008f:
            r10 = r51
        L_0x0091:
            r11 = r3 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x00a5
            boolean r11 = r2.t()
            if (r11 != 0) goto L_0x009e
            goto L_0x00a5
        L_0x009e:
            r2.B()
            r3 = r7
            r4 = r9
            goto L_0x020b
        L_0x00a5:
            r2.p()
            r11 = r6 & 1
            r12 = -57345(0xffffffffffff1fff, float:NaN)
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 1
            if (r11 == 0) goto L_0x00d9
            boolean r11 = r2.J()
            if (r11 == 0) goto L_0x00bb
            goto L_0x00d9
        L_0x00bb:
            r2.B()
            r8 = r54 & 2
            if (r8 == 0) goto L_0x00c4
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c4:
            r8 = r54 & 4
            if (r8 == 0) goto L_0x00ca
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ca:
            r8 = r54 & 16
            if (r8 == 0) goto L_0x00cf
            r3 = r3 & r12
        L_0x00cf:
            r28 = r9
            r29 = r10
        L_0x00d3:
            r46 = r7
            r7 = r3
            r3 = r46
            goto L_0x010c
        L_0x00d9:
            r11 = r54 & 2
            if (r11 == 0) goto L_0x00e9
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r5 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r5 = r5.a(r2, r15)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r5 = r5.c(r2, r14)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e9:
            r11 = r54 & 4
            if (r11 == 0) goto L_0x00f9
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r7 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r7 = r7.a(r2, r15)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r7 = r7.e(r2, r14)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f9:
            if (r8 == 0) goto L_0x00fc
            r9 = r13
        L_0x00fc:
            r8 = r54 & 16
            if (r8 == 0) goto L_0x00cf
            if (r9 == 0) goto L_0x0105
            r8 = r16
            goto L_0x0106
        L_0x0105:
            r8 = r14
        L_0x0106:
            r3 = r3 & r12
            r29 = r8
            r28 = r9
            goto L_0x00d3
        L_0x010c:
            r2.U()
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x011b
            r8 = -1
            java.lang.String r9 = "com.hansecom.abt.ui.components.dialog.AbtDialog (AbtDialog.kt:196)"
            androidx.compose.runtime.ComposerKt.Y(r0, r7, r8, r9)
        L_0x011b:
            r0 = -1358873918(0xffffffffaf013ac2, float:-1.1753357E-10)
            r2.X(r0)
            java.lang.Object r0 = r2.g()
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r0 != r8) goto L_0x0159
            com.hansecom.abt.ui.components.dialog.AbtDialogState r0 = new com.hansecom.abt.ui.components.dialog.AbtDialogState
            r44 = 8191(0x1fff, float:1.1478E-41)
            r45 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r30 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r0, r13, r4, r13)
            r2.N(r0)
        L_0x0159:
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            r2.M()
            if (r1 == 0) goto L_0x0163
            i(r0, r1)
        L_0x0163:
            com.hansecom.abt.ui.components.dialog.AbtDialogState r4 = h(r0)
            java.lang.String r4 = r4.m()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r8 = h(r0)
            java.lang.CharSequence r8 = r8.a()
            if (r1 == 0) goto L_0x0178
            r10 = r16
            goto L_0x0179
        L_0x0178:
            r10 = r14
        L_0x0179:
            com.hansecom.abt.ui.components.dialog.AbtDialogState r9 = h(r0)
            kotlin.jvm.functions.Function2 r11 = r9.g()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r9 = h(r0)
            kotlin.jvm.functions.Function2 r12 = r9.c()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r9 = h(r0)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r13 = r9.f()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r9 = h(r0)
            java.lang.String r14 = r9.e()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r9 = h(r0)
            java.lang.Integer r16 = r9.d()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r9 = h(r0)
            kotlin.jvm.functions.Function0 r17 = r9.i()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r9 = h(r0)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r18 = r9.l()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r9 = h(r0)
            java.lang.String r19 = r9.k()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r9 = h(r0)
            kotlin.jvm.functions.Function0 r20 = r9.j()
            com.hansecom.abt.ui.components.dialog.AbtDialogState r9 = h(r0)
            kotlin.jvm.functions.Function0 r9 = r9.h()
            if (r9 != 0) goto L_0x01ce
            r22 = r28
            goto L_0x01d0
        L_0x01ce:
            r22 = r9
        L_0x01d0:
            com.hansecom.abt.ui.components.dialog.AbtDialogState r0 = h(r0)
            java.lang.Boolean r0 = r0.b()
            if (r0 == 0) goto L_0x01e1
            boolean r0 = r0.booleanValue()
            r23 = r0
            goto L_0x01e3
        L_0x01e1:
            r23 = r29
        L_0x01e3:
            int r0 = r7 << 24
            r9 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r0 & r9
            r0 = 57344(0xe000, float:8.0356E-41)
            int r7 = r7 << r15
            r26 = r7 & r0
            r27 = 4
            r9 = 0
            r7 = r4
            r15 = r16
            r16 = r5
            r21 = r3
            r24 = r2
            e(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0207
            androidx.compose.runtime.ComposerKt.X()
        L_0x0207:
            r4 = r28
            r10 = r29
        L_0x020b:
            androidx.compose.runtime.ScopeUpdateScope r8 = r2.x()
            if (r8 == 0) goto L_0x0222
            com.hansecom.abt.ui.components.dialog.c r9 = new com.hansecom.abt.ui.components.dialog.c
            r0 = r9
            r1 = r47
            r2 = r5
            r5 = r10
            r6 = r53
            r7 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.dialog.AbtDialogKt.d(com.hansecom.abt.ui.components.dialog.AbtDialogState, com.hansecom.abt.ui.components.abtButton.AbtButtonStyle, com.hansecom.abt.ui.components.abtButton.AbtButtonStyle, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r40, java.lang.CharSequence r41, java.lang.String r42, boolean r43, kotlin.jvm.functions.Function2 r44, kotlin.jvm.functions.Function2 r45, com.hansecom.abt.ui.components.abtButton.AbtButtonState r46, java.lang.String r47, java.lang.Integer r48, com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r49, kotlin.jvm.functions.Function0 r50, com.hansecom.abt.ui.components.abtButton.AbtButtonState r51, java.lang.String r52, kotlin.jvm.functions.Function0 r53, com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r54, kotlin.jvm.functions.Function0 r55, boolean r56, androidx.compose.runtime.Composer r57, int r58, int r59, int r60) {
        /*
            r15 = r40
            r14 = r41
            r13 = r58
            r12 = r59
            r11 = r60
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "body"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            r0 = 671482544(0x280602b0, float:7.439077E-15)
            r1 = r57
            androidx.compose.runtime.Composer r10 = r1.q(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r13 & 6
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.W(r15)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r13
            goto L_0x0034
        L_0x0033:
            r0 = r13
        L_0x0034:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x004b
            boolean r3 = r10.l(r14)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
        L_0x004b:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0054
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r8 = r42
            goto L_0x0066
        L_0x0054:
            r8 = r13 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0051
            r8 = r42
            boolean r9 = r10.W(r8)
            if (r9 == 0) goto L_0x0063
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r0 = r0 | r9
        L_0x0066:
            r9 = r11 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0073
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r1 = r43
            goto L_0x0086
        L_0x0073:
            r1 = r13 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0070
            r1 = r43
            boolean r18 = r10.d(r1)
            if (r18 == 0) goto L_0x0082
            r18 = r17
            goto L_0x0084
        L_0x0082:
            r18 = r16
        L_0x0084:
            r0 = r0 | r18
        L_0x0086:
            r18 = r11 & 16
            r19 = 8192(0x2000, float:1.14794E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r18 == 0) goto L_0x0093
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r2 = r44
            goto L_0x00a6
        L_0x0093:
            r2 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0090
            r2 = r44
            boolean r22 = r10.l(r2)
            if (r22 == 0) goto L_0x00a2
            r22 = r20
            goto L_0x00a4
        L_0x00a2:
            r22 = r19
        L_0x00a4:
            r0 = r0 | r22
        L_0x00a6:
            r22 = r11 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            r24 = 65536(0x10000, float:9.18355E-41)
            if (r22 == 0) goto L_0x00b3
            r0 = r0 | r23
            r4 = r45
            goto L_0x00c6
        L_0x00b3:
            r25 = r13 & r23
            r4 = r45
            if (r25 != 0) goto L_0x00c6
            boolean r26 = r10.l(r4)
            if (r26 == 0) goto L_0x00c2
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r26 = r24
        L_0x00c4:
            r0 = r0 | r26
        L_0x00c6:
            r26 = r11 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r26 == 0) goto L_0x00d1
            r0 = r0 | r28
            r6 = r46
            goto L_0x00e4
        L_0x00d1:
            r29 = r13 & r28
            r6 = r46
            if (r29 != 0) goto L_0x00e4
            boolean r30 = r10.W(r6)
            if (r30 == 0) goto L_0x00e0
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r0 = r0 | r30
        L_0x00e4:
            r7 = r11 & 128(0x80, float:1.794E-43)
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            if (r7 == 0) goto L_0x00ef
            r0 = r0 | r31
            r5 = r47
            goto L_0x0102
        L_0x00ef:
            r31 = r13 & r31
            r5 = r47
            if (r31 != 0) goto L_0x0102
            boolean r32 = r10.W(r5)
            if (r32 == 0) goto L_0x00fe
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r0 = r0 | r32
        L_0x0102:
            r1 = r11 & 256(0x100, float:3.59E-43)
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010d
            r0 = r0 | r32
            r2 = r48
            goto L_0x0120
        L_0x010d:
            r32 = r13 & r32
            r2 = r48
            if (r32 != 0) goto L_0x0120
            boolean r32 = r10.W(r2)
            if (r32 == 0) goto L_0x011c
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r0 = r0 | r32
        L_0x0120:
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r13 & r32
            if (r32 != 0) goto L_0x013c
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0135
            r2 = r49
            boolean r32 = r10.W(r2)
            if (r32 == 0) goto L_0x0137
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0135:
            r2 = r49
        L_0x0137:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r0 = r0 | r32
            goto L_0x013e
        L_0x013c:
            r2 = r49
        L_0x013e:
            r2 = r11 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0147
            r21 = r12 | 6
            r4 = r50
            goto L_0x015d
        L_0x0147:
            r32 = r12 & 6
            r4 = r50
            if (r32 != 0) goto L_0x015b
            boolean r32 = r10.l(r4)
            if (r32 == 0) goto L_0x0156
            r21 = 4
            goto L_0x0158
        L_0x0156:
            r21 = 2
        L_0x0158:
            r21 = r12 | r21
            goto L_0x015d
        L_0x015b:
            r21 = r12
        L_0x015d:
            r4 = r11 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0166
            r21 = r21 | 48
        L_0x0163:
            r5 = r21
            goto L_0x017a
        L_0x0166:
            r32 = r12 & 48
            r5 = r51
            if (r32 != 0) goto L_0x0163
            boolean r32 = r10.W(r5)
            if (r32 == 0) goto L_0x0175
            r27 = 32
            goto L_0x0177
        L_0x0175:
            r27 = 16
        L_0x0177:
            r21 = r21 | r27
            goto L_0x0163
        L_0x017a:
            r6 = r11 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0183
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0180:
            r8 = r52
            goto L_0x0196
        L_0x0183:
            r8 = r12 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0180
            r8 = r52
            boolean r21 = r10.W(r8)
            if (r21 == 0) goto L_0x0192
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x0194
        L_0x0192:
            r29 = 128(0x80, float:1.794E-43)
        L_0x0194:
            r5 = r5 | r29
        L_0x0196:
            r8 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x019f
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x019c:
            r14 = r53
            goto L_0x01af
        L_0x019f:
            r14 = r12 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x019c
            r14 = r53
            boolean r21 = r10.l(r14)
            if (r21 == 0) goto L_0x01ad
            r16 = r17
        L_0x01ad:
            r5 = r5 | r16
        L_0x01af:
            r14 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x01c7
            r14 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r14 != 0) goto L_0x01c2
            r14 = r54
            boolean r16 = r10.W(r14)
            if (r16 == 0) goto L_0x01c4
            r19 = r20
            goto L_0x01c4
        L_0x01c2:
            r14 = r54
        L_0x01c4:
            r5 = r5 | r19
            goto L_0x01c9
        L_0x01c7:
            r14 = r54
        L_0x01c9:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r11 & r16
            if (r16 == 0) goto L_0x01d5
            r5 = r5 | r23
            r14 = r55
            goto L_0x01e8
        L_0x01d5:
            r17 = r12 & r23
            r14 = r55
            if (r17 != 0) goto L_0x01e8
            boolean r17 = r10.l(r14)
            if (r17 == 0) goto L_0x01e4
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e6
        L_0x01e4:
            r17 = r24
        L_0x01e6:
            r5 = r5 | r17
        L_0x01e8:
            r17 = r12 & r28
            if (r17 != 0) goto L_0x0200
            r17 = r11 & r24
            r12 = r56
            if (r17 != 0) goto L_0x01fb
            boolean r17 = r10.d(r12)
            if (r17 == 0) goto L_0x01fb
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fd
        L_0x01fb:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x01fd:
            r5 = r5 | r17
            goto L_0x0202
        L_0x0200:
            r12 = r56
        L_0x0202:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r0 & r17
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r14) goto L_0x0240
            r12 = 599187(0x92493, float:8.3964E-40)
            r12 = r12 & r5
            r14 = 599186(0x92492, float:8.39638E-40)
            if (r12 != r14) goto L_0x0240
            boolean r12 = r10.t()
            if (r12 != 0) goto L_0x021c
            goto L_0x0240
        L_0x021c:
            r10.B()
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r45
            r7 = r46
            r8 = r47
            r9 = r48
            r11 = r50
            r12 = r51
            r13 = r52
            r14 = r53
            r15 = r54
            r16 = r55
            r17 = r56
            r2 = r10
            r10 = r49
            goto L_0x0449
        L_0x0240:
            r10.p()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x028a
            boolean r12 = r10.J()
            if (r12 == 0) goto L_0x024e
            goto L_0x028a
        L_0x024e:
            r10.B()
            r1 = r11 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0259
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r0 = r0 & r1
        L_0x0259:
            r1 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0261
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
        L_0x0261:
            r1 = r11 & r24
            if (r1 == 0) goto L_0x0269
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r1
        L_0x0269:
            r20 = r42
            r18 = r43
            r21 = r44
            r22 = r45
            r23 = r46
            r24 = r47
            r25 = r48
            r26 = r49
            r27 = r50
            r29 = r51
            r30 = r52
            r32 = r53
            r33 = r54
            r14 = r55
            r12 = r56
            r9 = r0
            goto L_0x035a
        L_0x028a:
            if (r3 == 0) goto L_0x028f
            java.lang.String r3 = ""
            goto L_0x0291
        L_0x028f:
            r3 = r42
        L_0x0291:
            if (r9 == 0) goto L_0x0295
            r9 = 1
            goto L_0x0297
        L_0x0295:
            r9 = r43
        L_0x0297:
            if (r18 == 0) goto L_0x029b
            r12 = 0
            goto L_0x029d
        L_0x029b:
            r12 = r44
        L_0x029d:
            if (r22 == 0) goto L_0x02a2
            r18 = 0
            goto L_0x02a4
        L_0x02a2:
            r18 = r45
        L_0x02a4:
            if (r26 == 0) goto L_0x02ab
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r19 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            r14 = r19
            goto L_0x02ad
        L_0x02ab:
            r14 = r46
        L_0x02ad:
            if (r7 == 0) goto L_0x02b1
            r7 = 0
            goto L_0x02b3
        L_0x02b1:
            r7 = r47
        L_0x02b3:
            if (r1 == 0) goto L_0x02b7
            r1 = 0
            goto L_0x02b9
        L_0x02b7:
            r1 = r48
        L_0x02b9:
            r42 = r1
            r1 = r11 & 512(0x200, float:7.175E-43)
            r20 = r3
            r3 = 6
            if (r1 == 0) goto L_0x02d2
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r1 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r1.a(r10, r3)
            r3 = 0
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r1 = r1.c(r10, r3)
            r3 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r0 = r0 & r3
            goto L_0x02d4
        L_0x02d2:
            r1 = r49
        L_0x02d4:
            if (r2 == 0) goto L_0x02d8
            r2 = 0
            goto L_0x02da
        L_0x02d8:
            r2 = r50
        L_0x02da:
            if (r4 == 0) goto L_0x02df
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r3 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            goto L_0x02e1
        L_0x02df:
            r3 = r51
        L_0x02e1:
            if (r6 == 0) goto L_0x02e5
            r4 = 0
            goto L_0x02e7
        L_0x02e5:
            r4 = r52
        L_0x02e7:
            if (r8 == 0) goto L_0x02eb
            r6 = 0
            goto L_0x02ed
        L_0x02eb:
            r6 = r53
        L_0x02ed:
            r8 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x0304
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r8 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r44 = r0
            r0 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r0 = r8.a(r10, r0)
            r8 = 0
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r0 = r0.e(r10, r8)
            r8 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r8
            goto L_0x0308
        L_0x0304:
            r44 = r0
            r0 = r54
        L_0x0308:
            if (r16 == 0) goto L_0x030c
            r8 = 0
            goto L_0x030e
        L_0x030c:
            r8 = r55
        L_0x030e:
            r16 = r11 & r24
            r43 = r0
            if (r16 == 0) goto L_0x0341
            if (r8 == 0) goto L_0x031e
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r0 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Loading
            if (r14 == r0) goto L_0x031e
            if (r3 == r0) goto L_0x031e
            r0 = 1
            goto L_0x031f
        L_0x031e:
            r0 = 0
        L_0x031f:
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r16
            r25 = r42
            r33 = r43
            r26 = r1
            r27 = r2
            r29 = r3
            r30 = r4
            r32 = r6
            r24 = r7
            r21 = r12
            r23 = r14
            r22 = r18
            r12 = r0
        L_0x033b:
            r14 = r8
            r18 = r9
            r9 = r44
            goto L_0x035a
        L_0x0341:
            r25 = r42
            r33 = r43
            r26 = r1
            r27 = r2
            r29 = r3
            r30 = r4
            r32 = r6
            r24 = r7
            r21 = r12
            r23 = r14
            r22 = r18
            r12 = r56
            goto L_0x033b
        L_0x035a:
            r10.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x036b
            r0 = 671482544(0x280602b0, float:7.439077E-15)
            java.lang.String r1 = "com.hansecom.abt.ui.components.dialog.AbtDialog (AbtDialog.kt:80)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r5, r1)
        L_0x036b:
            androidx.compose.ui.window.DialogProperties r2 = new androidx.compose.ui.window.DialogProperties
            r3 = 0
            r2.<init>(r12, r12, r3)
            r0 = -1359016253(0xffffffffaeff0ec3, float:-1.159868E-10)
            r10.X(r0)
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r5
            r0 = r0 ^ r28
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r1) goto L_0x0386
            boolean r0 = r10.d(r12)
            if (r0 != 0) goto L_0x038a
        L_0x0386:
            r0 = r5 & r28
            if (r0 != r1) goto L_0x038c
        L_0x038a:
            r0 = 1
            goto L_0x038d
        L_0x038c:
            r0 = r3
        L_0x038d:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r5
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r4) goto L_0x0395
            r3 = 1
        L_0x0395:
            r0 = r0 | r3
            java.lang.Object r1 = r10.g()
            if (r0 != 0) goto L_0x03a4
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x03ac
        L_0x03a4:
            com.hansecom.abt.ui.components.dialog.a r1 = new com.hansecom.abt.ui.components.dialog.a
            r1.<init>(r12, r14)
            r10.N(r1)
        L_0x03ac:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r10.M()
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r3 = 0
            r4 = 0
            r8 = 1
            androidx.compose.ui.Modifier r17 = androidx.compose.foundation.layout.SizeKt.f(r0, r3, r8, r4)
            r0 = 0
            r3 = 3
            androidx.compose.animation.EnterTransition r19 = androidx.compose.animation.EnterExitTransitionKt.o(r4, r0, r3, r4)
            androidx.compose.animation.ExitTransition$Companion r0 = androidx.compose.animation.ExitTransition.f2277a
            androidx.compose.animation.ExitTransition r28 = r0.a()
            com.hansecom.abt.ui.components.dialog.AbtDialogKt$AbtDialog$1 r7 = new com.hansecom.abt.ui.components.dialog.AbtDialogKt$AbtDialog$1
            r0 = r7
            r3 = r21
            r4 = r40
            r5 = r41
            r6 = r20
            r34 = r7
            r7 = r22
            r16 = r8
            r8 = r24
            r31 = r9
            r9 = r30
            r35 = r10
            r10 = r27
            r11 = r26
            r36 = r12
            r12 = r23
            r13 = r25
            r37 = r14
            r14 = r32
            r15 = r33
            r16 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 54
            r1 = 194323336(0xb952388, float:5.7446174E-32)
            r4 = r34
            r2 = r35
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r3, r4, r2, r0)
            int r1 = r31 >> 9
            r1 = r1 & 14
            r3 = 197040(0x301b0, float:2.76112E-40)
            r1 = r1 | r3
            r3 = 16
            r4 = 0
            r42 = r18
            r43 = r17
            r44 = r19
            r45 = r28
            r46 = r4
            r47 = r0
            r48 = r2
            r49 = r1
            r50 = r3
            androidx.compose.animation.AnimatedVisibilityKt.j(r42, r43, r44, r45, r46, r47, r48, r49, r50)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x042b
            androidx.compose.runtime.ComposerKt.X()
        L_0x042b:
            r4 = r18
            r3 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r29
            r13 = r30
            r14 = r32
            r15 = r33
            r17 = r36
            r16 = r37
        L_0x0449:
            androidx.compose.runtime.ScopeUpdateScope r2 = r2.x()
            if (r2 == 0) goto L_0x046a
            com.hansecom.abt.ui.components.dialog.b r1 = new com.hansecom.abt.ui.components.dialog.b
            r0 = r1
            r38 = r1
            r1 = r40
            r39 = r2
            r2 = r41
            r18 = r58
            r19 = r59
            r20 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r38
            r0 = r39
            r0.a(r1)
        L_0x046a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(java.lang.String, java.lang.CharSequence, java.lang.String, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, com.hansecom.abt.ui.components.abtButton.AbtButtonState, java.lang.String, java.lang.Integer, com.hansecom.abt.ui.components.abtButton.AbtButtonStyle, kotlin.jvm.functions.Function0, com.hansecom.abt.ui.components.abtButton.AbtButtonState, java.lang.String, kotlin.jvm.functions.Function0, com.hansecom.abt.ui.components.abtButton.AbtButtonStyle, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit f(boolean z2, Function0 function0) {
        if (z2 && function0 != null) {
            function0.invoke();
        }
        return Unit.f40552a;
    }

    public static final Unit g(String str, CharSequence charSequence, String str2, boolean z2, Function2 function2, Function2 function22, AbtButtonState abtButtonState, String str3, Integer num, AbtButtonStyle abtButtonStyle, Function0 function0, AbtButtonState abtButtonState2, String str4, Function0 function02, AbtButtonStyle abtButtonStyle2, Function0 function03, boolean z3, int i2, int i3, int i4, Composer composer, int i5) {
        e(str, charSequence, str2, z2, function2, function22, abtButtonState, str3, num, abtButtonStyle, function0, abtButtonState2, str4, function02, abtButtonStyle2, function03, z3, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }

    public static final AbtDialogState h(MutableState mutableState) {
        return (AbtDialogState) mutableState.getValue();
    }

    public static final void i(MutableState mutableState, AbtDialogState abtDialogState) {
        mutableState.setValue(abtDialogState);
    }

    public static final Unit j(AbtDialogState abtDialogState, AbtButtonStyle abtButtonStyle, AbtButtonStyle abtButtonStyle2, Function0 function0, boolean z2, int i2, int i3, Composer composer, int i4) {
        d(abtDialogState, abtButtonStyle, abtButtonStyle2, function0, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
