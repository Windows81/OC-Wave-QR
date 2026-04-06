package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CardInformationScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36431A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusManager f36432B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CardInformation.State f36433z;

    public CardInformationScreenKt$ScreenImpl$1(CardInformation.State state, Function1 function1, FocusManager focusManager) {
        this.f36433z = state;
        this.f36431A = function1;
        this.f36432B = focusManager;
    }

    public static final Unit f(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new CardInformation.Action.NicknameChange(str));
        return Unit.f40552a;
    }

    public static final Unit g(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(CardInformation.Action.NicknameSave.f36424a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r34, int r35) {
        /*
            r33 = this;
            r0 = r33
            r15 = r34
            r1 = r35
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r34.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r34.B()
            goto L_0x0313
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.ScreenImpl.<anonymous> (CardInformationScreen.kt:81)"
            r5 = 935924759(0x37c91417, float:2.3970422E-5)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            r1 = -711190835(0xffffffffd59c16cd, float:-2.14527178E13)
            r15.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation$State r1 = r0.f36433z
            boolean r1 = r1.k()
            r14 = 0
            if (r1 == 0) goto L_0x0045
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r15, r14)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0041
            androidx.compose.runtime.ComposerKt.X()
        L_0x0041:
            r34.M()
            return
        L_0x0045:
            r34.M()
            androidx.compose.ui.Modifier$Companion r13 = androidx.compose.ui.Modifier.f15489d
            r12 = 0
            r11 = 1
            r10 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r13, r12, r11, r10)
            com.hansecom.abt.ui.theme.Dimensions r21 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r21.c()
            androidx.compose.ui.Modifier r22 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r12, r3, r10)
            androidx.compose.foundation.ScrollState r23 = androidx.compose.foundation.ScrollKt.c(r14, r15, r14, r11)
            r27 = 14
            r28 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r22, r23, r24, r25, r26, r27, r28)
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation$State r9 = r0.f36433z
            kotlin.jvm.functions.Function1 r8 = r0.f36431A
            androidx.compose.ui.focus.FocusManager r7 = r0.f36432B
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r15, r14)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r14)
            androidx.compose.runtime.CompositionLocalMap r4 = r34.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r16 = r34.v()
            if (r16 != 0) goto L_0x009e
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009e:
            r34.s()
            boolean r16 = r34.n()
            if (r16 == 0) goto L_0x00ab
            r15.y(r6)
            goto L_0x00ae
        L_0x00ab:
            r34.K()
        L_0x00ae:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r34)
            kotlin.jvm.functions.Function2 r10 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r10)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00d8
            java.lang.Object r4 = r6.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r10)
            if (r4 != 0) goto L_0x00e6
        L_0x00d8:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00e6:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.lang.String r10 = r9.j()
            float r2 = r21.d()
            r1 = 32
            float r6 = (float) r1
            float r4 = androidx.compose.ui.unit.Dp.m(r6)
            r5 = 5
            r16 = 0
            r1 = 0
            r3 = 0
            r17 = r6
            r6 = r16
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.e(r1, r2, r3, r4, r5, r6)
            r16 = 48
            r18 = 109(0x6d, float:1.53E-43)
            r1 = 0
            r3 = 0
            r5 = 0
            r19 = 0
            r20 = 0
            r29 = r7
            r7 = r10
            r10 = r8
            r8 = r19
            r22 = r9
            r9 = r20
            r30 = r10
            r10 = r34
            r11 = r16
            r12 = r18
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r1 = -988569304(0xffffffffc513a128, float:-2362.0723)
            r15.X(r1)
            java.lang.String r1 = r22.d()
            int r1 = r1.length()
            r2 = 24
            r12 = 6
            if (r1 <= 0) goto L_0x015b
            int r1 = com.hansecom.abt.R.string.w1
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r3, r15, r14)
            java.lang.String r3 = r22.d()
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationScreenKt.i(r1, r3, r15, r14)
            float r1 = (float) r2
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r13, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r12)
        L_0x015b:
            r34.M()
            int r1 = com.hansecom.abt.R.string.x1
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r3, r15, r14)
            com.hansecom.abt.util.formatters.CardNumberValueFormater r3 = com.hansecom.abt.util.formatters.CardNumberValueFormater.f39044a
            java.lang.String r4 = r22.e()
            java.lang.String r3 = r3.a(r4)
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationScreenKt.i(r1, r3, r15, r14)
            float r11 = (float) r2
            float r1 = androidx.compose.ui.unit.Dp.m(r11)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r13, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r12)
            int r1 = com.hansecom.abt.R.string.B1
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r15, r14)
            r2 = -988547336(0xffffffffc513f6f8, float:-2367.4355)
            r15.X(r2)
            java.lang.String r2 = r22.i()
            int r3 = r2.length()
            if (r3 != 0) goto L_0x019f
            int r2 = com.hansecom.abt.R.string.S4
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.String r2 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r3, r15, r14)
        L_0x019f:
            r34.M()
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationScreenKt.i(r1, r2, r15, r14)
            float r1 = androidx.compose.ui.unit.Dp.m(r11)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r13, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r12)
            int r1 = com.hansecom.abt.R.string.u1
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r15, r14)
            com.hansecom.abt.util.formatters.CurrencyValueFormater r2 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            java.math.BigDecimal r3 = r22.c()
            r10 = 1
            java.lang.String r2 = r2.a(r3, r10)
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationScreenKt.i(r1, r2, r15, r14)
            r1 = -988535819(0xffffffffc51423f5, float:-2370.2473)
            r15.X(r1)
            kotlinx.collections.immutable.ImmutableList r1 = r22.f()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01f0
            float r1 = androidx.compose.ui.unit.Dp.m(r11)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r13, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r12)
            int r1 = com.hansecom.abt.R.string.y1
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r15, r14)
            kotlinx.collections.immutable.ImmutableList r2 = r22.f()
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationScreenKt.k(r1, r2, r15, r14)
        L_0x01f0:
            r34.M()
            float r1 = androidx.compose.ui.unit.Dp.m(r17)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r13, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r12)
            com.hansecom.abt.ui.theme.AbtTheme r1 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r1.b(r15, r12)
            long r3 = r1.u()
            r6 = 0
            r7 = 3
            r1 = 0
            r2 = 0
            r5 = r34
            androidx.compose.material3.DividerKt.e(r1, r2, r3, r5, r6, r7)
            float r1 = androidx.compose.ui.unit.Dp.m(r17)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r13, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r12)
            java.lang.String r1 = r22.g()
            int r3 = com.hansecom.abt.R.string.A1
            int r2 = com.hansecom.abt.R.string.z1
            java.lang.Object[] r4 = new java.lang.Object[r14]
            java.lang.String r6 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r4, r15, r14)
            com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r22.h()
            r5 = 0
            r9 = 0
            androidx.compose.ui.Modifier r17 = androidx.compose.foundation.layout.SizeKt.h(r13, r5, r10, r9)
            androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r23 = r2.b()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r2 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r24 = r2.e()
            r2 = -988517905(0xffffffffc51469ef, float:-2374.6208)
            r15.X(r2)
            r8 = r30
            boolean r2 = r15.W(r8)
            java.lang.Object r7 = r34.g()
            if (r2 != 0) goto L_0x025a
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x0262
        L_0x025a:
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.h r7 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.h
            r7.<init>(r8)
            r15.N(r7)
        L_0x0262:
            r2 = r7
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r34.M()
            r19 = 54
            r20 = 62400(0xf3c0, float:8.7441E-41)
            r7 = 0
            r16 = 0
            r31 = r8
            r8 = r16
            r16 = 0
            r9 = r16
            r16 = 0
            r10 = r16
            r16 = 0
            r32 = r13
            r13 = r16
            r14 = r16
            r15 = r16
            r18 = 24576(0x6000, float:3.4438E-41)
            r5 = r17
            r25 = r11
            r11 = r24
            r12 = r23
            r17 = r34
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r1 = androidx.compose.ui.unit.Dp.m(r25)
            r11 = r32
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r11, r1)
            r12 = r34
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r12, r13)
            int r1 = com.hansecom.abt.R.string.v1
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r3, r12, r2)
            boolean r1 = r22.l()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r3 = 0
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r4 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r3, r1, r2, r3)
            r1 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r11, r1, r2, r3)
            r1 = -988500965(0xffffffffc514ac1b, float:-2378.7566)
            r12.X(r1)
            r1 = r29
            boolean r3 = r12.l(r1)
            r6 = r31
            boolean r7 = r12.W(r6)
            r3 = r3 | r7
            java.lang.Object r7 = r34.g()
            if (r3 != 0) goto L_0x02e2
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x02ea
        L_0x02e2:
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.i r7 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.i
            r7.<init>(r1, r6)
            r12.N(r7)
        L_0x02ea:
            r1 = r7
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r34.M()
            r9 = 48
            r10 = 100
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = r34
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r1 = r21.e()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r11, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r12, r13)
            r34.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0313
            androidx.compose.runtime.ComposerKt.X()
        L_0x0313:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationScreenKt$ScreenImpl$1.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
