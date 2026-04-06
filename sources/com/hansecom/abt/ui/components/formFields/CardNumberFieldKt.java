package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CardNumberFieldKt {
    /* JADX WARNING: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r28, kotlin.jvm.functions.Function1 r29, int r30, java.lang.String r31, java.lang.String r32, androidx.compose.ui.Modifier r33, java.lang.String r34, java.lang.String r35, boolean r36, int r37, androidx.compose.ui.focus.FocusRequester r38, androidx.compose.runtime.Composer r39, int r40, int r41, int r42) {
        /*
            r11 = r28
            r9 = r29
            r8 = r30
            r6 = r31
            r5 = r32
            r4 = r40
            r3 = r42
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "error"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            r0 = 665597654(0x27ac36d6, float:4.7799043E-15)
            r1 = r39
            androidx.compose.runtime.Composer r2 = r1.q(r0)
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0032
            r1 = r4 | 6
            goto L_0x0042
        L_0x0032:
            r1 = r4 & 6
            if (r1 != 0) goto L_0x0041
            boolean r1 = r2.W(r11)
            if (r1 == 0) goto L_0x003e
            r1 = 4
            goto L_0x003f
        L_0x003e:
            r1 = 2
        L_0x003f:
            r1 = r1 | r4
            goto L_0x0042
        L_0x0041:
            r1 = r4
        L_0x0042:
            r12 = r3 & 2
            if (r12 == 0) goto L_0x0049
            r1 = r1 | 48
            goto L_0x0059
        L_0x0049:
            r12 = r4 & 48
            if (r12 != 0) goto L_0x0059
            boolean r12 = r2.l(r9)
            if (r12 == 0) goto L_0x0056
            r12 = 32
            goto L_0x0058
        L_0x0056:
            r12 = 16
        L_0x0058:
            r1 = r1 | r12
        L_0x0059:
            r12 = r3 & 4
            if (r12 == 0) goto L_0x0060
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0070
        L_0x0060:
            r12 = r4 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0070
            boolean r12 = r2.i(r8)
            if (r12 == 0) goto L_0x006d
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r12 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r1 = r1 | r12
        L_0x0070:
            r12 = r3 & 8
            if (r12 == 0) goto L_0x0077
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0077:
            r12 = r4 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0087
            boolean r12 = r2.W(r6)
            if (r12 == 0) goto L_0x0084
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r1 = r1 | r12
        L_0x0087:
            r12 = r3 & 16
            if (r12 == 0) goto L_0x008e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008e:
            r12 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x009e
            boolean r12 = r2.W(r5)
            if (r12 == 0) goto L_0x009b
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r12
        L_0x009e:
            r12 = r3 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r12 == 0) goto L_0x00a8
            r1 = r1 | r13
        L_0x00a5:
            r13 = r33
            goto L_0x00b9
        L_0x00a8:
            r13 = r13 & r4
            if (r13 != 0) goto L_0x00a5
            r13 = r33
            boolean r14 = r2.W(r13)
            if (r14 == 0) goto L_0x00b6
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r14
        L_0x00b9:
            r14 = r3 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00c3
            r1 = r1 | r15
        L_0x00c0:
            r15 = r34
            goto L_0x00d5
        L_0x00c3:
            r15 = r15 & r4
            if (r15 != 0) goto L_0x00c0
            r15 = r34
            boolean r16 = r2.W(r15)
            if (r16 == 0) goto L_0x00d1
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r1 = r1 | r16
        L_0x00d5:
            r7 = r3 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r7 == 0) goto L_0x00e0
            r1 = r1 | r16
            r0 = r35
            goto L_0x00f3
        L_0x00e0:
            r16 = r4 & r16
            r0 = r35
            if (r16 != 0) goto L_0x00f3
            boolean r17 = r2.W(r0)
            if (r17 == 0) goto L_0x00ef
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r1 = r1 | r17
        L_0x00f3:
            r10 = r3 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r10 == 0) goto L_0x00fe
            r1 = r1 | r18
            r0 = r36
            goto L_0x0111
        L_0x00fe:
            r18 = r4 & r18
            r0 = r36
            if (r18 != 0) goto L_0x0111
            boolean r18 = r2.d(r0)
            if (r18 == 0) goto L_0x010d
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x010d:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010f:
            r1 = r1 | r18
        L_0x0111:
            r18 = 805306368(0x30000000, float:4.656613E-10)
            r19 = r4 & r18
            if (r19 != 0) goto L_0x012d
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0126
            r0 = r37
            boolean r19 = r2.i(r0)
            if (r19 == 0) goto L_0x0128
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x0126:
            r0 = r37
        L_0x0128:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012a:
            r1 = r1 | r19
            goto L_0x012f
        L_0x012d:
            r0 = r37
        L_0x012f:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0138
            r19 = r41 | 6
        L_0x0135:
            r5 = r19
            goto L_0x014e
        L_0x0138:
            r19 = r41 & 6
            r5 = r38
            if (r19 != 0) goto L_0x014c
            boolean r19 = r2.W(r5)
            if (r19 == 0) goto L_0x0147
            r19 = 4
            goto L_0x0149
        L_0x0147:
            r19 = 2
        L_0x0149:
            r19 = r41 | r19
            goto L_0x0135
        L_0x014c:
            r5 = r41
        L_0x014e:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r1 & r19
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r9) goto L_0x0175
            r6 = r5 & 3
            r9 = 2
            if (r6 != r9) goto L_0x0175
            boolean r6 = r2.t()
            if (r6 != 0) goto L_0x0164
            goto L_0x0175
        L_0x0164:
            r2.B()
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r25 = r2
            r6 = r13
            r7 = r15
            goto L_0x02a5
        L_0x0175:
            r2.p()
            r6 = r4 & 1
            r9 = 1
            if (r6 == 0) goto L_0x019d
            boolean r6 = r2.J()
            if (r6 == 0) goto L_0x0184
            goto L_0x019d
        L_0x0184:
            r2.B()
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x018f
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x018f:
            r6 = r35
            r22 = r36
            r23 = r37
            r24 = r38
            r20 = r13
            r21 = r15
            goto L_0x01fa
        L_0x019d:
            if (r12 == 0) goto L_0x01a2
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01a3
        L_0x01a2:
            r6 = r13
        L_0x01a3:
            if (r14 == 0) goto L_0x01a8
            java.lang.String r12 = ""
            goto L_0x01a9
        L_0x01a8:
            r12 = r15
        L_0x01a9:
            if (r7 == 0) goto L_0x01ad
            r7 = 0
            goto L_0x01af
        L_0x01ad:
            r7 = r35
        L_0x01af:
            if (r10 == 0) goto L_0x01b3
            r10 = r9
            goto L_0x01b5
        L_0x01b3:
            r10 = r36
        L_0x01b5:
            r13 = r3 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x01c8
            androidx.compose.foundation.text.KeyboardOptions$Companion r13 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r13 = r13.a()
            int r13 = r13.i()
            r14 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r14
            goto L_0x01ca
        L_0x01c8:
            r13 = r37
        L_0x01ca:
            if (r0 == 0) goto L_0x01f7
            r0 = 609994093(0x245bc56d, float:4.765528E-17)
            r2.X(r0)
            java.lang.Object r0 = r2.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r0 != r14) goto L_0x01e6
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r2.N(r0)
        L_0x01e6:
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.ui.focus.FocusRequester) r0
            r2.M()
            r24 = r0
        L_0x01ed:
            r20 = r6
            r6 = r7
            r22 = r10
            r21 = r12
            r23 = r13
            goto L_0x01fa
        L_0x01f7:
            r24 = r38
            goto L_0x01ed
        L_0x01fa:
            r2.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x020b
            java.lang.String r0 = "com.hansecom.abt.ui.components.formFields.CardNumberField (CardNumberField.kt:35)"
            r7 = 665597654(0x27ac36d6, float:4.7799043E-15)
            androidx.compose.runtime.ComposerKt.Y(r7, r1, r5, r0)
        L_0x020b:
            androidx.compose.ui.text.input.KeyboardType$Companion r0 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r16 = r0.d()
            r0 = 610006887(0x245bf767, float:4.7697613E-17)
            r2.X(r0)
            java.lang.Object r0 = r2.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r0 != r7) goto L_0x022b
            com.hansecom.abt.ui.components.formFields.CardNumberTransformation r0 = new com.hansecom.abt.ui.components.formFields.CardNumberTransformation
            r0.<init>(r8)
            r2.N(r0)
        L_0x022b:
            r13 = r0
            com.hansecom.abt.ui.components.formFields.CardNumberTransformation r13 = (com.hansecom.abt.ui.components.formFields.CardNumberTransformation) r13
            r2.M()
            com.hansecom.abt.ui.components.formFields.CardNumberFieldKt$CardNumberField$3 r0 = new com.hansecom.abt.ui.components.formFields.CardNumberFieldKt$CardNumberField$3
            r0.<init>(r6)
            r7 = 54
            r10 = 468019355(0x1be5689b, float:3.7952472E-22)
            androidx.compose.runtime.internal.ComposableLambda r14 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r9, r0, r2, r7)
            r0 = r1 & 14
            r0 = r0 | r18
            r7 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            int r7 = r1 >> 3
            r9 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 | r9
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r7
            r0 = r0 | r9
            r9 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r9
            r0 = r0 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            int r9 = r1 >> 6
            r7 = r7 & r9
            r0 = r0 | r7
            int r5 = r5 << 24
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r7
            r17 = r0 | r5
            int r0 = r1 >> 24
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 27648(0x6c00, float:3.8743E-41)
            r18 = r0
            r19 = 38016(0x9480, float:5.3272E-41)
            r7 = 0
            r10 = 0
            r12 = 0
            r15 = 0
            r0 = r28
            r1 = r29
            r25 = r2
            r2 = r31
            r3 = r32
            r4 = r20
            r5 = r21
            r26 = r6
            r6 = r22
            r8 = r24
            r9 = r16
            r11 = r23
            r16 = r25
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0299
            androidx.compose.runtime.ComposerKt.X()
        L_0x0299:
            r6 = r20
            r7 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r8 = r26
        L_0x02a5:
            androidx.compose.runtime.ScopeUpdateScope r15 = r25.x()
            if (r15 == 0) goto L_0x02c8
            com.hansecom.abt.ui.components.formFields.g r14 = new com.hansecom.abt.ui.components.formFields.g
            r0 = r14
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r12 = r40
            r13 = r41
            r27 = r14
            r14 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r27
            r15.a(r0)
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.formFields.CardNumberFieldKt.b(java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, boolean, int, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit c(String str, Function1 function1, int i2, String str2, String str3, Modifier modifier, String str4, String str5, boolean z2, int i3, FocusRequester focusRequester, int i4, int i5, int i6, Composer composer, int i7) {
        b(str, function1, i2, str2, str3, modifier, str4, str5, z2, i3, focusRequester, composer, RecomposeScopeImplKt.a(i4 | 1), RecomposeScopeImplKt.a(i5), i6);
        return Unit.f40552a;
    }
}
