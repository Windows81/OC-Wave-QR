package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class InstitutionsSearchScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if ((r24 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel r19, kotlin.jvm.functions.Function1 r20, kotlin.jvm.functions.Function0 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r8 = r20
            r9 = r21
            r10 = r23
            java.lang.String r0 = "onInstitutionClick"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = 1782445870(0x6a3df72e, float:5.7413563E25)
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel> r11 = com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel.class
            r13 = 0
            r16 = r7
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r11, r12, r13, r14, r15, r16, r17, r18)
            r7.S()
            r7.S()
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel r1 = (com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel) r1
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreen (InstitutionsSearchScreen.kt:45)"
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
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch$State r1 = d(r1)
            r2 = 249646116(0xee14c24, float:5.5540103E-30)
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
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt$InstitutionsSearchScreen$1$1 r2 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt$InstitutionsSearchScreen$1$1
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
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.b r7 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.b
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt.c(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final InstitutionsSearch.State d(State state) {
        return (InstitutionsSearch.State) state.getValue();
    }

    public static final Unit e(InstitutionsSearchViewModel institutionsSearchViewModel, Function1 function1, Function0 function0, int i2, int i3, Composer composer, int i4) {
        c(institutionsSearchViewModel, function1, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b0, code lost:
        if ((r27 & 4) != 0) goto L_0x00b2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch.State r20, kotlin.jvm.functions.Function1 r21, kotlinx.coroutines.flow.Flow r22, kotlin.jvm.functions.Function1 r23, kotlin.jvm.functions.Function0 r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r1 = r20
            r2 = r21
            r4 = r23
            r5 = r24
            r6 = r26
            r0 = 718750018(0x2ad74142, float:3.8236954E-13)
            r3 = r25
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r7 = r27 & 1
            if (r7 == 0) goto L_0x001a
            r7 = r6 | 6
            goto L_0x002a
        L_0x001a:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0029
            boolean r7 = r3.W(r1)
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
            r8 = r27 & 2
            if (r8 == 0) goto L_0x0031
            r7 = r7 | 48
            goto L_0x0041
        L_0x0031:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x0041
            boolean r8 = r3.l(r2)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r7 = r7 | r8
        L_0x0041:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005a
            r8 = r27 & 4
            if (r8 != 0) goto L_0x0054
            r8 = r22
            boolean r9 = r3.l(r8)
            if (r9 == 0) goto L_0x0056
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r8 = r22
        L_0x0056:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r7 = r7 | r9
            goto L_0x005c
        L_0x005a:
            r8 = r22
        L_0x005c:
            r9 = r27 & 8
            if (r9 == 0) goto L_0x0063
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0073
        L_0x0063:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0073
            boolean r9 = r3.l(r4)
            if (r9 == 0) goto L_0x0070
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r7 = r7 | r9
        L_0x0073:
            r9 = r27 & 16
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x007c
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008b
        L_0x007c:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x008b
            boolean r9 = r3.l(r5)
            if (r9 == 0) goto L_0x0088
            r9 = r15
            goto L_0x008a
        L_0x0088:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x008a:
            r7 = r7 | r9
        L_0x008b:
            r9 = r7 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r10) goto L_0x009d
            boolean r9 = r3.t()
            if (r9 != 0) goto L_0x0098
            goto L_0x009d
        L_0x0098:
            r3.B()
            goto L_0x014a
        L_0x009d:
            r3.p()
            r9 = r6 & 1
            if (r9 == 0) goto L_0x00b8
            boolean r9 = r3.J()
            if (r9 == 0) goto L_0x00ab
            goto L_0x00b8
        L_0x00ab:
            r3.B()
            r9 = r27 & 4
            if (r9 == 0) goto L_0x00b4
        L_0x00b2:
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00b4:
            r14 = r7
            r16 = r8
            goto L_0x00c1
        L_0x00b8:
            r9 = r27 & 4
            if (r9 == 0) goto L_0x00b4
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.A()
            goto L_0x00b2
        L_0x00c1:
            r3.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00d0
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.ScreenImpl (InstitutionsSearchScreen.kt:64)"
            androidx.compose.runtime.ComposerKt.Y(r0, r14, r7, r8)
        L_0x00d0:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt$ScreenImpl$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt$ScreenImpl$1
            r0.<init>(r1, r2, r4)
            r7 = 54
            r8 = -413786591(0xffffffffe7561e21, float:-1.0111422E24)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r13, r0, r3, r7)
            r0 = 3072(0xc00, float:4.305E-42)
            r17 = 7
            r7 = 0
            r8 = 0
            r10 = 0
            r18 = r13
            r13 = r3
            r19 = r14
            r14 = r0
            r0 = r15
            r15 = r17
            com.hansecom.abt.ui.components.ScreenContentKt.d(r7, r8, r10, r12, r13, r14, r15)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r7 = r3.C(r7)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r7 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r7
            r8 = 1294178329(0x4d239819, float:1.7154088E8)
            r3.X(r8)
            boolean r8 = r3.l(r7)
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r19 & r9
            if (r9 != r0) goto L_0x0112
            r13 = r18
            goto L_0x0113
        L_0x0112:
            r13 = 0
        L_0x0113:
            r0 = r8 | r13
            java.lang.Object r8 = r3.g()
            if (r0 != 0) goto L_0x0123
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r8 != r0) goto L_0x012c
        L_0x0123:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt$ScreenImpl$2$1 r8 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt$ScreenImpl$2$1
            r0 = 0
            r8.<init>(r7, r5, r0)
            r3.N(r8)
        L_0x012c:
            r10 = r8
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r3.M()
            int r0 = r19 >> 6
            r12 = r0 & 14
            r13 = 6
            r8 = 0
            r9 = 0
            r7 = r16
            r11 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0148
            androidx.compose.runtime.ComposerKt.X()
        L_0x0148:
            r8 = r16
        L_0x014a:
            androidx.compose.runtime.ScopeUpdateScope r9 = r3.x()
            if (r9 == 0) goto L_0x0166
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.a r10 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.a
            r0 = r10
            r1 = r20
            r2 = r21
            r3 = r8
            r4 = r23
            r5 = r24
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt.f(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit g(InstitutionsSearch.State state, Function1 function1, Flow flow, Function1 function12, Function0 function0, int i2, int i3, Composer composer, int i4) {
        f(state, function1, flow, function12, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
