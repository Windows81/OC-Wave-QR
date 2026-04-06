package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class AutoloadSetupScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if ((r14 & 1) != 0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel r10, kotlin.jvm.functions.Function0 r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "goBack"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = 828585994(0x3163380a, float:3.3064702E-9)
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel> r1 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel r10 = (com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreen (AutoloadSetupScreen.kt:67)"
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
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State r1 = e(r1)
            r2 = -1477554551(0xffffffffa7ee4e89, float:-6.614342E-15)
            r12.X(r2)
            boolean r2 = r12.l(r10)
            java.lang.Object r3 = r12.g()
            if (r2 != 0) goto L_0x00e7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00ef
        L_0x00e7:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$AutoloadSetupScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$AutoloadSetupScreen$1$1
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
            i(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010b
            androidx.compose.runtime.ComposerKt.X()
        L_0x010b:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x0119
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.c r0 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.c
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt.d(com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AutoloadSetup.State e(State state) {
        return (AutoloadSetup.State) state.getValue();
    }

    public static final Unit f(AutoloadSetupViewModel autoloadSetupViewModel, Function0 function0, int i2, int i3, Composer composer, int i4) {
        d(autoloadSetupViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void g(Function0 function0, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1804176522);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1804176522, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.PaymentMethodDeleteAction (AutoloadSetupScreen.kt:309)");
            }
            IconKt.d(PainterResources_androidKt.c(R.drawable.Y, q2, 0), (String) null, ClickableKt.f(SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), false, (String) null, (Role) null, function0, 7, (Object) null), AbtTheme.f38851a.b(q2, 6).b(), q2, 48, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0529b(function0, i2));
        }
    }

    public static final Unit h(Function0 function0, int i2, Composer composer, int i3) {
        g(function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup.State r30, kotlin.jvm.functions.Function1 r31, kotlinx.coroutines.flow.Flow r32, kotlin.jvm.functions.Function0 r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            r1 = r30
            r2 = r31
            r4 = r33
            r5 = r35
            r0 = 161047934(0x999657e, float:3.6928853E-33)
            r3 = r34
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
            r15 = r32
            if (r7 != 0) goto L_0x0043
            boolean r7 = r3.l(r15)
            if (r7 == 0) goto L_0x0040
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0042
        L_0x0040:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r6 = r6 | r7
        L_0x0043:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            r14 = 2048(0x800, float:2.87E-42)
            if (r7 != 0) goto L_0x0054
            boolean r7 = r3.l(r4)
            if (r7 == 0) goto L_0x0051
            r7 = r14
            goto L_0x0053
        L_0x0051:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r6 = r6 | r7
        L_0x0054:
            r13 = r6
            r6 = r13 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0067
            boolean r6 = r3.t()
            if (r6 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r3.B()
            goto L_0x0156
        L_0x0067:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0073
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ScreenImpl (AutoloadSetupScreen.kt:84)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r6, r7)
        L_0x0073:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r0 = r3.C(r0)
            androidx.compose.ui.focus.FocusManager r0 = (androidx.compose.ui.focus.FocusManager) r0
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r7 = "AutoloadSetupScreen"
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.platform.TestTagKt.a(r6, r7)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$1 r7 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$1
            r7.<init>(r1, r2, r0)
            r0 = 54
            r8 = -1381541057(0xffffffffada75b3f, float:-1.9026223E-11)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r12, r7, r3, r0)
            r0 = 3078(0xc06, float:4.313E-42)
            r16 = 6
            r7 = 0
            r9 = 0
            r27 = r12
            r12 = r3
            r28 = r13
            r13 = r0
            r0 = r14
            r14 = r16
            com.hansecom.abt.ui.components.ScreenContentKt.d(r6, r7, r9, r11, r12, r13, r14)
            r6 = -239988233(0xfffffffff1b211f7, float:-1.7635216E30)
            r3.X(r6)
            boolean r6 = r30.p()
            r14 = 0
            if (r6 == 0) goto L_0x00ed
            int r6 = com.hansecom.abt.R.string.h1
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r6, r3, r14)
            int r7 = com.hansecom.abt.R.string.g1
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r3, r14)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ComposableSingletons$AutoloadSetupScreenKt r8 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ComposableSingletons$AutoloadSetupScreenKt.f36331a
            kotlin.jvm.functions.Function2 r10 = r8.c()
            r25 = 0
            r26 = 131052(0x1ffec, float:1.83643E-40)
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r29 = r14
            r14 = r16
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r23 = r3
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x00ef
        L_0x00ed:
            r29 = r14
        L_0x00ef:
            r3.M()
            androidx.compose.runtime.ProvidableCompositionLocal r6 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r6 = r3.C(r6)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r6 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r7 = r3.C(r7)
            android.content.Context r7 = (android.content.Context) r7
            r8 = -239974358(0xfffffffff1b2482a, float:-1.7656183E30)
            r3.X(r8)
            boolean r8 = r3.l(r6)
            r9 = r28
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != r0) goto L_0x0119
            r12 = r27
            goto L_0x011b
        L_0x0119:
            r12 = r29
        L_0x011b:
            r0 = r8 | r12
            boolean r8 = r3.l(r7)
            r0 = r0 | r8
            java.lang.Object r8 = r3.g()
            if (r0 != 0) goto L_0x0130
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r8 != r0) goto L_0x0139
        L_0x0130:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$2$1 r8 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt$ScreenImpl$2$1
            r0 = 0
            r8.<init>(r6, r4, r7, r0)
            r3.N(r8)
        L_0x0139:
            r0 = r8
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r3.M()
            int r6 = r9 >> 6
            r11 = r6 & 14
            r12 = 6
            r7 = 0
            r8 = 0
            r6 = r32
            r9 = r0
            r10 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0156
            androidx.compose.runtime.ComposerKt.X()
        L_0x0156:
            androidx.compose.runtime.ScopeUpdateScope r6 = r3.x()
            if (r6 == 0) goto L_0x016f
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.a r7 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.a
            r0 = r7
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupScreenKt.i(com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit j(AutoloadSetup.State state, Function1 function1, Flow flow, Function0 function0, int i2, Composer composer, int i3) {
        i(state, function1, flow, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
