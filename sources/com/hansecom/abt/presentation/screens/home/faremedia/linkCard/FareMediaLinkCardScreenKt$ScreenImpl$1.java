package com.hansecom.abt.presentation.screens.home.faremedia.linkCard;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class FareMediaLinkCardScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Flow f36922A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f36923B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ FocusManager D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaLinkCard.State f36924z;

    public FareMediaLinkCardScreenKt$ScreenImpl$1(FareMediaLinkCard.State state, Flow flow, Function0 function0, Function1 function1, FocusManager focusManager) {
        this.f36924z = state;
        this.f36922A = flow;
        this.f36923B = function0;
        this.C = function1;
        this.D = focusManager;
    }

    public static final Unit h(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new FareMediaLinkCard.Action.CardNumberChange(str));
        return Unit.f40552a;
    }

    public static final Unit i(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new FareMediaLinkCard.Action.CodeChange(str));
        return Unit.f40552a;
    }

    public static final Unit k(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new FareMediaLinkCard.Action.NickNameChange(str));
        return Unit.f40552a;
    }

    public static final Unit p(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(FareMediaLinkCard.Action.Confirm.f36914a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.compose.runtime.Composer r37, int r38) {
        /*
            r36 = this;
            r0 = r36
            r15 = r37
            r1 = r38
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r37.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r37.B()
            goto L_0x039c
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.linkCard.ScreenImpl.<anonymous> (FareMediaLinkCardScreen.kt:66)"
            r5 = 1293187149(0x4d14784d, float:1.55682E8)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            r13 = 0
            r12 = 1
            r11 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r14, r13, r12, r11)
            com.hansecom.abt.ui.theme.Dimensions r21 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r21.c()
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r13, r3, r11)
            r3 = 0
            androidx.compose.foundation.ScrollState r5 = androidx.compose.foundation.ScrollKt.c(r3, r15, r3, r12)
            r9 = 14
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r4, r5, r6, r7, r8, r9, r10)
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard$State r10 = r0.f36924z
            kotlin.jvm.functions.Function1 r9 = r0.C
            androidx.compose.ui.focus.FocusManager r8 = r0.D
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r22 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r4 = r22.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r4, r15, r3)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r15, r3)
            androidx.compose.runtime.CompositionLocalMap r5 = r37.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r16 = r37.v()
            if (r16 != 0) goto L_0x0079
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0079:
            r37.s()
            boolean r16 = r37.n()
            if (r16 == 0) goto L_0x0086
            r15.y(r7)
            goto L_0x0089
        L_0x0086:
            r37.K()
        L_0x0089:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r37)
            kotlin.jvm.functions.Function2 r13 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r2, r13)
            kotlin.jvm.functions.Function2 r2 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r5, r2)
            kotlin.jvm.functions.Function2 r2 = r6.b()
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x00b3
            java.lang.Object r5 = r7.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r13)
            if (r5 != 0) goto L_0x00c1
        L_0x00b3:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.A(r4, r2)
        L_0x00c1:
            kotlin.jvm.functions.Function2 r2 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r13 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            float r1 = r21.d()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            r7 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r7)
            r1 = 48
            com.hansecom.abt.ui.components.fareMediaCard.FareMediaMockCardKt.b(r11, r3, r15, r1, r12)
            r1 = 40
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r7)
            java.lang.String r1 = r10.c()
            int r4 = r10.e()
            int r2 = com.hansecom.abt.R.string.i4
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r5, r15, r3)
            int r2 = com.hansecom.abt.R.string.j4
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r16 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r6, r15, r3)
            com.hansecom.abt.util.resourcesResolvers.StringValue r2 = r10.d()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r6 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r2, r6, r15, r3)
            r2 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r14, r2, r12, r11)
            java.lang.String r2 = "card_number"
            androidx.compose.ui.Modifier r18 = androidx.compose.ui.platform.TestTagKt.a(r3, r2)
            androidx.compose.ui.text.input.ImeAction$Companion r23 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r19 = r23.d()
            r2 = 844859207(0x325b8747, float:1.2778236E-8)
            r15.X(r2)
            boolean r2 = r15.W(r9)
            java.lang.Object r3 = r37.g()
            if (r2 != 0) goto L_0x0134
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x013c
        L_0x0134:
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.e r3 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.e
            r3.<init>(r9)
            r15.N(r3)
        L_0x013c:
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r37.M()
            r20 = 0
            r24 = 1408(0x580, float:1.973E-42)
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 805502976(0x30030000, float:4.765752E-10)
            r17 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r18
            r7 = r16
            r29 = r8
            r8 = r25
            r30 = r9
            r9 = r26
            r25 = r10
            r10 = r19
            r11 = r27
            r12 = r37
            r38 = r13
            r13 = r28
            r31 = r14
            r14 = r20
            r0 = r15
            r15 = r24
            com.hansecom.abt.ui.components.formFields.CardNumberFieldKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = 16
            float r12 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r12)
            r10 = r31
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r10, r1)
            r6 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r6)
            java.lang.String r1 = r25.f()
            int r3 = com.hansecom.abt.R.string.m4
            int r2 = com.hansecom.abt.R.string.l4
            r5 = 0
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r17 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r4, r0, r5)
            com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r25.g()
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r10, r15, r14, r13)
            java.lang.String r7 = "code"
            androidx.compose.ui.Modifier r24 = androidx.compose.ui.platform.TestTagKt.a(r2, r7)
            int r26 = r23.b()
            androidx.compose.ui.text.input.KeyboardType$Companion r2 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r27 = r2.d()
            r2 = 844882625(0x325be2c1, float:1.2799036E-8)
            r0.X(r2)
            r11 = r30
            boolean r2 = r0.W(r11)
            java.lang.Object r7 = r37.g()
            if (r2 != 0) goto L_0x01ca
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x01d2
        L_0x01ca:
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.f r7 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.f
            r7.<init>(r11)
            r0.N(r7)
        L_0x01d2:
            r2 = r7
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r37.M()
            r19 = 48
            r20 = 62912(0xf5c0, float:8.8158E-41)
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r32 = r11
            r11 = r16
            r16 = 0
            r13 = r16
            r14 = r16
            r15 = r16
            r18 = 805330944(0x30006000, float:4.6702553E-10)
            r5 = r24
            r6 = r17
            r33 = r10
            r10 = r27
            r24 = r12
            r12 = r26
            r17 = r37
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r1 = androidx.compose.ui.unit.Dp.m(r24)
            r12 = r33
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            r11 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r11)
            java.lang.String r1 = r25.h()
            int r3 = com.hansecom.abt.R.string.q4
            int r2 = com.hansecom.abt.R.string.p4
            r6 = 0
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r17 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r4, r0, r6)
            com.hansecom.abt.util.resourcesResolvers.StringValue r4 = r25.i()
            r5 = 0
            r14 = 0
            r15 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r12, r5, r15, r14)
            java.lang.String r7 = "nickname"
            androidx.compose.ui.Modifier r24 = androidx.compose.ui.platform.TestTagKt.a(r2, r7)
            int r23 = r23.b()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r2 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r25 = r2.e()
            r2 = 844904069(0x325c3685, float:1.2818082E-8)
            r0.X(r2)
            r13 = r32
            boolean r2 = r0.W(r13)
            java.lang.Object r7 = r37.g()
            if (r2 != 0) goto L_0x0254
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x025c
        L_0x0254:
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.g r7 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.g
            r7.<init>(r13)
            r0.N(r7)
        L_0x025c:
            r2 = r7
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r37.M()
            r19 = 54
            r20 = 62400(0xf3c0, float:8.7441E-41)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r16 = 0
            r34 = r13
            r13 = r16
            r14 = r16
            r15 = r16
            r18 = 24576(0x6000, float:3.4438E-41)
            r5 = r24
            r6 = r17
            r11 = r25
            r35 = r12
            r12 = r23
            r17 = r37
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = 24
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r12 = r35
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            r10 = 2
            r11 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r6 = r38
            r7 = r12
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.ColumnScope.c(r6, r7, r8, r9, r10, r11)
            r11 = 0
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r11)
            int r1 = com.hansecom.abt.R.string.g4
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r0, r11)
            r1 = 0
            r2 = 1
            r15 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r12, r1, r2, r15)
            androidx.compose.ui.Alignment$Horizontal r2 = r22.g()
            r3 = r38
            androidx.compose.ui.Modifier r1 = r3.b(r1, r2)
            java.lang.String r2 = "link"
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.platform.TestTagKt.a(r1, r2)
            r1 = 844926188(0x325c8cec, float:1.2837727E-8)
            r0.X(r1)
            r1 = r29
            boolean r3 = r0.l(r1)
            r4 = r34
            boolean r6 = r0.W(r4)
            r3 = r3 | r6
            java.lang.Object r6 = r37.g()
            if (r3 != 0) goto L_0x02e7
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x02ef
        L_0x02e7:
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.h r6 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.h
            r6.<init>(r1, r4)
            r0.N(r6)
        L_0x02ef:
            r1 = r6
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r37.M()
            r9 = 0
            r10 = 108(0x6c, float:1.51E-43)
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = r37
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r1 = r21.e()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r0, r13)
            r37.T()
            r14 = r0
            r0 = r36
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard$State r1 = r0.f36924z
            boolean r4 = r1.j()
            int r1 = com.hansecom.abt.R.string.o4
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r14, r11)
            int r2 = com.hansecom.abt.R.string.n4
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r2 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r3, r14, r11)
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.ComposableSingletons$FareMediaLinkCardScreenKt r3 = com.hansecom.abt.presentation.screens.home.faremedia.linkCard.ComposableSingletons$FareMediaLinkCardScreenKt.f36909a
            kotlin.jvm.functions.Function2 r5 = r3.a()
            r20 = 196608(0x30000, float:2.75506E-40)
            r21 = 98276(0x17fe4, float:1.37714E-40)
            r3 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r14 = r16
            r15 = r16
            r17 = 0
            r19 = 24576(0x6000, float:3.4438E-41)
            r18 = r37
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = com.hansecom.abt.ui.CompositionLocalKt.c()
            r5 = r37
            java.lang.Object r1 = r5.C(r1)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r1 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r1
            kotlinx.coroutines.flow.Flow r2 = r0.f36922A
            r3 = -1147411903(0xffffffffbb9be241, float:-0.004757196)
            r5.X(r3)
            boolean r3 = r5.l(r1)
            kotlin.jvm.functions.Function0 r4 = r0.f36923B
            boolean r4 = r5.W(r4)
            r3 = r3 | r4
            kotlin.jvm.functions.Function0 r4 = r0.f36923B
            java.lang.Object r6 = r37.g()
            if (r3 != 0) goto L_0x0378
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0381
        L_0x0378:
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardScreenKt$ScreenImpl$1$2$1 r6 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardScreenKt$ScreenImpl$1$2$1
            r3 = 0
            r6.<init>(r1, r4, r3)
            r5.N(r6)
        L_0x0381:
            r4 = r6
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r37.M()
            r6 = 0
            r7 = 6
            r3 = 0
            r8 = 0
            r1 = r2
            r2 = r3
            r3 = r8
            r5 = r37
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x039c
            androidx.compose.runtime.ComposerKt.X()
        L_0x039c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardScreenKt$ScreenImpl$1.g(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        g((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
