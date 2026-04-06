package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AddPaymentMethodChooseCountryScreenKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel r9, kotlin.jvm.functions.Function0 r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "onUp"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = -825466681(0xffffffffcecc60c7, float:-1.71444723E9)
            androidx.compose.runtime.Composer r11 = r11.q(r0)
            r1 = r12 & 6
            if (r1 != 0) goto L_0x0020
            boolean r1 = r11.l(r9)
            if (r1 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 2
        L_0x001e:
            r1 = r1 | r12
            goto L_0x0021
        L_0x0020:
            r1 = r12
        L_0x0021:
            r2 = r12 & 48
            r7 = 32
            if (r2 != 0) goto L_0x0032
            boolean r2 = r11.l(r10)
            if (r2 == 0) goto L_0x002f
            r2 = r7
            goto L_0x0031
        L_0x002f:
            r2 = 16
        L_0x0031:
            r1 = r1 | r2
        L_0x0032:
            r8 = r1
            r1 = r8 & 19
            r2 = 18
            if (r1 != r2) goto L_0x0045
            boolean r1 = r11.t()
            if (r1 != 0) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            r11.B()
            goto L_0x00d1
        L_0x0045:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0051
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.AddPaymentMethodChooseCountryScreen (AddPaymentMethodChooseCountryScreen.kt:33)"
            androidx.compose.runtime.ComposerKt.Y(r0, r8, r1, r2)
        L_0x0051:
            int r0 = r8 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r9
            r4 = r11
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r0 = e(r0)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State$ChooseCountry r0 = r0.d()
            r1 = 287671234(0x112583c2, float:1.3056806E-28)
            r11.X(r1)
            boolean r1 = r11.l(r9)
            java.lang.Object r2 = r11.g()
            if (r1 != 0) goto L_0x007e
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0086
        L_0x007e:
            com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.a r2 = new com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.a
            r2.<init>(r9)
            r11.N(r2)
        L_0x0086:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r11.M()
            int r1 = r8 << 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            h(r0, r2, r10, r11, r1)
            kotlinx.coroutines.flow.Flow r1 = r9.l()
            r0 = 287673784(0x11258db8, float:1.3059875E-28)
            r11.X(r0)
            r0 = r8 & 112(0x70, float:1.57E-43)
            if (r0 != r7) goto L_0x00a2
            r0 = 1
            goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            java.lang.Object r2 = r11.g()
            if (r0 != 0) goto L_0x00b1
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00ba
        L_0x00b1:
            com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.AddPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1 r2 = new com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.AddPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1
            r0 = 0
            r2.<init>(r10, r0)
            r11.N(r2)
        L_0x00ba:
            r4 = r2
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r11.M()
            r6 = 0
            r7 = 6
            r2 = 0
            r3 = 0
            r5 = r11
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00d1
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d1:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.x()
            if (r11 == 0) goto L_0x00df
            com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.b r0 = new com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.b
            r0.<init>(r9, r10, r12)
            r11.a(r0)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.AddPaymentMethodChooseCountryScreenKt.d(com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final AddPaymentMethodNmi.State e(State state) {
        return (AddPaymentMethodNmi.State) state.getValue();
    }

    public static final Unit f(AddPaymentMethodNmiViewModel addPaymentMethodNmiViewModel, AddPaymentMethodNmi.Action.ChooseCountry chooseCountry) {
        Intrinsics.i(chooseCountry, "it");
        addPaymentMethodNmiViewModel.k(chooseCountry);
        return Unit.f40552a;
    }

    public static final Unit g(AddPaymentMethodNmiViewModel addPaymentMethodNmiViewModel, Function0 function0, int i2, Composer composer, int i3) {
        d(addPaymentMethodNmiViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void h(AddPaymentMethodNmi.State.ChooseCountry chooseCountry, Function1 function1, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        AddPaymentMethodNmi.State.ChooseCountry chooseCountry2 = chooseCountry;
        Function1 function12 = function1;
        Function0 function02 = function0;
        int i4 = i2;
        Composer q2 = composer.q(1766801652);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(chooseCountry2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function12) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function02) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1766801652, i3, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.ScreenImpl (AddPaymentMethodChooseCountryScreen.kt:56)");
            }
            composer2 = q2;
            ScaffoldKt.f(TestTagKt.a(Modifier.f15489d, "AddPaymentMethodChooseCountryScreen"), ComposableLambdaKt.e(1003134128, true, new AddPaymentMethodChooseCountryScreenKt$ScreenImpl$1(function02), q2, 54), (Function2) null, (Function2) null, (Function2) null, 0, 0, 0, (WindowInsets) null, ComposableLambdaKt.e(68565317, true, new AddPaymentMethodChooseCountryScreenKt$ScreenImpl$2(chooseCountry2, function12), q2, 54), composer2, 805306422, 508);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new c(chooseCountry2, function12, function02, i4));
        }
    }

    public static final Unit i(AddPaymentMethodNmi.State.ChooseCountry chooseCountry, Function1 function1, Function0 function0, int i2, Composer composer, int i3) {
        h(chooseCountry, function1, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
