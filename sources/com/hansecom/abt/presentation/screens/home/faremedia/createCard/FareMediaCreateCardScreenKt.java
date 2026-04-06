package com.hansecom.abt.presentation.screens.home.faremedia.createCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard;
import com.hansecom.abt.ui.components.ScreenContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class FareMediaCreateCardScreenKt {
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel r17, kotlin.jvm.functions.Function0 r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            r0 = r17
            r6 = r18
            r7 = r20
            r8 = r21
            java.lang.String r1 = "onCardCreated"
            kotlin.jvm.internal.Intrinsics.i(r6, r1)
            r1 = -351067764(0xffffffffeb13218c, float:-1.7787052E26)
            r2 = r19
            androidx.compose.runtime.Composer r5 = r2.q(r1)
            r2 = r7 & 6
            r3 = 4
            if (r2 != 0) goto L_0x0033
            r2 = r8 & 1
            if (r2 != 0) goto L_0x0030
            r2 = r7 & 8
            if (r2 != 0) goto L_0x0028
            boolean r2 = r5.W(r0)
            goto L_0x002c
        L_0x0028:
            boolean r2 = r5.l(r0)
        L_0x002c:
            if (r2 == 0) goto L_0x0030
            r2 = r3
            goto L_0x0031
        L_0x0030:
            r2 = 2
        L_0x0031:
            r2 = r2 | r7
            goto L_0x0034
        L_0x0033:
            r2 = r7
        L_0x0034:
            r4 = r8 & 2
            if (r4 == 0) goto L_0x003b
            r2 = r2 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r7 & 48
            if (r4 != 0) goto L_0x004b
            boolean r4 = r5.l(r6)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r2 = r2 | r4
        L_0x004b:
            r4 = r2 & 19
            r9 = 18
            if (r4 != r9) goto L_0x005f
            boolean r4 = r5.t()
            if (r4 != 0) goto L_0x0058
            goto L_0x005f
        L_0x0058:
            r5.B()
            r15 = r0
            r10 = r5
            goto L_0x0140
        L_0x005f:
            r5.p()
            r4 = r7 & 1
            r15 = 0
            if (r4 == 0) goto L_0x007a
            boolean r4 = r5.J()
            if (r4 == 0) goto L_0x006e
            goto L_0x007a
        L_0x006e:
            r5.B()
            r4 = r8 & 1
            if (r4 == 0) goto L_0x0077
            r2 = r2 & -15
        L_0x0077:
            r4 = r15
        L_0x0078:
            r15 = r0
            goto L_0x00ca
        L_0x007a:
            r4 = r8 & 1
            if (r4 == 0) goto L_0x0077
            r0 = 1890788296(0x70b323c8, float:4.435286E29)
            r5.f(r0)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r0 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r4 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r10 = r0.c(r5, r4)
            if (r10 == 0) goto L_0x00c2
            androidx.lifecycle.ViewModelProvider$Factory r12 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r10, r5, r15)
            r0 = 1729797275(0x671a9c9b, float:7.301333E23)
            r5.f(r0)
            boolean r0 = r10 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r0 == 0) goto L_0x00a5
            r0 = r10
            androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
            androidx.lifecycle.viewmodel.CreationExtras r0 = r0.n()
        L_0x00a3:
            r13 = r0
            goto L_0x00a8
        L_0x00a5:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00a3
        L_0x00a8:
            r0 = 36936(0x9048, float:5.1758E-41)
            r16 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel> r9 = com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel.class
            r11 = 0
            r14 = r5
            r4 = r15
            r15 = r0
            androidx.lifecycle.ViewModel r0 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r9, r10, r11, r12, r13, r14, r15, r16)
            r5.S()
            r5.S()
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel) r0
            r2 = r2 & -15
            goto L_0x0078
        L_0x00c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x00ca:
            r5.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00d9
            r0 = -1
            java.lang.String r9 = "com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardScreen (FareMediaCreateCardScreen.kt:43)"
            androidx.compose.runtime.ComposerKt.Y(r1, r2, r0, r9)
        L_0x00d9:
            int r0 = com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase.f33896c
            int r0 = r0 << 6
            int r1 = r2 << 6
            r9 = r1 & 896(0x380, float:1.256E-42)
            r13 = r0 | r9
            r14 = 3
            r10 = 0
            r11 = 0
            r9 = r15
            r12 = r5
            androidx.compose.runtime.State r0 = r9.q(r10, r11, r12, r13, r14)
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard$State r0 = d(r0)
            r9 = -1390588693(0xffffffffad1d4ceb, float:-8.941496E-12)
            r5.X(r9)
            r9 = r2 & 14
            r9 = r9 ^ 6
            if (r9 <= r3) goto L_0x0102
            boolean r9 = r5.l(r15)
            if (r9 != 0) goto L_0x0106
        L_0x0102:
            r2 = r2 & 6
            if (r2 != r3) goto L_0x0108
        L_0x0106:
            r2 = 1
            goto L_0x0109
        L_0x0108:
            r2 = r4
        L_0x0109:
            java.lang.Object r3 = r5.g()
            if (r2 != 0) goto L_0x0117
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x011f
        L_0x0117:
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardScreenKt$FareMediaCreateCardScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardScreenKt$FareMediaCreateCardScreen$1$1
            r3.<init>(r15)
            r5.N(r3)
        L_0x011f:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r5.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r15.l()
            r9 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r2
            r2 = r3
            r3 = r18
            r4 = r5
            r10 = r5
            r5 = r9
            f(r0, r1, r2, r3, r4, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0140
            androidx.compose.runtime.ComposerKt.X()
        L_0x0140:
            androidx.compose.runtime.ScopeUpdateScope r0 = r10.x()
            if (r0 == 0) goto L_0x014e
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.a r1 = new com.hansecom.abt.presentation.screens.home.faremedia.createCard.a
            r1.<init>(r15, r6, r7, r8)
            r0.a(r1)
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardScreenKt.c(com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final FareMediaCreateCard.State d(State state) {
        return (FareMediaCreateCard.State) state.getValue();
    }

    public static final Unit e(FareMediaCreateCardViewModel fareMediaCreateCardViewModel, Function0 function0, int i2, int i3, Composer composer, int i4) {
        c(fareMediaCreateCardViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void f(FareMediaCreateCard.State state, Function1 function1, Flow flow, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1533018100);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(state) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(flow) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= q2.l(function0) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1533018100, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.createCard.ScreenImpl (FareMediaCreateCardScreen.kt:59)");
            }
            ScreenContentKt.d(TestTagKt.a(Modifier.f15489d, "FareMediaCreateCardScreen"), 0, 0, ComposableLambdaKt.e(2097645965, true, new FareMediaCreateCardScreenKt$ScreenImpl$1(state, flow, function0, function1), q2, 54), q2, 3078, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new b(state, function1, flow, function0, i2));
        }
    }

    public static final Unit g(FareMediaCreateCard.State state, Function1 function1, Flow flow, Function0 function0, int i2, Composer composer, int i3) {
        f(state, function1, flow, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
