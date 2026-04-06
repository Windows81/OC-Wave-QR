package com.hansecom.abt.presentation.screens.auth.register.result.needsActivation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class RegisterResultNeedsActivationScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if ((r15 & 1) != 0) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function0 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            java.lang.String r0 = "onBack"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onLogin"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 722428317(0x2b0f619d, float:5.093927E-13)
            androidx.compose.runtime.Composer r13 = r13.q(r0)
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0024
            r1 = r15 & 1
            if (r1 != 0) goto L_0x0021
            boolean r1 = r13.l(r10)
            if (r1 == 0) goto L_0x0021
            r1 = 4
            goto L_0x0022
        L_0x0021:
            r1 = 2
        L_0x0022:
            r1 = r1 | r14
            goto L_0x0025
        L_0x0024:
            r1 = r14
        L_0x0025:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x002c
            r1 = r1 | 48
            goto L_0x003c
        L_0x002c:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x003c
            boolean r2 = r13.l(r11)
            if (r2 == 0) goto L_0x0039
            r2 = 32
            goto L_0x003b
        L_0x0039:
            r2 = 16
        L_0x003b:
            r1 = r1 | r2
        L_0x003c:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0042:
            r9 = r1
            goto L_0x0055
        L_0x0044:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r13.l(r12)
            if (r2 == 0) goto L_0x0051
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0053
        L_0x0051:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0053:
            r1 = r1 | r2
            goto L_0x0042
        L_0x0055:
            r1 = r9 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x0068
            boolean r1 = r13.t()
            if (r1 != 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            r13.B()
        L_0x0065:
            r2 = r10
            goto L_0x012e
        L_0x0068:
            r13.p()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0080
            boolean r1 = r13.J()
            if (r1 == 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            r13.B()
            r1 = r15 & 1
            if (r1 == 0) goto L_0x00cc
        L_0x007d:
            r9 = r9 & -15
            goto L_0x00cc
        L_0x0080:
            r1 = r15 & 1
            if (r1 == 0) goto L_0x00cc
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r13.f(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.c(r13, r1)
            if (r2 == 0) goto L_0x00c4
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r13, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r13.f(r10)
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L_0x00ac
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.n()
        L_0x00aa:
            r5 = r10
            goto L_0x00af
        L_0x00ac:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00aa
        L_0x00af:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel> r1 = com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.S()
            r13.S()
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel r10 = (com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel) r10
            goto L_0x007d
        L_0x00c4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00cc:
            r13.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00db
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreen (RegisterResultNeedsActivationScreen.kt:43)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00db:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r13
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation$State r3 = d(r0)
            r0 = -149916286(0xfffffffff7107582, float:-2.929977E33)
            r13.X(r0)
            boolean r0 = r13.l(r10)
            java.lang.Object r1 = r13.g()
            if (r0 != 0) goto L_0x0104
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x010c
        L_0x0104:
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$RegisterResultNeedsActivationScreen$1$1 r1 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$RegisterResultNeedsActivationScreen$1$1
            r1.<init>(r10)
            r13.N(r1)
        L_0x010c:
            kotlin.reflect.KFunction r1 = (kotlin.reflect.KFunction) r1
            r13.M()
            kotlinx.coroutines.flow.Flow r5 = r10.l()
            r4 = r1
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            int r0 = r9 >> 3
            r7 = r0 & 126(0x7e, float:1.77E-43)
            r8 = 0
            r1 = r11
            r2 = r12
            r6 = r13
            f(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0065
        L_0x012e:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.x()
            if (r10 == 0) goto L_0x0141
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.d r13 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.d
            r1 = r13
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r10.a(r13)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt.c(com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final RegisterResultNeedsActivation.State d(State state) {
        return (RegisterResultNeedsActivation.State) state.getValue();
    }

    public static final Unit e(RegisterResultNeedsActivationViewModel registerResultNeedsActivationViewModel, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        c(registerResultNeedsActivationViewModel, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b2, code lost:
        if ((r33 & 16) != 0) goto L_0x00b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function0 r27, com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation.State r28, kotlin.jvm.functions.Function1 r29, kotlinx.coroutines.flow.Flow r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r6 = r32
            r0 = 1740272911(0x67ba750f, float:1.761039E24)
            r5 = r31
            androidx.compose.runtime.Composer r5 = r5.q(r0)
            r7 = r33 & 1
            if (r7 == 0) goto L_0x001a
            r7 = r6 | 6
            goto L_0x002a
        L_0x001a:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0029
            boolean r7 = r5.l(r1)
            if (r7 == 0) goto L_0x0026
            r7 = 4
            goto L_0x0027
        L_0x0026:
            r7 = 2
        L_0x0027:
            r7 = r7 | r6
            goto L_0x002a
        L_0x0029:
            r7 = r6
        L_0x002a:
            r8 = r33 & 2
            if (r8 == 0) goto L_0x0031
            r7 = r7 | 48
            goto L_0x0041
        L_0x0031:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x0041
            boolean r8 = r5.l(r2)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r7 = r7 | r8
        L_0x0041:
            r8 = r33 & 4
            if (r8 == 0) goto L_0x0048
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0058
        L_0x0048:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0058
            boolean r8 = r5.W(r3)
            if (r8 == 0) goto L_0x0055
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r7 = r7 | r8
        L_0x0058:
            r8 = r33 & 8
            if (r8 == 0) goto L_0x005f
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x006f
        L_0x005f:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x006f
            boolean r8 = r5.l(r4)
            if (r8 == 0) goto L_0x006c
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x006e
        L_0x006c:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x006e:
            r7 = r7 | r8
        L_0x006f:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0088
            r8 = r33 & 16
            if (r8 != 0) goto L_0x0082
            r8 = r30
            boolean r9 = r5.l(r8)
            if (r9 == 0) goto L_0x0084
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0086
        L_0x0082:
            r8 = r30
        L_0x0084:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0086:
            r7 = r7 | r9
            goto L_0x008a
        L_0x0088:
            r8 = r30
        L_0x008a:
            r9 = r7 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r10) goto L_0x009c
            boolean r9 = r5.t()
            if (r9 != 0) goto L_0x0097
            goto L_0x009c
        L_0x0097:
            r5.B()
            goto L_0x017e
        L_0x009c:
            r5.p()
            r9 = r6 & 1
            r10 = -57345(0xffffffffffff1fff, float:NaN)
            if (r9 == 0) goto L_0x00b9
            boolean r9 = r5.J()
            if (r9 == 0) goto L_0x00ad
            goto L_0x00b9
        L_0x00ad:
            r5.B()
            r9 = r33 & 16
            if (r9 == 0) goto L_0x00b5
        L_0x00b4:
            r7 = r7 & r10
        L_0x00b5:
            r15 = r7
            r22 = r8
            goto L_0x00c2
        L_0x00b9:
            r9 = r33 & 16
            if (r9 == 0) goto L_0x00b5
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.A()
            goto L_0x00b4
        L_0x00c2:
            r5.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00d1
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.ScreenImpl (RegisterResultNeedsActivationScreen.kt:62)"
            androidx.compose.runtime.ComposerKt.Y(r0, r15, r7, r8)
        L_0x00d1:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r5.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r8 = 0
            r9 = 1
            r13 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.f(r7, r8, r9, r13)
            java.lang.String r8 = "RegisterResultNeedsActivationScreen"
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.TestTagKt.a(r7, r8)
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$ScreenImpl$1 r8 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$ScreenImpl$1
            r8.<init>(r1)
            r10 = 1945046739(0x73ef0ed3, float:3.7880237E31)
            r11 = 54
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r9, r8, r5, r11)
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$ScreenImpl$2 r10 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$ScreenImpl$2
            r10.<init>(r0)
            r12 = -2065935019(0xffffffff84dc5555, float:-5.1800117E-36)
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r12, r9, r10, r5, r11)
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$ScreenImpl$3 r12 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$ScreenImpl$3
            r12.<init>(r3, r2, r4)
            r14 = 1422329694(0x54c7075e, float:6.8385767E12)
            androidx.compose.runtime.internal.ComposableLambda r18 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r9, r12, r5, r11)
            r20 = 805309494(0x30000c36, float:4.658348E-10)
            r21 = 500(0x1f4, float:7.0E-43)
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r23 = 0
            r19 = 0
            r13 = r16
            r25 = r15
            r15 = r23
            r17 = r19
            r19 = r5
            androidx.compose.material3.ScaffoldKt.f(r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21)
            int r7 = com.hansecom.abt.R.string.L8
            java.lang.String r8 = r28.c()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r9 = 0
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.c(r7, r8, r5, r9)
            r8 = 347993314(0x14bdf4e2, float:1.9180712E-26)
            r5.X(r8)
            boolean r8 = r5.l(r0)
            boolean r9 = r5.W(r7)
            r8 = r8 | r9
            java.lang.Object r9 = r5.g()
            if (r8 != 0) goto L_0x0157
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0160
        L_0x0157:
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$ScreenImpl$4$1 r9 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt$ScreenImpl$4$1
            r8 = 0
            r9.<init>(r0, r7, r8)
            r5.N(r9)
        L_0x0160:
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r5.M()
            int r0 = r25 >> 12
            r12 = r0 & 14
            r13 = 6
            r8 = 0
            r9 = 0
            r7 = r22
            r11 = r5
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x017c
            androidx.compose.runtime.ComposerKt.X()
        L_0x017c:
            r8 = r22
        L_0x017e:
            androidx.compose.runtime.ScopeUpdateScope r9 = r5.x()
            if (r9 == 0) goto L_0x019a
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.e r10 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.e
            r0 = r10
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r8
            r6 = r32
            r7 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationScreenKt.f(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit g(Function0 function0, Function0 function02, RegisterResultNeedsActivation.State state, Function1 function1, Flow flow, int i2, int i3, Composer composer, int i4) {
        f(function0, function02, state, function1, flow, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
