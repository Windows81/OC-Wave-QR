package com.hansecom.abt.presentation.screens.auth.register.userInfoStep;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RegisterUserInfoStepScreenKt {
    public static final Unit A(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Register.Action.UserInfoStep.LastNameChange(str));
        return Unit.f40552a;
    }

    public static final Unit B(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(Register.Action.UserInfoStep.ContinueStep.f34364a);
        return Unit.f40552a;
    }

    public static final Unit C(Register.State.UserInfoStep userInfoStep, Function1 function1, int i2, Composer composer, int i3) {
        r(userInfoStep, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void n(RegisterViewModel registerViewModel, Composer composer, int i2) {
        int i3;
        Intrinsics.i(registerViewModel, "viewModel");
        Composer q2 = composer.q(1473641536);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(registerViewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1473641536, i3, -1, "com.hansecom.abt.presentation.screens.auth.register.userInfoStep.RegisterUserInfoStepScreen (RegisterUserInfoStepScreen.kt:42)");
            }
            Register.State.UserInfoStep e2 = o(registerViewModel.q((LifecycleOwner) null, (Lifecycle.State) null, q2, (i3 << 6) & 896, 3)).e();
            q2.X(-1493886697);
            boolean l2 = q2.l(registerViewModel);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new a(registerViewModel);
                q2.N(g2);
            }
            q2.M();
            r(e2, (Function1) g2, q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new e(registerViewModel, i2));
        }
    }

    public static final Register.State o(State state) {
        return (Register.State) state.getValue();
    }

    public static final Unit p(RegisterViewModel registerViewModel, Register.Action.UserInfoStep userInfoStep) {
        Intrinsics.i(userInfoStep, "it");
        registerViewModel.k(userInfoStep);
        return Unit.f40552a;
    }

    public static final Unit q(RegisterViewModel registerViewModel, int i2, Composer composer, int i3) {
        n(registerViewModel, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(com.hansecom.abt.presentation.screens.auth.register.Register.State.UserInfoStep r45, kotlin.jvm.functions.Function1 r46, androidx.compose.runtime.Composer r47, int r48) {
        /*
            r0 = r45
            r1 = r46
            r2 = r48
            r3 = 302123323(0x1202093b, float:4.1032145E-28)
            r4 = r47
            androidx.compose.runtime.Composer r15 = r4.q(r3)
            r4 = r2 & 6
            r5 = 2
            if (r4 != 0) goto L_0x001f
            boolean r4 = r15.W(r0)
            if (r4 == 0) goto L_0x001c
            r4 = 4
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            r4 = r4 | r2
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = r2 & 48
            if (r6 != 0) goto L_0x0030
            boolean r6 = r15.l(r1)
            if (r6 == 0) goto L_0x002d
            r6 = 32
            goto L_0x002f
        L_0x002d:
            r6 = 16
        L_0x002f:
            r4 = r4 | r6
        L_0x0030:
            r12 = r4
            r4 = r12 & 19
            r6 = 18
            if (r4 != r6) goto L_0x0044
            boolean r4 = r15.t()
            if (r4 != 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            r15.B()
            r0 = r15
            goto L_0x0691
        L_0x0044:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0050
            r4 = -1
            java.lang.String r6 = "com.hansecom.abt.presentation.screens.auth.register.userInfoStep.ScreenImpl (RegisterUserInfoStepScreen.kt:55)"
            androidx.compose.runtime.ComposerKt.Y(r3, r12, r4, r6)
        L_0x0050:
            r3 = -343905223(0xffffffffeb806c39, float:-3.1050714E26)
            r15.X(r3)
            r3 = -343906188(0xffffffffeb806874, float:-3.1047154E26)
            r15.X(r3)
            java.lang.Object r3 = r15.g()
            androidx.compose.runtime.Composer$Companion r24 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r24.a()
            if (r3 != r4) goto L_0x0070
            androidx.compose.ui.focus.FocusRequester r3 = new androidx.compose.ui.focus.FocusRequester
            r3.<init>()
            r15.N(r3)
        L_0x0070:
            androidx.compose.ui.focus.FocusRequester r3 = (androidx.compose.ui.focus.FocusRequester) r3
            r15.M()
            r11 = 0
            com.hansecom.abt.util.FocusRequesterExtKt.b(r3, r15, r11)
            r15.M()
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r4 = r15.C(r4)
            r10 = r4
            androidx.compose.ui.focus.FocusManager r10 = (androidx.compose.ui.focus.FocusManager) r10
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            r9 = 0
            r6 = 1
            r7 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.f(r8, r9, r6, r7)
            java.lang.String r13 = "RegisterUserInfoStepScreen"
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.platform.TestTagKt.a(r4, r13)
            com.hansecom.abt.ui.theme.Dimensions r25 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r13 = r25.c()
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r4, r13, r9, r5, r7)
            androidx.compose.foundation.ScrollState r17 = androidx.compose.foundation.ScrollKt.c(r11, r15, r11, r6)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.ScrollKt.g(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.Arrangement r13 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r5 = r13.g()
            androidx.compose.ui.Alignment$Companion r26 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r6 = r26.k()
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.ColumnKt.a(r5, r6, r15, r11)
            int r6 = androidx.compose.runtime.ComposablesKt.a(r15, r11)
            androidx.compose.runtime.CompositionLocalMap r7 = r15.I()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r15, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r9 = r18.a()
            androidx.compose.runtime.Applier r20 = r15.v()
            if (r20 != 0) goto L_0x00dd
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00dd:
            r15.s()
            boolean r20 = r15.n()
            if (r20 == 0) goto L_0x00ea
            r15.y(r9)
            goto L_0x00ed
        L_0x00ea:
            r15.K()
        L_0x00ed:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r14 = r18.c()
            androidx.compose.runtime.Updater.g(r9, r5, r14)
            kotlin.jvm.functions.Function2 r5 = r18.e()
            androidx.compose.runtime.Updater.g(r9, r7, r5)
            kotlin.jvm.functions.Function2 r5 = r18.b()
            boolean r7 = r9.n()
            if (r7 != 0) goto L_0x0117
            java.lang.Object r7 = r9.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r14)
            if (r7 != 0) goto L_0x0125
        L_0x0117:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.N(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.A(r6, r5)
        L_0x0125:
            kotlin.jvm.functions.Function2 r5 = r18.d()
            androidx.compose.runtime.Updater.g(r9, r4, r5)
            androidx.compose.foundation.layout.ColumnScopeInstance r14 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r4 = com.hansecom.abt.R.string.X8
            java.lang.String r21 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r15, r11)
            int r4 = com.hansecom.abt.R.string.j9
            java.lang.String r22 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r15, r11)
            r23 = 0
            r27 = 79
            r4 = 0
            r5 = 0
            r6 = 0
            r28 = 0
            r30 = 0
            r9 = 1
            r32 = r8
            r8 = r28
            r33 = r10
            r10 = r21
            r11 = r22
            r28 = r12
            r12 = r30
            r34 = r13
            r13 = r15
            r47 = r14
            r14 = r23
            r0 = r15
            r15 = r27
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            r15 = r32
            r9 = 0
            r12 = 1
            r14 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r15, r14, r12, r9)
            r5 = 8
            float r5 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            r6 = r34
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r5 = r6.n(r5)
            androidx.compose.ui.Alignment$Horizontal r6 = r26.k()
            r8 = 6
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.ColumnKt.a(r5, r6, r0, r8)
            r7 = 0
            int r6 = androidx.compose.runtime.ComposablesKt.a(r0, r7)
            androidx.compose.runtime.CompositionLocalMap r10 = r0.I()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r0, r4)
            kotlin.jvm.functions.Function0 r11 = r18.a()
            androidx.compose.runtime.Applier r13 = r0.v()
            if (r13 != 0) goto L_0x019b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x019b:
            r0.s()
            boolean r13 = r0.n()
            if (r13 == 0) goto L_0x01a8
            r0.y(r11)
            goto L_0x01ab
        L_0x01a8:
            r0.K()
        L_0x01ab:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r0)
            kotlin.jvm.functions.Function2 r13 = r18.c()
            androidx.compose.runtime.Updater.g(r11, r5, r13)
            kotlin.jvm.functions.Function2 r5 = r18.e()
            androidx.compose.runtime.Updater.g(r11, r10, r5)
            kotlin.jvm.functions.Function2 r5 = r18.b()
            boolean r10 = r11.n()
            if (r10 != 0) goto L_0x01d5
            java.lang.Object r10 = r11.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r13)
            if (r10 != 0) goto L_0x01e3
        L_0x01d5:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r11.N(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.A(r6, r5)
        L_0x01e3:
            kotlin.jvm.functions.Function2 r5 = r18.d()
            androidx.compose.runtime.Updater.g(r11, r4, r5)
            r4 = 624284985(0x2535d539, float:1.577149E-16)
            r0.X(r4)
            boolean r4 = r45.i()
            if (r4 == 0) goto L_0x0272
            java.lang.String r4 = r45.h()
            int r6 = com.hansecom.abt.R.string.V8
            int r5 = com.hansecom.abt.R.string.W8
            java.lang.String r19 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r0, r7)
            com.hansecom.abt.util.resourcesResolvers.StringValue r20 = r45.j()
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.h(r15, r14, r12, r9)
            java.lang.String r10 = "first_name"
            androidx.compose.ui.Modifier r27 = androidx.compose.ui.platform.TestTagKt.a(r5, r10)
            androidx.compose.ui.text.input.ImeAction$Companion r5 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r29 = r5.d()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r5 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r30 = r5.e()
            androidx.compose.ui.autofill.ContentType$Companion r5 = androidx.compose.ui.autofill.ContentType.f15598a
            androidx.compose.ui.autofill.ContentType r31 = r5.i()
            r5 = 624289105(0x2535e551, float:1.5776943E-16)
            r0.X(r5)
            r5 = r28 & 112(0x70, float:1.57E-43)
            r13 = 32
            if (r5 != r13) goto L_0x0230
            r11 = r12
            goto L_0x0231
        L_0x0230:
            r11 = r7
        L_0x0231:
            java.lang.Object r5 = r0.g()
            if (r11 != 0) goto L_0x023d
            java.lang.Object r10 = r24.a()
            if (r5 != r10) goto L_0x0245
        L_0x023d:
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.f r5 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.f
            r5.<init>(r1)
            r0.N(r5)
        L_0x0245:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0.M()
            r22 = 54
            r23 = 29376(0x72c0, float:4.1165E-41)
            r10 = 0
            r11 = 0
            r16 = 0
            r13 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 24576(0x6000, float:3.4438E-41)
            r7 = r20
            r8 = r27
            r9 = r19
            r12 = r3
            r3 = r14
            r14 = r30
            r35 = r15
            r15 = r29
            r19 = r31
            r20 = r0
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0275
        L_0x0272:
            r3 = r14
            r35 = r15
        L_0x0275:
            r0.M()
            r4 = 624314133(0x25364715, float:1.5810067E-16)
            r0.X(r4)
            boolean r4 = r45.n()
            if (r4 == 0) goto L_0x0304
            java.lang.String r4 = r45.l()
            int r6 = com.hansecom.abt.R.string.Z8
            int r5 = com.hansecom.abt.R.string.W8
            r15 = 0
            java.lang.String r9 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r0, r15)
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r45.o()
            r14 = r35
            r8 = 1
            r13 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.h(r14, r3, r8, r13)
            java.lang.String r10 = "last_name"
            androidx.compose.ui.Modifier r19 = androidx.compose.ui.platform.TestTagKt.a(r5, r10)
            androidx.compose.ui.text.input.ImeAction$Companion r5 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r20 = r5.d()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r5 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r27 = r5.e()
            androidx.compose.ui.autofill.ContentType$Companion r5 = androidx.compose.ui.autofill.ContentType.f15598a
            androidx.compose.ui.autofill.ContentType r29 = r5.j()
            r5 = 624318256(0x25365730, float:1.5815524E-16)
            r0.X(r5)
            r5 = r28 & 112(0x70, float:1.57E-43)
            r12 = 32
            if (r5 != r12) goto L_0x02c3
            r11 = r8
            goto L_0x02c4
        L_0x02c3:
            r11 = r15
        L_0x02c4:
            java.lang.Object r5 = r0.g()
            if (r11 != 0) goto L_0x02d0
            java.lang.Object r10 = r24.a()
            if (r5 != r10) goto L_0x02d8
        L_0x02d0:
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.h r5 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.h
            r5.<init>(r1)
            r0.N(r5)
        L_0x02d8:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0.M()
            r22 = 54
            r23 = 29632(0x73c0, float:4.1523E-41)
            r10 = 0
            r11 = 0
            r16 = 0
            r12 = r16
            r16 = 0
            r13 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 24576(0x6000, float:3.4438E-41)
            r8 = r19
            r36 = r14
            r14 = r27
            r3 = r15
            r15 = r20
            r19 = r29
            r20 = r0
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0307
        L_0x0304:
            r36 = r35
            r3 = 0
        L_0x0307:
            r0.M()
            r4 = 624341157(0x2536b0a5, float:1.5845833E-16)
            r0.X(r4)
            boolean r4 = r45.x()
            if (r4 == 0) goto L_0x0393
            java.lang.String r4 = r45.w()
            int r6 = com.hansecom.abt.R.string.g9
            int r5 = com.hansecom.abt.R.string.i9
            java.lang.String r9 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r0, r3)
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r45.y()
            r15 = r36
            r5 = 0
            r8 = 0
            r13 = 1
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.h(r15, r5, r13, r8)
            java.lang.String r5 = "phone"
            androidx.compose.ui.Modifier r19 = androidx.compose.ui.platform.TestTagKt.a(r10, r5)
            androidx.compose.ui.text.input.ImeAction$Companion r5 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r20 = r5.d()
            androidx.compose.ui.text.input.KeyboardType$Companion r5 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r27 = r5.g()
            androidx.compose.ui.autofill.ContentType$Companion r5 = androidx.compose.ui.autofill.ContentType.f15598a
            androidx.compose.ui.autofill.ContentType r29 = r5.k()
            r5 = 624345491(0x2536c193, float:1.5851569E-16)
            r0.X(r5)
            r5 = r28 & 112(0x70, float:1.57E-43)
            r14 = 32
            if (r5 != r14) goto L_0x0355
            r11 = r13
            goto L_0x0356
        L_0x0355:
            r11 = r3
        L_0x0356:
            java.lang.Object r5 = r0.g()
            if (r11 != 0) goto L_0x0362
            java.lang.Object r10 = r24.a()
            if (r5 != r10) goto L_0x036a
        L_0x0362:
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.i r5 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.i
            r5.<init>(r1)
            r0.N(r5)
        L_0x036a:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0.M()
            r22 = 48
            r23 = 30144(0x75c0, float:4.2241E-41)
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 805330944(0x30006000, float:4.6702553E-10)
            r8 = r19
            r13 = r27
            r37 = r15
            r15 = r20
            r19 = r29
            r20 = r0
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0395
        L_0x0393:
            r37 = r36
        L_0x0395:
            r0.M()
            java.lang.String r4 = r45.c()
            int r6 = com.hansecom.abt.R.string.S8
            int r5 = com.hansecom.abt.R.string.T8
            java.lang.String r9 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r0, r3)
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r45.g()
            r15 = r37
            r5 = 0
            r8 = 0
            r13 = 1
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.h(r15, r5, r13, r8)
            java.lang.String r5 = "email"
            androidx.compose.ui.Modifier r19 = androidx.compose.ui.platform.TestTagKt.a(r10, r5)
            androidx.compose.ui.text.input.ImeAction$Companion r27 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r20 = r27.d()
            androidx.compose.ui.text.input.KeyboardType$Companion r29 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r30 = r29.c()
            androidx.compose.ui.autofill.ContentType$Companion r31 = androidx.compose.ui.autofill.ContentType.f15598a
            androidx.compose.ui.autofill.ContentType r5 = r31.g()
            androidx.compose.ui.autofill.ContentType r10 = r31.e()
            androidx.compose.ui.autofill.ContentType r32 = r5.a(r10)
            r5 = 624370029(0x2537216d, float:1.5884045E-16)
            r0.X(r5)
            r14 = r28 & 112(0x70, float:1.57E-43)
            r12 = 32
            if (r14 != r12) goto L_0x03df
            r11 = r13
            goto L_0x03e0
        L_0x03df:
            r11 = r3
        L_0x03e0:
            java.lang.Object r5 = r0.g()
            if (r11 != 0) goto L_0x03ec
            java.lang.Object r10 = r24.a()
            if (r5 != r10) goto L_0x03f4
        L_0x03ec:
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.j r5 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.j
            r5.<init>(r1)
            r0.N(r5)
        L_0x03f4:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0.M()
            r22 = 48
            r23 = 30144(0x75c0, float:4.2241E-41)
            r10 = 0
            r11 = 0
            r16 = 0
            r12 = r16
            r16 = 0
            r38 = r14
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 805330944(0x30006000, float:4.6702553E-10)
            r8 = r19
            r13 = r30
            r39 = r15
            r15 = r20
            r19 = r32
            r20 = r0
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4 = 624391015(0x25377367, float:1.591182E-16)
            r0.X(r4)
            boolean r4 = r45.d()
            if (r4 == 0) goto L_0x04a9
            java.lang.String r4 = r45.f()
            int r6 = com.hansecom.abt.R.string.P8
            int r5 = com.hansecom.abt.R.string.Q8
            java.lang.String r9 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r0, r3)
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = r45.e()
            r15 = r39
            r5 = 0
            r8 = 0
            r13 = 1
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.h(r15, r5, r13, r8)
            java.lang.String r5 = "email_confirm"
            androidx.compose.ui.Modifier r19 = androidx.compose.ui.platform.TestTagKt.a(r10, r5)
            int r20 = r27.d()
            int r28 = r29.c()
            androidx.compose.ui.autofill.ContentType r29 = r31.e()
            r5 = 624395540(0x25378514, float:1.5917808E-16)
            r0.X(r5)
            r12 = r38
            r14 = 32
            if (r12 != r14) goto L_0x0466
            r11 = r13
            goto L_0x0467
        L_0x0466:
            r11 = r3
        L_0x0467:
            java.lang.Object r5 = r0.g()
            if (r11 != 0) goto L_0x0473
            java.lang.Object r10 = r24.a()
            if (r5 != r10) goto L_0x047b
        L_0x0473:
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.k r5 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.k
            r5.<init>(r1)
            r0.N(r5)
        L_0x047b:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0.M()
            r22 = 48
            r23 = 30144(0x75c0, float:4.2241E-41)
            r10 = 0
            r11 = 0
            r16 = 0
            r40 = r12
            r12 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 805330944(0x30006000, float:4.6702553E-10)
            r8 = r19
            r13 = r28
            r41 = r15
            r15 = r20
            r19 = r29
            r20 = r0
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x04ad
        L_0x04a9:
            r40 = r38
            r41 = r39
        L_0x04ad:
            r0.M()
            java.lang.String r4 = r45.p()
            boolean r6 = r45.v()
            int r8 = com.hansecom.abt.R.string.e9
            int r5 = com.hansecom.abt.R.string.f9
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r0, r3)
            com.hansecom.abt.util.resourcesResolvers.StringValue r9 = r45.u()
            r12 = r41
            r5 = 0
            r10 = 1
            r15 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r12, r5, r10, r15)
            java.lang.String r5 = "password"
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.platform.TestTagKt.a(r7, r5)
            int r17 = r27.d()
            androidx.compose.ui.autofill.ContentType r21 = r31.f()
            r5 = 624421008(0x2537e890, float:1.5951515E-16)
            r0.X(r5)
            r14 = r40
            r5 = 32
            if (r14 != r5) goto L_0x04e9
            r7 = r10
            goto L_0x04ea
        L_0x04e9:
            r7 = r3
        L_0x04ea:
            java.lang.Object r13 = r0.g()
            if (r7 != 0) goto L_0x04f6
            java.lang.Object r7 = r24.a()
            if (r13 != r7) goto L_0x04fe
        L_0x04f6:
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.l r13 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.l
            r13.<init>(r1)
            r0.N(r13)
        L_0x04fe:
            r22 = r13
            kotlin.jvm.functions.Function1 r22 = (kotlin.jvm.functions.Function1) r22
            r0.M()
            r7 = 624425718(0x2537faf6, float:1.5957749E-16)
            r0.X(r7)
            if (r14 != r5) goto L_0x050f
            r7 = r10
            goto L_0x0510
        L_0x050f:
            r7 = r3
        L_0x0510:
            java.lang.Object r13 = r0.g()
            if (r7 != 0) goto L_0x051c
            java.lang.Object r7 = r24.a()
            if (r13 != r7) goto L_0x0524
        L_0x051c:
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.m r13 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.m
            r13.<init>(r1)
            r0.N(r13)
        L_0x0524:
            r7 = r13
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r0.M()
            r19 = 0
            r20 = 3584(0xe00, float:5.022E-42)
            r13 = 0
            r18 = 0
            r42 = r14
            r14 = r18
            r18 = 0
            r15 = r18
            r18 = 102236160(0x6180000, float:2.8588023E-35)
            r5 = r22
            r10 = r16
            r43 = r12
            r12 = r17
            r16 = r21
            r17 = r0
            com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt.f(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4 = 624445010(0x25384652, float:1.5983281E-16)
            r0.X(r4)
            boolean r4 = r45.q()
            if (r4 == 0) goto L_0x05f0
            java.lang.String r4 = r45.t()
            boolean r6 = r45.s()
            int r8 = com.hansecom.abt.R.string.b9
            int r5 = com.hansecom.abt.R.string.c9
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r0, r3)
            com.hansecom.abt.util.resourcesResolvers.StringValue r9 = r45.r()
            r12 = r43
            r5 = 0
            r10 = 1
            r15 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r12, r5, r10, r15)
            java.lang.String r5 = "password_confirm"
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.platform.TestTagKt.a(r7, r5)
            int r17 = r27.b()
            androidx.compose.ui.autofill.ContentType r21 = r31.f()
            r5 = 624449559(0x25385817, float:1.5989302E-16)
            r0.X(r5)
            r14 = r42
            r5 = 32
            if (r14 != r5) goto L_0x058f
            r7 = r10
            goto L_0x0590
        L_0x058f:
            r7 = r3
        L_0x0590:
            java.lang.Object r13 = r0.g()
            if (r7 != 0) goto L_0x059c
            java.lang.Object r7 = r24.a()
            if (r13 != r7) goto L_0x05a4
        L_0x059c:
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.b r13 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.b
            r13.<init>(r1)
            r0.N(r13)
        L_0x05a4:
            r22 = r13
            kotlin.jvm.functions.Function1 r22 = (kotlin.jvm.functions.Function1) r22
            r0.M()
            r7 = 624454973(0x25386d3d, float:1.5996467E-16)
            r0.X(r7)
            if (r14 != r5) goto L_0x05b5
            r7 = r10
            goto L_0x05b6
        L_0x05b5:
            r7 = r3
        L_0x05b6:
            java.lang.Object r13 = r0.g()
            if (r7 != 0) goto L_0x05c2
            java.lang.Object r7 = r24.a()
            if (r13 != r7) goto L_0x05ca
        L_0x05c2:
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.c r13 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.c
            r13.<init>(r1)
            r0.N(r13)
        L_0x05ca:
            r7 = r13
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r0.M()
            r19 = 0
            r20 = 3584(0xe00, float:5.022E-42)
            r13 = 0
            r18 = 0
            r44 = r14
            r14 = r18
            r18 = 0
            r15 = r18
            r18 = 102236160(0x6180000, float:2.8588023E-35)
            r5 = r22
            r10 = r16
            r3 = r12
            r12 = r17
            r16 = r21
            r17 = r0
            com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt.f(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x05f4
        L_0x05f0:
            r44 = r42
            r3 = r43
        L_0x05f4:
            r0.M()
            r0.T()
            r4 = 16
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.i(r3, r4)
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r4, r0, r14)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r47
            r17 = r3
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.ColumnScope.c(r16, r17, r18, r19, r20, r21)
            r5 = 0
            androidx.compose.foundation.layout.SpacerKt.a(r4, r0, r5)
            int r4 = com.hansecom.abt.R.string.N8
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r0, r5)
            r4 = 0
            r6 = 1
            r7 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r3, r4, r6, r7)
            androidx.compose.ui.Alignment$Horizontal r7 = r26.g()
            r9 = r47
            androidx.compose.ui.Modifier r4 = r9.b(r4, r7)
            java.lang.String r7 = "continue"
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.TestTagKt.a(r4, r7)
            r4 = -226529231(0xfffffffff27f7031, float:-5.0594757E30)
            r0.X(r4)
            r4 = r33
            boolean r9 = r0.l(r4)
            r11 = r44
            r10 = 32
            if (r11 != r10) goto L_0x064e
            r11 = r6
            goto L_0x064f
        L_0x064e:
            r11 = r5
        L_0x064f:
            r5 = r9 | r11
            java.lang.Object r6 = r0.g()
            if (r5 != 0) goto L_0x065d
            java.lang.Object r5 = r24.a()
            if (r6 != r5) goto L_0x0665
        L_0x065d:
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.d r6 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.d
            r6.<init>(r4, r1)
            r0.N(r6)
        L_0x0665:
            r4 = r6
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r0.M()
            r12 = 0
            r13 = 108(0x6c, float:1.51E-43)
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r7
            r7 = r9
            r9 = r10
            r10 = r11
            r11 = r0
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            float r4 = r25.a()
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.i(r3, r4)
            androidx.compose.foundation.layout.SpacerKt.a(r3, r0, r14)
            r0.T()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0691
            androidx.compose.runtime.ComposerKt.X()
        L_0x0691:
            androidx.compose.runtime.ScopeUpdateScope r0 = r0.x()
            if (r0 == 0) goto L_0x06a1
            com.hansecom.abt.presentation.screens.auth.register.userInfoStep.g r3 = new com.hansecom.abt.presentation.screens.auth.register.userInfoStep.g
            r4 = r45
            r3.<init>(r4, r1, r2)
            r0.a(r3)
        L_0x06a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.userInfoStep.RegisterUserInfoStepScreenKt.r(com.hansecom.abt.presentation.screens.auth.register.Register$State$UserInfoStep, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit s(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Register.Action.UserInfoStep.PhoneNumberChange(str));
        return Unit.f40552a;
    }

    public static final Unit t(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Register.Action.UserInfoStep.EmailChange(str));
        return Unit.f40552a;
    }

    public static final Unit u(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Register.Action.UserInfoStep.EmailConfirmChange(str));
        return Unit.f40552a;
    }

    public static final Unit v(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Register.Action.UserInfoStep.PasswordChange(str));
        return Unit.f40552a;
    }

    public static final Unit w(Function1 function1) {
        function1.invoke(Register.Action.UserInfoStep.PasswordVisibilityToggle.f34372a);
        return Unit.f40552a;
    }

    public static final Unit x(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Register.Action.UserInfoStep.PasswordConfirmChange(str));
        return Unit.f40552a;
    }

    public static final Unit y(Function1 function1) {
        function1.invoke(Register.Action.UserInfoStep.PasswordConfirmVisibilityToggle.f34371a);
        return Unit.f40552a;
    }

    public static final Unit z(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Register.Action.UserInfoStep.FirstNameChange(str));
        return Unit.f40552a;
    }
}
