package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AddInstitutionScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36800A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddInstitution.State f36801z;

    public AddInstitutionScreenKt$ScreenImpl$1(AddInstitution.State state, Function1 function1) {
        this.f36801z = state;
        this.f36800A = function1;
    }

    public static final Unit e(Function1 function1) {
        function1.invoke(AddInstitution.Action.Link.f36793a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = r22
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r21.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r21.B()
            goto L_0x0171
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.ScreenImpl.<anonymous> (AddInstitutionScreen.kt:59)"
            r5 = 686091579(0x28e4ed3b, float:2.5415967E-14)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            r1 = -1084062638(0xffffffffbf628452, float:-0.88483155)
            r11.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitution$State r1 = r0.f36801z
            com.hansecom.abt.presentation.model.InstitutionState r1 = r1.d()
            r7 = 0
            if (r1 != 0) goto L_0x0045
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r11, r7)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0041
            androidx.compose.runtime.ComposerKt.X()
        L_0x0041:
            r21.M()
            return
        L_0x0045:
            r21.M()
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            r9 = 0
            r10 = 1
            r12 = 0
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.layout.SizeKt.f(r8, r9, r10, r12)
            com.hansecom.abt.ui.theme.Dimensions r1 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r15 = r1.d()
            r18 = 13
            r19 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m(r13, r14, r15, r16, r17, r18, r19)
            float r1 = r1.c()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r2, r1, r9, r3, r12)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitution$State r13 = r0.f36801z
            kotlin.jvm.functions.Function1 r14 = r0.f36800A
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r11, r7)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r11, r7)
            androidx.compose.runtime.CompositionLocalMap r4 = r21.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r11, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r15 = r21.v()
            if (r15 != 0) goto L_0x009b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009b:
            r21.s()
            boolean r15 = r21.n()
            if (r15 == 0) goto L_0x00a8
            r11.y(r6)
            goto L_0x00ab
        L_0x00a8:
            r21.K()
        L_0x00ab:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r21)
            kotlin.jvm.functions.Function2 r15 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r15)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00d5
            java.lang.Object r4 = r6.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r15)
            if (r4 != 0) goto L_0x00e3
        L_0x00d5:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00e3:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r8, r9, r10, r12)
            com.hansecom.abt.presentation.model.InstitutionState r2 = r13.d()
            boolean r3 = r13.e()
            r5 = 6
            r6 = 0
            r4 = r21
            com.hansecom.abt.ui.components.institution.InstitutionDetailsCardKt.b(r1, r2, r3, r4, r5, r6)
            r1 = -1399878557(0xffffffffac8f8c63, float:-4.0798905E-12)
            r11.X(r1)
            boolean r1 = r13.c()
            if (r1 == 0) goto L_0x0162
            r1 = 24
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r8, r1)
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r11, r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r8, r9, r10, r12)
            int r1 = com.hansecom.abt.R.string.D
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r11, r7)
            boolean r1 = r13.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r4 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r12, r1, r10, r12)
            r1 = -1399867616(0xffffffffac8fb720, float:-4.0846354E-12)
            r11.X(r1)
            boolean r1 = r11.W(r14)
            java.lang.Object r3 = r21.g()
            if (r1 != 0) goto L_0x0148
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0150
        L_0x0148:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.e r3 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.e
            r3.<init>(r14)
            r11.N(r3)
        L_0x0150:
            r1 = r3
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r21.M()
            r9 = 48
            r10 = 100
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = r21
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0162:
            r21.M()
            r21.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0171
            androidx.compose.runtime.ComposerKt.X()
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionScreenKt$ScreenImpl$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
