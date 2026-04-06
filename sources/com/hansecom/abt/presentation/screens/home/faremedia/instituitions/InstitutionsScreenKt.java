package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class InstitutionsScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if ((r24 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function1 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r8 = r20
            r9 = r21
            r10 = r23
            java.lang.String r0 = "navigateSearchInstitutions"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onInstitutionClick"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = -543405360(0xffffffffdf9c4ad0, float:-2.2524085E19)
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
            goto L_0x0158
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel> r11 = com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel.class
            r13 = 0
            r16 = r7
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r11, r12, r13, r14, r15, r16, r17, r18)
            r7.S()
            r7.S()
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel r1 = (com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel) r1
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreen (InstitutionsScreen.kt:46)"
            androidx.compose.runtime.ComposerKt.Y(r0, r12, r1, r2)
        L_0x00ec:
            int r0 = r12 << 6
            r13 = r0 & 896(0x380, float:1.256E-42)
            r14 = 3
            r2 = 0
            r3 = 0
            r1 = r11
            r4 = r7
            r15 = r5
            r5 = r13
            r13 = r6
            r6 = r14
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions$State r1 = d(r1)
            r2 = 2089177978(0x7c86537a, float:5.579687E36)
            r7.X(r2)
            r2 = r12 & 14
            r2 = r2 ^ 6
            if (r2 <= r13) goto L_0x0113
            boolean r2 = r7.W(r11)
            if (r2 != 0) goto L_0x0117
        L_0x0113:
            r2 = r12 & 6
            if (r2 != r13) goto L_0x0119
        L_0x0117:
            r5 = 1
            goto L_0x011a
        L_0x0119:
            r5 = r15
        L_0x011a:
            java.lang.Object r2 = r7.g()
            if (r5 != 0) goto L_0x0128
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0130
        L_0x0128:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$InstitutionsScreen$1$1 r2 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$InstitutionsScreen$1$1
            r2.<init>(r11)
            r7.N(r2)
        L_0x0130:
            kotlin.reflect.KFunction r2 = (kotlin.reflect.KFunction) r2
            r7.M()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r11.l()
            r4 = 64512(0xfc00, float:9.04E-41)
            r6 = r0 & r4
            r12 = 0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r20
            r4 = r21
            r5 = r7
            r13 = r7
            r7 = r12
            f(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0157
            androidx.compose.runtime.ComposerKt.X()
        L_0x0157:
            r1 = r11
        L_0x0158:
            androidx.compose.runtime.ScopeUpdateScope r6 = r13.x()
            if (r6 == 0) goto L_0x016f
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.b r7 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.b
            r0 = r7
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt.c(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Institutions.State d(State state) {
        return (Institutions.State) state.getValue();
    }

    public static final Unit e(InstitutionsViewModel institutionsViewModel, Function0 function0, Function1 function1, int i2, int i3, Composer composer, int i4) {
        c(institutionsViewModel, function0, function1, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0097, code lost:
        if ((r24 & 4) != 0) goto L_0x0099;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions.State r17, kotlin.jvm.functions.Function1 r18, kotlinx.coroutines.flow.Flow r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function1 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r1 = r17
            r4 = r20
            r5 = r21
            r6 = r23
            r0 = 1630048636(0x6128917c, float:1.9434602E20)
            r2 = r22
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r24 & 1
            if (r3 == 0) goto L_0x0018
            r3 = r6 | 6
            goto L_0x0028
        L_0x0018:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0027
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x0024
            r3 = 4
            goto L_0x0025
        L_0x0024:
            r3 = 2
        L_0x0025:
            r3 = r3 | r6
            goto L_0x0028
        L_0x0027:
            r3 = r6
        L_0x0028:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0041
            r7 = r24 & 4
            if (r7 != 0) goto L_0x003b
            r7 = r19
            boolean r8 = r2.l(r7)
            if (r8 == 0) goto L_0x003d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x003f
        L_0x003b:
            r7 = r19
        L_0x003d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x003f:
            r3 = r3 | r8
            goto L_0x0043
        L_0x0041:
            r7 = r19
        L_0x0043:
            r8 = r24 & 8
            if (r8 == 0) goto L_0x004a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x005a
        L_0x004a:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x005a
            boolean r8 = r2.l(r4)
            if (r8 == 0) goto L_0x0057
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0059
        L_0x0057:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0059:
            r3 = r3 | r8
        L_0x005a:
            r8 = r24 & 16
            if (r8 == 0) goto L_0x0061
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0071
        L_0x0061:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0071
            boolean r8 = r2.l(r5)
            if (r8 == 0) goto L_0x006e
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0070
        L_0x006e:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0070:
            r3 = r3 | r8
        L_0x0071:
            r8 = r3 & 9347(0x2483, float:1.3098E-41)
            r9 = 9346(0x2482, float:1.3097E-41)
            if (r8 != r9) goto L_0x0084
            boolean r8 = r2.t()
            if (r8 != 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            r2.B()
            r3 = r7
            goto L_0x011a
        L_0x0084:
            r2.p()
            r8 = r6 & 1
            if (r8 == 0) goto L_0x009e
            boolean r8 = r2.J()
            if (r8 == 0) goto L_0x0092
            goto L_0x009e
        L_0x0092:
            r2.B()
            r8 = r24 & 4
            if (r8 == 0) goto L_0x009b
        L_0x0099:
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x009b:
            r15 = r3
            r3 = r7
            goto L_0x00a7
        L_0x009e:
            r8 = r24 & 4
            if (r8 == 0) goto L_0x009b
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.A()
            goto L_0x0099
        L_0x00a7:
            r2.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00b6
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.ScreenImpl (InstitutionsScreen.kt:65)"
            androidx.compose.runtime.ComposerKt.Y(r0, r15, r7, r8)
        L_0x00b6:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$ScreenImpl$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$ScreenImpl$1
            r0.<init>(r1, r5, r4)
            r7 = 54
            r8 = -301386179(0xffffffffee09363d, float:-1.0616254E28)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r9, r0, r2, r7)
            r14 = 3072(0xc00, float:4.305E-42)
            r0 = 7
            r7 = 0
            r8 = 0
            r10 = 0
            r13 = r2
            r16 = r15
            r15 = r0
            com.hansecom.abt.ui.components.ScreenContentKt.d(r7, r8, r10, r12, r13, r14, r15)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r2.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            r7 = 1297653021(0x4d589d1d, float:2.27135952E8)
            r2.X(r7)
            boolean r7 = r2.l(r0)
            java.lang.Object r8 = r2.g()
            if (r7 != 0) goto L_0x00f6
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00ff
        L_0x00f6:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$ScreenImpl$2$1 r8 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt$ScreenImpl$2$1
            r7 = 0
            r8.<init>(r0, r7)
            r2.N(r8)
        L_0x00ff:
            r10 = r8
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r2.M()
            int r0 = r16 >> 6
            r12 = r0 & 14
            r13 = 6
            r8 = 0
            r9 = 0
            r7 = r3
            r11 = r2
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x011a
            androidx.compose.runtime.ComposerKt.X()
        L_0x011a:
            androidx.compose.runtime.ScopeUpdateScope r8 = r2.x()
            if (r8 == 0) goto L_0x0135
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.a r9 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.a
            r0 = r9
            r1 = r17
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsScreenKt.f(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit g(Institutions.State state, Function1 function1, Flow flow, Function0 function0, Function1 function12, int i2, int i3, Composer composer, int i4) {
        f(state, function1, flow, function0, function12, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
