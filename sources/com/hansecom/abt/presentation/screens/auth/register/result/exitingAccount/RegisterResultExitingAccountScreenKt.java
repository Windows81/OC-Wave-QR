package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class RegisterResultExitingAccountScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if ((r24 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountViewModel r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function0 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r8 = r20
            r9 = r21
            r10 = r23
            java.lang.String r0 = "onBack"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onLogin"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = -1672539019(0xffffffff9c4f1475, float:-6.8516995E-22)
            r1 = r22
            androidx.compose.runtime.Composer r7 = r1.q(r0)
            r1 = r10 & 6
            r6 = 4
            if (r1 != 0) goto L_0x0031
            r1 = r24 & 1
            if (r1 != 0) goto L_0x002c
            r1 = r19
            boolean r2 = r7.W(r1)
            if (r2 == 0) goto L_0x002e
            r2 = r6
            goto L_0x002f
        L_0x002c:
            r1 = r19
        L_0x002e:
            r2 = 2
        L_0x002f:
            r2 = r2 | r10
            goto L_0x0034
        L_0x0031:
            r1 = r19
            r2 = r10
        L_0x0034:
            r3 = r24 & 2
            if (r3 == 0) goto L_0x003b
            r2 = r2 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r10 & 48
            if (r3 != 0) goto L_0x004b
            boolean r3 = r7.l(r8)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r2 = r2 | r3
        L_0x004b:
            r3 = r24 & 4
            if (r3 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0062
            boolean r3 = r7.l(r9)
            if (r3 == 0) goto L_0x005f
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r2 = r2 | r3
        L_0x0062:
            r3 = r2 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x0075
            boolean r3 = r7.t()
            if (r3 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            r7.B()
            r13 = r7
            goto L_0x0155
        L_0x0075:
            r7.p()
            r3 = r10 & 1
            r5 = 0
            if (r3 == 0) goto L_0x0090
            boolean r3 = r7.J()
            if (r3 == 0) goto L_0x0084
            goto L_0x0090
        L_0x0084:
            r7.B()
            r3 = r24 & 1
            if (r3 == 0) goto L_0x008d
        L_0x008b:
            r2 = r2 & -15
        L_0x008d:
            r11 = r1
            r12 = r2
            goto L_0x00dd
        L_0x0090:
            r3 = r24 & 1
            if (r3 == 0) goto L_0x008d
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r7.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r3 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r12 = r1.c(r7, r3)
            if (r12 == 0) goto L_0x00d5
            androidx.lifecycle.ViewModelProvider$Factory r14 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r12, r7, r5)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r7.f(r1)
            boolean r1 = r12 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L_0x00bb
            r1 = r12
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.n()
        L_0x00b9:
            r15 = r1
            goto L_0x00be
        L_0x00bb:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00b9
        L_0x00be:
            r17 = 36936(0x9048, float:5.1758E-41)
            r18 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountViewModel> r11 = com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountViewModel.class
            r13 = 0
            r16 = r7
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r11, r12, r13, r14, r15, r16, r17, r18)
            r7.S()
            r7.S()
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountViewModel r1 = (com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountViewModel) r1
            goto L_0x008b
        L_0x00d5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r7.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00ec
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreen (RegisterResultExitingAccountScreen.kt:37)"
            androidx.compose.runtime.ComposerKt.Y(r0, r12, r1, r2)
        L_0x00ec:
            int r0 = r12 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r13 = 3
            r2 = 0
            r3 = 0
            r1 = r11
            r4 = r7
            r14 = r5
            r5 = r0
            r0 = r6
            r6 = r13
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccount$State r2 = d(r1)
            r1 = 330369624(0x13b10a58, float:4.469128E-27)
            r7.X(r1)
            r1 = r12 & 14
            r1 = r1 ^ 6
            if (r1 <= r0) goto L_0x0113
            boolean r1 = r7.W(r11)
            if (r1 != 0) goto L_0x0117
        L_0x0113:
            r1 = r12 & 6
            if (r1 != r0) goto L_0x0119
        L_0x0117:
            r5 = 1
            goto L_0x011a
        L_0x0119:
            r5 = r14
        L_0x011a:
            java.lang.Object r0 = r7.g()
            if (r5 != 0) goto L_0x0128
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0130
        L_0x0128:
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt$RegisterResultExitingAccountScreen$1$1 r0 = new com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt$RegisterResultExitingAccountScreen$1$1
            r0.<init>(r11)
            r7.N(r0)
        L_0x0130:
            kotlin.reflect.KFunction r0 = (kotlin.reflect.KFunction) r0
            r7.M()
            kotlinx.coroutines.flow.Flow r4 = r11.l()
            r3 = r0
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            int r0 = r12 >> 3
            r6 = r0 & 126(0x7e, float:1.77E-43)
            r12 = 0
            r0 = r20
            r1 = r21
            r5 = r7
            r13 = r7
            r7 = r12
            f(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0154
            androidx.compose.runtime.ComposerKt.X()
        L_0x0154:
            r1 = r11
        L_0x0155:
            androidx.compose.runtime.ScopeUpdateScope r6 = r13.x()
            if (r6 == 0) goto L_0x016c
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.e r7 = new com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.e
            r0 = r7
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt.c(com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final RegisterResultExitingAccount.State d(State state) {
        return (RegisterResultExitingAccount.State) state.getValue();
    }

    public static final Unit e(RegisterResultExitingAccountViewModel registerResultExitingAccountViewModel, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        c(registerResultExitingAccountViewModel, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function0 r24, com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccount.State r25, kotlin.jvm.functions.Function1 r26, kotlinx.coroutines.flow.Flow r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r1 = r23
            r2 = r24
            r3 = r25
            r6 = r29
            r0 = -550034855(0xffffffffdf372259, float:-1.3196208E19)
            r4 = r28
            androidx.compose.runtime.Composer r4 = r4.q(r0)
            r5 = r30 & 1
            if (r5 == 0) goto L_0x0018
            r5 = r6 | 6
            goto L_0x0028
        L_0x0018:
            r5 = r6 & 6
            if (r5 != 0) goto L_0x0027
            boolean r5 = r4.l(r1)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = 2
        L_0x0025:
            r5 = r5 | r6
            goto L_0x0028
        L_0x0027:
            r5 = r6
        L_0x0028:
            r7 = r30 & 2
            if (r7 == 0) goto L_0x002f
            r5 = r5 | 48
            goto L_0x003f
        L_0x002f:
            r7 = r6 & 48
            if (r7 != 0) goto L_0x003f
            boolean r7 = r4.l(r2)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r5 = r5 | r7
        L_0x003f:
            r7 = r30 & 4
            if (r7 == 0) goto L_0x0046
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0056
        L_0x0046:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0056
            boolean r7 = r4.W(r3)
            if (r7 == 0) goto L_0x0053
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0053:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r5 = r5 | r7
        L_0x0056:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x006a
            boolean r7 = r4.t()
            if (r7 != 0) goto L_0x0063
            goto L_0x006a
        L_0x0063:
            r4.B()
            r5 = r27
            goto L_0x00fa
        L_0x006a:
            r4.p()
            r7 = r6 & 1
            r8 = -57345(0xffffffffffff1fff, float:NaN)
            if (r7 == 0) goto L_0x0087
            boolean r7 = r4.J()
            if (r7 == 0) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            r4.B()
            r7 = r30 & 16
            if (r7 == 0) goto L_0x0083
            r5 = r5 & r8
        L_0x0083:
            r7 = r5
            r5 = r27
            goto L_0x0095
        L_0x0087:
            r7 = r30 & 16
            if (r7 == 0) goto L_0x0083
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.A()
            r5 = r5 & r8
            r22 = r7
            r7 = r5
            r5 = r22
        L_0x0095:
            r4.U()
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x00a4
            r8 = -1
            java.lang.String r9 = "com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.ScreenImpl (RegisterResultExitingAccountScreen.kt:56)"
            androidx.compose.runtime.ComposerKt.Y(r0, r7, r8, r9)
        L_0x00a4:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r4.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r8 = 0
            r9 = 0
            r10 = 1
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.f(r7, r8, r10, r9)
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt$ScreenImpl$1 r8 = new com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt$ScreenImpl$1
            r8.<init>(r1)
            r9 = -527475427(0xffffffffe08f5d1d, float:-8.264356E19)
            r11 = 54
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r10, r8, r4, r11)
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt$ScreenImpl$2 r9 = new com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt$ScreenImpl$2
            r9.<init>(r0)
            r0 = 2042649631(0x79c05c1f, float:1.2484868E35)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r10, r9, r4, r11)
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt$ScreenImpl$3 r9 = new com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt$ScreenImpl$3
            r9.<init>(r3, r2)
            r12 = 2006056040(0x7791fc68, float:5.921894E33)
            androidx.compose.runtime.internal.ComposableLambda r18 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r12, r10, r9, r4, r11)
            r20 = 805309494(0x30000c36, float:4.658348E-10)
            r21 = 500(0x1f4, float:7.0E-43)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r10 = r0
            r19 = r4
            androidx.compose.material3.ScaffoldKt.f(r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00fa
            androidx.compose.runtime.ComposerKt.X()
        L_0x00fa:
            androidx.compose.runtime.ScopeUpdateScope r8 = r4.x()
            if (r8 == 0) goto L_0x0115
            com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.d r9 = new com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.d
            r0 = r9
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r29
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccountScreenKt.f(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccount$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit g(Function0 function0, Function0 function02, RegisterResultExitingAccount.State state, Function1 function1, Flow flow, int i2, int i3, Composer composer, int i4) {
        f(function0, function02, state, function1, flow, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
