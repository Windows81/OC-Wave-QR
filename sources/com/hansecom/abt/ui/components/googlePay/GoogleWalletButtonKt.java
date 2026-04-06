package com.hansecom.abt.ui.components.googlePay;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class GoogleWalletButtonKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(kotlin.jvm.functions.Function0 r24, androidx.compose.ui.Modifier r25, boolean r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r1 = r24
            r4 = r28
            r0 = 2
            r2 = 48
            java.lang.String r3 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r1, r3)
            r3 = 892845186(0x3537bc82, float:6.844713E-7)
            r5 = r27
            androidx.compose.runtime.Composer r15 = r5.q(r3)
            r5 = 1
            r6 = r29 & 1
            r7 = 4
            if (r6 == 0) goto L_0x001e
            r6 = r4 | 6
            goto L_0x002e
        L_0x001e:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x002d
            boolean r6 = r15.l(r1)
            if (r6 == 0) goto L_0x002a
            r6 = r7
            goto L_0x002b
        L_0x002a:
            r6 = r0
        L_0x002b:
            r6 = r6 | r4
            goto L_0x002e
        L_0x002d:
            r6 = r4
        L_0x002e:
            r0 = r29 & 2
            if (r0 == 0) goto L_0x0036
            r6 = r6 | r2
        L_0x0033:
            r8 = r25
            goto L_0x0048
        L_0x0036:
            r8 = r4 & 48
            if (r8 != 0) goto L_0x0033
            r8 = r25
            boolean r9 = r15.W(r8)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r6 = r6 | r9
        L_0x0048:
            r9 = r29 & 4
            if (r9 == 0) goto L_0x0051
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r10 = r26
            goto L_0x0063
        L_0x0051:
            r10 = r4 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004e
            r10 = r26
            boolean r11 = r15.d(r10)
            if (r11 == 0) goto L_0x0060
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r6 = r6 | r11
        L_0x0063:
            r11 = r6 & 147(0x93, float:2.06E-43)
            r12 = 146(0x92, float:2.05E-43)
            if (r11 != r12) goto L_0x0077
            boolean r11 = r15.t()
            if (r11 != 0) goto L_0x0070
            goto L_0x0077
        L_0x0070:
            r15.B()
            r2 = r8
            r3 = r10
            goto L_0x01ca
        L_0x0077:
            if (r0 == 0) goto L_0x007c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x007d
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r9 == 0) goto L_0x0082
            r23 = r5
            goto L_0x0084
        L_0x0082:
            r23 = r10
        L_0x0084:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0090
            r8 = -1
            java.lang.String r9 = "com.hansecom.abt.ui.components.googlePay.GoogleWalletButton (GoogleWalletButton.kt:30)"
            androidx.compose.runtime.ComposerKt.Y(r3, r6, r8, r9)
        L_0x0090:
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r8 = r3.e()
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.i(r0, r2)
            r9 = 24
            float r9 = (float) r9
            float r10 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.foundation.shape.RoundedCornerShape r10 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r10)
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.draw.ClipKt.a(r2, r10)
            if (r23 == 0) goto L_0x00b3
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b5
        L_0x00b3:
            r10 = 1056964608(0x3f000000, float:0.5)
        L_0x00b5:
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.draw.AlphaKt.a(r2, r10)
            r10 = 4280229663(0xff1f1f1f, double:2.114714433E-314)
            long r17 = androidx.compose.ui.graphics.ColorKt.d(r10)
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.BackgroundKt.b(r16, r17, r19, r20, r21)
            float r10 = (float) r5
            float r10 = androidx.compose.ui.unit.Dp.m(r10)
            r11 = 4285822837(0xff747775, double:2.117477828E-314)
            long r11 = androidx.compose.ui.graphics.ColorKt.d(r11)
            float r13 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.foundation.shape.RoundedCornerShape r13 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r13)
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.BorderKt.f(r2, r10, r11, r13)
            r2 = 753904976(0x2cefad50, float:6.81203E-12)
            r15.X(r2)
            r2 = r6 & 14
            r6 = 0
            if (r2 != r7) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r5 = r6
        L_0x00f3:
            java.lang.Object r2 = r15.g()
            if (r5 != 0) goto L_0x0101
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r2 != r5) goto L_0x0109
        L_0x0101:
            com.hansecom.abt.ui.components.googlePay.f r2 = new com.hansecom.abt.ui.components.googlePay.f
            r2.<init>(r1)
            r15.N(r2)
        L_0x0109:
            r20 = r2
            kotlin.jvm.functions.Function0 r20 = (kotlin.jvm.functions.Function0) r20
            r15.M()
            r21 = 6
            r22 = 0
            r18 = 0
            r19 = 0
            r17 = r23
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ClickableKt.f(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.BoxKt.g(r8, r6)
            int r7 = androidx.compose.runtime.ComposablesKt.a(r15, r6)
            androidx.compose.runtime.CompositionLocalMap r8 = r15.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r15, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r11 = r10.a()
            androidx.compose.runtime.Applier r12 = r15.v()
            if (r12 != 0) goto L_0x013d
            androidx.compose.runtime.ComposablesKt.d()
        L_0x013d:
            r15.s()
            boolean r12 = r15.n()
            if (r12 == 0) goto L_0x014a
            r15.y(r11)
            goto L_0x014d
        L_0x014a:
            r15.K()
        L_0x014d:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r12 = r10.c()
            androidx.compose.runtime.Updater.g(r11, r5, r12)
            kotlin.jvm.functions.Function2 r5 = r10.e()
            androidx.compose.runtime.Updater.g(r11, r8, r5)
            kotlin.jvm.functions.Function2 r5 = r10.b()
            boolean r8 = r11.n()
            if (r8 != 0) goto L_0x0177
            java.lang.Object r8 = r11.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r12)
            if (r8 != 0) goto L_0x0185
        L_0x0177:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11.N(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.A(r7, r5)
        L_0x0185:
            kotlin.jvm.functions.Function2 r5 = r10.d()
            androidx.compose.runtime.Updater.g(r11, r2, r5)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r2 = com.hansecom.abt.R.drawable.f32999a
            androidx.compose.ui.graphics.painter.Painter r5 = androidx.compose.ui.res.PainterResources_androidKt.c(r2, r15, r6)
            androidx.compose.ui.Alignment r8 = r3.e()
            androidx.compose.ui.layout.ContentScale$Companion r2 = androidx.compose.ui.layout.ContentScale.f17026a
            androidx.compose.ui.layout.ContentScale r2 = r2.d()
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            float r6 = androidx.compose.ui.unit.Dp.m(r9)
            r7 = 12
            float r7 = (float) r7
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.PaddingKt.j(r3, r6, r7)
            r13 = 28080(0x6db0, float:3.9348E-41)
            r14 = 96
            r6 = 0
            r10 = 0
            r11 = 0
            r9 = r2
            r12 = r15
            androidx.compose.foundation.ImageKt.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.T()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x01c7
            androidx.compose.runtime.ComposerKt.X()
        L_0x01c7:
            r2 = r0
            r3 = r23
        L_0x01ca:
            androidx.compose.runtime.ScopeUpdateScope r6 = r15.x()
            if (r6 == 0) goto L_0x01df
            com.hansecom.abt.ui.components.googlePay.g r7 = new com.hansecom.abt.ui.components.googlePay.g
            r0 = r7
            r1 = r24
            r4 = r28
            r5 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.googlePay.GoogleWalletButtonKt.c(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(Function0 function0) {
        function0.invoke();
        return Unit.f40552a;
    }

    public static final Unit e(Function0 function0, Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        c(function0, modifier, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
