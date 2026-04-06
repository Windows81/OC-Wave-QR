package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class OutlinedTextFieldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10562a = Dp.m((float) 4);

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(androidx.compose.ui.text.input.TextFieldValue r82, kotlin.jvm.functions.Function1 r83, androidx.compose.ui.Modifier r84, boolean r85, boolean r86, androidx.compose.ui.text.TextStyle r87, kotlin.jvm.functions.Function2 r88, kotlin.jvm.functions.Function2 r89, kotlin.jvm.functions.Function2 r90, kotlin.jvm.functions.Function2 r91, kotlin.jvm.functions.Function2 r92, kotlin.jvm.functions.Function2 r93, kotlin.jvm.functions.Function2 r94, boolean r95, androidx.compose.ui.text.input.VisualTransformation r96, androidx.compose.foundation.text.KeyboardOptions r97, androidx.compose.foundation.text.KeyboardActions r98, boolean r99, int r100, int r101, androidx.compose.foundation.interaction.MutableInteractionSource r102, androidx.compose.ui.graphics.Shape r103, androidx.compose.material3.TextFieldColors r104, androidx.compose.runtime.Composer r105, int r106, int r107, int r108, int r109) {
        /*
            r15 = r106
            r14 = r107
            r13 = r108
            r12 = r109
            r0 = 2057288437(0x7a9fbaf5, float:4.1468357E35)
            r1 = r105
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r15 | 6
            r4 = r1
            r1 = r82
            goto L_0x002f
        L_0x001b:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002c
            r1 = r82
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0029
            r4 = 4
            goto L_0x002a
        L_0x0029:
            r4 = 2
        L_0x002a:
            r4 = r4 | r15
            goto L_0x002f
        L_0x002c:
            r1 = r82
            r4 = r15
        L_0x002f:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
        L_0x0035:
            r5 = r83
            goto L_0x004a
        L_0x0038:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0035
            r5 = r83
            boolean r8 = r0.l(r5)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r4 = r4 | r8
        L_0x004a:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r11 = r84
            goto L_0x0066
        L_0x0053:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0050
            r11 = r84
            boolean r16 = r0.W(r11)
            if (r16 == 0) goto L_0x0062
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r16
        L_0x0066:
            r16 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0073
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r2 = r85
            goto L_0x0086
        L_0x0073:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0070
            r2 = r85
            boolean r19 = r0.d(r2)
            if (r19 == 0) goto L_0x0082
            r19 = r18
            goto L_0x0084
        L_0x0082:
            r19 = r17
        L_0x0084:
            r4 = r4 | r19
        L_0x0086:
            r19 = r12 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0093
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r3 = r86
            goto L_0x00a6
        L_0x0093:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0090
            r3 = r86
            boolean r23 = r0.d(r3)
            if (r23 == 0) goto L_0x00a2
            r23 = r21
            goto L_0x00a4
        L_0x00a2:
            r23 = r20
        L_0x00a4:
            r4 = r4 | r23
        L_0x00a6:
            r23 = 196608(0x30000, float:2.75506E-40)
            r23 = r15 & r23
            if (r23 != 0) goto L_0x00c0
            r23 = r12 & 32
            r6 = r87
            if (r23 != 0) goto L_0x00bb
            boolean r24 = r0.W(r6)
            if (r24 == 0) goto L_0x00bb
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r4 = r4 | r24
            goto L_0x00c2
        L_0x00c0:
            r6 = r87
        L_0x00c2:
            r24 = r12 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            if (r24 == 0) goto L_0x00cd
            r4 = r4 | r25
            r7 = r88
            goto L_0x00e0
        L_0x00cd:
            r26 = r15 & r25
            r7 = r88
            if (r26 != 0) goto L_0x00e0
            boolean r27 = r0.l(r7)
            if (r27 == 0) goto L_0x00dc
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r4 = r4 | r27
        L_0x00e0:
            r9 = r12 & 128(0x80, float:1.794E-43)
            r28 = 4194304(0x400000, float:5.877472E-39)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00ed
            r4 = r4 | r29
            r10 = r89
            goto L_0x0100
        L_0x00ed:
            r30 = r15 & r29
            r10 = r89
            if (r30 != 0) goto L_0x0100
            boolean r31 = r0.l(r10)
            if (r31 == 0) goto L_0x00fc
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r31 = r28
        L_0x00fe:
            r4 = r4 | r31
        L_0x0100:
            r1 = r12 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010b
            r4 = r4 | r31
            r2 = r90
            goto L_0x011e
        L_0x010b:
            r31 = r15 & r31
            r2 = r90
            if (r31 != 0) goto L_0x011e
            boolean r31 = r0.l(r2)
            if (r31 == 0) goto L_0x011a
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r4 = r4 | r31
        L_0x011e:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r31 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0129
            r4 = r4 | r31
            r3 = r91
            goto L_0x013c
        L_0x0129:
            r32 = r15 & r31
            r3 = r91
            if (r32 != 0) goto L_0x013c
            boolean r32 = r0.l(r3)
            if (r32 == 0) goto L_0x0138
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r4 = r4 | r32
        L_0x013c:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0145
            r32 = r14 | 6
            r5 = r92
            goto L_0x015b
        L_0x0145:
            r32 = r14 & 6
            r5 = r92
            if (r32 != 0) goto L_0x0159
            boolean r32 = r0.l(r5)
            if (r32 == 0) goto L_0x0154
            r32 = 4
            goto L_0x0156
        L_0x0154:
            r32 = 2
        L_0x0156:
            r32 = r14 | r32
            goto L_0x015b
        L_0x0159:
            r32 = r14
        L_0x015b:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0164
            r32 = r32 | 48
        L_0x0161:
            r6 = r32
            goto L_0x0178
        L_0x0164:
            r33 = r14 & 48
            r6 = r93
            if (r33 != 0) goto L_0x0161
            boolean r33 = r0.l(r6)
            if (r33 == 0) goto L_0x0173
            r33 = 32
            goto L_0x0175
        L_0x0173:
            r33 = 16
        L_0x0175:
            r32 = r32 | r33
            goto L_0x0161
        L_0x0178:
            r7 = r12 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0181
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017e:
            r10 = r94
            goto L_0x0194
        L_0x0181:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017e
            r10 = r94
            boolean r32 = r0.l(r10)
            if (r32 == 0) goto L_0x0190
            r32 = 256(0x100, float:3.59E-43)
            goto L_0x0192
        L_0x0190:
            r32 = 128(0x80, float:1.794E-43)
        L_0x0192:
            r6 = r6 | r32
        L_0x0194:
            r10 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x019d
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x019a:
            r11 = r95
            goto L_0x01ad
        L_0x019d:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019a
            r11 = r95
            boolean r32 = r0.d(r11)
            if (r32 == 0) goto L_0x01ab
            r17 = r18
        L_0x01ab:
            r6 = r6 | r17
        L_0x01ad:
            r11 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01b8
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            r17 = r11
        L_0x01b5:
            r11 = r96
            goto L_0x01ca
        L_0x01b8:
            r17 = r11
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b5
            r11 = r96
            boolean r18 = r0.W(r11)
            if (r18 == 0) goto L_0x01c8
            r20 = r21
        L_0x01c8:
            r6 = r6 | r20
        L_0x01ca:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r12 & r18
            r20 = 196608(0x30000, float:2.75506E-40)
            if (r18 == 0) goto L_0x01d8
            r6 = r6 | r20
            r11 = r97
            goto L_0x01eb
        L_0x01d8:
            r20 = r14 & r20
            r11 = r97
            if (r20 != 0) goto L_0x01eb
            boolean r20 = r0.W(r11)
            if (r20 == 0) goto L_0x01e7
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e9
        L_0x01e7:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x01e9:
            r6 = r6 | r20
        L_0x01eb:
            r20 = 65536(0x10000, float:9.18355E-41)
            r20 = r12 & r20
            if (r20 == 0) goto L_0x01f6
            r6 = r6 | r25
            r11 = r98
            goto L_0x0209
        L_0x01f6:
            r21 = r14 & r25
            r11 = r98
            if (r21 != 0) goto L_0x0209
            boolean r21 = r0.W(r11)
            if (r21 == 0) goto L_0x0205
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0207
        L_0x0205:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x0207:
            r6 = r6 | r21
        L_0x0209:
            r21 = 131072(0x20000, float:1.83671E-40)
            r21 = r12 & r21
            if (r21 == 0) goto L_0x0214
            r6 = r6 | r29
            r11 = r99
            goto L_0x0227
        L_0x0214:
            r25 = r14 & r29
            r11 = r99
            if (r25 != 0) goto L_0x0227
            boolean r25 = r0.d(r11)
            if (r25 == 0) goto L_0x0223
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0225
        L_0x0223:
            r25 = r28
        L_0x0225:
            r6 = r6 | r25
        L_0x0227:
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r25 = r14 & r25
            if (r25 != 0) goto L_0x0243
            r25 = 262144(0x40000, float:3.67342E-40)
            r25 = r12 & r25
            r11 = r100
            if (r25 != 0) goto L_0x023e
            boolean r25 = r0.i(r11)
            if (r25 == 0) goto L_0x023e
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0240
        L_0x023e:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0240:
            r6 = r6 | r25
            goto L_0x0245
        L_0x0243:
            r11 = r100
        L_0x0245:
            r25 = 524288(0x80000, float:7.34684E-40)
            r25 = r12 & r25
            if (r25 == 0) goto L_0x0250
            r6 = r6 | r31
            r11 = r101
            goto L_0x0263
        L_0x0250:
            r29 = r14 & r31
            r11 = r101
            if (r29 != 0) goto L_0x0263
            boolean r29 = r0.i(r11)
            if (r29 == 0) goto L_0x025f
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0261
        L_0x025f:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0261:
            r6 = r6 | r29
        L_0x0263:
            r29 = 1048576(0x100000, float:1.469368E-39)
            r29 = r12 & r29
            if (r29 == 0) goto L_0x026e
            r22 = r13 | 6
            r11 = r102
            goto L_0x0284
        L_0x026e:
            r31 = r13 & 6
            r11 = r102
            if (r31 != 0) goto L_0x0282
            boolean r31 = r0.W(r11)
            if (r31 == 0) goto L_0x027d
            r22 = 4
            goto L_0x027f
        L_0x027d:
            r22 = 2
        L_0x027f:
            r22 = r13 | r22
            goto L_0x0284
        L_0x0282:
            r22 = r13
        L_0x0284:
            r31 = r13 & 48
            if (r31 != 0) goto L_0x029e
            r31 = 2097152(0x200000, float:2.938736E-39)
            r31 = r12 & r31
            r11 = r103
            if (r31 != 0) goto L_0x0299
            boolean r31 = r0.W(r11)
            if (r31 == 0) goto L_0x0299
            r23 = 32
            goto L_0x029b
        L_0x0299:
            r23 = 16
        L_0x029b:
            r22 = r22 | r23
            goto L_0x02a0
        L_0x029e:
            r11 = r103
        L_0x02a0:
            r11 = r13 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x02bc
            r11 = r12 & r28
            if (r11 != 0) goto L_0x02b3
            r11 = r104
            boolean r23 = r0.W(r11)
            if (r23 == 0) goto L_0x02b5
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x02b7
        L_0x02b3:
            r11 = r104
        L_0x02b5:
            r27 = 128(0x80, float:1.794E-43)
        L_0x02b7:
            r22 = r22 | r27
        L_0x02b9:
            r11 = r22
            goto L_0x02bf
        L_0x02bc:
            r11 = r104
            goto L_0x02b9
        L_0x02bf:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r4 & r22
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r22 = r10
            if (r13 != r14) goto L_0x02dd
            r13 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r13 & r6
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r14) goto L_0x02dd
            r11 = r11 & 147(0x93, float:2.06E-43)
            r13 = 146(0x92, float:2.05E-43)
            if (r11 == r13) goto L_0x02db
            goto L_0x02dd
        L_0x02db:
            r11 = 0
            goto L_0x02de
        L_0x02dd:
            r11 = 1
        L_0x02de:
            r13 = r4 & 1
            boolean r11 = r0.E(r11, r13)
            if (r11 == 0) goto L_0x0552
            r0.p()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x0336
            boolean r11 = r0.J()
            if (r11 == 0) goto L_0x02f4
            goto L_0x0336
        L_0x02f4:
            r0.B()
            r1 = r12 & 32
            if (r1 == 0) goto L_0x02ff
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r1
        L_0x02ff:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r12
            if (r1 == 0) goto L_0x0308
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
        L_0x0308:
            r8 = r84
            r11 = r85
            r13 = r86
            r14 = r87
            r1 = r88
            r9 = r89
            r2 = r90
            r3 = r91
            r5 = r93
            r84 = r94
            r10 = r96
            r40 = r97
            r41 = r98
            r42 = r99
            r43 = r100
            r44 = r101
            r45 = r102
            r46 = r103
            r12 = r104
            r15 = r4
            r7 = r6
            r4 = r92
            r6 = r95
            goto L_0x0424
        L_0x0336:
            if (r8 == 0) goto L_0x033b
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            goto L_0x033d
        L_0x033b:
            r8 = r84
        L_0x033d:
            if (r16 == 0) goto L_0x0341
            r11 = 1
            goto L_0x0343
        L_0x0341:
            r11 = r85
        L_0x0343:
            if (r19 == 0) goto L_0x0347
            r13 = 0
            goto L_0x0349
        L_0x0347:
            r13 = r86
        L_0x0349:
            r14 = r12 & 32
            if (r14 == 0) goto L_0x035d
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.material3.TextKt.q()
            java.lang.Object r14 = r0.C(r14)
            androidx.compose.ui.text.TextStyle r14 = (androidx.compose.ui.text.TextStyle) r14
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r16
            goto L_0x035f
        L_0x035d:
            r14 = r87
        L_0x035f:
            r16 = 0
            if (r24 == 0) goto L_0x0366
            r19 = r16
            goto L_0x0368
        L_0x0366:
            r19 = r88
        L_0x0368:
            if (r9 == 0) goto L_0x036d
            r9 = r16
            goto L_0x036f
        L_0x036d:
            r9 = r89
        L_0x036f:
            if (r1 == 0) goto L_0x0374
            r1 = r16
            goto L_0x0376
        L_0x0374:
            r1 = r90
        L_0x0376:
            if (r2 == 0) goto L_0x037b
            r2 = r16
            goto L_0x037d
        L_0x037b:
            r2 = r91
        L_0x037d:
            if (r3 == 0) goto L_0x0382
            r3 = r16
            goto L_0x0384
        L_0x0382:
            r3 = r92
        L_0x0384:
            if (r5 == 0) goto L_0x0389
            r5 = r16
            goto L_0x038b
        L_0x0389:
            r5 = r93
        L_0x038b:
            if (r7 == 0) goto L_0x0390
            r7 = r16
            goto L_0x0392
        L_0x0390:
            r7 = r94
        L_0x0392:
            if (r22 == 0) goto L_0x0397
            r22 = 0
            goto L_0x0399
        L_0x0397:
            r22 = r95
        L_0x0399:
            if (r17 == 0) goto L_0x03a2
            androidx.compose.ui.text.input.VisualTransformation$Companion r17 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r17 = r17.c()
            goto L_0x03a4
        L_0x03a2:
            r17 = r96
        L_0x03a4:
            if (r18 == 0) goto L_0x03ad
            androidx.compose.foundation.text.KeyboardOptions$Companion r18 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r18 = r18.a()
            goto L_0x03af
        L_0x03ad:
            r18 = r97
        L_0x03af:
            if (r20 == 0) goto L_0x03b8
            androidx.compose.foundation.text.KeyboardActions$Companion r20 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r20 = r20.a()
            goto L_0x03ba
        L_0x03b8:
            r20 = r98
        L_0x03ba:
            if (r21 == 0) goto L_0x03bf
            r21 = 0
            goto L_0x03c1
        L_0x03bf:
            r21 = r99
        L_0x03c1:
            r23 = 262144(0x40000, float:3.67342E-40)
            r23 = r12 & r23
            if (r23 == 0) goto L_0x03d5
            if (r21 == 0) goto L_0x03cc
            r23 = 1
            goto L_0x03cf
        L_0x03cc:
            r23 = 2147483647(0x7fffffff, float:NaN)
        L_0x03cf:
            r24 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r24
            goto L_0x03d7
        L_0x03d5:
            r23 = r100
        L_0x03d7:
            if (r25 == 0) goto L_0x03dc
            r24 = 1
            goto L_0x03de
        L_0x03dc:
            r24 = r101
        L_0x03de:
            if (r29 == 0) goto L_0x03e1
            goto L_0x03e3
        L_0x03e1:
            r16 = r102
        L_0x03e3:
            r25 = 2097152(0x200000, float:2.938736E-39)
            r25 = r12 & r25
            r10 = 6
            r84 = r1
            if (r25 == 0) goto L_0x03f3
            androidx.compose.material3.OutlinedTextFieldDefaults r1 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            androidx.compose.ui.graphics.Shape r1 = r1.p(r0, r10)
            goto L_0x03f5
        L_0x03f3:
            r1 = r103
        L_0x03f5:
            r25 = r12 & r28
            r85 = r1
            if (r25 == 0) goto L_0x041f
            androidx.compose.material3.OutlinedTextFieldDefaults r1 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            androidx.compose.material3.TextFieldColors r1 = r1.g(r0, r10)
            r46 = r85
            r12 = r1
        L_0x0404:
            r15 = r4
            r45 = r16
            r10 = r17
            r40 = r18
            r1 = r19
            r41 = r20
            r42 = r21
            r43 = r23
            r44 = r24
            r4 = r3
            r3 = r2
            r2 = r84
            r84 = r7
            r7 = r6
            r6 = r22
            goto L_0x0424
        L_0x041f:
            r46 = r85
            r12 = r104
            goto L_0x0404
        L_0x0424:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x043a
            r85 = r5
            r5 = 2057288437(0x7a9fbaf5, float:4.1468357E35)
            r86 = r4
            java.lang.String r4 = "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:560)"
            androidx.compose.runtime.ComposerKt.Y(r5, r15, r7, r4)
            goto L_0x043e
        L_0x043a:
            r86 = r4
            r85 = r5
        L_0x043e:
            if (r45 != 0) goto L_0x045f
            r4 = -502250010(0xffffffffe21045e6, float:-6.65342E20)
            r0.X(r4)
            java.lang.Object r4 = r0.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x0459
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r0.N(r4)
        L_0x0459:
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = (androidx.compose.foundation.interaction.MutableInteractionSource) r4
            r0.M()
            goto L_0x046a
        L_0x045f:
            r4 = 1369271057(0x519d6b11, float:8.4513268E10)
            r0.X(r4)
            r0.M()
            r4 = r45
        L_0x046a:
            r5 = 1369277167(0x519d82ef, float:8.4563321E10)
            r0.X(r5)
            long r15 = r14.h()
            r17 = 16
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x047d
        L_0x047a:
            r48 = r15
            goto L_0x0491
        L_0x047d:
            r5 = 0
            androidx.compose.runtime.State r5 = androidx.compose.foundation.interaction.FocusInteractionKt.a(r4, r0, r5)
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            long r15 = r12.w(r11, r6, r5)
            goto L_0x047a
        L_0x0491:
            r0.M()
            androidx.compose.ui.text.TextStyle r5 = new androidx.compose.ui.text.TextStyle
            r47 = r5
            r77 = 16777214(0xfffffe, float:2.3509884E-38)
            r78 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r47.<init>(r48, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r64, r65, r66, r67, r68, r69, r71, r72, r73, r74, r75, r76, r77, r78)
            androidx.compose.ui.text.TextStyle r25 = r14.J(r5)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            androidx.compose.foundation.text.selection.TextSelectionColors r7 = r12.l()
            androidx.compose.runtime.ProvidedValue r5 = r5.d(r7)
            androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5 r7 = new androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
            r16 = r7
            r17 = r8
            r18 = r1
            r19 = r6
            r20 = r12
            r21 = r82
            r22 = r83
            r23 = r11
            r24 = r13
            r26 = r40
            r27 = r41
            r28 = r42
            r29 = r43
            r30 = r44
            r31 = r10
            r32 = r4
            r33 = r9
            r34 = r2
            r35 = r3
            r36 = r86
            r37 = r85
            r38 = r84
            r39 = r46
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r4 = 54
            r15 = -2094276683(0xffffffff832bdfb5, float:-5.0509187E-37)
            r87 = r1
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r15, r1, r7, r0, r4)
            int r4 = androidx.compose.runtime.ProvidedValue.f14769i
            r4 = r4 | 48
            androidx.compose.runtime.CompositionLocalKt.c(r5, r1, r0, r4)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x052d
            androidx.compose.runtime.ComposerKt.X()
        L_0x052d:
            r7 = r87
            r15 = r10
            r4 = r11
            r23 = r12
            r5 = r13
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            r21 = r45
            r22 = r46
            r13 = r84
            r12 = r85
            r11 = r86
            r10 = r3
            r3 = r8
            r8 = r9
            r9 = r2
            r81 = r14
            r14 = r6
            r6 = r81
            goto L_0x057f
        L_0x0552:
            r0.B()
            r3 = r84
            r4 = r85
            r5 = r86
            r6 = r87
            r7 = r88
            r8 = r89
            r9 = r90
            r10 = r91
            r11 = r92
            r12 = r93
            r13 = r94
            r14 = r95
            r15 = r96
            r16 = r97
            r17 = r98
            r18 = r99
            r19 = r100
            r20 = r101
            r21 = r102
            r22 = r103
            r23 = r104
        L_0x057f:
            androidx.compose.runtime.ScopeUpdateScope r2 = r0.x()
            if (r2 == 0) goto L_0x05a2
            androidx.compose.material3.M4 r1 = new androidx.compose.material3.M4
            r0 = r1
            r79 = r1
            r1 = r82
            r80 = r2
            r2 = r83
            r24 = r106
            r25 = r107
            r26 = r108
            r27 = r109
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = r79
            r0 = r80
            r0.a(r1)
        L_0x05a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.f(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(java.lang.String r82, kotlin.jvm.functions.Function1 r83, androidx.compose.ui.Modifier r84, boolean r85, boolean r86, androidx.compose.ui.text.TextStyle r87, kotlin.jvm.functions.Function2 r88, kotlin.jvm.functions.Function2 r89, kotlin.jvm.functions.Function2 r90, kotlin.jvm.functions.Function2 r91, kotlin.jvm.functions.Function2 r92, kotlin.jvm.functions.Function2 r93, kotlin.jvm.functions.Function2 r94, boolean r95, androidx.compose.ui.text.input.VisualTransformation r96, androidx.compose.foundation.text.KeyboardOptions r97, androidx.compose.foundation.text.KeyboardActions r98, boolean r99, int r100, int r101, androidx.compose.foundation.interaction.MutableInteractionSource r102, androidx.compose.ui.graphics.Shape r103, androidx.compose.material3.TextFieldColors r104, androidx.compose.runtime.Composer r105, int r106, int r107, int r108, int r109) {
        /*
            r15 = r106
            r14 = r107
            r13 = r108
            r12 = r109
            r0 = 1901501544(0x71569c68, float:1.062702E30)
            r1 = r105
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r15 | 6
            r4 = r1
            r1 = r82
            goto L_0x002f
        L_0x001b:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002c
            r1 = r82
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0029
            r4 = 4
            goto L_0x002a
        L_0x0029:
            r4 = 2
        L_0x002a:
            r4 = r4 | r15
            goto L_0x002f
        L_0x002c:
            r1 = r82
            r4 = r15
        L_0x002f:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
        L_0x0035:
            r5 = r83
            goto L_0x004a
        L_0x0038:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0035
            r5 = r83
            boolean r8 = r0.l(r5)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r4 = r4 | r8
        L_0x004a:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r11 = r84
            goto L_0x0066
        L_0x0053:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0050
            r11 = r84
            boolean r16 = r0.W(r11)
            if (r16 == 0) goto L_0x0062
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r16
        L_0x0066:
            r16 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0073
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r2 = r85
            goto L_0x0086
        L_0x0073:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0070
            r2 = r85
            boolean r19 = r0.d(r2)
            if (r19 == 0) goto L_0x0082
            r19 = r18
            goto L_0x0084
        L_0x0082:
            r19 = r17
        L_0x0084:
            r4 = r4 | r19
        L_0x0086:
            r19 = r12 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0093
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r3 = r86
            goto L_0x00a6
        L_0x0093:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0090
            r3 = r86
            boolean r23 = r0.d(r3)
            if (r23 == 0) goto L_0x00a2
            r23 = r21
            goto L_0x00a4
        L_0x00a2:
            r23 = r20
        L_0x00a4:
            r4 = r4 | r23
        L_0x00a6:
            r23 = 196608(0x30000, float:2.75506E-40)
            r23 = r15 & r23
            if (r23 != 0) goto L_0x00c0
            r23 = r12 & 32
            r6 = r87
            if (r23 != 0) goto L_0x00bb
            boolean r24 = r0.W(r6)
            if (r24 == 0) goto L_0x00bb
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r4 = r4 | r24
            goto L_0x00c2
        L_0x00c0:
            r6 = r87
        L_0x00c2:
            r24 = r12 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            if (r24 == 0) goto L_0x00cd
            r4 = r4 | r25
            r7 = r88
            goto L_0x00e0
        L_0x00cd:
            r26 = r15 & r25
            r7 = r88
            if (r26 != 0) goto L_0x00e0
            boolean r27 = r0.l(r7)
            if (r27 == 0) goto L_0x00dc
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r4 = r4 | r27
        L_0x00e0:
            r9 = r12 & 128(0x80, float:1.794E-43)
            r28 = 4194304(0x400000, float:5.877472E-39)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00ed
            r4 = r4 | r29
            r10 = r89
            goto L_0x0100
        L_0x00ed:
            r30 = r15 & r29
            r10 = r89
            if (r30 != 0) goto L_0x0100
            boolean r31 = r0.l(r10)
            if (r31 == 0) goto L_0x00fc
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r31 = r28
        L_0x00fe:
            r4 = r4 | r31
        L_0x0100:
            r1 = r12 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010b
            r4 = r4 | r31
            r2 = r90
            goto L_0x011e
        L_0x010b:
            r31 = r15 & r31
            r2 = r90
            if (r31 != 0) goto L_0x011e
            boolean r31 = r0.l(r2)
            if (r31 == 0) goto L_0x011a
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r4 = r4 | r31
        L_0x011e:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r31 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0129
            r4 = r4 | r31
            r3 = r91
            goto L_0x013c
        L_0x0129:
            r32 = r15 & r31
            r3 = r91
            if (r32 != 0) goto L_0x013c
            boolean r32 = r0.l(r3)
            if (r32 == 0) goto L_0x0138
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r4 = r4 | r32
        L_0x013c:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0145
            r32 = r14 | 6
            r5 = r92
            goto L_0x015b
        L_0x0145:
            r32 = r14 & 6
            r5 = r92
            if (r32 != 0) goto L_0x0159
            boolean r32 = r0.l(r5)
            if (r32 == 0) goto L_0x0154
            r32 = 4
            goto L_0x0156
        L_0x0154:
            r32 = 2
        L_0x0156:
            r32 = r14 | r32
            goto L_0x015b
        L_0x0159:
            r32 = r14
        L_0x015b:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0164
            r32 = r32 | 48
        L_0x0161:
            r6 = r32
            goto L_0x0178
        L_0x0164:
            r33 = r14 & 48
            r6 = r93
            if (r33 != 0) goto L_0x0161
            boolean r33 = r0.l(r6)
            if (r33 == 0) goto L_0x0173
            r33 = 32
            goto L_0x0175
        L_0x0173:
            r33 = 16
        L_0x0175:
            r32 = r32 | r33
            goto L_0x0161
        L_0x0178:
            r7 = r12 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0181
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017e:
            r10 = r94
            goto L_0x0194
        L_0x0181:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017e
            r10 = r94
            boolean r32 = r0.l(r10)
            if (r32 == 0) goto L_0x0190
            r32 = 256(0x100, float:3.59E-43)
            goto L_0x0192
        L_0x0190:
            r32 = 128(0x80, float:1.794E-43)
        L_0x0192:
            r6 = r6 | r32
        L_0x0194:
            r10 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x019d
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x019a:
            r11 = r95
            goto L_0x01ad
        L_0x019d:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019a
            r11 = r95
            boolean r32 = r0.d(r11)
            if (r32 == 0) goto L_0x01ab
            r17 = r18
        L_0x01ab:
            r6 = r6 | r17
        L_0x01ad:
            r11 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01b8
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            r17 = r11
        L_0x01b5:
            r11 = r96
            goto L_0x01ca
        L_0x01b8:
            r17 = r11
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b5
            r11 = r96
            boolean r18 = r0.W(r11)
            if (r18 == 0) goto L_0x01c8
            r20 = r21
        L_0x01c8:
            r6 = r6 | r20
        L_0x01ca:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r12 & r18
            r20 = 196608(0x30000, float:2.75506E-40)
            if (r18 == 0) goto L_0x01d8
            r6 = r6 | r20
            r11 = r97
            goto L_0x01eb
        L_0x01d8:
            r20 = r14 & r20
            r11 = r97
            if (r20 != 0) goto L_0x01eb
            boolean r20 = r0.W(r11)
            if (r20 == 0) goto L_0x01e7
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e9
        L_0x01e7:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x01e9:
            r6 = r6 | r20
        L_0x01eb:
            r20 = 65536(0x10000, float:9.18355E-41)
            r20 = r12 & r20
            if (r20 == 0) goto L_0x01f6
            r6 = r6 | r25
            r11 = r98
            goto L_0x0209
        L_0x01f6:
            r21 = r14 & r25
            r11 = r98
            if (r21 != 0) goto L_0x0209
            boolean r21 = r0.W(r11)
            if (r21 == 0) goto L_0x0205
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0207
        L_0x0205:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x0207:
            r6 = r6 | r21
        L_0x0209:
            r21 = 131072(0x20000, float:1.83671E-40)
            r21 = r12 & r21
            if (r21 == 0) goto L_0x0214
            r6 = r6 | r29
            r11 = r99
            goto L_0x0227
        L_0x0214:
            r25 = r14 & r29
            r11 = r99
            if (r25 != 0) goto L_0x0227
            boolean r25 = r0.d(r11)
            if (r25 == 0) goto L_0x0223
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0225
        L_0x0223:
            r25 = r28
        L_0x0225:
            r6 = r6 | r25
        L_0x0227:
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r25 = r14 & r25
            if (r25 != 0) goto L_0x0243
            r25 = 262144(0x40000, float:3.67342E-40)
            r25 = r12 & r25
            r11 = r100
            if (r25 != 0) goto L_0x023e
            boolean r25 = r0.i(r11)
            if (r25 == 0) goto L_0x023e
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0240
        L_0x023e:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0240:
            r6 = r6 | r25
            goto L_0x0245
        L_0x0243:
            r11 = r100
        L_0x0245:
            r25 = 524288(0x80000, float:7.34684E-40)
            r25 = r12 & r25
            if (r25 == 0) goto L_0x0250
            r6 = r6 | r31
            r11 = r101
            goto L_0x0263
        L_0x0250:
            r29 = r14 & r31
            r11 = r101
            if (r29 != 0) goto L_0x0263
            boolean r29 = r0.i(r11)
            if (r29 == 0) goto L_0x025f
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0261
        L_0x025f:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0261:
            r6 = r6 | r29
        L_0x0263:
            r29 = 1048576(0x100000, float:1.469368E-39)
            r29 = r12 & r29
            if (r29 == 0) goto L_0x026e
            r22 = r13 | 6
            r11 = r102
            goto L_0x0284
        L_0x026e:
            r31 = r13 & 6
            r11 = r102
            if (r31 != 0) goto L_0x0282
            boolean r31 = r0.W(r11)
            if (r31 == 0) goto L_0x027d
            r22 = 4
            goto L_0x027f
        L_0x027d:
            r22 = 2
        L_0x027f:
            r22 = r13 | r22
            goto L_0x0284
        L_0x0282:
            r22 = r13
        L_0x0284:
            r31 = r13 & 48
            if (r31 != 0) goto L_0x029e
            r31 = 2097152(0x200000, float:2.938736E-39)
            r31 = r12 & r31
            r11 = r103
            if (r31 != 0) goto L_0x0299
            boolean r31 = r0.W(r11)
            if (r31 == 0) goto L_0x0299
            r23 = 32
            goto L_0x029b
        L_0x0299:
            r23 = 16
        L_0x029b:
            r22 = r22 | r23
            goto L_0x02a0
        L_0x029e:
            r11 = r103
        L_0x02a0:
            r11 = r13 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x02bc
            r11 = r12 & r28
            if (r11 != 0) goto L_0x02b3
            r11 = r104
            boolean r23 = r0.W(r11)
            if (r23 == 0) goto L_0x02b5
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x02b7
        L_0x02b3:
            r11 = r104
        L_0x02b5:
            r27 = 128(0x80, float:1.794E-43)
        L_0x02b7:
            r22 = r22 | r27
        L_0x02b9:
            r11 = r22
            goto L_0x02bf
        L_0x02bc:
            r11 = r104
            goto L_0x02b9
        L_0x02bf:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r4 & r22
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r22 = r10
            if (r13 != r14) goto L_0x02dd
            r13 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r13 & r6
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r14) goto L_0x02dd
            r11 = r11 & 147(0x93, float:2.06E-43)
            r13 = 146(0x92, float:2.05E-43)
            if (r11 == r13) goto L_0x02db
            goto L_0x02dd
        L_0x02db:
            r11 = 0
            goto L_0x02de
        L_0x02dd:
            r11 = 1
        L_0x02de:
            r13 = r4 & 1
            boolean r11 = r0.E(r11, r13)
            if (r11 == 0) goto L_0x0552
            r0.p()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x0336
            boolean r11 = r0.J()
            if (r11 == 0) goto L_0x02f4
            goto L_0x0336
        L_0x02f4:
            r0.B()
            r1 = r12 & 32
            if (r1 == 0) goto L_0x02ff
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r1
        L_0x02ff:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r12
            if (r1 == 0) goto L_0x0308
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
        L_0x0308:
            r8 = r84
            r11 = r85
            r13 = r86
            r14 = r87
            r1 = r88
            r9 = r89
            r2 = r90
            r3 = r91
            r5 = r93
            r84 = r94
            r10 = r96
            r40 = r97
            r41 = r98
            r42 = r99
            r43 = r100
            r44 = r101
            r45 = r102
            r46 = r103
            r12 = r104
            r15 = r4
            r7 = r6
            r4 = r92
            r6 = r95
            goto L_0x0424
        L_0x0336:
            if (r8 == 0) goto L_0x033b
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            goto L_0x033d
        L_0x033b:
            r8 = r84
        L_0x033d:
            if (r16 == 0) goto L_0x0341
            r11 = 1
            goto L_0x0343
        L_0x0341:
            r11 = r85
        L_0x0343:
            if (r19 == 0) goto L_0x0347
            r13 = 0
            goto L_0x0349
        L_0x0347:
            r13 = r86
        L_0x0349:
            r14 = r12 & 32
            if (r14 == 0) goto L_0x035d
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.material3.TextKt.q()
            java.lang.Object r14 = r0.C(r14)
            androidx.compose.ui.text.TextStyle r14 = (androidx.compose.ui.text.TextStyle) r14
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r16
            goto L_0x035f
        L_0x035d:
            r14 = r87
        L_0x035f:
            r16 = 0
            if (r24 == 0) goto L_0x0366
            r19 = r16
            goto L_0x0368
        L_0x0366:
            r19 = r88
        L_0x0368:
            if (r9 == 0) goto L_0x036d
            r9 = r16
            goto L_0x036f
        L_0x036d:
            r9 = r89
        L_0x036f:
            if (r1 == 0) goto L_0x0374
            r1 = r16
            goto L_0x0376
        L_0x0374:
            r1 = r90
        L_0x0376:
            if (r2 == 0) goto L_0x037b
            r2 = r16
            goto L_0x037d
        L_0x037b:
            r2 = r91
        L_0x037d:
            if (r3 == 0) goto L_0x0382
            r3 = r16
            goto L_0x0384
        L_0x0382:
            r3 = r92
        L_0x0384:
            if (r5 == 0) goto L_0x0389
            r5 = r16
            goto L_0x038b
        L_0x0389:
            r5 = r93
        L_0x038b:
            if (r7 == 0) goto L_0x0390
            r7 = r16
            goto L_0x0392
        L_0x0390:
            r7 = r94
        L_0x0392:
            if (r22 == 0) goto L_0x0397
            r22 = 0
            goto L_0x0399
        L_0x0397:
            r22 = r95
        L_0x0399:
            if (r17 == 0) goto L_0x03a2
            androidx.compose.ui.text.input.VisualTransformation$Companion r17 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r17 = r17.c()
            goto L_0x03a4
        L_0x03a2:
            r17 = r96
        L_0x03a4:
            if (r18 == 0) goto L_0x03ad
            androidx.compose.foundation.text.KeyboardOptions$Companion r18 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r18 = r18.a()
            goto L_0x03af
        L_0x03ad:
            r18 = r97
        L_0x03af:
            if (r20 == 0) goto L_0x03b8
            androidx.compose.foundation.text.KeyboardActions$Companion r20 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r20 = r20.a()
            goto L_0x03ba
        L_0x03b8:
            r20 = r98
        L_0x03ba:
            if (r21 == 0) goto L_0x03bf
            r21 = 0
            goto L_0x03c1
        L_0x03bf:
            r21 = r99
        L_0x03c1:
            r23 = 262144(0x40000, float:3.67342E-40)
            r23 = r12 & r23
            if (r23 == 0) goto L_0x03d5
            if (r21 == 0) goto L_0x03cc
            r23 = 1
            goto L_0x03cf
        L_0x03cc:
            r23 = 2147483647(0x7fffffff, float:NaN)
        L_0x03cf:
            r24 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r24
            goto L_0x03d7
        L_0x03d5:
            r23 = r100
        L_0x03d7:
            if (r25 == 0) goto L_0x03dc
            r24 = 1
            goto L_0x03de
        L_0x03dc:
            r24 = r101
        L_0x03de:
            if (r29 == 0) goto L_0x03e1
            goto L_0x03e3
        L_0x03e1:
            r16 = r102
        L_0x03e3:
            r25 = 2097152(0x200000, float:2.938736E-39)
            r25 = r12 & r25
            r10 = 6
            r84 = r1
            if (r25 == 0) goto L_0x03f3
            androidx.compose.material3.OutlinedTextFieldDefaults r1 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            androidx.compose.ui.graphics.Shape r1 = r1.p(r0, r10)
            goto L_0x03f5
        L_0x03f3:
            r1 = r103
        L_0x03f5:
            r25 = r12 & r28
            r85 = r1
            if (r25 == 0) goto L_0x041f
            androidx.compose.material3.OutlinedTextFieldDefaults r1 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            androidx.compose.material3.TextFieldColors r1 = r1.g(r0, r10)
            r46 = r85
            r12 = r1
        L_0x0404:
            r15 = r4
            r45 = r16
            r10 = r17
            r40 = r18
            r1 = r19
            r41 = r20
            r42 = r21
            r43 = r23
            r44 = r24
            r4 = r3
            r3 = r2
            r2 = r84
            r84 = r7
            r7 = r6
            r6 = r22
            goto L_0x0424
        L_0x041f:
            r46 = r85
            r12 = r104
            goto L_0x0404
        L_0x0424:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x043a
            r85 = r5
            r5 = 1901501544(0x71569c68, float:1.062702E30)
            r86 = r4
            java.lang.String r4 = "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:393)"
            androidx.compose.runtime.ComposerKt.Y(r5, r15, r7, r4)
            goto L_0x043e
        L_0x043a:
            r86 = r4
            r85 = r5
        L_0x043e:
            if (r45 != 0) goto L_0x045f
            r4 = 1310051731(0x4e15cd93, float:6.2831942E8)
            r0.X(r4)
            java.lang.Object r4 = r0.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x0459
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r0.N(r4)
        L_0x0459:
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = (androidx.compose.foundation.interaction.MutableInteractionSource) r4
            r0.M()
            goto L_0x046a
        L_0x045f:
            r4 = 1981921732(0x7621b9c4, float:8.2004645E32)
            r0.X(r4)
            r0.M()
            r4 = r45
        L_0x046a:
            r5 = 1981927842(0x7621d1a2, float:8.205192E32)
            r0.X(r5)
            long r15 = r14.h()
            r17 = 16
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x047d
        L_0x047a:
            r48 = r15
            goto L_0x0491
        L_0x047d:
            r5 = 0
            androidx.compose.runtime.State r5 = androidx.compose.foundation.interaction.FocusInteractionKt.a(r4, r0, r5)
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            long r15 = r12.w(r11, r6, r5)
            goto L_0x047a
        L_0x0491:
            r0.M()
            androidx.compose.ui.text.TextStyle r5 = new androidx.compose.ui.text.TextStyle
            r47 = r5
            r77 = 16777214(0xfffffe, float:2.3509884E-38)
            r78 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r47.<init>(r48, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r64, r65, r66, r67, r68, r69, r71, r72, r73, r74, r75, r76, r77, r78)
            androidx.compose.ui.text.TextStyle r25 = r14.J(r5)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            androidx.compose.foundation.text.selection.TextSelectionColors r7 = r12.l()
            androidx.compose.runtime.ProvidedValue r5 = r5.d(r7)
            androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3 r7 = new androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
            r16 = r7
            r17 = r8
            r18 = r1
            r19 = r6
            r20 = r12
            r21 = r82
            r22 = r83
            r23 = r11
            r24 = r13
            r26 = r40
            r27 = r41
            r28 = r42
            r29 = r43
            r30 = r44
            r31 = r10
            r32 = r4
            r33 = r9
            r34 = r2
            r35 = r3
            r36 = r86
            r37 = r85
            r38 = r84
            r39 = r46
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r4 = 54
            r15 = 1874034984(0x6fb38128, float:1.1110791E29)
            r87 = r1
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r15, r1, r7, r0, r4)
            int r4 = androidx.compose.runtime.ProvidedValue.f14769i
            r4 = r4 | 48
            androidx.compose.runtime.CompositionLocalKt.c(r5, r1, r0, r4)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x052d
            androidx.compose.runtime.ComposerKt.X()
        L_0x052d:
            r7 = r87
            r15 = r10
            r4 = r11
            r23 = r12
            r5 = r13
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            r21 = r45
            r22 = r46
            r13 = r84
            r12 = r85
            r11 = r86
            r10 = r3
            r3 = r8
            r8 = r9
            r9 = r2
            r81 = r14
            r14 = r6
            r6 = r81
            goto L_0x057f
        L_0x0552:
            r0.B()
            r3 = r84
            r4 = r85
            r5 = r86
            r6 = r87
            r7 = r88
            r8 = r89
            r9 = r90
            r10 = r91
            r11 = r92
            r12 = r93
            r13 = r94
            r14 = r95
            r15 = r96
            r16 = r97
            r17 = r98
            r18 = r99
            r19 = r100
            r20 = r101
            r21 = r102
            r22 = r103
            r23 = r104
        L_0x057f:
            androidx.compose.runtime.ScopeUpdateScope r2 = r0.x()
            if (r2 == 0) goto L_0x05a2
            androidx.compose.material3.L4 r1 = new androidx.compose.material3.L4
            r0 = r1
            r79 = r1
            r1 = r82
            r80 = r2
            r2 = r83
            r24 = r106
            r25 = r107
            r26 = r108
            r27 = r109
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = r79
            r0 = r80
            r0.a(r1)
        L_0x05a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.g(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    public static final Unit h(String str, Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        g(str, function1, modifier, z2, z3, textStyle, function2, function22, function23, function24, function25, function26, function27, z4, visualTransformation, keyboardOptions, keyboardActions, z5, i2, i3, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.a(i4 | 1), RecomposeScopeImplKt.a(i5), RecomposeScopeImplKt.a(i6), i7);
        return Unit.f40552a;
    }

    public static final Unit i(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        f(textFieldValue, function1, modifier, z2, z3, textStyle, function2, function22, function23, function24, function25, function26, function27, z4, visualTransformation, keyboardOptions, keyboardActions, z5, i2, i3, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.a(i4 | 1), RecomposeScopeImplKt.a(i5), RecomposeScopeImplKt.a(i6), i7);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:276:0x0718  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0728  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(androidx.compose.ui.Modifier r42, kotlin.jvm.functions.Function2 r43, kotlin.jvm.functions.Function3 r44, kotlin.jvm.functions.Function2 r45, kotlin.jvm.functions.Function2 r46, kotlin.jvm.functions.Function2 r47, kotlin.jvm.functions.Function2 r48, kotlin.jvm.functions.Function2 r49, boolean r50, androidx.compose.material3.TextFieldLabelPosition r51, androidx.compose.material3.internal.FloatProducer r52, kotlin.jvm.functions.Function1 r53, kotlin.jvm.functions.Function2 r54, kotlin.jvm.functions.Function2 r55, androidx.compose.foundation.layout.PaddingValues r56, androidx.compose.runtime.Composer r57, int r58, int r59) {
        /*
            r1 = r42
            r2 = r43
            r3 = r44
            r4 = r45
            r5 = r46
            r6 = r47
            r7 = r48
            r8 = r49
            r0 = r51
            r15 = r52
            r14 = r54
            r13 = r55
            r12 = r56
            r11 = r58
            r10 = r59
            r18 = 8192(0x2000, float:1.14794E-41)
            r9 = 753699262(0x2cec89be, float:6.722816E-12)
            r12 = r57
            androidx.compose.runtime.Composer r12 = r12.q(r9)
            r21 = r11 & 6
            if (r21 != 0) goto L_0x003b
            boolean r21 = r12.W(r1)
            if (r21 == 0) goto L_0x0036
            r21 = 4
            goto L_0x0038
        L_0x0036:
            r21 = 2
        L_0x0038:
            r21 = r11 | r21
            goto L_0x003d
        L_0x003b:
            r21 = r11
        L_0x003d:
            r23 = r11 & 48
            r24 = 16
            if (r23 != 0) goto L_0x0050
            boolean r23 = r12.l(r2)
            if (r23 == 0) goto L_0x004c
            r23 = 32
            goto L_0x004e
        L_0x004c:
            r23 = r24
        L_0x004e:
            r21 = r21 | r23
        L_0x0050:
            r9 = r11 & 384(0x180, float:5.38E-43)
            r26 = 128(0x80, float:1.794E-43)
            r27 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x0065
            boolean r9 = r12.l(r3)
            if (r9 == 0) goto L_0x0061
            r9 = r27
            goto L_0x0063
        L_0x0061:
            r9 = r26
        L_0x0063:
            r21 = r21 | r9
        L_0x0065:
            r9 = r11 & 3072(0xc00, float:4.305E-42)
            r28 = 1024(0x400, float:1.435E-42)
            r29 = 2048(0x800, float:2.87E-42)
            if (r9 != 0) goto L_0x007a
            boolean r9 = r12.l(r4)
            if (r9 == 0) goto L_0x0076
            r9 = r29
            goto L_0x0078
        L_0x0076:
            r9 = r28
        L_0x0078:
            r21 = r21 | r9
        L_0x007a:
            r9 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x008b
            boolean r9 = r12.l(r5)
            if (r9 == 0) goto L_0x0087
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r9 = r18
        L_0x0089:
            r21 = r21 | r9
        L_0x008b:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x009d
            boolean r9 = r12.l(r6)
            if (r9 == 0) goto L_0x0099
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009b
        L_0x0099:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x009b:
            r21 = r21 | r9
        L_0x009d:
            r9 = 1572864(0x180000, float:2.204052E-39)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00af
            boolean r9 = r12.l(r7)
            if (r9 == 0) goto L_0x00ab
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ad
        L_0x00ab:
            r9 = 524288(0x80000, float:7.34684E-40)
        L_0x00ad:
            r21 = r21 | r9
        L_0x00af:
            r9 = 12582912(0xc00000, float:1.7632415E-38)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00c1
            boolean r9 = r12.l(r8)
            if (r9 == 0) goto L_0x00bd
            r9 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00bf
        L_0x00bd:
            r9 = 4194304(0x400000, float:5.877472E-39)
        L_0x00bf:
            r21 = r21 | r9
        L_0x00c1:
            r9 = 100663296(0x6000000, float:2.4074124E-35)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00d6
            r9 = r50
            boolean r30 = r12.d(r9)
            if (r30 == 0) goto L_0x00d1
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00d3
        L_0x00d1:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00d3:
            r21 = r21 | r30
            goto L_0x00d8
        L_0x00d6:
            r9 = r50
        L_0x00d8:
            r30 = 805306368(0x30000000, float:4.656613E-10)
            r30 = r11 & r30
            if (r30 != 0) goto L_0x00eb
            boolean r30 = r12.W(r0)
            if (r30 == 0) goto L_0x00e7
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00e9
        L_0x00e7:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00e9:
            r21 = r21 | r30
        L_0x00eb:
            r4 = r21
            r21 = r10 & 6
            if (r21 != 0) goto L_0x0108
            r21 = r10 & 8
            if (r21 != 0) goto L_0x00fa
            boolean r21 = r12.W(r15)
            goto L_0x00fe
        L_0x00fa:
            boolean r21 = r12.l(r15)
        L_0x00fe:
            if (r21 == 0) goto L_0x0103
            r21 = 4
            goto L_0x0105
        L_0x0103:
            r21 = 2
        L_0x0105:
            r21 = r10 | r21
            goto L_0x010a
        L_0x0108:
            r21 = r10
        L_0x010a:
            r31 = r10 & 48
            r0 = r53
            if (r31 != 0) goto L_0x011a
            boolean r31 = r12.l(r0)
            if (r31 == 0) goto L_0x0118
            r24 = 32
        L_0x0118:
            r21 = r21 | r24
        L_0x011a:
            r0 = r10 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0128
            boolean r0 = r12.l(r14)
            if (r0 == 0) goto L_0x0126
            r26 = r27
        L_0x0126:
            r21 = r21 | r26
        L_0x0128:
            r0 = r10 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0136
            boolean r0 = r12.l(r13)
            if (r0 == 0) goto L_0x0134
            r28 = r29
        L_0x0134:
            r21 = r21 | r28
        L_0x0136:
            r0 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0149
            r0 = r56
            boolean r24 = r12.W(r0)
            if (r24 == 0) goto L_0x0144
            r18 = 16384(0x4000, float:2.2959E-41)
        L_0x0144:
            r21 = r21 | r18
        L_0x0146:
            r0 = r21
            goto L_0x014c
        L_0x0149:
            r0 = r56
            goto L_0x0146
        L_0x014c:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r9 = r4 & r18
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r10) goto L_0x0160
            r9 = r0 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r9 == r10) goto L_0x015d
            goto L_0x0160
        L_0x015d:
            r9 = 0
        L_0x015e:
            r10 = 1
            goto L_0x0162
        L_0x0160:
            r9 = 1
            goto L_0x015e
        L_0x0162:
            r2 = r4 & 1
            boolean r2 = r12.E(r9, r2)
            if (r2 == 0) goto L_0x0858
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0178
            java.lang.String r2 = "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:659)"
            r9 = 753699262(0x2cec89be, float:6.722816E-12)
            androidx.compose.runtime.ComposerKt.Y(r9, r4, r0, r2)
        L_0x0178:
            r2 = 0
            float r9 = androidx.compose.material3.internal.TextFieldImplKt.Q(r12, r2)
            r2 = r0 & 112(0x70, float:1.57E-43)
            r10 = 32
            if (r2 != r10) goto L_0x0185
            r2 = 1
            goto L_0x0186
        L_0x0185:
            r2 = 0
        L_0x0186:
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r10 = r10 & r4
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            if (r10 != r11) goto L_0x018f
            r10 = 1
            goto L_0x0190
        L_0x018f:
            r10 = 0
        L_0x0190:
            r2 = r2 | r10
            r10 = 1879048192(0x70000000, float:1.58456325E29)
            r10 = r10 & r4
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            if (r10 != r11) goto L_0x019a
            r10 = 1
            goto L_0x019b
        L_0x019a:
            r10 = 0
        L_0x019b:
            r2 = r2 | r10
            r11 = r0 & 14
            r10 = 4
            if (r11 == r10) goto L_0x01af
            r17 = r0 & 8
            if (r17 == 0) goto L_0x01ac
            boolean r17 = r12.W(r15)
            if (r17 == 0) goto L_0x01ac
            goto L_0x01af
        L_0x01ac:
            r17 = 0
            goto L_0x01b1
        L_0x01af:
            r17 = 1
        L_0x01b1:
            r2 = r2 | r17
            r17 = 57344(0xe000, float:8.0356E-41)
            r10 = r0 & r17
            r17 = r11
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r10 != r11) goto L_0x01c0
            r10 = 1
            goto L_0x01c1
        L_0x01c0:
            r10 = 0
        L_0x01c1:
            r2 = r2 | r10
            boolean r10 = r12.h(r9)
            r2 = r2 | r10
            java.lang.Object r10 = r12.g()
            if (r2 != 0) goto L_0x01df
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r10 != r2) goto L_0x01d6
            goto L_0x01df
        L_0x01d6:
            r3 = r56
            r20 = r9
            r8 = r12
            r7 = r14
            r32 = r17
            goto L_0x0204
        L_0x01df:
            androidx.compose.material3.OutlinedTextFieldMeasurePolicy r2 = new androidx.compose.material3.OutlinedTextFieldMeasurePolicy
            r19 = 0
            r20 = r9
            r3 = 2
            r10 = 4
            r11 = 1
            r9 = r2
            r10 = r53
            r32 = r17
            r11 = r50
            r3 = r56
            r8 = r12
            r12 = r51
            r13 = r52
            r7 = r14
            r14 = r56
            r15 = r20
            r16 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.N(r2)
            r10 = r2
        L_0x0204:
            androidx.compose.material3.OutlinedTextFieldMeasurePolicy r10 = (androidx.compose.material3.OutlinedTextFieldMeasurePolicy) r10
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r2 = r8.C(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.ui.unit.LayoutDirection) r2
            r9 = 0
            int r11 = androidx.compose.runtime.ComposablesKt.a(r8, r9)
            androidx.compose.runtime.CompositionLocalMap r9 = r8.I()
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.ComposedModifierKt.e(r8, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r14 = r13.a()
            androidx.compose.runtime.Applier r15 = r8.v()
            if (r15 != 0) goto L_0x022c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x022c:
            r8.s()
            boolean r15 = r8.n()
            if (r15 == 0) goto L_0x0239
            r8.y(r14)
            goto L_0x023c
        L_0x0239:
            r8.K()
        L_0x023c:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r8)
            kotlin.jvm.functions.Function2 r15 = r13.c()
            androidx.compose.runtime.Updater.g(r14, r10, r15)
            kotlin.jvm.functions.Function2 r10 = r13.e()
            androidx.compose.runtime.Updater.g(r14, r9, r10)
            kotlin.jvm.functions.Function2 r9 = r13.b()
            boolean r10 = r14.n()
            if (r10 != 0) goto L_0x0266
            java.lang.Object r10 = r14.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r15)
            if (r10 != 0) goto L_0x0274
        L_0x0266:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r14.N(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r14.A(r10, r9)
        L_0x0274:
            kotlin.jvm.functions.Function2 r9 = r13.d()
            androidx.compose.runtime.Updater.g(r14, r12, r9)
            int r9 = r0 >> 6
            r9 = r9 & 14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.m(r8, r9)
            if (r5 == 0) goto L_0x0321
            r9 = 2145628269(0x7fe3b06d, float:NaN)
            r8.X(r9)
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r10 = "Leading"
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.layout.LayoutIdKt.b(r9, r10)
            androidx.compose.ui.Modifier r9 = androidx.compose.material3.InteractiveComponentSizeKt.h(r9)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r10 = r10.e()
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.g(r10, r11)
            int r12 = androidx.compose.runtime.ComposablesKt.a(r8, r11)
            androidx.compose.runtime.CompositionLocalMap r11 = r8.I()
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.ComposedModifierKt.e(r8, r9)
            kotlin.jvm.functions.Function0 r14 = r13.a()
            androidx.compose.runtime.Applier r15 = r8.v()
            if (r15 != 0) goto L_0x02be
            androidx.compose.runtime.ComposablesKt.d()
        L_0x02be:
            r8.s()
            boolean r15 = r8.n()
            if (r15 == 0) goto L_0x02cb
            r8.y(r14)
            goto L_0x02ce
        L_0x02cb:
            r8.K()
        L_0x02ce:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r8)
            kotlin.jvm.functions.Function2 r15 = r13.c()
            androidx.compose.runtime.Updater.g(r14, r10, r15)
            kotlin.jvm.functions.Function2 r10 = r13.e()
            androidx.compose.runtime.Updater.g(r14, r11, r10)
            kotlin.jvm.functions.Function2 r10 = r13.b()
            boolean r11 = r14.n()
            if (r11 != 0) goto L_0x02f8
            java.lang.Object r11 = r14.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r15)
            if (r11 != 0) goto L_0x0306
        L_0x02f8:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r14.N(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r14.A(r11, r10)
        L_0x0306:
            kotlin.jvm.functions.Function2 r10 = r13.d()
            androidx.compose.runtime.Updater.g(r14, r9, r10)
            androidx.compose.foundation.layout.BoxScopeInstance r9 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r9 = r4 >> 12
            r9 = r9 & 14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5.m(r8, r9)
            r8.T()
            r8.M()
            goto L_0x032a
        L_0x0321:
            r9 = 2145874285(0x7fe7716d, float:NaN)
            r8.X(r9)
            r8.M()
        L_0x032a:
            if (r6 == 0) goto L_0x03c5
            r9 = 2145917003(0x7fe8184b, float:NaN)
            r8.X(r9)
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r10 = "Trailing"
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.layout.LayoutIdKt.b(r9, r10)
            androidx.compose.ui.Modifier r9 = androidx.compose.material3.InteractiveComponentSizeKt.h(r9)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r10 = r10.e()
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.g(r10, r11)
            int r12 = androidx.compose.runtime.ComposablesKt.a(r8, r11)
            androidx.compose.runtime.CompositionLocalMap r11 = r8.I()
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.ComposedModifierKt.e(r8, r9)
            kotlin.jvm.functions.Function0 r14 = r13.a()
            androidx.compose.runtime.Applier r15 = r8.v()
            if (r15 != 0) goto L_0x0362
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0362:
            r8.s()
            boolean r15 = r8.n()
            if (r15 == 0) goto L_0x036f
            r8.y(r14)
            goto L_0x0372
        L_0x036f:
            r8.K()
        L_0x0372:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r8)
            kotlin.jvm.functions.Function2 r15 = r13.c()
            androidx.compose.runtime.Updater.g(r14, r10, r15)
            kotlin.jvm.functions.Function2 r10 = r13.e()
            androidx.compose.runtime.Updater.g(r14, r11, r10)
            kotlin.jvm.functions.Function2 r10 = r13.b()
            boolean r11 = r14.n()
            if (r11 != 0) goto L_0x039c
            java.lang.Object r11 = r14.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r15)
            if (r11 != 0) goto L_0x03aa
        L_0x039c:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r14.N(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r14.A(r11, r10)
        L_0x03aa:
            kotlin.jvm.functions.Function2 r10 = r13.d()
            androidx.compose.runtime.Updater.g(r14, r9, r10)
            androidx.compose.foundation.layout.BoxScopeInstance r9 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r9 = r4 >> 15
            r9 = r9 & 14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.m(r8, r9)
            r8.T()
            r8.M()
            goto L_0x03ce
        L_0x03c5:
            r9 = 2146164941(0x7febe0cd, float:NaN)
            r8.X(r9)
            r8.M()
        L_0x03ce:
            float r9 = androidx.compose.foundation.layout.PaddingKt.g(r3, r2)
            float r2 = androidx.compose.foundation.layout.PaddingKt.f(r3, r2)
            if (r5 == 0) goto L_0x03ed
            float r9 = r9 - r20
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            r10 = 0
            float r11 = (float) r10
            float r11 = androidx.compose.ui.unit.Dp.m(r11)
            float r9 = kotlin.ranges.RangesKt.d(r9, r11)
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            goto L_0x03ee
        L_0x03ed:
            r10 = 0
        L_0x03ee:
            if (r6 == 0) goto L_0x0403
            float r2 = r2 - r20
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            float r11 = (float) r10
            float r10 = androidx.compose.ui.unit.Dp.m(r11)
            float r2 = kotlin.ranges.RangesKt.d(r2, r10)
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
        L_0x0403:
            r10 = 0
            r11 = 0
            r7 = r48
            if (r7 == 0) goto L_0x04c2
            r12 = 2146868920(0x7ff69eb8, float:NaN)
            r8.X(r12)
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r14 = "Prefix"
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.layout.LayoutIdKt.b(r12, r14)
            float r14 = androidx.compose.material3.internal.TextFieldImplKt.G()
            r15 = 2
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.k(r12, r14, r10, r15, r11)
            r14 = 0
            r15 = 3
            androidx.compose.ui.Modifier r33 = androidx.compose.foundation.layout.SizeKt.C(r12, r11, r14, r15, r11)
            float r36 = androidx.compose.material3.internal.TextFieldImplKt.I()
            r38 = 10
            r39 = 0
            r35 = 0
            r37 = 0
            r34 = r9
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.PaddingKt.m(r33, r34, r35, r36, r37, r38, r39)
            androidx.compose.ui.Alignment$Companion r14 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r14 = r14.o()
            r15 = 0
            androidx.compose.ui.layout.MeasurePolicy r14 = androidx.compose.foundation.layout.BoxKt.g(r14, r15)
            int r16 = androidx.compose.runtime.ComposablesKt.a(r8, r15)
            androidx.compose.runtime.CompositionLocalMap r15 = r8.I()
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.ComposedModifierKt.e(r8, r12)
            kotlin.jvm.functions.Function0 r10 = r13.a()
            androidx.compose.runtime.Applier r17 = r8.v()
            if (r17 != 0) goto L_0x045c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x045c:
            r8.s()
            boolean r17 = r8.n()
            if (r17 == 0) goto L_0x0469
            r8.y(r10)
            goto L_0x046c
        L_0x0469:
            r8.K()
        L_0x046c:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r8)
            kotlin.jvm.functions.Function2 r11 = r13.c()
            androidx.compose.runtime.Updater.g(r10, r14, r11)
            kotlin.jvm.functions.Function2 r11 = r13.e()
            androidx.compose.runtime.Updater.g(r10, r15, r11)
            kotlin.jvm.functions.Function2 r11 = r13.b()
            boolean r14 = r10.n()
            if (r14 != 0) goto L_0x0496
            java.lang.Object r14 = r10.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            boolean r14 = kotlin.jvm.internal.Intrinsics.d(r14, r15)
            if (r14 != 0) goto L_0x04a4
        L_0x0496:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            r10.N(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            r10.A(r14, r11)
        L_0x04a4:
            kotlin.jvm.functions.Function2 r11 = r13.d()
            androidx.compose.runtime.Updater.g(r10, r12, r11)
            androidx.compose.foundation.layout.BoxScopeInstance r10 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r10 = r4 >> 18
            r10 = r10 & 14
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.m(r8, r10)
            r8.T()
            r8.M()
        L_0x04be:
            r10 = r8
            r8 = r49
            goto L_0x04cc
        L_0x04c2:
            r10 = 2147196621(0x7ffb9ecd, float:NaN)
            r8.X(r10)
            r8.M()
            goto L_0x04be
        L_0x04cc:
            if (r8 == 0) goto L_0x0588
            r11 = 2147239866(0x7ffc47ba, float:NaN)
            r10.X(r11)
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r12 = "Suffix"
            androidx.compose.ui.Modifier r11 = androidx.compose.ui.layout.LayoutIdKt.b(r11, r12)
            float r12 = androidx.compose.material3.internal.TextFieldImplKt.G()
            r1 = 0
            r14 = 2
            r15 = 0
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.SizeKt.k(r11, r12, r15, r14, r1)
            r12 = 0
            r14 = 3
            androidx.compose.ui.Modifier r33 = androidx.compose.foundation.layout.SizeKt.C(r11, r1, r12, r14, r1)
            float r34 = androidx.compose.material3.internal.TextFieldImplKt.I()
            r38 = 10
            r39 = 0
            r35 = 0
            r37 = 0
            r36 = r2
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r33, r34, r35, r36, r37, r38, r39)
            androidx.compose.ui.Alignment$Companion r11 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r11 = r11.o()
            r12 = 0
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.BoxKt.g(r11, r12)
            int r14 = androidx.compose.runtime.ComposablesKt.a(r10, r12)
            androidx.compose.runtime.CompositionLocalMap r12 = r10.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r10, r1)
            kotlin.jvm.functions.Function0 r15 = r13.a()
            androidx.compose.runtime.Applier r16 = r10.v()
            if (r16 != 0) goto L_0x0523
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0523:
            r10.s()
            boolean r16 = r10.n()
            if (r16 == 0) goto L_0x0530
            r10.y(r15)
            goto L_0x0533
        L_0x0530:
            r10.K()
        L_0x0533:
            androidx.compose.runtime.Composer r15 = androidx.compose.runtime.Updater.b(r10)
            r16 = r2
            kotlin.jvm.functions.Function2 r2 = r13.c()
            androidx.compose.runtime.Updater.g(r15, r11, r2)
            kotlin.jvm.functions.Function2 r2 = r13.e()
            androidx.compose.runtime.Updater.g(r15, r12, r2)
            kotlin.jvm.functions.Function2 r2 = r13.b()
            boolean r11 = r15.n()
            if (r11 != 0) goto L_0x055f
            java.lang.Object r11 = r15.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r11 != 0) goto L_0x056d
        L_0x055f:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r15.N(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r15.A(r11, r2)
        L_0x056d:
            kotlin.jvm.functions.Function2 r2 = r13.d()
            androidx.compose.runtime.Updater.g(r15, r1, r2)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r1 = r4 >> 21
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.m(r10, r1)
            r10.T()
            r10.M()
            goto L_0x0593
        L_0x0588:
            r16 = r2
            r1 = -2147401651(0xffffffff8001404d, float:-1.14902E-40)
            r10.X(r1)
            r10.M()
        L_0x0593:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            float r2 = androidx.compose.material3.internal.TextFieldImplKt.G()
            r11 = 2
            r12 = 0
            r14 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.k(r1, r2, r12, r11, r14)
            r12 = 0
            r15 = 3
            androidx.compose.ui.Modifier r19 = androidx.compose.foundation.layout.SizeKt.C(r2, r14, r12, r15, r14)
            if (r7 != 0) goto L_0x05ab
        L_0x05a8:
            r20 = r9
            goto L_0x05b1
        L_0x05ab:
            float r2 = (float) r12
            float r9 = androidx.compose.ui.unit.Dp.m(r2)
            goto L_0x05a8
        L_0x05b1:
            if (r8 != 0) goto L_0x05b6
            r22 = r16
            goto L_0x05bd
        L_0x05b6:
            float r2 = (float) r12
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            r22 = r2
        L_0x05bd:
            r24 = 10
            r25 = 0
            r21 = 0
            r23 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m(r19, r20, r21, r22, r23, r24, r25)
            r9 = r44
            if (r9 == 0) goto L_0x05ed
            r12 = -2147031666(0xffffffff8006e58e, float:-6.33362E-40)
            r10.X(r12)
            java.lang.String r12 = "Hint"
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.layout.LayoutIdKt.b(r1, r12)
            androidx.compose.ui.Modifier r12 = r12.o0(r2)
            r14 = 3
            int r15 = r4 >> 3
            r14 = r15 & 112(0x70, float:1.57E-43)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r9.d(r12, r10, r14)
            r10.M()
            goto L_0x05f6
        L_0x05ed:
            r12 = -2146940371(0xffffffff80084a2d, float:-7.61293E-40)
            r10.X(r12)
            r10.M()
        L_0x05f6:
            java.lang.String r12 = "TextField"
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.layout.LayoutIdKt.b(r1, r12)
            androidx.compose.ui.Modifier r2 = r12.o0(r2)
            androidx.compose.ui.Alignment$Companion r12 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r14 = r12.o()
            r15 = 1
            androidx.compose.ui.layout.MeasurePolicy r14 = androidx.compose.foundation.layout.BoxKt.g(r14, r15)
            r15 = 0
            int r18 = androidx.compose.runtime.ComposablesKt.a(r10, r15)
            androidx.compose.runtime.CompositionLocalMap r15 = r10.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r10, r2)
            kotlin.jvm.functions.Function0 r11 = r13.a()
            androidx.compose.runtime.Applier r20 = r10.v()
            if (r20 != 0) goto L_0x0625
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0625:
            r10.s()
            boolean r20 = r10.n()
            if (r20 == 0) goto L_0x0632
            r10.y(r11)
            goto L_0x0635
        L_0x0632:
            r10.K()
        L_0x0635:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r3 = r13.c()
            androidx.compose.runtime.Updater.g(r11, r14, r3)
            kotlin.jvm.functions.Function2 r3 = r13.e()
            androidx.compose.runtime.Updater.g(r11, r15, r3)
            kotlin.jvm.functions.Function2 r3 = r13.b()
            boolean r14 = r11.n()
            if (r14 != 0) goto L_0x065f
            java.lang.Object r14 = r11.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r18)
            boolean r14 = kotlin.jvm.internal.Intrinsics.d(r14, r15)
            if (r14 != 0) goto L_0x066d
        L_0x065f:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r18)
            r11.N(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r18)
            r11.A(r14, r3)
        L_0x066d:
            kotlin.jvm.functions.Function2 r3 = r13.d()
            androidx.compose.runtime.Updater.g(r11, r2, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r2 = 3
            int r3 = r4 >> 3
            r2 = r3 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r43
            r11 = 0
            r3.m(r10, r2)
            r10.T()
            r2 = r51
            boolean r14 = r2 instanceof androidx.compose.material3.TextFieldLabelPosition.Above
            if (r14 == 0) goto L_0x06a9
            float r34 = androidx.compose.material3.internal.TextFieldImplKt.C()
            float r36 = androidx.compose.material3.internal.TextFieldImplKt.C()
            float r37 = androidx.compose.material3.internal.TextFieldImplKt.B()
            r38 = 2
            r39 = 0
            r35 = 0
            r33 = r1
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.layout.PaddingKt.m(r33, r34, r35, r36, r37, r38, r39)
            r15 = r45
            goto L_0x06ac
        L_0x06a9:
            r15 = r45
            r14 = r1
        L_0x06ac:
            if (r15 == 0) goto L_0x077e
            r11 = -2146287790(0xffffffff80123f52, float:-1.675754E-39)
            r10.X(r11)
            r2 = r32
            r11 = 4
            if (r2 == r11) goto L_0x06c9
            r2 = r0 & 8
            r11 = r52
            if (r2 == 0) goto L_0x06c6
            boolean r2 = r10.l(r11)
            if (r2 == 0) goto L_0x06c6
            goto L_0x06cb
        L_0x06c6:
            r16 = 0
            goto L_0x06cd
        L_0x06c9:
            r11 = r52
        L_0x06cb:
            r16 = 1
        L_0x06cd:
            java.lang.Object r2 = r10.g()
            if (r16 != 0) goto L_0x06db
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r16.a()
            if (r2 != r3) goto L_0x06e3
        L_0x06db:
            androidx.compose.material3.N4 r2 = new androidx.compose.material3.N4
            r2.<init>(r11)
            r10.N(r2)
        L_0x06e3:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            androidx.compose.ui.Modifier r2 = androidx.compose.material3.internal.TextFieldImplKt.R(r1, r2)
            r3 = 0
            r5 = 0
            r6 = 3
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.C(r2, r5, r3, r6, r5)
            java.lang.String r5 = "Label"
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.layout.LayoutIdKt.b(r2, r5)
            androidx.compose.ui.Modifier r2 = r2.o0(r14)
            androidx.compose.ui.Alignment r5 = r12.o()
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.BoxKt.g(r5, r3)
            int r6 = androidx.compose.runtime.ComposablesKt.a(r10, r3)
            androidx.compose.runtime.CompositionLocalMap r3 = r10.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r10, r2)
            kotlin.jvm.functions.Function0 r14 = r13.a()
            androidx.compose.runtime.Applier r16 = r10.v()
            if (r16 != 0) goto L_0x071b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x071b:
            r10.s()
            boolean r16 = r10.n()
            if (r16 == 0) goto L_0x0728
            r10.y(r14)
            goto L_0x072b
        L_0x0728:
            r10.K()
        L_0x072b:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r7 = r13.c()
            androidx.compose.runtime.Updater.g(r14, r5, r7)
            kotlin.jvm.functions.Function2 r5 = r13.e()
            androidx.compose.runtime.Updater.g(r14, r3, r5)
            kotlin.jvm.functions.Function2 r3 = r13.b()
            boolean r5 = r14.n()
            if (r5 != 0) goto L_0x0755
            java.lang.Object r5 = r14.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r7)
            if (r5 != 0) goto L_0x0763
        L_0x0755:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r14.N(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r14.A(r5, r3)
        L_0x0763:
            kotlin.jvm.functions.Function2 r3 = r13.d()
            androidx.compose.runtime.Updater.g(r14, r2, r3)
            int r2 = r4 >> 9
            r2 = r2 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15.m(r10, r2)
            r10.T()
            r10.M()
        L_0x077b:
            r14 = r55
            goto L_0x078a
        L_0x077e:
            r11 = r52
            r2 = -2145892819(0xffffffff8018462d, float:-2.229226E-39)
            r10.X(r2)
            r10.M()
            goto L_0x077b
        L_0x078a:
            if (r14 == 0) goto L_0x0842
            r2 = -2145844304(0xffffffff801903b0, float:-2.29721E-39)
            r10.X(r2)
            java.lang.String r2 = "Supporting"
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.layout.LayoutIdKt.b(r1, r2)
            float r2 = androidx.compose.material3.internal.TextFieldImplKt.F()
            r3 = 2
            r4 = 0
            r5 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.k(r1, r2, r4, r3, r5)
            r2 = 0
            r3 = 3
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.C(r1, r5, r2, r3, r5)
            androidx.compose.material3.TextFieldDefaults r19 = androidx.compose.material3.TextFieldDefaults.f11367a
            r24 = 15
            r25 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.material3.TextFieldDefaults.v(r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.h(r1, r2)
            androidx.compose.ui.Alignment r2 = r12.o()
            r3 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.BoxKt.g(r2, r3)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r10, r3)
            androidx.compose.runtime.CompositionLocalMap r4 = r10.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r10, r1)
            kotlin.jvm.functions.Function0 r5 = r13.a()
            androidx.compose.runtime.Applier r6 = r10.v()
            if (r6 != 0) goto L_0x07e1
            androidx.compose.runtime.ComposablesKt.d()
        L_0x07e1:
            r10.s()
            boolean r6 = r10.n()
            if (r6 == 0) goto L_0x07ee
            r10.y(r5)
            goto L_0x07f1
        L_0x07ee:
            r10.K()
        L_0x07f1:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r6 = r13.c()
            androidx.compose.runtime.Updater.g(r5, r2, r6)
            kotlin.jvm.functions.Function2 r2 = r13.e()
            androidx.compose.runtime.Updater.g(r5, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r13.b()
            boolean r4 = r5.n()
            if (r4 != 0) goto L_0x081b
            java.lang.Object r4 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)
            if (r4 != 0) goto L_0x0829
        L_0x081b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.A(r3, r2)
        L_0x0829:
            kotlin.jvm.functions.Function2 r2 = r13.d()
            androidx.compose.runtime.Updater.g(r5, r1, r2)
            int r0 = r0 >> 9
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.m(r10, r0)
            r10.T()
            r10.M()
            goto L_0x084b
        L_0x0842:
            r0 = -2145508915(0xffffffff801e21cd, float:-2.76719E-39)
            r10.X(r0)
            r10.M()
        L_0x084b:
            r10.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0861
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0861
        L_0x0858:
            r9 = r3
            r10 = r12
            r14 = r13
            r11 = r15
            r15 = r45
            r10.B()
        L_0x0861:
            androidx.compose.runtime.ScopeUpdateScope r13 = r10.x()
            if (r13 == 0) goto L_0x089b
            androidx.compose.material3.O4 r12 = new androidx.compose.material3.O4
            r0 = r12
            r1 = r42
            r2 = r43
            r3 = r44
            r4 = r45
            r5 = r46
            r6 = r47
            r7 = r48
            r8 = r49
            r9 = r50
            r10 = r51
            r11 = r52
            r15 = r12
            r12 = r53
            r40 = r13
            r13 = r54
            r14 = r55
            r41 = r15
            r15 = r56
            r16 = r58
            r17 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r40
            r1 = r41
            r0.a(r1)
        L_0x089b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.j(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.TextFieldLabelPosition, androidx.compose.material3.internal.FloatProducer, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Dp k(FloatProducer floatProducer) {
        return Dp.j(DpKt.c(TextFieldImplKt.G(), TextFieldImplKt.E(), floatProducer.invoke()));
    }

    public static final Unit l(Modifier modifier, Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z2, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, Function1 function1, Function2 function27, Function2 function28, PaddingValues paddingValues, int i2, int i3, Composer composer, int i4) {
        j(modifier, function2, function3, function22, function23, function24, function25, function26, z2, textFieldLabelPosition, floatProducer, function1, function27, function28, paddingValues, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
        return Unit.f40552a;
    }

    public static final Modifier m(Modifier modifier, Function0 function0, Alignment.Horizontal horizontal, PaddingValues paddingValues) {
        return DrawModifierKt.d(modifier, new K4(function0, paddingValues, horizontal));
    }

    public static final Unit n(Function0 function0, PaddingValues paddingValues, Alignment.Horizontal horizontal, ContentDrawScope contentDrawScope) {
        long m2 = ((Size) function0.invoke()).m();
        float intBitsToFloat = Float.intBitsToFloat((int) (m2 >> 32));
        if (intBitsToFloat > 0.0f) {
            float B1 = contentDrawScope.B1(f10562a);
            float B12 = contentDrawScope.B1(paddingValues.b(contentDrawScope.getLayoutDirection()));
            float f2 = (float) 2;
            float f3 = intBitsToFloat / f2;
            float a2 = ((float) horizontal.a(MathKt.d(intBitsToFloat), MathKt.d((Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)) - B12) - contentDrawScope.B1(paddingValues.c(contentDrawScope.getLayoutDirection()))), contentDrawScope.getLayoutDirection())) + B12 + f3;
            float d2 = RangesKt.d((a2 - f3) - B1, 0.0f);
            float i2 = RangesKt.i(a2 + f3 + B1, Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & m2));
            float f4 = (-intBitsToFloat2) / f2;
            float f5 = intBitsToFloat2 / f2;
            int a3 = ClipOp.f15971b.a();
            DrawContext G1 = contentDrawScope.G1();
            long c2 = G1.c();
            G1.j().o();
            try {
                G1.e().b(d2, f4, i2, f5, a3);
                contentDrawScope.q2();
            } finally {
                G1.j().t();
                G1.f(c2);
            }
        } else {
            contentDrawScope.q2();
        }
        return Unit.f40552a;
    }
}
