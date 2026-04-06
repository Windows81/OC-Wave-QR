package com.hansecom.abt.ui.components.googlePay;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class GooglePayButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r18, kotlin.jvm.functions.Function0 r19, androidx.compose.ui.Modifier r20, boolean r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r12 = r18
            r13 = r19
            r14 = r23
            java.lang.String r0 = "allowedPaymentMethods"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            r0 = -1802546633(0xffffffff948f5237, float:-1.4471738E-26)
            r1 = r22
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r24 & 1
            r2 = 4
            if (r1 == 0) goto L_0x0021
            r1 = r14 | 6
            goto L_0x0031
        L_0x0021:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0030
            boolean r1 = r15.W(r12)
            if (r1 == 0) goto L_0x002d
            r1 = r2
            goto L_0x002e
        L_0x002d:
            r1 = 2
        L_0x002e:
            r1 = r1 | r14
            goto L_0x0031
        L_0x0030:
            r1 = r14
        L_0x0031:
            r3 = r24 & 2
            if (r3 == 0) goto L_0x0038
            r1 = r1 | 48
            goto L_0x0048
        L_0x0038:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0048
            boolean r3 = r15.l(r13)
            if (r3 == 0) goto L_0x0045
            r3 = 32
            goto L_0x0047
        L_0x0045:
            r3 = 16
        L_0x0047:
            r1 = r1 | r3
        L_0x0048:
            r3 = r24 & 4
            if (r3 == 0) goto L_0x0051
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r4 = r20
            goto L_0x0063
        L_0x0051:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004e
            r4 = r20
            boolean r5 = r15.W(r4)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r5
        L_0x0063:
            r5 = r24 & 8
            if (r5 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r6 = r21
            goto L_0x007e
        L_0x006c:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0069
            r6 = r21
            boolean r7 = r15.d(r6)
            if (r7 == 0) goto L_0x007b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r7
        L_0x007e:
            r7 = r1 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x0092
            boolean r7 = r15.t()
            if (r7 != 0) goto L_0x008b
            goto L_0x0092
        L_0x008b:
            r15.B()
            r3 = r4
            r4 = r6
            goto L_0x0101
        L_0x0092:
            if (r3 == 0) goto L_0x0099
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            r16 = r3
            goto L_0x009b
        L_0x0099:
            r16 = r4
        L_0x009b:
            if (r5 == 0) goto L_0x00a1
            r3 = 1
            r17 = r3
            goto L_0x00a3
        L_0x00a1:
            r17 = r6
        L_0x00a3:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x00af
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.ui.components.googlePay.GooglePayButton (GooglePayButton.kt:21)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r3, r4)
        L_0x00af:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.theme.AbtBaseThemeKt.m()
            java.lang.Object r0 = r15.C(r0)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = (com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme) r0
            boolean r0 = r0.D()
            if (r0 == 0) goto L_0x00c3
            com.google.pay.button.ButtonTheme r0 = com.google.pay.button.ButtonTheme.Light
        L_0x00c1:
            r3 = r0
            goto L_0x00c6
        L_0x00c3:
            com.google.pay.button.ButtonTheme r0 = com.google.pay.button.ButtonTheme.Dark
            goto L_0x00c1
        L_0x00c6:
            com.google.pay.button.ButtonType r4 = com.google.pay.button.ButtonType.Pay
            float r0 = (float) r2
            float r5 = androidx.compose.ui.unit.Dp.m(r0)
            int r0 = r1 >> 3
            r0 = r0 & 14
            r2 = 221184(0x36000, float:3.09945E-40)
            r0 = r0 | r2
            int r2 = r1 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            int r1 = r1 << 9
            r2 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 384(0x180, float:5.38E-43)
            r7 = 0
            r8 = 0
            r0 = r19
            r1 = r18
            r2 = r16
            r6 = r17
            r9 = r15
            com.google.pay.button.PayButtonKt.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00fd
            androidx.compose.runtime.ComposerKt.X()
        L_0x00fd:
            r3 = r16
            r4 = r17
        L_0x0101:
            androidx.compose.runtime.ScopeUpdateScope r7 = r15.x()
            if (r7 == 0) goto L_0x0118
            com.hansecom.abt.ui.components.googlePay.e r8 = new com.hansecom.abt.ui.components.googlePay.e
            r0 = r8
            r1 = r18
            r2 = r19
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.googlePay.GooglePayButtonKt.b(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(String str, Function0 function0, Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        b(str, function0, modifier, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
