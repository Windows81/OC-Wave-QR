package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class FareCappingScreenKt {
    public static final void f(FareCapping.State state, Function1 function1, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1441484867);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(state) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function1) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1441484867, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.Content (FareCappingScreen.kt:79)");
            }
            boolean g2 = state.g();
            q2.X(280198445);
            boolean z2 = (i3 & 112) == 32;
            Object g3 = q2.g();
            if (z2 || g3 == Composer.f14567a.a()) {
                g3 = new a(function1);
                q2.N(g3);
            }
            q2.M();
            PullToRefreshKt.n(g2, (Function0) g3, (Modifier) null, (PullToRefreshState) null, (Alignment) null, (Function3) null, ComposableLambdaKt.e(418117149, true, new FareCappingScreenKt$Content$2(state), q2, 54), q2, 1572864, 60);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new b(state, function1, i2));
        }
    }

    public static final Unit g(Function1 function1) {
        function1.invoke(FareCapping.Action.Refresh.f36712a);
        return Unit.f40552a;
    }

    public static final Unit h(FareCapping.State state, Function1 function1, int i2, Composer composer, int i3) {
        f(state, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if ((r13 & 1) != 0) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel r10, androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = 563156612(0x21911684, float:9.831542E-19)
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel> r1 = com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel.class
            r3 = 0
            r6 = r11
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.S()
            r11.S()
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel r10 = (com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreen (FareCappingScreen.kt:48)"
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
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping$State r1 = j(r0)
            r0 = -722626003(0xffffffffd4ed9a2d, float:-8.1639511E12)
            r11.X(r0)
            boolean r0 = r11.l(r10)
            java.lang.Object r2 = r11.g()
            if (r0 != 0) goto L_0x00c9
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00d1
        L_0x00c9:
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt$FareCappingScreen$1$1 r2 = new com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt$FareCappingScreen$1$1
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
            l(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00eb
            androidx.compose.runtime.ComposerKt.X()
        L_0x00eb:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.x()
            if (r11 == 0) goto L_0x00f9
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.d r0 = new com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.d
            r0.<init>(r10, r12, r13)
            r11.a(r0)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt.i(com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final FareCapping.State j(State state) {
        return (FareCapping.State) state.getValue();
    }

    public static final Unit k(FareCappingViewModel fareCappingViewModel, int i2, int i3, Composer composer, int i4) {
        i(fareCappingViewModel, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007e, code lost:
        if ((r21 & 4) != 0) goto L_0x0080;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping.State r16, kotlin.jvm.functions.Function1 r17, kotlinx.coroutines.flow.Flow r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            r1 = r16
            r2 = r17
            r4 = r20
            r0 = -100170196(0xfffffffffa07862c, float:-1.7592035E35)
            r3 = r19
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r5 = r21 & 1
            if (r5 == 0) goto L_0x0016
            r5 = r4 | 6
            goto L_0x0026
        L_0x0016:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0025
            boolean r5 = r3.W(r1)
            if (r5 == 0) goto L_0x0022
            r5 = 4
            goto L_0x0023
        L_0x0022:
            r5 = 2
        L_0x0023:
            r5 = r5 | r4
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            r6 = r21 & 2
            if (r6 == 0) goto L_0x002d
            r5 = r5 | 48
            goto L_0x003d
        L_0x002d:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x003d
            boolean r6 = r3.l(r2)
            if (r6 == 0) goto L_0x003a
            r6 = 32
            goto L_0x003c
        L_0x003a:
            r6 = 16
        L_0x003c:
            r5 = r5 | r6
        L_0x003d:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0056
            r6 = r21 & 4
            if (r6 != 0) goto L_0x0050
            r6 = r18
            boolean r7 = r3.l(r6)
            if (r7 == 0) goto L_0x0052
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0054
        L_0x0050:
            r6 = r18
        L_0x0052:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0054:
            r5 = r5 | r7
            goto L_0x0058
        L_0x0056:
            r6 = r18
        L_0x0058:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x006b
            boolean r7 = r3.t()
            if (r7 != 0) goto L_0x0065
            goto L_0x006b
        L_0x0065:
            r3.B()
            r14 = r6
            goto L_0x00fe
        L_0x006b:
            r3.p()
            r7 = r4 & 1
            if (r7 == 0) goto L_0x0085
            boolean r7 = r3.J()
            if (r7 == 0) goto L_0x0079
            goto L_0x0085
        L_0x0079:
            r3.B()
            r7 = r21 & 4
            if (r7 == 0) goto L_0x0082
        L_0x0080:
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0082:
            r15 = r5
            r14 = r6
            goto L_0x008e
        L_0x0085:
            r7 = r21 & 4
            if (r7 == 0) goto L_0x0082
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.A()
            goto L_0x0080
        L_0x008e:
            r3.U()
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x009d
            r5 = -1
            java.lang.String r6 = "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.ScreenImpl (FareCappingScreen.kt:59)"
            androidx.compose.runtime.ComposerKt.Y(r0, r15, r5, r6)
        L_0x009d:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r3.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt$ScreenImpl$1 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt$ScreenImpl$1
            r5.<init>(r1, r2)
            r6 = 54
            r7 = -479271285(0xffffffffe36ee68b, float:-4.4069375E21)
            r8 = 1
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r8, r5, r3, r6)
            r12 = 3072(0xc00, float:4.305E-42)
            r13 = 7
            r5 = 0
            r6 = 0
            r8 = 0
            r11 = r3
            com.hansecom.abt.ui.components.ScreenContentKt.d(r5, r6, r8, r10, r11, r12, r13)
            r5 = 741041587(0x2c2b65b3, float:2.4357016E-12)
            r3.X(r5)
            boolean r5 = r3.l(r0)
            java.lang.Object r6 = r3.g()
            if (r5 != 0) goto L_0x00da
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00e3
        L_0x00da:
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt$ScreenImpl$2$1 r6 = new com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt$ScreenImpl$2$1
            r5 = 0
            r6.<init>(r0, r5)
            r3.N(r6)
        L_0x00e3:
            r8 = r6
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r3.M()
            int r0 = r15 >> 6
            r10 = r0 & 14
            r11 = 6
            r6 = 0
            r7 = 0
            r5 = r14
            r9 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00fe
            androidx.compose.runtime.ComposerKt.X()
        L_0x00fe:
            androidx.compose.runtime.ScopeUpdateScope r6 = r3.x()
            if (r6 == 0) goto L_0x0116
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.e r7 = new com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.e
            r0 = r7
            r1 = r16
            r2 = r17
            r3 = r14
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingScreenKt.l(com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit m(FareCapping.State state, Function1 function1, Flow flow, int i2, int i3, Composer composer, int i4) {
        l(state, function1, flow, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void n(String str, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str2 = str;
        Composer q2 = composer.q(1755329431);
        if ((i2 & 6) == 0) {
            i3 = i2 | (q2.W(str2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1755329431, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.SectionHeader (FareCappingScreen.kt:156)");
            }
            Modifier h2 = SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null);
            int f2 = TextAlign.f19080b.f();
            AbtTheme abtTheme = AbtTheme.f38851a;
            composer2 = q2;
            TextKt.j(str, h2, abtTheme.b(q2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(f2), 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).f(), composer2, (i3 & 14) | 48, 0, 130040);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new c(str, i2));
        }
    }

    public static final Unit o(String str, int i2, Composer composer, int i3) {
        n(str, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
