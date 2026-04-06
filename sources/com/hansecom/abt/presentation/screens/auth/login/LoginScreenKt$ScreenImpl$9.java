package com.hansecom.abt.presentation.screens.auth.login;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.auth.login.Login;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LoginScreenKt$ScreenImpl$9 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34302A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusManager f34303B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Login.State f34304z;

    public LoginScreenKt$ScreenImpl$9(Login.State state, Function1 function1, FocusManager focusManager, Function0 function0, Function0 function02, Function0 function03) {
        this.f34304z = state;
        this.f34302A = function1;
        this.f34303B = focusManager;
        this.C = function0;
        this.D = function02;
        this.E = function03;
    }

    /* access modifiers changed from: private */
    public static final Unit i(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Login.Action.EmailChange(str));
        return Unit.f40552a;
    }

    public static final Unit k(FocusManager focusManager, Function1 function1, KeyboardActionScope keyboardActionScope) {
        Intrinsics.i(keyboardActionScope, "$this$KeyboardActions");
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(Login.Action.C0007Login.f34290a);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit p(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new Login.Action.PasswordChange(str));
        return Unit.f40552a;
    }

    public static final Unit q(Function1 function1) {
        function1.invoke(Login.Action.PasswordContentVisibilityToggle.f34292a);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit s(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(Login.Action.C0007Login.f34290a);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        h((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(androidx.compose.foundation.layout.PaddingValues r47, androidx.compose.runtime.Composer r48, int r49) {
        /*
            r46 = this;
            r0 = r46
            r1 = r47
            r15 = r48
            java.lang.String r2 = "innerPadding"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r2 = r49 & 6
            if (r2 != 0) goto L_0x001b
            boolean r2 = r15.W(r1)
            if (r2 == 0) goto L_0x0017
            r2 = 4
            goto L_0x0018
        L_0x0017:
            r2 = 2
        L_0x0018:
            r2 = r49 | r2
            goto L_0x001d
        L_0x001b:
            r2 = r49
        L_0x001d:
            r3 = r2 & 19
            r4 = 18
            if (r3 != r4) goto L_0x002f
            boolean r3 = r48.t()
            if (r3 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r48.B()
            goto L_0x03de
        L_0x002f:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x003e
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.auth.login.ScreenImpl.<anonymous> (LoginScreen.kt:112)"
            r5 = 1312443353(0x4e3a4bd9, float:7.8138323E8)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x003e:
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = com.hansecom.abt.util.ScaffoldImePaddingKt.a(r14, r1)
            r13 = 0
            r12 = 1
            r11 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.f(r1, r13, r12, r11)
            r10 = 0
            androidx.compose.foundation.ScrollState r3 = androidx.compose.foundation.ScrollKt.c(r10, r15, r10, r12)
            r7 = 14
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r2, r3, r4, r5, r6, r7, r8)
            com.hansecom.abt.ui.theme.Dimensions r2 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r2.c()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.i(r1, r2)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r2 = r2.g()
            com.hansecom.abt.presentation.screens.auth.login.Login$State r9 = r0.f34304z
            kotlin.jvm.functions.Function1 r8 = r0.f34302A
            androidx.compose.ui.focus.FocusManager r7 = r0.f34303B
            kotlin.jvm.functions.Function0 r6 = r0.C
            kotlin.jvm.functions.Function0 r5 = r0.D
            kotlin.jvm.functions.Function0 r4 = r0.E
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.g()
            r11 = 48
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r3, r2, r15, r11)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r10)
            androidx.compose.runtime.CompositionLocalMap r11 = r48.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r12 = r16.a()
            androidx.compose.runtime.Applier r17 = r48.v()
            if (r17 != 0) goto L_0x009d
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009d:
            r48.s()
            boolean r17 = r48.n()
            if (r17 == 0) goto L_0x00aa
            r15.y(r12)
            goto L_0x00ad
        L_0x00aa:
            r48.K()
        L_0x00ad:
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.b(r48)
            kotlin.jvm.functions.Function2 r13 = r16.c()
            androidx.compose.runtime.Updater.g(r12, r2, r13)
            kotlin.jvm.functions.Function2 r2 = r16.e()
            androidx.compose.runtime.Updater.g(r12, r11, r2)
            kotlin.jvm.functions.Function2 r2 = r16.b()
            boolean r11 = r12.n()
            if (r11 != 0) goto L_0x00d7
            java.lang.Object r11 = r12.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r13)
            if (r11 != 0) goto L_0x00e5
        L_0x00d7:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r12.N(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.A(r3, r2)
        L_0x00e5:
            kotlin.jvm.functions.Function2 r2 = r16.d()
            androidx.compose.runtime.Updater.g(r12, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r21 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r1 = 1380154614(0x52437cf6, float:2.0990378E11)
            r15.X(r1)
            boolean r1 = r9.j()
            r11 = 16
            r13 = 6
            if (r1 == 0) goto L_0x0150
            int r1 = com.hansecom.abt.R.drawable.c0
            androidx.compose.ui.graphics.painter.Painter r1 = androidx.compose.ui.res.PainterResources_androidKt.c(r1, r15, r10)
            r2 = 200(0xc8, float:2.8E-43)
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.y(r14, r2)
            r3 = 150(0x96, float:2.1E-43)
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.i(r2, r3)
            r12 = 432(0x1b0, float:6.05E-43)
            r16 = 120(0x78, float:1.68E-43)
            r2 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = r4
            r4 = r18
            r24 = r5
            r5 = r19
            r25 = r6
            r6 = r20
            r26 = r7
            r7 = r22
            r27 = r8
            r8 = r48
            r22 = r9
            r9 = r12
            r12 = r10
            r10 = r16
            androidx.compose.foundation.ImageKt.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r1 = (float) r11
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r13)
            goto L_0x015d
        L_0x0150:
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r22 = r9
            r12 = r10
        L_0x015d:
            r48.M()
            int r1 = com.hansecom.abt.R.string.G9
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r12)
            int r1 = com.hansecom.abt.R.string.P9
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r12)
            float r1 = (float) r11
            float r31 = androidx.compose.ui.unit.Dp.m(r1)
            r32 = 7
            r33 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.e(r28, r29, r30, r31, r32, r33)
            r11 = 48
            r16 = 77
            r1 = 0
            r3 = 0
            r5 = 0
            r9 = 0
            r10 = r48
            r13 = 0
            r0 = r12
            r12 = r16
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = r22.c()
            int r3 = com.hansecom.abt.R.string.D9
            int r2 = com.hansecom.abt.R.string.F9
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r15, r0)
            com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r22.d()
            r2 = 1
            r5 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r14, r5, r2, r13)
            java.lang.String r2 = "email"
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.platform.TestTagKt.a(r7, r2)
            androidx.compose.ui.text.input.KeyboardType$Companion r2 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r12 = r2.c()
            androidx.compose.ui.text.input.ImeAction$Companion r28 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r16 = r28.d()
            androidx.compose.ui.autofill.ContentType$Companion r29 = androidx.compose.ui.autofill.ContentType.f15598a
            androidx.compose.ui.autofill.ContentType r2 = r29.m()
            androidx.compose.ui.autofill.ContentType r7 = r29.e()
            androidx.compose.ui.autofill.ContentType r17 = r2.a(r7)
            r2 = 1380179870(0x5243df9e, float:2.10317574E11)
            r15.X(r2)
            r11 = r27
            boolean r2 = r15.W(r11)
            java.lang.Object r7 = r48.g()
            if (r2 != 0) goto L_0x01e2
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x01ea
        L_0x01e2:
            com.hansecom.abt.presentation.screens.auth.login.l r7 = new com.hansecom.abt.presentation.screens.auth.login.l
            r7.<init>(r11)
            r15.N(r7)
        L_0x01ea:
            r2 = r7
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r48.M()
            r19 = 48
            r20 = 30144(0x75c0, float:4.2241E-41)
            r7 = 0
            r8 = 0
            r9 = 0
            r27 = 0
            r34 = r11
            r11 = r27
            r27 = 0
            r13 = r27
            r18 = 0
            r35 = r14
            r14 = r18
            r15 = r18
            r18 = 805330944(0x30006000, float:4.6702553E-10)
            r5 = r10
            r10 = r12
            r12 = r16
            r16 = r17
            r17 = r48
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = r22.g()
            boolean r3 = r22.i()
            int r5 = com.hansecom.abt.R.string.H9
            int r2 = com.hansecom.abt.R.string.J9
            r14 = r48
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r14, r0)
            com.hansecom.abt.util.resourcesResolvers.StringValue r6 = r22.h()
            r13 = r35
            r2 = 1
            r9 = 0
            r10 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r13, r10, r2, r9)
            java.lang.String r2 = "password"
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.TestTagKt.a(r4, r2)
            int r18 = r28.b()
            r2 = 1380224798(0x52448f1e, float:2.11053674E11)
            r14.X(r2)
            r2 = r26
            boolean r4 = r14.l(r2)
            r15 = r34
            boolean r11 = r14.W(r15)
            r4 = r4 | r11
            java.lang.Object r11 = r48.g()
            if (r4 != 0) goto L_0x0261
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r11 != r4) goto L_0x0269
        L_0x0261:
            com.hansecom.abt.presentation.screens.auth.login.m r11 = new com.hansecom.abt.presentation.screens.auth.login.m
            r11.<init>(r2, r15)
            r14.N(r11)
        L_0x0269:
            r36 = r11
            kotlin.jvm.functions.Function1 r36 = (kotlin.jvm.functions.Function1) r36
            r48.M()
            androidx.compose.foundation.text.KeyboardActions r19 = new androidx.compose.foundation.text.KeyboardActions
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 62
            r43 = 0
            r35 = r19
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
            androidx.compose.ui.autofill.ContentType r20 = r29.h()
            r4 = 1380203009(0x52443a01, float:2.10696684E11)
            r14.X(r4)
            boolean r4 = r14.W(r15)
            java.lang.Object r11 = r48.g()
            if (r4 != 0) goto L_0x02a1
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r11 != r4) goto L_0x02a9
        L_0x02a1:
            com.hansecom.abt.presentation.screens.auth.login.n r11 = new com.hansecom.abt.presentation.screens.auth.login.n
            r11.<init>(r15)
            r14.N(r11)
        L_0x02a9:
            r26 = r11
            kotlin.jvm.functions.Function1 r26 = (kotlin.jvm.functions.Function1) r26
            r48.M()
            r4 = 1380207278(0x52444aae, float:2.10766627E11)
            r14.X(r4)
            boolean r4 = r14.W(r15)
            java.lang.Object r11 = r48.g()
            if (r4 != 0) goto L_0x02c8
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r11 != r4) goto L_0x02d0
        L_0x02c8:
            com.hansecom.abt.presentation.screens.auth.login.o r11 = new com.hansecom.abt.presentation.screens.auth.login.o
            r11.<init>(r15)
            r14.N(r11)
        L_0x02d0:
            r4 = r11
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r48.M()
            r16 = 0
            r17 = 3072(0xc00, float:4.305E-42)
            r11 = 0
            r12 = 0
            r27 = 102236160(0x6180000, float:2.8588023E-35)
            r0 = r15
            r15 = r27
            r44 = r2
            r2 = r26
            r9 = r18
            r10 = r19
            r45 = r13
            r13 = r20
            r27 = r0
            r0 = r14
            r14 = r48
            com.hansecom.abt.ui.components.formFields.PasswordOutlinedTextFieldKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 8
            float r11 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r11)
            r12 = r45
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            r1 = 1380236082(0x5244bb32, float:2.11238552E11)
            r0.X(r1)
            r1 = r44
            boolean r2 = r0.l(r1)
            r3 = r27
            boolean r4 = r0.W(r3)
            r2 = r2 | r4
            java.lang.Object r4 = r48.g()
            if (r2 != 0) goto L_0x0327
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x032f
        L_0x0327:
            com.hansecom.abt.presentation.screens.auth.login.p r4 = new com.hansecom.abt.presentation.screens.auth.login.p
            r4.<init>(r1, r3)
            r0.N(r4)
        L_0x032f:
            r1 = r4
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r48.M()
            r2 = 1
            r14 = 0
            r15 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r12, r14, r2, r15)
            java.lang.String r2 = "sign_in"
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.platform.TestTagKt.a(r3, r2)
            boolean r3 = r22.f()
            if (r3 == 0) goto L_0x034c
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r3 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Loading
        L_0x034a:
            r4 = r3
            goto L_0x034f
        L_0x034c:
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r3 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            goto L_0x034a
        L_0x034f:
            int r3 = com.hansecom.abt.R.string.O9
            r5 = 0
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r3, r0, r5)
            r9 = 48
            r10 = 100
            r3 = 0
            r7 = 0
            r8 = 0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r48
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r1 = androidx.compose.ui.unit.Dp.m(r11)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            int r1 = com.hansecom.abt.R.string.N9
            r2 = 0
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r0, r2)
            r1 = 1
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r12, r14, r1, r15)
            java.lang.String r1 = "forgot_password"
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.platform.TestTagKt.a(r3, r1)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r1 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r1.a(r0, r13)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r4 = r1.e(r0, r2)
            r10 = 104(0x68, float:1.46E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r25
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r48
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 1380266712(0x524532d8, float:2.11740393E11)
            r0.X(r1)
            boolean r1 = r22.k()
            if (r1 == 0) goto L_0x03b3
            r2 = r22
            r4 = r23
            r3 = r24
            r1 = 0
            com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt.m(r2, r3, r4, r0, r1)
        L_0x03b3:
            r48.M()
            r10 = 2
            r11 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r6 = r21
            r7 = r12
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.ColumnScope.c(r6, r7, r8, r9, r10, r11)
            r2 = 32
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            r3 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.b(r1, r14, r2, r3, r15)
            r2 = 0
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r2)
            r48.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03de
            androidx.compose.runtime.ComposerKt.X()
        L_0x03de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$ScreenImpl$9.h(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }
}
