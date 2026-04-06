package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.focus.FocusRequester;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class PasswordOutlinedTextFieldKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(boolean r17, androidx.compose.ui.Modifier r18, kotlin.jvm.functions.Function0 r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r1 = r17
            r4 = r21
            r0 = -1719779254(0xffffffff997e404a, float:-1.3144475E-23)
            r2 = r20
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r22 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r4 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r4 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.d(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r4
            goto L_0x0024
        L_0x0023:
            r3 = r4
        L_0x0024:
            r5 = r22 & 2
            if (r5 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r6 = r18
            goto L_0x003f
        L_0x002d:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x002a
            r6 = r18
            boolean r7 = r2.W(r6)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
        L_0x003f:
            r7 = r22 & 4
            if (r7 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
            r15 = r19
            goto L_0x005a
        L_0x0048:
            r7 = r4 & 384(0x180, float:5.38E-43)
            r15 = r19
            if (r7 != 0) goto L_0x005a
            boolean r7 = r2.l(r15)
            if (r7 == 0) goto L_0x0057
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r7
        L_0x005a:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x006d
            boolean r7 = r2.t()
            if (r7 != 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            r2.B()
            r16 = r6
            goto L_0x00c1
        L_0x006d:
            if (r5 == 0) goto L_0x0074
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            r16 = r5
            goto L_0x0076
        L_0x0074:
            r16 = r6
        L_0x0076:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0082
            r5 = -1
            java.lang.String r6 = "com.hansecom.abt.ui.components.formFields.PasswordContentVisibilityToggle (PasswordOutlinedTextField.kt:57)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r5, r6)
        L_0x0082:
            if (r1 == 0) goto L_0x0087
            int r0 = com.hansecom.abt.R.drawable.D
            goto L_0x0089
        L_0x0087:
            int r0 = com.hansecom.abt.R.drawable.E
        L_0x0089:
            if (r1 == 0) goto L_0x008e
            int r5 = com.hansecom.abt.R.string.w7
            goto L_0x0090
        L_0x008e:
            int r5 = com.hansecom.abt.R.string.x7
        L_0x0090:
            com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt$PasswordContentVisibilityToggle$1 r6 = new com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt$PasswordContentVisibilityToggle$1
            r6.<init>(r0, r5)
            r0 = 54
            r5 = 1070657256(0x3fd0eee8, float:1.6322908)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r7, r6, r2, r0)
            int r0 = r3 >> 6
            r0 = r0 & 14
            r5 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r5
            r3 = r3 & 112(0x70, float:1.57E-43)
            r13 = r0 | r3
            r14 = 60
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r19
            r6 = r16
            r12 = r2
            androidx.compose.material3.IconButtonKt.e(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00c1
            androidx.compose.runtime.ComposerKt.X()
        L_0x00c1:
            androidx.compose.runtime.ScopeUpdateScope r6 = r2.x()
            if (r6 == 0) goto L_0x00da
            com.hansecom.abt.ui.components.formFields.T r7 = new com.hansecom.abt.ui.components.formFields.T
            r0 = r7
            r1 = r17
            r2 = r16
            r3 = r19
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt.d(boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit e(boolean z2, Modifier modifier, Function0 function0, int i2, int i3, Composer composer, int i4) {
        d(z2, modifier, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(java.lang.String r27, kotlin.jvm.functions.Function1 r28, boolean r29, kotlin.jvm.functions.Function0 r30, int r31, com.hansecom.abt.util.resourcesResolvers.StringValue r32, androidx.compose.ui.Modifier r33, java.lang.String r34, int r35, androidx.compose.foundation.text.KeyboardActions r36, int r37, androidx.compose.ui.focus.FocusRequester r38, androidx.compose.ui.autofill.ContentType r39, androidx.compose.runtime.Composer r40, int r41, int r42, int r43) {
        /*
            r13 = r27
            r12 = r28
            r11 = r30
            r10 = r32
            r9 = r41
            r8 = r42
            r7 = r43
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "visibilityChange"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "error"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = 1166671751(0x4589ff87, float:4415.941)
            r1 = r40
            androidx.compose.runtime.Composer r6 = r1.q(r0)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0032
            r1 = r9 | 6
            goto L_0x0042
        L_0x0032:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0041
            boolean r1 = r6.W(r13)
            if (r1 == 0) goto L_0x003e
            r1 = 4
            goto L_0x003f
        L_0x003e:
            r1 = 2
        L_0x003f:
            r1 = r1 | r9
            goto L_0x0042
        L_0x0041:
            r1 = r9
        L_0x0042:
            r4 = r7 & 2
            if (r4 == 0) goto L_0x0049
            r1 = r1 | 48
            goto L_0x0059
        L_0x0049:
            r4 = r9 & 48
            if (r4 != 0) goto L_0x0059
            boolean r4 = r6.l(r12)
            if (r4 == 0) goto L_0x0056
            r4 = 32
            goto L_0x0058
        L_0x0056:
            r4 = 16
        L_0x0058:
            r1 = r1 | r4
        L_0x0059:
            r4 = r7 & 4
            r16 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0064
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0061:
            r4 = r29
            goto L_0x0077
        L_0x0064:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0061
            r4 = r29
            boolean r17 = r6.d(r4)
            if (r17 == 0) goto L_0x0073
            r17 = r16
            goto L_0x0075
        L_0x0073:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0075:
            r1 = r1 | r17
        L_0x0077:
            r17 = r7 & 8
            if (r17 == 0) goto L_0x007e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007e:
            r2 = r9 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x008e
            boolean r2 = r6.l(r11)
            if (r2 == 0) goto L_0x008b
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r1 = r1 | r2
        L_0x008e:
            r2 = r7 & 16
            if (r2 == 0) goto L_0x0097
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0094:
            r2 = r31
            goto L_0x00aa
        L_0x0097:
            r2 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0094
            r2 = r31
            boolean r17 = r6.i(r2)
            if (r17 == 0) goto L_0x00a6
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r1 = r1 | r17
        L_0x00aa:
            r17 = r7 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00b3
            r1 = r1 | r18
            goto L_0x00c4
        L_0x00b3:
            r17 = r9 & r18
            if (r17 != 0) goto L_0x00c4
            boolean r17 = r6.W(r10)
            if (r17 == 0) goto L_0x00c0
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r1 = r1 | r17
        L_0x00c4:
            r17 = r7 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00cf
            r1 = r1 | r18
            r3 = r33
            goto L_0x00e2
        L_0x00cf:
            r18 = r9 & r18
            r3 = r33
            if (r18 != 0) goto L_0x00e2
            boolean r19 = r6.W(r3)
            if (r19 == 0) goto L_0x00de
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r1 = r1 | r19
        L_0x00e2:
            r5 = r7 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00ed
            r1 = r1 | r20
            r14 = r34
            goto L_0x0100
        L_0x00ed:
            r20 = r9 & r20
            r14 = r34
            if (r20 != 0) goto L_0x0100
            boolean r21 = r6.W(r14)
            if (r21 == 0) goto L_0x00fc
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r1 = r1 | r21
        L_0x0100:
            r15 = r7 & 256(0x100, float:3.59E-43)
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            if (r15 == 0) goto L_0x010b
            r1 = r1 | r22
            r0 = r35
            goto L_0x011e
        L_0x010b:
            r22 = r9 & r22
            r0 = r35
            if (r22 != 0) goto L_0x011e
            boolean r23 = r6.i(r0)
            if (r23 == 0) goto L_0x011a
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r1 = r1 | r23
        L_0x011e:
            r0 = r7 & 512(0x200, float:7.175E-43)
            r23 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0129
            r1 = r1 | r23
            r2 = r36
            goto L_0x013c
        L_0x0129:
            r23 = r9 & r23
            r2 = r36
            if (r23 != 0) goto L_0x013c
            boolean r23 = r6.W(r2)
            if (r23 == 0) goto L_0x0138
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r1 = r1 | r23
        L_0x013c:
            r2 = r7 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0145
            r18 = r8 | 6
            r3 = r37
            goto L_0x015b
        L_0x0145:
            r23 = r8 & 6
            r3 = r37
            if (r23 != 0) goto L_0x0159
            boolean r23 = r6.i(r3)
            if (r23 == 0) goto L_0x0154
            r18 = 4
            goto L_0x0156
        L_0x0154:
            r18 = 2
        L_0x0156:
            r18 = r8 | r18
            goto L_0x015b
        L_0x0159:
            r18 = r8
        L_0x015b:
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0164
            r18 = r18 | 48
        L_0x0161:
            r4 = r18
            goto L_0x0178
        L_0x0164:
            r23 = r8 & 48
            r4 = r38
            if (r23 != 0) goto L_0x0161
            boolean r23 = r6.W(r4)
            if (r23 == 0) goto L_0x0173
            r19 = 32
            goto L_0x0175
        L_0x0173:
            r19 = 16
        L_0x0175:
            r18 = r18 | r19
            goto L_0x0161
        L_0x0178:
            r9 = r7 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0181
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x017e:
            r7 = r39
            goto L_0x0192
        L_0x0181:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x017e
            r7 = r39
            boolean r18 = r6.l(r7)
            if (r18 == 0) goto L_0x018e
            goto L_0x0190
        L_0x018e:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0190:
            r4 = r4 | r16
        L_0x0192:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r7 = r1 & r16
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r8) goto L_0x01bd
            r7 = r4 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x01bd
            boolean r7 = r6.t()
            if (r7 != 0) goto L_0x01a9
            goto L_0x01bd
        L_0x01a9:
            r6.B()
            r7 = r33
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r13 = r39
            r22 = r6
            r8 = r14
            goto L_0x027c
        L_0x01bd:
            if (r17 == 0) goto L_0x01c4
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r17 = r7
            goto L_0x01c6
        L_0x01c4:
            r17 = r33
        L_0x01c6:
            if (r5 == 0) goto L_0x01cd
            java.lang.String r5 = ""
            r18 = r5
            goto L_0x01cf
        L_0x01cd:
            r18 = r14
        L_0x01cf:
            if (r15 == 0) goto L_0x01da
            androidx.compose.ui.text.input.ImeAction$Companion r5 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r5 = r5.b()
            r19 = r5
            goto L_0x01dc
        L_0x01da:
            r19 = r35
        L_0x01dc:
            if (r0 == 0) goto L_0x01e7
            androidx.compose.foundation.text.KeyboardActions$Companion r0 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r0 = r0.a()
            r20 = r0
            goto L_0x01e9
        L_0x01e7:
            r20 = r36
        L_0x01e9:
            if (r2 == 0) goto L_0x01f4
            androidx.compose.ui.text.input.KeyboardType$Companion r0 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r0 = r0.f()
            r21 = r0
            goto L_0x01f6
        L_0x01f4:
            r21 = r37
        L_0x01f6:
            if (r3 == 0) goto L_0x021a
            r0 = 1632292732(0x614acf7c, float:2.3382457E20)
            r6.X(r0)
            java.lang.Object r0 = r6.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0212
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r6.N(r0)
        L_0x0212:
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.ui.focus.FocusRequester) r0
            r6.M()
            r23 = r0
            goto L_0x021c
        L_0x021a:
            r23 = r38
        L_0x021c:
            if (r9 == 0) goto L_0x0222
            r0 = 0
            r24 = r0
            goto L_0x0224
        L_0x0222:
            r24 = r39
        L_0x0224:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0232
            java.lang.String r0 = "com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextField (PasswordOutlinedTextField.kt:84)"
            r2 = 1166671751(0x4589ff87, float:4415.941)
            androidx.compose.runtime.ComposerKt.Y(r2, r1, r4, r0)
        L_0x0232:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r2 = r1 >> 15
            r2 = r2 & 14
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r10, r0, r6, r2)
            r0 = 2147024894(0x7ff8fffe, float:NaN)
            r14 = r1 & r0
            r15 = r4 & 1022(0x3fe, float:1.432E-42)
            r16 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r22 = r6
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            r12 = r24
            r13 = r22
            g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x026e
            androidx.compose.runtime.ComposerKt.X()
        L_0x026e:
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = r23
            r13 = r24
        L_0x027c:
            androidx.compose.runtime.ScopeUpdateScope r15 = r22.x()
            if (r15 == 0) goto L_0x02a5
            com.hansecom.abt.ui.components.formFields.V r14 = new com.hansecom.abt.ui.components.formFields.V
            r0 = r14
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r25 = r14
            r14 = r41
            r26 = r15
            r15 = r42
            r16 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r25
            r0 = r26
            r0.a(r1)
        L_0x02a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt.f(java.lang.String, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function0, int, com.hansecom.abt.util.resourcesResolvers.StringValue, androidx.compose.ui.Modifier, java.lang.String, int, androidx.compose.foundation.text.KeyboardActions, int, androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.autofill.ContentType, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(java.lang.String r30, kotlin.jvm.functions.Function1 r31, boolean r32, kotlin.jvm.functions.Function0 r33, int r34, java.lang.String r35, androidx.compose.ui.Modifier r36, java.lang.String r37, int r38, androidx.compose.foundation.text.KeyboardActions r39, int r40, androidx.compose.ui.focus.FocusRequester r41, androidx.compose.ui.autofill.ContentType r42, androidx.compose.runtime.Composer r43, int r44, int r45, int r46) {
        /*
            r15 = r30
            r13 = r31
            r12 = r32
            r11 = r33
            r9 = r35
            r5 = r44
            r4 = r45
            r3 = r46
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "visibilityChange"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "error"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = -1812622948(0xffffffff93f5919c, float:-6.1990277E-27)
            r1 = r43
            androidx.compose.runtime.Composer r2 = r1.q(r0)
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0034
            r1 = r5 | 6
            goto L_0x0044
        L_0x0034:
            r1 = r5 & 6
            if (r1 != 0) goto L_0x0043
            boolean r1 = r2.W(r15)
            if (r1 == 0) goto L_0x0040
            r1 = 4
            goto L_0x0041
        L_0x0040:
            r1 = 2
        L_0x0041:
            r1 = r1 | r5
            goto L_0x0044
        L_0x0043:
            r1 = r5
        L_0x0044:
            r8 = r3 & 2
            if (r8 == 0) goto L_0x004b
            r1 = r1 | 48
            goto L_0x005b
        L_0x004b:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x005b
            boolean r8 = r2.l(r13)
            if (r8 == 0) goto L_0x0058
            r8 = 32
            goto L_0x005a
        L_0x0058:
            r8 = 16
        L_0x005a:
            r1 = r1 | r8
        L_0x005b:
            r8 = r3 & 4
            r16 = 128(0x80, float:1.794E-43)
            r17 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0066
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0076
        L_0x0066:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0076
            boolean r8 = r2.d(r12)
            if (r8 == 0) goto L_0x0073
            r8 = r17
            goto L_0x0075
        L_0x0073:
            r8 = r16
        L_0x0075:
            r1 = r1 | r8
        L_0x0076:
            r8 = r3 & 8
            if (r8 == 0) goto L_0x007d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x007d:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x008d
            boolean r8 = r2.l(r11)
            if (r8 == 0) goto L_0x008a
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r1 = r1 | r8
        L_0x008d:
            r8 = r3 & 16
            if (r8 == 0) goto L_0x0096
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0093:
            r8 = r34
            goto L_0x00a9
        L_0x0096:
            r8 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0093
            r8 = r34
            boolean r18 = r2.i(r8)
            if (r18 == 0) goto L_0x00a5
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r1 = r1 | r18
        L_0x00a9:
            r18 = r3 & 32
            r19 = 196608(0x30000, float:2.75506E-40)
            if (r18 == 0) goto L_0x00b2
            r1 = r1 | r19
            goto L_0x00c3
        L_0x00b2:
            r18 = r5 & r19
            if (r18 != 0) goto L_0x00c3
            boolean r18 = r2.W(r9)
            if (r18 == 0) goto L_0x00bf
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r1 = r1 | r18
        L_0x00c3:
            r18 = r3 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00ce
            r1 = r1 | r19
            r6 = r36
            goto L_0x00e1
        L_0x00ce:
            r19 = r5 & r19
            r6 = r36
            if (r19 != 0) goto L_0x00e1
            boolean r19 = r2.W(r6)
            if (r19 == 0) goto L_0x00dd
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r1 = r1 | r19
        L_0x00e1:
            r7 = r3 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r7 == 0) goto L_0x00ec
            r1 = r1 | r20
            r10 = r37
            goto L_0x00ff
        L_0x00ec:
            r21 = r5 & r20
            r10 = r37
            if (r21 != 0) goto L_0x00ff
            boolean r22 = r2.W(r10)
            if (r22 == 0) goto L_0x00fb
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fd
        L_0x00fb:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fd:
            r1 = r1 | r22
        L_0x00ff:
            r14 = r3 & 256(0x100, float:3.59E-43)
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            if (r14 == 0) goto L_0x010a
            r1 = r1 | r23
            r0 = r38
            goto L_0x011d
        L_0x010a:
            r23 = r5 & r23
            r0 = r38
            if (r23 != 0) goto L_0x011d
            boolean r24 = r2.i(r0)
            if (r24 == 0) goto L_0x0119
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x0119:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011b:
            r1 = r1 | r24
        L_0x011d:
            r0 = r3 & 512(0x200, float:7.175E-43)
            r24 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0128
            r1 = r1 | r24
            r5 = r39
            goto L_0x013b
        L_0x0128:
            r24 = r5 & r24
            r5 = r39
            if (r24 != 0) goto L_0x013b
            boolean r24 = r2.W(r5)
            if (r24 == 0) goto L_0x0137
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0137:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r1 = r1 | r24
        L_0x013b:
            r5 = r3 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0144
            r19 = r4 | 6
            r6 = r40
            goto L_0x015a
        L_0x0144:
            r24 = r4 & 6
            r6 = r40
            if (r24 != 0) goto L_0x0158
            boolean r24 = r2.i(r6)
            if (r24 == 0) goto L_0x0153
            r19 = 4
            goto L_0x0155
        L_0x0153:
            r19 = 2
        L_0x0155:
            r19 = r4 | r19
            goto L_0x015a
        L_0x0158:
            r19 = r4
        L_0x015a:
            r6 = r3 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0163
            r19 = r19 | 48
        L_0x0160:
            r8 = r19
            goto L_0x0177
        L_0x0163:
            r24 = r4 & 48
            r8 = r41
            if (r24 != 0) goto L_0x0160
            boolean r24 = r2.W(r8)
            if (r24 == 0) goto L_0x0172
            r21 = 32
            goto L_0x0174
        L_0x0172:
            r21 = 16
        L_0x0174:
            r19 = r19 | r21
            goto L_0x0160
        L_0x0177:
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0180
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x017d:
            r3 = r42
            goto L_0x0190
        L_0x0180:
            r3 = r4 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x017d
            r3 = r42
            boolean r19 = r2.l(r3)
            if (r19 == 0) goto L_0x018e
            r16 = r17
        L_0x018e:
            r8 = r8 | r16
        L_0x0190:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r1 & r16
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r4) goto L_0x01bb
            r3 = r8 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x01bb
            boolean r3 = r2.t()
            if (r3 != 0) goto L_0x01a7
            goto L_0x01bb
        L_0x01a7:
            r2.B()
            r7 = r36
            r9 = r38
            r11 = r40
            r12 = r41
            r13 = r42
            r20 = r2
            r8 = r10
            r10 = r39
            goto L_0x02d5
        L_0x01bb:
            if (r18 == 0) goto L_0x01c1
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            r4 = r3
            goto L_0x01c3
        L_0x01c1:
            r4 = r36
        L_0x01c3:
            if (r7 == 0) goto L_0x01ca
            java.lang.String r3 = ""
            r21 = r3
            goto L_0x01cc
        L_0x01ca:
            r21 = r10
        L_0x01cc:
            if (r14 == 0) goto L_0x01d7
            androidx.compose.ui.text.input.ImeAction$Companion r3 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r3 = r3.b()
            r22 = r3
            goto L_0x01d9
        L_0x01d7:
            r22 = r38
        L_0x01d9:
            if (r0 == 0) goto L_0x01e4
            androidx.compose.foundation.text.KeyboardActions$Companion r0 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r0 = r0.a()
            r24 = r0
            goto L_0x01e6
        L_0x01e4:
            r24 = r39
        L_0x01e6:
            if (r5 == 0) goto L_0x01f1
            androidx.compose.ui.text.input.KeyboardType$Companion r0 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r0 = r0.f()
            r25 = r0
            goto L_0x01f3
        L_0x01f1:
            r25 = r40
        L_0x01f3:
            if (r6 == 0) goto L_0x0216
            r0 = 1632233820(0x6149e95c, float:2.3278818E20)
            r2.X(r0)
            java.lang.Object r0 = r2.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r0 != r3) goto L_0x020f
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r2.N(r0)
        L_0x020f:
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.ui.focus.FocusRequester) r0
            r2.M()
            r5 = r0
            goto L_0x0218
        L_0x0216:
            r5 = r41
        L_0x0218:
            r0 = 0
            if (r9 == 0) goto L_0x021e
            r26 = r0
            goto L_0x0220
        L_0x021e:
            r26 = r42
        L_0x0220:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x022e
            java.lang.String r3 = "com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextField (PasswordOutlinedTextField.kt:35)"
            r6 = -1812622948(0xffffffff93f5919c, float:-6.1990277E-27)
            androidx.compose.runtime.ComposerKt.Y(r6, r1, r8, r3)
        L_0x022e:
            r3 = 1632237718(0x6149f896, float:2.3285675E20)
            r2.X(r3)
            java.lang.Object r3 = r2.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            r7 = 1
            if (r3 != r6) goto L_0x024a
            androidx.compose.ui.text.input.PasswordVisualTransformation r3 = new androidx.compose.ui.text.input.PasswordVisualTransformation
            r6 = 0
            r3.<init>(r6, r7, r0)
            r2.N(r3)
        L_0x024a:
            androidx.compose.ui.text.input.PasswordVisualTransformation r3 = (androidx.compose.ui.text.input.PasswordVisualTransformation) r3
            r2.M()
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.focus.FocusRequesterModifierKt.a(r4, r5)
            if (r12 == 0) goto L_0x025e
            androidx.compose.ui.text.input.VisualTransformation$Companion r0 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r0 = r0.c()
            r16 = r0
            goto L_0x0260
        L_0x025e:
            r16 = r3
        L_0x0260:
            com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt$PasswordOutlinedTextField$2 r0 = new com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt$PasswordOutlinedTextField$2
            r0.<init>(r12, r11)
            r3 = 54
            r6 = 431770487(0x19bc4b77, float:1.9469224E-23)
            androidx.compose.runtime.internal.ComposableLambda r14 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r7, r0, r2, r3)
            r0 = r1 & 14
            r0 = r0 | r20
            r3 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 >> 6
            r6 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            r6 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r6
            r0 = r0 | r3
            int r3 = r8 << 27
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r6
            r17 = r0 | r3
            int r0 = r1 >> 21
            r1 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = r8 << 9
            r3 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r3
            r18 = r0 | r1
            r19 = 1344(0x540, float:1.883E-42)
            r6 = 0
            r7 = 1
            r8 = 0
            r10 = 0
            r0 = r30
            r1 = r31
            r20 = r2
            r2 = r34
            r3 = r35
            r23 = r4
            r4 = r9
            r27 = r5
            r5 = r21
            r9 = r25
            r11 = r22
            r12 = r24
            r13 = r16
            r15 = r26
            r16 = r20
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02c7
            androidx.compose.runtime.ComposerKt.X()
        L_0x02c7:
            r8 = r21
            r9 = r22
            r7 = r23
            r10 = r24
            r11 = r25
            r13 = r26
            r12 = r27
        L_0x02d5:
            androidx.compose.runtime.ScopeUpdateScope r15 = r20.x()
            if (r15 == 0) goto L_0x02fe
            com.hansecom.abt.ui.components.formFields.U r14 = new com.hansecom.abt.ui.components.formFields.U
            r0 = r14
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r28 = r14
            r14 = r44
            r29 = r15
            r15 = r45
            r16 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r28
            r0 = r29
            r0.a(r1)
        L_0x02fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt.g(java.lang.String, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function0, int, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, int, androidx.compose.foundation.text.KeyboardActions, int, androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.autofill.ContentType, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit h(String str, Function1 function1, boolean z2, Function0 function0, int i2, String str2, Modifier modifier, String str3, int i3, KeyboardActions keyboardActions, int i4, FocusRequester focusRequester, ContentType contentType, int i5, int i6, int i7, Composer composer, int i8) {
        g(str, function1, z2, function0, i2, str2, modifier, str3, i3, keyboardActions, i4, focusRequester, contentType, composer, RecomposeScopeImplKt.a(i5 | 1), RecomposeScopeImplKt.a(i6), i7);
        return Unit.f40552a;
    }

    public static final Unit i(String str, Function1 function1, boolean z2, Function0 function0, int i2, StringValue stringValue, Modifier modifier, String str2, int i3, KeyboardActions keyboardActions, int i4, FocusRequester focusRequester, ContentType contentType, int i5, int i6, int i7, Composer composer, int i8) {
        f(str, function1, z2, function0, i2, stringValue, modifier, str2, i3, keyboardActions, i4, focusRequester, contentType, composer, RecomposeScopeImplKt.a(i5 | 1), RecomposeScopeImplKt.a(i6), i7);
        return Unit.f40552a;
    }
}
