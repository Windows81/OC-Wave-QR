package com.hansecom.abt.presentation.screens.main;

import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.LocalActivityKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import com.hansecom.abt.R;
import com.hansecom.abt.data.useCases.appUpdate.AppUpdate;
import com.hansecom.abt.presentation.appUpdate.AppUpdateHelper;
import com.hansecom.abt.presentation.appUpdate.AppUpdateHelperKt;
import com.hansecom.abt.presentation.screens.main.Main;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class MainScreenKt {
    public static final void h(AbtSnackbarHostState abtSnackbarHostState, Main.State state, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-900979120);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(abtSnackbarHostState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(state) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-900979120, i3, -1, "com.hansecom.abt.presentation.screens.main.App (MainScreen.kt:143)");
            }
            NavHostController e2 = NavHostControllerKt.e(new Navigator[0], q2, 0);
            CompositionLocalKt.d(new ProvidedValue[]{MainNavigationKt.l().d(e2), com.hansecom.abt.ui.CompositionLocalKt.c().d(abtSnackbarHostState)}, ComposableLambdaKt.e(327064336, true, new MainScreenKt$App$1(state, e2, NavHostControllerKt.e(new Navigator[0], q2, 0)), q2, 54), q2, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new u(abtSnackbarHostState, state, i2));
        }
    }

    public static final Unit i(AbtSnackbarHostState abtSnackbarHostState, Main.State state, int i2, Composer composer, int i3) {
        h(abtSnackbarHostState, state, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if ((r14 & 1) != 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(com.hansecom.abt.presentation.screens.main.MainViewModel r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            r0 = -1707893051(0xffffffff9a339ec5, float:-3.7144585E-23)
            androidx.compose.runtime.Composer r12 = r12.q(r0)
            r1 = r13 & 6
            r2 = 2
            if (r1 != 0) goto L_0x001c
            r1 = r14 & 1
            if (r1 != 0) goto L_0x0018
            boolean r1 = r12.l(r11)
            if (r1 == 0) goto L_0x0018
            r1 = 4
            goto L_0x0019
        L_0x0018:
            r1 = r2
        L_0x0019:
            r1 = r1 | r13
            r9 = r1
            goto L_0x001d
        L_0x001c:
            r9 = r13
        L_0x001d:
            r1 = r9 & 3
            if (r1 != r2) goto L_0x002d
            boolean r1 = r12.t()
            if (r1 != 0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            r12.B()
            goto L_0x0137
        L_0x002d:
            r12.p()
            r1 = r13 & 1
            r10 = 0
            if (r1 == 0) goto L_0x0046
            boolean r1 = r12.J()
            if (r1 == 0) goto L_0x003c
            goto L_0x0046
        L_0x003c:
            r12.B()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0091
        L_0x0043:
            r9 = r9 & -15
            goto L_0x0091
        L_0x0046:
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0091
            r11 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.f(r11)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r11 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r11.c(r12, r1)
            if (r2 == 0) goto L_0x0089
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r12, r10)
            r11 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.f(r11)
            boolean r11 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r11 == 0) goto L_0x0071
            r11 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r11 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r11
            androidx.lifecycle.viewmodel.CreationExtras r11 = r11.n()
        L_0x006f:
            r5 = r11
            goto L_0x0074
        L_0x0071:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r11 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x006f
        L_0x0074:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.main.MainViewModel> r1 = com.hansecom.abt.presentation.screens.main.MainViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r11 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.main.MainViewModel r11 = (com.hansecom.abt.presentation.screens.main.MainViewModel) r11
            goto L_0x0043
        L_0x0089:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r11.<init>(r12)
            throw r11
        L_0x0091:
            r12.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00a0
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.main.MainScreen (MainScreen.kt:54)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00a0:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r11
            r4 = r12
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.activity.compose.LocalActivityKt.a()
            java.lang.Object r1 = r12.C(r1)
            java.lang.String r2 = "null cannot be cast to non-null type com.hansecom.abt.presentation.main.MainActivity"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            com.hansecom.abt.presentation.main.MainActivity r1 = (com.hansecom.abt.presentation.main.MainActivity) r1
            androidx.compose.runtime.ProvidableCompositionLocal r2 = com.hansecom.abt.presentation.biometric.BiometricHelperKt.c()
            java.lang.Object r2 = r12.C(r2)
            com.hansecom.abt.presentation.biometric.BiometricHelper r2 = (com.hansecom.abt.presentation.biometric.BiometricHelper) r2
            r3 = 495192687(0x1d840a6f, float:3.4950897E-21)
            r12.X(r3)
            boolean r3 = r12.l(r11)
            boolean r4 = r12.l(r2)
            r3 = r3 | r4
            boolean r4 = r12.l(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r12.g()
            if (r3 != 0) goto L_0x00e8
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x00f1
        L_0x00e8:
            com.hansecom.abt.presentation.screens.main.MainScreenKt$MainScreen$1$1 r4 = new com.hansecom.abt.presentation.screens.main.MainScreenKt$MainScreen$1$1
            r3 = 0
            r4.<init>(r11, r2, r1, r3)
            r12.N(r4)
        L_0x00f1:
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r12.M()
            androidx.compose.runtime.EffectsKt.g(r1, r4, r12, r10)
            com.hansecom.abt.presentation.screens.main.Main$State r1 = k(r0)
            r0 = 495201938(0x1d842e92, float:3.498826E-21)
            r12.X(r0)
            boolean r0 = r12.l(r11)
            java.lang.Object r2 = r12.g()
            if (r0 != 0) goto L_0x0115
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x011d
        L_0x0115:
            com.hansecom.abt.presentation.screens.main.MainScreenKt$MainScreen$2$1 r2 = new com.hansecom.abt.presentation.screens.main.MainScreenKt$MainScreen$2$1
            r2.<init>(r11)
            r12.N(r2)
        L_0x011d:
            kotlin.reflect.KFunction r2 = (kotlin.reflect.KFunction) r2
            r12.M()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r11.l()
            r5 = 0
            r6 = 0
            r4 = r12
            m(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0137
            androidx.compose.runtime.ComposerKt.X()
        L_0x0137:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x0145
            com.hansecom.abt.presentation.screens.main.t r0 = new com.hansecom.abt.presentation.screens.main.t
            r0.<init>(r11, r13, r14)
            r12.a(r0)
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.MainScreenKt.j(com.hansecom.abt.presentation.screens.main.MainViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Main.State k(State state) {
        return (Main.State) state.getValue();
    }

    public static final Unit l(MainViewModel mainViewModel, int i2, int i3, Composer composer, int i4) {
        j(mainViewModel, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(com.hansecom.abt.presentation.screens.main.Main.State r20, kotlin.jvm.functions.Function1 r21, kotlinx.coroutines.flow.Flow r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r0 = 1632852273(0x61535931, float:2.4366812E20)
            r1 = r23
            androidx.compose.runtime.Composer r10 = r1.q(r0)
            r1 = r24 & 6
            if (r1 != 0) goto L_0x0021
            r1 = r25 & 1
            if (r1 != 0) goto L_0x001b
            r1 = r20
            boolean r2 = r10.W(r1)
            if (r2 == 0) goto L_0x001d
            r2 = 4
            goto L_0x001e
        L_0x001b:
            r1 = r20
        L_0x001d:
            r2 = 2
        L_0x001e:
            r2 = r24 | r2
            goto L_0x0025
        L_0x0021:
            r1 = r20
            r2 = r24
        L_0x0025:
            r3 = r25 & 2
            if (r3 == 0) goto L_0x002e
            r2 = r2 | 48
        L_0x002b:
            r4 = r21
            goto L_0x0040
        L_0x002e:
            r4 = r24 & 48
            if (r4 != 0) goto L_0x002b
            r4 = r21
            boolean r5 = r10.l(r4)
            if (r5 == 0) goto L_0x003d
            r5 = 32
            goto L_0x003f
        L_0x003d:
            r5 = 16
        L_0x003f:
            r2 = r2 | r5
        L_0x0040:
            r5 = r2 & 19
            r6 = 18
            if (r5 != r6) goto L_0x0054
            boolean r5 = r10.t()
            if (r5 != 0) goto L_0x004d
            goto L_0x0054
        L_0x004d:
            r10.B()
            r2 = r1
            r3 = r4
            goto L_0x0132
        L_0x0054:
            r10.p()
            r5 = r24 & 1
            if (r5 == 0) goto L_0x006e
            boolean r5 = r10.J()
            if (r5 == 0) goto L_0x0062
            goto L_0x006e
        L_0x0062:
            r10.B()
            r3 = r25 & 1
            if (r3 == 0) goto L_0x006b
            r2 = r2 & -15
        L_0x006b:
            r11 = r1
            r12 = r4
            goto L_0x00a9
        L_0x006e:
            r5 = r25 & 1
            if (r5 == 0) goto L_0x0086
            com.hansecom.abt.presentation.screens.main.Main$State r1 = new com.hansecom.abt.presentation.screens.main.Main$State
            r18 = 63
            r19 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = r2 & -15
        L_0x0086:
            if (r3 == 0) goto L_0x006b
            r3 = 601706986(0x23dd51ea, float:2.399556E-17)
            r10.X(r3)
            java.lang.Object r3 = r10.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x00a2
            com.hansecom.abt.presentation.screens.main.r r3 = new com.hansecom.abt.presentation.screens.main.r
            r3.<init>()
            r10.N(r3)
        L_0x00a2:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r10.M()
            r11 = r1
            r12 = r3
        L_0x00a9:
            r10.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00b8
            r1 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.main.ScreenImpl (MainScreen.kt:79)"
            androidx.compose.runtime.ComposerKt.Y(r0, r2, r1, r3)
        L_0x00b8:
            java.lang.Object r0 = r10.g()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r1.a()
            if (r0 != r3) goto L_0x00cd
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r0 = androidx.compose.runtime.EffectsKt.j(r0, r10)
            r10.N(r0)
        L_0x00cd:
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r3 = r10.C(r3)
            android.content.Context r3 = (android.content.Context) r3
            r4 = 601711609(0x23dd63f9, float:2.4003208E-17)
            r10.X(r4)
            java.lang.Object r4 = r10.g()
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x00f1
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r4 = new com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState
            r4.<init>(r3, r0)
            r10.N(r4)
        L_0x00f1:
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r4 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r4
            r10.M()
            int r0 = r2 >> 3
            r0 = r0 & 14
            r1 = 3
            int r2 = r2 << r1
            r2 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            p(r12, r11, r4, r10, r0)
            h(r4, r11, r10, r2)
            boolean r0 = r11.d()
            androidx.compose.animation.EnterTransition$Companion r2 = androidx.compose.animation.EnterTransition.f2274a
            androidx.compose.animation.EnterTransition r3 = r2.a()
            r2 = 0
            r4 = 0
            androidx.compose.animation.ExitTransition r4 = androidx.compose.animation.EnterExitTransitionKt.q(r4, r2, r1, r4)
            com.hansecom.abt.presentation.screens.main.ComposableSingletons$MainScreenKt r1 = com.hansecom.abt.presentation.screens.main.ComposableSingletons$MainScreenKt.f37533a
            kotlin.jvm.functions.Function3 r6 = r1.a()
            r8 = 199680(0x30c00, float:2.79811E-40)
            r9 = 18
            r2 = 0
            r5 = 0
            r1 = r0
            r7 = r10
            androidx.compose.animation.AnimatedVisibilityKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0130
            androidx.compose.runtime.ComposerKt.X()
        L_0x0130:
            r2 = r11
            r3 = r12
        L_0x0132:
            androidx.compose.runtime.ScopeUpdateScope r0 = r10.x()
            if (r0 == 0) goto L_0x0147
            com.hansecom.abt.presentation.screens.main.s r7 = new com.hansecom.abt.presentation.screens.main.s
            r1 = r7
            r4 = r22
            r5 = r24
            r6 = r25
            r1.<init>(r2, r3, r4, r5, r6)
            r0.a(r7)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.MainScreenKt.m(com.hansecom.abt.presentation.screens.main.Main$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit n(Main.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit o(Main.State state, Function1 function1, Flow flow, int i2, int i3, Composer composer, int i4) {
        m(state, function1, flow, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void p(Function1 function1, Main.State state, AbtSnackbarHostState abtSnackbarHostState, Composer composer, int i2) {
        int i3;
        ManagedActivityResultLauncher a2;
        Function1 function12 = function1;
        Main.State state2 = state;
        AbtSnackbarHostState abtSnackbarHostState2 = abtSnackbarHostState;
        int i4 = i2;
        Composer q2 = composer.q(-1782934609);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function12) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(state2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(abtSnackbarHostState2) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1782934609, i3, -1, "com.hansecom.abt.presentation.screens.main.SoftUpdateWarning (MainScreen.kt:105)");
            }
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, q2);
                q2.N(g2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) g2;
            Context context = (Context) q2.C(AndroidCompositionLocals_androidKt.g());
            AppUpdateHelper appUpdateHelper = (AppUpdateHelper) q2.C(AppUpdateHelperKt.c());
            Activity activity = (Activity) q2.C(LocalActivityKt.a());
            q2.X(-1883734987);
            boolean z2 = true;
            if (activity == null) {
                a2 = null;
            } else {
                ActivityResultContracts.StartIntentSenderForResult startIntentSenderForResult = new ActivityResultContracts.StartIntentSenderForResult();
                q2.X(-881955064);
                boolean z3 = (i3 & 14) == 4;
                Object g3 = q2.g();
                if (z3 || g3 == companion.a()) {
                    g3 = new v(function12);
                    q2.N(g3);
                }
                q2.M();
                a2 = ActivityResultRegistryKt.a(startIntentSenderForResult, (Function1) g3, q2, 0);
            }
            ManagedActivityResultLauncher managedActivityResultLauncher = a2;
            q2.M();
            AppUpdate c2 = state.c();
            q2.X(-1883725669);
            if ((i3 & 112) != 32) {
                z2 = false;
            }
            boolean l2 = q2.l(managedActivityResultLauncher) | z2 | q2.l(appUpdateHelper) | q2.l(coroutineScope) | q2.l(context) | q2.l(abtSnackbarHostState2);
            Object g4 = q2.g();
            if (l2 || g4 == companion.a()) {
                MainScreenKt$SoftUpdateWarning$1$1 mainScreenKt$SoftUpdateWarning$1$1 = new MainScreenKt$SoftUpdateWarning$1$1(state, managedActivityResultLauncher, appUpdateHelper, coroutineScope, context, abtSnackbarHostState, (Continuation) null);
                q2.N(mainScreenKt$SoftUpdateWarning$1$1);
                g4 = mainScreenKt$SoftUpdateWarning$1$1;
            }
            q2.M();
            EffectsKt.g(c2, (Function2) g4, q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new w(function12, state2, abtSnackbarHostState2, i4));
        }
    }

    public static final Unit q(Function1 function1, ActivityResult activityResult) {
        Intrinsics.i(activityResult, "it");
        if (activityResult.b() == 0) {
            function1.invoke(Main.Action.IgnoreAppUpdate.f37553a);
        }
        return Unit.f40552a;
    }

    public static final Unit r(Function1 function1, Main.State state, AbtSnackbarHostState abtSnackbarHostState, int i2, Composer composer, int i3) {
        p(function1, state, abtSnackbarHostState, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void s(Composer composer, int i2) {
        Composer q2 = composer.q(1046694376);
        if (i2 != 0 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1046694376, i2, -1, "com.hansecom.abt.presentation.screens.main.Splash (MainScreen.kt:192)");
            }
            ImageKt.a(PainterResources_androidKt.c(R.drawable.k0, q2, 0), (String) null, SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), (Alignment) null, ContentScale.f17026a.a(), 0.0f, (ColorFilter) null, q2, 25008, 104);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new q(i2));
        }
    }

    public static final Unit t(int i2, Composer composer, int i3) {
        s(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
