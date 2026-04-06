package com.hansecom.abt.presentation.screens.home.account.address;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChangeAddressScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c6, code lost:
        if ((r32 & 1) != 0) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel r25, kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function0 r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function0 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r6 = r26
            r14 = r27
            r15 = r28
            r5 = r29
            r4 = r31
            java.lang.String r0 = "onUp"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "onCountryClick"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "onStateClick"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "onSuccess"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            r0 = 639968543(0x2625251f, float:5.7296183E-16)
            r1 = r30
            androidx.compose.runtime.Composer r3 = r1.q(r0)
            r1 = r4 & 6
            if (r1 != 0) goto L_0x003e
            r1 = r32 & 1
            if (r1 != 0) goto L_0x0039
            r1 = r25
            boolean r2 = r3.l(r1)
            if (r2 == 0) goto L_0x003b
            r2 = 4
            goto L_0x003c
        L_0x0039:
            r1 = r25
        L_0x003b:
            r2 = 2
        L_0x003c:
            r2 = r2 | r4
            goto L_0x0041
        L_0x003e:
            r1 = r25
            r2 = r4
        L_0x0041:
            r7 = r32 & 2
            r13 = 32
            if (r7 == 0) goto L_0x004a
            r2 = r2 | 48
            goto L_0x0059
        L_0x004a:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0059
            boolean r7 = r3.l(r6)
            if (r7 == 0) goto L_0x0056
            r7 = r13
            goto L_0x0058
        L_0x0056:
            r7 = 16
        L_0x0058:
            r2 = r2 | r7
        L_0x0059:
            r7 = r32 & 4
            if (r7 == 0) goto L_0x0060
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0070
        L_0x0060:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0070
            boolean r7 = r3.l(r14)
            if (r7 == 0) goto L_0x006d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r2 = r2 | r7
        L_0x0070:
            r7 = r32 & 8
            if (r7 == 0) goto L_0x0077
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0077:
            r7 = r4 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0087
            boolean r7 = r3.l(r15)
            if (r7 == 0) goto L_0x0084
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r2 = r2 | r7
        L_0x0087:
            r7 = r32 & 16
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x0090
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x0090:
            r7 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x009f
            boolean r7 = r3.l(r5)
            if (r7 == 0) goto L_0x009c
            r7 = r12
            goto L_0x009e
        L_0x009c:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r2 = r2 | r7
        L_0x009f:
            r7 = r2 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r8) goto L_0x00b2
            boolean r7 = r3.t()
            if (r7 != 0) goto L_0x00ac
            goto L_0x00b2
        L_0x00ac:
            r3.B()
            r0 = r3
            goto L_0x020d
        L_0x00b2:
            r3.p()
            r7 = r4 & 1
            r11 = 0
            if (r7 == 0) goto L_0x00d0
            boolean r7 = r3.J()
            if (r7 == 0) goto L_0x00c1
            goto L_0x00d0
        L_0x00c1:
            r3.B()
            r7 = r32 & 1
            if (r7 == 0) goto L_0x00ca
        L_0x00c8:
            r2 = r2 & -15
        L_0x00ca:
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x0121
        L_0x00d0:
            r7 = r32 & 1
            if (r7 == 0) goto L_0x00ca
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r3.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r7 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r1 = r1.c(r3, r7)
            if (r1 == 0) goto L_0x0119
            androidx.lifecycle.ViewModelProvider$Factory r19 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r1, r3, r11)
            r7 = 1729797275(0x671a9c9b, float:7.301333E23)
            r3.f(r7)
            boolean r7 = r1 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r7 == 0) goto L_0x00fc
            r7 = r1
            androidx.lifecycle.HasDefaultViewModelProviderFactory r7 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r7
            androidx.lifecycle.viewmodel.CreationExtras r7 = r7.n()
        L_0x00f9:
            r20 = r7
            goto L_0x00ff
        L_0x00fc:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r7 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00f9
        L_0x00ff:
            r22 = 36936(0x9048, float:5.1758E-41)
            r23 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel> r16 = com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel.class
            r18 = 0
            r17 = r1
            r21 = r3
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r16, r17, r18, r19, r20, r21, r22, r23)
            r3.S()
            r3.S()
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel r1 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel) r1
            goto L_0x00c8
        L_0x0119:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x0121:
            r3.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0130
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreen (ChangeAddressScreen.kt:47)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r7, r8)
        L_0x0130:
            int r0 = r1 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r16 = 3
            r8 = 0
            r9 = 0
            r7 = r2
            r10 = r3
            r17 = r11
            r11 = r0
            r0 = r12
            r12 = r16
            androidx.compose.runtime.State r7 = r7.q(r8, r9, r10, r11, r12)
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State r7 = e(r7)
            r8 = 972623472(0x39f90e70, float:4.7503738E-4)
            r3.X(r8)
            boolean r8 = r3.l(r2)
            java.lang.Object r9 = r3.g()
            if (r8 != 0) goto L_0x0160
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0168
        L_0x0160:
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt$ChangeAddressScreen$1$1 r9 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt$ChangeAddressScreen$1$1
            r9.<init>(r2)
            r3.N(r9)
        L_0x0168:
            kotlin.reflect.KFunction r9 = (kotlin.reflect.KFunction) r9
            r3.M()
            r8 = r9
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r12 = r1 & 8064(0x1f80, float:1.13E-41)
            r16 = 0
            r9 = r27
            r10 = r28
            r11 = r3
            r0 = r13
            r13 = r16
            g(r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r7 = r3.C(r7)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r7 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r7
            java.lang.Object r8 = r3.g()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r9.a()
            if (r8 != r10) goto L_0x019e
            kotlin.coroutines.EmptyCoroutineContext r8 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r8 = androidx.compose.runtime.EffectsKt.j(r8, r3)
            r3.N(r8)
        L_0x019e:
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            kotlinx.coroutines.flow.Flow r10 = r2.l()
            r11 = 972631787(0x39f92eeb, float:4.7527938E-4)
            r3.X(r11)
            boolean r11 = r3.l(r7)
            boolean r12 = r3.l(r8)
            r11 = r11 | r12
            r12 = r1 & 112(0x70, float:1.57E-43)
            r13 = 1
            if (r12 != r0) goto L_0x01ba
            r0 = r13
            goto L_0x01bc
        L_0x01ba:
            r0 = r17
        L_0x01bc:
            r0 = r0 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r11
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r11) goto L_0x01c7
            r11 = r13
            goto L_0x01c9
        L_0x01c7:
            r11 = r17
        L_0x01c9:
            r0 = r0 | r11
            java.lang.Object r1 = r3.g()
            if (r0 != 0) goto L_0x01db
            java.lang.Object r0 = r9.a()
            if (r1 != r0) goto L_0x01d7
            goto L_0x01db
        L_0x01d7:
            r16 = r2
            r13 = r3
            goto L_0x01f0
        L_0x01db:
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt$ChangeAddressScreen$2$1 r9 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt$ChangeAddressScreen$2$1
            r11 = 0
            r0 = r9
            r1 = r7
            r16 = r2
            r2 = r8
            r13 = r3
            r3 = r26
            r4 = r29
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r13.N(r9)
            r1 = r9
        L_0x01f0:
            r0 = r1
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r13.M()
            r12 = 0
            r1 = 6
            r8 = 0
            r9 = 0
            r7 = r10
            r10 = r0
            r11 = r13
            r0 = r13
            r13 = r1
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x020b
            androidx.compose.runtime.ComposerKt.X()
        L_0x020b:
            r1 = r16
        L_0x020d:
            androidx.compose.runtime.ScopeUpdateScope r8 = r0.x()
            if (r8 == 0) goto L_0x0228
            com.hansecom.abt.presentation.screens.home.account.address.i r9 = new com.hansecom.abt.presentation.screens.home.account.address.i
            r0 = r9
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt.d(com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ChangeAddress.State e(State state) {
        return (ChangeAddress.State) state.getValue();
    }

    public static final Unit f(ChangeAddressViewModel changeAddressViewModel, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, int i3, Composer composer, int i4) {
        d(changeAddressViewModel, function0, function02, function03, function04, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.State r16, kotlin.jvm.functions.Function1 r17, kotlin.jvm.functions.Function0 r18, kotlin.jvm.functions.Function0 r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r5 = r21
            r0 = -221329935(0xfffffffff2cec5f1, float:-8.1911307E30)
            r1 = r20
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r22 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r5 | 6
            r3 = r2
            r2 = r16
            goto L_0x0029
        L_0x0015:
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r16
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r5
            goto L_0x0029
        L_0x0026:
            r2 = r16
            r3 = r5
        L_0x0029:
            r4 = r22 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r6 = r17
            goto L_0x0044
        L_0x0032:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r17
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r3 = r3 | r7
        L_0x0044:
            r7 = r22 & 4
            if (r7 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
            r15 = r18
            goto L_0x005f
        L_0x004d:
            r7 = r5 & 384(0x180, float:5.38E-43)
            r15 = r18
            if (r7 != 0) goto L_0x005f
            boolean r7 = r1.l(r15)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r7
        L_0x005f:
            r7 = r22 & 8
            if (r7 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r14 = r19
            goto L_0x007a
        L_0x0068:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            r14 = r19
            if (r7 != 0) goto L_0x007a
            boolean r7 = r1.l(r14)
            if (r7 == 0) goto L_0x0077
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r7
        L_0x007a:
            r7 = r3 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x008d
            boolean r7 = r1.t()
            if (r7 != 0) goto L_0x0087
            goto L_0x008d
        L_0x0087:
            r1.B()
            r4 = r6
            goto L_0x010d
        L_0x008d:
            if (r4 == 0) goto L_0x00af
            r4 = 1133302367(0x438cd25f, float:281.64352)
            r1.X(r4)
            java.lang.Object r4 = r1.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r4 != r6) goto L_0x00a9
            com.hansecom.abt.presentation.screens.home.account.address.g r4 = new com.hansecom.abt.presentation.screens.home.account.address.g
            r4.<init>()
            r1.N(r4)
        L_0x00a9:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r1.M()
            goto L_0x00b0
        L_0x00af:
            r4 = r6
        L_0x00b0:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x00bc
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.account.address.ScreenImpl (ChangeAddressScreen.kt:78)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r6, r7)
        L_0x00bc:
            r0 = 1133305434(0x438cde5a, float:281.73712)
            r1.X(r0)
            java.lang.Object r0 = r1.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r0 != r3) goto L_0x00d6
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r1.N(r0)
        L_0x00d6:
            r9 = r0
            androidx.compose.ui.focus.FocusRequester r9 = (androidx.compose.ui.focus.FocusRequester) r9
            r1.M()
            r0 = 6
            com.hansecom.abt.util.FocusRequesterExtKt.b(r9, r1, r0)
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt$ScreenImpl$2 r0 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt$ScreenImpl$2
            r6 = r0
            r7 = r16
            r8 = r4
            r10 = r18
            r11 = r19
            r6.<init>(r7, r8, r9, r10, r11)
            r3 = 54
            r6 = 1811399730(0x6bf7c432, float:5.9906237E26)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r7, r0, r1, r3)
            r13 = 3072(0xc00, float:4.305E-42)
            r0 = 7
            r6 = 0
            r7 = 0
            r9 = 0
            r12 = r1
            r14 = r0
            com.hansecom.abt.ui.components.ScreenContentKt.d(r6, r7, r9, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010d
            androidx.compose.runtime.ComposerKt.X()
        L_0x010d:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x0127
            com.hansecom.abt.presentation.screens.home.account.address.h r8 = new com.hansecom.abt.presentation.screens.home.account.address.h
            r0 = r8
            r1 = r16
            r2 = r4
            r3 = r18
            r4 = r19
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt.g(com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit h(ChangeAddress.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit i(ChangeAddress.State state, Function1 function1, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        g(state, function1, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
