package androidx.compose.material;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SecureTextFieldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final KeyboardOptions f8297a = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.f18852b.f(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 121, (DefaultConstructorMarker) null);

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.text.input.TextFieldState r69, androidx.compose.ui.Modifier r70, boolean r71, androidx.compose.ui.text.TextStyle r72, kotlin.jvm.functions.Function2 r73, kotlin.jvm.functions.Function2 r74, kotlin.jvm.functions.Function2 r75, kotlin.jvm.functions.Function2 r76, boolean r77, androidx.compose.foundation.text.input.InputTransformation r78, int r79, char r80, androidx.compose.foundation.text.KeyboardOptions r81, androidx.compose.foundation.text.input.KeyboardActionHandler r82, androidx.compose.ui.graphics.Shape r83, androidx.compose.material.TextFieldColors r84, androidx.compose.foundation.interaction.MutableInteractionSource r85, androidx.compose.runtime.Composer r86, int r87, int r88, int r89) {
        /*
            r15 = r87
            r14 = r88
            r13 = r89
            r0 = -1990728840(0xffffffff8957e378, float:-2.5986639E-33)
            r1 = r86
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r15 | 6
            r4 = r1
            r1 = r69
            goto L_0x002d
        L_0x0019:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r69
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r15
            goto L_0x002d
        L_0x002a:
            r1 = r69
            r4 = r15
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r8 = r70
            goto L_0x0048
        L_0x0036:
            r8 = r15 & 48
            if (r8 != 0) goto L_0x0033
            r8 = r70
            boolean r9 = r0.W(r8)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r4 = r4 | r9
        L_0x0048:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r12 = r71
            goto L_0x0064
        L_0x0051:
            r12 = r15 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004e
            r12 = r71
            boolean r16 = r0.d(r12)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r16
        L_0x0064:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L_0x0082
            r2 = r13 & 8
            if (r2 != 0) goto L_0x007b
            r2 = r72
            boolean r18 = r0.W(r2)
            if (r18 == 0) goto L_0x007d
            r18 = r16
            goto L_0x007f
        L_0x007b:
            r2 = r72
        L_0x007d:
            r18 = r17
        L_0x007f:
            r4 = r4 | r18
            goto L_0x0084
        L_0x0082:
            r2 = r72
        L_0x0084:
            r18 = r13 & 16
            r19 = 8192(0x2000, float:1.14794E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r18 == 0) goto L_0x0091
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r3 = r73
            goto L_0x00a4
        L_0x0091:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008e
            r3 = r73
            boolean r22 = r0.l(r3)
            if (r22 == 0) goto L_0x00a0
            r22 = r20
            goto L_0x00a2
        L_0x00a0:
            r22 = r19
        L_0x00a2:
            r4 = r4 | r22
        L_0x00a4:
            r22 = r13 & 32
            r23 = 65536(0x10000, float:9.18355E-41)
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r22 == 0) goto L_0x00b1
            r4 = r4 | r24
            r6 = r74
            goto L_0x00c4
        L_0x00b1:
            r25 = r15 & r24
            r6 = r74
            if (r25 != 0) goto L_0x00c4
            boolean r26 = r0.l(r6)
            if (r26 == 0) goto L_0x00c0
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r26 = r23
        L_0x00c2:
            r4 = r4 | r26
        L_0x00c4:
            r26 = r13 & 64
            r27 = 1572864(0x180000, float:2.204052E-39)
            if (r26 == 0) goto L_0x00cf
            r4 = r4 | r27
            r7 = r75
            goto L_0x00e2
        L_0x00cf:
            r28 = r15 & r27
            r7 = r75
            if (r28 != 0) goto L_0x00e2
            boolean r29 = r0.l(r7)
            if (r29 == 0) goto L_0x00de
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r4 = r4 | r29
        L_0x00e2:
            r10 = r13 & 128(0x80, float:1.794E-43)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00ed
            r4 = r4 | r30
            r11 = r76
            goto L_0x0100
        L_0x00ed:
            r30 = r15 & r30
            r11 = r76
            if (r30 != 0) goto L_0x0100
            boolean r31 = r0.l(r11)
            if (r31 == 0) goto L_0x00fc
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r4 = r4 | r31
        L_0x0100:
            r1 = r13 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010b
            r4 = r4 | r31
            r2 = r77
            goto L_0x011e
        L_0x010b:
            r31 = r15 & r31
            r2 = r77
            if (r31 != 0) goto L_0x011e
            boolean r31 = r0.d(r2)
            if (r31 == 0) goto L_0x011a
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r4 = r4 | r31
        L_0x011e:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r31 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0129
            r4 = r4 | r31
            r3 = r78
            goto L_0x013c
        L_0x0129:
            r31 = r15 & r31
            r3 = r78
            if (r31 != 0) goto L_0x013c
            boolean r31 = r0.W(r3)
            if (r31 == 0) goto L_0x0138
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r4 = r4 | r31
        L_0x013c:
            r31 = r14 & 6
            if (r31 != 0) goto L_0x0156
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x014f
            r3 = r79
            boolean r31 = r0.i(r3)
            if (r31 == 0) goto L_0x0151
            r21 = 4
            goto L_0x0153
        L_0x014f:
            r3 = r79
        L_0x0151:
            r21 = 2
        L_0x0153:
            r21 = r14 | r21
            goto L_0x015a
        L_0x0156:
            r3 = r79
            r21 = r14
        L_0x015a:
            r3 = r13 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0163
            r21 = r21 | 48
        L_0x0160:
            r6 = r21
            goto L_0x0177
        L_0x0163:
            r31 = r14 & 48
            r6 = r80
            if (r31 != 0) goto L_0x0160
            boolean r31 = r0.m(r6)
            if (r31 == 0) goto L_0x0172
            r28 = 32
            goto L_0x0174
        L_0x0172:
            r28 = 16
        L_0x0174:
            r21 = r21 | r28
            goto L_0x0160
        L_0x0177:
            r7 = r13 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0180
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017d:
            r8 = r81
            goto L_0x0193
        L_0x0180:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x017d
            r8 = r81
            boolean r21 = r0.W(r8)
            if (r21 == 0) goto L_0x018f
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x0191
        L_0x018f:
            r29 = 128(0x80, float:1.794E-43)
        L_0x0191:
            r6 = r6 | r29
        L_0x0193:
            r8 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x019c
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0199:
            r11 = r82
            goto L_0x01ad
        L_0x019c:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0199
            r11 = r82
            boolean r21 = r0.W(r11)
            if (r21 == 0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            r16 = r17
        L_0x01ab:
            r6 = r6 | r16
        L_0x01ad:
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01c5
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 != 0) goto L_0x01c0
            r11 = r83
            boolean r16 = r0.W(r11)
            if (r16 == 0) goto L_0x01c2
            r19 = r20
            goto L_0x01c2
        L_0x01c0:
            r11 = r83
        L_0x01c2:
            r6 = r6 | r19
            goto L_0x01c7
        L_0x01c5:
            r11 = r83
        L_0x01c7:
            r16 = r14 & r24
            r17 = 32768(0x8000, float:4.5918E-41)
            if (r16 != 0) goto L_0x01e2
            r16 = r13 & r17
            r11 = r84
            if (r16 != 0) goto L_0x01dd
            boolean r16 = r0.W(r11)
            if (r16 == 0) goto L_0x01dd
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01df
        L_0x01dd:
            r16 = r23
        L_0x01df:
            r6 = r6 | r16
            goto L_0x01e4
        L_0x01e2:
            r11 = r84
        L_0x01e4:
            r64 = r13 & r23
            if (r64 == 0) goto L_0x01ed
            r6 = r6 | r27
            r11 = r85
            goto L_0x0200
        L_0x01ed:
            r16 = r14 & r27
            r11 = r85
            if (r16 != 0) goto L_0x0200
            boolean r16 = r0.W(r11)
            if (r16 == 0) goto L_0x01fc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fe
        L_0x01fc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x01fe:
            r6 = r6 | r16
        L_0x0200:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r4 & r16
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r12) goto L_0x0216
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r6
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r11 == r12) goto L_0x0214
            goto L_0x0216
        L_0x0214:
            r11 = 0
            goto L_0x0217
        L_0x0216:
            r11 = 1
        L_0x0217:
            r12 = r4 & 1
            boolean r11 = r0.E(r11, r12)
            if (r11 == 0) goto L_0x04f6
            r0.p()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x0270
            boolean r11 = r0.J()
            if (r11 == 0) goto L_0x022d
            goto L_0x0270
        L_0x022d:
            r0.B()
            r1 = r13 & 8
            if (r1 == 0) goto L_0x0236
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0236:
            r1 = r13 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x023c
            r6 = r6 & -15
        L_0x023c:
            r1 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0244
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r1
        L_0x0244:
            r1 = r13 & r17
            if (r1 == 0) goto L_0x024c
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r1
        L_0x024c:
            r5 = r70
            r9 = r71
            r11 = r72
            r65 = r73
            r66 = r74
            r67 = r75
            r10 = r76
            r1 = r77
            r2 = r78
            r14 = r79
            r3 = r80
            r7 = r81
            r8 = r82
            r12 = r83
            r13 = r4
            r15 = r6
            r4 = r84
            r6 = r85
            goto L_0x0343
        L_0x0270:
            if (r5 == 0) goto L_0x0275
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0277
        L_0x0275:
            r5 = r70
        L_0x0277:
            if (r9 == 0) goto L_0x027b
            r9 = 1
            goto L_0x027d
        L_0x027b:
            r9 = r71
        L_0x027d:
            r11 = r13 & 8
            if (r11 == 0) goto L_0x028e
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.material.TextKt.f()
            java.lang.Object r11 = r0.C(r11)
            androidx.compose.ui.text.TextStyle r11 = (androidx.compose.ui.text.TextStyle) r11
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0290
        L_0x028e:
            r11 = r72
        L_0x0290:
            if (r18 == 0) goto L_0x0295
            r65 = 0
            goto L_0x0297
        L_0x0295:
            r65 = r73
        L_0x0297:
            if (r22 == 0) goto L_0x029c
            r66 = 0
            goto L_0x029e
        L_0x029c:
            r66 = r74
        L_0x029e:
            if (r26 == 0) goto L_0x02a3
            r67 = 0
            goto L_0x02a5
        L_0x02a3:
            r67 = r75
        L_0x02a5:
            if (r10 == 0) goto L_0x02a9
            r10 = 0
            goto L_0x02ab
        L_0x02a9:
            r10 = r76
        L_0x02ab:
            if (r1 == 0) goto L_0x02af
            r1 = 0
            goto L_0x02b1
        L_0x02af:
            r1 = r77
        L_0x02b1:
            if (r2 == 0) goto L_0x02b5
            r2 = 0
            goto L_0x02b7
        L_0x02b5:
            r2 = r78
        L_0x02b7:
            r14 = r13 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x02c4
            androidx.compose.foundation.text.input.TextObfuscationMode$Companion r14 = androidx.compose.foundation.text.input.TextObfuscationMode.f6088b
            int r14 = r14.b()
            r6 = r6 & -15
            goto L_0x02c6
        L_0x02c4:
            r14 = r79
        L_0x02c6:
            if (r3 == 0) goto L_0x02cb
            r3 = 8226(0x2022, float:1.1527E-41)
            goto L_0x02cd
        L_0x02cb:
            r3 = r80
        L_0x02cd:
            if (r7 == 0) goto L_0x02d2
            androidx.compose.foundation.text.KeyboardOptions r7 = f8297a
            goto L_0x02d4
        L_0x02d2:
            r7 = r81
        L_0x02d4:
            if (r8 == 0) goto L_0x02d8
            r8 = 0
            goto L_0x02da
        L_0x02d8:
            r8 = r82
        L_0x02da:
            r12 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x02ec
            androidx.compose.material.TextFieldDefaults r12 = androidx.compose.material.TextFieldDefaults.f8730a
            r70 = r1
            r1 = 6
            androidx.compose.ui.graphics.Shape r12 = r12.h(r0, r1)
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r1
            goto L_0x02f0
        L_0x02ec:
            r70 = r1
            r12 = r83
        L_0x02f0:
            r1 = r13 & r17
            if (r1 == 0) goto L_0x0335
            androidx.compose.material.TextFieldDefaults r16 = androidx.compose.material.TextFieldDefaults.f8730a
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r59 = r0
            androidx.compose.material.TextFieldColors r1 = r16.l(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r16
            goto L_0x0337
        L_0x0335:
            r1 = r84
        L_0x0337:
            r13 = r4
            r15 = r6
            if (r64 == 0) goto L_0x0340
            r6 = 0
        L_0x033c:
            r4 = r1
            r1 = r70
            goto L_0x0343
        L_0x0340:
            r6 = r85
            goto L_0x033c
        L_0x0343:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            r27 = r3
            if (r16 == 0) goto L_0x0359
            r3 = -1990728840(0xffffffff8957e378, float:-2.5986639E-33)
            r28 = r14
            java.lang.String r14 = "androidx.compose.material.OutlinedSecureTextField (SecureTextField.kt:244)"
            androidx.compose.runtime.ComposerKt.Y(r3, r13, r15, r14)
            goto L_0x035b
        L_0x0359:
            r28 = r14
        L_0x035b:
            if (r6 != 0) goto L_0x037c
            r3 = 345378573(0x14960f0d, float:1.5152066E-26)
            r0.X(r3)
            java.lang.Object r3 = r0.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r3 != r14) goto L_0x0376
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r0.N(r3)
        L_0x0376:
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r0.M()
            goto L_0x0386
        L_0x037c:
            r3 = 842424586(0x3236610a, float:1.0615858E-8)
            r0.X(r3)
            r0.M()
            r3 = r6
        L_0x0386:
            r14 = 842430332(0x3236777c, float:1.0620962E-8)
            r0.X(r14)
            long r16 = r11.h()
            r18 = 16
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 == 0) goto L_0x0399
        L_0x0396:
            r30 = r16
            goto L_0x03b2
        L_0x0399:
            int r14 = r13 >> 6
            r14 = r14 & 14
            int r16 = r15 >> 12
            r16 = r16 & 112(0x70, float:1.57E-43)
            r14 = r14 | r16
            androidx.compose.runtime.State r14 = r4.c(r9, r0, r14)
            java.lang.Object r14 = r14.getValue()
            androidx.compose.ui.graphics.Color r14 = (androidx.compose.ui.graphics.Color) r14
            long r16 = r14.v()
            goto L_0x0396
        L_0x03b2:
            r0.M()
            androidx.compose.ui.text.TextStyle r14 = new androidx.compose.ui.text.TextStyle
            r29 = r14
            r59 = 16777214(0xfffffe, float:2.3509884E-38)
            r60 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r29.<init>(r30, r32, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r46, r47, r48, r49, r50, r51, r53, r54, r55, r56, r57, r58, r59, r60)
            androidx.compose.ui.text.TextStyle r14 = r11.J(r14)
            r29 = r6
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r6 = r0.C(r6)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            if (r65 == 0) goto L_0x0435
            r30 = r11
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
            r31 = r8
            androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$1 r8 = androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$1.f8298z
            r32 = r7
            r7 = 1
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.semantics.SemanticsModifierKt.c(r11, r7, r8)
            r8 = r12
            long r11 = androidx.compose.material.OutlinedTextFieldKt.n()
            float r6 = r6.v(r11)
            r11 = 13
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r70 = r7
            r71 = r16
            r72 = r6
            r73 = r17
            r74 = r18
            r75 = r11
            r76 = r12
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.PaddingKt.m(r70, r71, r72, r73, r74, r75, r76)
            goto L_0x043e
        L_0x0435:
            r32 = r7
            r31 = r8
            r30 = r11
            r8 = r12
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
        L_0x043e:
            androidx.compose.ui.Modifier r6 = r5.o0(r6)
            androidx.compose.material.Strings$Companion r7 = androidx.compose.material.Strings.f8507b
            int r7 = r7.c()
            r11 = 6
            java.lang.String r7 = androidx.compose.material.Strings_androidKt.a(r7, r0, r11)
            androidx.compose.ui.Modifier r6 = androidx.compose.material.TextFieldImplKt.c(r6, r1, r7)
            androidx.compose.material.TextFieldDefaults r7 = androidx.compose.material.TextFieldDefaults.f8730a
            float r11 = r7.g()
            float r7 = r7.f()
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.a(r6, r11, r7)
            r71 = r6
            androidx.compose.ui.graphics.SolidColor r6 = new androidx.compose.ui.graphics.SolidColor
            r79 = r6
            int r7 = r13 >> 24
            r7 = r7 & 14
            int r11 = r15 >> 12
            r11 = r11 & 112(0x70, float:1.57E-43)
            r7 = r7 | r11
            androidx.compose.runtime.State r7 = r4.f(r1, r0, r7)
            java.lang.Object r7 = r7.getValue()
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r11 = r7.v()
            r7 = 0
            r6.<init>(r11, r7)
            androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$3 r16 = new androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$3
            r80 = r16
            r17 = r69
            r18 = r9
            r19 = r3
            r20 = r1
            r21 = r65
            r22 = r66
            r23 = r67
            r24 = r10
            r25 = r8
            r26 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = r13 & 910(0x38e, float:1.275E-42)
            int r7 = r13 >> 18
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r7
            int r7 = r15 << 9
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r7
            r6 = r6 | r11
            r11 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r11
            r6 = r6 | r7
            r84 = r6
            int r6 = r15 << 3
            r6 = r6 & 1008(0x3f0, float:1.413E-42)
            r85 = r6
            r6 = 128(0x80, float:1.794E-43)
            r86 = r6
            r6 = 0
            r77 = r6
            r70 = r69
            r72 = r9
            r73 = r2
            r74 = r14
            r75 = r32
            r76 = r31
            r78 = r3
            r81 = r28
            r82 = r27
            r83 = r0
            androidx.compose.foundation.text.BasicSecureTextFieldKt.b(r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x04db
            androidx.compose.runtime.ComposerKt.X()
        L_0x04db:
            r16 = r4
            r15 = r8
            r3 = r9
            r8 = r10
            r12 = r27
            r11 = r28
            r17 = r29
            r4 = r30
            r14 = r31
            r13 = r32
            r6 = r66
            r7 = r67
            r9 = r1
            r10 = r2
            r2 = r5
            r5 = r65
            goto L_0x0519
        L_0x04f6:
            r0.B()
            r2 = r70
            r3 = r71
            r4 = r72
            r5 = r73
            r6 = r74
            r7 = r75
            r8 = r76
            r9 = r77
            r10 = r78
            r11 = r79
            r12 = r80
            r13 = r81
            r14 = r82
            r15 = r83
            r16 = r84
            r17 = r85
        L_0x0519:
            androidx.compose.runtime.ScopeUpdateScope r1 = r0.x()
            if (r1 == 0) goto L_0x0537
            androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$4 r0 = new androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$4
            r70 = r0
            r68 = r1
            r1 = r69
            r18 = r87
            r19 = r88
            r20 = r89
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r70
            r0 = r68
            r0.a(r1)
        L_0x0537:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SecureTextFieldKt.a(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.foundation.text.input.InputTransformation, int, char, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.foundation.text.input.TextFieldState r69, androidx.compose.ui.Modifier r70, boolean r71, androidx.compose.ui.text.TextStyle r72, kotlin.jvm.functions.Function2 r73, kotlin.jvm.functions.Function2 r74, kotlin.jvm.functions.Function2 r75, kotlin.jvm.functions.Function2 r76, boolean r77, androidx.compose.foundation.text.input.InputTransformation r78, int r79, char r80, androidx.compose.foundation.text.KeyboardOptions r81, androidx.compose.foundation.text.input.KeyboardActionHandler r82, androidx.compose.ui.graphics.Shape r83, androidx.compose.material.TextFieldColors r84, androidx.compose.foundation.interaction.MutableInteractionSource r85, androidx.compose.runtime.Composer r86, int r87, int r88, int r89) {
        /*
            r15 = r87
            r14 = r88
            r13 = r89
            r0 = -454549898(0xffffffffe4e81e76, float:-3.4254717E22)
            r1 = r86
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r15 | 6
            r4 = r1
            r1 = r69
            goto L_0x002d
        L_0x0019:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r69
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r15
            goto L_0x002d
        L_0x002a:
            r1 = r69
            r4 = r15
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r8 = r70
            goto L_0x0048
        L_0x0036:
            r8 = r15 & 48
            if (r8 != 0) goto L_0x0033
            r8 = r70
            boolean r9 = r0.W(r8)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r4 = r4 | r9
        L_0x0048:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r12 = r71
            goto L_0x0064
        L_0x0051:
            r12 = r15 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004e
            r12 = r71
            boolean r16 = r0.d(r12)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r16
        L_0x0064:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L_0x0082
            r2 = r13 & 8
            if (r2 != 0) goto L_0x007b
            r2 = r72
            boolean r18 = r0.W(r2)
            if (r18 == 0) goto L_0x007d
            r18 = r16
            goto L_0x007f
        L_0x007b:
            r2 = r72
        L_0x007d:
            r18 = r17
        L_0x007f:
            r4 = r4 | r18
            goto L_0x0084
        L_0x0082:
            r2 = r72
        L_0x0084:
            r18 = r13 & 16
            r19 = 8192(0x2000, float:1.14794E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r18 == 0) goto L_0x0091
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r3 = r73
            goto L_0x00a4
        L_0x0091:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008e
            r3 = r73
            boolean r22 = r0.l(r3)
            if (r22 == 0) goto L_0x00a0
            r22 = r20
            goto L_0x00a2
        L_0x00a0:
            r22 = r19
        L_0x00a2:
            r4 = r4 | r22
        L_0x00a4:
            r22 = r13 & 32
            r23 = 65536(0x10000, float:9.18355E-41)
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r22 == 0) goto L_0x00b1
            r4 = r4 | r24
            r6 = r74
            goto L_0x00c4
        L_0x00b1:
            r25 = r15 & r24
            r6 = r74
            if (r25 != 0) goto L_0x00c4
            boolean r26 = r0.l(r6)
            if (r26 == 0) goto L_0x00c0
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r26 = r23
        L_0x00c2:
            r4 = r4 | r26
        L_0x00c4:
            r26 = r13 & 64
            r27 = 1572864(0x180000, float:2.204052E-39)
            if (r26 == 0) goto L_0x00cf
            r4 = r4 | r27
            r7 = r75
            goto L_0x00e2
        L_0x00cf:
            r28 = r15 & r27
            r7 = r75
            if (r28 != 0) goto L_0x00e2
            boolean r29 = r0.l(r7)
            if (r29 == 0) goto L_0x00de
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r4 = r4 | r29
        L_0x00e2:
            r10 = r13 & 128(0x80, float:1.794E-43)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00ed
            r4 = r4 | r30
            r11 = r76
            goto L_0x0100
        L_0x00ed:
            r30 = r15 & r30
            r11 = r76
            if (r30 != 0) goto L_0x0100
            boolean r31 = r0.l(r11)
            if (r31 == 0) goto L_0x00fc
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r4 = r4 | r31
        L_0x0100:
            r1 = r13 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010b
            r4 = r4 | r31
            r2 = r77
            goto L_0x011e
        L_0x010b:
            r31 = r15 & r31
            r2 = r77
            if (r31 != 0) goto L_0x011e
            boolean r31 = r0.d(r2)
            if (r31 == 0) goto L_0x011a
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r4 = r4 | r31
        L_0x011e:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r31 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0129
            r4 = r4 | r31
            r3 = r78
            goto L_0x013c
        L_0x0129:
            r31 = r15 & r31
            r3 = r78
            if (r31 != 0) goto L_0x013c
            boolean r31 = r0.W(r3)
            if (r31 == 0) goto L_0x0138
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r4 = r4 | r31
        L_0x013c:
            r31 = r14 & 6
            if (r31 != 0) goto L_0x0156
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x014f
            r3 = r79
            boolean r31 = r0.i(r3)
            if (r31 == 0) goto L_0x0151
            r21 = 4
            goto L_0x0153
        L_0x014f:
            r3 = r79
        L_0x0151:
            r21 = 2
        L_0x0153:
            r21 = r14 | r21
            goto L_0x015a
        L_0x0156:
            r3 = r79
            r21 = r14
        L_0x015a:
            r3 = r13 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0163
            r21 = r21 | 48
        L_0x0160:
            r6 = r21
            goto L_0x0177
        L_0x0163:
            r31 = r14 & 48
            r6 = r80
            if (r31 != 0) goto L_0x0160
            boolean r31 = r0.m(r6)
            if (r31 == 0) goto L_0x0172
            r28 = 32
            goto L_0x0174
        L_0x0172:
            r28 = 16
        L_0x0174:
            r21 = r21 | r28
            goto L_0x0160
        L_0x0177:
            r7 = r13 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0180
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017d:
            r8 = r81
            goto L_0x0193
        L_0x0180:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x017d
            r8 = r81
            boolean r21 = r0.W(r8)
            if (r21 == 0) goto L_0x018f
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x0191
        L_0x018f:
            r29 = 128(0x80, float:1.794E-43)
        L_0x0191:
            r6 = r6 | r29
        L_0x0193:
            r8 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x019c
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0199:
            r11 = r82
            goto L_0x01ad
        L_0x019c:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0199
            r11 = r82
            boolean r21 = r0.W(r11)
            if (r21 == 0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            r16 = r17
        L_0x01ab:
            r6 = r6 | r16
        L_0x01ad:
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01c5
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 != 0) goto L_0x01c0
            r11 = r83
            boolean r16 = r0.W(r11)
            if (r16 == 0) goto L_0x01c2
            r19 = r20
            goto L_0x01c2
        L_0x01c0:
            r11 = r83
        L_0x01c2:
            r6 = r6 | r19
            goto L_0x01c7
        L_0x01c5:
            r11 = r83
        L_0x01c7:
            r16 = r14 & r24
            r17 = 32768(0x8000, float:4.5918E-41)
            if (r16 != 0) goto L_0x01e2
            r16 = r13 & r17
            r11 = r84
            if (r16 != 0) goto L_0x01dd
            boolean r16 = r0.W(r11)
            if (r16 == 0) goto L_0x01dd
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01df
        L_0x01dd:
            r16 = r23
        L_0x01df:
            r6 = r6 | r16
            goto L_0x01e4
        L_0x01e2:
            r11 = r84
        L_0x01e4:
            r64 = r13 & r23
            if (r64 == 0) goto L_0x01ed
            r6 = r6 | r27
            r11 = r85
            goto L_0x0200
        L_0x01ed:
            r16 = r14 & r27
            r11 = r85
            if (r16 != 0) goto L_0x0200
            boolean r16 = r0.W(r11)
            if (r16 == 0) goto L_0x01fc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fe
        L_0x01fc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x01fe:
            r6 = r6 | r16
        L_0x0200:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r4 & r16
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            r16 = 1
            if (r11 != r12) goto L_0x0218
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r6
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r11 == r12) goto L_0x0216
            goto L_0x0218
        L_0x0216:
            r11 = 0
            goto L_0x021a
        L_0x0218:
            r11 = r16
        L_0x021a:
            r12 = r4 & 1
            boolean r11 = r0.E(r11, r12)
            if (r11 == 0) goto L_0x04d7
            r0.p()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x0273
            boolean r11 = r0.J()
            if (r11 == 0) goto L_0x0230
            goto L_0x0273
        L_0x0230:
            r0.B()
            r1 = r13 & 8
            if (r1 == 0) goto L_0x0239
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0239:
            r1 = r13 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x023f
            r6 = r6 & -15
        L_0x023f:
            r1 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0247
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r1
        L_0x0247:
            r1 = r13 & r17
            if (r1 == 0) goto L_0x024f
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r1
        L_0x024f:
            r5 = r70
            r9 = r71
            r11 = r72
            r65 = r73
            r66 = r74
            r67 = r75
            r10 = r76
            r1 = r77
            r2 = r78
            r12 = r79
            r3 = r80
            r7 = r81
            r8 = r82
            r27 = r85
            r13 = r4
            r14 = r6
            r4 = r83
            r6 = r84
            goto L_0x034f
        L_0x0273:
            if (r5 == 0) goto L_0x0278
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x027a
        L_0x0278:
            r5 = r70
        L_0x027a:
            if (r9 == 0) goto L_0x027f
            r9 = r16
            goto L_0x0281
        L_0x027f:
            r9 = r71
        L_0x0281:
            r11 = r13 & 8
            if (r11 == 0) goto L_0x0292
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.material.TextKt.f()
            java.lang.Object r11 = r0.C(r11)
            androidx.compose.ui.text.TextStyle r11 = (androidx.compose.ui.text.TextStyle) r11
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0294
        L_0x0292:
            r11 = r72
        L_0x0294:
            if (r18 == 0) goto L_0x0299
            r65 = 0
            goto L_0x029b
        L_0x0299:
            r65 = r73
        L_0x029b:
            if (r22 == 0) goto L_0x02a0
            r66 = 0
            goto L_0x02a2
        L_0x02a0:
            r66 = r74
        L_0x02a2:
            if (r26 == 0) goto L_0x02a7
            r67 = 0
            goto L_0x02a9
        L_0x02a7:
            r67 = r75
        L_0x02a9:
            if (r10 == 0) goto L_0x02ad
            r10 = 0
            goto L_0x02af
        L_0x02ad:
            r10 = r76
        L_0x02af:
            if (r1 == 0) goto L_0x02b3
            r1 = 0
            goto L_0x02b5
        L_0x02b3:
            r1 = r77
        L_0x02b5:
            if (r2 == 0) goto L_0x02b9
            r2 = 0
            goto L_0x02bb
        L_0x02b9:
            r2 = r78
        L_0x02bb:
            r12 = r13 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x02c8
            androidx.compose.foundation.text.input.TextObfuscationMode$Companion r12 = androidx.compose.foundation.text.input.TextObfuscationMode.f6088b
            int r12 = r12.b()
            r6 = r6 & -15
            goto L_0x02ca
        L_0x02c8:
            r12 = r79
        L_0x02ca:
            if (r3 == 0) goto L_0x02cf
            r3 = 8226(0x2022, float:1.1527E-41)
            goto L_0x02d1
        L_0x02cf:
            r3 = r80
        L_0x02d1:
            if (r7 == 0) goto L_0x02d6
            androidx.compose.foundation.text.KeyboardOptions r7 = f8297a
            goto L_0x02d8
        L_0x02d6:
            r7 = r81
        L_0x02d8:
            if (r8 == 0) goto L_0x02dc
            r8 = 0
            goto L_0x02de
        L_0x02dc:
            r8 = r82
        L_0x02de:
            r70 = r1
            r1 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x02f2
            androidx.compose.material.TextFieldDefaults r1 = androidx.compose.material.TextFieldDefaults.f8730a
            r71 = r2
            r2 = 6
            androidx.compose.ui.graphics.Shape r1 = r1.i(r0, r2)
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r2
            goto L_0x02f6
        L_0x02f2:
            r71 = r2
            r1 = r83
        L_0x02f6:
            r2 = r13 & r17
            if (r2 == 0) goto L_0x033b
            androidx.compose.material.TextFieldDefaults r16 = androidx.compose.material.TextFieldDefaults.f8730a
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r59 = r0
            androidx.compose.material.TextFieldColors r2 = r16.o(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r16
            goto L_0x033d
        L_0x033b:
            r2 = r84
        L_0x033d:
            if (r64 == 0) goto L_0x034a
            r13 = r4
            r14 = r6
            r27 = 0
        L_0x0343:
            r4 = r1
            r6 = r2
            r1 = r70
            r2 = r71
            goto L_0x034f
        L_0x034a:
            r27 = r85
            r13 = r4
            r14 = r6
            goto L_0x0343
        L_0x034f:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x0363
            r15 = -454549898(0xffffffffe4e81e76, float:-3.4254717E22)
            r28 = r3
            java.lang.String r3 = "androidx.compose.material.SecureTextField (SecureTextField.kt:121)"
            androidx.compose.runtime.ComposerKt.Y(r15, r13, r14, r3)
            goto L_0x0365
        L_0x0363:
            r28 = r3
        L_0x0365:
            if (r27 != 0) goto L_0x0386
            r3 = -86676725(0xfffffffffad56b0b, float:-5.5406516E35)
            r0.X(r3)
            java.lang.Object r3 = r0.g()
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r15.a()
            if (r3 != r15) goto L_0x0380
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r0.N(r3)
        L_0x0380:
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r0.M()
            goto L_0x0391
        L_0x0386:
            r3 = -1665364660(0xffffffff9cbc8d4c, float:-1.2477321E-21)
            r0.X(r3)
            r0.M()
            r3 = r27
        L_0x0391:
            r15 = -1665358914(0xffffffff9cbca3be, float:-1.2483123E-21)
            r0.X(r15)
            long r15 = r11.h()
            r17 = 16
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 == 0) goto L_0x03a4
        L_0x03a1:
            r30 = r15
            goto L_0x03bd
        L_0x03a4:
            int r15 = r13 >> 6
            r15 = r15 & 14
            int r16 = r14 >> 12
            r16 = r16 & 112(0x70, float:1.57E-43)
            r15 = r15 | r16
            androidx.compose.runtime.State r15 = r6.c(r9, r0, r15)
            java.lang.Object r15 = r15.getValue()
            androidx.compose.ui.graphics.Color r15 = (androidx.compose.ui.graphics.Color) r15
            long r15 = r15.v()
            goto L_0x03a1
        L_0x03bd:
            r0.M()
            androidx.compose.ui.text.TextStyle r15 = new androidx.compose.ui.text.TextStyle
            r29 = r15
            r59 = 16777214(0xfffffe, float:2.3509884E-38)
            r60 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r29.<init>(r30, r32, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r46, r47, r48, r49, r50, r51, r53, r54, r55, r56, r57, r58, r59, r60)
            androidx.compose.ui.text.TextStyle r15 = r11.J(r15)
            r74 = r15
            androidx.compose.material.TextFieldDefaults r15 = androidx.compose.material.TextFieldDefaults.f8730a
            r16 = 48
            r17 = 0
            r18 = 0
            r19 = 0
            r75 = r15
            r76 = r5
            r77 = r9
            r78 = r1
            r79 = r3
            r80 = r6
            r81 = r18
            r82 = r19
            r83 = r16
            r84 = r17
            r29 = r5
            androidx.compose.ui.Modifier r5 = androidx.compose.material.TextFieldDefaults.k(r75, r76, r77, r78, r79, r80, r81, r82, r83, r84)
            androidx.compose.material.Strings$Companion r16 = androidx.compose.material.Strings.f8507b
            r30 = r11
            int r11 = r16.c()
            r31 = r12
            r12 = 6
            java.lang.String r11 = androidx.compose.material.Strings_androidKt.a(r11, r0, r12)
            androidx.compose.ui.Modifier r5 = androidx.compose.material.TextFieldImplKt.c(r5, r1, r11)
            float r11 = r15.g()
            float r12 = r15.f()
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.a(r5, r11, r12)
            r71 = r5
            androidx.compose.ui.graphics.SolidColor r5 = new androidx.compose.ui.graphics.SolidColor
            r79 = r5
            int r11 = r13 >> 24
            r11 = r11 & 14
            int r12 = r14 >> 12
            r12 = r12 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            androidx.compose.runtime.State r11 = r6.f(r1, r0, r11)
            java.lang.Object r11 = r11.getValue()
            androidx.compose.ui.graphics.Color r11 = (androidx.compose.ui.graphics.Color) r11
            long r11 = r11.v()
            r15 = 0
            r5.<init>(r11, r15)
            androidx.compose.material.SecureTextFieldKt$SecureTextField$1 r16 = new androidx.compose.material.SecureTextFieldKt$SecureTextField$1
            r80 = r16
            r17 = r69
            r18 = r9
            r19 = r3
            r20 = r1
            r21 = r65
            r22 = r66
            r23 = r67
            r24 = r10
            r25 = r4
            r26 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5 = r13 & 910(0x38e, float:1.275E-42)
            int r11 = r13 >> 18
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r11
            int r11 = r14 << 9
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r11
            r5 = r5 | r12
            r12 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r12
            r5 = r5 | r11
            r84 = r5
            int r5 = r14 << 3
            r5 = r5 & 1008(0x3f0, float:1.413E-42)
            r85 = r5
            r5 = 128(0x80, float:1.794E-43)
            r86 = r5
            r5 = 0
            r77 = r5
            r70 = r69
            r72 = r9
            r73 = r2
            r75 = r7
            r76 = r8
            r78 = r3
            r81 = r31
            r82 = r28
            r83 = r0
            androidx.compose.foundation.text.BasicSecureTextFieldKt.b(r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x04bd
            androidx.compose.runtime.ComposerKt.X()
        L_0x04bd:
            r15 = r4
            r16 = r6
            r13 = r7
            r14 = r8
            r3 = r9
            r8 = r10
            r17 = r27
            r12 = r28
            r4 = r30
            r11 = r31
            r5 = r65
            r6 = r66
            r7 = r67
            r9 = r1
            r10 = r2
            r2 = r29
            goto L_0x04fa
        L_0x04d7:
            r0.B()
            r2 = r70
            r3 = r71
            r4 = r72
            r5 = r73
            r6 = r74
            r7 = r75
            r8 = r76
            r9 = r77
            r10 = r78
            r11 = r79
            r12 = r80
            r13 = r81
            r14 = r82
            r15 = r83
            r16 = r84
            r17 = r85
        L_0x04fa:
            androidx.compose.runtime.ScopeUpdateScope r1 = r0.x()
            if (r1 == 0) goto L_0x0518
            androidx.compose.material.SecureTextFieldKt$SecureTextField$2 r0 = new androidx.compose.material.SecureTextFieldKt$SecureTextField$2
            r70 = r0
            r68 = r1
            r1 = r69
            r18 = r87
            r19 = r88
            r20 = r89
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r70
            r0 = r68
            r0.a(r1)
        L_0x0518:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SecureTextFieldKt.b(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.foundation.text.input.InputTransformation, int, char, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
