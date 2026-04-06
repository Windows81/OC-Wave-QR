package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ClickableOutlinedTextFieldKt {
    /* JADX WARNING: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.lang.String r22, kotlin.jvm.functions.Function0 r23, int r24, androidx.compose.ui.Modifier r25, java.lang.String r26, java.lang.String r27, boolean r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r12 = r22
            r13 = r23
            r14 = r24
            r15 = r30
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            r0 = -1159523712(0xffffffffbae31280, float:-0.0017324239)
            r1 = r29
            androidx.compose.runtime.Composer r11 = r1.q(r0)
            r1 = r31 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.W(r12)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r15
            goto L_0x0032
        L_0x0031:
            r1 = r15
        L_0x0032:
            r2 = r31 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r2 = r15 & 48
            if (r2 != 0) goto L_0x0049
            boolean r2 = r11.l(r13)
            if (r2 == 0) goto L_0x0046
            r2 = 32
            goto L_0x0048
        L_0x0046:
            r2 = 16
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r31 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x0050:
            r2 = r15 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0060
            boolean r2 = r11.i(r14)
            if (r2 == 0) goto L_0x005d
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r2
        L_0x0060:
            r2 = r31 & 8
            if (r2 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0066:
            r3 = r25
            goto L_0x007b
        L_0x0069:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0066
            r3 = r25
            boolean r4 = r11.W(r3)
            if (r4 == 0) goto L_0x0078
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r4
        L_0x007b:
            r4 = r31 & 16
            if (r4 == 0) goto L_0x0084
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0081:
            r5 = r26
            goto L_0x0096
        L_0x0084:
            r5 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0081
            r5 = r26
            boolean r6 = r11.W(r5)
            if (r6 == 0) goto L_0x0093
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r1 = r1 | r6
        L_0x0096:
            r6 = r31 & 32
            r7 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L_0x00a0
            r1 = r1 | r7
        L_0x009d:
            r7 = r27
            goto L_0x00b1
        L_0x00a0:
            r7 = r7 & r15
            if (r7 != 0) goto L_0x009d
            r7 = r27
            boolean r8 = r11.W(r7)
            if (r8 == 0) goto L_0x00ae
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r1 = r1 | r8
        L_0x00b1:
            r8 = r31 & 64
            r9 = 1572864(0x180000, float:2.204052E-39)
            if (r8 == 0) goto L_0x00bb
            r1 = r1 | r9
        L_0x00b8:
            r9 = r28
            goto L_0x00cc
        L_0x00bb:
            r9 = r9 & r15
            if (r9 != 0) goto L_0x00b8
            r9 = r28
            boolean r10 = r11.d(r9)
            if (r10 == 0) goto L_0x00c9
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r1 = r1 | r10
        L_0x00cc:
            r10 = 599187(0x92493, float:8.3964E-40)
            r10 = r10 & r1
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r0) goto L_0x00e6
            boolean r0 = r11.t()
            if (r0 != 0) goto L_0x00dc
            goto L_0x00e6
        L_0x00dc:
            r11.B()
            r4 = r3
            r6 = r7
            r7 = r9
            r21 = r11
            goto L_0x0159
        L_0x00e6:
            if (r2 == 0) goto L_0x00ed
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r17 = r0
            goto L_0x00ef
        L_0x00ed:
            r17 = r3
        L_0x00ef:
            java.lang.String r0 = ""
            if (r4 == 0) goto L_0x00f6
            r18 = r0
            goto L_0x00f8
        L_0x00f6:
            r18 = r5
        L_0x00f8:
            if (r6 == 0) goto L_0x00fd
            r19 = r0
            goto L_0x00ff
        L_0x00fd:
            r19 = r7
        L_0x00ff:
            if (r8 == 0) goto L_0x0105
            r0 = 1
            r20 = r0
            goto L_0x0107
        L_0x0105:
            r20 = r9
        L_0x0107:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0116
            r0 = -1
            java.lang.String r2 = "com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextField (ClickableOutlinedTextField.kt:91)"
            r3 = -1159523712(0xffffffffbae31280, float:-0.0017324239)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r0, r2)
        L_0x0116:
            int r0 = r1 >> 6
            r2 = r0 & 14
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.b(r14, r11, r2)
            r3 = r1 & 7294(0x1c7e, float:1.0221E-41)
            r4 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r4
            r0 = r0 | r3
            int r1 = r1 << 3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r3
            r10 = r0 | r1
            r16 = 384(0x180, float:5.38E-43)
            r7 = 0
            r8 = 0
            r0 = r22
            r1 = r23
            r3 = r17
            r4 = r20
            r5 = r18
            r6 = r19
            r9 = r11
            r21 = r11
            r11 = r16
            e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0151
            androidx.compose.runtime.ComposerKt.X()
        L_0x0151:
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
        L_0x0159:
            androidx.compose.runtime.ScopeUpdateScope r10 = r21.x()
            if (r10 == 0) goto L_0x0172
            com.hansecom.abt.ui.components.formFields.l r11 = new com.hansecom.abt.ui.components.formFields.l
            r0 = r11
            r1 = r22
            r2 = r23
            r3 = r24
            r8 = r30
            r9 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt.d(java.lang.String, kotlin.jvm.functions.Function0, int, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r42, kotlin.jvm.functions.Function0 r43, java.lang.String r44, androidx.compose.ui.Modifier r45, boolean r46, java.lang.String r47, java.lang.String r48, androidx.compose.ui.graphics.painter.Painter r49, kotlin.jvm.functions.Function0 r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            r13 = r42
            r12 = r43
            r5 = r44
            r3 = r52
            r2 = r53
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            r0 = -2134907347(0xffffffff80bfe62d, float:-1.7623151E-38)
            r1 = r51
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r2 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r3 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r3 & 6
            if (r1 != 0) goto L_0x0038
            boolean r1 = r15.W(r13)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r3
            goto L_0x0039
        L_0x0038:
            r1 = r3
        L_0x0039:
            r4 = r2 & 2
            if (r4 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r4 = r3 & 48
            if (r4 != 0) goto L_0x0050
            boolean r4 = r15.l(r12)
            if (r4 == 0) goto L_0x004d
            r4 = 32
            goto L_0x004f
        L_0x004d:
            r4 = 16
        L_0x004f:
            r1 = r1 | r4
        L_0x0050:
            r4 = r2 & 4
            if (r4 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r4 = r3 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0067
            boolean r4 = r15.W(r5)
            if (r4 == 0) goto L_0x0064
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r4
        L_0x0067:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r6 = r45
            goto L_0x0082
        L_0x0070:
            r6 = r3 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x006d
            r6 = r45
            boolean r7 = r15.W(r6)
            if (r7 == 0) goto L_0x007f
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r7
        L_0x0082:
            r7 = r2 & 16
            if (r7 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r8 = r46
            goto L_0x009d
        L_0x008b:
            r8 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0088
            r8 = r46
            boolean r9 = r15.d(r8)
            if (r9 == 0) goto L_0x009a
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r9
        L_0x009d:
            r9 = r2 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x00a7
            r1 = r1 | r10
        L_0x00a4:
            r10 = r47
            goto L_0x00b8
        L_0x00a7:
            r10 = r10 & r3
            if (r10 != 0) goto L_0x00a4
            r10 = r47
            boolean r11 = r15.W(r10)
            if (r11 == 0) goto L_0x00b5
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r1 = r1 | r11
        L_0x00b8:
            r11 = r2 & 64
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r11 == 0) goto L_0x00c2
            r1 = r1 | r14
        L_0x00bf:
            r14 = r48
            goto L_0x00d4
        L_0x00c2:
            r14 = r14 & r3
            if (r14 != 0) goto L_0x00bf
            r14 = r48
            boolean r16 = r15.W(r14)
            if (r16 == 0) goto L_0x00d0
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r1 = r1 | r16
        L_0x00d4:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r3 & r16
            if (r16 != 0) goto L_0x00f0
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e9
            r0 = r49
            boolean r17 = r15.l(r0)
            if (r17 == 0) goto L_0x00eb
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00e9:
            r0 = r49
        L_0x00eb:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r1 = r1 | r17
            goto L_0x00f2
        L_0x00f0:
            r0 = r49
        L_0x00f2:
            r0 = r2 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00fd
            r1 = r1 | r17
            r6 = r50
            goto L_0x0110
        L_0x00fd:
            r17 = r3 & r17
            r6 = r50
            if (r17 != 0) goto L_0x0110
            boolean r17 = r15.l(r6)
            if (r17 == 0) goto L_0x010c
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x010c:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010e:
            r1 = r1 | r17
        L_0x0110:
            r17 = 38347923(0x2492493, float:1.4777644E-37)
            r6 = r1 & r17
            r8 = 38347922(0x2492492, float:1.4777643E-37)
            if (r6 != r8) goto L_0x0132
            boolean r6 = r15.t()
            if (r6 != 0) goto L_0x0121
            goto L_0x0132
        L_0x0121:
            r15.B()
            r4 = r45
            r5 = r46
            r8 = r49
            r9 = r50
            r6 = r10
            r7 = r14
            r40 = r15
            goto L_0x027e
        L_0x0132:
            r15.p()
            r6 = r3 & 1
            r17 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r8 = 1
            if (r6 == 0) goto L_0x0159
            boolean r6 = r15.J()
            if (r6 == 0) goto L_0x0144
            goto L_0x0159
        L_0x0144:
            r15.B()
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x014d
            r1 = r1 & r17
        L_0x014d:
            r34 = r45
            r35 = r46
            r7 = r50
            r4 = r1
            r0 = r10
            r11 = 0
            r10 = r49
            goto L_0x0190
        L_0x0159:
            if (r4 == 0) goto L_0x015e
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0160
        L_0x015e:
            r4 = r45
        L_0x0160:
            if (r7 == 0) goto L_0x0164
            r6 = r8
            goto L_0x0166
        L_0x0164:
            r6 = r46
        L_0x0166:
            java.lang.String r7 = ""
            if (r9 == 0) goto L_0x016b
            r10 = r7
        L_0x016b:
            if (r11 == 0) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r7 = r14
        L_0x016f:
            r9 = r2 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x017d
            int r9 = com.hansecom.abt.R.drawable.f33014p
            r11 = 0
            androidx.compose.ui.graphics.painter.Painter r9 = androidx.compose.ui.res.PainterResources_androidKt.c(r9, r15, r11)
            r1 = r1 & r17
            goto L_0x0180
        L_0x017d:
            r11 = 0
            r9 = r49
        L_0x0180:
            r34 = r4
            r35 = r6
            r14 = r7
            if (r0 == 0) goto L_0x018c
            r0 = r10
            r7 = 0
        L_0x0189:
            r4 = r1
            r10 = r9
            goto L_0x0190
        L_0x018c:
            r0 = r10
            r7 = r50
            goto L_0x0189
        L_0x0190:
            r15.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01a2
            r1 = -1
            java.lang.String r6 = "com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextField (ClickableOutlinedTextField.kt:33)"
            r9 = -2134907347(0xffffffff80bfe62d, float:-1.7623151E-38)
            androidx.compose.runtime.ComposerKt.Y(r9, r4, r1, r6)
        L_0x01a2:
            com.hansecom.abt.ui.theme.AbtTheme r1 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r6 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r1 = r1.d(r15, r6)
            androidx.compose.ui.text.TextStyle r28 = r1.c()
            if (r14 == 0) goto L_0x01b5
            int r1 = r14.length()
            if (r1 != 0) goto L_0x01b6
        L_0x01b5:
            r11 = r8
        L_0x01b6:
            r29 = r11 ^ 1
            r1 = 1981034011(0x76142e1b, float:7.513624E32)
            r15.X(r1)
            r9 = 54
            if (r0 != 0) goto L_0x01c8
            if (r14 == 0) goto L_0x01c5
            goto L_0x01c8
        L_0x01c5:
            r36 = 0
            goto L_0x01d6
        L_0x01c8:
            com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt$ClickableOutlinedTextField$1 r1 = new com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt$ClickableOutlinedTextField$1
            r1.<init>(r14, r0)
            r6 = 1580733908(0x5e3815d4, float:3.31618534E18)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r8, r1, r15, r9)
            r36 = r1
        L_0x01d6:
            r15.M()
            r1 = 1981023420(0x761404bc, float:7.505429E32)
            r15.X(r1)
            java.lang.Object r1 = r15.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r1 != r6) goto L_0x01f3
            com.hansecom.abt.ui.components.formFields.j r1 = new com.hansecom.abt.ui.components.formFields.j
            r1.<init>()
            r15.N(r1)
        L_0x01f3:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r15.M()
            com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt$ClickableOutlinedTextField$3 r6 = new com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt$ClickableOutlinedTextField$3
            r6.<init>(r5)
            r11 = -1875754359(0xffffffff90324289, float:-3.5155567E-29)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r8, r6, r15, r9)
            com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt$ClickableOutlinedTextField$4 r11 = new com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt$ClickableOutlinedTextField$4
            r11.<init>(r7, r10)
            r45 = r0
            r0 = -1507042548(0xffffffffa62c5b0c, float:-5.979788E-16)
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r8, r11, r15, r9)
            r0 = r4 & 14
            r8 = 806903856(0x30186030, float:5.543397E-10)
            r0 = r0 | r8
            int r8 = r4 >> 3
            r11 = r8 & 896(0x380, float:1.256E-42)
            r0 = r0 | r11
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r30 = r0 | r8
            int r0 = r4 << 21
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r0 & r4
            r33 = 268422528(0xfffcd80, float:2.5224097E-29)
            r4 = 1
            r0 = 0
            r37 = r7
            r7 = r0
            r8 = 0
            r38 = r10
            r10 = r0
            r11 = 0
            r39 = r14
            r14 = r0
            r40 = r15
            r15 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r31 = 0
            r41 = r45
            r0 = r42
            r2 = r34
            r3 = r35
            r5 = r28
            r12 = r36
            r13 = r29
            r28 = r43
            r29 = r40
            com.hansecom.abt.ui.components.formFields.AbtBaseTextFieldKt.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0272
            androidx.compose.runtime.ComposerKt.X()
        L_0x0272:
            r4 = r34
            r5 = r35
            r9 = r37
            r8 = r38
            r7 = r39
            r6 = r41
        L_0x027e:
            androidx.compose.runtime.ScopeUpdateScope r12 = r40.x()
            if (r12 == 0) goto L_0x0297
            com.hansecom.abt.ui.components.formFields.k r13 = new com.hansecom.abt.ui.components.formFields.k
            r0 = r13
            r1 = r42
            r2 = r43
            r3 = r44
            r10 = r52
            r11 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0297:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt.e(java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.ui.Modifier, boolean, java.lang.String, java.lang.String, androidx.compose.ui.graphics.painter.Painter, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit g(String str, Function0 function0, String str2, Modifier modifier, boolean z2, String str3, String str4, Painter painter, Function0 function02, int i2, int i3, Composer composer, int i4) {
        e(str, function0, str2, modifier, z2, str3, str4, painter, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit h(String str, Function0 function0, int i2, Modifier modifier, String str2, String str3, boolean z2, int i3, int i4, Composer composer, int i5) {
        d(str, function0, i2, modifier, str2, str3, z2, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }
}
