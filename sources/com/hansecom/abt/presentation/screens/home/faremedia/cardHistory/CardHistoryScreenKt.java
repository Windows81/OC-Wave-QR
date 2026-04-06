package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class CardHistoryScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if ((r13 & 1) != 0) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel r10, androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = -1934138520(0xffffffff8cb76368, float:-2.8255442E-31)
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel> r1 = com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel.class
            r3 = 0
            r6 = r11
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.S()
            r11.S()
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel r10 = (com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreen (CardHistoryScreen.kt:45)"
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
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$State r1 = f(r0)
            r0 = 883081225(0x34a2c009, float:3.0314575E-7)
            r11.X(r0)
            boolean r0 = r11.l(r10)
            java.lang.Object r2 = r11.g()
            if (r0 != 0) goto L_0x00c9
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00d1
        L_0x00c9:
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$CardHistoryScreen$1$1 r2 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$CardHistoryScreen$1$1
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
            k(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00eb
            androidx.compose.runtime.ComposerKt.X()
        L_0x00eb:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.x()
            if (r11 == 0) goto L_0x00f9
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.c r0 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.c
            r0.<init>(r10, r12, r13)
            r11.a(r0)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt.e(com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final CardHistory.State f(State state) {
        return (CardHistory.State) state.getValue();
    }

    public static final Unit g(CardHistoryViewModel cardHistoryViewModel, int i2, int i3, Composer composer, int i4) {
        e(cardHistoryViewModel, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory.State r20, kotlin.jvm.functions.Function1 r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r6 = r20
            r7 = r21
            r8 = r23
            r0 = -696138109(0xffffffffd681c683, float:-7.1344801E13)
            r1 = r22
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r8 & 6
            r2 = 4
            if (r1 != 0) goto L_0x001f
            boolean r1 = r15.W(r6)
            if (r1 == 0) goto L_0x001c
            r1 = r2
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r8
            goto L_0x0020
        L_0x001f:
            r1 = r8
        L_0x0020:
            r3 = r8 & 48
            r14 = 32
            if (r3 != 0) goto L_0x0031
            boolean r3 = r15.l(r7)
            if (r3 == 0) goto L_0x002e
            r3 = r14
            goto L_0x0030
        L_0x002e:
            r3 = 16
        L_0x0030:
            r1 = r1 | r3
        L_0x0031:
            r3 = r1 & 19
            r4 = 18
            if (r3 != r4) goto L_0x0044
            boolean r3 = r15.t()
            if (r3 != 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            r15.B()
            r1 = r15
            goto L_0x011a
        L_0x0044:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0050
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.Content (CardHistoryScreen.kt:75)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r3, r4)
        L_0x0050:
            r0 = 3
            r13 = 0
            androidx.compose.foundation.lazy.LazyListState r12 = androidx.compose.foundation.lazy.LazyListStateKt.b(r13, r13, r15, r13, r0)
            kotlinx.collections.immutable.PersistentList r3 = r20.e()
            kotlin.jvm.internal.Intrinsics.f(r3)
            boolean r0 = r20.c()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            int r0 = r20.f()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r0 = -1993497434(0xffffffff892da4a6, float:-2.0901535E-33)
            r15.X(r0)
            boolean r0 = r15.W(r12)
            boolean r4 = r15.W(r3)
            r0 = r0 | r4
            r4 = r1 & 14
            if (r4 != r2) goto L_0x0082
            r2 = 1
            goto L_0x0083
        L_0x0082:
            r2 = r13
        L_0x0083:
            r0 = r0 | r2
            r5 = r1 & 112(0x70, float:1.57E-43)
            if (r5 != r14) goto L_0x008a
            r1 = 1
            goto L_0x008b
        L_0x008a:
            r1 = r13
        L_0x008b:
            r0 = r0 | r1
            java.lang.Object r1 = r15.g()
            if (r0 != 0) goto L_0x009e
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            r19 = r5
            goto L_0x00b5
        L_0x009e:
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$Content$1$1 r4 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$Content$1$1
            r16 = 0
            r0 = r4
            r1 = r12
            r2 = r3
            r3 = r20
            r9 = r4
            r4 = r21
            r19 = r5
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r15.N(r9)
            r1 = r9
        L_0x00b5:
            r0 = r1
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.M()
            r1 = 0
            r2 = 1
            r9 = r12
            r3 = r12
            r12 = r0
            r0 = r13
            r13 = r15
            r4 = r14
            r14 = r1
            androidx.compose.runtime.EffectsKt.e(r9, r10, r11, r12, r13, r14)
            boolean r9 = r20.g()
            r1 = -1993487141(0xffffffff892dccdb, float:-2.092044E-33)
            r15.X(r1)
            r1 = r19
            if (r1 != r4) goto L_0x00d7
            r13 = r2
            goto L_0x00d8
        L_0x00d7:
            r13 = r0
        L_0x00d8:
            java.lang.Object r0 = r15.g()
            if (r13 != 0) goto L_0x00e6
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x00ee
        L_0x00e6:
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.a r0 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.a
            r0.<init>(r7)
            r15.N(r0)
        L_0x00ee:
            r10 = r0
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r15.M()
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$Content$3 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$Content$3
            r0.<init>(r3, r6)
            r1 = 54
            r3 = -1719505827(0xffffffff99826c5d, float:-1.3485453E-23)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r2, r0, r15, r1)
            r17 = 1572864(0x180000, float:2.204052E-39)
            r18 = 60
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r1 = r15
            r15 = r0
            r16 = r1
            androidx.compose.material3.pulltorefresh.PullToRefreshKt.n(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x011a
            androidx.compose.runtime.ComposerKt.X()
        L_0x011a:
            androidx.compose.runtime.ScopeUpdateScope r0 = r1.x()
            if (r0 == 0) goto L_0x0128
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.b r1 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.b
            r1.<init>(r6, r7, r8)
            r0.a(r1)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt.h(com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$State, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit i(Function1 function1) {
        function1.invoke(CardHistory.Action.Refresh.f36373a);
        return Unit.f40552a;
    }

    public static final Unit j(CardHistory.State state, Function1 function1, int i2, Composer composer, int i3) {
        h(state, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
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
    public static final void k(com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory.State r16, kotlin.jvm.functions.Function1 r17, kotlinx.coroutines.flow.Flow r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            r1 = r16
            r2 = r17
            r4 = r20
            r0 = 2057174124(0x7a9dfc6c, float:4.1015517E35)
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
            java.lang.String r6 = "com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.ScreenImpl (CardHistoryScreen.kt:56)"
            androidx.compose.runtime.ComposerKt.Y(r0, r15, r5, r6)
        L_0x009d:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r3.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$ScreenImpl$1 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$ScreenImpl$1
            r5.<init>(r1, r2)
            r6 = 54
            r7 = 1678073035(0x64055ccb, float:9.840414E21)
            r8 = 1
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r8, r5, r3, r6)
            r12 = 3072(0xc00, float:4.305E-42)
            r13 = 7
            r5 = 0
            r6 = 0
            r8 = 0
            r11 = r3
            com.hansecom.abt.ui.components.ScreenContentKt.d(r5, r6, r8, r10, r11, r12, r13)
            r5 = 1104679813(0x41d81385, float:27.009531)
            r3.X(r5)
            boolean r5 = r3.l(r0)
            java.lang.Object r6 = r3.g()
            if (r5 != 0) goto L_0x00da
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00e3
        L_0x00da:
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$ScreenImpl$2$1 r6 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt$ScreenImpl$2$1
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
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.d r7 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.d
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryScreenKt.k(com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit l(CardHistory.State state, Function1 function1, Flow flow, int i2, int i3, Composer composer, int i4) {
        k(state, function1, flow, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
