package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AbtBaseTextFieldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f38241a = TextUnitKt.i(8);

    /* renamed from: b  reason: collision with root package name */
    public static final float f38242b = Dp.m((float) 16);

    /* JADX WARNING: Code restructure failed: missing block: B:257:0x02f4, code lost:
        if (r8.h(r115) != false) goto L_0x02fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r91, kotlin.jvm.functions.Function1 r92, androidx.compose.ui.Modifier r93, boolean r94, boolean r95, androidx.compose.ui.text.TextStyle r96, kotlin.jvm.functions.Function2 r97, kotlin.jvm.functions.Function2 r98, kotlin.jvm.functions.Function2 r99, kotlin.jvm.functions.Function2 r100, kotlin.jvm.functions.Function2 r101, kotlin.jvm.functions.Function2 r102, kotlin.jvm.functions.Function2 r103, boolean r104, androidx.compose.ui.text.input.VisualTransformation r105, androidx.compose.foundation.text.KeyboardOptions r106, androidx.compose.foundation.text.KeyboardActions r107, boolean r108, int r109, int r110, androidx.compose.foundation.interaction.MutableInteractionSource r111, androidx.compose.ui.graphics.Shape r112, androidx.compose.material3.TextFieldColors r113, androidx.compose.foundation.layout.PaddingValues r114, float r115, float r116, float r117, float r118, kotlin.jvm.functions.Function0 r119, androidx.compose.runtime.Composer r120, int r121, int r122, int r123, int r124) {
        /*
            r15 = r91
            r14 = r92
            r13 = r121
            r11 = r122
            r10 = r123
            r9 = r124
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            r0 = -88789525(0xfffffffffab52deb, float:-4.7036853E35)
            r1 = r120
            androidx.compose.runtime.Composer r8 = r1.q(r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x0026
            r0 = r13 | 6
            goto L_0x0036
        L_0x0026:
            r0 = r13 & 6
            if (r0 != 0) goto L_0x0035
            boolean r0 = r8.W(r15)
            if (r0 == 0) goto L_0x0032
            r0 = 4
            goto L_0x0033
        L_0x0032:
            r0 = 2
        L_0x0033:
            r0 = r0 | r13
            goto L_0x0036
        L_0x0035:
            r0 = r13
        L_0x0036:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x003d
            r0 = r0 | 48
            goto L_0x004d
        L_0x003d:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x004d
            boolean r3 = r8.l(r14)
            if (r3 == 0) goto L_0x004a
            r3 = 32
            goto L_0x004c
        L_0x004a:
            r3 = 16
        L_0x004c:
            r0 = r0 | r3
        L_0x004d:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x0056
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r12 = r93
            goto L_0x0069
        L_0x0056:
            r12 = r13 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0053
            r12 = r93
            boolean r16 = r8.W(r12)
            if (r16 == 0) goto L_0x0065
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r0 = r0 | r16
        L_0x0069:
            r16 = r9 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0076
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0073:
            r1 = r94
            goto L_0x0089
        L_0x0076:
            r1 = r13 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0073
            r1 = r94
            boolean r19 = r8.d(r1)
            if (r19 == 0) goto L_0x0085
            r19 = r18
            goto L_0x0087
        L_0x0085:
            r19 = r17
        L_0x0087:
            r0 = r0 | r19
        L_0x0089:
            r19 = r9 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0094
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0091:
            r2 = r95
            goto L_0x00a7
        L_0x0094:
            r2 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0091
            r2 = r95
            boolean r22 = r8.d(r2)
            if (r22 == 0) goto L_0x00a3
            r22 = r20
            goto L_0x00a5
        L_0x00a3:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r0 = r0 | r22
        L_0x00a7:
            r22 = 196608(0x30000, float:2.75506E-40)
            r22 = r13 & r22
            if (r22 != 0) goto L_0x00c1
            r22 = r9 & 32
            r4 = r96
            if (r22 != 0) goto L_0x00bc
            boolean r23 = r8.W(r4)
            if (r23 == 0) goto L_0x00bc
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r0 = r0 | r23
            goto L_0x00c3
        L_0x00c1:
            r4 = r96
        L_0x00c3:
            r23 = r9 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r23 == 0) goto L_0x00ce
            r0 = r0 | r24
            r5 = r97
            goto L_0x00e1
        L_0x00ce:
            r25 = r13 & r24
            r5 = r97
            if (r25 != 0) goto L_0x00e1
            boolean r26 = r8.l(r5)
            if (r26 == 0) goto L_0x00dd
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r0 = r0 | r26
        L_0x00e1:
            r6 = r9 & 128(0x80, float:1.794E-43)
            r27 = 4194304(0x400000, float:5.877472E-39)
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00ee
            r0 = r0 | r28
            r7 = r98
            goto L_0x0101
        L_0x00ee:
            r29 = r13 & r28
            r7 = r98
            if (r29 != 0) goto L_0x0101
            boolean r30 = r8.l(r7)
            if (r30 == 0) goto L_0x00fd
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ff
        L_0x00fd:
            r30 = r27
        L_0x00ff:
            r0 = r0 | r30
        L_0x0101:
            r1 = r9 & 256(0x100, float:3.59E-43)
            r30 = 33554432(0x2000000, float:9.403955E-38)
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x0110
            r0 = r0 | r32
            r2 = r99
            goto L_0x0123
        L_0x0110:
            r33 = r13 & r32
            r2 = r99
            if (r33 != 0) goto L_0x0123
            boolean r33 = r8.l(r2)
            if (r33 == 0) goto L_0x011f
            r33 = r31
            goto L_0x0121
        L_0x011f:
            r33 = r30
        L_0x0121:
            r0 = r0 | r33
        L_0x0123:
            r2 = r9 & 512(0x200, float:7.175E-43)
            r33 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x012e
            r0 = r0 | r33
            r4 = r100
            goto L_0x0141
        L_0x012e:
            r33 = r13 & r33
            r4 = r100
            if (r33 != 0) goto L_0x0141
            boolean r33 = r8.l(r4)
            if (r33 == 0) goto L_0x013d
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013f
        L_0x013d:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013f:
            r0 = r0 | r33
        L_0x0141:
            r4 = r9 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x014a
            r33 = r11 | 6
            r5 = r101
            goto L_0x0160
        L_0x014a:
            r33 = r11 & 6
            r5 = r101
            if (r33 != 0) goto L_0x015e
            boolean r33 = r8.l(r5)
            if (r33 == 0) goto L_0x0159
            r33 = 4
            goto L_0x015b
        L_0x0159:
            r33 = 2
        L_0x015b:
            r33 = r11 | r33
            goto L_0x0160
        L_0x015e:
            r33 = r11
        L_0x0160:
            r5 = r9 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0169
            r33 = r33 | 48
        L_0x0166:
            r7 = r33
            goto L_0x017d
        L_0x0169:
            r34 = r11 & 48
            r7 = r102
            if (r34 != 0) goto L_0x0166
            boolean r34 = r8.l(r7)
            if (r34 == 0) goto L_0x0178
            r34 = 32
            goto L_0x017a
        L_0x0178:
            r34 = 16
        L_0x017a:
            r33 = r33 | r34
            goto L_0x0166
        L_0x017d:
            r12 = r9 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x0186
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0183:
            r14 = r103
            goto L_0x0199
        L_0x0186:
            r14 = r11 & 384(0x180, float:5.38E-43)
            if (r14 != 0) goto L_0x0183
            r14 = r103
            boolean r33 = r8.l(r14)
            if (r33 == 0) goto L_0x0195
            r33 = 256(0x100, float:3.59E-43)
            goto L_0x0197
        L_0x0195:
            r33 = 128(0x80, float:1.794E-43)
        L_0x0197:
            r7 = r7 | r33
        L_0x0199:
            r14 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x01a2
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x019f:
            r15 = r104
            goto L_0x01b5
        L_0x01a2:
            r15 = r11 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x019f
            r15 = r104
            boolean r33 = r8.d(r15)
            if (r33 == 0) goto L_0x01b1
            r33 = r18
            goto L_0x01b3
        L_0x01b1:
            r33 = r17
        L_0x01b3:
            r7 = r7 | r33
        L_0x01b5:
            r15 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01c0
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r33 = r15
        L_0x01bd:
            r15 = r105
            goto L_0x01d5
        L_0x01c0:
            r33 = r15
            r15 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x01bd
            r15 = r105
            boolean r34 = r8.W(r15)
            if (r34 == 0) goto L_0x01d1
            r34 = r20
            goto L_0x01d3
        L_0x01d1:
            r34 = 8192(0x2000, float:1.14794E-41)
        L_0x01d3:
            r7 = r7 | r34
        L_0x01d5:
            r34 = 32768(0x8000, float:4.5918E-41)
            r34 = r9 & r34
            r35 = 196608(0x30000, float:2.75506E-40)
            if (r34 == 0) goto L_0x01e3
            r7 = r7 | r35
            r15 = r106
            goto L_0x01f6
        L_0x01e3:
            r35 = r11 & r35
            r15 = r106
            if (r35 != 0) goto L_0x01f6
            boolean r35 = r8.W(r15)
            if (r35 == 0) goto L_0x01f2
            r35 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f4
        L_0x01f2:
            r35 = 65536(0x10000, float:9.18355E-41)
        L_0x01f4:
            r7 = r7 | r35
        L_0x01f6:
            r35 = 65536(0x10000, float:9.18355E-41)
            r35 = r9 & r35
            if (r35 == 0) goto L_0x0201
            r7 = r7 | r24
            r15 = r107
            goto L_0x0214
        L_0x0201:
            r36 = r11 & r24
            r15 = r107
            if (r36 != 0) goto L_0x0214
            boolean r36 = r8.W(r15)
            if (r36 == 0) goto L_0x0210
            r36 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0212
        L_0x0210:
            r36 = 524288(0x80000, float:7.34684E-40)
        L_0x0212:
            r7 = r7 | r36
        L_0x0214:
            r36 = 131072(0x20000, float:1.83671E-40)
            r36 = r9 & r36
            if (r36 == 0) goto L_0x021f
            r7 = r7 | r28
            r15 = r108
            goto L_0x0232
        L_0x021f:
            r37 = r11 & r28
            r15 = r108
            if (r37 != 0) goto L_0x0232
            boolean r37 = r8.d(r15)
            if (r37 == 0) goto L_0x022e
            r37 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0230
        L_0x022e:
            r37 = r27
        L_0x0230:
            r7 = r7 | r37
        L_0x0232:
            r37 = r11 & r32
            if (r37 != 0) goto L_0x024c
            r37 = 262144(0x40000, float:3.67342E-40)
            r37 = r9 & r37
            r15 = r109
            if (r37 != 0) goto L_0x0247
            boolean r37 = r8.i(r15)
            if (r37 == 0) goto L_0x0247
            r37 = r31
            goto L_0x0249
        L_0x0247:
            r37 = r30
        L_0x0249:
            r7 = r7 | r37
            goto L_0x024e
        L_0x024c:
            r15 = r109
        L_0x024e:
            r37 = 524288(0x80000, float:7.34684E-40)
            r37 = r9 & r37
            r38 = 805306368(0x30000000, float:4.656613E-10)
            if (r37 == 0) goto L_0x025b
            r7 = r7 | r38
            r11 = r110
            goto L_0x026e
        L_0x025b:
            r38 = r11 & r38
            r11 = r110
            if (r38 != 0) goto L_0x026e
            boolean r38 = r8.i(r11)
            if (r38 == 0) goto L_0x026a
            r38 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x026c
        L_0x026a:
            r38 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x026c:
            r7 = r7 | r38
        L_0x026e:
            r38 = 1048576(0x100000, float:1.469368E-39)
            r38 = r9 & r38
            if (r38 == 0) goto L_0x0279
            r21 = r10 | 6
            r11 = r111
            goto L_0x028f
        L_0x0279:
            r39 = r10 & 6
            r11 = r111
            if (r39 != 0) goto L_0x028d
            boolean r39 = r8.W(r11)
            if (r39 == 0) goto L_0x0288
            r21 = 4
            goto L_0x028a
        L_0x0288:
            r21 = 2
        L_0x028a:
            r21 = r10 | r21
            goto L_0x028f
        L_0x028d:
            r21 = r10
        L_0x028f:
            r39 = r10 & 48
            if (r39 != 0) goto L_0x02a9
            r39 = 2097152(0x200000, float:2.938736E-39)
            r39 = r9 & r39
            r11 = r112
            if (r39 != 0) goto L_0x02a4
            boolean r39 = r8.W(r11)
            if (r39 == 0) goto L_0x02a4
            r22 = 32
            goto L_0x02a6
        L_0x02a4:
            r22 = 16
        L_0x02a6:
            r21 = r21 | r22
            goto L_0x02ab
        L_0x02a9:
            r11 = r112
        L_0x02ab:
            r11 = r10 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x02c7
            r11 = r9 & r27
            if (r11 != 0) goto L_0x02be
            r11 = r113
            boolean r22 = r8.W(r11)
            if (r22 == 0) goto L_0x02c0
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x02c2
        L_0x02be:
            r11 = r113
        L_0x02c0:
            r26 = 128(0x80, float:1.794E-43)
        L_0x02c2:
            r21 = r21 | r26
        L_0x02c4:
            r11 = r21
            goto L_0x02ca
        L_0x02c7:
            r11 = r113
            goto L_0x02c4
        L_0x02ca:
            r21 = 8388608(0x800000, float:1.17549435E-38)
            r21 = r9 & r21
            if (r21 == 0) goto L_0x02d5
            r11 = r11 | 3072(0xc00, float:4.305E-42)
        L_0x02d2:
            r15 = r114
            goto L_0x02e5
        L_0x02d5:
            r15 = r10 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x02d2
            r15 = r114
            boolean r22 = r8.W(r15)
            if (r22 == 0) goto L_0x02e3
            r17 = r18
        L_0x02e3:
            r11 = r11 | r17
        L_0x02e5:
            r15 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x02fe
            r15 = 16777216(0x1000000, float:2.3509887E-38)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x02f7
            r15 = r115
            boolean r17 = r8.h(r15)
            if (r17 == 0) goto L_0x02f9
            goto L_0x02fb
        L_0x02f7:
            r15 = r115
        L_0x02f9:
            r20 = 8192(0x2000, float:1.14794E-41)
        L_0x02fb:
            r11 = r11 | r20
            goto L_0x0300
        L_0x02fe:
            r15 = r115
        L_0x0300:
            r17 = 196608(0x30000, float:2.75506E-40)
            r17 = r10 & r17
            if (r17 != 0) goto L_0x031a
            r17 = r9 & r30
            r15 = r116
            if (r17 != 0) goto L_0x0315
            boolean r17 = r8.h(r15)
            if (r17 == 0) goto L_0x0315
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0317
        L_0x0315:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x0317:
            r11 = r11 | r17
            goto L_0x031c
        L_0x031a:
            r15 = r116
        L_0x031c:
            r17 = r10 & r24
            if (r17 != 0) goto L_0x0334
            r17 = r9 & r31
            r15 = r117
            if (r17 != 0) goto L_0x032f
            boolean r17 = r8.h(r15)
            if (r17 == 0) goto L_0x032f
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0331
        L_0x032f:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0331:
            r11 = r11 | r17
            goto L_0x0336
        L_0x0334:
            r15 = r117
        L_0x0336:
            r17 = r10 & r28
            if (r17 != 0) goto L_0x0350
            r17 = 134217728(0x8000000, float:3.85186E-34)
            r17 = r9 & r17
            r15 = r118
            if (r17 != 0) goto L_0x034b
            boolean r17 = r8.h(r15)
            if (r17 == 0) goto L_0x034b
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x034d
        L_0x034b:
            r17 = r27
        L_0x034d:
            r11 = r11 | r17
            goto L_0x0352
        L_0x0350:
            r15 = r118
        L_0x0352:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
            r17 = r9 & r17
            if (r17 == 0) goto L_0x035d
            r11 = r11 | r32
            r10 = r119
            goto L_0x0370
        L_0x035d:
            r18 = r10 & r32
            r10 = r119
            if (r18 != 0) goto L_0x0370
            boolean r18 = r8.l(r10)
            if (r18 == 0) goto L_0x036c
            r18 = r31
            goto L_0x036e
        L_0x036c:
            r18 = r30
        L_0x036e:
            r11 = r11 | r18
        L_0x0370:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r0 & r18
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r15) goto L_0x03cf
            r10 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r10 & r7
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r15) goto L_0x03cf
            r10 = 38347923(0x2492493, float:1.4777644E-37)
            r10 = r10 & r11
            r11 = 38347922(0x2492492, float:1.4777643E-37)
            if (r10 != r11) goto L_0x03cf
            boolean r10 = r8.t()
            if (r10 != 0) goto L_0x0393
            goto L_0x03cf
        L_0x0393:
            r8.B()
            r3 = r93
            r4 = r94
            r5 = r95
            r6 = r96
            r7 = r97
            r9 = r99
            r10 = r100
            r11 = r101
            r12 = r102
            r13 = r103
            r14 = r104
            r15 = r105
            r16 = r106
            r17 = r107
            r18 = r108
            r19 = r109
            r20 = r110
            r21 = r111
            r22 = r112
            r23 = r113
            r24 = r114
            r25 = r115
            r26 = r116
            r27 = r117
            r28 = r118
            r29 = r119
            r2 = r8
            r8 = r98
            goto L_0x06e5
        L_0x03cf:
            r8.p()
            r10 = r13 & 1
            if (r10 == 0) goto L_0x0429
            boolean r10 = r8.J()
            if (r10 == 0) goto L_0x03dd
            goto L_0x0429
        L_0x03dd:
            r8.B()
            r1 = r9 & 32
            if (r1 == 0) goto L_0x03e8
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x03e8:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x03f1
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r1
        L_0x03f1:
            r31 = r93
            r15 = r94
            r32 = r95
            r14 = r96
            r33 = r97
            r34 = r98
            r35 = r99
            r36 = r100
            r37 = r101
            r38 = r102
            r39 = r103
            r11 = r104
            r40 = r105
            r41 = r106
            r42 = r107
            r43 = r108
            r44 = r109
            r45 = r110
            r46 = r111
            r47 = r112
            r10 = r113
            r48 = r114
            r49 = r115
            r50 = r116
            r51 = r117
            r52 = r118
            r53 = r119
            goto L_0x0589
        L_0x0429:
            if (r3 == 0) goto L_0x042e
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0430
        L_0x042e:
            r3 = r93
        L_0x0430:
            if (r16 == 0) goto L_0x0434
            r10 = 1
            goto L_0x0436
        L_0x0434:
            r10 = r94
        L_0x0436:
            if (r19 == 0) goto L_0x043a
            r11 = 0
            goto L_0x043c
        L_0x043a:
            r11 = r95
        L_0x043c:
            r16 = r9 & 32
            if (r16 == 0) goto L_0x0450
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.material3.TextKt.q()
            java.lang.Object r15 = r8.C(r15)
            androidx.compose.ui.text.TextStyle r15 = (androidx.compose.ui.text.TextStyle) r15
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r16
            goto L_0x0452
        L_0x0450:
            r15 = r96
        L_0x0452:
            r16 = 0
            if (r23 == 0) goto L_0x0459
            r18 = r16
            goto L_0x045b
        L_0x0459:
            r18 = r97
        L_0x045b:
            if (r6 == 0) goto L_0x0460
            r6 = r16
            goto L_0x0462
        L_0x0460:
            r6 = r98
        L_0x0462:
            if (r1 == 0) goto L_0x0467
            r1 = r16
            goto L_0x0469
        L_0x0467:
            r1 = r99
        L_0x0469:
            if (r2 == 0) goto L_0x046e
            r2 = r16
            goto L_0x0470
        L_0x046e:
            r2 = r100
        L_0x0470:
            if (r4 == 0) goto L_0x0475
            r4 = r16
            goto L_0x0477
        L_0x0475:
            r4 = r101
        L_0x0477:
            if (r5 == 0) goto L_0x047c
            r5 = r16
            goto L_0x047e
        L_0x047c:
            r5 = r102
        L_0x047e:
            if (r12 == 0) goto L_0x0483
            r12 = r16
            goto L_0x0485
        L_0x0483:
            r12 = r103
        L_0x0485:
            if (r14 == 0) goto L_0x0489
            r14 = 0
            goto L_0x048b
        L_0x0489:
            r14 = r104
        L_0x048b:
            if (r33 == 0) goto L_0x0494
            androidx.compose.ui.text.input.VisualTransformation$Companion r19 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r19 = r19.c()
            goto L_0x0496
        L_0x0494:
            r19 = r105
        L_0x0496:
            if (r34 == 0) goto L_0x049f
            androidx.compose.foundation.text.KeyboardOptions$Companion r20 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r20 = r20.a()
            goto L_0x04a1
        L_0x049f:
            r20 = r106
        L_0x04a1:
            if (r35 == 0) goto L_0x04aa
            androidx.compose.foundation.text.KeyboardActions$Companion r22 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r22 = r22.a()
            goto L_0x04ac
        L_0x04aa:
            r22 = r107
        L_0x04ac:
            if (r36 == 0) goto L_0x04b1
            r23 = 0
            goto L_0x04b3
        L_0x04b1:
            r23 = r108
        L_0x04b3:
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r9 & r24
            if (r24 == 0) goto L_0x04c7
            if (r23 == 0) goto L_0x04be
            r24 = 1
            goto L_0x04c1
        L_0x04be:
            r24 = 2147483647(0x7fffffff, float:NaN)
        L_0x04c1:
            r25 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r25
            goto L_0x04c9
        L_0x04c7:
            r24 = r109
        L_0x04c9:
            if (r37 == 0) goto L_0x04ce
            r25 = 1
            goto L_0x04d0
        L_0x04ce:
            r25 = r110
        L_0x04d0:
            if (r38 == 0) goto L_0x04d5
            r26 = r16
            goto L_0x04d7
        L_0x04d5:
            r26 = r111
        L_0x04d7:
            r28 = 2097152(0x200000, float:2.938736E-39)
            r28 = r9 & r28
            r93 = r0
            r0 = 6
            r94 = r1
            if (r28 == 0) goto L_0x04e9
            androidx.compose.material3.OutlinedTextFieldDefaults r1 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            androidx.compose.ui.graphics.Shape r1 = r1.p(r8, r0)
            goto L_0x04eb
        L_0x04e9:
            r1 = r112
        L_0x04eb:
            r27 = r9 & r27
            r95 = r1
            if (r27 == 0) goto L_0x04f8
            androidx.compose.material3.OutlinedTextFieldDefaults r1 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            androidx.compose.material3.TextFieldColors r0 = r1.g(r8, r0)
            goto L_0x04fa
        L_0x04f8:
            r0 = r113
        L_0x04fa:
            if (r21 == 0) goto L_0x0503
            float r1 = f38242b
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.PaddingKt.a(r1)
            goto L_0x0505
        L_0x0503:
            r1 = r114
        L_0x0505:
            r21 = 16777216(0x1000000, float:2.3509887E-38)
            r21 = r9 & r21
            if (r21 == 0) goto L_0x0512
            androidx.compose.material3.OutlinedTextFieldDefaults r21 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            float r21 = r21.o()
            goto L_0x0514
        L_0x0512:
            r21 = r115
        L_0x0514:
            r27 = r9 & r30
            if (r27 == 0) goto L_0x051f
            androidx.compose.material3.OutlinedTextFieldDefaults r27 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            float r27 = r27.n()
            goto L_0x0521
        L_0x051f:
            r27 = r116
        L_0x0521:
            r28 = r9 & r31
            if (r28 == 0) goto L_0x052c
            androidx.compose.material3.OutlinedTextFieldDefaults r28 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            float r28 = r28.m()
            goto L_0x052e
        L_0x052c:
            r28 = r117
        L_0x052e:
            r29 = 134217728(0x8000000, float:3.85186E-34)
            r29 = r9 & r29
            if (r29 == 0) goto L_0x053b
            androidx.compose.material3.OutlinedTextFieldDefaults r29 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            float r29 = r29.q()
            goto L_0x053d
        L_0x053b:
            r29 = r118
        L_0x053d:
            r35 = r94
            r47 = r95
            if (r17 == 0) goto L_0x0574
            r48 = r1
            r36 = r2
            r31 = r3
            r37 = r4
            r38 = r5
            r34 = r6
            r32 = r11
            r39 = r12
            r11 = r14
            r14 = r15
            r53 = r16
        L_0x0557:
            r33 = r18
            r40 = r19
            r41 = r20
            r49 = r21
            r42 = r22
            r43 = r23
            r44 = r24
            r45 = r25
            r46 = r26
            r50 = r27
            r51 = r28
            r52 = r29
            r15 = r10
            r10 = r0
            r0 = r93
            goto L_0x0589
        L_0x0574:
            r53 = r119
            r48 = r1
            r36 = r2
            r31 = r3
            r37 = r4
            r38 = r5
            r34 = r6
            r32 = r11
            r39 = r12
            r11 = r14
            r14 = r15
            goto L_0x0557
        L_0x0589:
            r8.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x059a
            r1 = -88789525(0xfffffffffab52deb, float:-4.7036853E35)
            java.lang.String r2 = "com.hansecom.abt.ui.components.formFields.AbtBaseTextField (AbtBaseTextField.kt:74)"
            androidx.compose.runtime.ComposerKt.Y(r1, r0, r7, r2)
        L_0x059a:
            r0 = 1979591862(0x75fe2cb6, float:6.444093E32)
            r8.X(r0)
            if (r46 != 0) goto L_0x05c2
            r0 = 1979592513(0x75fe2f41, float:6.444345E32)
            r8.X(r0)
            java.lang.Object r0 = r8.g()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x05bb
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r8.N(r0)
        L_0x05bb:
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r8.M()
            r7 = r0
            goto L_0x05c4
        L_0x05c2:
            r7 = r46
        L_0x05c4:
            r8.M()
            r0 = 1979597972(0x75fe4494, float:6.4464567E32)
            r8.X(r0)
            long r0 = r14.h()
            r2 = 16
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x05da
        L_0x05d7:
            r55 = r0
            goto L_0x05ee
        L_0x05da:
            r0 = 0
            androidx.compose.runtime.State r0 = androidx.compose.foundation.interaction.FocusInteractionKt.a(r7, r8, r0)
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            long r0 = j(r10, r15, r11, r0)
            goto L_0x05d7
        L_0x05ee:
            r8.M()
            androidx.compose.ui.text.TextStyle r0 = new androidx.compose.ui.text.TextStyle
            r54 = r0
            r84 = 16777214(0xfffffe, float:2.3509884E-38)
            r85 = 0
            r57 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
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
            r78 = 0
            r79 = 0
            r80 = 0
            r81 = 0
            r82 = 0
            r83 = 0
            r54.<init>(r55, r57, r59, r60, r61, r62, r63, r64, r66, r67, r68, r69, r71, r72, r73, r74, r75, r76, r78, r79, r80, r81, r82, r83, r84, r85)
            androidx.compose.ui.text.TextStyle r12 = r14.J(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r8.C(r0)
            r3 = r0
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            androidx.compose.foundation.text.selection.TextSelectionColors r1 = r10.l()
            androidx.compose.runtime.ProvidedValue r6 = r0.d(r1)
            com.hansecom.abt.ui.components.formFields.AbtBaseTextFieldKt$AbtBaseTextField$1 r5 = new com.hansecom.abt.ui.components.formFields.AbtBaseTextFieldKt$AbtBaseTextField$1
            r0 = r5
            r1 = r31
            r2 = r33
            r4 = r49
            r86 = r5
            r5 = r50
            r87 = r6
            r6 = r10
            r19 = r7
            r7 = r11
            r88 = r8
            r8 = r91
            r9 = r92
            r54 = r10
            r10 = r15
            r55 = r11
            r11 = r32
            r13 = r41
            r56 = r14
            r14 = r42
            r57 = r15
            r15 = r43
            r16 = r44
            r17 = r45
            r18 = r40
            r20 = r34
            r21 = r35
            r22 = r36
            r23 = r37
            r24 = r38
            r25 = r39
            r26 = r48
            r27 = r47
            r28 = r53
            r29 = r51
            r30 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = 54
            r1 = -955686613(0xffffffffc709612b, float:-35169.168)
            r4 = r86
            r2 = r88
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r3, r4, r2, r0)
            int r1 = androidx.compose.runtime.ProvidedValue.f14769i
            r1 = r1 | 48
            r3 = r87
            androidx.compose.runtime.CompositionLocalKt.c(r3, r0, r2, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x06af
            androidx.compose.runtime.ComposerKt.X()
        L_0x06af:
            r3 = r31
            r5 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r13 = r39
            r15 = r40
            r16 = r41
            r17 = r42
            r18 = r43
            r19 = r44
            r20 = r45
            r21 = r46
            r22 = r47
            r24 = r48
            r25 = r49
            r26 = r50
            r27 = r51
            r28 = r52
            r29 = r53
            r23 = r54
            r14 = r55
            r6 = r56
            r4 = r57
        L_0x06e5:
            androidx.compose.runtime.ScopeUpdateScope r2 = r2.x()
            if (r2 == 0) goto L_0x0708
            com.hansecom.abt.ui.components.formFields.b r1 = new com.hansecom.abt.ui.components.formFields.b
            r0 = r1
            r89 = r1
            r1 = r91
            r90 = r2
            r2 = r92
            r30 = r121
            r31 = r122
            r32 = r123
            r33 = r124
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r1 = r89
            r0 = r90
            r0.a(r1)
        L_0x0708:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.AbtBaseTextFieldKt.c(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, float, float, float, float, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    public static final Unit d(String str, Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, float f2, float f3, float f4, float f5, Function0 function0, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        c(str, function1, modifier, z2, z3, textStyle, function2, function22, function23, function24, function25, function26, function27, z4, visualTransformation, keyboardOptions, keyboardActions, z5, i2, i3, mutableInteractionSource, shape, textFieldColors, paddingValues, f2, f3, f4, f5, function0, composer, RecomposeScopeImplKt.a(i4 | 1), RecomposeScopeImplKt.a(i5), RecomposeScopeImplKt.a(i6), i7);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.ui.graphics.Shape r17, boolean r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function2 r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r1 = r17
            r4 = r20
            r5 = r22
            r0 = 2
            r2 = 4
            java.lang.String r3 = "shape"
            kotlin.jvm.internal.Intrinsics.i(r1, r3)
            java.lang.String r3 = "content"
            kotlin.jvm.internal.Intrinsics.i(r4, r3)
            r3 = -2141516257(0xffffffff805b0e1f, float:-8.362096E-39)
            r6 = r21
            androidx.compose.runtime.Composer r6 = r6.q(r3)
            r7 = 1
            r8 = r23 & 1
            if (r8 == 0) goto L_0x0023
            r8 = r5 | 6
            goto L_0x0033
        L_0x0023:
            r8 = r5 & 6
            if (r8 != 0) goto L_0x0032
            boolean r8 = r6.W(r1)
            if (r8 == 0) goto L_0x002f
            r8 = r2
            goto L_0x0030
        L_0x002f:
            r8 = r0
        L_0x0030:
            r8 = r8 | r5
            goto L_0x0033
        L_0x0032:
            r8 = r5
        L_0x0033:
            r0 = r23 & 2
            if (r0 == 0) goto L_0x003c
            r8 = r8 | 48
        L_0x0039:
            r9 = r18
            goto L_0x004e
        L_0x003c:
            r9 = r5 & 48
            if (r9 != 0) goto L_0x0039
            r9 = r18
            boolean r10 = r6.d(r9)
            if (r10 == 0) goto L_0x004b
            r10 = 32
            goto L_0x004d
        L_0x004b:
            r10 = 16
        L_0x004d:
            r8 = r8 | r10
        L_0x004e:
            r2 = r23 & 4
            if (r2 == 0) goto L_0x0057
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0054:
            r10 = r19
            goto L_0x0069
        L_0x0057:
            r10 = r5 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0054
            r10 = r19
            boolean r11 = r6.l(r10)
            if (r11 == 0) goto L_0x0066
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r8 = r8 | r11
        L_0x0069:
            r11 = r23 & 8
            if (r11 == 0) goto L_0x0070
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x0070:
            r11 = r5 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0080
            boolean r11 = r6.l(r4)
            if (r11 == 0) goto L_0x007d
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r8 = r8 | r11
        L_0x0080:
            r11 = r8 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x0094
            boolean r11 = r6.t()
            if (r11 != 0) goto L_0x008d
            goto L_0x0094
        L_0x008d:
            r6.B()
            r2 = r9
            r3 = r10
            goto L_0x0171
        L_0x0094:
            if (r0 == 0) goto L_0x0097
            r9 = r7
        L_0x0097:
            r0 = 0
            if (r2 == 0) goto L_0x009c
            r2 = r0
            goto L_0x009d
        L_0x009c:
            r2 = r10
        L_0x009d:
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x00a9
            r10 = -1
            java.lang.String r11 = "com.hansecom.abt.ui.components.formFields.ClickableContainer (AbtBaseTextField.kt:168)"
            androidx.compose.runtime.ComposerKt.Y(r3, r8, r10, r11)
        L_0x00a9:
            if (r2 == 0) goto L_0x0152
            if (r9 == 0) goto L_0x0152
            r3 = 535887876(0x1ff10004, float:1.02067496E-19)
            r6.X(r3)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.draw.ClipKt.a(r3, r1)
            r10 = 0
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.f(r3, r10, r7, r0)
            r15 = 7
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = r2
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.ClickableKt.f(r10, r11, r12, r13, r14, r15, r16)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r3 = r3.o()
            r7 = 0
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.g(r3, r7)
            int r7 = androidx.compose.runtime.ComposablesKt.a(r6, r7)
            androidx.compose.runtime.CompositionLocalMap r10 = r6.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r6, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r12 = r11.a()
            androidx.compose.runtime.Applier r13 = r6.v()
            if (r13 != 0) goto L_0x00ef
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00ef:
            r6.s()
            boolean r13 = r6.n()
            if (r13 == 0) goto L_0x00fc
            r6.y(r12)
            goto L_0x00ff
        L_0x00fc:
            r6.K()
        L_0x00ff:
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.b(r6)
            kotlin.jvm.functions.Function2 r13 = r11.c()
            androidx.compose.runtime.Updater.g(r12, r3, r13)
            kotlin.jvm.functions.Function2 r3 = r11.e()
            androidx.compose.runtime.Updater.g(r12, r10, r3)
            kotlin.jvm.functions.Function2 r3 = r11.b()
            boolean r10 = r12.n()
            if (r10 != 0) goto L_0x0129
            java.lang.Object r10 = r12.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r13)
            if (r10 != 0) goto L_0x0137
        L_0x0129:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r12.N(r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.A(r7, r3)
        L_0x0137:
            kotlin.jvm.functions.Function2 r3 = r11.d()
            androidx.compose.runtime.Updater.g(r12, r0, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r0 = r8 >> 9
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.m(r6, r0)
            r6.T()
            r6.M()
            goto L_0x0166
        L_0x0152:
            r0 = 536092569(0x1ff41f99, float:1.03390294E-19)
            r6.X(r0)
            int r0 = r8 >> 9
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.m(r6, r0)
            r6.M()
        L_0x0166:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x016f
            androidx.compose.runtime.ComposerKt.X()
        L_0x016f:
            r3 = r2
            r2 = r9
        L_0x0171:
            androidx.compose.runtime.ScopeUpdateScope r7 = r6.x()
            if (r7 == 0) goto L_0x0188
            com.hansecom.abt.ui.components.formFields.a r8 = new com.hansecom.abt.ui.components.formFields.a
            r0 = r8
            r1 = r17
            r4 = r20
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.AbtBaseTextFieldKt.e(androidx.compose.ui.graphics.Shape, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f(Shape shape, boolean z2, Function0 function0, Function2 function2, int i2, int i3, Composer composer, int i4) {
        e(shape, z2, function0, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final long i(TextFieldColors textFieldColors, boolean z2) {
        return z2 ? textFieldColors.i() : textFieldColors.g();
    }

    public static final long j(TextFieldColors textFieldColors, boolean z2, boolean z3, boolean z4) {
        return !z2 ? textFieldColors.h() : z3 ? textFieldColors.j() : z4 ? textFieldColors.k() : textFieldColors.n();
    }
}
