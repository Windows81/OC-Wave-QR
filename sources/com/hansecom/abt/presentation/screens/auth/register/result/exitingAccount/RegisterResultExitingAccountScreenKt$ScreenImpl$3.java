package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

@Metadata
public final class RegisterResultExitingAccountScreenKt$ScreenImpl$3 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34505A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RegisterResultExitingAccount.State f34506z;

    public RegisterResultExitingAccountScreenKt$ScreenImpl$3(RegisterResultExitingAccount.State state, Function0 function0) {
        this.f34506z = state;
        this.f34505A = function0;
    }

    public static final Unit e(Function0 function0) {
        function0.invoke();
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.foundation.layout.PaddingValues r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r13 = r27
            java.lang.String r2 = "innerPadding"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r14 = 6
            r2 = r28 & 6
            r3 = 2
            if (r2 != 0) goto L_0x001d
            boolean r2 = r13.W(r1)
            if (r2 == 0) goto L_0x0019
            r2 = 4
            goto L_0x001a
        L_0x0019:
            r2 = r3
        L_0x001a:
            r2 = r28 | r2
            goto L_0x001f
        L_0x001d:
            r2 = r28
        L_0x001f:
            r4 = r2 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0031
            boolean r4 = r27.t()
            if (r4 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r27.B()
            goto L_0x0182
        L_0x0031:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0040
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.ScreenImpl.<anonymous> (RegisterResultExitingAccountScreen.kt:69)"
            r6 = 2006056040(0x7791fc68, float:5.921894E33)
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
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccount$State r3 = r0.f34506z
            kotlin.jvm.functions.Function0 r9 = r0.f34505A
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r4 = r4.g()
            r5 = 48
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r4, r2, r13, r5)
            r8 = 0
            int r4 = androidx.compose.runtime.ComposablesKt.a(r13, r8)
            androidx.compose.runtime.CompositionLocalMap r5 = r27.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r13, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r17 = r27.v()
            if (r17 != 0) goto L_0x009b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009b:
            r27.s()
            boolean r17 = r27.n()
            if (r17 == 0) goto L_0x00a8
            r13.y(r7)
            goto L_0x00ab
        L_0x00a8:
            r27.K()
        L_0x00ab:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r27)
            kotlin.jvm.functions.Function2 r11 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r2, r11)
            kotlin.jvm.functions.Function2 r2 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r5, r2)
            kotlin.jvm.functions.Function2 r2 = r6.b()
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x00d5
            java.lang.Object r5 = r7.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r11)
            if (r5 != 0) goto L_0x00e3
        L_0x00d5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.A(r4, r2)
        L_0x00e3:
            kotlin.jvm.functions.Function2 r2 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r1 = com.hansecom.abt.R.string.E8
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r8)
            int r1 = com.hansecom.abt.R.string.G8
            java.lang.String r2 = r3.a()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.c(r1, r2, r13, r8)
            r1 = 3
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.c(r12, r12, r1, r10)
            r17 = 48
            r18 = 77
            r1 = 0
            r3 = 0
            r5 = 0
            r19 = 0
            r8 = r11
            r11 = r9
            r9 = r19
            r10 = r27
            r24 = r11
            r11 = r17
            r12 = r18
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            float r1 = r16.f()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r15, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r14)
            int r1 = com.hansecom.abt.R.string.F8
            r2 = 0
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r2)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r1 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r1.a(r13, r14)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r1.c(r13, r2)
            r1 = 0
            r2 = 1
            r4 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r15, r1, r2, r4)
            r1 = -73095959(0xfffffffffba4a4e9, float:-1.7097629E36)
            r13.X(r1)
            r1 = r24
            boolean r4 = r13.W(r1)
            java.lang.Object r6 = r27.g()
            if (r4 != 0) goto L_0x015c
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x0164
        L_0x015c:
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.f r6 = new com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.f
            r6.<init>(r1)
            r13.N(r6)
        L_0x0164:
            r1 = r6
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r27.M()
            r9 = 48
            r10 = 104(0x68, float:1.46E-43)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = r27
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r27.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0182
            androidx.compose.runtime.ComposerKt.X()
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt$ScreenImpl$3.c(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
