package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry;

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
public final class AddPaymentMethodChooseCountryScreenKt$ScreenImpl$2 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35716A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmi.State.ChooseCountry f35717z;

    public AddPaymentMethodChooseCountryScreenKt$ScreenImpl$2(AddPaymentMethodNmi.State.ChooseCountry chooseCountry, Function1 function1) {
        this.f35717z = chooseCountry;
        this.f35716A = function1;
    }

    /* access modifiers changed from: private */
    public static final Unit f(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AddPaymentMethodNmi.Action.ChooseCountry.FilterChange(str));
        return Unit.f40552a;
    }

    public static final Unit g(AddPaymentMethodNmi.State.ChooseCountry chooseCountry, Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        ImmutableList c2 = chooseCountry.c();
        lazyListScope.d(c2.size(), (Function1) null, new AddPaymentMethodChooseCountryScreenKt$ScreenImpl$2$invoke$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$2(c2), ComposableLambdaKt.c(-1091073711, true, new AddPaymentMethodChooseCountryScreenKt$ScreenImpl$2$invoke$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$3(c2, chooseCountry, function1)));
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.foundation.layout.PaddingValues r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r14 = r27
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r2 = r28 & 6
            r3 = 2
            if (r2 != 0) goto L_0x001c
            boolean r2 = r14.W(r1)
            if (r2 == 0) goto L_0x0018
            r2 = 4
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            r2 = r28 | r2
            goto L_0x001e
        L_0x001c:
            r2 = r28
        L_0x001e:
            r4 = r2 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0030
            boolean r4 = r27.t()
            if (r4 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r27.B()
            goto L_0x0184
        L_0x0030:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x003f
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.ScreenImpl.<anonymous> (AddPaymentMethodChooseCountryScreen.kt:67)"
            r6 = 68565317(0x4163945, float:1.7658712E-36)
            androidx.compose.runtime.ComposerKt.Y(r6, r2, r4, r5)
        L_0x003f:
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.h(r12, r1)
            r13 = 0
            r15 = 1
            r11 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r1, r13, r15, r11)
            com.hansecom.abt.ui.theme.Dimensions r2 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r4 = r2.c()
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r1, r4, r13, r3, r11)
            float r18 = r2.d()
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State$ChooseCountry r10 = r0.f35717z
            kotlin.jvm.functions.Function1 r9 = r0.f35716A
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            r4 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r14, r4)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r14, r4)
            androidx.compose.runtime.CompositionLocalMap r4 = r27.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r14, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r7 = r27.v()
            if (r7 != 0) goto L_0x0098
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0098:
            r27.s()
            boolean r7 = r27.n()
            if (r7 == 0) goto L_0x00a5
            r14.y(r6)
            goto L_0x00a8
        L_0x00a5:
            r27.K()
        L_0x00a8:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r27)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r7)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00d2
            java.lang.Object r4 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x00e0
        L_0x00d2:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00e0:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r12, r13, r15, r11)
            java.lang.String r1 = r10.d()
            int r3 = com.hansecom.abt.R.string.P
            r2 = 206473622(0xc4e8996, float:1.5911066E-31)
            r14.X(r2)
            boolean r2 = r14.W(r9)
            java.lang.Object r5 = r27.g()
            if (r2 != 0) goto L_0x010b
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x0113
        L_0x010b:
            com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.d r5 = new com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.d
            r5.<init>(r9)
            r14.N(r5)
        L_0x0113:
            r2 = r5
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r27.M()
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 240(0xf0, float:3.36E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r23 = r9
            r9 = r27
            r24 = r10
            r10 = r16
            r0 = r11
            r11 = r17
            com.hansecom.abt.ui.components.formFields.SearchTextFieldKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.f(r12, r13, r15, r0)
            java.lang.String r1 = "country_list"
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.platform.TestTagKt.a(r0, r1)
            r0 = 206483305(0xc4eaf69, float:1.5922448E-31)
            r14.X(r0)
            r0 = r24
            boolean r2 = r14.W(r0)
            r3 = r23
            boolean r4 = r14.W(r3)
            r2 = r2 | r4
            java.lang.Object r4 = r27.g()
            if (r2 != 0) goto L_0x015a
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0162
        L_0x015a:
            com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.e r4 = new com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.e
            r4.<init>(r0, r3)
            r14.N(r4)
        L_0x0162:
            r10 = r4
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r27.M()
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
            r11 = r27
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r27.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0184
            androidx.compose.runtime.ComposerKt.X()
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.AddPaymentMethodChooseCountryScreenKt$ScreenImpl$2.e(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }
}
