package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PassCheckoutScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37102A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassCheckout.State f37103z;

    public PassCheckoutScreenKt$ScreenImpl$1(PassCheckout.State state, Function1 function1) {
        this.f37103z = state;
        this.f37102A = function1;
    }

    /* access modifiers changed from: private */
    public static final Unit h(Function1 function1) {
        function1.invoke(PassCheckout.Action.Confirm.f37086a);
        return Unit.f40552a;
    }

    public static final Unit i(Function1 function1, PaymentMethodState paymentMethodState) {
        Intrinsics.i(paymentMethodState, "it");
        function1.invoke(new PassCheckout.Action.PaymentMethodChange(paymentMethodState));
        return Unit.f40552a;
    }

    public static final Unit k(Function1 function1) {
        function1.invoke(PassCheckout.Action.Confirm.f37086a);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit p(Function1 function1) {
        function1.invoke(PassCheckout.Action.Confirm.f37086a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.compose.runtime.Composer r34, int r35) {
        /*
            r33 = this;
            r0 = r33
            r15 = r34
            r1 = r35
            r2 = r1 & 3
            r14 = 2
            if (r2 != r14) goto L_0x0017
            boolean r2 = r34.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r34.B()
            goto L_0x03f8
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.ScreenImpl.<anonymous> (PassCheckoutScreen.kt:89)"
            r4 = 894069875(0x354a6c73, float:7.540868E-7)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            r1 = -626663925(0xffffffffdaa5de0b, float:-2.3343755E16)
            r15.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r1 = r0.f37103z
            boolean r1 = r1.c()
            r13 = 0
            if (r1 != 0) goto L_0x0045
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r1 = r0.f37103z
            com.hansecom.abt.ui.components.passCard.PassOfferCardState r1 = r1.j()
            if (r1 == 0) goto L_0x0045
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r1 = r0.f37103z
            java.lang.String r1 = r1.i()
            if (r1 != 0) goto L_0x0049
        L_0x0045:
            r1 = r13
            r11 = r15
            goto L_0x03f9
        L_0x0049:
            r34.M()
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            r11 = 0
            r10 = 1
            r9 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r12, r11, r10, r9)
            androidx.compose.foundation.ScrollState r2 = androidx.compose.foundation.ScrollKt.c(r13, r15, r13, r10)
            r6 = 14
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r1, r2, r3, r4, r5, r6, r7)
            com.hansecom.abt.ui.theme.Dimensions r27 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r27.c()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r11, r14, r9)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r8 = r0.f37103z
            kotlin.jvm.functions.Function1 r7 = r0.f37102A
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r15, r13)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r13)
            androidx.compose.runtime.CompositionLocalMap r4 = r34.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r16 = r34.v()
            if (r16 != 0) goto L_0x009c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009c:
            r34.s()
            boolean r16 = r34.n()
            if (r16 == 0) goto L_0x00a9
            r15.y(r6)
            goto L_0x00ac
        L_0x00a9:
            r34.K()
        L_0x00ac:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r34)
            kotlin.jvm.functions.Function2 r9 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r9)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00d6
            java.lang.Object r4 = r6.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r9)
            if (r4 != 0) goto L_0x00e4
        L_0x00d6:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00e4:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.lang.String r9 = r8.i()
            r16 = 0
            r17 = 111(0x6f, float:1.56E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r18 = 0
            r19 = 0
            r14 = r7
            r7 = r9
            r9 = r8
            r8 = r18
            r35 = r9
            r13 = 0
            r9 = r19
            r10 = r34
            r11 = r16
            r0 = r12
            r12 = r17
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            com.hansecom.abt.ui.components.passCard.PassOfferCardState r1 = r35.j()
            boolean r1 = r1.n()
            r2 = 48
            if (r1 == 0) goto L_0x0137
            r1 = -1739466969(0xffffffff9851d727, float:-2.7121241E-24)
            r15.X(r1)
            com.hansecom.abt.ui.components.passCard.PassOfferCardState r1 = r35.j()
            r11 = 0
            r12 = 1
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r0, r11, r12, r13)
            r4 = 0
            com.hansecom.abt.ui.components.passCard.GroupPassOfferCardKt.g(r1, r3, r15, r2, r4)
            r34.M()
            goto L_0x014e
        L_0x0137:
            r4 = 0
            r11 = 0
            r12 = 1
            r1 = -1739292532(0xffffffff9854808c, float:-2.7465257E-24)
            r15.X(r1)
            com.hansecom.abt.ui.components.passCard.PassOfferCardState r1 = r35.j()
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r0, r11, r12, r13)
            com.hansecom.abt.ui.components.passCard.PassOfferCardKt.i(r1, r3, r15, r2, r4)
            r34.M()
        L_0x014e:
            r1 = 32
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r0, r1)
            r10 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r10)
            com.hansecom.abt.ui.theme.AbtTheme r9 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r9.b(r15, r10)
            long r3 = r1.u()
            r6 = 0
            r7 = 3
            r1 = 0
            r2 = 0
            r5 = r34
            androidx.compose.material3.DividerKt.e(r1, r2, r3, r5, r6, r7)
            r1 = 24
            float r8 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r8)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r0, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r10)
            boolean r1 = r35.s()
            java.lang.String r6 = "pay_now"
            if (r1 == 0) goto L_0x01e1
            r1 = -1738914270(0xffffffff985a4622, float:-2.8211248E-24)
            r15.X(r1)
            int r1 = com.hansecom.abt.R.string.I2
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r3, r15, r2)
            int r1 = com.hansecom.abt.R.drawable.f33010l
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r0, r11, r12, r13)
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.platform.TestTagKt.a(r2, r6)
            r3 = 775191499(0x2e347bcb, float:4.1037212E-11)
            r15.X(r3)
            boolean r3 = r15.W(r14)
            java.lang.Object r4 = r34.g()
            if (r3 != 0) goto L_0x01b7
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x01bf
        L_0x01b7:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.n r4 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.n
            r4.<init>(r14)
            r15.N(r4)
        L_0x01bf:
            r3 = r4
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r34.M()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r9 = 48
            r11 = 76
            r4 = 0
            r7 = 0
            r8 = 0
            r1 = r3
            r3 = r4
            r4 = r7
            r7 = r8
            r8 = r34
            r12 = r10
            r10 = r11
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r34.M()
            r11 = r15
            goto L_0x03e1
        L_0x01e1:
            r1 = -1738457795(0xffffffff98613d3d, float:-2.9111486E-24)
            r15.X(r1)
            int r1 = com.hansecom.abt.R.string.Q2
            r7 = 0
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r15, r7)
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r9.d(r15, r10)
            androidx.compose.ui.text.TextStyle r22 = r2.f()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r0, r11, r12, r13)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r9.b(r15, r10)
            long r3 = r3.q()
            r25 = 0
            r26 = 131064(0x1fff8, float:1.8366E-40)
            r5 = 0
            r16 = 0
            r29 = r6
            r18 = r7
            r6 = r16
            r16 = 0
            r28 = r8
            r8 = r16
            r30 = r9
            r9 = r16
            r10 = r16
            r16 = 0
            r11 = r16
            r16 = 0
            r13 = r16
            r31 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 48
            r23 = r34
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 16
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r0, r1)
            r14 = r34
            r15 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r14, r15)
            com.hansecom.abt.presentation.model.PaymentMethodState r1 = r35.k()
            java.util.List r2 = r35.n()
            java.lang.String r5 = r35.h()
            r3 = 775222587(0x2e34f53b, float:4.114507E-11)
            r14.X(r3)
            r13 = r31
            boolean r3 = r14.W(r13)
            java.lang.Object r4 = r34.g()
            if (r3 != 0) goto L_0x0276
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x027e
        L_0x0276:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.o r4 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.o
            r4.<init>(r13)
            r14.N(r4)
        L_0x027e:
            r3 = r4
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r34.M()
            r10 = 0
            r11 = 232(0xe8, float:3.25E-43)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r34
            com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 4
            float r1 = (float) r1
            float r4 = androidx.compose.ui.unit.Dp.m(r1)
            r7 = 13
            r3 = 0
            r5 = 0
            r6 = 0
            r2 = r0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m(r2, r3, r4, r5, r6, r7, r8)
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = r35.l()
            r3 = 775229035(0x2e350e6b, float:4.116744E-11)
            r14.X(r3)
            if (r1 != 0) goto L_0x02af
            r9 = 0
            r12 = 0
            goto L_0x02b6
        L_0x02af:
            r12 = 0
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r9 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r1, r3, r14, r12)
        L_0x02b6:
            r34.M()
            if (r9 != 0) goto L_0x02c0
            java.lang.String r1 = ""
        L_0x02bd:
            r3 = r30
            goto L_0x02c2
        L_0x02c0:
            r1 = r9
            goto L_0x02bd
        L_0x02c2:
            com.hansecom.abt.ui.theme.typography.AbtTypography r4 = r3.d(r14, r15)
            androidx.compose.ui.text.TextStyle r21 = r4.d()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r3.b(r14, r15)
            long r3 = r3.b()
            r24 = 0
            r25 = 65528(0xfff8, float:9.1824E-41)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r16 = 0
            r12 = r16
            r32 = r13
            r13 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 48
            r22 = r34
            com.hansecom.abt.ui.components.AbtTextKt.c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            float r1 = androidx.compose.ui.unit.Dp.m(r28)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r0, r1)
            r11 = r34
            r12 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r11, r12)
            r2 = r35
            r3 = r32
            r1 = 0
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt.l(r2, r3, r11, r1)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt.B(r2, r11, r1)
            float r4 = androidx.compose.ui.unit.Dp.m(r28)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.i(r0, r4)
            androidx.compose.foundation.layout.SpacerKt.a(r4, r11, r12)
            com.hansecom.abt.presentation.model.PaymentMethodState r4 = r2.k()
            boolean r4 = r4 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.GooglePay
            if (r4 == 0) goto L_0x0376
            r1 = -1737255150(0xffffffff98739712, float:-3.1483285E-24)
            r11.X(r1)
            r4 = 0
            r5 = 1
            r6 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r0, r4, r5, r6)
            com.hansecom.abt.presentation.model.PaymentMethodState r1 = r2.k()
            com.hansecom.abt.presentation.model.PaymentMethodState$GooglePay r1 = (com.hansecom.abt.presentation.model.PaymentMethodState.GooglePay) r1
            java.lang.String r1 = r1.a()
            boolean r5 = r2.t()
            r2 = 775247435(0x2e35564b, float:4.123128E-11)
            r11.X(r2)
            boolean r2 = r11.W(r3)
            java.lang.Object r6 = r34.g()
            if (r2 != 0) goto L_0x035a
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x0362
        L_0x035a:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.p r6 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.p
            r6.<init>(r3)
            r11.N(r6)
        L_0x0362:
            r2 = r6
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r34.M()
            r6 = 384(0x180, float:5.38E-43)
            r7 = 0
            r3 = r4
            r4 = r5
            r5 = r34
            com.hansecom.abt.ui.components.googlePay.GooglePayButtonKt.b(r1, r2, r3, r4, r5, r6, r7)
            r34.M()
            goto L_0x03de
        L_0x0376:
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = -1736895643(0xffffffff98791365, float:-3.2192287E-24)
            r11.X(r7)
            boolean r2 = r2.t()
            r2 = r2 ^ r5
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7 = 2
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r7 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r2, r6, r7, r6)
            int r2 = com.hansecom.abt.R.string.H2
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r8 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r8, r11, r1)
            int r1 = com.hansecom.abt.R.drawable.U
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r0, r4, r5, r6)
            r4 = r29
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.platform.TestTagKt.a(r2, r4)
            r4 = 775256747(0x2e357aab, float:4.1263586E-11)
            r11.X(r4)
            boolean r4 = r11.W(r3)
            java.lang.Object r5 = r34.g()
            if (r4 != 0) goto L_0x03b9
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x03c1
        L_0x03b9:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.q r5 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.q
            r5.<init>(r3)
            r11.N(r5)
        L_0x03c1:
            r3 = r5
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r34.M()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r9 = 48
            r10 = 68
            r4 = 0
            r13 = 0
            r1 = r3
            r3 = r4
            r4 = r7
            r5 = r8
            r7 = r13
            r8 = r34
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r34.M()
        L_0x03de:
            r34.M()
        L_0x03e1:
            float r1 = r27.e()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r0, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r0, r11, r12)
            r34.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03f8
            androidx.compose.runtime.ComposerKt.X()
        L_0x03f8:
            return
        L_0x03f9:
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r11, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0405
            androidx.compose.runtime.ComposerKt.X()
        L_0x0405:
            r34.M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt$ScreenImpl$1.g(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        g((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
