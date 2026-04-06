package com.hansecom.abt.presentation.screens.home.account.information;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AccountInformationScreenKt$ScreenImpl$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35445A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusManager f35446B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AccountInformation.State f35447z;

    public AccountInformationScreenKt$ScreenImpl$3(AccountInformation.State state, Function1 function1, FocusManager focusManager) {
        this.f35447z = state;
        this.f35445A = function1;
        this.f35446B = focusManager;
    }

    public static final Unit i(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AccountInformation.Action.FirstNameChange(str));
        return Unit.f40552a;
    }

    public static final Unit k(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AccountInformation.Action.LastNameChange(str));
        return Unit.f40552a;
    }

    public static final Unit p(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AccountInformation.Action.PhoneChange(str));
        return Unit.f40552a;
    }

    public static final Unit q(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit s(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(AccountInformation.Action.Save.f35438a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(androidx.compose.runtime.Composer r40, int r41) {
        /*
            r39 = this;
            r0 = r39
            r15 = r40
            r1 = r41
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r40.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r40.B()
            goto L_0x035e
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.account.information.ScreenImpl.<anonymous> (AccountInformationScreen.kt:67)"
            r5 = -684381283(0xffffffffd7352b9d, float:-1.99198922E14)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            r13 = 0
            r12 = 1
            r11 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.f(r14, r13, r12, r11)
            r2 = 0
            androidx.compose.foundation.ScrollState r5 = androidx.compose.foundation.ScrollKt.c(r2, r15, r2, r12)
            r9 = 14
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r4, r5, r6, r7, r8, r9, r10)
            com.hansecom.abt.ui.theme.Dimensions r21 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r4 = r21.c()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r1, r4, r13, r3, r11)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            r4 = 8
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r3 = r3.n(r4)
            androidx.compose.ui.Alignment$Companion r22 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r4 = r22.g()
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State r10 = r0.f35447z
            kotlin.jvm.functions.Function1 r9 = r0.f35445A
            androidx.compose.ui.focus.FocusManager r8 = r0.f35446B
            r5 = 54
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.ColumnKt.a(r3, r4, r15, r5)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r15, r2)
            androidx.compose.runtime.CompositionLocalMap r5 = r40.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r16 = r40.v()
            if (r16 != 0) goto L_0x0082
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0082:
            r40.s()
            boolean r16 = r40.n()
            if (r16 == 0) goto L_0x008f
            r15.y(r7)
            goto L_0x0092
        L_0x008f:
            r40.K()
        L_0x0092:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r40)
            kotlin.jvm.functions.Function2 r11 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r3, r11)
            kotlin.jvm.functions.Function2 r3 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r5, r3)
            kotlin.jvm.functions.Function2 r3 = r6.b()
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x00bc
            java.lang.Object r5 = r7.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r11)
            if (r5 != 0) goto L_0x00ca
        L_0x00bc:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.A(r4, r3)
        L_0x00ca:
            kotlin.jvm.functions.Function2 r3 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r1, r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r11 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r1 = com.hansecom.abt.R.string.f33052e
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r2)
            int r1 = com.hansecom.abt.R.string.f33061n
            java.lang.String r16 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r2)
            r17 = 0
            r18 = 79
            r1 = 0
            r3 = 0
            r4 = 0
            r19 = 0
            r23 = 0
            r6 = r2
            r2 = r3
            r3 = r4
            r13 = r6
            r5 = r19
            r25 = r8
            r8 = r16
            r26 = r9
            r9 = r23
            r23 = r10
            r10 = r40
            r28 = r11
            r11 = r17
            r12 = r18
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = r23.f()
            int r3 = com.hansecom.abt.R.string.f33050c
            int r2 = com.hansecom.abt.R.string.f33051d
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r15, r13)
            com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r23.h()
            r5 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r14, r5, r12, r11)
            boolean r16 = r23.e()
            androidx.compose.ui.text.input.ImeAction$Companion r24 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r17 = r24.d()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r27 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r29 = r27.e()
            androidx.compose.ui.autofill.ContentType$Companion r30 = androidx.compose.ui.autofill.ContentType.f15598a
            androidx.compose.ui.autofill.ContentType r31 = r30.i()
            r2 = -1485599255(0xffffffffa7738de9, float:-3.3799954E-15)
            r15.X(r2)
            r10 = r26
            boolean r2 = r15.W(r10)
            java.lang.Object r8 = r40.g()
            if (r2 != 0) goto L_0x014d
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x0155
        L_0x014d:
            com.hansecom.abt.presentation.screens.home.account.information.e r8 = new com.hansecom.abt.presentation.screens.home.account.information.e
            r8.<init>(r10)
            r15.N(r8)
        L_0x0155:
            r2 = r8
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r40.M()
            r19 = 54
            r20 = 29568(0x7380, float:4.1434E-41)
            r8 = 0
            r9 = 0
            r18 = 0
            r32 = r10
            r10 = r18
            r18 = 0
            r13 = r18
            r33 = r14
            r14 = r18
            r15 = r18
            r18 = 24576(0x6000, float:3.4438E-41)
            r5 = r7
            r7 = r16
            r11 = r29
            r12 = r17
            r16 = r31
            r17 = r40
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = r23.j()
            int r3 = com.hansecom.abt.R.string.f33053f
            int r2 = com.hansecom.abt.R.string.f33055h
            r12 = r40
            r11 = 0
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r12, r11)
            com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r23.l()
            r7 = r33
            r5 = 0
            r14 = 0
            r15 = 1
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.h(r7, r5, r15, r14)
            boolean r17 = r23.e()
            int r26 = r24.d()
            int r27 = r27.e()
            androidx.compose.ui.autofill.ContentType r29 = r30.j()
            r2 = -1485578264(0xffffffffa773dfe8, float:-3.3844404E-15)
            r12.X(r2)
            r13 = r32
            boolean r2 = r12.W(r13)
            java.lang.Object r8 = r40.g()
            if (r2 != 0) goto L_0x01c7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x01cf
        L_0x01c7:
            com.hansecom.abt.presentation.screens.home.account.information.f r8 = new com.hansecom.abt.presentation.screens.home.account.information.f
            r8.<init>(r13)
            r12.N(r8)
        L_0x01cf:
            r2 = r8
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r40.M()
            r19 = 54
            r20 = 29568(0x7380, float:4.1434E-41)
            r8 = 0
            r9 = 0
            r10 = 0
            r18 = 0
            r34 = r13
            r13 = r18
            r14 = r18
            r15 = r18
            r18 = 24576(0x6000, float:3.4438E-41)
            r5 = r16
            r35 = r7
            r7 = r17
            r11 = r27
            r12 = r26
            r16 = r29
            r17 = r40
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = r23.n()
            int r3 = com.hansecom.abt.R.string.f33056i
            int r2 = com.hansecom.abt.R.string.f33058k
            r12 = r40
            r10 = 0
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r12, r10)
            com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r23.p()
            r7 = r35
            r5 = 0
            r14 = 0
            r15 = 1
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.h(r7, r5, r15, r14)
            boolean r17 = r23.e()
            int r26 = r24.b()
            androidx.compose.ui.text.input.KeyboardType$Companion r27 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r29 = r27.g()
            androidx.compose.ui.autofill.ContentType r31 = r30.k()
            r2 = -1485557339(0xffffffffa77431a5, float:-3.3888715E-15)
            r12.X(r2)
            r13 = r34
            boolean r2 = r12.W(r13)
            java.lang.Object r8 = r40.g()
            if (r2 != 0) goto L_0x0241
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x0249
        L_0x0241:
            com.hansecom.abt.presentation.screens.home.account.information.g r8 = new com.hansecom.abt.presentation.screens.home.account.information.g
            r8.<init>(r13)
            r12.N(r8)
        L_0x0249:
            r2 = r8
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r40.M()
            r19 = 48
            r20 = 30080(0x7580, float:4.2151E-41)
            r8 = 0
            r9 = 0
            r11 = 0
            r18 = 0
            r36 = r13
            r13 = r18
            r14 = r18
            r15 = r18
            r18 = 805330944(0x30006000, float:4.6702553E-10)
            r5 = r16
            r37 = r7
            r7 = r17
            r10 = r29
            r12 = r26
            r16 = r31
            r17 = r40
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = r23.d()
            int r3 = com.hansecom.abt.R.string.f33048a
            r12 = r37
            r5 = 1
            r10 = 0
            r15 = 0
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.h(r12, r10, r5, r15)
            int r17 = r24.b()
            int r24 = r27.c()
            androidx.compose.ui.autofill.ContentType r26 = r30.e()
            r2 = -1485536315(0xffffffffa77483c5, float:-3.3933235E-15)
            r14 = r40
            r14.X(r2)
            java.lang.Object r2 = r40.g()
            androidx.compose.runtime.Composer$Companion r27 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r27.a()
            if (r2 != r4) goto L_0x02ab
            com.hansecom.abt.presentation.screens.home.account.information.h r2 = new com.hansecom.abt.presentation.screens.home.account.information.h
            r2.<init>()
            r14.N(r2)
        L_0x02ab:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r40.M()
            r19 = 48
            r20 = 30112(0x75a0, float:4.2196E-41)
            java.lang.String r4 = ""
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r18 = 0
            r14 = r18
            r15 = r18
            r18 = 806906928(0x30186c30, float:5.545102E-10)
            r5 = r16
            r10 = r24
            r38 = r12
            r12 = r17
            r16 = r26
            r17 = r40
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = 24
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r11 = r38
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r11, r1)
            r12 = 6
            r13 = r40
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r12)
            int r1 = com.hansecom.abt.R.string.f33059l
            r2 = 0
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r2)
            r1 = 0
            r2 = 1
            r3 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r11, r1, r2, r3)
            androidx.compose.ui.Alignment$Horizontal r4 = r22.g()
            r6 = r28
            androidx.compose.ui.Modifier r4 = r6.b(r1, r4)
            boolean r1 = r23.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r6 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r3, r1, r2, r3)
            r1 = -1485513140(0xffffffffa774de4c, float:-3.398231E-15)
            r13.X(r1)
            r1 = r25
            boolean r2 = r13.l(r1)
            r3 = r36
            boolean r7 = r13.W(r3)
            r2 = r2 | r7
            java.lang.Object r7 = r40.g()
            if (r2 != 0) goto L_0x032a
            java.lang.Object r2 = r27.a()
            if (r7 != r2) goto L_0x0332
        L_0x032a:
            com.hansecom.abt.presentation.screens.home.account.information.i r7 = new com.hansecom.abt.presentation.screens.home.account.information.i
            r7.<init>(r1, r3)
            r13.N(r7)
        L_0x0332:
            r1 = r7
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r40.M()
            r9 = 0
            r10 = 100
            r3 = 0
            r7 = 0
            r8 = 0
            r2 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r40
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r1 = r21.e()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r11, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r12)
            r40.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x035e
            androidx.compose.runtime.ComposerKt.X()
        L_0x035e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt$ScreenImpl$3.h(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        h((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
