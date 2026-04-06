package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public final class RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$3 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34528A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f34529B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RegisterResultExitingAccountNeedsActivation.State f34530z;

    public RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$3(RegisterResultExitingAccountNeedsActivation.State state, Function0 function0, Function1 function1) {
        this.f34530z = state;
        this.f34528A = function0;
        this.f34529B = function1;
    }

    public static final Unit f(Function0 function0) {
        function0.invoke();
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g(Function1 function1) {
        function1.invoke(RegisterResultExitingAccountNeedsActivation.Action.Resend.f34521a);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.foundation.layout.PaddingValues r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r13 = r28
            java.lang.String r2 = "innerPadding"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r14 = 6
            r2 = r29 & 6
            r3 = 2
            if (r2 != 0) goto L_0x001d
            boolean r2 = r13.W(r1)
            if (r2 == 0) goto L_0x0019
            r2 = 4
            goto L_0x001a
        L_0x0019:
            r2 = r3
        L_0x001a:
            r2 = r29 | r2
            goto L_0x001f
        L_0x001d:
            r2 = r29
        L_0x001f:
            r4 = r2 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0031
            boolean r4 = r28.t()
            if (r4 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r28.B()
            goto L_0x01f4
        L_0x0031:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0040
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.ScreenImpl.<anonymous> (RegisterResultExitingAccountNeedsActivationScreen.kt:74)"
            r6 = 619861566(0x24f2563e, float:1.0509687E-16)
            androidx.compose.runtime.ComposerKt.Y(r6, r2, r4, r5)
        L_0x0040:
            androidx.compose.ui.Modifier$Companion r15 = androidx.compose.ui.Modifier.f15489d
            r12 = 0
            r11 = 1
            r10 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.f(r15, r12, r11, r10)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.h(r2, r1)
            com.hansecom.abt.ui.theme.Dimensions r16 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r16.c()
            androidx.compose.ui.Modifier r17 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r12, r3, r10)
            float r19 = r16.d()
            r22 = 13
            r23 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r2 = r2.g()
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivation$State r9 = r0.f34530z
            kotlin.jvm.functions.Function0 r8 = r0.f34528A
            kotlin.jvm.functions.Function1 r7 = r0.f34529B
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.g()
            r4 = 48
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r3, r2, r13, r4)
            r5 = 0
            int r3 = androidx.compose.runtime.ComposablesKt.a(r13, r5)
            androidx.compose.runtime.CompositionLocalMap r4 = r28.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r13, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r11 = r6.a()
            androidx.compose.runtime.Applier r17 = r28.v()
            if (r17 != 0) goto L_0x009d
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009d:
            r28.s()
            boolean r17 = r28.n()
            if (r17 == 0) goto L_0x00aa
            r13.y(r11)
            goto L_0x00ad
        L_0x00aa:
            r28.K()
        L_0x00ad:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r28)
            kotlin.jvm.functions.Function2 r14 = r6.c()
            androidx.compose.runtime.Updater.g(r11, r2, r14)
            kotlin.jvm.functions.Function2 r2 = r6.e()
            androidx.compose.runtime.Updater.g(r11, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r6.b()
            boolean r4 = r11.n()
            if (r4 != 0) goto L_0x00d7
            java.lang.Object r4 = r11.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r14)
            if (r4 != 0) goto L_0x00e5
        L_0x00d7:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r11.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.A(r3, r2)
        L_0x00e5:
            kotlin.jvm.functions.Function2 r2 = r6.d()
            androidx.compose.runtime.Updater.g(r11, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r1 = com.hansecom.abt.R.string.y8
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r5)
            int r1 = com.hansecom.abt.R.string.B8
            java.lang.String r2 = r9.c()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r14 = androidx.compose.ui.res.StringResources_androidKt.c(r1, r2, r13, r5)
            r1 = 3
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.c(r12, r12, r1, r10)
            r18 = 48
            r19 = 77
            r1 = 0
            r3 = 0
            r20 = 0
            r22 = 0
            r5 = r20
            r24 = r7
            r7 = r11
            r11 = r8
            r8 = r14
            r14 = r9
            r9 = r22
            r10 = r28
            r25 = r11
            r11 = r18
            r0 = r12
            r12 = r19
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            float r1 = r16.f()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r2)
            int r1 = com.hansecom.abt.R.string.z8
            r11 = 0
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r11)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r12 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r12.a(r13, r2)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r1.c(r13, r11)
            r9 = 0
            r10 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r15, r0, r10, r9)
            r1 = 662362638(0x277ada0e, float:3.4812677E-15)
            r13.X(r1)
            r1 = r25
            boolean r4 = r13.W(r1)
            java.lang.Object r6 = r28.g()
            if (r4 != 0) goto L_0x0165
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x016d
        L_0x0165:
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.f r6 = new com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.f
            r6.<init>(r1)
            r13.N(r6)
        L_0x016d:
            r1 = r6
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r28.M()
            r16 = 48
            r18 = 104(0x68, float:1.46E-43)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = r28
            r0 = r9
            r9 = r16
            r10 = r18
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r2)
            int r1 = com.hansecom.abt.R.string.A8
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r11)
            boolean r1 = r14.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3 = 1
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r4 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r0, r1, r3, r0)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r12.a(r13, r2)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r6 = r1.e(r13, r11)
            r1 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r15, r1, r3, r0)
            r0 = 662376634(0x277b10ba, float:3.4842315E-15)
            r13.X(r0)
            r0 = r24
            boolean r1 = r13.W(r0)
            java.lang.Object r3 = r28.g()
            if (r1 != 0) goto L_0x01cd
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x01d5
        L_0x01cd:
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.g r3 = new com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.g
            r3.<init>(r0)
            r13.N(r3)
        L_0x01d5:
            r1 = r3
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r28.M()
            r9 = 48
            r10 = 96
            r0 = 0
            r7 = 0
            r3 = r6
            r6 = r0
            r8 = r28
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r28.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01f4
            androidx.compose.runtime.ComposerKt.X()
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$3.e(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }
}
