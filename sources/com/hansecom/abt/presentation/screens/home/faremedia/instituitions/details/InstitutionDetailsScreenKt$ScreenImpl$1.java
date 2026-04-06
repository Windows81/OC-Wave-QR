package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class InstitutionDetailsScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36833A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionDetails.State f36834z;

    public InstitutionDetailsScreenKt$ScreenImpl$1(InstitutionDetails.State state, Function1 function1) {
        this.f36834z = state;
        this.f36833A = function1;
    }

    public static final Unit g(Function1 function1) {
        function1.invoke(new InstitutionDetails.Action.ShowUnlinkDialog(true));
        return Unit.f40552a;
    }

    public static final Unit h(Function1 function1) {
        function1.invoke(InstitutionDetails.Action.Unlink.f36826a);
        return Unit.f40552a;
    }

    public static final Unit i(Function1 function1) {
        function1.invoke(new InstitutionDetails.Action.ShowUnlinkDialog(false));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(androidx.compose.runtime.Composer r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r15 = r25
            r1 = r26
            r2 = r1 & 3
            r11 = 2
            if (r2 != r11) goto L_0x0017
            boolean r2 = r25.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r25.B()
            goto L_0x0235
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.ScreenImpl.<anonymous> (InstitutionDetailsScreen.kt:63)"
            r4 = 909594375(0x36374f07, float:2.7315125E-6)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            r1 = -884969567(0xffffffffcb406fa1, float:-1.2611489E7)
            r15.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetails$State r1 = r0.f36834z
            com.hansecom.abt.presentation.model.InstitutionState r1 = r1.d()
            r12 = 0
            if (r1 != 0) goto L_0x0045
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r15, r12)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0041
            androidx.compose.runtime.ComposerKt.X()
        L_0x0041:
            r25.M()
            return
        L_0x0045:
            r25.M()
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r8 = 0
            r13 = 1
            r14 = 0
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.f(r7, r8, r13, r14)
            com.hansecom.abt.ui.theme.Dimensions r1 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r18 = r1.d()
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            float r1 = r1.c()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r2, r1, r8, r11, r14)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetails$State r10 = r0.f36834z
            kotlin.jvm.functions.Function1 r9 = r0.f36833A
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r15, r12)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r12)
            androidx.compose.runtime.CompositionLocalMap r4 = r25.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r16 = r25.v()
            if (r16 != 0) goto L_0x009c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009c:
            r25.s()
            boolean r16 = r25.n()
            if (r16 == 0) goto L_0x00a9
            r15.y(r6)
            goto L_0x00ac
        L_0x00a9:
            r25.K()
        L_0x00ac:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r25)
            kotlin.jvm.functions.Function2 r11 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r11)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00d6
            java.lang.Object r4 = r6.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r11)
            if (r4 != 0) goto L_0x00e4
        L_0x00d6:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00e4:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r7, r8, r13, r14)
            com.hansecom.abt.presentation.model.InstitutionState r2 = r10.d()
            boolean r3 = r10.e()
            r5 = 6
            r6 = 0
            r4 = r25
            com.hansecom.abt.ui.components.institution.InstitutionDetailsCardKt.b(r1, r2, r3, r4, r5, r6)
            r1 = -860656207(0xffffffffccb36db1, float:-9.40722E7)
            r15.X(r1)
            boolean r1 = r10.c()
            if (r1 == 0) goto L_0x0226
            r1 = 24
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r7, r1)
            r11 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r11)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r7, r8, r13, r14)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r8 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r8.a(r15, r11)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r1.f(r15, r12)
            int r1 = com.hansecom.abt.R.string.J6
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r12)
            boolean r1 = r10.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r4 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r14, r1, r13, r14)
            r1 = -860643839(0xffffffffccb39e01, float:-9.4171144E7)
            r15.X(r1)
            boolean r1 = r15.W(r9)
            java.lang.Object r6 = r25.g()
            if (r1 != 0) goto L_0x0153
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r6 != r1) goto L_0x015b
        L_0x0153:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.e r6 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.e
            r6.<init>(r9)
            r15.N(r6)
        L_0x015b:
            r1 = r6
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r25.M()
            r17 = 48
            r18 = 96
            r6 = 0
            r7 = 0
            r13 = r8
            r8 = r25
            r23 = r9
            r9 = r17
            r17 = r10
            r10 = r18
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = com.hansecom.abt.R.string.I6
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r12)
            int r2 = com.hansecom.abt.R.string.K6
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r15, r12)
            boolean r4 = r17.f()
            int r3 = com.hansecom.abt.R.string.H6
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r3, r15, r12)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r3 = r13.a(r15, r11)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r10 = r3.b(r15, r12)
            boolean r3 = r17.g()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = 1
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r7 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r14, r3, r5, r14)
            int r3 = com.hansecom.abt.R.string.G6
            java.lang.String r18 = androidx.compose.ui.res.StringResources_androidKt.b(r3, r15, r12)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r3 = r13.a(r15, r11)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r22 = r3.e(r15, r12)
            boolean r3 = r17.g()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = 2
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r12 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r3, r14, r5, r14)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.ComposableSingletons$InstitutionDetailsScreenKt r3 = com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.ComposableSingletons$InstitutionDetailsScreenKt.f36822a
            kotlin.jvm.functions.Function2 r5 = r3.a()
            r3 = -860620815(0xffffffffccb3f7f1, float:-9.4355336E7)
            r15.X(r3)
            r3 = r23
            boolean r6 = r15.W(r3)
            java.lang.Object r9 = r25.g()
            if (r6 != 0) goto L_0x01db
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x01e3
        L_0x01db:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.f r9 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.f
            r9.<init>(r3)
            r15.N(r9)
        L_0x01e3:
            r11 = r9
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r25.M()
            r6 = -860610174(0xffffffffccb42182, float:-9.4440464E7)
            r15.X(r6)
            boolean r6 = r15.W(r3)
            java.lang.Object r9 = r25.g()
            if (r6 != 0) goto L_0x0201
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x0209
        L_0x0201:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.g r9 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.g
            r9.<init>(r3)
            r15.N(r9)
        L_0x0209:
            r16 = r9
            kotlin.jvm.functions.Function0 r16 = (kotlin.jvm.functions.Function0) r16
            r25.M()
            r20 = 0
            r21 = 74020(0x12124, float:1.03724E-40)
            r3 = 0
            r6 = 0
            r9 = 0
            r14 = 0
            r17 = 0
            r19 = 24576(0x6000, float:3.4438E-41)
            r13 = r18
            r15 = r22
            r18 = r25
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0226:
            r25.M()
            r25.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0235
            androidx.compose.runtime.ComposerKt.X()
        L_0x0235:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsScreenKt$ScreenImpl$1.f(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
