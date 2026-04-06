package com.hansecom.abt.presentation.screens.home.account.information;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class AccountInformationScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        if ((r14 & 2) != 0) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(kotlin.jvm.functions.Function0 r10, com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "navigateUp"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = 1105897136(0x41eaa6b0, float:29.33139)
            androidx.compose.runtime.Composer r12 = r12.q(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0013
            r1 = r13 | 6
            goto L_0x0023
        L_0x0013:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0022
            boolean r1 = r12.l(r10)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r13
            goto L_0x0023
        L_0x0022:
            r1 = r13
        L_0x0023:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0037
            r2 = r14 & 2
            if (r2 != 0) goto L_0x0034
            boolean r2 = r12.l(r11)
            if (r2 == 0) goto L_0x0034
            r2 = 32
            goto L_0x0036
        L_0x0034:
            r2 = 16
        L_0x0036:
            r1 = r1 | r2
        L_0x0037:
            r9 = r1
            r1 = r9 & 19
            r2 = 18
            if (r1 != r2) goto L_0x004a
            boolean r1 = r12.t()
            if (r1 != 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            r12.B()
            goto L_0x010c
        L_0x004a:
            r12.p()
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0062
            boolean r1 = r12.J()
            if (r1 == 0) goto L_0x0058
            goto L_0x0062
        L_0x0058:
            r12.B()
            r1 = r14 & 2
            if (r1 == 0) goto L_0x00ae
        L_0x005f:
            r9 = r9 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x00ae
        L_0x0062:
            r1 = r14 & 2
            if (r1 == 0) goto L_0x00ae
            r11 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.f(r11)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r11 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r11.c(r12, r1)
            if (r2 == 0) goto L_0x00a6
            r11 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r12, r11)
            r11 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.f(r11)
            boolean r11 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r11 == 0) goto L_0x008e
            r11 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r11 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r11
            androidx.lifecycle.viewmodel.CreationExtras r11 = r11.n()
        L_0x008c:
            r5 = r11
            goto L_0x0091
        L_0x008e:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r11 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x008c
        L_0x0091:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel> r1 = com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r11 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel r11 = (com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel) r11
            goto L_0x005f
        L_0x00a6:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00ae:
            r12.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00bd
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreen (AccountInformationScreen.kt:48)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00bd:
            int r0 = r9 << 3
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r11
            r4 = r12
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State r1 = f(r0)
            r0 = 91038695(0x56d23e7, float:1.1150281E-35)
            r12.X(r0)
            boolean r0 = r12.l(r11)
            java.lang.Object r2 = r12.g()
            if (r0 != 0) goto L_0x00e6
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00ee
        L_0x00e6:
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt$AccountInformationScreen$1$1 r2 = new com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt$AccountInformationScreen$1$1
            r2.<init>(r11)
            r12.N(r2)
        L_0x00ee:
            kotlin.reflect.KFunction r2 = (kotlin.reflect.KFunction) r2
            r12.M()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r11.l()
            int r0 = r9 << 9
            r6 = r0 & 7168(0x1c00, float:1.0045E-41)
            r7 = 0
            r4 = r10
            r5 = r12
            h(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010c
            androidx.compose.runtime.ComposerKt.X()
        L_0x010c:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x011a
            com.hansecom.abt.presentation.screens.home.account.information.d r0 = new com.hansecom.abt.presentation.screens.home.account.information.d
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt.e(kotlin.jvm.functions.Function0, com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AccountInformation.State f(State state) {
        return (AccountInformation.State) state.getValue();
    }

    public static final Unit g(Function0 function0, AccountInformationViewModel accountInformationViewModel, int i2, int i3, Composer composer, int i4) {
        e(function0, accountInformationViewModel, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(com.hansecom.abt.presentation.screens.home.account.information.AccountInformation.State r25, kotlin.jvm.functions.Function1 r26, kotlinx.coroutines.flow.Flow r27, kotlin.jvm.functions.Function0 r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r5 = r30
            r0 = 858207708(0x332735dc, float:3.8931702E-8)
            r1 = r29
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0022
            r2 = r31 & 1
            if (r2 != 0) goto L_0x001d
            r2 = r25
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x001f
            r3 = 4
            goto L_0x0020
        L_0x001d:
            r2 = r25
        L_0x001f:
            r3 = 2
        L_0x0020:
            r3 = r3 | r5
            goto L_0x0025
        L_0x0022:
            r2 = r25
            r3 = r5
        L_0x0025:
            r4 = r31 & 2
            if (r4 == 0) goto L_0x002e
            r3 = r3 | 48
        L_0x002b:
            r6 = r26
            goto L_0x0040
        L_0x002e:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x002b
            r6 = r26
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x003d
            r7 = 32
            goto L_0x003f
        L_0x003d:
            r7 = 16
        L_0x003f:
            r3 = r3 | r7
        L_0x0040:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0059
            r7 = r31 & 4
            if (r7 != 0) goto L_0x0053
            r7 = r27
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x0055
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0053:
            r7 = r27
        L_0x0055:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r3 = r3 | r8
            goto L_0x005b
        L_0x0059:
            r7 = r27
        L_0x005b:
            r8 = r3 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0071
            boolean r8 = r1.t()
            if (r8 != 0) goto L_0x0068
            goto L_0x0071
        L_0x0068:
            r1.B()
            r15 = r28
            r4 = r6
            r3 = r7
            goto L_0x0190
        L_0x0071:
            r1.p()
            r8 = r5 & 1
            if (r8 == 0) goto L_0x0095
            boolean r8 = r1.J()
            if (r8 == 0) goto L_0x007f
            goto L_0x0095
        L_0x007f:
            r1.B()
            r4 = r31 & 1
            if (r4 == 0) goto L_0x0088
            r3 = r3 & -15
        L_0x0088:
            r4 = r31 & 4
            if (r4 == 0) goto L_0x008e
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x008e:
            r15 = r28
            r14 = r3
            r4 = r6
            r3 = r7
            goto L_0x0113
        L_0x0095:
            r8 = r31 & 1
            if (r8 == 0) goto L_0x00b9
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State r2 = new com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State
            r23 = 8191(0x1fff, float:1.1478E-41)
            r24 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = r3 & -15
        L_0x00b9:
            if (r4 == 0) goto L_0x00db
            r4 = 1375086215(0x51f62687, float:1.32151042E11)
            r1.X(r4)
            java.lang.Object r4 = r1.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r4 != r6) goto L_0x00d5
            com.hansecom.abt.presentation.screens.home.account.information.a r4 = new com.hansecom.abt.presentation.screens.home.account.information.a
            r4.<init>()
            r1.N(r4)
        L_0x00d5:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r1.M()
            goto L_0x00dc
        L_0x00db:
            r4 = r6
        L_0x00dc:
            r6 = r31 & 4
            if (r6 == 0) goto L_0x00e7
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.A()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00e8
        L_0x00e7:
            r6 = r7
        L_0x00e8:
            r7 = r31 & 8
            if (r7 == 0) goto L_0x010f
            r7 = 1375088583(0x51f62fc7, float:1.32170441E11)
            r1.X(r7)
            java.lang.Object r7 = r1.g()
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x0106
            com.hansecom.abt.presentation.screens.home.account.information.b r7 = new com.hansecom.abt.presentation.screens.home.account.information.b
            r7.<init>()
            r1.N(r7)
        L_0x0106:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r1.M()
            r14 = r3
            r3 = r6
            r15 = r7
            goto L_0x0113
        L_0x010f:
            r15 = r28
            r14 = r3
            r3 = r6
        L_0x0113:
            r1.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0122
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.account.information.ScreenImpl (AccountInformationScreen.kt:64)"
            androidx.compose.runtime.ComposerKt.Y(r0, r14, r6, r7)
        L_0x0122:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r0 = r1.C(r0)
            androidx.compose.ui.focus.FocusManager r0 = (androidx.compose.ui.focus.FocusManager) r0
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt$ScreenImpl$3 r6 = new com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt$ScreenImpl$3
            r6.<init>(r2, r4, r0)
            r0 = 54
            r7 = -684381283(0xffffffffd7352b9d, float:-1.99198922E14)
            r8 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r8, r6, r1, r0)
            r13 = 3072(0xc00, float:4.305E-42)
            r0 = 7
            r6 = 0
            r7 = 0
            r9 = 0
            r12 = r1
            r16 = r14
            r14 = r0
            com.hansecom.abt.ui.components.ScreenContentKt.d(r6, r7, r9, r11, r12, r13, r14)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r1.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            r6 = 1375209309(0x51f8075d, float:1.33159428E11)
            r1.X(r6)
            boolean r6 = r1.l(r0)
            java.lang.Object r7 = r1.g()
            if (r6 != 0) goto L_0x016c
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0175
        L_0x016c:
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt$ScreenImpl$4$1 r7 = new com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt$ScreenImpl$4$1
            r6 = 0
            r7.<init>(r0, r6)
            r1.N(r7)
        L_0x0175:
            r9 = r7
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r1.M()
            int r0 = r16 >> 6
            r11 = r0 & 14
            r12 = 6
            r7 = 0
            r8 = 0
            r6 = r3
            r10 = r1
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0190
            androidx.compose.runtime.ComposerKt.X()
        L_0x0190:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x01a6
            com.hansecom.abt.presentation.screens.home.account.information.c r8 = new com.hansecom.abt.presentation.screens.home.account.information.c
            r0 = r8
            r1 = r2
            r2 = r4
            r4 = r15
            r5 = r30
            r6 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.information.AccountInformationScreenKt.h(com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit i(AccountInformation.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit j() {
        return Unit.f40552a;
    }

    public static final Unit k(AccountInformation.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3, Composer composer, int i4) {
        h(state, function1, flow, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
