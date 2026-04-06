package com.hansecom.abt.presentation.screens.main.lock;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.biometric.BiometricHelper;
import com.hansecom.abt.presentation.main.MainActivity;
import com.hansecom.abt.presentation.screens.main.lock.Lock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class LockScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if ((r13 & 1) != 0) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(com.hansecom.abt.presentation.screens.main.lock.LockViewModel r10, androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = -76887088(0xfffffffffb6acbd0, float:-1.2191313E36)
            androidx.compose.runtime.Composer r11 = r11.q(r0)
            r1 = r12 & 6
            r2 = 2
            if (r1 != 0) goto L_0x001c
            r1 = r13 & 1
            if (r1 != 0) goto L_0x0018
            boolean r1 = r11.l(r10)
            if (r1 == 0) goto L_0x0018
            r1 = 4
            goto L_0x0019
        L_0x0018:
            r1 = r2
        L_0x0019:
            r1 = r1 | r12
            r9 = r1
            goto L_0x001d
        L_0x001c:
            r9 = r12
        L_0x001d:
            r1 = r9 & 3
            if (r1 != r2) goto L_0x002d
            boolean r1 = r11.t()
            if (r1 != 0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            r11.B()
            goto L_0x00eb
        L_0x002d:
            r11.p()
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0045
            boolean r1 = r11.J()
            if (r1 == 0) goto L_0x003b
            goto L_0x0045
        L_0x003b:
            r11.B()
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0091
        L_0x0042:
            r9 = r9 & -15
            goto L_0x0091
        L_0x0045:
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0091
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r11.f(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.c(r11, r1)
            if (r2 == 0) goto L_0x0089
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r11, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r11.f(r10)
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L_0x0071
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.n()
        L_0x006f:
            r5 = r10
            goto L_0x0074
        L_0x0071:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x006f
        L_0x0074:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.main.lock.LockViewModel> r1 = com.hansecom.abt.presentation.screens.main.lock.LockViewModel.class
            r3 = 0
            r6 = r11
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.S()
            r11.S()
            com.hansecom.abt.presentation.screens.main.lock.LockViewModel r10 = (com.hansecom.abt.presentation.screens.main.lock.LockViewModel) r10
            goto L_0x0042
        L_0x0089:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x0091:
            r11.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00a0
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.main.lock.LockScreen (LockScreen.kt:57)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00a0:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r11
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.main.lock.Lock$State r1 = h(r0)
            r0 = -1218593809(0xffffffffb75dbbef, float:-1.3216383E-5)
            r11.X(r0)
            boolean r0 = r11.l(r10)
            java.lang.Object r2 = r11.g()
            if (r0 != 0) goto L_0x00c9
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00d1
        L_0x00c9:
            com.hansecom.abt.presentation.screens.main.lock.LockScreenKt$LockScreen$1$1 r2 = new com.hansecom.abt.presentation.screens.main.lock.LockScreenKt$LockScreen$1$1
            r2.<init>(r10)
            r11.N(r2)
        L_0x00d1:
            kotlin.reflect.KFunction r2 = (kotlin.reflect.KFunction) r2
            r11.M()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r10.l()
            r5 = 0
            r6 = 0
            r4 = r11
            j(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00eb
            androidx.compose.runtime.ComposerKt.X()
        L_0x00eb:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.x()
            if (r11 == 0) goto L_0x00f9
            com.hansecom.abt.presentation.screens.main.lock.c r0 = new com.hansecom.abt.presentation.screens.main.lock.c
            r0.<init>(r10, r12, r13)
            r11.a(r0)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.lock.LockScreenKt.g(com.hansecom.abt.presentation.screens.main.lock.LockViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Lock.State h(State state) {
        return (Lock.State) state.getValue();
    }

    public static final Unit i(LockViewModel lockViewModel, int i2, int i3, Composer composer, int i4) {
        g(lockViewModel, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(com.hansecom.abt.presentation.screens.main.lock.Lock.State r23, kotlin.jvm.functions.Function1 r24, kotlinx.coroutines.flow.Flow r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r4 = r27
            r0 = 571769252(0x221481a4, float:2.0126371E-18)
            r1 = r26
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0022
            r2 = r28 & 1
            if (r2 != 0) goto L_0x001d
            r2 = r23
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x001f
            r3 = 4
            goto L_0x0020
        L_0x001d:
            r2 = r23
        L_0x001f:
            r3 = 2
        L_0x0020:
            r3 = r3 | r4
            goto L_0x0025
        L_0x0022:
            r2 = r23
            r3 = r4
        L_0x0025:
            r5 = r28 & 2
            if (r5 == 0) goto L_0x002e
            r3 = r3 | 48
        L_0x002b:
            r6 = r24
            goto L_0x0040
        L_0x002e:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x002b
            r6 = r24
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x003d
            r7 = 32
            goto L_0x003f
        L_0x003d:
            r7 = 16
        L_0x003f:
            r3 = r3 | r7
        L_0x0040:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0059
            r7 = r28 & 4
            if (r7 != 0) goto L_0x0053
            r7 = r25
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x0055
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0053:
            r7 = r25
        L_0x0055:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r3 = r3 | r8
            goto L_0x005b
        L_0x0059:
            r7 = r25
        L_0x005b:
            r8 = r3 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0070
            boolean r8 = r1.t()
            if (r8 != 0) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            r1.B()
            r3 = r6
            r20 = r7
            goto L_0x01ad
        L_0x0070:
            r1.p()
            r8 = r4 & 1
            r15 = 0
            r9 = 1
            if (r8 == 0) goto L_0x0094
            boolean r8 = r1.J()
            if (r8 == 0) goto L_0x0080
            goto L_0x0094
        L_0x0080:
            r1.B()
            r5 = r28 & 1
            if (r5 == 0) goto L_0x0089
            r3 = r3 & -15
        L_0x0089:
            r5 = r28 & 4
            if (r5 == 0) goto L_0x008f
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x008f:
            r13 = r3
            r3 = r6
        L_0x0091:
            r20 = r7
            goto L_0x00d5
        L_0x0094:
            r8 = r28 & 1
            if (r8 == 0) goto L_0x00a0
            com.hansecom.abt.presentation.screens.main.lock.Lock$State r2 = new com.hansecom.abt.presentation.screens.main.lock.Lock$State
            r8 = 0
            r2.<init>(r8, r9, r15)
            r3 = r3 & -15
        L_0x00a0:
            if (r5 == 0) goto L_0x00c2
            r5 = 393001205(0x176cb8f5, float:7.648916E-25)
            r1.X(r5)
            java.lang.Object r5 = r1.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x00bc
            com.hansecom.abt.presentation.screens.main.lock.a r5 = new com.hansecom.abt.presentation.screens.main.lock.a
            r5.<init>()
            r1.N(r5)
        L_0x00bc:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r1.M()
            goto L_0x00c3
        L_0x00c2:
            r5 = r6
        L_0x00c3:
            r6 = r28 & 4
            if (r6 == 0) goto L_0x00d2
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.A()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r13 = r3
            r3 = r5
            r20 = r6
            goto L_0x00d5
        L_0x00d2:
            r13 = r3
            r3 = r5
            goto L_0x0091
        L_0x00d5:
            r1.U()
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x00e4
            r5 = -1
            java.lang.String r6 = "com.hansecom.abt.presentation.screens.main.lock.ScreenImpl (LockScreen.kt:72)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r5, r6)
        L_0x00e4:
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r14 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r0.b(r1, r14)
            long r16 = r5.o()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r1, r14)
            long r11 = r0.x()
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r5 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.f(r0, r5, r9, r15)
            com.hansecom.abt.presentation.screens.main.lock.ComposableSingletons$LockScreenKt r0 = com.hansecom.abt.presentation.screens.main.lock.ComposableSingletons$LockScreenKt.f37663a
            kotlin.jvm.functions.Function2 r6 = r0.a()
            com.hansecom.abt.presentation.screens.main.lock.LockScreenKt$ScreenImpl$2 r0 = new com.hansecom.abt.presentation.screens.main.lock.LockScreenKt$ScreenImpl$2
            r0.<init>(r2, r3)
            r7 = 54
            r8 = -694826253(0xffffffffd695caf3, float:-8.2349446E13)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r9, r0, r1, r7)
            r18 = 805306422(0x30000036, float:4.656643E-10)
            r19 = 316(0x13c, float:4.43E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r21 = 0
            r22 = r13
            r13 = r16
            r15 = r21
            r16 = r0
            r17 = r1
            androidx.compose.material3.ScaffoldKt.f(r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18, r19)
            int r0 = r22 >> 3
            r0 = r0 & 14
            kotlin.jvm.functions.Function0 r0 = n(r3, r1, r0)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            r6 = 393077113(0x176de179, float:7.6863417E-25)
            r1.X(r6)
            boolean r6 = r1.W(r0)
            java.lang.Object r7 = r1.g()
            if (r6 != 0) goto L_0x014f
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r6 = 0
            goto L_0x0158
        L_0x014f:
            com.hansecom.abt.presentation.screens.main.lock.LockScreenKt$ScreenImpl$3$1 r7 = new com.hansecom.abt.presentation.screens.main.lock.LockScreenKt$ScreenImpl$3$1
            r6 = 0
            r7.<init>(r0, r6)
            r1.N(r7)
        L_0x0158:
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r1.M()
            r8 = 6
            androidx.compose.runtime.EffectsKt.g(r5, r7, r1, r8)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r5 = r1.C(r5)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r5 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r5
            r7 = 393081558(0x176df2d6, float:7.688533E-25)
            r1.X(r7)
            boolean r7 = r1.W(r0)
            boolean r9 = r1.l(r5)
            r7 = r7 | r9
            java.lang.Object r9 = r1.g()
            if (r7 != 0) goto L_0x0188
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x0190
        L_0x0188:
            com.hansecom.abt.presentation.screens.main.lock.LockScreenKt$ScreenImpl$4$1 r9 = new com.hansecom.abt.presentation.screens.main.lock.LockScreenKt$ScreenImpl$4$1
            r9.<init>(r0, r5, r6)
            r1.N(r9)
        L_0x0190:
            r0 = r9
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.M()
            int r5 = r22 >> 6
            r10 = r5 & 14
            r11 = 6
            r6 = 0
            r7 = 0
            r5 = r20
            r8 = r0
            r9 = r1
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01ad
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ad:
            androidx.compose.runtime.ScopeUpdateScope r6 = r1.x()
            if (r6 == 0) goto L_0x01c4
            com.hansecom.abt.presentation.screens.main.lock.b r7 = new com.hansecom.abt.presentation.screens.main.lock.b
            r0 = r7
            r1 = r2
            r2 = r3
            r3 = r20
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.lock.LockScreenKt.j(com.hansecom.abt.presentation.screens.main.lock.Lock$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit k(Lock.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit l(Lock.State state, Function1 function1, Flow flow, int i2, int i3, Composer composer, int i4) {
        j(state, function1, flow, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.hansecom.abt.presentation.screens.main.lock.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.hansecom.abt.presentation.screens.main.lock.d} */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (r0 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0082;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.Function0 n(kotlin.jvm.functions.Function1 r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            r0 = 930207770(0x3771d81a, float:1.44150345E-5)
            r10.X(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.main.lock.biometricsPromptLauncher (LockScreen.kt:152)"
            androidx.compose.runtime.ComposerKt.Y(r0, r11, r1, r2)
        L_0x0012:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.presentation.biometric.BiometricHelperKt.c()
            java.lang.Object r0 = r10.C(r0)
            r2 = r0
            com.hansecom.abt.presentation.biometric.BiometricHelper r2 = (com.hansecom.abt.presentation.biometric.BiometricHelper) r2
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.activity.compose.LocalActivityKt.a()
            java.lang.Object r0 = r10.C(r0)
            boolean r1 = r0 instanceof com.hansecom.abt.presentation.main.MainActivity
            if (r1 == 0) goto L_0x002d
            com.hansecom.abt.presentation.main.MainActivity r0 = (com.hansecom.abt.presentation.main.MainActivity) r0
        L_0x002b:
            r3 = r0
            goto L_0x002f
        L_0x002d:
            r0 = 0
            goto L_0x002b
        L_0x002f:
            int r0 = com.hansecom.abt.R.string.W6
            r1 = 0
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.b(r0, r10, r1)
            int r0 = com.hansecom.abt.R.string.V6
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r0, r10, r1)
            int r0 = com.hansecom.abt.R.string.U6
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r0, r10, r1)
            r0 = -1662321619(0xffffffff9ceafc2d, float:-1.5550007E-21)
            r10.X(r0)
            boolean r0 = r10.l(r2)
            boolean r7 = r10.l(r3)
            r0 = r0 | r7
            boolean r7 = r10.W(r4)
            r0 = r0 | r7
            boolean r7 = r10.W(r5)
            r0 = r0 | r7
            boolean r7 = r10.W(r6)
            r0 = r0 | r7
            r7 = r11 & 14
            r7 = r7 ^ 6
            r8 = 4
            if (r7 <= r8) goto L_0x006d
            boolean r7 = r10.W(r9)
            if (r7 != 0) goto L_0x0071
        L_0x006d:
            r11 = r11 & 6
            if (r11 != r8) goto L_0x0072
        L_0x0071:
            r1 = 1
        L_0x0072:
            r11 = r0 | r1
            java.lang.Object r0 = r10.g()
            if (r11 != 0) goto L_0x0082
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x008c
        L_0x0082:
            com.hansecom.abt.presentation.screens.main.lock.d r0 = new com.hansecom.abt.presentation.screens.main.lock.d
            r1 = r0
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.N(r0)
        L_0x008c:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r10.M()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x009a
            androidx.compose.runtime.ComposerKt.X()
        L_0x009a:
            r10.M()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.lock.LockScreenKt.n(kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):kotlin.jvm.functions.Function0");
    }

    public static final Unit o(BiometricHelper biometricHelper, MainActivity mainActivity, String str, String str2, String str3, Function1 function1) {
        Intrinsics.f(mainActivity);
        biometricHelper.e(mainActivity, str, str2, str3, new e(function1), new f(function1));
        return Unit.f40552a;
    }

    public static final Unit p(Function1 function1) {
        function1.invoke(Lock.Action.Unlock.f37668a);
        return Unit.f40552a;
    }

    public static final Unit q(Function1 function1, String str) {
        function1.invoke(new Lock.Action.ErrorOnUnlock(str));
        return Unit.f40552a;
    }
}
