package com.hansecom.abt.presentation.screens.home;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostControllerKt;
import com.hansecom.abt.presentation.screens.home.Home;
import com.hansecom.abt.ui.components.bottomBar.BottomBarItemState;
import com.hansecom.abt.ui.components.bottomBar.BottomBarKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class HomeScreenKt {
    public static final Home.State A(State state) {
        return (Home.State) state.getValue();
    }

    public static final Unit B(HomeViewModel homeViewModel, Function0 function0, int i2, int i3, Composer composer, int i4) {
        y(homeViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void C(androidx.navigation.NavHostController r16, boolean r17, java.lang.String r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r1 = r16
            r3 = r18
            r5 = r21
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            r0 = -1710378717(0xffffffff9a0db123, float:-2.9301206E-23)
            r2 = r20
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r4 = r22 & 1
            if (r4 == 0) goto L_0x001b
            r4 = r5 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r5 & 6
            if (r4 != 0) goto L_0x002a
            boolean r4 = r2.l(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r5
            goto L_0x002b
        L_0x002a:
            r4 = r5
        L_0x002b:
            r6 = r22 & 2
            if (r6 == 0) goto L_0x0034
            r4 = r4 | 48
            r15 = r17
            goto L_0x0046
        L_0x0034:
            r6 = r5 & 48
            r15 = r17
            if (r6 != 0) goto L_0x0046
            boolean r6 = r2.d(r15)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r4 = r4 | r6
        L_0x0046:
            r6 = r22 & 4
            if (r6 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005d
        L_0x004d:
            r6 = r5 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005d
            boolean r6 = r2.W(r3)
            if (r6 == 0) goto L_0x005a
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r4 = r4 | r6
        L_0x005d:
            r6 = r22 & 8
            if (r6 == 0) goto L_0x0066
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0063:
            r7 = r19
            goto L_0x0078
        L_0x0066:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0063
            r7 = r19
            boolean r8 = r2.W(r7)
            if (r8 == 0) goto L_0x0075
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r4 = r4 | r8
        L_0x0078:
            r8 = r4 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x008b
            boolean r8 = r2.t()
            if (r8 != 0) goto L_0x0085
            goto L_0x008b
        L_0x0085:
            r2.B()
            r4 = r7
            goto L_0x0112
        L_0x008b:
            if (r6 == 0) goto L_0x0091
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            r14 = r6
            goto L_0x0092
        L_0x0091:
            r14 = r7
        L_0x0092:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x009e
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.HomeTopBar (HomeScreen.kt:157)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r6, r7)
        L_0x009e:
            r0 = -857007654(0xffffffffcceb19da, float:-1.23260624E8)
            r2.X(r0)
            java.lang.Object r0 = r2.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r6.a()
            if (r0 != r7) goto L_0x00b8
            com.hansecom.abt.presentation.screens.home.e r0 = new com.hansecom.abt.presentation.screens.home.e
            r0.<init>()
            r2.N(r0)
        L_0x00b8:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r2.M()
            r7 = 0
            r8 = 1
            androidx.compose.animation.EnterTransition r0 = androidx.compose.animation.EnterExitTransitionKt.B(r7, r0, r8, r7)
            r9 = -857006278(0xffffffffcceb1f3a, float:-1.23271632E8)
            r2.X(r9)
            java.lang.Object r9 = r2.g()
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x00db
            com.hansecom.abt.presentation.screens.home.j r9 = new com.hansecom.abt.presentation.screens.home.j
            r9.<init>()
            r2.N(r9)
        L_0x00db:
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r2.M()
            androidx.compose.animation.ExitTransition r9 = androidx.compose.animation.EnterExitTransitionKt.E(r7, r9, r8, r7)
            com.hansecom.abt.presentation.screens.home.HomeScreenKt$HomeTopBar$3 r6 = new com.hansecom.abt.presentation.screens.home.HomeScreenKt$HomeTopBar$3
            r6.<init>(r3, r14, r1)
            r7 = 54
            r10 = 1354640379(0x50be2bfb, float:2.55244268E10)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r8, r6, r2, r7)
            int r4 = r4 >> 3
            r4 = r4 & 14
            r6 = 200064(0x30d80, float:2.8035E-40)
            r13 = r4 | r6
            r4 = 18
            r7 = 0
            r10 = 0
            r6 = r17
            r8 = r0
            r12 = r2
            r0 = r14
            r14 = r4
            androidx.compose.animation.AnimatedVisibilityKt.j(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0111
            androidx.compose.runtime.ComposerKt.X()
        L_0x0111:
            r4 = r0
        L_0x0112:
            androidx.compose.runtime.ScopeUpdateScope r7 = r2.x()
            if (r7 == 0) goto L_0x012b
            com.hansecom.abt.presentation.screens.home.k r8 = new com.hansecom.abt.presentation.screens.home.k
            r0 = r8
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.HomeScreenKt.C(androidx.navigation.NavHostController, boolean, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int D(int i2) {
        return -i2;
    }

    public static final int E(int i2) {
        return -i2;
    }

    public static final Unit F(NavHostController navHostController, boolean z2, String str, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        C(navHostController, z2, str, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void G(com.hansecom.abt.presentation.screens.home.Home.State r17, kotlin.jvm.functions.Function1 r18, kotlinx.coroutines.flow.Flow r19, kotlin.jvm.functions.Function0 r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r5 = r22
            r0 = 1354055257(0x50b53e59, float:2.43260969E10)
            r1 = r21
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0022
            r2 = r23 & 1
            if (r2 != 0) goto L_0x001d
            r2 = r17
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x001f
            r3 = 4
            goto L_0x0020
        L_0x001d:
            r2 = r17
        L_0x001f:
            r3 = 2
        L_0x0020:
            r3 = r3 | r5
            goto L_0x0025
        L_0x0022:
            r2 = r17
            r3 = r5
        L_0x0025:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x002e
            r3 = r3 | 48
        L_0x002b:
            r6 = r18
            goto L_0x0040
        L_0x002e:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x002b
            r6 = r18
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x003d
            r7 = 32
            goto L_0x003f
        L_0x003d:
            r7 = 16
        L_0x003f:
            r3 = r3 | r7
        L_0x0040:
            r7 = r23 & 8
            if (r7 == 0) goto L_0x0049
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0046:
            r8 = r20
            goto L_0x005b
        L_0x0049:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0046
            r8 = r20
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x0058
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x005a
        L_0x0058:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x005a:
            r3 = r3 | r9
        L_0x005b:
            r9 = r3 & 1043(0x413, float:1.462E-42)
            r10 = 1042(0x412, float:1.46E-42)
            if (r9 != r10) goto L_0x0071
            boolean r9 = r1.t()
            if (r9 != 0) goto L_0x0068
            goto L_0x0071
        L_0x0068:
            r1.B()
            r3 = r19
            r4 = r6
            r7 = r8
            goto L_0x0159
        L_0x0071:
            r1.p()
            r9 = r5 & 1
            if (r9 == 0) goto L_0x0093
            boolean r9 = r1.J()
            if (r9 == 0) goto L_0x007f
            goto L_0x0093
        L_0x007f:
            r1.B()
            r4 = r23 & 1
            if (r4 == 0) goto L_0x0088
            r3 = r3 & -15
        L_0x0088:
            r4 = r23 & 4
            if (r4 == 0) goto L_0x008e
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x008e:
            r4 = r6
            r7 = r8
            r6 = r19
            goto L_0x00fa
        L_0x0093:
            r9 = r23 & 1
            if (r9 == 0) goto L_0x00a7
            com.hansecom.abt.presentation.screens.home.Home$State r2 = new com.hansecom.abt.presentation.screens.home.Home$State
            r15 = 15
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3 = r3 & -15
        L_0x00a7:
            if (r4 == 0) goto L_0x00c9
            r4 = 1562875876(0x5d2797e4, float:7.5477323E17)
            r1.X(r4)
            java.lang.Object r4 = r1.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r4 != r6) goto L_0x00c3
            com.hansecom.abt.presentation.screens.home.g r4 = new com.hansecom.abt.presentation.screens.home.g
            r4.<init>()
            r1.N(r4)
        L_0x00c3:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r1.M()
            goto L_0x00ca
        L_0x00c9:
            r4 = r6
        L_0x00ca:
            r6 = r23 & 4
            if (r6 == 0) goto L_0x00d5
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.A()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00d7
        L_0x00d5:
            r6 = r19
        L_0x00d7:
            if (r7 == 0) goto L_0x00f9
            r7 = 1562878372(0x5d27a1a4, float:7.5494475E17)
            r1.X(r7)
            java.lang.Object r7 = r1.g()
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x00f3
            com.hansecom.abt.presentation.screens.home.h r7 = new com.hansecom.abt.presentation.screens.home.h
            r7.<init>()
            r1.N(r7)
        L_0x00f3:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r1.M()
            goto L_0x00fa
        L_0x00f9:
            r7 = r8
        L_0x00fa:
            r1.U()
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0109
            r8 = -1
            java.lang.String r9 = "com.hansecom.abt.presentation.screens.home.ScreenImpl (HomeScreen.kt:71)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r8, r9)
        L_0x0109:
            r0 = 0
            androidx.navigation.Navigator[] r3 = new androidx.navigation.Navigator[r0]
            androidx.navigation.NavHostController r13 = androidx.navigation.compose.NavHostControllerKt.e(r3, r1, r0)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r3 = r1.C(r3)
            r15 = r3
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r15 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r15
            androidx.compose.runtime.MutableState r10 = com.hansecom.abt.presentation.navigation.NavigationBarsStateKt.e(r1, r0)
            androidx.compose.runtime.State r9 = androidx.navigation.compose.NavHostControllerKt.d(r13, r1, r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.presentation.biometric.BiometricHelperKt.c()
            java.lang.Object r0 = r1.C(r0)
            com.hansecom.abt.presentation.biometric.BiometricHelper r0 = (com.hansecom.abt.presentation.biometric.BiometricHelper) r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.presentation.navigation.NavigationBarsStateKt.d()
            androidx.compose.runtime.ProvidedValue r0 = r0.d(r10)
            com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3 r3 = new com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3
            r8 = r3
            r11 = r2
            r12 = r4
            r14 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r8 = 54
            r9 = -126987879(0xfffffffff86e5199, float:-1.9334713E34)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r10, r3, r1, r8)
            int r8 = androidx.compose.runtime.ProvidedValue.f14769i
            r8 = r8 | 48
            androidx.compose.runtime.CompositionLocalKt.c(r0, r3, r1, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0158
            androidx.compose.runtime.ComposerKt.X()
        L_0x0158:
            r3 = r6
        L_0x0159:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x016f
            com.hansecom.abt.presentation.screens.home.i r9 = new com.hansecom.abt.presentation.screens.home.i
            r0 = r9
            r1 = r2
            r2 = r4
            r4 = r7
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.a(r9)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.HomeScreenKt.G(com.hansecom.abt.presentation.screens.home.Home$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit H(Home.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3, Composer composer, int i4) {
        G(state, function1, flow, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit I(Home.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit J() {
        return Unit.f40552a;
    }

    public static final NavBackStackEntry K(State state) {
        return (NavBackStackEntry) state.getValue();
    }

    public static final void o(boolean z2, NavHostController navHostController, boolean z3, boolean z4, boolean z5, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        NavHostController navHostController2 = navHostController;
        boolean z6 = z3;
        boolean z7 = z5;
        int i4 = i2;
        Composer q2 = composer.q(1413791417);
        boolean z8 = z2;
        if ((i4 & 6) == 0) {
            i3 = (q2.d(z8) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(navHostController2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z6) ? 256 : 128;
        }
        boolean z9 = z4;
        if ((i4 & 3072) == 0) {
            i3 |= q2.d(z9) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.d(z7) ? 16384 : 8192;
        }
        Function0 function02 = function0;
        if ((i4 & 196608) == 0) {
            i3 |= q2.l(function02) ? 131072 : 65536;
        }
        int i5 = i3;
        if ((74899 & i5) != 74898 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1413791417, i5, -1, "com.hansecom.abt.presentation.screens.home.HomeBottomBar (HomeScreen.kt:179)");
            }
            Object[] objArr = new Object[0];
            q2.X(137857953);
            boolean z10 = (57344 & i5) == 16384;
            Object g2 = q2.g();
            if (z10 || g2 == Composer.f14567a.a()) {
                g2 = new l(z7);
                q2.N(g2);
            }
            q2.M();
            List list = (List) RememberSaveableKt.j(objArr, (Function0) g2, q2, 0);
            Object[] objArr2 = {list};
            q2.X(137867287);
            boolean l2 = q2.l(list);
            Object g3 = q2.g();
            if (l2 || g3 == Composer.f14567a.a()) {
                g3 = new m(list);
                q2.N(g3);
            }
            q2.M();
            List list2 = (List) RememberSaveableKt.j(objArr2, (Function0) g3, q2, 0);
            Object[] objArr3 = new Object[0];
            q2.X(137874007);
            Object g4 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g4 == companion.a()) {
                g4 = new n();
                q2.N(g4);
            }
            q2.M();
            MutableIntState mutableIntState = (MutableIntState) RememberSaveableKt.j(objArr3, (Function0) g4, q2, 48);
            int B1 = z6 ? (int) ((Density) q2.C(CompositionLocalsKt.g())).B1(BottomBarKt.i()) : 0;
            State d2 = NavHostControllerKt.d(navHostController2, q2, (i5 >> 3) & 14);
            NavBackStackEntry u2 = u(d2);
            q2.X(137884836);
            boolean W = q2.W(d2) | q2.W(mutableIntState) | q2.l(list);
            int i6 = i5;
            Object g5 = q2.g();
            if (W || g5 == companion.a()) {
                g5 = new HomeScreenKt$HomeBottomBar$1$1(d2, list, mutableIntState, (Continuation) null);
                q2.N(g5);
            }
            q2.M();
            EffectsKt.f(u2, list, (Function2) g5, q2, 0);
            q2.X(137895177);
            boolean i7 = q2.i(B1);
            Object g6 = q2.g();
            if (i7 || g6 == companion.a()) {
                g6 = new o(B1);
                q2.N(g6);
            }
            q2.M();
            EnterTransition B2 = EnterExitTransitionKt.B((FiniteAnimationSpec) null, (Function1) g6, 1, (Object) null);
            q2.X(137897033);
            boolean i8 = q2.i(B1);
            Object g7 = q2.g();
            if (i8 || g7 == companion.a()) {
                g7 = new p(B1);
                q2.N(g7);
            }
            q2.M();
            composer2 = q2;
            AnimatedVisibilityKt.j(z2, (Modifier) null, B2, EnterExitTransitionKt.E((FiniteAnimationSpec) null, (Function1) g7, 1, (Object) null), (String) null, ComposableLambdaKt.e(-413533471, true, new HomeScreenKt$HomeBottomBar$4(list2, list, mutableIntState, navHostController, z3, z4, function0), q2, 54), composer2, (i6 & 14) | 196608, 18);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new q(z2, navHostController, z3, z4, z5, function0, i2));
        }
    }

    public static final List p(boolean z2) {
        HomeBottomBarItems homeBottomBarItems = HomeBottomBarItems.FareMedia;
        HomeBottomBarItems homeBottomBarItems2 = HomeBottomBarItems.TripPlanner;
        if (!z2) {
            homeBottomBarItems2 = null;
        }
        return CollectionsKt.r(homeBottomBarItems, homeBottomBarItems2, HomeBottomBarItems.Account, HomeBottomBarItems.More);
    }

    public static final List q(List list) {
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        int i2 = 0;
        for (Object next : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.w();
            }
            HomeBottomBarItems homeBottomBarItems = (HomeBottomBarItems) next;
            arrayList.add(new BottomBarItemState(i2, homeBottomBarItems.h(), homeBottomBarItems.k(), homeBottomBarItems.j()));
            i2 = i3;
        }
        return arrayList;
    }

    public static final MutableIntState r() {
        return SnapshotIntStateKt.a(0);
    }

    public static final int s(MutableIntState mutableIntState) {
        return mutableIntState.e();
    }

    public static final void t(MutableIntState mutableIntState, int i2) {
        mutableIntState.k(i2);
    }

    public static final NavBackStackEntry u(State state) {
        return (NavBackStackEntry) state.getValue();
    }

    public static final int v(int i2, int i3) {
        return i3 + i2;
    }

    public static final int w(int i2, int i3) {
        return i3 + i2;
    }

    public static final Unit x(boolean z2, NavHostController navHostController, boolean z3, boolean z4, boolean z5, Function0 function0, int i2, Composer composer, int i3) {
        o(z2, navHostController, z3, z4, z5, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void y(HomeViewModel homeViewModel, Function0 function0, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(1677784877);
        if ((i2 & 6) == 0) {
            i4 = (((i3 & 1) != 0 || !q2.l(homeViewModel)) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function0) ? 32 : 16;
        }
        int i6 = i4;
        if ((i6 & 19) != 18 || !q2.t()) {
            q2.p();
            if ((i2 & 1) == 0 || q2.J()) {
                if ((i3 & 1) != 0) {
                    q2.f(1890788296);
                    ViewModelStoreOwner c2 = LocalViewModelStoreOwner.f22073a.c(q2, LocalViewModelStoreOwner.f22075c);
                    if (c2 != null) {
                        ViewModelProvider.Factory a2 = HiltViewModelKt.a(c2, q2, 0);
                        q2.f(1729797275);
                        ViewModel b2 = ViewModelKt.b(HomeViewModel.class, c2, (String) null, a2, c2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) c2).n() : CreationExtras.Empty.f22064c, q2, 36936, 0);
                        q2.S();
                        q2.S();
                        homeViewModel = (HomeViewModel) b2;
                        i6 &= -15;
                    } else {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                }
                if (i5 != 0) {
                    q2.X(-275397501);
                    Object g2 = q2.g();
                    if (g2 == Composer.f14567a.a()) {
                        g2 = new r();
                        q2.N(g2);
                    }
                    function0 = (Function0) g2;
                    q2.M();
                }
            } else {
                q2.B();
                if ((i3 & 1) != 0) {
                    i6 &= -15;
                }
            }
            q2.U();
            if (ComposerKt.P()) {
                ComposerKt.Y(1677784877, i6, -1, "com.hansecom.abt.presentation.screens.home.HomeScreen (HomeScreen.kt:54)");
            }
            int i7 = i6 << 6;
            Home.State A2 = A(homeViewModel.q((LifecycleOwner) null, (Lifecycle.State) null, q2, i7 & 896, 3));
            q2.X(-275394190);
            boolean l2 = q2.l(homeViewModel);
            Object g3 = q2.g();
            if (l2 || g3 == Composer.f14567a.a()) {
                g3 = new HomeScreenKt$HomeScreen$2$1(homeViewModel);
                q2.N(g3);
            }
            q2.M();
            G(A2, (Function1) ((KFunction) g3), homeViewModel.l(), function0, q2, i7 & 7168, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new f(homeViewModel, function0, i2, i3));
        }
    }

    public static final Unit z() {
        return Unit.f40552a;
    }
}
