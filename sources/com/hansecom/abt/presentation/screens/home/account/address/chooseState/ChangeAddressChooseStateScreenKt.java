package com.hansecom.abt.presentation.screens.home.account.address.chooseState;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel;
import com.hansecom.abt.ui.components.ScreenContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChangeAddressChooseStateScreenKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel r9, kotlin.jvm.functions.Function0 r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "onUp"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = -66205085(0xfffffffffc0dca63, float:-2.944875E36)
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
            goto L_0x00cd
        L_0x0045:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0051
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.account.address.chooseState.ChangeAddressChooseStateScreen (ChangeAddressChooseStateScreen.kt:31)"
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
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State r0 = e(r0)
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State$ChooseState r0 = r0.d()
            r1 = 1347163295(0x504c149f, float:1.3695614E10)
            r11.X(r1)
            boolean r1 = r11.l(r9)
            java.lang.Object r2 = r11.g()
            if (r1 != 0) goto L_0x007e
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0086
        L_0x007e:
            com.hansecom.abt.presentation.screens.home.account.address.chooseState.a r2 = new com.hansecom.abt.presentation.screens.home.account.address.chooseState.a
            r2.<init>(r9)
            r11.N(r2)
        L_0x0086:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r11.M()
            r1 = 0
            h(r0, r2, r11, r1)
            kotlinx.coroutines.flow.Flow r0 = r9.l()
            r2 = 1347165616(0x504c1db0, float:1.36979907E10)
            r11.X(r2)
            r2 = r8 & 112(0x70, float:1.57E-43)
            if (r2 != r7) goto L_0x009e
            r1 = 1
        L_0x009e:
            java.lang.Object r2 = r11.g()
            if (r1 != 0) goto L_0x00ac
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x00b5
        L_0x00ac:
            com.hansecom.abt.presentation.screens.home.account.address.chooseState.ChangeAddressChooseStateScreenKt$ChangeAddressChooseStateScreen$2$1 r2 = new com.hansecom.abt.presentation.screens.home.account.address.chooseState.ChangeAddressChooseStateScreenKt$ChangeAddressChooseStateScreen$2$1
            r1 = 0
            r2.<init>(r10, r1)
            r11.N(r2)
        L_0x00b5:
            r4 = r2
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r11.M()
            r6 = 0
            r7 = 6
            r2 = 0
            r3 = 0
            r1 = r0
            r5 = r11
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00cd
            androidx.compose.runtime.ComposerKt.X()
        L_0x00cd:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.x()
            if (r11 == 0) goto L_0x00db
            com.hansecom.abt.presentation.screens.home.account.address.chooseState.b r0 = new com.hansecom.abt.presentation.screens.home.account.address.chooseState.b
            r0.<init>(r9, r10, r12)
            r11.a(r0)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.chooseState.ChangeAddressChooseStateScreenKt.d(com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final ChangeAddress.State e(State state) {
        return (ChangeAddress.State) state.getValue();
    }

    public static final Unit f(ChangeAddressViewModel changeAddressViewModel, ChangeAddress.Action.ChooseState chooseState) {
        Intrinsics.i(chooseState, "it");
        changeAddressViewModel.k(chooseState);
        return Unit.f40552a;
    }

    public static final Unit g(ChangeAddressViewModel changeAddressViewModel, Function0 function0, int i2, Composer composer, int i3) {
        d(changeAddressViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void h(ChangeAddress.State.ChooseState chooseState, Function1 function1, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1263880882);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(chooseState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function1) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1263880882, i3, -1, "com.hansecom.abt.presentation.screens.home.account.address.chooseState.ScreenImpl (ChangeAddressChooseStateScreen.kt:46)");
            }
            ScreenContentKt.d((Modifier) null, 0, 0, ComposableLambdaKt.e(-312135635, true, new ChangeAddressChooseStateScreenKt$ScreenImpl$1(chooseState, function1), q2, 54), q2, 3072, 7);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new c(chooseState, function1, i2));
        }
    }

    public static final Unit i(ChangeAddress.State.ChooseState chooseState, Function1 function1, int i2, Composer composer, int i3) {
        h(chooseState, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
