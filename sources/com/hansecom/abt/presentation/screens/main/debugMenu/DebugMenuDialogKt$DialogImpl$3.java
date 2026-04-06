package com.hansecom.abt.presentation.screens.main.debugMenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class DebugMenuDialogKt$DialogImpl$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f37613A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DebugMenu.State f37614B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37615z;

    public DebugMenuDialogKt$DialogImpl$3(Function1 function1, MutableState mutableState, DebugMenu.State state, MutableState mutableState2) {
        this.f37615z = function1;
        this.f37613A = mutableState;
        this.f37614B = state;
        this.C = mutableState2;
    }

    public static final Unit f(Function1 function1) {
        function1.invoke(DebugMenu.Action.BreakAccessTokens.f37605a);
        return Unit.f40552a;
    }

    public static final Unit g(MutableState mutableState, boolean z2) {
        DebugMenuDialogKt.j(mutableState, z2);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r11 = r17
            r1 = r18
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r17.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r17.B()
            goto L_0x013b
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.main.debugMenu.DialogImpl.<anonymous> (DebugMenuDialog.kt:89)"
            r4 = -436166938(0xffffffffe6009ee6, float:-1.5184852E23)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.f3739a
            r2 = 16
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r1 = r1.n(r2)
            kotlin.jvm.functions.Function1 r12 = r0.f37615z
            androidx.compose.runtime.MutableState r13 = r0.f37613A
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu$State r14 = r0.f37614B
            androidx.compose.runtime.MutableState r15 = r0.C
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            r4 = 6
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.ColumnKt.a(r1, r3, r11, r4)
            r3 = 0
            int r5 = androidx.compose.runtime.ComposablesKt.a(r11, r3)
            androidx.compose.runtime.CompositionLocalMap r6 = r17.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r11, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r8 = r7.a()
            androidx.compose.runtime.Applier r9 = r17.v()
            if (r9 != 0) goto L_0x0064
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0064:
            r17.s()
            boolean r9 = r17.n()
            if (r9 == 0) goto L_0x0071
            r11.y(r8)
            goto L_0x0074
        L_0x0071:
            r17.K()
        L_0x0074:
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.b(r17)
            kotlin.jvm.functions.Function2 r9 = r7.c()
            androidx.compose.runtime.Updater.g(r8, r1, r9)
            kotlin.jvm.functions.Function2 r1 = r7.e()
            androidx.compose.runtime.Updater.g(r8, r6, r1)
            kotlin.jvm.functions.Function2 r1 = r7.b()
            boolean r6 = r8.n()
            if (r6 != 0) goto L_0x009e
            java.lang.Object r6 = r8.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r9)
            if (r6 != 0) goto L_0x00ac
        L_0x009e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.N(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.A(r5, r1)
        L_0x00ac:
            kotlin.jvm.functions.Function2 r1 = r7.d()
            androidx.compose.runtime.Updater.g(r8, r2, r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r1 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r1.a(r11, r4)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r1.e(r11, r3)
            r1 = 155505154(0x944d202, float:2.3691387E-33)
            r11.X(r1)
            boolean r1 = r11.W(r12)
            java.lang.Object r2 = r17.g()
            if (r1 != 0) goto L_0x00d7
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x00df
        L_0x00d7:
            com.hansecom.abt.presentation.screens.main.debugMenu.f r2 = new com.hansecom.abt.presentation.screens.main.debugMenu.f
            r2.<init>(r12)
            r11.N(r2)
        L_0x00df:
            r1 = r2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r17.M()
            r9 = 24576(0x6000, float:3.4438E-41)
            r10 = 106(0x6a, float:1.49E-43)
            r2 = 0
            r4 = 0
            java.lang.String r5 = "Break access tokens"
            r6 = 0
            r7 = 0
            r8 = r17
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt.i(r13)
            r2 = 155514447(0x944f64f, float:2.3708456E-33)
            r11.X(r2)
            java.lang.Object r2 = r17.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0112
            com.hansecom.abt.presentation.screens.main.debugMenu.g r2 = new com.hansecom.abt.presentation.screens.main.debugMenu.g
            r2.<init>(r13)
            r11.N(r2)
        L_0x0112:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r17.M()
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$3$1$3 r3 = new com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$3$1$3
            r3.<init>(r14, r13, r12, r15)
            r4 = 54
            r5 = 1500654706(0x59722c72, float:4.26036328E15)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r6, r3, r11, r4)
            r6 = 3120(0xc30, float:4.372E-42)
            r7 = 4
            r3 = 0
            r5 = r17
            androidx.compose.material3.ExposedDropdownMenuKt.h(r1, r2, r3, r4, r5, r6, r7)
            r17.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x013b
            androidx.compose.runtime.ComposerKt.X()
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$3.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
