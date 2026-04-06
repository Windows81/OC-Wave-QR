package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CheckFareMediaBalanceScreenKt$ScreenImpl$3 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34720A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusManager f34721B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CheckFareMediaBalance.State f34722z;

    public CheckFareMediaBalanceScreenKt$ScreenImpl$3(CheckFareMediaBalance.State state, Function1 function1, FocusManager focusManager) {
        this.f34722z = state;
        this.f34720A = function1;
        this.f34721B = focusManager;
    }

    /* access modifiers changed from: private */
    public static final Unit g(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new CheckFareMediaBalance.Action.CardNumberChange(str));
        return Unit.f40552a;
    }

    public static final Unit h(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new CheckFareMediaBalance.Action.CodeChange(str));
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(CheckFareMediaBalance.Action.Confirm.f34712a);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        f((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(androidx.compose.foundation.layout.PaddingValues r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r15 = r33
            java.lang.String r2 = "innerPadding"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r2 = r34 & 6
            r3 = 2
            if (r2 != 0) goto L_0x001c
            boolean r2 = r15.W(r1)
            if (r2 == 0) goto L_0x0018
            r2 = 4
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            r2 = r34 | r2
            goto L_0x001e
        L_0x001c:
            r2 = r34
        L_0x001e:
            r4 = r2 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0030
            boolean r4 = r33.t()
            if (r4 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r33.B()
            goto L_0x02c6
        L_0x0030:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x003f
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.ScreenImpl.<anonymous> (CheckFareMediaBalanceScreen.kt:85)"
            r6 = -201619178(0xfffffffff3fb8916, float:-3.985739E31)
            androidx.compose.runtime.ComposerKt.Y(r6, r2, r4, r5)
        L_0x003f:
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            r13 = 0
            r12 = 1
            r11 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.f(r14, r13, r12, r11)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.PaddingKt.h(r2, r1)
            r2 = 0
            androidx.compose.foundation.ScrollState r5 = androidx.compose.foundation.ScrollKt.c(r2, r15, r2, r12)
            r9 = 14
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r4, r5, r6, r7, r8, r9, r10)
            com.hansecom.abt.ui.theme.Dimensions r4 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r5 = r4.c()
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r1, r5, r13, r3, r11)
            float r18 = r4.d()
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance$State r10 = r0.f34722z
            kotlin.jvm.functions.Function1 r9 = r0.f34720A
            androidx.compose.ui.focus.FocusManager r8 = r0.f34721B
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.g()
            androidx.compose.ui.Alignment$Companion r4 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r4 = r4.k()
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.ColumnKt.a(r3, r4, r15, r2)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r15, r2)
            androidx.compose.runtime.CompositionLocalMap r5 = r33.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r16 = r33.v()
            if (r16 != 0) goto L_0x00a8
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00a8:
            r33.s()
            boolean r16 = r33.n()
            if (r16 == 0) goto L_0x00b5
            r15.y(r7)
            goto L_0x00b8
        L_0x00b5:
            r33.K()
        L_0x00b8:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r33)
            kotlin.jvm.functions.Function2 r11 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r3, r11)
            kotlin.jvm.functions.Function2 r3 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r5, r3)
            kotlin.jvm.functions.Function2 r3 = r6.b()
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x00e2
            java.lang.Object r5 = r7.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r11)
            if (r5 != 0) goto L_0x00f0
        L_0x00e2:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.A(r4, r3)
        L_0x00f0:
            kotlin.jvm.functions.Function2 r3 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r1, r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r21 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.lang.String r1 = r10.c()
            boolean r3 = r10.j()
            r11 = r3 ^ 1
            int r3 = r10.e()
            int r4 = com.hansecom.abt.R.string.z2
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r4, r5, r15, r2)
            int r5 = com.hansecom.abt.R.string.B2
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r7 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r6, r15, r2)
            com.hansecom.abt.util.resourcesResolvers.StringValue r5 = r10.d()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r5, r6, r15, r2)
            r6 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r14, r13, r12, r6)
            java.lang.String r6 = "card_number"
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.platform.TestTagKt.a(r2, r6)
            androidx.compose.ui.text.input.ImeAction$Companion r16 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r17 = r16.d()
            r2 = 204054144(0xc299e80, float:1.3066983E-31)
            r15.X(r2)
            boolean r2 = r15.W(r9)
            java.lang.Object r12 = r33.g()
            if (r2 != 0) goto L_0x014a
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r12 != r2) goto L_0x0152
        L_0x014a:
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.e r12 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.e
            r12.<init>(r9)
            r15.N(r12)
        L_0x0152:
            r2 = r12
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r33.M()
            r19 = 0
            r20 = 1152(0x480, float:1.614E-42)
            r12 = 0
            r22 = 0
            r23 = 805502976(0x30030000, float:4.765752E-10)
            r25 = 0
            r26 = r8
            r8 = r12
            r12 = r9
            r9 = r11
            r11 = r10
            r10 = r17
            r32 = r11
            r11 = r22
            r27 = r12
            r12 = r33
            r13 = r23
            r28 = r14
            r14 = r19
            r0 = r15
            r15 = r20
            com.hansecom.abt.ui.components.formFields.CardNumberFieldKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r12 = r28
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            r10 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r10)
            java.lang.String r1 = r32.h()
            boolean r2 = r32.j()
            r7 = 1
            r17 = r2 ^ 1
            int r3 = com.hansecom.abt.R.string.D2
            int r2 = com.hansecom.abt.R.string.E2
            r6 = 0
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r22 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r4, r0, r6)
            com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r32.i()
            r5 = 0
            r15 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r12, r5, r7, r15)
            java.lang.String r8 = "code"
            androidx.compose.ui.Modifier r23 = androidx.compose.ui.platform.TestTagKt.a(r2, r8)
            int r24 = r16.b()
            androidx.compose.ui.text.input.KeyboardType$Companion r2 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r25 = r2.d()
            r2 = 204080506(0xc2a057a, float:1.3097972E-31)
            r0.X(r2)
            r14 = r27
            boolean r2 = r0.W(r14)
            java.lang.Object r8 = r33.g()
            if (r2 != 0) goto L_0x01da
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x01e2
        L_0x01da:
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.f r8 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.f
            r8.<init>(r14)
            r0.N(r8)
        L_0x01e2:
            r2 = r8
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r33.M()
            r19 = 48
            r20 = 62848(0xf580, float:8.8069E-41)
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r29 = r14
            r14 = r16
            r15 = r16
            r18 = 805330944(0x30006000, float:4.6702553E-10)
            r5 = r23
            r6 = r22
            r7 = r17
            r10 = r25
            r30 = r12
            r12 = r24
            r17 = r33
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = 24
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r11 = r30
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r11, r1)
            r12 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r12)
            int r1 = com.hansecom.abt.R.string.C2
            r13 = 0
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r0, r13)
            r10 = 0
            r14 = 0
            r15 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r11, r14, r15, r10)
            boolean r1 = r32.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r4 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r10, r1, r15, r10)
            r1 = 204108433(0xc2a7291, float:1.31308E-31)
            r0.X(r1)
            r1 = r26
            boolean r3 = r0.l(r1)
            r6 = r29
            boolean r7 = r0.W(r6)
            r3 = r3 | r7
            java.lang.Object r7 = r33.g()
            if (r3 != 0) goto L_0x025b
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x0263
        L_0x025b:
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.g r7 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.g
            r7.<init>(r1, r6)
            r0.N(r7)
        L_0x0263:
            r1 = r7
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r33.M()
            r9 = 48
            r16 = 100
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = r33
            r13 = r10
            r10 = r16
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 32
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r11, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r12)
            java.lang.String r1 = r32.f()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0292
            r2 = r15
            goto L_0x0293
        L_0x0292:
            r2 = 0
        L_0x0293:
            r1 = 3
            androidx.compose.animation.EnterTransition r4 = androidx.compose.animation.EnterExitTransitionKt.o(r13, r14, r1, r13)
            androidx.compose.animation.ExitTransition r5 = androidx.compose.animation.EnterExitTransitionKt.q(r13, r14, r1, r13)
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$3$1$4 r1 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$3$1$4
            r3 = r32
            r1.<init>(r3)
            r3 = 54
            r6 = 93070820(0x58c25e4, float:1.3179456E-35)
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r15, r1, r0, r3)
            r9 = 1600518(0x186c06, float:2.242803E-39)
            r10 = 18
            r3 = 0
            r6 = 0
            r1 = r21
            r8 = r33
            androidx.compose.animation.AnimatedVisibilityKt.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r33.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02c6
            androidx.compose.runtime.ComposerKt.X()
        L_0x02c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$3.f(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }
}
