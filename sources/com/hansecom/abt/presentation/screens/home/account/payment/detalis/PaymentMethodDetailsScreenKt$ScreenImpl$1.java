package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PaymentMethodDetailsScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35777A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodDetails.State f35778z;

    public PaymentMethodDetailsScreenKt$ScreenImpl$1(PaymentMethodDetails.State state, Function1 function1) {
        this.f35778z = state;
        this.f35777A = function1;
    }

    public static final Unit e(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r33, int r34) {
        /*
            r32 = this;
            r0 = r32
            r5 = r33
            r1 = r34
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r33.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r33.B()
            goto L_0x01d5
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.account.payment.detalis.ScreenImpl.<anonymous> (PaymentMethodDetailsScreen.kt:84)"
            r6 = 300982785(0x11f0a201, float:3.7965166E-28)
            androidx.compose.runtime.ComposerKt.Y(r6, r1, r2, r4)
        L_0x0026:
            r1 = -1784766958(0xffffffff959e9e12, float:-6.406508E-26)
            r5.X(r1)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$State r1 = r0.f35778z
            boolean r1 = r1.d()
            r15 = 0
            if (r1 != 0) goto L_0x003d
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$State r1 = r0.f35778z
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r1 = r1.i()
            if (r1 != 0) goto L_0x0041
        L_0x003d:
            r3 = r5
            r1 = r15
            goto L_0x01d6
        L_0x0041:
            r33.M()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r2 = 0
            r4 = 1
            r6 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.f(r1, r2, r4, r6)
            com.hansecom.abt.ui.theme.Dimensions r21 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r8 = r21.c()
            androidx.compose.ui.Modifier r22 = androidx.compose.foundation.layout.PaddingKt.k(r7, r8, r2, r3, r6)
            androidx.compose.foundation.ScrollState r23 = androidx.compose.foundation.ScrollKt.c(r15, r5, r15, r4)
            r27 = 14
            r28 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.ScrollKt.g(r22, r23, r24, r25, r26, r27, r28)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$State r14 = r0.f35778z
            kotlin.jvm.functions.Function1 r13 = r0.f35777A
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r7 = r7.g()
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r8 = r8.k()
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.ColumnKt.a(r7, r8, r5, r15)
            int r8 = androidx.compose.runtime.ComposablesKt.a(r5, r15)
            androidx.compose.runtime.CompositionLocalMap r9 = r33.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r5, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r11 = r10.a()
            androidx.compose.runtime.Applier r12 = r33.v()
            if (r12 != 0) goto L_0x0098
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0098:
            r33.s()
            boolean r12 = r33.n()
            if (r12 == 0) goto L_0x00a5
            r5.y(r11)
            goto L_0x00a8
        L_0x00a5:
            r33.K()
        L_0x00a8:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r33)
            kotlin.jvm.functions.Function2 r12 = r10.c()
            androidx.compose.runtime.Updater.g(r11, r7, r12)
            kotlin.jvm.functions.Function2 r7 = r10.e()
            androidx.compose.runtime.Updater.g(r11, r9, r7)
            kotlin.jvm.functions.Function2 r7 = r10.b()
            boolean r9 = r11.n()
            if (r9 != 0) goto L_0x00d2
            java.lang.Object r9 = r11.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r12)
            if (r9 != 0) goto L_0x00e0
        L_0x00d2:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.N(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.A(r8, r7)
        L_0x00e0:
            kotlin.jvm.functions.Function2 r7 = r10.d()
            androidx.compose.runtime.Updater.g(r11, r3, r7)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            float r3 = r21.d()
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.i(r1, r3)
            r12 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r3, r5, r12)
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r3 = r14.i()
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt.l(r3, r5, r15)
            r3 = 1279063726(0x4c3cf6ae, float:4.9535672E7)
            r5.X(r3)
            boolean r3 = r14.c()
            r11 = 24
            if (r3 == 0) goto L_0x013a
            float r3 = (float) r11
            float r7 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.i(r1, r7)
            androidx.compose.foundation.layout.SpacerKt.a(r7, r5, r12)
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r7 = r14.i()
            boolean r7 = r7.g()
            if (r7 != 0) goto L_0x0141
            r2 = 996386559(0x3b63a6ff, float:0.0034736989)
            r5.X(r2)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt.n(r5, r15)
            float r2 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.i(r1, r2)
            androidx.compose.foundation.layout.SpacerKt.a(r2, r5, r12)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt.u(r14, r13, r5, r15)
            r33.M()
        L_0x013a:
            r31 = r1
            r29 = r13
            r30 = r14
            goto L_0x01a0
        L_0x0141:
            r3 = 996577891(0x3b669263, float:0.0035182468)
            r5.X(r3)
            java.lang.String r3 = r14.g()
            int r17 = com.hansecom.abt.R.string.U7
            androidx.compose.ui.Modifier r22 = androidx.compose.foundation.layout.SizeKt.h(r1, r2, r4, r6)
            r2 = 1279077682(0x4c3d2d32, float:4.9591496E7)
            r5.X(r2)
            java.lang.Object r2 = r33.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x016b
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.o r2 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.o
            r2.<init>()
            r5.N(r2)
        L_0x016b:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r33.M()
            r19 = 0
            r20 = 65440(0xffa0, float:9.1701E-41)
            java.lang.String r4 = ""
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r16 = 0
            r11 = r16
            r12 = r16
            r16 = 0
            r29 = r13
            r13 = r16
            r30 = r14
            r14 = r16
            r15 = r16
            r18 = 1600560(0x186c30, float:2.242862E-39)
            r31 = r1
            r1 = r3
            r3 = r17
            r5 = r22
            r17 = r33
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r33.M()
        L_0x01a0:
            r33.M()
            r1 = 24
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r2 = r31
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r2, r1)
            r3 = r33
            r4 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r3, r4)
            r6 = r29
            r5 = r30
            r1 = 0
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt.p(r5, r6, r3, r1)
            float r1 = r21.e()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r2, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r3, r4)
            r33.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01d5
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d5:
            return
        L_0x01d6:
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r3, r1)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01e2
            androidx.compose.runtime.ComposerKt.X()
        L_0x01e2:
            r33.M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt$ScreenImpl$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
