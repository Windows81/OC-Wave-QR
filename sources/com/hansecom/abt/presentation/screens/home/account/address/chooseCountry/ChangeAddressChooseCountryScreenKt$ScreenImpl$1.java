package com.hansecom.abt.presentation.screens.home.account.address.chooseCountry;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class ChangeAddressChooseCountryScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35167A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeAddress.State.ChooseCountry f35168z;

    public ChangeAddressChooseCountryScreenKt$ScreenImpl$1(ChangeAddress.State.ChooseCountry chooseCountry, Function1 function1) {
        this.f35168z = chooseCountry;
        this.f35167A = function1;
    }

    public static final Unit f(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new ChangeAddress.Action.ChooseCountry.FilterChange(str));
        return Unit.f40552a;
    }

    public static final Unit g(ChangeAddress.State.ChooseCountry chooseCountry, Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        ImmutableList c2 = chooseCountry.c();
        lazyListScope.d(c2.size(), (Function1) null, new ChangeAddressChooseCountryScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$2(c2), ComposableLambdaKt.c(-1091073711, true, new ChangeAddressChooseCountryScreenKt$ScreenImpl$1$invoke$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$3(c2, chooseCountry, function1)));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlin.jvm.functions.Function1} */
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
            goto L_0x01cc
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.account.address.chooseCountry.ScreenImpl.<anonymous> (ChangeAddressChooseCountryScreen.kt:54)"
            r5 = 291963134(0x116700fe, float:1.8222993E-28)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            r13 = 0
            r14 = 1
            r11 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r12, r13, r14, r11)
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
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State$ChooseCountry r10 = r0.f35168z
            kotlin.jvm.functions.Function1 r9 = r0.f35167A
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            r8 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r15, r8)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r8)
            androidx.compose.runtime.CompositionLocalMap r4 = r29.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r7 = r29.v()
            if (r7 != 0) goto L_0x007b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x007b:
            r29.s()
            boolean r7 = r29.n()
            if (r7 == 0) goto L_0x0088
            r15.y(r6)
            goto L_0x008b
        L_0x0088:
            r29.K()
        L_0x008b:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r29)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r7)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00b5
            java.lang.Object r4 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x00c3
        L_0x00b5:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00c3:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r12, r13, r14, r11)
            java.lang.String r1 = r10.d()
            int r3 = com.hansecom.abt.R.string.I1
            r2 = 551440731(0x20de515b, float:3.76621E-19)
            r15.X(r2)
            boolean r2 = r15.W(r9)
            java.lang.Object r5 = r29.g()
            if (r2 != 0) goto L_0x00ee
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x00f6
        L_0x00ee:
            com.hansecom.abt.presentation.screens.home.account.address.chooseCountry.d r5 = new com.hansecom.abt.presentation.screens.home.account.address.chooseCountry.d
            r5.<init>(r9)
            r15.N(r5)
        L_0x00f6:
            r2 = r5
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r29.M()
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 240(0xf0, float:3.36E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r18 = 0
            r8 = r18
            r27 = r9
            r9 = r29
            r30 = r10
            r10 = r16
            r0 = r11
            r11 = r17
            com.hansecom.abt.ui.components.formFields.SearchTextFieldKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlinx.collections.immutable.ImmutableList r1 = r30.c()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0172
            r1 = -85076166(0xfffffffffaedd73a, float:-6.1746983E35)
            r15.X(r1)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.f(r12, r13, r14, r0)
            java.lang.String r1 = "countries_list"
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.platform.TestTagKt.a(r0, r1)
            r0 = 551450471(0x20de7767, float:3.7687277E-19)
            r15.X(r0)
            r0 = r30
            boolean r2 = r15.W(r0)
            r3 = r27
            boolean r4 = r15.W(r3)
            r2 = r2 | r4
            java.lang.Object r4 = r29.g()
            if (r2 != 0) goto L_0x0150
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0158
        L_0x0150:
            com.hansecom.abt.presentation.screens.home.account.address.chooseCountry.e r4 = new com.hansecom.abt.presentation.screens.home.account.address.chooseCountry.e
            r4.<init>(r0, r3)
            r15.N(r4)
        L_0x0158:
            r10 = r4
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
            goto L_0x01c0
        L_0x0172:
            r1 = -84385641(0xfffffffffaf86097, float:-6.4482435E35)
            r15.X(r1)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r12, r13, r14, r0)
            int r0 = com.hansecom.abt.R.string.H1
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
        L_0x01c0:
            r29.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01cc
            androidx.compose.runtime.ComposerKt.X()
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.chooseCountry.ChangeAddressChooseCountryScreenKt$ScreenImpl$1.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
