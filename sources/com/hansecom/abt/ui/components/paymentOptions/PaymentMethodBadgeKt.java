package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class PaymentMethodBadgeKt {
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r27, long r28, long r30, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r2 = r27
            r3 = r34
            r0 = 8
            r1 = 2
            r4 = 6
            java.lang.String r5 = "label"
            kotlin.jvm.internal.Intrinsics.i(r2, r5)
            r5 = 2078927242(0x7be9e98a, float:2.4290838E36)
            r6 = r33
            androidx.compose.runtime.Composer r15 = r6.q(r5)
            r6 = r35 & 1
            r7 = 4
            if (r6 == 0) goto L_0x001e
            r6 = r3 | 6
            goto L_0x002e
        L_0x001e:
            r6 = r3 & 6
            if (r6 != 0) goto L_0x002d
            boolean r6 = r15.W(r2)
            if (r6 == 0) goto L_0x002a
            r6 = r7
            goto L_0x002b
        L_0x002a:
            r6 = r1
        L_0x002b:
            r6 = r6 | r3
            goto L_0x002e
        L_0x002d:
            r6 = r3
        L_0x002e:
            r1 = r35 & 2
            if (r1 == 0) goto L_0x0037
            r6 = r6 | 48
            r13 = r28
            goto L_0x0049
        L_0x0037:
            r1 = r3 & 48
            r13 = r28
            if (r1 != 0) goto L_0x0049
            boolean r1 = r15.j(r13)
            if (r1 == 0) goto L_0x0046
            r1 = 32
            goto L_0x0048
        L_0x0046:
            r1 = 16
        L_0x0048:
            r6 = r6 | r1
        L_0x0049:
            r1 = r35 & 4
            if (r1 == 0) goto L_0x0052
            r6 = r6 | 384(0x180, float:5.38E-43)
            r11 = r30
            goto L_0x0064
        L_0x0052:
            r1 = r3 & 384(0x180, float:5.38E-43)
            r11 = r30
            if (r1 != 0) goto L_0x0064
            boolean r1 = r15.j(r11)
            if (r1 == 0) goto L_0x0061
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r6 = r6 | r1
        L_0x0064:
            r1 = r35 & 8
            if (r1 == 0) goto L_0x006d
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r8 = r32
            goto L_0x007f
        L_0x006d:
            r8 = r3 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x006a
            r8 = r32
            boolean r9 = r15.W(r8)
            if (r9 == 0) goto L_0x007c
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r6 = r6 | r9
        L_0x007f:
            r9 = r6 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0094
            boolean r9 = r15.t()
            if (r9 != 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            r15.B()
            r6 = r8
            r26 = r15
            goto L_0x0191
        L_0x0094:
            if (r1 == 0) goto L_0x0099
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            goto L_0x009a
        L_0x0099:
            r1 = r8
        L_0x009a:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x00a6
            r8 = -1
            java.lang.String r9 = "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodBadge (PaymentMethodBadge.kt:23)"
            androidx.compose.runtime.ComposerKt.Y(r5, r6, r8, r9)
        L_0x00a6:
            float r5 = (float) r7
            float r7 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.foundation.shape.RoundedCornerShape r7 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r7)
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.draw.ClipKt.a(r1, r7)
            r7 = 2
            r16 = 0
            r17 = 0
            r9 = r28
            r11 = r17
            r12 = r7
            r13 = r16
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.BackgroundKt.b(r8, r9, r11, r12, r13)
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r8 = r8.o()
            r9 = 0
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.BoxKt.g(r8, r9)
            int r9 = androidx.compose.runtime.ComposablesKt.a(r15, r9)
            androidx.compose.runtime.CompositionLocalMap r10 = r15.I()
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.ComposedModifierKt.e(r15, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r12 = r11.a()
            androidx.compose.runtime.Applier r13 = r15.v()
            if (r13 != 0) goto L_0x00e9
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00e9:
            r15.s()
            boolean r13 = r15.n()
            if (r13 == 0) goto L_0x00f6
            r15.y(r12)
            goto L_0x00f9
        L_0x00f6:
            r15.K()
        L_0x00f9:
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r13 = r11.c()
            androidx.compose.runtime.Updater.g(r12, r8, r13)
            kotlin.jvm.functions.Function2 r8 = r11.e()
            androidx.compose.runtime.Updater.g(r12, r10, r8)
            kotlin.jvm.functions.Function2 r8 = r11.b()
            boolean r10 = r12.n()
            if (r10 != 0) goto L_0x0123
            java.lang.Object r10 = r12.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r13)
            if (r10 != 0) goto L_0x0131
        L_0x0123:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.N(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.A(r9, r8)
        L_0x0131:
            kotlin.jvm.functions.Function2 r8 = r11.d()
            androidx.compose.runtime.Updater.g(r12, r7, r8)
            androidx.compose.foundation.layout.BoxScopeInstance r7 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            com.hansecom.abt.ui.theme.AbtTheme r7 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r4 = r7.d(r15, r4)
            androidx.compose.ui.text.TextStyle r20 = r4.g()
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.j(r4, r0, r5)
            r25 = r1
            r1 = r0
            r0 = r6 & 14
            r0 = r0 | 48
            r4 = r6 & 896(0x380, float:1.256E-42)
            r22 = r0 | r4
            r23 = 0
            r24 = 65528(0xfff8, float:9.1824E-41)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = 0
            r26 = r15
            r15 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r27
            r2 = r30
            r21 = r26
            com.hansecom.abt.ui.components.AbtTextKt.c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r26.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x018f
            androidx.compose.runtime.ComposerKt.X()
        L_0x018f:
            r6 = r25
        L_0x0191:
            androidx.compose.runtime.ScopeUpdateScope r9 = r26.x()
            if (r9 == 0) goto L_0x01aa
            com.hansecom.abt.ui.components.paymentOptions.i r10 = new com.hansecom.abt.ui.components.paymentOptions.i
            r0 = r10
            r1 = r27
            r2 = r28
            r4 = r30
            r7 = r34
            r8 = r35
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r9.a(r10)
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.paymentOptions.PaymentMethodBadgeKt.b(java.lang.String, long, long, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(String str, long j2, long j3, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        b(str, j2, j3, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
