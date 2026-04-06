package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaPaymentMethodItemKt {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.presentation.model.PaymentMethodState.FareMedia r34, androidx.compose.ui.Modifier r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r0 = r34
            r1 = r37
            r2 = r38
            r3 = 48
            r4 = 6
            java.lang.String r5 = "state"
            kotlin.jvm.internal.Intrinsics.i(r0, r5)
            r5 = -1476815657(0xffffffffa7f994d7, float:-6.9272756E-15)
            r6 = r36
            androidx.compose.runtime.Composer r15 = r6.q(r5)
            r6 = r2 & 1
            r7 = 4
            r14 = 2
            if (r6 == 0) goto L_0x0020
            r6 = r1 | 6
            goto L_0x0030
        L_0x0020:
            r6 = r1 & 6
            if (r6 != 0) goto L_0x002f
            boolean r6 = r15.W(r0)
            if (r6 == 0) goto L_0x002c
            r6 = r7
            goto L_0x002d
        L_0x002c:
            r6 = r14
        L_0x002d:
            r6 = r6 | r1
            goto L_0x0030
        L_0x002f:
            r6 = r1
        L_0x0030:
            r8 = r2 & 2
            if (r8 == 0) goto L_0x0038
            r6 = r6 | r3
        L_0x0035:
            r9 = r35
            goto L_0x004a
        L_0x0038:
            r9 = r1 & 48
            if (r9 != 0) goto L_0x0035
            r9 = r35
            boolean r10 = r15.W(r9)
            if (r10 == 0) goto L_0x0047
            r10 = 32
            goto L_0x0049
        L_0x0047:
            r10 = 16
        L_0x0049:
            r6 = r6 | r10
        L_0x004a:
            r10 = r6 & 19
            r11 = 18
            if (r10 != r11) goto L_0x005d
            boolean r10 = r15.t()
            if (r10 != 0) goto L_0x0057
            goto L_0x005d
        L_0x0057:
            r15.B()
            r6 = r15
            goto L_0x0375
        L_0x005d:
            if (r8 == 0) goto L_0x0064
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            r31 = r8
            goto L_0x0066
        L_0x0064:
            r31 = r9
        L_0x0066:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0072
            r8 = -1
            java.lang.String r9 = "com.hansecom.abt.ui.components.paymentOptions.FareMediaSelectorItem (FareMediaPaymentMethodItem.kt:33)"
            androidx.compose.runtime.ComposerKt.Y(r5, r6, r8, r9)
        L_0x0072:
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Alignment$Companion r32 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r6 = r32.o()
            r12 = 0
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.BoxKt.g(r6, r12)
            int r8 = androidx.compose.runtime.ComposablesKt.a(r15, r12)
            androidx.compose.runtime.CompositionLocalMap r9 = r15.I()
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.ComposedModifierKt.e(r15, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r13 = r11.a()
            androidx.compose.runtime.Applier r16 = r15.v()
            if (r16 != 0) goto L_0x009a
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009a:
            r15.s()
            boolean r16 = r15.n()
            if (r16 == 0) goto L_0x00a7
            r15.y(r13)
            goto L_0x00aa
        L_0x00a7:
            r15.K()
        L_0x00aa:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r14 = r11.c()
            androidx.compose.runtime.Updater.g(r13, r6, r14)
            kotlin.jvm.functions.Function2 r6 = r11.e()
            androidx.compose.runtime.Updater.g(r13, r9, r6)
            kotlin.jvm.functions.Function2 r6 = r11.b()
            boolean r9 = r13.n()
            if (r9 != 0) goto L_0x00d4
            java.lang.Object r9 = r13.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r14)
            if (r9 != 0) goto L_0x00e2
        L_0x00d4:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r13.N(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13.A(r8, r6)
        L_0x00e2:
            kotlin.jvm.functions.Function2 r6 = r11.d()
            androidx.compose.runtime.Updater.g(r13, r10, r6)
            androidx.compose.foundation.layout.BoxScopeInstance r14 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            float r6 = (float) r7
            float r17 = androidx.compose.ui.unit.Dp.m(r6)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r31
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.Alignment$Vertical r7 = r32.i()
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f3739a
            r9 = 8
            float r10 = (float) r9
            float r9 = androidx.compose.ui.unit.Dp.m(r10)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r9 = r8.n(r9)
            r13 = 54
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.RowKt.b(r9, r7, r15, r13)
            int r9 = androidx.compose.runtime.ComposablesKt.a(r15, r12)
            androidx.compose.runtime.CompositionLocalMap r13 = r15.I()
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.ComposedModifierKt.e(r15, r6)
            kotlin.jvm.functions.Function0 r3 = r11.a()
            androidx.compose.runtime.Applier r16 = r15.v()
            if (r16 != 0) goto L_0x0130
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0130:
            r15.s()
            boolean r16 = r15.n()
            if (r16 == 0) goto L_0x013d
            r15.y(r3)
            goto L_0x0140
        L_0x013d:
            r15.K()
        L_0x0140:
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r4 = r11.c()
            androidx.compose.runtime.Updater.g(r3, r7, r4)
            kotlin.jvm.functions.Function2 r4 = r11.e()
            androidx.compose.runtime.Updater.g(r3, r13, r4)
            kotlin.jvm.functions.Function2 r4 = r11.b()
            boolean r7 = r3.n()
            if (r7 != 0) goto L_0x016a
            java.lang.Object r7 = r3.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r13)
            if (r7 != 0) goto L_0x0178
        L_0x016a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r3.N(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r3.A(r7, r4)
        L_0x0178:
            kotlin.jvm.functions.Function2 r4 = r11.d()
            androidx.compose.runtime.Updater.g(r3, r6, r4)
            androidx.compose.foundation.layout.RowScopeInstance r16 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r5
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.RowScope.c(r16, r17, r18, r19, r20, r21)
            androidx.compose.foundation.layout.Arrangement$Vertical r4 = r8.g()
            androidx.compose.ui.Alignment$Horizontal r6 = r32.k()
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.ColumnKt.a(r4, r6, r15, r12)
            int r6 = androidx.compose.runtime.ComposablesKt.a(r15, r12)
            androidx.compose.runtime.CompositionLocalMap r7 = r15.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r15, r3)
            kotlin.jvm.functions.Function0 r8 = r11.a()
            androidx.compose.runtime.Applier r9 = r15.v()
            if (r9 != 0) goto L_0x01b4
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01b4:
            r15.s()
            boolean r9 = r15.n()
            if (r9 == 0) goto L_0x01c1
            r15.y(r8)
            goto L_0x01c4
        L_0x01c1:
            r15.K()
        L_0x01c4:
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r9 = r11.c()
            androidx.compose.runtime.Updater.g(r8, r4, r9)
            kotlin.jvm.functions.Function2 r4 = r11.e()
            androidx.compose.runtime.Updater.g(r8, r7, r4)
            kotlin.jvm.functions.Function2 r4 = r11.b()
            boolean r7 = r8.n()
            if (r7 != 0) goto L_0x01ee
            java.lang.Object r7 = r8.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r9)
            if (r7 != 0) goto L_0x01fc
        L_0x01ee:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.N(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.A(r6, r4)
        L_0x01fc:
            kotlin.jvm.functions.Function2 r4 = r11.d()
            androidx.compose.runtime.Updater.g(r8, r3, r4)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            com.hansecom.abt.util.resourcesResolvers.StringValue r3 = r34.b()
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.String r6 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r3, r4, r15, r12)
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r4 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r7 = r3.d(r15, r4)
            androidx.compose.ui.text.TextStyle r26 = r7.b()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r3.b(r15, r4)
            long r8 = r7.x()
            androidx.compose.ui.text.font.FontWeight$Companion r4 = androidx.compose.ui.text.font.FontWeight.f18746A
            androidx.compose.ui.text.font.FontWeight r13 = r4.b()
            r29 = 0
            r30 = 65498(0xffda, float:9.1782E-41)
            r7 = 0
            r16 = 0
            r4 = r10
            r10 = r16
            r16 = 0
            r12 = r16
            r33 = r14
            r14 = r16
            r16 = 0
            r35 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 196608(0x30000, float:2.75506E-40)
            r27 = r35
            com.hansecom.abt.ui.components.AbtTextKt.c(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.i(r5, r4)
            r6 = r35
            r7 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r4, r6, r7)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r3.b(r6, r7)
            long r7 = r4.x()
            boolean r4 = r34.d()
            if (r4 == 0) goto L_0x0287
            r4 = -41624251(0xfffffffffd84dd45, float:-2.2075874E37)
            r6.X(r4)
            int r4 = com.hansecom.abt.R.string.d4
            r15 = 0
            java.lang.Object[] r7 = new java.lang.Object[r15]
            java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r4, r7, r6, r15)
            r6.M()
            goto L_0x02d0
        L_0x0287:
            r15 = 0
            r4 = -41500995(0xfffffffffd86bebd, float:-2.2388365E37)
            r6.X(r4)
            int r4 = com.hansecom.abt.R.string.f4
            com.hansecom.abt.util.formatters.CurrencyValueFormater r9 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r10 = r34.a()
            r11 = 0
            r12 = 2
            java.lang.String r9 = com.hansecom.abt.util.formatters.CurrencyValueFormater.c(r9, r10, r15, r12, r11)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            androidx.compose.ui.text.AnnotatedString r4 = com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt.c(r4, r9, r6, r15)
            r9 = -1248258053(0xffffffffb59917fb, float:-1.1406368E-6)
            r6.X(r9)
            boolean r9 = r6.j(r7)
            java.lang.Object r10 = r6.g()
            if (r9 != 0) goto L_0x02bc
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x02c4
        L_0x02bc:
            com.hansecom.abt.ui.components.paymentOptions.g r10 = new com.hansecom.abt.ui.components.paymentOptions.g
            r10.<init>(r7)
            r6.N(r10)
        L_0x02c4:
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r6.M()
            androidx.compose.ui.text.AnnotatedString r4 = com.hansecom.abt.util.StringExtKt.e(r4, r10)
            r6.M()
        L_0x02d0:
            boolean r7 = r34.d()
            if (r7 == 0) goto L_0x02eb
            r7 = -41021177(0xfffffffffd8e1107, float:-2.3604848E37)
            r6.X(r7)
            r7 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r8 = r3.d(r6, r7)
            androidx.compose.ui.text.TextStyle r8 = r8.d()
            r6.M()
        L_0x02e8:
            r26 = r8
            goto L_0x02fe
        L_0x02eb:
            r7 = 6
            r8 = -40939957(0xfffffffffd8f4e4b, float:-2.3810765E37)
            r6.X(r8)
            com.hansecom.abt.ui.theme.typography.AbtTypography r8 = r3.d(r6, r7)
            androidx.compose.ui.text.TextStyle r8 = r8.b()
            r6.M()
            goto L_0x02e8
        L_0x02fe:
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r3.b(r6, r7)
            long r8 = r3.r()
            r29 = 0
            r30 = 65530(0xfffa, float:9.1827E-41)
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r3 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r35 = r6
            r6 = r4
            r27 = r35
            com.hansecom.abt.ui.components.AbtTextKt.c(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r35.T()
            r35.T()
            r4 = -453721478(0xffffffffe4f4c27a, float:-3.6120153E22)
            r6 = r35
            r6.X(r4)
            boolean r4 = r34.c()
            if (r4 == 0) goto L_0x0364
            androidx.compose.ui.Alignment r4 = r32.f()
            r7 = r33
            androidx.compose.ui.Modifier r8 = r7.g(r5, r4)
            r4 = 20
            float r4 = (float) r4
            float r11 = androidx.compose.ui.unit.Dp.m(r4)
            r13 = 11
            r14 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.PaddingKt.m(r8, r9, r10, r11, r12, r13, r14)
            r5 = 48
            com.hansecom.abt.ui.components.fareMediaCard.LockedBadgeKt.b(r4, r3, r6, r5, r3)
        L_0x0364:
            r6.M()
            r6.T()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0373
            androidx.compose.runtime.ComposerKt.X()
        L_0x0373:
            r9 = r31
        L_0x0375:
            androidx.compose.runtime.ScopeUpdateScope r3 = r6.x()
            if (r3 == 0) goto L_0x0383
            com.hansecom.abt.ui.components.paymentOptions.h r4 = new com.hansecom.abt.ui.components.paymentOptions.h
            r4.<init>(r0, r9, r1, r2)
            r3.a(r4)
        L_0x0383:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.paymentOptions.FareMediaPaymentMethodItemKt.c(com.hansecom.abt.presentation.model.PaymentMethodState$FareMedia, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final SpanStyle d(long j2, SpanStyle spanStyle) {
        SpanStyle spanStyle2 = spanStyle;
        Intrinsics.i(spanStyle, "it");
        return SpanStyle.b(spanStyle2, j2, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (Object) null);
    }

    public static final Unit e(PaymentMethodState.FareMedia fareMedia, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        c(fareMedia, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
