package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class FareMediaPurchaseCardScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37185A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37186B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ FocusManager D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaPurchaseCard.State f37187z;

    public FareMediaPurchaseCardScreenKt$ScreenImpl$1(FareMediaPurchaseCard.State state, Function1 function1, Flow flow, Function0 function0, FocusManager focusManager) {
        this.f37187z = state;
        this.f37185A = function1;
        this.f37186B = flow;
        this.C = function0;
        this.D = focusManager;
    }

    public static final String A(FareMediaPurchaseCard.RiderType riderType) {
        Intrinsics.i(riderType, "it");
        return riderType.b();
    }

    public static final Unit B(Function1 function1, FareMediaPurchaseCard.RiderType riderType) {
        Intrinsics.i(riderType, "it");
        function1.invoke(new FareMediaPurchaseCard.Action.RiderTypeChange(riderType));
        return Unit.f40552a;
    }

    public static final Unit C(Function1 function1) {
        function1.invoke(new FareMediaPurchaseCard.Action.OpenRiderTypeSelector(false));
        return Unit.f40552a;
    }

    public static final Unit t(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(new FareMediaPurchaseCard.Action.OpenRiderTypeSelector(true));
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit u(Function1 function1) {
        function1.invoke(FareMediaPurchaseCard.Action.Confirm.f37170a);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit v(Function1 function1) {
        function1.invoke(FareMediaPurchaseCard.Action.Confirm.f37170a);
        return Unit.f40552a;
    }

    public static final Unit w(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new FareMediaPurchaseCard.Action.NickNameChange(str));
        return Unit.f40552a;
    }

    public static final Unit x(FocusManager focusManager, Function1 function1, BigDecimal bigDecimal) {
        Intrinsics.i(bigDecimal, "it");
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(new FareMediaPurchaseCard.Action.TopUpAmountChange(bigDecimal));
        return Unit.f40552a;
    }

    public static final Unit y(Function1 function1, PaymentMethodState paymentMethodState) {
        Intrinsics.i(paymentMethodState, "it");
        function1.invoke(new FareMediaPurchaseCard.Action.PaymentMethodChange(paymentMethodState));
        return Unit.f40552a;
    }

    public static final Object z(FareMediaPurchaseCard.RiderType riderType) {
        Intrinsics.i(riderType, "it");
        return Integer.valueOf(riderType.a());
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        s((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(androidx.compose.runtime.Composer r44, int r45) {
        /*
            r43 = this;
            r0 = r43
            r15 = r44
            r1 = r45
            r2 = r1 & 3
            r14 = 2
            if (r2 != r14) goto L_0x0017
            boolean r2 = r44.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r44.B()
            goto L_0x0680
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.ScreenImpl.<anonymous> (FareMediaPurchaseCardScreen.kt:86)"
            r4 = 1076725677(0x402d87ad, float:2.711406)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            r1 = -1951013124(0xffffffff8bb5e6fc, float:-7.006621E-32)
            r15.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State r1 = r0.f37187z
            boolean r1 = r1.q()
            r13 = 0
            if (r1 == 0) goto L_0x0045
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r15, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0041
            androidx.compose.runtime.ComposerKt.X()
        L_0x0041:
            r44.M()
            return
        L_0x0045:
            r44.M()
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
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r11, r14, r9)
            float r18 = r27.d()
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State r8 = r0.f37187z
            androidx.compose.ui.focus.FocusManager r7 = r0.D
            kotlin.jvm.functions.Function1 r6 = r0.f37185A
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r28 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r28.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r15, r13)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r13)
            androidx.compose.runtime.CompositionLocalMap r4 = r44.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r14 = r5.a()
            androidx.compose.runtime.Applier r17 = r44.v()
            if (r17 != 0) goto L_0x00ac
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00ac:
            r44.s()
            boolean r17 = r44.n()
            if (r17 == 0) goto L_0x00b9
            r15.y(r14)
            goto L_0x00bc
        L_0x00b9:
            r44.K()
        L_0x00bc:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r44)
            kotlin.jvm.functions.Function2 r11 = r5.c()
            androidx.compose.runtime.Updater.g(r14, r2, r11)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r14, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r14.n()
            if (r4 != 0) goto L_0x00e6
            java.lang.Object r4 = r14.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r11)
            if (r4 != 0) goto L_0x00f4
        L_0x00e6:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r14.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14.A(r3, r2)
        L_0x00f4:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r14, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r14 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r1 = 48
            com.hansecom.abt.ui.components.fareMediaCard.FareMediaMockCardKt.b(r9, r10, r15, r1, r10)
            r1 = 32
            float r11 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r11)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            r5 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r5)
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$RiderType r1 = r8.j()
            if (r1 == 0) goto L_0x011c
            java.lang.String r1 = r1.b()
            goto L_0x011d
        L_0x011c:
            r1 = r9
        L_0x011d:
            if (r1 != 0) goto L_0x0121
            java.lang.String r1 = ""
        L_0x0121:
            int r2 = com.hansecom.abt.R.string.C3
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r15, r13)
            r4 = 0
            androidx.compose.ui.Modifier r17 = androidx.compose.foundation.layout.SizeKt.h(r12, r4, r10, r9)
            r3 = 413149689(0x18a029f9, float:4.1401412E-24)
            r15.X(r3)
            boolean r3 = r15.l(r7)
            boolean r18 = r15.W(r6)
            r3 = r3 | r18
            java.lang.Object r4 = r44.g()
            if (r3 != 0) goto L_0x014a
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0152
        L_0x014a:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.e r4 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.e
            r4.<init>(r7, r6)
            r15.N(r4)
        L_0x0152:
            r3 = r4
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r44.M()
            r18 = 0
            r19 = 1936(0x790, float:2.713E-42)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r29 = 1772544(0x1b0c00, float:2.483863E-39)
            r30 = 0
            r4 = r17
            r5 = r20
            r31 = r6
            r6 = r21
            r32 = r7
            r7 = r22
            r33 = r8
            r8 = r23
            r9 = r24
            r10 = r25
            r30 = r11
            r11 = r26
            r34 = r12
            r12 = r44
            r13 = r29
            r35 = r14
            r14 = r18
            r0 = r15
            r15 = r19
            com.hansecom.abt.ui.components.formFields.DropdownTextFieldKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$RiderType r1 = r33.j()
            if (r1 == 0) goto L_0x01a2
            com.hansecom.abt.util.resourcesResolvers.StringValue r9 = r1.d()
            goto L_0x01a3
        L_0x01a2:
            r9 = 0
        L_0x01a3:
            r1 = 413159534(0x18a0506e, float:4.1440244E-24)
            r0.X(r1)
            if (r9 != 0) goto L_0x01ae
            r36 = r34
            goto L_0x0212
        L_0x01ae:
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r23 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r9, r2, r0, r1)
            r2 = 413162930(0x18a05db2, float:4.145364E-24)
            r0.X(r2)
            int r2 = r23.length()
            if (r2 <= 0) goto L_0x020b
            r2 = 16
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            r15 = r34
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.i(r15, r2)
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r2, r0, r14)
            com.hansecom.abt.ui.theme.AbtTheme r2 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r2.d(r0, r14)
            androidx.compose.ui.text.TextStyle r22 = r2.b()
            r25 = 0
            r26 = 131070(0x1fffe, float:1.83668E-40)
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r14 = r16
            r16 = 0
            r36 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r1 = r23
            r23 = r44
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x020d
        L_0x020b:
            r36 = r34
        L_0x020d:
            r44.M()
            kotlin.Unit r1 = kotlin.Unit.f40552a
        L_0x0212:
            r44.M()
            r1 = 24
            float r12 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r12)
            r11 = r36
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r11, r1)
            r6 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r6)
            java.lang.String r1 = r33.d()
            int r3 = com.hansecom.abt.R.string.x3
            int r2 = com.hansecom.abt.R.string.y3
            r5 = 0
            java.lang.String r17 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r0, r5)
            com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r33.e()
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r11, r15, r14, r13)
            java.lang.String r7 = "nickname"
            androidx.compose.ui.Modifier r21 = androidx.compose.ui.platform.TestTagKt.a(r2, r7)
            androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r22 = r2.b()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r2 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r23 = r2.e()
            r2 = 413176546(0x18a092e2, float:4.1507344E-24)
            r0.X(r2)
            r10 = r31
            boolean r2 = r0.W(r10)
            java.lang.Object r7 = r44.g()
            if (r2 != 0) goto L_0x026a
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x0272
        L_0x026a:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.f r7 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.f
            r7.<init>(r10)
            r0.N(r7)
        L_0x0272:
            r2 = r7
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r44.M()
            r19 = 54
            r20 = 62400(0xf3c0, float:8.7441E-41)
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r37 = r10
            r10 = r16
            r16 = 0
            r13 = r16
            r14 = r16
            r15 = r16
            r18 = 24576(0x6000, float:3.4438E-41)
            r5 = r21
            r6 = r17
            r38 = r11
            r11 = r23
            r29 = r12
            r12 = r22
            r17 = r44
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r1 = androidx.compose.ui.unit.Dp.m(r30)
            r15 = r38
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r14)
            int r1 = com.hansecom.abt.R.string.D3
            r13 = 0
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r0, r13)
            com.hansecom.abt.ui.theme.AbtTheme r11 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r11.d(r0, r14)
            androidx.compose.ui.text.TextStyle r22 = r2.b()
            r25 = 0
            r26 = 131070(0x1fffe, float:1.83668E-40)
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r16 = 0
            r39 = r11
            r11 = r16
            r16 = 0
            r13 = r16
            r14 = r16
            r16 = 0
            r40 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r23 = r44
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            float r1 = androidx.compose.ui.unit.Dp.m(r29)
            r15 = r40
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r14)
            r11 = 1
            r12 = 0
            r13 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r15, r13, r11, r12)
            kotlinx.collections.immutable.PersistentList r2 = r33.h()
            java.math.BigDecimal r1 = r33.l()
            r3 = 413210419(0x18a11733, float:4.164095E-24)
            r0.X(r3)
            r3 = r32
            boolean r5 = r0.l(r3)
            r10 = r37
            boolean r6 = r0.W(r10)
            r5 = r5 | r6
            java.lang.Object r6 = r44.g()
            if (r5 != 0) goto L_0x032e
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0336
        L_0x032e:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.g r6 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.g
            r6.<init>(r3, r10)
            r0.N(r6)
        L_0x0336:
            r3 = r6
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r44.M()
            r7 = 3072(0xc00, float:4.305E-42)
            r8 = 16
            r5 = 0
            r6 = r44
            com.hansecom.abt.ui.components.quickSelectionButton.QuickSelectionGridKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 413216221(0x18a12ddd, float:4.1663835E-24)
            r0.X(r1)
            boolean r1 = r33.p()
            if (r1 != 0) goto L_0x041a
            float r1 = androidx.compose.ui.unit.Dp.m(r30)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r14)
            int r1 = com.hansecom.abt.R.string.B3
            r9 = 0
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r0, r9)
            r3 = r39
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r3.d(r0, r14)
            androidx.compose.ui.text.TextStyle r22 = r2.f()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r15, r13, r11, r12)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r3.b(r0, r14)
            long r3 = r3.q()
            r25 = 0
            r26 = 131064(0x1fff8, float:1.8366E-40)
            r5 = 0
            r6 = 0
            r8 = 0
            r16 = 0
            r9 = r16
            r41 = r10
            r10 = r16
            r16 = 0
            r11 = r16
            r16 = 0
            r13 = r16
            r14 = r16
            r16 = 0
            r42 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 48
            r23 = r44
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 14
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r12 = r42
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            com.hansecom.abt.presentation.model.PaymentMethodState r1 = r33.f()
            kotlinx.collections.immutable.PersistentList r2 = r33.g()
            r3 = 413236259(0x18a17c23, float:4.174287E-24)
            r0.X(r3)
            r14 = r41
            boolean r3 = r0.W(r14)
            java.lang.Object r4 = r44.g()
            if (r3 != 0) goto L_0x03df
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x03e7
        L_0x03df:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.h r4 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.h
            r4.<init>(r14)
            r0.N(r4)
        L_0x03e7:
            r3 = r4
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r44.M()
            r10 = 0
            r11 = 248(0xf8, float:3.48E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r44
            com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            float r1 = androidx.compose.ui.unit.Dp.m(r30)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            java.math.BigDecimal r1 = r33.c()
            java.math.BigDecimal r2 = r33.l()
            java.math.BigDecimal r3 = r33.n()
            r15 = 0
            kotlinx.collections.immutable.ImmutableList r1 = com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardScreenKt.j(r1, r2, r3, r0, r15)
            com.hansecom.abt.ui.components.checkout.CheckoutSummaryKt.c(r1, r0, r15)
            goto L_0x041e
        L_0x041a:
            r13 = r14
            r12 = r15
            r15 = 0
            r14 = r10
        L_0x041e:
            r44.M()
            r1 = 413250982(0x18a1b5a6, float:4.1800943E-24)
            r0.X(r1)
            boolean r1 = r33.k()
            if (r1 == 0) goto L_0x045c
            float r1 = androidx.compose.ui.unit.Dp.m(r30)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType r1 = com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType.WARNING
            int r2 = com.hansecom.abt.R.drawable.f33007i
            androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.ui.res.PainterResources_androidKt.c(r2, r0, r15)
            int r3 = com.hansecom.abt.R.string.I3
            java.lang.String r3 = androidx.compose.ui.res.StringResources_androidKt.b(r3, r0, r15)
            r9 = 0
            r10 = 0
            r11 = 1
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r12, r10, r11, r9)
            r8 = 3078(0xc06, float:4.313E-42)
            r16 = 48
            r5 = 0
            r6 = 0
            r7 = r44
            r10 = r9
            r9 = r16
            com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x045e
        L_0x045c:
            r10 = 0
            r11 = 1
        L_0x045e:
            r44.M()
            float r1 = androidx.compose.ui.unit.Dp.m(r30)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            boolean r1 = r33.p()
            java.lang.String r2 = "create"
            if (r1 == 0) goto L_0x04d8
            r1 = -73576991(0xfffffffffb9d4de1, float:-1.6335404E36)
            r0.X(r1)
            int r1 = com.hansecom.abt.R.string.z3
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r0, r15)
            boolean r1 = r33.o()
            r1 = r1 ^ r11
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3 = 2
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r4 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r1, r10, r3, r10)
            r1 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r12, r1, r11, r10)
            androidx.compose.ui.Alignment$Horizontal r3 = r28.g()
            r6 = r35
            androidx.compose.ui.Modifier r1 = r6.b(r1, r3)
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.platform.TestTagKt.a(r1, r2)
            r1 = 413269939(0x18a1ffb3, float:4.1875715E-24)
            r0.X(r1)
            boolean r1 = r0.W(r14)
            java.lang.Object r3 = r44.g()
            if (r1 != 0) goto L_0x04b9
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x04c1
        L_0x04b9:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.i r3 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.i
            r3.<init>(r14)
            r0.N(r3)
        L_0x04c1:
            r1 = r3
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r44.M()
            r9 = 0
            r11 = 100
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = r44
            r13 = r10
            r10 = r11
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r44.M()
            goto L_0x0542
        L_0x04d8:
            r13 = r10
            r6 = r35
            r3 = 2
            r1 = -73053525(0xfffffffffba54aab, float:-1.7164869E36)
            r0.X(r1)
            int r1 = com.hansecom.abt.R.string.A3
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r0, r15)
            int r1 = com.hansecom.abt.R.drawable.U
            boolean r4 = r33.o()
            r4 = r4 ^ r11
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r4 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r4, r13, r3, r13)
            r3 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r12, r3, r11, r13)
            androidx.compose.ui.Alignment$Horizontal r7 = r28.g()
            androidx.compose.ui.Modifier r3 = r6.b(r3, r7)
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.platform.TestTagKt.a(r3, r2)
            r3 = 413286771(0x18a24173, float:4.1942105E-24)
            r0.X(r3)
            boolean r3 = r0.W(r14)
            java.lang.Object r6 = r44.g()
            if (r3 != 0) goto L_0x0520
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0528
        L_0x0520:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.j r6 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.j
            r6.<init>(r14)
            r0.N(r6)
        L_0x0528:
            r3 = r6
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r44.M()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r9 = 0
            r10 = 68
            r7 = 0
            r8 = 0
            r1 = r3
            r3 = r7
            r7 = r8
            r8 = r44
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r44.M()
        L_0x0542:
            float r1 = r27.e()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.t(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r15)
            r44.T()
            r14 = r0
            r0 = r43
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State r1 = r0.f37187z
            boolean r4 = r1.r()
            int r1 = com.hansecom.abt.R.string.w3
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r14, r15)
            int r2 = com.hansecom.abt.R.string.v3
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r14, r15)
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.ComposableSingletons$FareMediaPurchaseCardScreenKt r3 = com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.ComposableSingletons$FareMediaPurchaseCardScreenKt.f37167a
            kotlin.jvm.functions.Function2 r5 = r3.a()
            r20 = 196608(0x30000, float:2.75506E-40)
            r21 = 98276(0x17fe4, float:1.37714E-40)
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r13 = r16
            r14 = r16
            r15 = r16
            r17 = 0
            r19 = 24576(0x6000, float:3.4438E-41)
            r18 = r44
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            int r1 = com.hansecom.abt.R.string.B9
            r10 = r44
            r2 = 0
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r10, r2)
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State r2 = r0.f37187z
            kotlinx.collections.immutable.PersistentList r2 = r2.i()
            r3 = -1950816157(0xffffffff8bb8e863, float:-7.122388E-32)
            r10.X(r3)
            java.lang.Object r3 = r44.g()
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r11.a()
            if (r3 != r4) goto L_0x05b2
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.k r3 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.k
            r3.<init>()
            r10.N(r3)
        L_0x05b2:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r44.M()
            r4 = -1950815035(0xffffffff8bb8ecc5, float:-7.1230473E-32)
            r10.X(r4)
            java.lang.Object r4 = r44.g()
            java.lang.Object r5 = r11.a()
            if (r4 != r5) goto L_0x05cf
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.l r4 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.l
            r4.<init>()
            r10.N(r4)
        L_0x05cf:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r44.M()
            r5 = -1950813728(0xffffffff8bb8f1e0, float:-7.1238155E-32)
            r10.X(r5)
            kotlin.jvm.functions.Function1 r5 = r0.f37185A
            boolean r5 = r10.W(r5)
            kotlin.jvm.functions.Function1 r6 = r0.f37185A
            java.lang.Object r7 = r44.g()
            if (r5 != 0) goto L_0x05ee
            java.lang.Object r5 = r11.a()
            if (r7 != r5) goto L_0x05f6
        L_0x05ee:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.m r7 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.m
            r7.<init>(r6)
            r10.N(r7)
        L_0x05f6:
            r5 = r7
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r44.M()
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard$State r6 = r0.f37187z
            boolean r6 = r6.s()
            r7 = -1950809783(0xffffffff8bb90149, float:-7.126134E-32)
            r10.X(r7)
            kotlin.jvm.functions.Function1 r7 = r0.f37185A
            boolean r7 = r10.W(r7)
            kotlin.jvm.functions.Function1 r8 = r0.f37185A
            java.lang.Object r9 = r44.g()
            if (r7 != 0) goto L_0x061c
            java.lang.Object r7 = r11.a()
            if (r9 != r7) goto L_0x0624
        L_0x061c:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.n r9 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.n
            r9.<init>(r8)
            r10.N(r9)
        L_0x0624:
            r7 = r9
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r44.M()
            r9 = 3456(0xd80, float:4.843E-42)
            r8 = r44
            com.hansecom.abt.ui.components.bottomSheet.OptionsBottomSheetKt.h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r1 = r10.C(r1)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r1 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r1
            kotlinx.coroutines.flow.Flow r2 = r0.f37186B
            r3 = -1950804517(0xffffffff8bb915db, float:-7.129229E-32)
            r10.X(r3)
            boolean r3 = r10.l(r1)
            kotlin.jvm.functions.Function0 r4 = r0.C
            boolean r4 = r10.W(r4)
            r3 = r3 | r4
            kotlin.jvm.functions.Function0 r4 = r0.C
            java.lang.Object r5 = r44.g()
            if (r3 != 0) goto L_0x065c
            java.lang.Object r3 = r11.a()
            if (r5 != r3) goto L_0x0665
        L_0x065c:
            com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardScreenKt$ScreenImpl$1$6$1
            r3 = 0
            r5.<init>(r1, r4, r3)
            r10.N(r5)
        L_0x0665:
            r4 = r5
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r44.M()
            r6 = 0
            r7 = 6
            r3 = 0
            r5 = 0
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r44
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0680
            androidx.compose.runtime.ComposerKt.X()
        L_0x0680:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCardScreenKt$ScreenImpl$1.s(androidx.compose.runtime.Composer, int):void");
    }
}
