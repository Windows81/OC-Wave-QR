package com.hansecom.abt.presentation.screens.home.faremedia.createCard;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class FareMediaCreateCardScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Flow f36684A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f36685B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaCreateCard.State f36686z;

    public FareMediaCreateCardScreenKt$ScreenImpl$1(FareMediaCreateCard.State state, Flow flow, Function0 function0, Function1 function1) {
        this.f36686z = state;
        this.f36684A = flow;
        this.f36685B = function0;
        this.C = function1;
    }

    public static final Unit f(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new FareMediaCreateCard.Action.NickNameChange(str));
        return Unit.f40552a;
    }

    public static final Unit g(Function1 function1) {
        function1.invoke(FareMediaCreateCard.Action.Confirm.f36676a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r15 = r29
            r1 = r30
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r29.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r29.B()
            goto L_0x0284
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.createCard.ScreenImpl.<anonymous> (FareMediaCreateCardScreen.kt:61)"
            r5 = 2097645965(0x7d07898d, float:1.1259999E37)
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
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard$State r10 = r0.f36686z
            kotlin.jvm.functions.Function1 r9 = r0.C
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r22 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r4 = r22.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r4, r15, r3)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r15, r3)
            androidx.compose.runtime.CompositionLocalMap r5 = r29.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r8 = r29.v()
            if (r8 != 0) goto L_0x0077
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0077:
            r29.s()
            boolean r8 = r29.n()
            if (r8 == 0) goto L_0x0084
            r15.y(r7)
            goto L_0x0087
        L_0x0084:
            r29.K()
        L_0x0087:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r29)
            kotlin.jvm.functions.Function2 r8 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r2, r8)
            kotlin.jvm.functions.Function2 r2 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r5, r2)
            kotlin.jvm.functions.Function2 r2 = r6.b()
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x00b1
            java.lang.Object r5 = r7.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r8)
            if (r5 != 0) goto L_0x00bf
        L_0x00b1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.A(r4, r2)
        L_0x00bf:
            kotlin.jvm.functions.Function2 r2 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r8 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r1 = com.hansecom.abt.R.string.u3
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r3)
            int r1 = com.hansecom.abt.R.string.E3
            java.lang.String r16 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r3)
            r17 = 0
            r18 = 79
            r1 = 0
            r2 = 0
            r4 = 0
            r19 = 0
            r23 = 0
            r6 = r3
            r3 = r4
            r13 = r6
            r5 = r19
            r24 = r8
            r8 = r16
            r25 = r9
            r9 = r23
            r16 = r10
            r10 = r29
            r13 = r11
            r11 = r17
            r0 = r12
            r12 = r18
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r1 = 48
            com.hansecom.abt.ui.components.fareMediaCard.FareMediaMockCardKt.b(r13, r0, r15, r1, r0)
            r1 = 24
            float r12 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r12)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            r11 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r11)
            java.lang.String r1 = r16.c()
            int r3 = com.hansecom.abt.R.string.x3
            int r2 = com.hansecom.abt.R.string.y3
            r4 = 0
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r2, r15, r4)
            com.hansecom.abt.util.resourcesResolvers.StringValue r5 = r16.d()
            r10 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r14, r10, r0, r13)
            java.lang.String r7 = "nickname"
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.platform.TestTagKt.a(r2, r7)
            androidx.compose.ui.text.input.ImeAction$Companion r2 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r23 = r2.b()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r2 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r26 = r2.e()
            r2 = -1743017849(0xffffffff981ba887, float:-2.0118365E-24)
            r15.X(r2)
            r9 = r25
            boolean r2 = r15.W(r9)
            java.lang.Object r7 = r29.g()
            if (r2 != 0) goto L_0x0150
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x0158
        L_0x0150:
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.e r7 = new com.hansecom.abt.presentation.screens.home.faremedia.createCard.e
            r7.<init>(r9)
            r15.N(r7)
        L_0x0158:
            r2 = r7
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r29.M()
            r19 = 54
            r20 = 62400(0xf3c0, float:8.7441E-41)
            r7 = 0
            r8 = 0
            r16 = 0
            r27 = r9
            r9 = r16
            r16 = 0
            r18 = r10
            r10 = r16
            r16 = 0
            r0 = r4
            r4 = r18
            r13 = r16
            r0 = r14
            r14 = r16
            r15 = r16
            r18 = 24576(0x6000, float:3.4438E-41)
            r4 = r5
            r5 = r17
            r11 = r26
            r26 = r12
            r12 = r23
            r17 = r29
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r1 = androidx.compose.ui.unit.Dp.m(r26)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r0, r1)
            r15 = r29
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r2)
            int r1 = com.hansecom.abt.R.string.s3
            r2 = 0
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r2)
            r1 = 0
            r2 = 1
            r14 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r0, r1, r2, r14)
            androidx.compose.ui.Alignment$Horizontal r2 = r22.g()
            r3 = r24
            androidx.compose.ui.Modifier r1 = r3.b(r1, r2)
            java.lang.String r2 = "create"
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.platform.TestTagKt.a(r1, r2)
            r1 = -1742996680(0xffffffff981bfb38, float:-2.0160114E-24)
            r15.X(r1)
            r1 = r27
            boolean r3 = r15.W(r1)
            java.lang.Object r4 = r29.g()
            if (r3 != 0) goto L_0x01d3
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x01db
        L_0x01d3:
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.f r4 = new com.hansecom.abt.presentation.screens.home.faremedia.createCard.f
            r4.<init>(r1)
            r15.N(r4)
        L_0x01db:
            r1 = r4
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r29.M()
            r9 = 0
            r10 = 108(0x6c, float:1.51E-43)
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = r29
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r1 = r21.e()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.t(r0, r1)
            r2 = 0
            androidx.compose.foundation.layout.SpacerKt.a(r0, r15, r2)
            r29.T()
            r0 = r28
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard$State r1 = r0.f36686z
            boolean r4 = r1.e()
            int r1 = com.hansecom.abt.R.string.w3
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r2)
            int r3 = com.hansecom.abt.R.string.v3
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.b(r3, r15, r2)
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.ComposableSingletons$FareMediaCreateCardScreenKt r3 = com.hansecom.abt.presentation.screens.home.faremedia.createCard.ComposableSingletons$FareMediaCreateCardScreenKt.f36673a
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
            r18 = r29
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = com.hansecom.abt.ui.CompositionLocalKt.c()
            r5 = r29
            java.lang.Object r1 = r5.C(r1)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r1 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r1
            kotlinx.coroutines.flow.Flow r2 = r0.f36684A
            r3 = -765070720(0xffffffffd265f280, float:-2.46903996E11)
            r5.X(r3)
            boolean r3 = r5.l(r1)
            kotlin.jvm.functions.Function0 r4 = r0.f36685B
            boolean r4 = r5.W(r4)
            r3 = r3 | r4
            kotlin.jvm.functions.Function0 r4 = r0.f36685B
            java.lang.Object r6 = r29.g()
            if (r3 != 0) goto L_0x0260
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0269
        L_0x0260:
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardScreenKt$ScreenImpl$1$2$1 r6 = new com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardScreenKt$ScreenImpl$1$2$1
            r3 = 0
            r6.<init>(r1, r4, r3)
            r5.N(r6)
        L_0x0269:
            r4 = r6
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r29.M()
            r6 = 0
            r7 = 6
            r3 = 0
            r8 = 0
            r1 = r2
            r2 = r3
            r3 = r8
            r5 = r29
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0284
            androidx.compose.runtime.ComposerKt.X()
        L_0x0284:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardScreenKt$ScreenImpl$1.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
