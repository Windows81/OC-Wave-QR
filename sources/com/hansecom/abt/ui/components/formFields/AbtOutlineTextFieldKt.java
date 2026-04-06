package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtOutlineTextFieldKt {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.lang.String r49, kotlin.jvm.functions.Function1 r50, androidx.compose.ui.Modifier r51, boolean r52, boolean r53, int r54, java.lang.String r55, java.lang.String r56, kotlin.jvm.functions.Function2 r57, kotlin.jvm.functions.Function2 r58, kotlin.jvm.functions.Function2 r59, kotlin.jvm.functions.Function2 r60, kotlin.jvm.functions.Function2 r61, androidx.compose.ui.text.input.VisualTransformation r62, androidx.compose.foundation.text.KeyboardOptions r63, androidx.compose.foundation.text.KeyboardActions r64, boolean r65, int r66, int r67, androidx.compose.foundation.interaction.MutableInteractionSource r68, androidx.compose.ui.graphics.Shape r69, androidx.compose.ui.autofill.ContentType r70, androidx.compose.runtime.Composer r71, int r72, int r73, int r74, int r75) {
        /*
            r15 = r49
            r14 = r50
            r13 = r54
            r12 = r72
            r11 = r73
            r10 = r75
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            r0 = 425802095(0x1961396f, float:1.1643826E-23)
            r1 = r71
            androidx.compose.runtime.Composer r9 = r1.q(r0)
            r0 = r10 & 1
            if (r0 == 0) goto L_0x0026
            r0 = r12 | 6
            goto L_0x0036
        L_0x0026:
            r0 = r12 & 6
            if (r0 != 0) goto L_0x0035
            boolean r0 = r9.W(r15)
            if (r0 == 0) goto L_0x0032
            r0 = 4
            goto L_0x0033
        L_0x0032:
            r0 = 2
        L_0x0033:
            r0 = r0 | r12
            goto L_0x0036
        L_0x0035:
            r0 = r12
        L_0x0036:
            r3 = r10 & 2
            if (r3 == 0) goto L_0x003d
            r0 = r0 | 48
            goto L_0x004d
        L_0x003d:
            r3 = r12 & 48
            if (r3 != 0) goto L_0x004d
            boolean r3 = r9.l(r14)
            if (r3 == 0) goto L_0x004a
            r3 = 32
            goto L_0x004c
        L_0x004a:
            r3 = 16
        L_0x004c:
            r0 = r0 | r3
        L_0x004d:
            r3 = r10 & 4
            if (r3 == 0) goto L_0x0056
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r8 = r51
            goto L_0x0069
        L_0x0056:
            r8 = r12 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0053
            r8 = r51
            boolean r16 = r9.W(r8)
            if (r16 == 0) goto L_0x0065
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r0 = r0 | r16
        L_0x0069:
            r16 = r10 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0076
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0073:
            r1 = r52
            goto L_0x0089
        L_0x0076:
            r1 = r12 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0073
            r1 = r52
            boolean r19 = r9.d(r1)
            if (r19 == 0) goto L_0x0085
            r19 = r18
            goto L_0x0087
        L_0x0085:
            r19 = r17
        L_0x0087:
            r0 = r0 | r19
        L_0x0089:
            r19 = r10 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0094
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0091:
            r2 = r53
            goto L_0x00a7
        L_0x0094:
            r2 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0091
            r2 = r53
            boolean r22 = r9.d(r2)
            if (r22 == 0) goto L_0x00a3
            r22 = r20
            goto L_0x00a5
        L_0x00a3:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r0 = r0 | r22
        L_0x00a7:
            r22 = r10 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            r24 = 131072(0x20000, float:1.83671E-40)
            if (r22 == 0) goto L_0x00b2
            r0 = r0 | r23
            goto L_0x00c3
        L_0x00b2:
            r22 = r12 & r23
            if (r22 != 0) goto L_0x00c3
            boolean r22 = r9.i(r13)
            if (r22 == 0) goto L_0x00bf
            r22 = r24
            goto L_0x00c1
        L_0x00bf:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r0 = r0 | r22
        L_0x00c3:
            r22 = r10 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            r26 = 1048576(0x100000, float:1.469368E-39)
            if (r22 == 0) goto L_0x00d0
            r0 = r0 | r25
            r4 = r55
            goto L_0x00e3
        L_0x00d0:
            r27 = r12 & r25
            r4 = r55
            if (r27 != 0) goto L_0x00e3
            boolean r28 = r9.W(r4)
            if (r28 == 0) goto L_0x00df
            r28 = r26
            goto L_0x00e1
        L_0x00df:
            r28 = 524288(0x80000, float:7.34684E-40)
        L_0x00e1:
            r0 = r0 | r28
        L_0x00e3:
            r5 = r10 & 128(0x80, float:1.794E-43)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00ee
            r0 = r0 | r29
            r6 = r56
            goto L_0x0101
        L_0x00ee:
            r29 = r12 & r29
            r6 = r56
            if (r29 != 0) goto L_0x0101
            boolean r30 = r9.W(r6)
            if (r30 == 0) goto L_0x00fd
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ff
        L_0x00fd:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ff:
            r0 = r0 | r30
        L_0x0101:
            r7 = r10 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r7 == 0) goto L_0x010c
            r0 = r0 | r31
            r1 = r57
            goto L_0x011f
        L_0x010c:
            r32 = r12 & r31
            r1 = r57
            if (r32 != 0) goto L_0x011f
            boolean r32 = r9.l(r1)
            if (r32 == 0) goto L_0x011b
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r0 = r0 | r32
        L_0x011f:
            r1 = r10 & 512(0x200, float:7.175E-43)
            r32 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == 0) goto L_0x012a
            r0 = r0 | r32
            r2 = r58
            goto L_0x013d
        L_0x012a:
            r33 = r12 & r32
            r2 = r58
            if (r33 != 0) goto L_0x013d
            boolean r33 = r9.l(r2)
            if (r33 == 0) goto L_0x0139
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013b
        L_0x0139:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013b:
            r0 = r0 | r33
        L_0x013d:
            r2 = r10 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0146
            r33 = r11 | 6
            r4 = r59
            goto L_0x015c
        L_0x0146:
            r33 = r11 & 6
            r4 = r59
            if (r33 != 0) goto L_0x015a
            boolean r33 = r9.l(r4)
            if (r33 == 0) goto L_0x0155
            r33 = 4
            goto L_0x0157
        L_0x0155:
            r33 = 2
        L_0x0157:
            r33 = r11 | r33
            goto L_0x015c
        L_0x015a:
            r33 = r11
        L_0x015c:
            r4 = r10 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0165
            r33 = r33 | 48
        L_0x0162:
            r6 = r33
            goto L_0x0179
        L_0x0165:
            r34 = r11 & 48
            r6 = r60
            if (r34 != 0) goto L_0x0162
            boolean r34 = r9.l(r6)
            if (r34 == 0) goto L_0x0174
            r34 = 32
            goto L_0x0176
        L_0x0174:
            r34 = 16
        L_0x0176:
            r33 = r33 | r34
            goto L_0x0162
        L_0x0179:
            r8 = r10 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0182
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017f:
            r14 = r61
            goto L_0x0195
        L_0x0182:
            r14 = r11 & 384(0x180, float:5.38E-43)
            if (r14 != 0) goto L_0x017f
            r14 = r61
            boolean r33 = r9.l(r14)
            if (r33 == 0) goto L_0x0191
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x0193
        L_0x0191:
            r29 = 128(0x80, float:1.794E-43)
        L_0x0193:
            r6 = r6 | r29
        L_0x0195:
            r14 = r10 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x019e
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x019b:
            r15 = r62
            goto L_0x01ae
        L_0x019e:
            r15 = r11 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x019b
            r15 = r62
            boolean r29 = r9.W(r15)
            if (r29 == 0) goto L_0x01ac
            r17 = r18
        L_0x01ac:
            r6 = r6 | r17
        L_0x01ae:
            r15 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01b7
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b4:
            r13 = r63
            goto L_0x01c8
        L_0x01b7:
            r13 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x01b4
            r13 = r63
            boolean r17 = r9.W(r13)
            if (r17 == 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c4:
            r20 = 8192(0x2000, float:1.14794E-41)
        L_0x01c6:
            r6 = r6 | r20
        L_0x01c8:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r10 & r17
            if (r17 == 0) goto L_0x01d4
            r6 = r6 | r23
            r13 = r64
            goto L_0x01e7
        L_0x01d4:
            r18 = r11 & r23
            r13 = r64
            if (r18 != 0) goto L_0x01e7
            boolean r18 = r9.W(r13)
            if (r18 == 0) goto L_0x01e3
            r18 = r24
            goto L_0x01e5
        L_0x01e3:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01e5:
            r6 = r6 | r18
        L_0x01e7:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r10 & r18
            if (r18 == 0) goto L_0x01f2
            r6 = r6 | r25
            r13 = r65
            goto L_0x0205
        L_0x01f2:
            r20 = r11 & r25
            r13 = r65
            if (r20 != 0) goto L_0x0205
            boolean r20 = r9.d(r13)
            if (r20 == 0) goto L_0x0201
            r20 = r26
            goto L_0x0203
        L_0x0201:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x0203:
            r6 = r6 | r20
        L_0x0205:
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = r11 & r20
            if (r20 != 0) goto L_0x021f
            r20 = r10 & r24
            r13 = r66
            if (r20 != 0) goto L_0x021a
            boolean r20 = r9.i(r13)
            if (r20 == 0) goto L_0x021a
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021c
        L_0x021a:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x021c:
            r6 = r6 | r20
            goto L_0x0221
        L_0x021f:
            r13 = r66
        L_0x0221:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r10 & r20
            if (r20 == 0) goto L_0x022c
            r6 = r6 | r31
            r13 = r67
            goto L_0x023f
        L_0x022c:
            r23 = r11 & r31
            r13 = r67
            if (r23 != 0) goto L_0x023f
            boolean r23 = r9.i(r13)
            if (r23 == 0) goto L_0x023b
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x023d
        L_0x023b:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x023d:
            r6 = r6 | r23
        L_0x023f:
            r23 = 524288(0x80000, float:7.34684E-40)
            r23 = r10 & r23
            if (r23 == 0) goto L_0x024a
            r6 = r6 | r32
            r11 = r68
            goto L_0x025d
        L_0x024a:
            r25 = r11 & r32
            r11 = r68
            if (r25 != 0) goto L_0x025d
            boolean r25 = r9.W(r11)
            if (r25 == 0) goto L_0x0259
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x025b
        L_0x0259:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x025b:
            r6 = r6 | r25
        L_0x025d:
            r25 = r74 & 6
            if (r25 != 0) goto L_0x0275
            r25 = r10 & r26
            r11 = r69
            if (r25 != 0) goto L_0x0270
            boolean r25 = r9.W(r11)
            if (r25 == 0) goto L_0x0270
            r21 = 4
            goto L_0x0272
        L_0x0270:
            r21 = 2
        L_0x0272:
            r21 = r74 | r21
            goto L_0x0279
        L_0x0275:
            r11 = r69
            r21 = r74
        L_0x0279:
            r25 = 2097152(0x200000, float:2.938736E-39)
            r25 = r10 & r25
            if (r25 == 0) goto L_0x0284
            r21 = r21 | 48
            r11 = r70
            goto L_0x0297
        L_0x0284:
            r29 = r74 & 48
            r11 = r70
            if (r29 != 0) goto L_0x0297
            boolean r29 = r9.l(r11)
            if (r29 == 0) goto L_0x0293
            r27 = 32
            goto L_0x0295
        L_0x0293:
            r27 = 16
        L_0x0295:
            r21 = r21 | r27
        L_0x0297:
            r27 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r0 & r27
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r13) goto L_0x02e4
            r11 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r11 & r6
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r13) goto L_0x02e4
            r11 = r21 & 19
            r13 = 18
            if (r11 != r13) goto L_0x02e4
            boolean r11 = r9.t()
            if (r11 != 0) goto L_0x02b7
            goto L_0x02e4
        L_0x02b7:
            r9.B()
            r3 = r51
            r4 = r52
            r5 = r53
            r7 = r55
            r8 = r56
            r10 = r58
            r11 = r59
            r12 = r60
            r13 = r61
            r14 = r62
            r15 = r63
            r16 = r64
            r17 = r65
            r18 = r66
            r19 = r67
            r20 = r68
            r21 = r69
            r22 = r70
            r46 = r9
            r9 = r57
            goto L_0x04a4
        L_0x02e4:
            r9.p()
            r11 = r12 & 1
            if (r11 == 0) goto L_0x032b
            boolean r11 = r9.J()
            if (r11 == 0) goto L_0x02f2
            goto L_0x032b
        L_0x02f2:
            r9.B()
            r1 = r10 & r24
            if (r1 == 0) goto L_0x02fd
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r6 = r6 & r1
        L_0x02fd:
            r1 = r10 & r26
            if (r1 == 0) goto L_0x0303
            r21 = r21 & -15
        L_0x0303:
            r27 = r51
            r28 = r52
            r29 = r53
            r30 = r55
            r31 = r56
            r32 = r57
            r33 = r58
            r34 = r59
            r35 = r60
            r36 = r61
            r37 = r62
            r38 = r63
            r39 = r64
            r40 = r65
            r41 = r66
            r42 = r67
            r43 = r68
            r44 = r69
            r45 = r70
            goto L_0x041b
        L_0x032b:
            if (r3 == 0) goto L_0x0330
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0332
        L_0x0330:
            r3 = r51
        L_0x0332:
            r11 = 1
            if (r16 == 0) goto L_0x0337
            r13 = r11
            goto L_0x0339
        L_0x0337:
            r13 = r52
        L_0x0339:
            if (r19 == 0) goto L_0x033e
            r16 = 0
            goto L_0x0340
        L_0x033e:
            r16 = r53
        L_0x0340:
            if (r22 == 0) goto L_0x0345
            java.lang.String r19 = ""
            goto L_0x0347
        L_0x0345:
            r19 = r55
        L_0x0347:
            if (r5 == 0) goto L_0x034c
            java.lang.String r5 = ""
            goto L_0x034e
        L_0x034c:
            r5 = r56
        L_0x034e:
            r22 = 0
            if (r7 == 0) goto L_0x0355
            r7 = r22
            goto L_0x0357
        L_0x0355:
            r7 = r57
        L_0x0357:
            if (r1 == 0) goto L_0x035c
            r1 = r22
            goto L_0x035e
        L_0x035c:
            r1 = r58
        L_0x035e:
            if (r2 == 0) goto L_0x0363
            r2 = r22
            goto L_0x0365
        L_0x0363:
            r2 = r59
        L_0x0365:
            if (r4 == 0) goto L_0x036a
            r4 = r22
            goto L_0x036c
        L_0x036a:
            r4 = r60
        L_0x036c:
            if (r8 == 0) goto L_0x0371
            r8 = r22
            goto L_0x0373
        L_0x0371:
            r8 = r61
        L_0x0373:
            if (r14 == 0) goto L_0x037c
            androidx.compose.ui.text.input.VisualTransformation$Companion r14 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r14 = r14.c()
            goto L_0x037e
        L_0x037c:
            r14 = r62
        L_0x037e:
            if (r15 == 0) goto L_0x0387
            androidx.compose.foundation.text.KeyboardOptions$Companion r15 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r15 = r15.a()
            goto L_0x0389
        L_0x0387:
            r15 = r63
        L_0x0389:
            if (r17 == 0) goto L_0x0392
            androidx.compose.foundation.text.KeyboardActions$Companion r17 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r17 = r17.a()
            goto L_0x0394
        L_0x0392:
            r17 = r64
        L_0x0394:
            if (r18 == 0) goto L_0x0399
            r18 = 0
            goto L_0x039b
        L_0x0399:
            r18 = r65
        L_0x039b:
            r24 = r10 & r24
            if (r24 == 0) goto L_0x03ad
            if (r18 == 0) goto L_0x03a4
            r24 = r11
            goto L_0x03a7
        L_0x03a4:
            r24 = 2147483647(0x7fffffff, float:NaN)
        L_0x03a7:
            r27 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r6 = r6 & r27
            goto L_0x03af
        L_0x03ad:
            r24 = r66
        L_0x03af:
            if (r20 == 0) goto L_0x03b2
            goto L_0x03b4
        L_0x03b2:
            r11 = r67
        L_0x03b4:
            if (r23 == 0) goto L_0x03b9
            r20 = r22
            goto L_0x03bb
        L_0x03b9:
            r20 = r68
        L_0x03bb:
            r23 = r10 & r26
            r51 = r1
            if (r23 == 0) goto L_0x03cd
            androidx.compose.material3.OutlinedTextFieldDefaults r1 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            r52 = r2
            r2 = 6
            androidx.compose.ui.graphics.Shape r1 = r1.p(r9, r2)
            r21 = r21 & -15
            goto L_0x03d1
        L_0x03cd:
            r52 = r2
            r1 = r69
        L_0x03d1:
            r33 = r51
            r34 = r52
            if (r25 == 0) goto L_0x03fa
            r44 = r1
            r27 = r3
            r35 = r4
            r31 = r5
            r32 = r7
            r36 = r8
            r42 = r11
            r28 = r13
            r37 = r14
            r38 = r15
            r29 = r16
            r39 = r17
            r40 = r18
            r30 = r19
            r43 = r20
            r45 = r22
        L_0x03f7:
            r41 = r24
            goto L_0x041b
        L_0x03fa:
            r45 = r70
            r44 = r1
            r27 = r3
            r35 = r4
            r31 = r5
            r32 = r7
            r36 = r8
            r42 = r11
            r28 = r13
            r37 = r14
            r38 = r15
            r29 = r16
            r39 = r17
            r40 = r18
            r30 = r19
            r43 = r20
            goto L_0x03f7
        L_0x041b:
            r9.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x042c
            r1 = 425802095(0x1961396f, float:1.1643826E-23)
            java.lang.String r2 = "com.hansecom.abt.ui.components.formFields.AbtOutlineTextField (AbtOutlineTextField.kt:138)"
            androidx.compose.runtime.ComposerKt.Y(r1, r0, r6, r2)
        L_0x042c:
            int r1 = r0 >> 15
            r1 = r1 & 14
            r13 = r54
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r13, r9, r1)
            r1 = 2147024894(0x7ff8fffe, float:NaN)
            r23 = r0 & r1
            r0 = 2147483646(0x7ffffffe, float:NaN)
            r24 = r6 & r0
            r25 = r21 & 126(0x7e, float:1.77E-43)
            r26 = 0
            r0 = r49
            r1 = r50
            r2 = r27
            r3 = r28
            r4 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r46 = r9
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            r14 = r38
            r15 = r39
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            r21 = r45
            r22 = r46
            e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x047e
            androidx.compose.runtime.ComposerKt.X()
        L_0x047e:
            r3 = r27
            r4 = r28
            r5 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
            r21 = r44
            r22 = r45
        L_0x04a4:
            androidx.compose.runtime.ScopeUpdateScope r6 = r46.x()
            if (r6 == 0) goto L_0x04c9
            com.hansecom.abt.ui.components.formFields.f r2 = new com.hansecom.abt.ui.components.formFields.f
            r0 = r2
            r1 = r49
            r47 = r2
            r2 = r50
            r48 = r6
            r6 = r54
            r23 = r72
            r24 = r73
            r25 = r74
            r26 = r75
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = r47
            r0 = r48
            r0.a(r1)
        L_0x04c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldKt.d(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, int, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.ui.autofill.ContentType, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r50, kotlin.jvm.functions.Function1 r51, androidx.compose.ui.Modifier r52, boolean r53, boolean r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, kotlin.jvm.functions.Function2 r58, kotlin.jvm.functions.Function2 r59, kotlin.jvm.functions.Function2 r60, kotlin.jvm.functions.Function2 r61, kotlin.jvm.functions.Function2 r62, androidx.compose.ui.text.input.VisualTransformation r63, androidx.compose.foundation.text.KeyboardOptions r64, androidx.compose.foundation.text.KeyboardActions r65, boolean r66, int r67, int r68, androidx.compose.foundation.interaction.MutableInteractionSource r69, androidx.compose.ui.graphics.Shape r70, androidx.compose.ui.autofill.ContentType r71, androidx.compose.runtime.Composer r72, int r73, int r74, int r75, int r76) {
        /*
            r15 = r50
            r14 = r51
            r12 = r55
            r11 = r73
            r10 = r74
            r9 = r76
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 973018335(0x39ff14df, float:4.865294E-4)
            r1 = r72
            androidx.compose.runtime.Composer r8 = r1.q(r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x002b
            r0 = r11 | 6
            goto L_0x003b
        L_0x002b:
            r0 = r11 & 6
            if (r0 != 0) goto L_0x003a
            boolean r0 = r8.W(r15)
            if (r0 == 0) goto L_0x0037
            r0 = 4
            goto L_0x0038
        L_0x0037:
            r0 = 2
        L_0x0038:
            r0 = r0 | r11
            goto L_0x003b
        L_0x003a:
            r0 = r11
        L_0x003b:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0042
            r0 = r0 | 48
            goto L_0x0052
        L_0x0042:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0052
            boolean r3 = r8.l(r14)
            if (r3 == 0) goto L_0x004f
            r3 = 32
            goto L_0x0051
        L_0x004f:
            r3 = 16
        L_0x0051:
            r0 = r0 | r3
        L_0x0052:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x005b
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r13 = r52
            goto L_0x006e
        L_0x005b:
            r13 = r11 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x0058
            r13 = r52
            boolean r16 = r8.W(r13)
            if (r16 == 0) goto L_0x006a
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r16 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r0 = r0 | r16
        L_0x006e:
            r16 = r9 & 8
            r17 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0079
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0076:
            r1 = r53
            goto L_0x008c
        L_0x0079:
            r1 = r11 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0076
            r1 = r53
            boolean r18 = r8.d(r1)
            if (r18 == 0) goto L_0x0088
            r18 = r17
            goto L_0x008a
        L_0x0088:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x008a:
            r0 = r0 | r18
        L_0x008c:
            r18 = r9 & 16
            if (r18 == 0) goto L_0x0095
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0092:
            r2 = r54
            goto L_0x00a8
        L_0x0095:
            r2 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0092
            r2 = r54
            boolean r20 = r8.d(r2)
            if (r20 == 0) goto L_0x00a4
            r20 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r20 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r0 = r0 | r20
        L_0x00a8:
            r20 = r9 & 32
            r21 = 196608(0x30000, float:2.75506E-40)
            r22 = 131072(0x20000, float:1.83671E-40)
            if (r20 == 0) goto L_0x00b3
            r0 = r0 | r21
            goto L_0x00c4
        L_0x00b3:
            r20 = r11 & r21
            if (r20 != 0) goto L_0x00c4
            boolean r20 = r8.W(r12)
            if (r20 == 0) goto L_0x00c0
            r20 = r22
            goto L_0x00c2
        L_0x00c0:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r0 = r0 | r20
        L_0x00c4:
            r20 = r9 & 64
            r23 = 1048576(0x100000, float:1.469368E-39)
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r20 == 0) goto L_0x00d1
            r0 = r0 | r24
            r4 = r56
            goto L_0x00e4
        L_0x00d1:
            r25 = r11 & r24
            r4 = r56
            if (r25 != 0) goto L_0x00e4
            boolean r26 = r8.W(r4)
            if (r26 == 0) goto L_0x00e0
            r26 = r23
            goto L_0x00e2
        L_0x00e0:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r0 = r0 | r26
        L_0x00e4:
            r5 = r9 & 128(0x80, float:1.794E-43)
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00ef
            r0 = r0 | r27
            r6 = r57
            goto L_0x0102
        L_0x00ef:
            r27 = r11 & r27
            r6 = r57
            if (r27 != 0) goto L_0x0102
            boolean r28 = r8.W(r6)
            if (r28 == 0) goto L_0x00fe
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r0 = r0 | r28
        L_0x0102:
            r7 = r9 & 256(0x100, float:3.59E-43)
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            if (r7 == 0) goto L_0x010d
            r0 = r0 | r29
            r1 = r58
            goto L_0x0120
        L_0x010d:
            r30 = r11 & r29
            r1 = r58
            if (r30 != 0) goto L_0x0120
            boolean r30 = r8.l(r1)
            if (r30 == 0) goto L_0x011c
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r0 = r0 | r30
        L_0x0120:
            r1 = r9 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == 0) goto L_0x012b
            r0 = r0 | r30
            r2 = r59
            goto L_0x013e
        L_0x012b:
            r31 = r11 & r30
            r2 = r59
            if (r31 != 0) goto L_0x013e
            boolean r31 = r8.l(r2)
            if (r31 == 0) goto L_0x013a
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r0 = r0 | r31
        L_0x013e:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0147
            r31 = r10 | 6
            r4 = r60
            goto L_0x015d
        L_0x0147:
            r31 = r10 & 6
            r4 = r60
            if (r31 != 0) goto L_0x015b
            boolean r31 = r8.l(r4)
            if (r31 == 0) goto L_0x0156
            r31 = 4
            goto L_0x0158
        L_0x0156:
            r31 = 2
        L_0x0158:
            r31 = r10 | r31
            goto L_0x015d
        L_0x015b:
            r31 = r10
        L_0x015d:
            r4 = r9 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0166
            r31 = r31 | 48
        L_0x0163:
            r6 = r31
            goto L_0x017a
        L_0x0166:
            r32 = r10 & 48
            r6 = r61
            if (r32 != 0) goto L_0x0163
            boolean r32 = r8.l(r6)
            if (r32 == 0) goto L_0x0175
            r32 = 32
            goto L_0x0177
        L_0x0175:
            r32 = 16
        L_0x0177:
            r31 = r31 | r32
            goto L_0x0163
        L_0x017a:
            r13 = r9 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0183
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0180:
            r14 = r62
            goto L_0x0196
        L_0x0183:
            r14 = r10 & 384(0x180, float:5.38E-43)
            if (r14 != 0) goto L_0x0180
            r14 = r62
            boolean r31 = r8.l(r14)
            if (r31 == 0) goto L_0x0192
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x0194
        L_0x0192:
            r27 = 128(0x80, float:1.794E-43)
        L_0x0194:
            r6 = r6 | r27
        L_0x0196:
            r14 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x019f
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x019c:
            r15 = r63
            goto L_0x01b0
        L_0x019f:
            r15 = r10 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x019c
            r15 = r63
            boolean r27 = r8.W(r15)
            if (r27 == 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x01ae:
            r6 = r6 | r17
        L_0x01b0:
            r15 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01b9
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b6:
            r12 = r64
            goto L_0x01cc
        L_0x01b9:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x01b6
            r12 = r64
            boolean r17 = r8.W(r12)
            if (r17 == 0) goto L_0x01c8
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01ca
        L_0x01c8:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x01ca:
            r6 = r6 | r17
        L_0x01cc:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r9 & r17
            if (r17 == 0) goto L_0x01d8
            r6 = r6 | r21
            r12 = r65
            goto L_0x01eb
        L_0x01d8:
            r21 = r10 & r21
            r12 = r65
            if (r21 != 0) goto L_0x01eb
            boolean r21 = r8.W(r12)
            if (r21 == 0) goto L_0x01e7
            r21 = r22
            goto L_0x01e9
        L_0x01e7:
            r21 = 65536(0x10000, float:9.18355E-41)
        L_0x01e9:
            r6 = r6 | r21
        L_0x01eb:
            r21 = 65536(0x10000, float:9.18355E-41)
            r21 = r9 & r21
            if (r21 == 0) goto L_0x01f6
            r6 = r6 | r24
            r12 = r66
            goto L_0x0209
        L_0x01f6:
            r27 = r10 & r24
            r12 = r66
            if (r27 != 0) goto L_0x0209
            boolean r27 = r8.d(r12)
            if (r27 == 0) goto L_0x0205
            r27 = r23
            goto L_0x0207
        L_0x0205:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x0207:
            r6 = r6 | r27
        L_0x0209:
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r27 = r10 & r27
            if (r27 != 0) goto L_0x0223
            r27 = r9 & r22
            r12 = r67
            if (r27 != 0) goto L_0x021e
            boolean r27 = r8.i(r12)
            if (r27 == 0) goto L_0x021e
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0220
        L_0x021e:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x0220:
            r6 = r6 | r27
            goto L_0x0225
        L_0x0223:
            r12 = r67
        L_0x0225:
            r27 = 262144(0x40000, float:3.67342E-40)
            r27 = r9 & r27
            if (r27 == 0) goto L_0x0230
            r6 = r6 | r29
            r12 = r68
            goto L_0x0243
        L_0x0230:
            r28 = r10 & r29
            r12 = r68
            if (r28 != 0) goto L_0x0243
            boolean r28 = r8.i(r12)
            if (r28 == 0) goto L_0x023f
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0241
        L_0x023f:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0241:
            r6 = r6 | r28
        L_0x0243:
            r28 = 524288(0x80000, float:7.34684E-40)
            r28 = r9 & r28
            if (r28 == 0) goto L_0x024e
            r6 = r6 | r30
            r10 = r69
            goto L_0x0261
        L_0x024e:
            r29 = r10 & r30
            r10 = r69
            if (r29 != 0) goto L_0x0261
            boolean r29 = r8.W(r10)
            if (r29 == 0) goto L_0x025d
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x025f
        L_0x025d:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x025f:
            r6 = r6 | r29
        L_0x0261:
            r29 = r75 & 6
            if (r29 != 0) goto L_0x0279
            r29 = r9 & r23
            r10 = r70
            if (r29 != 0) goto L_0x0274
            boolean r29 = r8.W(r10)
            if (r29 == 0) goto L_0x0274
            r19 = 4
            goto L_0x0276
        L_0x0274:
            r19 = 2
        L_0x0276:
            r19 = r75 | r19
            goto L_0x027d
        L_0x0279:
            r10 = r70
            r19 = r75
        L_0x027d:
            r29 = 2097152(0x200000, float:2.938736E-39)
            r29 = r9 & r29
            if (r29 == 0) goto L_0x0288
            r19 = r19 | 48
            r10 = r71
            goto L_0x029b
        L_0x0288:
            r30 = r75 & 48
            r10 = r71
            if (r30 != 0) goto L_0x029b
            boolean r30 = r8.l(r10)
            if (r30 == 0) goto L_0x0297
            r25 = 32
            goto L_0x0299
        L_0x0297:
            r25 = 16
        L_0x0299:
            r19 = r19 | r25
        L_0x029b:
            r25 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r0 & r25
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r12) goto L_0x02e8
            r10 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r10 & r6
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r12) goto L_0x02e8
            r10 = r19 & 19
            r12 = 18
            if (r10 != r12) goto L_0x02e8
            boolean r10 = r8.t()
            if (r10 != 0) goto L_0x02bb
            goto L_0x02e8
        L_0x02bb:
            r8.B()
            r3 = r52
            r4 = r53
            r5 = r54
            r7 = r56
            r9 = r58
            r10 = r59
            r11 = r60
            r12 = r61
            r13 = r62
            r14 = r63
            r15 = r64
            r16 = r65
            r17 = r66
            r18 = r67
            r19 = r68
            r20 = r69
            r21 = r70
            r22 = r71
            r43 = r8
            r8 = r57
            goto L_0x0556
        L_0x02e8:
            r8.p()
            r10 = r11 & 1
            if (r10 == 0) goto L_0x0330
            boolean r10 = r8.J()
            if (r10 == 0) goto L_0x02f6
            goto L_0x0330
        L_0x02f6:
            r8.B()
            r1 = r9 & r22
            if (r1 == 0) goto L_0x0301
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r6 = r6 & r1
        L_0x0301:
            r1 = r9 & r23
            if (r1 == 0) goto L_0x0307
            r19 = r19 & -15
        L_0x0307:
            r15 = r52
            r28 = r53
            r29 = r54
            r14 = r56
            r12 = r57
            r30 = r58
            r31 = r59
            r32 = r60
            r33 = r61
            r34 = r62
            r35 = r63
            r36 = r64
            r37 = r65
            r38 = r66
            r39 = r67
            r40 = r68
            r41 = r69
            r42 = r70
            r10 = r71
            r1 = r6
            goto L_0x0406
        L_0x0330:
            if (r3 == 0) goto L_0x0335
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0337
        L_0x0335:
            r3 = r52
        L_0x0337:
            if (r16 == 0) goto L_0x033b
            r10 = 1
            goto L_0x033d
        L_0x033b:
            r10 = r53
        L_0x033d:
            if (r18 == 0) goto L_0x0342
            r16 = 0
            goto L_0x0344
        L_0x0342:
            r16 = r54
        L_0x0344:
            if (r20 == 0) goto L_0x0349
            java.lang.String r18 = ""
            goto L_0x034b
        L_0x0349:
            r18 = r56
        L_0x034b:
            if (r5 == 0) goto L_0x0350
            java.lang.String r5 = ""
            goto L_0x0352
        L_0x0350:
            r5 = r57
        L_0x0352:
            if (r7 == 0) goto L_0x0356
            r7 = 0
            goto L_0x0358
        L_0x0356:
            r7 = r58
        L_0x0358:
            if (r1 == 0) goto L_0x035c
            r1 = 0
            goto L_0x035e
        L_0x035c:
            r1 = r59
        L_0x035e:
            if (r2 == 0) goto L_0x0362
            r2 = 0
            goto L_0x0364
        L_0x0362:
            r2 = r60
        L_0x0364:
            if (r4 == 0) goto L_0x0368
            r4 = 0
            goto L_0x036a
        L_0x0368:
            r4 = r61
        L_0x036a:
            if (r13 == 0) goto L_0x036e
            r13 = 0
            goto L_0x0370
        L_0x036e:
            r13 = r62
        L_0x0370:
            if (r14 == 0) goto L_0x0379
            androidx.compose.ui.text.input.VisualTransformation$Companion r14 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r14 = r14.c()
            goto L_0x037b
        L_0x0379:
            r14 = r63
        L_0x037b:
            if (r15 == 0) goto L_0x0384
            androidx.compose.foundation.text.KeyboardOptions$Companion r15 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r15 = r15.a()
            goto L_0x0386
        L_0x0384:
            r15 = r64
        L_0x0386:
            if (r17 == 0) goto L_0x038f
            androidx.compose.foundation.text.KeyboardActions$Companion r17 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r17 = r17.a()
            goto L_0x0391
        L_0x038f:
            r17 = r65
        L_0x0391:
            if (r21 == 0) goto L_0x0396
            r20 = 0
            goto L_0x0398
        L_0x0396:
            r20 = r66
        L_0x0398:
            r21 = r9 & r22
            if (r21 == 0) goto L_0x03aa
            if (r20 == 0) goto L_0x03a1
            r21 = 1
            goto L_0x03a4
        L_0x03a1:
            r21 = 2147483647(0x7fffffff, float:NaN)
        L_0x03a4:
            r22 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r6 = r6 & r22
            goto L_0x03ac
        L_0x03aa:
            r21 = r67
        L_0x03ac:
            if (r27 == 0) goto L_0x03b1
            r22 = 1
            goto L_0x03b3
        L_0x03b1:
            r22 = r68
        L_0x03b3:
            if (r28 == 0) goto L_0x03b8
            r27 = 0
            goto L_0x03ba
        L_0x03b8:
            r27 = r69
        L_0x03ba:
            r23 = r9 & r23
            if (r23 == 0) goto L_0x03ca
            androidx.compose.material3.OutlinedTextFieldDefaults r12 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            r52 = r1
            r1 = 6
            androidx.compose.ui.graphics.Shape r12 = r12.p(r8, r1)
            r19 = r19 & -15
            goto L_0x03ce
        L_0x03ca:
            r52 = r1
            r12 = r70
        L_0x03ce:
            r31 = r52
            r32 = r2
            r33 = r4
            r1 = r6
            r30 = r7
            r28 = r10
            r42 = r12
            r34 = r13
            r35 = r14
            r36 = r15
            if (r29 == 0) goto L_0x03f5
            r29 = r16
            r37 = r17
            r14 = r18
            r38 = r20
            r39 = r21
            r40 = r22
            r41 = r27
            r10 = 0
        L_0x03f2:
            r15 = r3
            r12 = r5
            goto L_0x0406
        L_0x03f5:
            r29 = r16
            r37 = r17
            r14 = r18
            r38 = r20
            r39 = r21
            r40 = r22
            r41 = r27
            r10 = r71
            goto L_0x03f2
        L_0x0406:
            r8.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0417
            r2 = 973018335(0x39ff14df, float:4.865294E-4)
            java.lang.String r3 = "com.hansecom.abt.ui.components.formFields.AbtOutlineTextField (AbtOutlineTextField.kt:63)"
            androidx.compose.runtime.ComposerKt.Y(r2, r0, r1, r3)
        L_0x0417:
            r2 = 379412725(0x169d60f5, float:2.5425906E-25)
            r8.X(r2)
            boolean r2 = r8.W(r10)
            java.lang.Object r3 = r8.g()
            if (r2 != 0) goto L_0x0433
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0430
            goto L_0x0433
        L_0x0430:
            r4 = 0
            r5 = 0
            goto L_0x044d
        L_0x0433:
            if (r10 == 0) goto L_0x0445
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            com.hansecom.abt.ui.components.formFields.d r3 = new com.hansecom.abt.ui.components.formFields.d
            r3.<init>(r10)
            r4 = 0
            r5 = 0
            r6 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r2, r4, r3, r6, r5)
        L_0x0443:
            r3 = r2
            goto L_0x044a
        L_0x0445:
            r4 = 0
            r5 = 0
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0443
        L_0x044a:
            r8.N(r3)
        L_0x044d:
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r8.M()
            androidx.compose.ui.Modifier r2 = r15.o0(r3)
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r6 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r3 = r3.d(r8, r6)
            androidx.compose.ui.text.TextStyle r7 = r3.c()
            com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldDefaults r3 = com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldDefaults.f38255a
            androidx.compose.material3.TextFieldColors r22 = r3.a(r8, r6)
            r3 = 379433422(0x169db1ce, float:2.5476929E-25)
            r8.X(r3)
            if (r14 != 0) goto L_0x0476
            if (r12 == 0) goto L_0x0472
            goto L_0x0476
        L_0x0472:
            r16 = r5
            r13 = 1
            goto L_0x0487
        L_0x0476:
            com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldKt$AbtOutlineTextField$1 r3 = new com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldKt$AbtOutlineTextField$1
            r3.<init>(r12, r14)
            r5 = 54
            r6 = -1123571419(0xffffffffbd07a925, float:-0.033120293)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r13, r3, r8, r5)
            r16 = r3
        L_0x0487:
            r8.M()
            if (r12 == 0) goto L_0x0492
            int r3 = r12.length()
            if (r3 != 0) goto L_0x0493
        L_0x0492:
            r4 = r13
        L_0x0493:
            r3 = r4 ^ 1
            r4 = r13
            r13 = r3
            com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldKt$AbtOutlineTextField$2 r3 = new com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldKt$AbtOutlineTextField$2
            r5 = r55
            r3.<init>(r5)
            r6 = 54
            r5 = 1788159737(0x6a9526f9, float:9.0156995E25)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r4, r3, r8, r6)
            r3 = r0 & 14
            r3 = r3 | r24
            r4 = r0 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = r0 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r0
            r3 = r3 | r4
            int r0 = r0 >> 3
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r0
            r3 = r3 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r4
            r0 = r0 | r3
            int r3 = r1 << 27
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r24 = r0 | r3
            int r0 = r1 >> 3
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r3 = r1 << 3
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r25 = r0 | r3
            int r0 = r1 >> 27
            r0 = r0 & 14
            int r1 = r19 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r26 = r0 | r1
            r27 = 0
            r0 = r50
            r1 = r51
            r3 = r28
            r4 = r29
            r5 = r7
            r7 = r30
            r43 = r8
            r8 = r31
            r9 = r32
            r44 = r10
            r10 = r33
            r11 = r34
            r45 = r12
            r12 = r16
            r46 = r14
            r14 = r35
            r47 = r15
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r21 = r42
            r23 = r43
            androidx.compose.material3.OutlinedTextFieldKt.g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0530
            androidx.compose.runtime.ComposerKt.X()
        L_0x0530:
            r4 = r28
            r5 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r21 = r42
            r22 = r44
            r8 = r45
            r7 = r46
            r3 = r47
        L_0x0556:
            androidx.compose.runtime.ScopeUpdateScope r6 = r43.x()
            if (r6 == 0) goto L_0x057b
            com.hansecom.abt.ui.components.formFields.e r2 = new com.hansecom.abt.ui.components.formFields.e
            r0 = r2
            r1 = r50
            r48 = r2
            r2 = r51
            r49 = r6
            r6 = r55
            r23 = r73
            r24 = r74
            r25 = r75
            r26 = r76
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = r48
            r0 = r49
            r0.a(r1)
        L_0x057b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldKt.e(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.ui.autofill.ContentType, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    public static final Unit f(ContentType contentType, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.f0(semanticsPropertyReceiver, contentType);
        return Unit.f40552a;
    }

    public static final Unit g(String str, Function1 function1, Modifier modifier, boolean z2, boolean z3, String str2, String str3, String str4, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, ContentType contentType, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        e(str, function1, modifier, z2, z3, str2, str3, str4, function2, function22, function23, function24, function25, visualTransformation, keyboardOptions, keyboardActions, z4, i2, i3, mutableInteractionSource, shape, contentType, composer, RecomposeScopeImplKt.a(i4 | 1), RecomposeScopeImplKt.a(i5), RecomposeScopeImplKt.a(i6), i7);
        return Unit.f40552a;
    }

    public static final Unit h(String str, Function1 function1, Modifier modifier, boolean z2, boolean z3, int i2, String str2, String str3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i3, int i4, MutableInteractionSource mutableInteractionSource, Shape shape, ContentType contentType, int i5, int i6, int i7, int i8, Composer composer, int i9) {
        d(str, function1, modifier, z2, z3, i2, str2, str3, function2, function22, function23, function24, function25, visualTransformation, keyboardOptions, keyboardActions, z4, i3, i4, mutableInteractionSource, shape, contentType, composer, RecomposeScopeImplKt.a(i5 | 1), RecomposeScopeImplKt.a(i6), RecomposeScopeImplKt.a(i7), i8);
        return Unit.f40552a;
    }
}
