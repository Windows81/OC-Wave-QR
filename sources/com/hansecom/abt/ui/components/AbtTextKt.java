package com.hansecom.abt.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtTextKt {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.CharSequence r54, androidx.compose.ui.Modifier r55, long r56, long r58, androidx.compose.ui.text.font.FontStyle r60, androidx.compose.ui.text.font.FontWeight r61, androidx.compose.ui.text.font.FontFamily r62, long r63, androidx.compose.ui.text.style.TextDecoration r65, androidx.compose.ui.text.style.TextAlign r66, long r67, int r69, boolean r70, int r71, int r72, kotlin.jvm.functions.Function1 r73, androidx.compose.ui.text.TextStyle r74, androidx.compose.runtime.Composer r75, int r76, int r77, int r78) {
        /*
            r1 = r54
            r14 = r76
            r15 = r77
            r13 = r78
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            r0 = -1128688295(0xffffffffbcb99559, float:-0.022654222)
            r2 = r75
            androidx.compose.runtime.Composer r0 = r2.q(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x001d
            r2 = r14 | 6
            goto L_0x002d
        L_0x001d:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x002c
            boolean r2 = r0.l(r1)
            if (r2 == 0) goto L_0x0029
            r2 = 4
            goto L_0x002a
        L_0x0029:
            r2 = 2
        L_0x002a:
            r2 = r2 | r14
            goto L_0x002d
        L_0x002c:
            r2 = r14
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r2 = r2 | 48
        L_0x0033:
            r8 = r55
            goto L_0x0048
        L_0x0036:
            r8 = r14 & 48
            if (r8 != 0) goto L_0x0033
            r8 = r55
            boolean r9 = r0.W(r8)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r2 = r2 | r9
        L_0x0048:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0051
            r2 = r2 | 384(0x180, float:5.38E-43)
            r3 = r56
            goto L_0x0064
        L_0x0051:
            r12 = r14 & 384(0x180, float:5.38E-43)
            r3 = r56
            if (r12 != 0) goto L_0x0064
            boolean r16 = r0.j(r3)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r2 = r2 | r16
        L_0x0064:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0071
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r7 = r58
            goto L_0x0084
        L_0x0071:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            r7 = r58
            if (r6 != 0) goto L_0x0084
            boolean r20 = r0.j(r7)
            if (r20 == 0) goto L_0x0080
            r20 = r18
            goto L_0x0082
        L_0x0080:
            r20 = r17
        L_0x0082:
            r2 = r2 | r20
        L_0x0084:
            r20 = r13 & 16
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r20 == 0) goto L_0x008f
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x008c:
            r6 = r60
            goto L_0x00a2
        L_0x008f:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008c
            r6 = r60
            boolean r23 = r0.W(r6)
            if (r23 == 0) goto L_0x009e
            r23 = r21
            goto L_0x00a0
        L_0x009e:
            r23 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r2 = r2 | r23
        L_0x00a2:
            r23 = r13 & 32
            r24 = 196608(0x30000, float:2.75506E-40)
            r25 = 65536(0x10000, float:9.18355E-41)
            if (r23 == 0) goto L_0x00af
            r2 = r2 | r24
            r10 = r61
            goto L_0x00c2
        L_0x00af:
            r26 = r14 & r24
            r10 = r61
            if (r26 != 0) goto L_0x00c2
            boolean r27 = r0.W(r10)
            if (r27 == 0) goto L_0x00be
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r27 = r25
        L_0x00c0:
            r2 = r2 | r27
        L_0x00c2:
            r27 = r13 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x00cd
            r2 = r2 | r28
            r11 = r62
            goto L_0x00e0
        L_0x00cd:
            r28 = r14 & r28
            r11 = r62
            if (r28 != 0) goto L_0x00e0
            boolean r29 = r0.W(r11)
            if (r29 == 0) goto L_0x00dc
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r2 = r2 | r29
        L_0x00e0:
            r12 = r13 & 128(0x80, float:1.794E-43)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r12 == 0) goto L_0x00eb
            r2 = r2 | r30
            r3 = r63
            goto L_0x00fe
        L_0x00eb:
            r30 = r14 & r30
            r3 = r63
            if (r30 != 0) goto L_0x00fe
            boolean r30 = r0.j(r3)
            if (r30 == 0) goto L_0x00fa
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r2 = r2 | r30
        L_0x00fe:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x0108
            r2 = r2 | r4
        L_0x0105:
            r4 = r65
            goto L_0x011a
        L_0x0108:
            r4 = r4 & r14
            if (r4 != 0) goto L_0x0105
            r4 = r65
            boolean r30 = r0.W(r4)
            if (r30 == 0) goto L_0x0116
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r2 = r2 | r30
        L_0x011a:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0125
            r2 = r2 | r30
            r6 = r66
            goto L_0x0138
        L_0x0125:
            r30 = r14 & r30
            r6 = r66
            if (r30 != 0) goto L_0x0138
            boolean r30 = r0.W(r6)
            if (r30 == 0) goto L_0x0134
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r2 = r2 | r30
        L_0x0138:
            r6 = r13 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0141
            r29 = r15 | 6
            r7 = r67
            goto L_0x0157
        L_0x0141:
            r30 = r15 & 6
            r7 = r67
            if (r30 != 0) goto L_0x0155
            boolean r30 = r0.j(r7)
            if (r30 == 0) goto L_0x0150
            r29 = 4
            goto L_0x0152
        L_0x0150:
            r29 = 2
        L_0x0152:
            r29 = r15 | r29
            goto L_0x0157
        L_0x0155:
            r29 = r15
        L_0x0157:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0160
            r29 = r29 | 48
        L_0x015d:
            r8 = r29
            goto L_0x0177
        L_0x0160:
            r8 = r15 & 48
            if (r8 != 0) goto L_0x0174
            r8 = r69
            boolean r30 = r0.i(r8)
            if (r30 == 0) goto L_0x016f
            r19 = 32
            goto L_0x0171
        L_0x016f:
            r19 = 16
        L_0x0171:
            r29 = r29 | r19
            goto L_0x015d
        L_0x0174:
            r8 = r69
            goto L_0x015d
        L_0x0177:
            r10 = r13 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x0180
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x017d:
            r11 = r70
            goto L_0x0193
        L_0x0180:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x017d
            r11 = r70
            boolean r19 = r0.d(r11)
            if (r19 == 0) goto L_0x018f
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x0191
        L_0x018f:
            r26 = 128(0x80, float:1.794E-43)
        L_0x0191:
            r8 = r8 | r26
        L_0x0193:
            r11 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x019c
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0199:
            r1 = r71
            goto L_0x01ac
        L_0x019c:
            r1 = r15 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0199
            r1 = r71
            boolean r19 = r0.i(r1)
            if (r19 == 0) goto L_0x01aa
            r17 = r18
        L_0x01aa:
            r8 = r8 | r17
        L_0x01ac:
            r1 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x01b7
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r17 = r1
        L_0x01b4:
            r1 = r72
            goto L_0x01ca
        L_0x01b7:
            r17 = r1
            r1 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x01b4
            r1 = r72
            boolean r18 = r0.i(r1)
            if (r18 == 0) goto L_0x01c6
            goto L_0x01c8
        L_0x01c6:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x01c8:
            r8 = r8 | r21
        L_0x01ca:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01d6
            r8 = r8 | r24
            r1 = r73
            goto L_0x01e9
        L_0x01d6:
            r19 = r15 & r24
            r1 = r73
            if (r19 != 0) goto L_0x01e9
            boolean r19 = r0.l(r1)
            if (r19 == 0) goto L_0x01e5
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e7
        L_0x01e5:
            r19 = r25
        L_0x01e7:
            r8 = r8 | r19
        L_0x01e9:
            r19 = 1572864(0x180000, float:2.204052E-39)
            r19 = r15 & r19
            if (r19 != 0) goto L_0x0203
            r19 = r13 & r25
            r1 = r74
            if (r19 != 0) goto L_0x01fe
            boolean r19 = r0.W(r1)
            if (r19 == 0) goto L_0x01fe
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0200
        L_0x01fe:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x0200:
            r8 = r8 | r19
            goto L_0x0205
        L_0x0203:
            r1 = r74
        L_0x0205:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r2 & r19
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r15) goto L_0x0244
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r1 & r8
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r15) goto L_0x0244
            boolean r1 = r0.t()
            if (r1 != 0) goto L_0x021f
            goto L_0x0244
        L_0x021f:
            r0.B()
            r2 = r55
            r3 = r56
            r5 = r58
            r7 = r60
            r8 = r61
            r9 = r62
            r10 = r63
            r12 = r65
            r13 = r66
            r14 = r67
            r16 = r69
            r17 = r70
            r18 = r71
            r19 = r72
            r20 = r73
            r21 = r74
            goto L_0x0496
        L_0x0244:
            r0.p()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0280
            boolean r1 = r0.J()
            if (r1 == 0) goto L_0x0252
            goto L_0x0280
        L_0x0252:
            r0.B()
            r1 = r13 & r25
            if (r1 == 0) goto L_0x025d
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r1
        L_0x025d:
            r1 = r55
            r3 = r56
            r5 = r58
            r9 = r60
            r7 = r61
            r10 = r63
            r12 = r65
            r15 = r66
            r43 = r67
            r45 = r69
            r46 = r70
            r47 = r71
            r48 = r72
            r49 = r73
            r50 = r74
            r13 = r8
            r8 = r62
            goto L_0x0360
        L_0x0280:
            if (r5 == 0) goto L_0x0285
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0287
        L_0x0285:
            r1 = r55
        L_0x0287:
            if (r9 == 0) goto L_0x0290
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.ui.graphics.Color.f15975b
            long r21 = r5.f()
            goto L_0x0292
        L_0x0290:
            r21 = r56
        L_0x0292:
            if (r16 == 0) goto L_0x029b
            androidx.compose.ui.unit.TextUnit$Companion r5 = androidx.compose.ui.unit.TextUnit.f19177b
            long r15 = r5.a()
            goto L_0x029d
        L_0x029b:
            r15 = r58
        L_0x029d:
            r5 = 0
            if (r20 == 0) goto L_0x02a2
            r9 = r5
            goto L_0x02a4
        L_0x02a2:
            r9 = r60
        L_0x02a4:
            if (r23 == 0) goto L_0x02a9
            r19 = r5
            goto L_0x02ab
        L_0x02a9:
            r19 = r61
        L_0x02ab:
            if (r27 == 0) goto L_0x02b0
            r20 = r5
            goto L_0x02b2
        L_0x02b0:
            r20 = r62
        L_0x02b2:
            if (r12 == 0) goto L_0x02bb
            androidx.compose.ui.unit.TextUnit$Companion r12 = androidx.compose.ui.unit.TextUnit.f19177b
            long r23 = r12.a()
            goto L_0x02bd
        L_0x02bb:
            r23 = r63
        L_0x02bd:
            if (r3 == 0) goto L_0x02c1
            r3 = r5
            goto L_0x02c3
        L_0x02c1:
            r3 = r65
        L_0x02c3:
            if (r4 == 0) goto L_0x02c6
            goto L_0x02c8
        L_0x02c6:
            r5 = r66
        L_0x02c8:
            if (r6 == 0) goto L_0x02d1
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.ui.unit.TextUnit.f19177b
            long r26 = r4.a()
            goto L_0x02d3
        L_0x02d1:
            r26 = r67
        L_0x02d3:
            if (r7 == 0) goto L_0x02dc
            androidx.compose.ui.text.style.TextOverflow$Companion r4 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r4 = r4.a()
            goto L_0x02de
        L_0x02dc:
            r4 = r69
        L_0x02de:
            r6 = 1
            if (r10 == 0) goto L_0x02e3
            r7 = r6
            goto L_0x02e5
        L_0x02e3:
            r7 = r70
        L_0x02e5:
            if (r11 == 0) goto L_0x02eb
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02ed
        L_0x02eb:
            r10 = r71
        L_0x02ed:
            if (r17 == 0) goto L_0x02f0
            goto L_0x02f2
        L_0x02f0:
            r6 = r72
        L_0x02f2:
            if (r18 == 0) goto L_0x0314
            r11 = -1242273790(0xffffffffb5f46802, float:-1.8209687E-6)
            r0.X(r11)
            java.lang.Object r11 = r0.g()
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r11 != r12) goto L_0x030e
            com.hansecom.abt.ui.components.a r11 = new com.hansecom.abt.ui.components.a
            r11.<init>()
            r0.N(r11)
        L_0x030e:
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r0.M()
            goto L_0x0316
        L_0x0314:
            r11 = r73
        L_0x0316:
            r12 = r13 & r25
            if (r12 == 0) goto L_0x0347
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.material3.TextKt.q()
            java.lang.Object r12 = r0.C(r12)
            androidx.compose.ui.text.TextStyle r12 = (androidx.compose.ui.text.TextStyle) r12
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r17
            r45 = r4
            r48 = r6
            r46 = r7
            r13 = r8
            r47 = r10
            r49 = r11
            r50 = r12
            r7 = r19
            r8 = r20
            r10 = r23
            r43 = r26
            r12 = r3
            r3 = r21
        L_0x0341:
            r52 = r15
            r15 = r5
            r5 = r52
            goto L_0x0360
        L_0x0347:
            r50 = r74
            r12 = r3
            r45 = r4
            r48 = r6
            r46 = r7
            r13 = r8
            r47 = r10
            r49 = r11
            r7 = r19
            r8 = r20
            r3 = r21
            r10 = r23
            r43 = r26
            goto L_0x0341
        L_0x0360:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x0376
            r14 = -1128688295(0xffffffffbcb99559, float:-0.022654222)
            r55 = r15
            java.lang.String r15 = "com.hansecom.abt.ui.components.AbtText (AbtText.kt:40)"
            androidx.compose.runtime.ComposerKt.Y(r14, r2, r13, r15)
        L_0x0373:
            r14 = r54
            goto L_0x0379
        L_0x0376:
            r55 = r15
            goto L_0x0373
        L_0x0379:
            boolean r15 = r14 instanceof androidx.compose.ui.text.AnnotatedString
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = 458752(0x70000, float:6.42848E-40)
            r19 = 57344(0xe000, float:8.0356E-41)
            if (r15 == 0) goto L_0x0401
            r15 = 144324568(0x89a37d8, float:9.281667E-34)
            r0.X(r15)
            r16 = r14
            androidx.compose.ui.text.AnnotatedString r16 = (androidx.compose.ui.text.AnnotatedString) r16
            r15 = r2 & 1008(0x3f0, float:1.413E-42)
            int r20 = r2 << 3
            r21 = r20 & r19
            r15 = r15 | r21
            r21 = r20 & r18
            r15 = r15 | r21
            r21 = 3670016(0x380000, float:5.142788E-39)
            r21 = r20 & r21
            r15 = r15 | r21
            r21 = r20 & r17
            r15 = r15 | r21
            r21 = 234881024(0xe000000, float:1.5777218E-30)
            r21 = r20 & r21
            r15 = r15 | r21
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r20 = r20 & r21
            r40 = r15 | r20
            int r2 = r2 >> 27
            r2 = r2 & 14
            int r15 = r13 << 3
            r20 = r15 & 112(0x70, float:1.57E-43)
            r2 = r2 | r20
            r14 = r15 & 896(0x380, float:1.256E-42)
            r2 = r2 | r14
            r14 = r15 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r14
            r14 = r15 & r19
            r2 = r2 | r14
            r14 = r15 & r18
            r2 = r2 | r14
            int r13 = r13 << 6
            r14 = r13 & r17
            r2 = r2 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r14
            r41 = r2 | r13
            r42 = 65544(0x10008, float:9.1847E-41)
            r20 = 0
            r36 = 0
            r17 = r1
            r18 = r3
            r21 = r5
            r23 = r9
            r24 = r7
            r25 = r8
            r26 = r10
            r28 = r12
            r29 = r55
            r30 = r43
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r37 = r49
            r38 = r50
            r39 = r0
            androidx.compose.material3.TextKt.k(r16, r17, r18, r20, r21, r23, r24, r25, r26, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0.M()
            goto L_0x0476
        L_0x0401:
            r14 = 144943917(0x8a3ab2d, float:9.850449E-34)
            r0.X(r14)
            java.lang.String r16 = r54.toString()
            r14 = r2 & 1008(0x3f0, float:1.413E-42)
            int r15 = r2 << 3
            r20 = r15 & r19
            r14 = r14 | r20
            r20 = r15 & r18
            r14 = r14 | r20
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r15 & r20
            r14 = r14 | r20
            r20 = r15 & r17
            r14 = r14 | r20
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            r20 = r15 & r20
            r14 = r14 | r20
            r20 = 1879048192(0x70000000, float:1.58456325E29)
            r15 = r15 & r20
            r39 = r14 | r15
            int r2 = r2 >> 27
            r2 = r2 & 14
            int r13 = r13 << 3
            r14 = r13 & 112(0x70, float:1.57E-43)
            r2 = r2 | r14
            r14 = r13 & 896(0x380, float:1.256E-42)
            r2 = r2 | r14
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r14
            r14 = r13 & r19
            r2 = r2 | r14
            r14 = r13 & r18
            r2 = r2 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r13
            r2 = r2 | r14
            r13 = r13 & r17
            r40 = r2 | r13
            r41 = 8
            r20 = 0
            r17 = r1
            r18 = r3
            r21 = r5
            r23 = r9
            r24 = r7
            r25 = r8
            r26 = r10
            r28 = r12
            r29 = r55
            r30 = r43
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r36 = r49
            r37 = r50
            r38 = r0
            androidx.compose.material3.TextKt.j(r16, r17, r18, r20, r21, r23, r24, r25, r26, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r0.M()
        L_0x0476:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x047f
            androidx.compose.runtime.ComposerKt.X()
        L_0x047f:
            r13 = r55
            r2 = r1
            r14 = r43
            r16 = r45
            r17 = r46
            r18 = r47
            r19 = r48
            r20 = r49
            r21 = r50
            r52 = r8
            r8 = r7
            r7 = r9
            r9 = r52
        L_0x0496:
            androidx.compose.runtime.ScopeUpdateScope r1 = r0.x()
            if (r1 == 0) goto L_0x04b4
            com.hansecom.abt.ui.components.b r0 = new com.hansecom.abt.ui.components.b
            r55 = r0
            r51 = r1
            r1 = r54
            r22 = r76
            r23 = r77
            r24 = r78
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r55
            r0 = r51
            r0.a(r1)
        L_0x04b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.AbtTextKt.c(java.lang.CharSequence, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit d(TextLayoutResult textLayoutResult) {
        Intrinsics.i(textLayoutResult, "it");
        return Unit.f40552a;
    }

    public static final Unit e(CharSequence charSequence, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, Function1 function1, TextStyle textStyle, int i5, int i6, int i7, Composer composer, int i8) {
        c(charSequence, modifier, j2, j3, fontStyle, fontWeight, fontFamily, j4, textDecoration, textAlign, j5, i2, z2, i3, i4, function1, textStyle, composer, RecomposeScopeImplKt.a(i5 | 1), RecomposeScopeImplKt.a(i6), i7);
        return Unit.f40552a;
    }
}
