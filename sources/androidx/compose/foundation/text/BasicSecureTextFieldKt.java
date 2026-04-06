package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class BasicSecureTextFieldKt {
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void b(androidx.compose.foundation.text.input.TextFieldState r39, androidx.compose.ui.Modifier r40, boolean r41, androidx.compose.foundation.text.input.InputTransformation r42, androidx.compose.ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.input.KeyboardActionHandler r45, kotlin.jvm.functions.Function2 r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.ui.graphics.Brush r48, androidx.compose.foundation.text.input.TextFieldDecorator r49, int r50, char r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            r0 = r49
            r14 = r53
            r15 = r54
            r13 = r55
            r1 = 1399310985(0x5367ca89, float:9.9553542E11)
            r2 = r52
            androidx.compose.runtime.Composer r2 = r2.q(r1)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r14 | 6
            r6 = r3
            r3 = r39
            goto L_0x002f
        L_0x001b:
            r3 = r14 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r39
            boolean r6 = r2.W(r3)
            if (r6 == 0) goto L_0x0029
            r6 = 4
            goto L_0x002a
        L_0x0029:
            r6 = 2
        L_0x002a:
            r6 = r6 | r14
            goto L_0x002f
        L_0x002c:
            r3 = r39
            r6 = r14
        L_0x002f:
            r7 = r13 & 2
            if (r7 == 0) goto L_0x0038
            r6 = r6 | 48
        L_0x0035:
            r10 = r40
            goto L_0x004a
        L_0x0038:
            r10 = r14 & 48
            if (r10 != 0) goto L_0x0035
            r10 = r40
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x0047
            r11 = 32
            goto L_0x0049
        L_0x0047:
            r11 = 16
        L_0x0049:
            r6 = r6 | r11
        L_0x004a:
            r11 = r13 & 4
            r16 = 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0055
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r4 = r41
            goto L_0x0068
        L_0x0055:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0052
            r4 = r41
            boolean r17 = r2.d(r4)
            if (r17 == 0) goto L_0x0064
            r17 = r16
            goto L_0x0066
        L_0x0064:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r6 = r6 | r17
        L_0x0068:
            r17 = r13 & 8
            if (r17 == 0) goto L_0x0071
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r5 = r42
            goto L_0x0084
        L_0x0071:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x006e
            r5 = r42
            boolean r19 = r2.W(r5)
            if (r19 == 0) goto L_0x0080
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r19 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r6 = r6 | r19
        L_0x0084:
            r19 = r13 & 16
            if (r19 == 0) goto L_0x008d
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r8 = r43
            goto L_0x00a0
        L_0x008d:
            r8 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x008a
            r8 = r43
            boolean r21 = r2.W(r8)
            if (r21 == 0) goto L_0x009c
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r6 = r6 | r21
        L_0x00a0:
            r21 = r13 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00ab
            r6 = r6 | r22
            r9 = r44
            goto L_0x00be
        L_0x00ab:
            r22 = r14 & r22
            r9 = r44
            if (r22 != 0) goto L_0x00be
            boolean r23 = r2.W(r9)
            if (r23 == 0) goto L_0x00ba
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r6 = r6 | r23
        L_0x00be:
            r23 = r13 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r23 == 0) goto L_0x00c9
            r6 = r6 | r24
            r12 = r45
            goto L_0x00dc
        L_0x00c9:
            r24 = r14 & r24
            r12 = r45
            if (r24 != 0) goto L_0x00dc
            boolean r25 = r2.W(r12)
            if (r25 == 0) goto L_0x00d8
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r6 = r6 | r25
        L_0x00dc:
            r1 = r13 & 128(0x80, float:1.794E-43)
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00e7
            r6 = r6 | r26
            r3 = r46
            goto L_0x00fa
        L_0x00e7:
            r26 = r14 & r26
            r3 = r46
            if (r26 != 0) goto L_0x00fa
            boolean r26 = r2.l(r3)
            if (r26 == 0) goto L_0x00f6
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r6 = r6 | r26
        L_0x00fa:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x0105
            r6 = r6 | r26
            r4 = r47
            goto L_0x0118
        L_0x0105:
            r26 = r14 & r26
            r4 = r47
            if (r26 != 0) goto L_0x0118
            boolean r26 = r2.W(r4)
            if (r26 == 0) goto L_0x0114
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r6 = r6 | r26
        L_0x0118:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r26 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0123
            r6 = r6 | r26
            r5 = r48
            goto L_0x0136
        L_0x0123:
            r26 = r14 & r26
            r5 = r48
            if (r26 != 0) goto L_0x0136
            boolean r26 = r2.W(r5)
            if (r26 == 0) goto L_0x0132
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0134
        L_0x0132:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0134:
            r6 = r6 | r26
        L_0x0136:
            r5 = r13 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x013d
            r18 = r15 | 6
            goto L_0x015a
        L_0x013d:
            r26 = r15 & 6
            if (r26 != 0) goto L_0x0158
            r26 = r15 & 8
            if (r26 != 0) goto L_0x014a
            boolean r26 = r2.W(r0)
            goto L_0x014e
        L_0x014a:
            boolean r26 = r2.l(r0)
        L_0x014e:
            if (r26 == 0) goto L_0x0153
            r18 = 4
            goto L_0x0155
        L_0x0153:
            r18 = 2
        L_0x0155:
            r18 = r15 | r18
            goto L_0x015a
        L_0x0158:
            r18 = r15
        L_0x015a:
            r0 = r13 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0163
            r18 = r18 | 48
        L_0x0160:
            r8 = r18
            goto L_0x0177
        L_0x0163:
            r26 = r15 & 48
            r8 = r50
            if (r26 != 0) goto L_0x0160
            boolean r26 = r2.i(r8)
            if (r26 == 0) goto L_0x0172
            r20 = 32
            goto L_0x0174
        L_0x0172:
            r20 = 16
        L_0x0174:
            r18 = r18 | r20
            goto L_0x0160
        L_0x0177:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0180
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x017d:
            r10 = r51
            goto L_0x0191
        L_0x0180:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017d
            r10 = r51
            boolean r18 = r2.m(r10)
            if (r18 == 0) goto L_0x018d
            goto L_0x018f
        L_0x018d:
            r16 = 128(0x80, float:1.794E-43)
        L_0x018f:
            r8 = r8 | r16
        L_0x0191:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r6 & r16
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            r16 = 1
            if (r10 != r12) goto L_0x01a6
            r10 = r8 & 147(0x93, float:2.06E-43)
            r12 = 146(0x92, float:2.05E-43)
            if (r10 == r12) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            r10 = 0
            goto L_0x01a8
        L_0x01a6:
            r10 = r16
        L_0x01a8:
            r12 = r6 & 1
            boolean r10 = r2.E(r10, r12)
            if (r10 == 0) goto L_0x0295
            if (r7 == 0) goto L_0x01b5
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01b7
        L_0x01b5:
            r7 = r40
        L_0x01b7:
            if (r11 == 0) goto L_0x01bc
            r10 = r16
            goto L_0x01be
        L_0x01bc:
            r10 = r41
        L_0x01be:
            r11 = 0
            if (r17 == 0) goto L_0x01c3
            r12 = r11
            goto L_0x01c5
        L_0x01c3:
            r12 = r42
        L_0x01c5:
            if (r19 == 0) goto L_0x01d0
            androidx.compose.ui.text.TextStyle$Companion r16 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r16 = r16.a()
            r34 = r16
            goto L_0x01d2
        L_0x01d0:
            r34 = r43
        L_0x01d2:
            if (r21 == 0) goto L_0x01dd
            androidx.compose.foundation.text.KeyboardOptions$Companion r16 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r16 = r16.b()
            r35 = r16
            goto L_0x01df
        L_0x01dd:
            r35 = r44
        L_0x01df:
            if (r23 == 0) goto L_0x01e4
            r36 = r11
            goto L_0x01e6
        L_0x01e4:
            r36 = r45
        L_0x01e6:
            if (r1 == 0) goto L_0x01ea
            r1 = r11
            goto L_0x01ec
        L_0x01ea:
            r1 = r46
        L_0x01ec:
            if (r3 == 0) goto L_0x01f0
            r3 = r11
            goto L_0x01f2
        L_0x01f0:
            r3 = r47
        L_0x01f2:
            if (r4 == 0) goto L_0x0200
            androidx.compose.ui.graphics.SolidColor r4 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r16 = androidx.compose.ui.graphics.Color.f15975b
            long r13 = r16.a()
            r4.<init>(r13, r11)
            goto L_0x0202
        L_0x0200:
            r4 = r48
        L_0x0202:
            if (r5 == 0) goto L_0x0205
            goto L_0x0207
        L_0x0205:
            r11 = r49
        L_0x0207:
            if (r0 == 0) goto L_0x0210
            androidx.compose.foundation.text.input.TextObfuscationMode$Companion r0 = androidx.compose.foundation.text.input.TextObfuscationMode.f6088b
            int r0 = r0.b()
            goto L_0x0212
        L_0x0210:
            r0 = r50
        L_0x0212:
            if (r9 == 0) goto L_0x0217
            r5 = 8226(0x2022, float:1.1527E-41)
            goto L_0x0219
        L_0x0217:
            r5 = r51
        L_0x0219:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0227
            java.lang.String r9 = "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:354)"
            r13 = 1399310985(0x5367ca89, float:9.9553542E11)
            androidx.compose.runtime.ComposerKt.Y(r13, r6, r8, r9)
        L_0x0227:
            r9 = r6 & 14
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r13 = r6 & 112(0x70, float:1.57E-43)
            r9 = r9 | r13
            r13 = r6 & 896(0x380, float:1.256E-42)
            r9 = r9 | r13
            int r13 = r6 << 3
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r13
            r9 = r9 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r13
            r9 = r9 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r13
            r9 = r9 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r13
            r9 = r9 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = r14 & r13
            r9 = r9 | r14
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r13 = r13 & r14
            r31 = r9 | r13
            int r6 = r6 >> 27
            r6 = r6 & 14
            int r8 = r8 << 3
            r9 = r8 & 112(0x70, float:1.57E-43)
            r6 = r6 | r9
            r9 = r8 & 896(0x380, float:1.256E-42)
            r6 = r6 | r9
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r32 = r6 | r8
            r33 = 0
            r19 = 0
            r16 = r39
            r17 = r7
            r18 = r10
            r20 = r12
            r21 = r34
            r22 = r35
            r23 = r36
            r24 = r1
            r25 = r3
            r26 = r4
            r27 = r11
            r28 = r0
            r29 = r5
            r30 = r2
            c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0289
            androidx.compose.runtime.ComposerKt.X()
        L_0x0289:
            r8 = r1
            r9 = r3
            r13 = r5
            r3 = r10
            r5 = r34
            r6 = r35
            r10 = r4
            r4 = r12
            r12 = r0
            goto L_0x02b0
        L_0x0295:
            r2.B()
            r7 = r40
            r3 = r41
            r4 = r42
            r5 = r43
            r6 = r44
            r36 = r45
            r8 = r46
            r9 = r47
            r10 = r48
            r11 = r49
            r12 = r50
            r13 = r51
        L_0x02b0:
            androidx.compose.runtime.ScopeUpdateScope r14 = r2.x()
            if (r14 == 0) goto L_0x02d2
            androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$5 r2 = new androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$5
            r0 = r2
            r1 = r39
            r37 = r2
            r2 = r7
            r7 = r36
            r38 = r14
            r14 = r53
            r15 = r54
            r16 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r37
            r0 = r38
            r0.a(r1)
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicSecureTextFieldKt.b(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.TextFieldDecorator, int, char, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.foundation.text.input.TextFieldState r37, androidx.compose.ui.Modifier r38, boolean r39, boolean r40, androidx.compose.foundation.text.input.InputTransformation r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.input.KeyboardActionHandler r44, kotlin.jvm.functions.Function2 r45, androidx.compose.foundation.interaction.MutableInteractionSource r46, androidx.compose.ui.graphics.Brush r47, androidx.compose.foundation.text.input.TextFieldDecorator r48, int r49, char r50, androidx.compose.runtime.Composer r51, int r52, int r53, int r54) {
        /*
            r0 = r48
            r15 = r52
            r14 = r53
            r13 = r54
            r1 = -817513499(0xffffffffcf45bbe5, float:-3.31742541E9)
            r2 = r51
            androidx.compose.runtime.Composer r2 = r2.q(r1)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r15 | 6
            r6 = r3
            r3 = r37
            goto L_0x002f
        L_0x001b:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r37
            boolean r6 = r2.W(r3)
            if (r6 == 0) goto L_0x0029
            r6 = 4
            goto L_0x002a
        L_0x0029:
            r6 = 2
        L_0x002a:
            r6 = r6 | r15
            goto L_0x002f
        L_0x002c:
            r3 = r37
            r6 = r15
        L_0x002f:
            r7 = r13 & 2
            if (r7 == 0) goto L_0x0038
            r6 = r6 | 48
        L_0x0035:
            r10 = r38
            goto L_0x004a
        L_0x0038:
            r10 = r15 & 48
            if (r10 != 0) goto L_0x0035
            r10 = r38
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x0047
            r11 = 32
            goto L_0x0049
        L_0x0047:
            r11 = 16
        L_0x0049:
            r6 = r6 | r11
        L_0x004a:
            r11 = r13 & 4
            if (r11 == 0) goto L_0x0053
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r5 = r39
            goto L_0x0066
        L_0x0053:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0050
            r5 = r39
            boolean r17 = r2.d(r5)
            if (r17 == 0) goto L_0x0062
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r6 = r6 | r17
        L_0x0066:
            r17 = r13 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L_0x0073
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r8 = r40
            goto L_0x0086
        L_0x0073:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0070
            r8 = r40
            boolean r21 = r2.d(r8)
            if (r21 == 0) goto L_0x0082
            r21 = r19
            goto L_0x0084
        L_0x0082:
            r21 = r18
        L_0x0084:
            r6 = r6 | r21
        L_0x0086:
            r21 = r13 & 16
            if (r21 == 0) goto L_0x008f
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x008c:
            r9 = r41
            goto L_0x00a2
        L_0x008f:
            r9 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x008c
            r9 = r41
            boolean r23 = r2.W(r9)
            if (r23 == 0) goto L_0x009e
            r23 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r23 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r6 = r6 | r23
        L_0x00a2:
            r23 = r13 & 32
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00ad
            r6 = r6 | r24
            r12 = r42
            goto L_0x00c0
        L_0x00ad:
            r24 = r15 & r24
            r12 = r42
            if (r24 != 0) goto L_0x00c0
            boolean r25 = r2.W(r12)
            if (r25 == 0) goto L_0x00bc
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r25 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r6 = r6 | r25
        L_0x00c0:
            r25 = r13 & 64
            r26 = 1572864(0x180000, float:2.204052E-39)
            if (r25 == 0) goto L_0x00cb
            r6 = r6 | r26
            r4 = r43
            goto L_0x00de
        L_0x00cb:
            r26 = r15 & r26
            r4 = r43
            if (r26 != 0) goto L_0x00de
            boolean r27 = r2.W(r4)
            if (r27 == 0) goto L_0x00da
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r6 = r6 | r27
        L_0x00de:
            r1 = r13 & 128(0x80, float:1.794E-43)
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00e9
            r6 = r6 | r28
            r3 = r44
            goto L_0x00fc
        L_0x00e9:
            r28 = r15 & r28
            r3 = r44
            if (r28 != 0) goto L_0x00fc
            boolean r28 = r2.W(r3)
            if (r28 == 0) goto L_0x00f8
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r6 = r6 | r28
        L_0x00fc:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x0107
            r6 = r6 | r28
            r4 = r45
            goto L_0x011a
        L_0x0107:
            r28 = r15 & r28
            r4 = r45
            if (r28 != 0) goto L_0x011a
            boolean r28 = r2.l(r4)
            if (r28 == 0) goto L_0x0116
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r6 = r6 | r28
        L_0x011a:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r28 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0125
            r6 = r6 | r28
            r5 = r46
            goto L_0x0138
        L_0x0125:
            r28 = r15 & r28
            r5 = r46
            if (r28 != 0) goto L_0x0138
            boolean r28 = r2.W(r5)
            if (r28 == 0) goto L_0x0134
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r6 = r6 | r28
        L_0x0138:
            r5 = r13 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0141
            r16 = r14 | 6
            r8 = r47
            goto L_0x0157
        L_0x0141:
            r28 = r14 & 6
            r8 = r47
            if (r28 != 0) goto L_0x0155
            boolean r28 = r2.W(r8)
            if (r28 == 0) goto L_0x0150
            r16 = 4
            goto L_0x0152
        L_0x0150:
            r16 = 2
        L_0x0152:
            r16 = r14 | r16
            goto L_0x0157
        L_0x0155:
            r16 = r14
        L_0x0157:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0160
            r16 = r16 | 48
        L_0x015d:
            r0 = r16
            goto L_0x017b
        L_0x0160:
            r28 = r14 & 48
            if (r28 != 0) goto L_0x015d
            r28 = r14 & 64
            if (r28 != 0) goto L_0x016d
            boolean r28 = r2.W(r0)
            goto L_0x0171
        L_0x016d:
            boolean r28 = r2.l(r0)
        L_0x0171:
            if (r28 == 0) goto L_0x0176
            r20 = 32
            goto L_0x0178
        L_0x0176:
            r20 = 16
        L_0x0178:
            r16 = r16 | r20
            goto L_0x015d
        L_0x017b:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0184
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0181:
            r10 = r49
            goto L_0x0197
        L_0x0184:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0181
            r10 = r49
            boolean r16 = r2.i(r10)
            if (r16 == 0) goto L_0x0193
            r24 = 256(0x100, float:3.59E-43)
            goto L_0x0195
        L_0x0193:
            r24 = 128(0x80, float:1.794E-43)
        L_0x0195:
            r0 = r0 | r24
        L_0x0197:
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01a0
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x019d:
            r12 = r50
            goto L_0x01b0
        L_0x01a0:
            r12 = r14 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x019d
            r12 = r50
            boolean r16 = r2.m(r12)
            if (r16 == 0) goto L_0x01ae
            r18 = r19
        L_0x01ae:
            r0 = r0 | r18
        L_0x01b0:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r6 & r16
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r13) goto L_0x01c3
            r12 = r0 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r12 == r13) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r12 = 0
            goto L_0x01c4
        L_0x01c3:
            r12 = 1
        L_0x01c4:
            r13 = r6 & 1
            boolean r12 = r2.E(r12, r13)
            if (r12 == 0) goto L_0x0369
            if (r7 == 0) goto L_0x01d1
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01d3
        L_0x01d1:
            r7 = r38
        L_0x01d3:
            if (r11 == 0) goto L_0x01d7
            r11 = 1
            goto L_0x01d9
        L_0x01d7:
            r11 = r39
        L_0x01d9:
            if (r17 == 0) goto L_0x01dd
            r12 = 0
            goto L_0x01df
        L_0x01dd:
            r12 = r40
        L_0x01df:
            r13 = 0
            if (r21 == 0) goto L_0x01e5
            r32 = r13
            goto L_0x01e7
        L_0x01e5:
            r32 = r41
        L_0x01e7:
            if (r23 == 0) goto L_0x01f2
            androidx.compose.ui.text.TextStyle$Companion r16 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r16 = r16.a()
            r33 = r16
            goto L_0x01f4
        L_0x01f2:
            r33 = r42
        L_0x01f4:
            if (r25 == 0) goto L_0x01ff
            androidx.compose.foundation.text.KeyboardOptions$Companion r16 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r16 = r16.b()
            r34 = r16
            goto L_0x0201
        L_0x01ff:
            r34 = r43
        L_0x0201:
            if (r1 == 0) goto L_0x0205
            r1 = r13
            goto L_0x0207
        L_0x0205:
            r1 = r44
        L_0x0207:
            if (r3 == 0) goto L_0x020b
            r3 = r13
            goto L_0x020d
        L_0x020b:
            r3 = r45
        L_0x020d:
            if (r4 == 0) goto L_0x0211
            r4 = r13
            goto L_0x0213
        L_0x0211:
            r4 = r46
        L_0x0213:
            if (r5 == 0) goto L_0x0221
            androidx.compose.ui.graphics.SolidColor r5 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r16 = androidx.compose.ui.graphics.Color.f15975b
            long r14 = r16.a()
            r5.<init>(r14, r13)
            goto L_0x0223
        L_0x0221:
            r5 = r47
        L_0x0223:
            if (r8 == 0) goto L_0x0227
            r8 = r13
            goto L_0x0229
        L_0x0227:
            r8 = r48
        L_0x0229:
            if (r9 == 0) goto L_0x0232
            androidx.compose.foundation.text.input.TextObfuscationMode$Companion r9 = androidx.compose.foundation.text.input.TextObfuscationMode.f6088b
            int r9 = r9.b()
            goto L_0x0234
        L_0x0232:
            r9 = r49
        L_0x0234:
            if (r10 == 0) goto L_0x0239
            r10 = 8226(0x2022, float:1.1527E-41)
            goto L_0x023b
        L_0x0239:
            r10 = r50
        L_0x023b:
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x0249
            java.lang.String r14 = "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:133)"
            r15 = -817513499(0xffffffffcf45bbe5, float:-3.31742541E9)
            androidx.compose.runtime.ComposerKt.Y(r15, r6, r0, r14)
        L_0x0249:
            java.lang.Character r6 = java.lang.Character.valueOf(r10)
            int r14 = r0 >> 9
            r14 = r14 & 14
            androidx.compose.runtime.State r6 = androidx.compose.runtime.SnapshotStateKt.p(r6, r2, r14)
            java.lang.Object r14 = r2.g()
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r15.a()
            if (r14 != r13) goto L_0x0269
            androidx.compose.foundation.text.SecureTextFieldController r14 = new androidx.compose.foundation.text.SecureTextFieldController
            r14.<init>(r6)
            r2.N(r14)
        L_0x0269:
            r13 = r14
            androidx.compose.foundation.text.SecureTextFieldController r13 = (androidx.compose.foundation.text.SecureTextFieldController) r13
            boolean r14 = r2.l(r13)
            r39 = r10
            java.lang.Object r10 = r2.g()
            if (r14 != 0) goto L_0x027e
            java.lang.Object r14 = r15.a()
            if (r10 != r14) goto L_0x0287
        L_0x027e:
            androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$1$1 r10 = new androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$1$1
            r14 = 0
            r10.<init>(r13, r14)
            r2.N(r10)
        L_0x0287:
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r14 = 0
            androidx.compose.runtime.EffectsKt.g(r13, r10, r2, r14)
            androidx.compose.foundation.text.input.TextObfuscationMode$Companion r10 = androidx.compose.foundation.text.input.TextObfuscationMode.f6088b
            int r14 = r10.b()
            boolean r14 = androidx.compose.foundation.text.input.TextObfuscationMode.e(r9, r14)
            r40 = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r14)
            boolean r16 = r2.d(r14)
            boolean r17 = r2.l(r13)
            r16 = r16 | r17
            r41 = r5
            java.lang.Object r5 = r2.g()
            r42 = r4
            if (r16 != 0) goto L_0x02b7
            java.lang.Object r4 = r15.a()
            if (r5 != r4) goto L_0x02c0
        L_0x02b7:
            androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$2$1 r5 = new androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$2$1
            r4 = 0
            r5.<init>(r14, r13, r4)
            r2.N(r5)
        L_0x02c0:
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r4 = 0
            androidx.compose.runtime.EffectsKt.g(r8, r5, r2, r4)
            r0 = r0 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            if (r0 != r4) goto L_0x02ce
            r0 = 1
            goto L_0x02cf
        L_0x02ce:
            r0 = 0
        L_0x02cf:
            java.lang.Object r4 = r2.g()
            if (r0 != 0) goto L_0x02db
            java.lang.Object r0 = r15.a()
            if (r4 != r0) goto L_0x02ff
        L_0x02db:
            int r0 = r10.b()
            boolean r0 = androidx.compose.foundation.text.input.TextObfuscationMode.e(r9, r0)
            if (r0 == 0) goto L_0x02ea
            androidx.compose.foundation.text.input.internal.CodepointTransformation r0 = r13.d()
            goto L_0x02fb
        L_0x02ea:
            int r0 = r10.a()
            boolean r0 = androidx.compose.foundation.text.input.TextObfuscationMode.e(r9, r0)
            if (r0 == 0) goto L_0x02fa
            androidx.compose.foundation.text.a r0 = new androidx.compose.foundation.text.a
            r0.<init>(r6)
            goto L_0x02fb
        L_0x02fa:
            r0 = 0
        L_0x02fb:
            r2.N(r0)
            r4 = r0
        L_0x02ff:
            r30 = r4
            androidx.compose.foundation.text.input.internal.CodepointTransformation r30 = (androidx.compose.foundation.text.input.internal.CodepointTransformation) r30
            androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1 r0 = androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.f5496z
            r4 = 0
            r5 = 1
            r6 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r7, r4, r0, r5, r6)
            androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2 r4 = androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2.f5497z
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.input.key.KeyInputModifierKt.b(r0, r4)
            if (r14 == 0) goto L_0x0319
            androidx.compose.ui.Modifier r4 = r13.e()
            goto L_0x031b
        L_0x0319:
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
        L_0x031b:
            androidx.compose.ui.Modifier r18 = r0.o0(r4)
            androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3 r0 = new androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
            r16 = r0
            r17 = r37
            r19 = r11
            r20 = r12
            r21 = r14
            r22 = r32
            r23 = r13
            r24 = r33
            r25 = r34
            r26 = r1
            r27 = r3
            r28 = r42
            r29 = r41
            r31 = r40
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r4 = 54
            r5 = 252521481(0xf0d2c09, float:6.9603176E-30)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r6, r0, r2, r4)
            r4 = 6
            e(r0, r2, r4)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0357
            androidx.compose.runtime.ComposerKt.X()
        L_0x0357:
            r14 = r39
            r10 = r42
            r8 = r1
            r13 = r9
            r4 = r12
            r5 = r32
            r6 = r33
            r12 = r40
            r9 = r3
            r3 = r11
            r11 = r41
            goto L_0x0386
        L_0x0369:
            r2.B()
            r7 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r34 = r43
            r8 = r44
            r9 = r45
            r10 = r46
            r11 = r47
            r12 = r48
            r13 = r49
            r14 = r50
        L_0x0386:
            androidx.compose.runtime.ScopeUpdateScope r15 = r2.x()
            if (r15 == 0) goto L_0x03a8
            androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$4 r2 = new androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$4
            r0 = r2
            r1 = r37
            r35 = r2
            r2 = r7
            r7 = r34
            r36 = r15
            r15 = r52
            r16 = r53
            r17 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r35
            r0 = r36
            r0.a(r1)
        L_0x03a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicSecureTextFieldKt.c(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.TextFieldDecorator, int, char, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final int d(State state, int i2, int i3) {
        return ((Character) state.getValue()).charValue();
    }

    public static final void e(Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1085555050);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1085555050, i3, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:305)");
            }
            TextToolbar textToolbar = (TextToolbar) q2.C(CompositionLocalsKt.r());
            boolean W = q2.W(textToolbar);
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1(textToolbar);
                q2.N(g2);
            }
            CompositionLocalKt.c(CompositionLocalsKt.r().d((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) g2), function2, q2, ((i3 << 3) & 112) | ProvidedValue.f14769i);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new BasicSecureTextFieldKt$DisableCutCopy$1(function2, i2));
        }
    }

    public static final InputTransformation h(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : InputTransformationKt.a(inputTransformation, inputTransformation2);
    }
}
