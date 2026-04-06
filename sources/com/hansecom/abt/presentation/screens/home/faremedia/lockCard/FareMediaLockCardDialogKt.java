package com.hansecom.abt.presentation.screens.home.faremedia.lockCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class FareMediaLockCardDialogKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCard.State r33, kotlin.jvm.functions.Function1 r34, kotlinx.coroutines.flow.Flow r35, kotlin.jvm.functions.Function0 r36, kotlin.jvm.functions.Function0 r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            r2 = r34
            r1 = r36
            r0 = r37
            r15 = r39
            r3 = 606980960(0x242dcb60, float:3.768566E-17)
            r4 = r38
            androidx.compose.runtime.Composer r14 = r4.q(r3)
            r4 = r15 & 6
            r5 = 2
            r12 = r33
            if (r4 != 0) goto L_0x0023
            boolean r4 = r14.W(r12)
            if (r4 == 0) goto L_0x0020
            r4 = 4
            goto L_0x0021
        L_0x0020:
            r4 = r5
        L_0x0021:
            r4 = r4 | r15
            goto L_0x0024
        L_0x0023:
            r4 = r15
        L_0x0024:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0034
            boolean r6 = r14.l(r2)
            if (r6 == 0) goto L_0x0031
            r6 = 32
            goto L_0x0033
        L_0x0031:
            r6 = 16
        L_0x0033:
            r4 = r4 | r6
        L_0x0034:
            r6 = r15 & 384(0x180, float:5.38E-43)
            r10 = r35
            if (r6 != 0) goto L_0x0046
            boolean r6 = r14.l(r10)
            if (r6 == 0) goto L_0x0043
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r4 = r4 | r6
        L_0x0046:
            r6 = r15 & 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r6 != 0) goto L_0x0057
            boolean r6 = r14.l(r1)
            if (r6 == 0) goto L_0x0054
            r6 = r9
            goto L_0x0056
        L_0x0054:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0056:
            r4 = r4 | r6
        L_0x0057:
            r6 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0067
            boolean r6 = r14.l(r0)
            if (r6 == 0) goto L_0x0064
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0066
        L_0x0064:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0066:
            r4 = r4 | r6
        L_0x0067:
            r6 = r4 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r6 != r8) goto L_0x007a
            boolean r6 = r14.t()
            if (r6 != 0) goto L_0x0074
            goto L_0x007a
        L_0x0074:
            r14.B()
            r11 = r14
            goto L_0x01a1
        L_0x007a:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0086
            r6 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.faremedia.lockCard.DialogImpl (FareMediaLockCardDialog.kt:47)"
            androidx.compose.runtime.ComposerKt.Y(r3, r4, r6, r8)
        L_0x0086:
            int r3 = com.hansecom.abt.R.string.x4
            r8 = 0
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.String r3 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r6, r14, r8)
            int r6 = com.hansecom.abt.R.string.v4
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.String r16 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r6, r13, r14, r8)
            int r6 = com.hansecom.abt.R.string.u4
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.String r18 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r6, r13, r14, r8)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r6 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r13 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r6 = r6.a(r14, r13)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r20 = r6.b(r14, r8)
            boolean r6 = r33.b()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r11 = 0
            r7 = 1
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r24 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r11, r6, r7, r11)
            boolean r6 = r33.b()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r25 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r6, r11, r5, r11)
            int r5 = com.hansecom.abt.R.string.t4
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.String r26 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r6, r14, r8)
            com.hansecom.abt.presentation.screens.home.faremedia.lockCard.ComposableSingletons$FareMediaLockCardDialogKt r5 = com.hansecom.abt.presentation.screens.home.faremedia.lockCard.ComposableSingletons$FareMediaLockCardDialogKt.f36951a
            kotlin.jvm.functions.Function2 r27 = r5.a()
            r5 = 1337070983(0x4fb21587, float:5.9755105E9)
            r14.X(r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r5 != r6) goto L_0x00e0
            r5 = r7
            goto L_0x00e1
        L_0x00e0:
            r5 = r8
        L_0x00e1:
            java.lang.Object r6 = r14.g()
            if (r5 != 0) goto L_0x00ef
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00f7
        L_0x00ef:
            com.hansecom.abt.presentation.screens.home.faremedia.lockCard.b r6 = new com.hansecom.abt.presentation.screens.home.faremedia.lockCard.b
            r6.<init>(r2)
            r14.N(r6)
        L_0x00f7:
            r5 = r6
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r28 = r13
            r13 = r5
            r14.M()
            r6 = r4 & 7168(0x1c00, float:1.0045E-41)
            int r5 = r4 << 6
            r17 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r17
            r22 = r6 | r5
            r23 = 82220(0x1412c, float:1.15215E-40)
            r5 = 0
            r17 = 0
            r29 = r6
            r6 = r17
            r17 = 0
            r30 = r8
            r8 = r17
            r11 = r17
            r19 = 0
            r21 = 24576(0x6000, float:3.4438E-41)
            r31 = r4
            r4 = r16
            r32 = r7
            r7 = r27
            r9 = r24
            r10 = r18
            r12 = r20
            r38 = r14
            r14 = r25
            r15 = r26
            r16 = r36
            r18 = r36
            r20 = r38
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = com.hansecom.abt.ui.CompositionLocalKt.c()
            r11 = r38
            java.lang.Object r3 = r11.C(r3)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r3 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r3
            r4 = 1337082908(0x4fb2441c, float:5.9816161E9)
            r11.X(r4)
            boolean r4 = r11.l(r3)
            r6 = r29
            r5 = 2048(0x800, float:2.87E-42)
            if (r6 != r5) goto L_0x015c
            r8 = r32
            goto L_0x015e
        L_0x015c:
            r8 = r30
        L_0x015e:
            r4 = r4 | r8
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r31 & r5
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r5 != r6) goto L_0x016b
            r8 = r32
            goto L_0x016d
        L_0x016b:
            r8 = r30
        L_0x016d:
            r4 = r4 | r8
            java.lang.Object r5 = r11.g()
            if (r4 != 0) goto L_0x017c
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x0185
        L_0x017c:
            com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardDialogKt$DialogImpl$2$1 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardDialogKt$DialogImpl$2$1
            r4 = 0
            r5.<init>(r3, r1, r0, r4)
            r11.N(r5)
        L_0x0185:
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r11.M()
            int r3 = r31 >> 6
            r9 = r3 & 14
            r10 = 6
            r5 = 0
            r6 = 0
            r4 = r35
            r8 = r11
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r4, r5, r6, r7, r8, r9, r10)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01a1
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a1:
            androidx.compose.runtime.ScopeUpdateScope r7 = r11.x()
            if (r7 == 0) goto L_0x01bc
            com.hansecom.abt.presentation.screens.home.faremedia.lockCard.c r8 = new com.hansecom.abt.presentation.screens.home.faremedia.lockCard.c
            r0 = r8
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardDialogKt.d(com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCard$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit e(Function1 function1) {
        function1.invoke(FareMediaLockCard.Action.Confirm.f36954a);
        return Unit.f40552a;
    }

    public static final Unit f(FareMediaLockCard.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        d(state, function1, flow, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if ((r15 & 1) != 0) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function0 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            java.lang.String r0 = "onDismiss"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onSuccess"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 863713470(0x337b38be, float:5.84921E-8)
            androidx.compose.runtime.Composer r13 = r13.q(r0)
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0024
            r1 = r15 & 1
            if (r1 != 0) goto L_0x0021
            boolean r1 = r13.l(r10)
            if (r1 == 0) goto L_0x0021
            r1 = 4
            goto L_0x0022
        L_0x0021:
            r1 = 2
        L_0x0022:
            r1 = r1 | r14
            goto L_0x0025
        L_0x0024:
            r1 = r14
        L_0x0025:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x002c
            r1 = r1 | 48
            goto L_0x003c
        L_0x002c:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x003c
            boolean r2 = r13.l(r11)
            if (r2 == 0) goto L_0x0039
            r2 = 32
            goto L_0x003b
        L_0x0039:
            r2 = 16
        L_0x003b:
            r1 = r1 | r2
        L_0x003c:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0042:
            r9 = r1
            goto L_0x0055
        L_0x0044:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r13.l(r12)
            if (r2 == 0) goto L_0x0051
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0053
        L_0x0051:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0053:
            r1 = r1 | r2
            goto L_0x0042
        L_0x0055:
            r1 = r9 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x0068
            boolean r1 = r13.t()
            if (r1 != 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            r13.B()
        L_0x0065:
            r2 = r10
            goto L_0x012e
        L_0x0068:
            r13.p()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0080
            boolean r1 = r13.J()
            if (r1 == 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            r13.B()
            r1 = r15 & 1
            if (r1 == 0) goto L_0x00cc
        L_0x007d:
            r9 = r9 & -15
            goto L_0x00cc
        L_0x0080:
            r1 = r15 & 1
            if (r1 == 0) goto L_0x00cc
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r13.f(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.c(r13, r1)
            if (r2 == 0) goto L_0x00c4
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r13, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r13.f(r10)
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L_0x00ac
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.n()
        L_0x00aa:
            r5 = r10
            goto L_0x00af
        L_0x00ac:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00aa
        L_0x00af:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel> r1 = com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.S()
            r13.S()
            com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel r10 = (com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel) r10
            goto L_0x007d
        L_0x00c4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00cc:
            r13.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00db
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardDialog (FareMediaLockCardDialog.kt:29)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00db:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r13
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCard$State r1 = h(r1)
            r2 = 1097269509(0x41670105, float:14.437749)
            r13.X(r2)
            boolean r2 = r13.l(r10)
            java.lang.Object r3 = r13.g()
            if (r2 != 0) goto L_0x0104
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x010c
        L_0x0104:
            com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardDialogKt$FareMediaLockCardDialog$1$1 r3 = new com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardDialogKt$FareMediaLockCardDialog$1$1
            r3.<init>(r10)
            r13.N(r3)
        L_0x010c:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r13.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r10.l()
            r4 = 64512(0xfc00, float:9.04E-41)
            r7 = r0 & r4
            r4 = r11
            r5 = r12
            r6 = r13
            d(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0065
        L_0x012e:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.x()
            if (r10 == 0) goto L_0x0141
            com.hansecom.abt.presentation.screens.home.faremedia.lockCard.a r13 = new com.hansecom.abt.presentation.screens.home.faremedia.lockCard.a
            r1 = r13
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r10.a(r13)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardDialogKt.g(com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final FareMediaLockCard.State h(State state) {
        return (FareMediaLockCard.State) state.getValue();
    }

    public static final Unit i(FareMediaLockCardViewModel fareMediaLockCardViewModel, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        g(fareMediaLockCardViewModel, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
