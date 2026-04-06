package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class ChangeAccountPinScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if ((r14 & 1) != 0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel r10, kotlin.jvm.functions.Function0 r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "onSuccess"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = 620670791(0x24feaf47, float:1.1045187E-16)
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
            goto L_0x010c
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel> r1 = com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel r10 = (com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreen (ChangeAccountPinScreen.kt:47)"
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
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin$State r1 = e(r1)
            r2 = 1833560180(0x6d49e874, float:3.905469E27)
            r12.X(r2)
            boolean r2 = r12.l(r10)
            java.lang.Object r3 = r12.g()
            if (r2 != 0) goto L_0x00e7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00ef
        L_0x00e7:
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreenKt$ChangeAccountPinScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreenKt$ChangeAccountPinScreen$1$1
            r3.<init>(r10)
            r12.N(r3)
        L_0x00ef:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r12.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r10.l()
            r6 = r0 & 7168(0x1c00, float:1.0045E-41)
            r7 = 0
            r4 = r11
            r5 = r12
            g(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010c
            androidx.compose.runtime.ComposerKt.X()
        L_0x010c:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x011a
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.c r0 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.c
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreenKt.d(com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ChangeAccountPin.State e(State state) {
        return (ChangeAccountPin.State) state.getValue();
    }

    public static final Unit f(ChangeAccountPinViewModel changeAccountPinViewModel, Function0 function0, int i2, int i3, Composer composer, int i4) {
        d(changeAccountPinViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin.State r19, kotlin.jvm.functions.Function1 r20, kotlinx.coroutines.flow.Flow r21, kotlin.jvm.functions.Function0 r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r1 = r19
            r4 = r22
            r5 = r24
            r0 = 1460693499(0x571069fb, float:1.58784857E14)
            r2 = r23
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r25 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r5 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r5
            goto L_0x0026
        L_0x0025:
            r3 = r5
        L_0x0026:
            r6 = r25 & 2
            if (r6 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r7 = r20
            goto L_0x0041
        L_0x002f:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x002c
            r7 = r20
            boolean r8 = r2.l(r7)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r3 = r3 | r8
        L_0x0041:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
            r15 = r21
            goto L_0x005c
        L_0x004a:
            r8 = r5 & 384(0x180, float:5.38E-43)
            r15 = r21
            if (r8 != 0) goto L_0x005c
            boolean r8 = r2.l(r15)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r8
        L_0x005c:
            r8 = r25 & 8
            r14 = 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0065
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0074
        L_0x0065:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0074
            boolean r8 = r2.l(r4)
            if (r8 == 0) goto L_0x0071
            r8 = r14
            goto L_0x0073
        L_0x0071:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r8
        L_0x0074:
            r8 = r3 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x0088
            boolean r8 = r2.t()
            if (r8 != 0) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            r2.B()
            r18 = r7
            goto L_0x0137
        L_0x0088:
            if (r6 == 0) goto L_0x00ab
            r6 = 2106020269(0x7d8751ad, float:2.2483733E37)
            r2.X(r6)
            java.lang.Object r6 = r2.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x00a4
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.a r6 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.a
            r6.<init>()
            r2.N(r6)
        L_0x00a4:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r2.M()
            r13 = r6
            goto L_0x00ac
        L_0x00ab:
            r13 = r7
        L_0x00ac:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x00b8
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ScreenImpl (ChangeAccountPinScreen.kt:63)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r6, r7)
        L_0x00b8:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r0 = r2.C(r0)
            androidx.compose.ui.focus.FocusManager r0 = (androidx.compose.ui.focus.FocusManager) r0
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreenKt$ScreenImpl$2 r6 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreenKt$ScreenImpl$2
            r6.<init>(r1, r13, r0)
            r0 = 54
            r7 = -1952837478(0xffffffff8b9a109a, float:-5.934362E-32)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r12, r6, r2, r0)
            r0 = 3072(0xc00, float:4.305E-42)
            r16 = 7
            r6 = 0
            r7 = 0
            r9 = 0
            r17 = r12
            r12 = r2
            r18 = r13
            r13 = r0
            r0 = r14
            r14 = r16
            com.hansecom.abt.ui.components.ScreenContentKt.d(r6, r7, r9, r11, r12, r13, r14)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r6 = r2.C(r6)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r6 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r6
            r7 = 2106145267(0x7d8939f3, float:2.280064E37)
            r2.X(r7)
            boolean r7 = r2.l(r6)
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != r0) goto L_0x0101
            r12 = r17
            goto L_0x0102
        L_0x0101:
            r12 = 0
        L_0x0102:
            r0 = r7 | r12
            java.lang.Object r7 = r2.g()
            if (r0 != 0) goto L_0x0112
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L_0x011b
        L_0x0112:
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreenKt$ScreenImpl$3$1 r7 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreenKt$ScreenImpl$3$1
            r0 = 0
            r7.<init>(r6, r4, r0)
            r2.N(r7)
        L_0x011b:
            r9 = r7
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r2.M()
            int r0 = r3 >> 6
            r11 = r0 & 14
            r12 = 6
            r7 = 0
            r8 = 0
            r6 = r21
            r10 = r2
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0137
            androidx.compose.runtime.ComposerKt.X()
        L_0x0137:
            androidx.compose.runtime.ScopeUpdateScope r7 = r2.x()
            if (r7 == 0) goto L_0x0152
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.b r8 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.b
            r0 = r8
            r1 = r19
            r2 = r18
            r3 = r21
            r4 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinScreenKt.g(com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit h(ChangeAccountPin.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit i(ChangeAccountPin.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3, Composer composer, int i4) {
        g(state, function1, flow, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
