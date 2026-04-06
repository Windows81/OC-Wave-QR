package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class AddPaymentMethodChooseStateScreenKt$ScreenImpl$2 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35740A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmi.State.ChooseState f35741z;

    public AddPaymentMethodChooseStateScreenKt$ScreenImpl$2(AddPaymentMethodNmi.State.ChooseState chooseState, Function1 function1) {
        this.f35741z = chooseState;
        this.f35740A = function1;
    }

    /* access modifiers changed from: private */
    public static final Unit f(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AddPaymentMethodNmi.Action.ChooseState.FilterChange(str));
        return Unit.f40552a;
    }

    public static final Unit g(AddPaymentMethodNmi.State.ChooseState chooseState, Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        ImmutableList d2 = chooseState.d();
        lazyListScope.d(d2.size(), (Function1) null, new AddPaymentMethodChooseStateScreenKt$ScreenImpl$2$invoke$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$2(d2), ComposableLambdaKt.c(-1091073711, true, new AddPaymentMethodChooseStateScreenKt$ScreenImpl$2$invoke$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$3(d2, chooseState, function1)));
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.foundation.layout.PaddingValues r28, androidx.compose.runtime.Composer r29, int r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r15 = r29
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r12 = 6
            r2 = r30 & 6
            r3 = 2
            if (r2 != 0) goto L_0x001d
            boolean r2 = r15.W(r1)
            if (r2 == 0) goto L_0x0019
            r2 = 4
            goto L_0x001a
        L_0x0019:
            r2 = r3
        L_0x001a:
            r2 = r30 | r2
            goto L_0x001f
        L_0x001d:
            r2 = r30
        L_0x001f:
            r4 = r2 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0031
            boolean r4 = r29.t()
            if (r4 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r29.B()
            goto L_0x01ea
        L_0x0031:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0040
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.ScreenImpl.<anonymous> (AddPaymentMethodChooseStateScreen.kt:63)"
            r6 = 25913312(0x18b67e0, float:5.120959E-38)
            androidx.compose.runtime.ComposerKt.Y(r6, r2, r4, r5)
        L_0x0040:
            androidx.compose.ui.Modifier$Companion r13 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.h(r13, r1)
            r14 = 0
            r11 = 1
            r10 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r1, r14, r11, r10)
            com.hansecom.abt.ui.theme.Dimensions r2 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r4 = r2.c()
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r1, r4, r14, r3, r10)
            float r18 = r2.d()
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State$ChooseState r9 = r0.f35741z
            kotlin.jvm.functions.Function1 r8 = r0.f35740A
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            r7 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r15, r7)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r7)
            androidx.compose.runtime.CompositionLocalMap r4 = r29.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r16 = r29.v()
            if (r16 != 0) goto L_0x0099
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0099:
            r29.s()
            boolean r16 = r29.n()
            if (r16 == 0) goto L_0x00a6
            r15.y(r6)
            goto L_0x00a9
        L_0x00a6:
            r29.K()
        L_0x00a9:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r29)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r7)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00d3
            java.lang.Object r4 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x00e1
        L_0x00d3:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00e1:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r13, r14, r11, r10)
            java.lang.String r1 = r9.c()
            int r3 = com.hansecom.abt.R.string.S
            r2 = 157661145(0x965b7d9, float:2.7651317E-33)
            r15.X(r2)
            boolean r2 = r15.W(r8)
            java.lang.Object r5 = r29.g()
            if (r2 != 0) goto L_0x010c
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x0114
        L_0x010c:
            com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.d r5 = new com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.d
            r5.<init>(r8)
            r15.N(r5)
        L_0x0114:
            r2 = r5
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r29.M()
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 240(0xf0, float:3.36E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r18 = 0
            r12 = 0
            r12 = r8
            r8 = r18
            r30 = r9
            r9 = r29
            r10 = r16
            r0 = r11
            r11 = r17
            com.hansecom.abt.ui.components.formFields.SearchTextFieldKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlinx.collections.immutable.ImmutableList r1 = r30.d()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x018f
            r1 = 592666771(0x23536093, float:1.1458783E-17)
            r15.X(r1)
            r1 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.f(r13, r14, r0, r1)
            java.lang.String r1 = "state_list"
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.platform.TestTagKt.a(r0, r1)
            r0 = 157672913(0x965e5d1, float:2.7672931E-33)
            r15.X(r0)
            r0 = r30
            boolean r2 = r15.W(r0)
            boolean r3 = r15.W(r12)
            r2 = r2 | r3
            java.lang.Object r3 = r29.g()
            if (r2 != 0) goto L_0x016d
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0175
        L_0x016d:
            com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.e r3 = new com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.e
            r3.<init>(r0, r12)
            r15.N(r3)
        L_0x0175:
            r10 = r3
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r29.M()
            r12 = 6
            r13 = 510(0x1fe, float:7.15E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r29
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r29.M()
            goto L_0x01de
        L_0x018f:
            r1 = 0
            r2 = 593519612(0x236063fc, float:1.2164237E-17)
            r15.X(r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r13, r14, r0, r1)
            int r0 = com.hansecom.abt.R.string.R
            r1 = 0
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r0, r15, r1)
            androidx.compose.ui.text.style.TextAlign$Companion r0 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r0 = r0.a()
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r4 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r3 = r3.d(r15, r4)
            androidx.compose.ui.text.TextStyle r22 = r3.c()
            androidx.compose.ui.text.style.TextAlign r14 = androidx.compose.ui.text.style.TextAlign.h(r0)
            r25 = 0
            r26 = 130044(0x1fbfc, float:1.8223E-40)
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 48
            r23 = r29
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r29.M()
        L_0x01de:
            r29.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01ea
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.AddPaymentMethodChooseStateScreenKt$ScreenImpl$2.e(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }
}
