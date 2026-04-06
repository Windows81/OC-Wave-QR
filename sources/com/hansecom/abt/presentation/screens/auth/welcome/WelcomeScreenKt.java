package com.hansecom.abt.presentation.screens.auth.welcome;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.auth.welcome.Welcome;
import com.hansecom.abt.ui.CompositionLocalKt;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.theme.AbtThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class WelcomeScreenKt {
    public static final void c(Welcome.State state, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Composer composer, int i2) {
        int i3;
        int i4 = i2;
        Composer q2 = composer.q(910186614);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(state) ? 4 : 2) | i4;
        } else {
            Welcome.State state2 = state;
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function0) ? 32 : 16;
        } else {
            Function0 function05 = function0;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function02) ? 256 : 128;
        } else {
            Function0 function06 = function02;
        }
        Function0 function07 = function03;
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function07) ? 2048 : 1024;
        }
        Function0 function08 = function04;
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function08) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(910186614, i3, -1, "com.hansecom.abt.presentation.screens.auth.welcome.ScreenImpl (WelcomeScreen.kt:66)");
            }
            ImageKt.a(PainterResources_androidKt.c(R.drawable.f33003e, q2, 0), (String) null, SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), (Alignment) null, ContentScale.f17026a.a(), 0.0f, (ColorFilter) null, q2, 25008, 104);
            AbtThemeKt.b(false, ComposableLambdaKt.e(-1689046766, true, new WelcomeScreenKt$ScreenImpl$1((AbtSnackbarHostState) q2.C(CompositionLocalKt.c()), state, function04, function0, function02, function03), q2, 54), q2, 54, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new b(state, function0, function02, function03, function04, i2));
        }
    }

    public static final Unit d(Welcome.State state, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, Composer composer, int i3) {
        c(state, function0, function02, function03, function04, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c3, code lost:
        if ((r27 & 1) != 0) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function0 r22, kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function0 r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r26
            java.lang.String r0 = "onLogin"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.lang.String r0 = "onRegister"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onGuestModeClick"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "onDebugMenu"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = -25377251(0xfffffffffe7cc61d, float:-8.399853E37)
            r1 = r25
            androidx.compose.runtime.Composer r6 = r1.q(r0)
            r1 = r11 & 6
            if (r1 != 0) goto L_0x003e
            r1 = r27 & 1
            if (r1 != 0) goto L_0x0039
            r1 = r20
            boolean r2 = r6.W(r1)
            if (r2 == 0) goto L_0x003b
            r2 = 4
            goto L_0x003c
        L_0x0039:
            r1 = r20
        L_0x003b:
            r2 = 2
        L_0x003c:
            r2 = r2 | r11
            goto L_0x0041
        L_0x003e:
            r1 = r20
            r2 = r11
        L_0x0041:
            r3 = r27 & 2
            if (r3 == 0) goto L_0x0048
            r2 = r2 | 48
            goto L_0x0058
        L_0x0048:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0058
            boolean r3 = r6.l(r7)
            if (r3 == 0) goto L_0x0055
            r3 = 32
            goto L_0x0057
        L_0x0055:
            r3 = 16
        L_0x0057:
            r2 = r2 | r3
        L_0x0058:
            r3 = r27 & 4
            if (r3 == 0) goto L_0x005f
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005f:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x006f
            boolean r3 = r6.l(r8)
            if (r3 == 0) goto L_0x006c
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r3 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r2 = r2 | r3
        L_0x006f:
            r3 = r27 & 8
            if (r3 == 0) goto L_0x0076
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0076:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0086
            boolean r3 = r6.l(r9)
            if (r3 == 0) goto L_0x0083
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r2 = r2 | r3
        L_0x0086:
            r3 = r27 & 16
            if (r3 == 0) goto L_0x008d
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008d:
            r3 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x009d
            boolean r3 = r6.l(r10)
            if (r3 == 0) goto L_0x009a
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r2 = r2 | r3
        L_0x009d:
            r3 = r2 & 9363(0x2493, float:1.312E-41)
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r4) goto L_0x00b0
            boolean r3 = r6.t()
            if (r3 != 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            r6.B()
            r14 = r6
            goto L_0x0156
        L_0x00b0:
            r6.p()
            r3 = r11 & 1
            if (r3 == 0) goto L_0x00ca
            boolean r3 = r6.J()
            if (r3 == 0) goto L_0x00be
            goto L_0x00ca
        L_0x00be:
            r6.B()
            r3 = r27 & 1
            if (r3 == 0) goto L_0x00c7
        L_0x00c5:
            r2 = r2 & -15
        L_0x00c7:
            r12 = r1
            r13 = r2
            goto L_0x0119
        L_0x00ca:
            r3 = r27 & 1
            if (r3 == 0) goto L_0x00c7
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r6.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r3 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r13 = r1.c(r6, r3)
            if (r13 == 0) goto L_0x0111
            r1 = 0
            androidx.lifecycle.ViewModelProvider$Factory r15 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r13, r6, r1)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r6.f(r1)
            boolean r1 = r13 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L_0x00f7
            r1 = r13
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.n()
        L_0x00f4:
            r16 = r1
            goto L_0x00fa
        L_0x00f7:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00f4
        L_0x00fa:
            r18 = 36936(0x9048, float:5.1758E-41)
            r19 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel> r12 = com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel.class
            r14 = 0
            r17 = r6
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r12, r13, r14, r15, r16, r17, r18, r19)
            r6.S()
            r6.S()
            com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel r1 = (com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel) r1
            goto L_0x00c5
        L_0x0111:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x0119:
            r6.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0128
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.auth.welcome.WelcomeScreen (WelcomeScreen.kt:48)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r1, r2)
        L_0x0128:
            int r0 = r13 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r0 = 3
            r2 = 0
            r3 = 0
            r1 = r12
            r4 = r6
            r14 = r6
            r6 = r0
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.auth.welcome.Welcome$State r0 = f(r0)
            r1 = 65520(0xfff0, float:9.1813E-41)
            r6 = r13 & r1
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r14
            c(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0155
            androidx.compose.runtime.ComposerKt.X()
        L_0x0155:
            r1 = r12
        L_0x0156:
            androidx.compose.runtime.ScopeUpdateScope r12 = r14.x()
            if (r12 == 0) goto L_0x0171
            com.hansecom.abt.presentation.screens.auth.welcome.a r13 = new com.hansecom.abt.presentation.screens.auth.welcome.a
            r0 = r13
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12.a(r13)
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.welcome.WelcomeScreenKt.e(com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Welcome.State f(State state) {
        return (Welcome.State) state.getValue();
    }

    public static final Unit g(WelcomeViewModel welcomeViewModel, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, int i3, Composer composer, int i4) {
        e(welcomeViewModel, function0, function02, function03, function04, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
