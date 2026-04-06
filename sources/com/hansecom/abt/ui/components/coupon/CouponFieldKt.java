package com.hansecom.abt.ui.components.coupon;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CouponFieldKt {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r154, java.lang.String r155, boolean r156, kotlin.jvm.functions.Function1 r157, kotlin.jvm.functions.Function0 r158, kotlin.jvm.functions.Function0 r159, androidx.compose.ui.Modifier r160, java.lang.String r161, java.lang.String r162, com.hansecom.abt.ui.components.abtButton.AbtButtonState r163, int r164, androidx.compose.foundation.text.KeyboardActions r165, androidx.compose.runtime.Composer r166, int r167, int r168, int r169) {
        /*
            r13 = r154
            r9 = r155
            r8 = r156
            r5 = r157
            r4 = r158
            r2 = r159
            r1 = r167
            r0 = r169
            r28 = 57344(0xe000, float:8.0356E-41)
            java.lang.String r3 = ""
            r12 = 8
            r14 = 128(0x80, float:1.794E-43)
            r15 = 256(0x100, float:3.59E-43)
            r16 = 32
            r17 = 16
            r18 = r3
            r3 = 6
            java.lang.String r6 = "value"
            kotlin.jvm.internal.Intrinsics.i(r13, r6)
            java.lang.String r6 = "buttonLabel"
            kotlin.jvm.internal.Intrinsics.i(r9, r6)
            java.lang.String r6 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            java.lang.String r6 = "onApply"
            kotlin.jvm.internal.Intrinsics.i(r4, r6)
            java.lang.String r6 = "onReset"
            kotlin.jvm.internal.Intrinsics.i(r2, r6)
            r6 = 1614834387(0x60406ad3, float:5.5460506E19)
            r11 = r166
            androidx.compose.runtime.Composer r11 = r11.q(r6)
            r6 = 1
            r22 = r0 & 1
            r23 = 2
            r6 = 4
            if (r22 == 0) goto L_0x004f
            r22 = r1 | 6
            goto L_0x0063
        L_0x004f:
            r22 = r1 & 6
            if (r22 != 0) goto L_0x0061
            boolean r22 = r11.W(r13)
            if (r22 == 0) goto L_0x005c
            r22 = r6
            goto L_0x005e
        L_0x005c:
            r22 = r23
        L_0x005e:
            r22 = r1 | r22
            goto L_0x0063
        L_0x0061:
            r22 = r1
        L_0x0063:
            r24 = r0 & 2
            if (r24 == 0) goto L_0x006c
            r22 = r22 | 48
        L_0x0069:
            r3 = r22
            goto L_0x007e
        L_0x006c:
            r24 = r1 & 48
            if (r24 != 0) goto L_0x0069
            boolean r24 = r11.W(r9)
            if (r24 == 0) goto L_0x0079
            r24 = r16
            goto L_0x007b
        L_0x0079:
            r24 = r17
        L_0x007b:
            r22 = r22 | r24
            goto L_0x0069
        L_0x007e:
            r22 = r0 & 4
            if (r22 == 0) goto L_0x0085
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0093
        L_0x0085:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0093
            boolean r6 = r11.d(r8)
            if (r6 == 0) goto L_0x0091
            r6 = r15
            goto L_0x0092
        L_0x0091:
            r6 = r14
        L_0x0092:
            r3 = r3 | r6
        L_0x0093:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x009a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x00aa
        L_0x009a:
            r6 = r1 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x00aa
            boolean r6 = r11.l(r5)
            if (r6 == 0) goto L_0x00a7
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x00a9
        L_0x00a7:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x00a9:
            r3 = r3 | r6
        L_0x00aa:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x00b1
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00c1
        L_0x00b1:
            r6 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x00c1
            boolean r6 = r11.l(r4)
            if (r6 == 0) goto L_0x00be
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00c0
        L_0x00be:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x00c0:
            r3 = r3 | r6
        L_0x00c1:
            r6 = r0 & 32
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L_0x00ca
            r3 = r3 | r24
            goto L_0x00da
        L_0x00ca:
            r6 = r1 & r24
            if (r6 != 0) goto L_0x00da
            boolean r6 = r11.l(r2)
            if (r6 == 0) goto L_0x00d7
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d9
        L_0x00d7:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00d9:
            r3 = r3 | r6
        L_0x00da:
            r6 = r0 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r6 == 0) goto L_0x00e5
            r3 = r3 | r24
            r12 = r160
            goto L_0x00f8
        L_0x00e5:
            r24 = r1 & r24
            r12 = r160
            if (r24 != 0) goto L_0x00f8
            boolean r25 = r11.W(r12)
            if (r25 == 0) goto L_0x00f4
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f6
        L_0x00f4:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00f6:
            r3 = r3 | r25
        L_0x00f8:
            r14 = r14 & r0
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            if (r14 == 0) goto L_0x0102
            r3 = r3 | r25
            r10 = r161
            goto L_0x0115
        L_0x0102:
            r26 = r1 & r25
            r10 = r161
            if (r26 != 0) goto L_0x0115
            boolean r27 = r11.W(r10)
            if (r27 == 0) goto L_0x0111
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0113
        L_0x0111:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x0113:
            r3 = r3 | r27
        L_0x0115:
            r15 = r15 & r0
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            if (r15 == 0) goto L_0x011f
            r3 = r3 | r27
            r7 = r162
            goto L_0x0132
        L_0x011f:
            r27 = r1 & r27
            r7 = r162
            if (r27 != 0) goto L_0x0132
            boolean r30 = r11.W(r7)
            if (r30 == 0) goto L_0x012e
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0130
        L_0x012e:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0130:
            r3 = r3 | r30
        L_0x0132:
            r4 = r0 & 512(0x200, float:7.175E-43)
            r27 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x013d
        L_0x0138:
            r3 = r3 | r27
        L_0x013a:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x014f
        L_0x013d:
            r27 = r1 & r27
            r1 = r163
            if (r27 != 0) goto L_0x013a
            boolean r27 = r11.W(r1)
            if (r27 == 0) goto L_0x014c
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0138
        L_0x014c:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0138
        L_0x014f:
            r1 = r1 & r0
            r26 = 6
            if (r1 == 0) goto L_0x0159
            r23 = r168 | 6
        L_0x0156:
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x016d
        L_0x0159:
            r27 = r168 & 6
            r5 = r164
            if (r27 != 0) goto L_0x016a
            boolean r26 = r11.i(r5)
            if (r26 == 0) goto L_0x0167
            r23 = 4
        L_0x0167:
            r23 = r168 | r23
            goto L_0x0156
        L_0x016a:
            r23 = r168
            goto L_0x0156
        L_0x016d:
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0175
            r23 = r23 | 48
        L_0x0172:
            r0 = r23
            goto L_0x0187
        L_0x0175:
            r20 = r168 & 48
            r0 = r165
            if (r20 != 0) goto L_0x0172
            boolean r20 = r11.W(r0)
            if (r20 == 0) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r16 = r17
        L_0x0184:
            r23 = r23 | r16
            goto L_0x0172
        L_0x0187:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r7 = r3 & r16
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r9) goto L_0x01ae
            r7 = r0 & 19
            r9 = 18
            if (r7 != r9) goto L_0x01ae
            boolean r7 = r11.t()
            if (r7 != 0) goto L_0x019e
            goto L_0x01ae
        L_0x019e:
            r11.B()
            r9 = r162
            r57 = r163
            r8 = r10
            r10 = r11
            r7 = r12
            r11 = r164
            r12 = r165
            goto L_0x0556
        L_0x01ae:
            if (r6 == 0) goto L_0x01b4
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            r9 = r6
            goto L_0x01b5
        L_0x01b4:
            r9 = r12
        L_0x01b5:
            if (r14 == 0) goto L_0x01ba
            r55 = r18
            goto L_0x01bc
        L_0x01ba:
            r55 = r10
        L_0x01bc:
            if (r15 == 0) goto L_0x01c1
            r56 = r18
            goto L_0x01c3
        L_0x01c1:
            r56 = r162
        L_0x01c3:
            if (r4 == 0) goto L_0x01ca
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r4 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            r57 = r4
            goto L_0x01cc
        L_0x01ca:
            r57 = r163
        L_0x01cc:
            if (r1 == 0) goto L_0x01d7
            androidx.compose.ui.text.input.ImeAction$Companion r1 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r1 = r1.b()
            r58 = r1
            goto L_0x01d9
        L_0x01d7:
            r58 = r164
        L_0x01d9:
            if (r5 == 0) goto L_0x01e4
            androidx.compose.foundation.text.KeyboardActions$Companion r1 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r1 = r1.a()
            r59 = r1
            goto L_0x01e6
        L_0x01e4:
            r59 = r165
        L_0x01e6:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01f4
            java.lang.String r1 = "com.hansecom.abt.ui.components.coupon.CouponField (CouponField.kt:48)"
            r4 = 1614834387(0x60406ad3, float:5.5460506E19)
            androidx.compose.runtime.ComposerKt.Y(r4, r3, r0, r1)
        L_0x01f4:
            if (r8 == 0) goto L_0x02a4
            r1 = 2118721904(0x7e492170, float:6.683711E37)
            r11.X(r1)
            androidx.compose.material3.OutlinedTextFieldDefaults r1 = androidx.compose.material3.OutlinedTextFieldDefaults.f10533a
            r4 = 6
            androidx.compose.material3.TextFieldColors r60 = r1.g(r11, r4)
            com.hansecom.abt.ui.theme.AbtTheme r1 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r1.b(r11, r4)
            long r69 = r5.w()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r1.b(r11, r4)
            long r71 = r5.w()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r1.b(r11, r4)
            long r61 = r5.n()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r1.b(r11, r4)
            long r90 = r5.n()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r1.b(r11, r4)
            long r98 = r5.n()
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.ui.graphics.Color.f15975b
            long r82 = r5.e()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r1.b(r11, r4)
            long r63 = r6.n()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r1.b(r11, r4)
            long r92 = r6.n()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r1.b(r11, r4)
            long r100 = r1.n()
            long r84 = r5.e()
            r147 = 2047(0x7ff, float:2.868E-42)
            r148 = 0
            r65 = 0
            r67 = 0
            r73 = 0
            r75 = 0
            r77 = 0
            r79 = 0
            r81 = 0
            r86 = 0
            r88 = 0
            r94 = 0
            r96 = 0
            r102 = 0
            r104 = 0
            r106 = 0
            r108 = 0
            r110 = 0
            r112 = 0
            r114 = 0
            r116 = 0
            r118 = 0
            r120 = 0
            r122 = 0
            r124 = 0
            r126 = 0
            r128 = 0
            r130 = 0
            r132 = 0
            r134 = 0
            r136 = 0
            r138 = 0
            r140 = 0
            r142 = 0
            r144 = 0
            r146 = -1677364(0xffffffffffe667cc, float:NaN)
            androidx.compose.material3.TextFieldColors r1 = androidx.compose.material3.TextFieldColors.d(r60, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r104, r106, r108, r110, r112, r114, r116, r118, r120, r122, r124, r126, r128, r130, r132, r134, r136, r138, r140, r142, r144, r146, r147, r148)
            r11.M()
        L_0x029f:
            r23 = r1
            r1 = 18
            goto L_0x02b5
        L_0x02a4:
            r1 = 2119503972(0x7e551064, float:7.0802667E37)
            r11.X(r1)
            com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldDefaults r1 = com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldDefaults.f38255a
            r4 = 6
            androidx.compose.material3.TextFieldColors r1 = r1.a(r11, r4)
            r11.M()
            goto L_0x029f
        L_0x02b5:
            int r5 = r3 >> 18
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r4 = r1.g()
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r7 = r6.k()
            r14 = 0
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.ColumnKt.a(r4, r7, r11, r14)
            int r7 = androidx.compose.runtime.ComposablesKt.a(r11, r14)
            androidx.compose.runtime.CompositionLocalMap r10 = r11.I()
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.ComposedModifierKt.e(r11, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r14 = r15.a()
            androidx.compose.runtime.Applier r16 = r11.v()
            if (r16 != 0) goto L_0x02e3
            androidx.compose.runtime.ComposablesKt.d()
        L_0x02e3:
            r11.s()
            boolean r16 = r11.n()
            if (r16 == 0) goto L_0x02f0
            r11.y(r14)
            goto L_0x02f3
        L_0x02f0:
            r11.K()
        L_0x02f3:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r11)
            r161 = r5
            kotlin.jvm.functions.Function2 r5 = r15.c()
            androidx.compose.runtime.Updater.g(r14, r4, r5)
            kotlin.jvm.functions.Function2 r4 = r15.e()
            androidx.compose.runtime.Updater.g(r14, r10, r4)
            kotlin.jvm.functions.Function2 r4 = r15.b()
            boolean r5 = r14.n()
            if (r5 != 0) goto L_0x031f
            java.lang.Object r5 = r14.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r10)
            if (r5 != 0) goto L_0x032d
        L_0x031f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r14.N(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r14.A(r5, r4)
        L_0x032d:
            kotlin.jvm.functions.Function2 r4 = r15.d()
            androidx.compose.runtime.Updater.g(r14, r12, r4)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r4 = 8
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r1 = r1.n(r4)
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.layout.IntrinsicSize r4 = androidx.compose.foundation.layout.IntrinsicSize.Max
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.IntrinsicKt.a(r5, r4)
            androidx.compose.ui.Alignment$Vertical r6 = r6.l()
            r7 = 6
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.RowKt.b(r1, r6, r11, r7)
            r14 = 0
            int r6 = androidx.compose.runtime.ComposablesKt.a(r11, r14)
            androidx.compose.runtime.CompositionLocalMap r7 = r11.I()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r11, r4)
            kotlin.jvm.functions.Function0 r10 = r15.a()
            androidx.compose.runtime.Applier r12 = r11.v()
            if (r12 != 0) goto L_0x036c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x036c:
            r11.s()
            boolean r12 = r11.n()
            if (r12 == 0) goto L_0x0379
            r11.y(r10)
            goto L_0x037c
        L_0x0379:
            r11.K()
        L_0x037c:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r11)
            kotlin.jvm.functions.Function2 r12 = r15.c()
            androidx.compose.runtime.Updater.g(r10, r1, r12)
            kotlin.jvm.functions.Function2 r1 = r15.e()
            androidx.compose.runtime.Updater.g(r10, r7, r1)
            kotlin.jvm.functions.Function2 r1 = r15.b()
            boolean r7 = r10.n()
            if (r7 != 0) goto L_0x03a6
            java.lang.Object r7 = r10.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r12)
            if (r7 != 0) goto L_0x03b4
        L_0x03a6:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10.N(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.A(r6, r1)
        L_0x03b4:
            kotlin.jvm.functions.Function2 r1 = r15.d()
            androidx.compose.runtime.Updater.g(r10, r4, r1)
            androidx.compose.foundation.layout.RowScopeInstance r16 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            int r1 = r56.length()
            if (r1 <= 0) goto L_0x03c6
            r40 = 1
            goto L_0x03c8
        L_0x03c6:
            r40 = r14
        L_0x03c8:
            com.hansecom.abt.ui.theme.AbtTheme r4 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r1 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r6 = r4.d(r11, r1)
            androidx.compose.ui.text.TextStyle r41 = r6.c()
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r5
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.RowScope.c(r16, r17, r18, r19, r20, r21)
            r1 = 0
            if (r8 == 0) goto L_0x03ed
            com.hansecom.abt.ui.components.coupon.ComposableSingletons$CouponFieldKt r6 = com.hansecom.abt.ui.components.coupon.ComposableSingletons$CouponFieldKt.f38110a
            kotlin.jvm.functions.Function2 r6 = r6.a()
            r42 = r6
            goto L_0x03ef
        L_0x03ed:
            r42 = r1
        L_0x03ef:
            r6 = 1776176983(0x69de4f57, float:3.3594525E25)
            r11.X(r6)
            if (r8 == 0) goto L_0x0409
            com.hansecom.abt.ui.components.coupon.CouponFieldKt$CouponField$1$1$1 r6 = new com.hansecom.abt.ui.components.coupon.CouponFieldKt$CouponField$1$1$1
            r6.<init>(r2)
            r7 = 54
            r10 = -1138352542(0xffffffffbc261e62, float:-0.01013908)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r12, r6, r11, r7)
            r43 = r6
            goto L_0x040c
        L_0x0409:
            r12 = 1
            r43 = r1
        L_0x040c:
            r11.M()
            androidx.compose.foundation.text.KeyboardOptions$Companion r6 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r30 = r6.a()
            androidx.compose.ui.text.input.KeyboardType$Companion r6 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r33 = r6.f()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r6 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r31 = r6.a()
            r38 = 114(0x72, float:1.6E-43)
            r39 = 0
            r32 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r34 = r58
            androidx.compose.foundation.text.KeyboardOptions r15 = androidx.compose.foundation.text.KeyboardOptions.d(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r6 = r3 & 14
            r7 = 6
            int r10 = r3 >> 6
            r10 = r10 & 112(0x70, float:1.57E-43)
            r6 = r6 | r10
            int r10 = r3 << 6
            r10 = r10 & r28
            r24 = r6 | r10
            int r0 = r0 << 15
            r6 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r6
            r25 = r0 | r25
            r26 = 0
            r27 = 3955912(0x3c5cc8, float:5.543413E-39)
            r0 = 0
            r29 = r3
            r10 = r7
            r3 = r0
            r6 = 0
            r0 = r12
            r12 = 4
            r7 = 0
            r17 = 0
            r10 = r17
            r160 = r11
            r11 = r17
            r12 = r17
            r14 = r17
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r154
            r1 = r157
            r2 = r16
            r149 = r4
            r4 = r156
            r150 = r161
            r151 = r5
            r5 = r41
            r8 = r42
            r60 = r9
            r9 = r43
            r13 = r40
            r16 = r59
            r22 = r23
            r23 = r160
            androidx.compose.material3.OutlinedTextFieldKt.g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r0 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r10 = r160
            r11 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r0 = r0.a(r10, r11)
            r1 = 0
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r2 = r0.e(r10, r1)
            r0 = 0
            r12 = r151
            r1 = 1
            r3 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.d(r12, r0, r1, r3)
            int r0 = r29 >> 12
            r0 = r0 & 14
            r0 = r0 | 48
            r3 = r150
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            int r3 = r29 << 9
            r3 = r3 & r28
            r8 = r0 | r3
            r9 = 96
            r5 = 0
            r0 = r158
            r3 = r57
            r4 = r155
            r7 = r10
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.T()
            int r0 = r56.length()
            if (r0 != 0) goto L_0x04d0
            r29 = r55
        L_0x04cd:
            r0 = r149
            goto L_0x04d3
        L_0x04d0:
            r29 = r56
            goto L_0x04cd
        L_0x04d3:
            com.hansecom.abt.ui.theme.typography.AbtTypography r1 = r0.d(r10, r11)
            androidx.compose.ui.text.TextStyle r50 = r1.d()
            int r1 = r56.length()
            if (r1 <= 0) goto L_0x04f4
            r1 = -1419990608(0xffffffffab5ca9b0, float:-7.839519E-13)
            r10.X(r1)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r10, r11)
            long r0 = r0.b()
        L_0x04ef:
            r10.M()
            r2 = 4
            goto L_0x0503
        L_0x04f4:
            r1 = -1419989581(0xffffffffab5cadb3, float:-7.8400757E-13)
            r10.X(r1)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r10, r11)
            long r0 = r0.a()
            goto L_0x04ef
        L_0x0503:
            float r2 = (float) r2
            float r32 = androidx.compose.ui.unit.Dp.m(r2)
            r35 = 13
            r36 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r30 = r12
            androidx.compose.ui.Modifier r30 = androidx.compose.foundation.layout.PaddingKt.m(r30, r31, r32, r33, r34, r35, r36)
            r53 = 0
            r54 = 131064(0x1fff8, float:1.8366E-40)
            r33 = 0
            r34 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r52 = 48
            r31 = r0
            r51 = r10
            androidx.compose.material3.TextKt.j(r29, r30, r31, r33, r34, r36, r37, r38, r39, r41, r42, r43, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r10.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x054c
            androidx.compose.runtime.ComposerKt.X()
        L_0x054c:
            r8 = r55
            r9 = r56
            r11 = r58
            r12 = r59
            r7 = r60
        L_0x0556:
            androidx.compose.runtime.ScopeUpdateScope r15 = r10.x()
            if (r15 == 0) goto L_0x0581
            com.hansecom.abt.ui.components.coupon.j r14 = new com.hansecom.abt.ui.components.coupon.j
            r0 = r14
            r1 = r154
            r2 = r155
            r3 = r156
            r4 = r157
            r5 = r158
            r6 = r159
            r10 = r57
            r13 = r167
            r152 = r14
            r14 = r168
            r153 = r15
            r15 = r169
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r152
            r0 = r153
            r0.a(r1)
        L_0x0581:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.coupon.CouponFieldKt.b(java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, com.hansecom.abt.ui.components.abtButton.AbtButtonState, int, androidx.compose.foundation.text.KeyboardActions, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit c(String str, String str2, boolean z2, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, String str3, String str4, AbtButtonState abtButtonState, int i2, KeyboardActions keyboardActions, int i3, int i4, int i5, Composer composer, int i6) {
        b(str, str2, z2, function1, function0, function02, modifier, str3, str4, abtButtonState, i2, keyboardActions, composer, RecomposeScopeImplKt.a(i3 | 1), RecomposeScopeImplKt.a(i4), i5);
        return Unit.f40552a;
    }
}
