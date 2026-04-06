package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class CheckFareMediaBalanceScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if ((r14 & 1) != 0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel r10, kotlin.jvm.functions.Function0 r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "onUp"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = -2038188963(0xffffffff8683b45d, float:-4.9541743E-35)
            androidx.compose.runtime.Composer r12 = r12.q(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x001f
            r1 = r14 & 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r12.l(r10)
            if (r1 == 0) goto L_0x001c
            r1 = 4
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r13
            goto L_0x0020
        L_0x001f:
            r1 = r13
        L_0x0020:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0028
            r1 = r1 | 48
        L_0x0026:
            r9 = r1
            goto L_0x0039
        L_0x0028:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0026
            boolean r2 = r12.l(r11)
            if (r2 == 0) goto L_0x0035
            r2 = 32
            goto L_0x0037
        L_0x0035:
            r2 = 16
        L_0x0037:
            r1 = r1 | r2
            goto L_0x0026
        L_0x0039:
            r1 = r9 & 19
            r2 = 18
            if (r1 != r2) goto L_0x004b
            boolean r1 = r12.t()
            if (r1 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r12.B()
            goto L_0x010b
        L_0x004b:
            r12.p()
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0063
            boolean r1 = r12.J()
            if (r1 == 0) goto L_0x0059
            goto L_0x0063
        L_0x0059:
            r12.B()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00af
        L_0x0060:
            r9 = r9 & -15
            goto L_0x00af
        L_0x0063:
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00af
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.f(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.c(r12, r1)
            if (r2 == 0) goto L_0x00a7
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r12, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.f(r10)
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L_0x008f
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.n()
        L_0x008d:
            r5 = r10
            goto L_0x0092
        L_0x008f:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x008d
        L_0x0092:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel> r1 = com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel r10 = (com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel) r10
            goto L_0x0060
        L_0x00a7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00af:
            r12.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00be
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreen (CheckFareMediaBalanceScreen.kt:53)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00be:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r12
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance$State r1 = d(r1)
            r2 = -1739757028(0xffffffff984d6a1c, float:-2.65492E-24)
            r12.X(r2)
            boolean r2 = r12.l(r10)
            java.lang.Object r3 = r12.g()
            if (r2 != 0) goto L_0x00e7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00ef
        L_0x00e7:
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$CheckFareMediaBalanceScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$CheckFareMediaBalanceScreen$1$1
            r3.<init>(r10)
            r12.N(r3)
        L_0x00ef:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r12.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r10.l()
            r6 = r0 & 7168(0x1c00, float:1.0045E-41)
            r4 = r11
            r5 = r12
            f(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010b
            androidx.compose.runtime.ComposerKt.X()
        L_0x010b:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x0119
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.a r0 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.a
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt.c(com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final CheckFareMediaBalance.State d(State state) {
        return (CheckFareMediaBalance.State) state.getValue();
    }

    public static final Unit e(CheckFareMediaBalanceViewModel checkFareMediaBalanceViewModel, Function0 function0, int i2, int i3, Composer composer, int i4) {
        c(checkFareMediaBalanceViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance.State r25, kotlin.jvm.functions.Function1 r26, kotlinx.coroutines.flow.Flow r27, kotlin.jvm.functions.Function0 r28, androidx.compose.runtime.Composer r29, int r30) {
        /*
            r1 = r25
            r2 = r26
            r4 = r28
            r5 = r30
            r0 = 2006285829(0x77957e05, float:6.0641267E33)
            r3 = r29
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0020
            boolean r6 = r3.W(r1)
            if (r6 == 0) goto L_0x001d
            r6 = 4
            goto L_0x001e
        L_0x001d:
            r6 = 2
        L_0x001e:
            r6 = r6 | r5
            goto L_0x0021
        L_0x0020:
            r6 = r5
        L_0x0021:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0031
            boolean r7 = r3.l(r2)
            if (r7 == 0) goto L_0x002e
            r7 = 32
            goto L_0x0030
        L_0x002e:
            r7 = 16
        L_0x0030:
            r6 = r6 | r7
        L_0x0031:
            r7 = r5 & 384(0x180, float:5.38E-43)
            r14 = r27
            if (r7 != 0) goto L_0x0043
            boolean r7 = r3.l(r14)
            if (r7 == 0) goto L_0x0040
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0042
        L_0x0040:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r6 = r6 | r7
        L_0x0043:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0053
            boolean r7 = r3.l(r4)
            if (r7 == 0) goto L_0x0050
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0052
        L_0x0050:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0052:
            r6 = r6 | r7
        L_0x0053:
            r15 = r6
            r6 = r15 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0066
            boolean r6 = r3.t()
            if (r6 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r3.B()
            goto L_0x010f
        L_0x0066:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0072
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.ScreenImpl (CheckFareMediaBalanceScreen.kt:70)"
            androidx.compose.runtime.ComposerKt.Y(r0, r15, r6, r7)
        L_0x0072:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r0 = r3.C(r0)
            androidx.compose.ui.focus.FocusManager r0 = (androidx.compose.ui.focus.FocusManager) r0
            androidx.compose.runtime.ProvidableCompositionLocal r6 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r6 = r3.C(r6)
            r12 = r6
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r12 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r12
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r7 = "CheckCardBalanceScreen"
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.platform.TestTagKt.a(r6, r7)
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$1 r7 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$1
            r7.<init>(r4)
            r8 = 1151356609(0x44a04ec1, float:1282.461)
            r9 = 1
            r10 = 54
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r9, r7, r3, r10)
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$2 r8 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$2
            r8.<init>(r12)
            r11 = -217104001(0xfffffffff30f417f, float:-1.1349897E31)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r9, r8, r3, r10)
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$3 r8 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$3
            r8.<init>(r1, r2, r0)
            r0 = -201619178(0xfffffffff3fb8916, float:-3.985739E31)
            androidx.compose.runtime.internal.ComposableLambda r17 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r9, r8, r3, r10)
            r19 = 805309494(0x30000c36, float:4.658348E-10)
            r20 = 500(0x1f4, float:7.0E-43)
            r8 = 0
            r10 = 0
            r0 = 0
            r21 = 0
            r23 = 0
            r16 = 0
            r9 = r11
            r11 = r0
            r0 = r12
            r12 = r21
            r21 = r15
            r14 = r23
            r18 = r3
            androidx.compose.material3.ScaffoldKt.f(r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r20)
            r6 = 421953692(0x1926809c, float:8.607971E-24)
            r3.X(r6)
            boolean r6 = r3.l(r0)
            java.lang.Object r7 = r3.g()
            if (r6 != 0) goto L_0x00ea
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00f3
        L_0x00ea:
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$4$1 r7 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt$ScreenImpl$4$1
            r6 = 0
            r7.<init>(r0, r6)
            r3.N(r7)
        L_0x00f3:
            r9 = r7
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r3.M()
            int r0 = r21 >> 6
            r11 = r0 & 14
            r12 = 6
            r7 = 0
            r8 = 0
            r6 = r27
            r10 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010f
            androidx.compose.runtime.ComposerKt.X()
        L_0x010f:
            androidx.compose.runtime.ScopeUpdateScope r6 = r3.x()
            if (r6 == 0) goto L_0x0128
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.b r7 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.b
            r0 = r7
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r30
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceScreenKt.f(com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit g(CheckFareMediaBalance.State state, Function1 function1, Flow flow, Function0 function0, int i2, Composer composer, int i3) {
        f(state, function1, flow, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
