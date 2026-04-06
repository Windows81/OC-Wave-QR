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
public final class DropdownTextFieldKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r28, java.lang.String r29, kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, boolean r32, java.lang.String r33, java.lang.String r34, androidx.compose.ui.graphics.painter.Painter r35, androidx.compose.ui.graphics.painter.Painter r36, kotlin.jvm.functions.Function0 r37, kotlin.jvm.functions.Function0 r38, androidx.compose.runtime.Composer r39, int r40, int r41, int r42) {
        /*
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r40
            r11 = r42
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            r0 = 194283648(0xb948880, float:5.721291E-32)
            r1 = r39
            androidx.compose.runtime.Composer r10 = r1.q(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0038
            boolean r1 = r10.W(r12)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r15
            goto L_0x0039
        L_0x0038:
            r1 = r15
        L_0x0039:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r4 = r15 & 48
            if (r4 != 0) goto L_0x0050
            boolean r4 = r10.W(r13)
            if (r4 == 0) goto L_0x004d
            r4 = 32
            goto L_0x004f
        L_0x004d:
            r4 = 16
        L_0x004f:
            r1 = r1 | r4
        L_0x0050:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0067
            boolean r4 = r10.l(r14)
            if (r4 == 0) goto L_0x0064
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r4
        L_0x0067:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r5 = r31
            goto L_0x0082
        L_0x0070:
            r5 = r15 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x006d
            r5 = r31
            boolean r6 = r10.W(r5)
            if (r6 == 0) goto L_0x007f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r6
        L_0x0082:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r7 = r32
            goto L_0x009d
        L_0x008b:
            r7 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0088
            r7 = r32
            boolean r8 = r10.d(r7)
            if (r8 == 0) goto L_0x009a
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r8
        L_0x009d:
            r8 = r11 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x00a7
            r1 = r1 | r9
        L_0x00a4:
            r9 = r33
            goto L_0x00b9
        L_0x00a7:
            r9 = r9 & r15
            if (r9 != 0) goto L_0x00a4
            r9 = r33
            boolean r16 = r10.W(r9)
            if (r16 == 0) goto L_0x00b5
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r1 = r1 | r16
        L_0x00b9:
            r16 = r11 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00c4
            r1 = r1 | r17
            r3 = r34
            goto L_0x00d7
        L_0x00c4:
            r17 = r15 & r17
            r3 = r34
            if (r17 != 0) goto L_0x00d7
            boolean r17 = r10.W(r3)
            if (r17 == 0) goto L_0x00d3
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r1 = r1 | r17
        L_0x00d7:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x00f3
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00ec
            r0 = r35
            boolean r18 = r10.l(r0)
            if (r18 == 0) goto L_0x00ee
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ec:
            r0 = r35
        L_0x00ee:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r1 = r1 | r18
            goto L_0x00f5
        L_0x00f3:
            r0 = r35
        L_0x00f5:
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = r15 & r18
            if (r18 != 0) goto L_0x0111
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x010a
            r2 = r36
            boolean r19 = r10.l(r2)
            if (r19 == 0) goto L_0x010c
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x010a:
            r2 = r36
        L_0x010c:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010e:
            r1 = r1 | r19
            goto L_0x0113
        L_0x0111:
            r2 = r36
        L_0x0113:
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r20 = r15 & r19
            if (r20 != 0) goto L_0x012f
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0128
            r0 = r37
            boolean r21 = r10.l(r0)
            if (r21 == 0) goto L_0x012a
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012c
        L_0x0128:
            r0 = r37
        L_0x012a:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012c:
            r1 = r1 | r21
            goto L_0x0131
        L_0x012f:
            r0 = r37
        L_0x0131:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x013a
            r21 = r41 | 6
        L_0x0137:
            r2 = r21
            goto L_0x0150
        L_0x013a:
            r21 = r41 & 6
            r2 = r38
            if (r21 != 0) goto L_0x014e
            boolean r21 = r10.l(r2)
            if (r21 == 0) goto L_0x0149
            r21 = 4
            goto L_0x014b
        L_0x0149:
            r21 = 2
        L_0x014b:
            r21 = r41 | r21
            goto L_0x0137
        L_0x014e:
            r2 = r41
        L_0x0150:
            r21 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r1 & r21
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r5) goto L_0x017b
            r3 = r2 & 3
            r5 = 2
            if (r3 != r5) goto L_0x017b
            boolean r3 = r10.t()
            if (r3 != 0) goto L_0x0166
            goto L_0x017b
        L_0x0166:
            r10.B()
            r4 = r31
            r8 = r35
            r11 = r38
            r5 = r7
            r6 = r9
            r21 = r10
            r7 = r34
            r9 = r36
            r10 = r37
            goto L_0x02e7
        L_0x017b:
            r10.p()
            r3 = r15 & 1
            r5 = 0
            r21 = 1
            if (r3 == 0) goto L_0x01b9
            boolean r3 = r10.J()
            if (r3 == 0) goto L_0x018c
            goto L_0x01b9
        L_0x018c:
            r10.B()
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0197
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x0197:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x019f
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x019f:
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01a7
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x01a7:
            r18 = r31
            r24 = r34
            r25 = r35
            r26 = r36
            r8 = r38
            r22 = r7
            r23 = r9
            r9 = r37
            goto L_0x0224
        L_0x01b9:
            if (r4 == 0) goto L_0x01be
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01c0
        L_0x01be:
            r3 = r31
        L_0x01c0:
            if (r6 == 0) goto L_0x01c4
            r7 = r21
        L_0x01c4:
            if (r8 == 0) goto L_0x01c9
            java.lang.String r4 = ""
            goto L_0x01ca
        L_0x01c9:
            r4 = r9
        L_0x01ca:
            if (r16 == 0) goto L_0x01cf
            java.lang.String r6 = ""
            goto L_0x01d1
        L_0x01cf:
            r6 = r34
        L_0x01d1:
            r8 = r11 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x01e0
            int r8 = com.hansecom.abt.R.drawable.f33012n
            androidx.compose.ui.graphics.painter.Painter r8 = androidx.compose.ui.res.PainterResources_androidKt.c(r8, r10, r5)
            r9 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r9
            goto L_0x01e2
        L_0x01e0:
            r8 = r35
        L_0x01e2:
            r9 = r11 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x01f2
            int r9 = com.hansecom.abt.R.drawable.f33016r
            androidx.compose.ui.graphics.painter.Painter r9 = androidx.compose.ui.res.PainterResources_androidKt.c(r9, r10, r5)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r16
            goto L_0x01f4
        L_0x01f2:
            r9 = r36
        L_0x01f4:
            r5 = r11 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x01ff
            r5 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r5
            r5 = r1
            r1 = r14
            goto L_0x0202
        L_0x01ff:
            r5 = r1
            r1 = r37
        L_0x0202:
            if (r0 == 0) goto L_0x0215
            r0 = 0
            r18 = r3
            r23 = r4
            r24 = r6
            r22 = r7
            r25 = r8
            r26 = r9
            r8 = r0
        L_0x0212:
            r9 = r1
            r1 = r5
            goto L_0x0224
        L_0x0215:
            r18 = r3
            r23 = r4
            r24 = r6
            r22 = r7
            r25 = r8
            r26 = r9
            r8 = r38
            goto L_0x0212
        L_0x0224:
            r10.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0235
            java.lang.String r0 = "com.hansecom.abt.ui.components.formFields.DropdownTextField (DropdownTextField.kt:28)"
            r3 = 194283648(0xb948880, float:5.721291E-32)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r2, r0)
        L_0x0235:
            if (r8 == 0) goto L_0x0240
            int r0 = r28.length()
            if (r0 <= 0) goto L_0x0240
            r0 = r21
            goto L_0x0241
        L_0x0240:
            r0 = 0
        L_0x0241:
            if (r0 == 0) goto L_0x0246
            r7 = r26
            goto L_0x0248
        L_0x0246:
            r7 = r25
        L_0x0248:
            r3 = -976150823(0xffffffffc5d11ed9, float:-6691.856)
            r10.X(r3)
            boolean r3 = r10.d(r0)
            r2 = r2 & 14
            r4 = 4
            if (r2 != r4) goto L_0x025a
            r2 = r21
            goto L_0x025b
        L_0x025a:
            r2 = 0
        L_0x025b:
            r2 = r2 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r1
            r3 = r3 ^ r19
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 <= r4) goto L_0x026b
            boolean r3 = r10.W(r9)
            if (r3 != 0) goto L_0x026f
        L_0x026b:
            r3 = r1 & r19
            if (r3 != r4) goto L_0x0272
        L_0x026f:
            r5 = r21
            goto L_0x0273
        L_0x0272:
            r5 = 0
        L_0x0273:
            r2 = r2 | r5
            java.lang.Object r3 = r10.g()
            if (r2 != 0) goto L_0x0282
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x028a
        L_0x0282:
            com.hansecom.abt.ui.components.formFields.Q r3 = new com.hansecom.abt.ui.components.formFields.Q
            r3.<init>(r0, r8, r9)
            r10.N(r3)
        L_0x028a:
            r16 = r3
            kotlin.jvm.functions.Function0 r16 = (kotlin.jvm.functions.Function0) r16
            r10.M()
            r0 = r1 & 14
            int r2 = r1 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r2 = r1 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r2
            r17 = r0 | r1
            r19 = 0
            r0 = r28
            r1 = r30
            r2 = r29
            r3 = r18
            r4 = r22
            r5 = r23
            r6 = r24
            r20 = r8
            r8 = r16
            r16 = r9
            r9 = r10
            r21 = r10
            r10 = r17
            r11 = r19
            com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt.e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02d7
            androidx.compose.runtime.ComposerKt.X()
        L_0x02d7:
            r10 = r16
            r4 = r18
            r11 = r20
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
        L_0x02e7:
            androidx.compose.runtime.ScopeUpdateScope r3 = r21.x()
            if (r3 == 0) goto L_0x030a
            com.hansecom.abt.ui.components.formFields.S r2 = new com.hansecom.abt.ui.components.formFields.S
            r0 = r2
            r1 = r28
            r12 = r2
            r2 = r29
            r13 = r3
            r3 = r30
            r14 = r12
            r12 = r40
            r15 = r13
            r13 = r41
            r27 = r14
            r14 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r27
            r15.a(r0)
        L_0x030a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.DropdownTextFieldKt.c(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, java.lang.String, java.lang.String, androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.graphics.painter.Painter, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit d(boolean z2, Function0 function0, Function0 function02) {
        if (z2) {
            Intrinsics.f(function0);
            function0.invoke();
        } else {
            function02.invoke();
        }
        return Unit.f40552a;
    }

    public static final Unit e(String str, String str2, Function0 function0, Modifier modifier, boolean z2, String str3, String str4, Painter painter, Painter painter2, Function0 function02, Function0 function03, int i2, int i3, int i4, Composer composer, int i5) {
        c(str, str2, function0, modifier, z2, str3, str4, painter, painter2, function02, function03, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }
}
