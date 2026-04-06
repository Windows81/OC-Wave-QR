package com.hansecom.abt.presentation.screens.auth.reset;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.ImeAction;
import com.hansecom.abt.presentation.screens.auth.reset.ResetPassword;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ResetPasswordScreenKt$ScreenImpl$3 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34608A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusRequester f34609B;
    public final /* synthetic */ FocusManager C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ResetPassword.State f34610z;

    public ResetPasswordScreenKt$ScreenImpl$3(ResetPassword.State state, Function1 function1, FocusRequester focusRequester, FocusManager focusManager) {
        this.f34610z = state;
        this.f34608A = function1;
        this.f34609B = focusRequester;
        this.C = focusManager;
    }

    /* access modifiers changed from: private */
    public static final Unit g(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new ResetPassword.Action.EmailChange(str));
        return Unit.f40552a;
    }

    public static final Unit h(Function1 function1, KeyboardActionScope keyboardActionScope) {
        Intrinsics.i(keyboardActionScope, "$this$KeyboardActions");
        keyboardActionScope.a(ImeAction.f18821b.b());
        function1.invoke(ResetPassword.Action.Reset.f34600a);
        return Unit.f40552a;
    }

    public static final Unit i(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(ResetPassword.Action.Reset.f34600a);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        f((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(androidx.compose.foundation.layout.PaddingValues r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            r15 = r43
            java.lang.String r2 = "innerPadding"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r2 = r44 & 6
            r3 = 2
            if (r2 != 0) goto L_0x001c
            boolean r2 = r15.W(r1)
            if (r2 == 0) goto L_0x0018
            r2 = 4
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            r2 = r44 | r2
            goto L_0x001e
        L_0x001c:
            r2 = r44
        L_0x001e:
            r4 = r2 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0030
            boolean r4 = r43.t()
            if (r4 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r43.B()
            goto L_0x0281
        L_0x0030:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x003f
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.auth.reset.ScreenImpl.<anonymous> (ResetPasswordScreen.kt:83)"
            r6 = 1735127560(0x676bf208, float:1.1142208E24)
            androidx.compose.runtime.ComposerKt.Y(r6, r2, r4, r5)
        L_0x003f:
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r4 = com.hansecom.abt.util.ScaffoldImePaddingKt.a(r14, r1)
            r13 = 0
            r12 = 1
            androidx.compose.foundation.ScrollState r5 = androidx.compose.foundation.ScrollKt.c(r13, r15, r13, r12)
            r9 = 14
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r4, r5, r6, r7, r8, r9, r10)
            com.hansecom.abt.ui.theme.Dimensions r21 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r21.c()
            r11 = 0
            androidx.compose.ui.Modifier r22 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r11, r3, r10)
            float r24 = r21.d()
            r27 = 13
            r28 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r22, r23, r24, r25, r26, r27, r28)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r1, r11, r12, r10)
            androidx.compose.ui.Alignment$Companion r22 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r2 = r22.g()
            com.hansecom.abt.presentation.screens.auth.reset.ResetPassword$State r9 = r0.f34610z
            kotlin.jvm.functions.Function1 r8 = r0.f34608A
            androidx.compose.ui.focus.FocusRequester r7 = r0.f34609B
            androidx.compose.ui.focus.FocusManager r5 = r0.C
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.g()
            r4 = 48
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r3, r2, r15, r4)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r13)
            androidx.compose.runtime.CompositionLocalMap r4 = r43.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r10 = r6.a()
            androidx.compose.runtime.Applier r16 = r43.v()
            if (r16 != 0) goto L_0x00ab
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00ab:
            r43.s()
            boolean r16 = r43.n()
            if (r16 == 0) goto L_0x00b8
            r15.y(r10)
            goto L_0x00bb
        L_0x00b8:
            r43.K()
        L_0x00bb:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r43)
            kotlin.jvm.functions.Function2 r11 = r6.c()
            androidx.compose.runtime.Updater.g(r10, r2, r11)
            kotlin.jvm.functions.Function2 r2 = r6.e()
            androidx.compose.runtime.Updater.g(r10, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r6.b()
            boolean r4 = r10.n()
            if (r4 != 0) goto L_0x00e5
            java.lang.Object r4 = r10.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r11)
            if (r4 != 0) goto L_0x00f3
        L_0x00e5:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r10.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.A(r3, r2)
        L_0x00f3:
            kotlin.jvm.functions.Function2 r2 = r6.d()
            androidx.compose.runtime.Updater.g(r10, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r11 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r1 = com.hansecom.abt.R.string.o9
            java.lang.String r10 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r13)
            int r1 = com.hansecom.abt.R.string.p9
            java.lang.String r16 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r13)
            r1 = 32
            float r1 = (float) r1
            float r26 = androidx.compose.ui.unit.Dp.m(r1)
            r27 = 7
            r28 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.e(r23, r24, r25, r26, r27, r28)
            r17 = 48
            r18 = 77
            r1 = 0
            r3 = 0
            r19 = 0
            r23 = 0
            r29 = r5
            r5 = r19
            r24 = r7
            r7 = r10
            r10 = r8
            r8 = r16
            r25 = r9
            r9 = r23
            r13 = r10
            r10 = r43
            r30 = r11
            r11 = r17
            r0 = r12
            r12 = r18
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = r25.c()
            r2 = 968080710(0x39b3bd46, float:3.428256E-4)
            r15.X(r2)
            boolean r2 = r15.W(r13)
            java.lang.Object r3 = r43.g()
            if (r2 != 0) goto L_0x015f
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0167
        L_0x015f:
            com.hansecom.abt.presentation.screens.auth.reset.f r3 = new com.hansecom.abt.presentation.screens.auth.reset.f
            r3.<init>(r13)
            r15.N(r3)
        L_0x0167:
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r43.M()
            int r3 = com.hansecom.abt.R.string.m9
            r4 = 968085660(0x39b3d09c, float:3.4296967E-4)
            r15.X(r4)
            boolean r4 = r25.d()
            if (r4 != 0) goto L_0x0183
            int r4 = com.hansecom.abt.R.string.n9
            r5 = 0
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r15, r5)
            goto L_0x0186
        L_0x0183:
            r5 = 0
            java.lang.String r4 = ""
        L_0x0186:
            r43.M()
            r10 = 0
            r12 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.SizeKt.h(r14, r12, r0, r10)
            androidx.compose.ui.text.input.KeyboardType$Companion r6 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r17 = r6.c()
            androidx.compose.ui.text.input.ImeAction$Companion r6 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r23 = r6.b()
            r6 = 968101618(0x39b40ef2, float:3.434341E-4)
            r15.X(r6)
            boolean r6 = r15.W(r13)
            java.lang.Object r7 = r43.g()
            if (r6 != 0) goto L_0x01b3
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x01bb
        L_0x01b3:
            com.hansecom.abt.presentation.screens.auth.reset.g r7 = new com.hansecom.abt.presentation.screens.auth.reset.g
            r7.<init>(r13)
            r15.N(r7)
        L_0x01bb:
            r32 = r7
            kotlin.jvm.functions.Function1 r32 = (kotlin.jvm.functions.Function1) r32
            r43.M()
            androidx.compose.foundation.text.KeyboardActions r31 = new androidx.compose.foundation.text.KeyboardActions
            r11 = r13
            r13 = r31
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 62
            r39 = 0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            androidx.compose.ui.autofill.ContentType$Companion r6 = androidx.compose.ui.autofill.ContentType.f15598a
            androidx.compose.ui.autofill.ContentType r7 = r6.m()
            androidx.compose.ui.autofill.ContentType r6 = r6.e()
            androidx.compose.ui.autofill.ContentType r16 = r7.a(r6)
            r19 = 48
            r20 = 25824(0x64e0, float:3.6187E-41)
            r6 = 0
            r7 = 0
            r8 = 0
            r18 = 0
            r40 = r11
            r11 = r18
            r18 = 0
            r0 = r14
            r14 = r18
            r15 = r18
            r18 = 905994240(0x36006000, float:1.9129366E-6)
            r5 = r9
            r9 = r24
            r10 = r17
            r12 = r23
            r17 = r43
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r1 = r21.f()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r0, r1)
            r2 = 6
            r11 = r43
            androidx.compose.foundation.layout.SpacerKt.a(r1, r11, r2)
            int r1 = com.hansecom.abt.R.string.l9
            r2 = 0
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r11, r2)
            boolean r1 = r25.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r3 = 0
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r4 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r3, r1, r2, r3)
            r1 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r0, r1, r2, r3)
            androidx.compose.ui.Alignment$Horizontal r1 = r22.g()
            r2 = r30
            androidx.compose.ui.Modifier r2 = r2.b(r0, r1)
            r0 = 968115578(0x39b4457a, float:3.438404E-4)
            r11.X(r0)
            r0 = r29
            boolean r1 = r11.l(r0)
            r3 = r40
            boolean r6 = r11.W(r3)
            r1 = r1 | r6
            java.lang.Object r6 = r43.g()
            if (r1 != 0) goto L_0x025c
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r6 != r1) goto L_0x0264
        L_0x025c:
            com.hansecom.abt.presentation.screens.auth.reset.h r6 = new com.hansecom.abt.presentation.screens.auth.reset.h
            r6.<init>(r0, r3)
            r11.N(r6)
        L_0x0264:
            r1 = r6
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r43.M()
            r9 = 0
            r10 = 100
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = r43
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r43.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0281
            androidx.compose.runtime.ComposerKt.X()
        L_0x0281:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordScreenKt$ScreenImpl$3.f(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }
}
