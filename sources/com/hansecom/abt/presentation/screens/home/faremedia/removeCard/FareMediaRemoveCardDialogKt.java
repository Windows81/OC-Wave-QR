package com.hansecom.abt.presentation.screens.home.faremedia.removeCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class FareMediaRemoveCardDialogKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCard.State r34, kotlin.jvm.functions.Function1 r35, kotlinx.coroutines.flow.Flow r36, kotlin.jvm.functions.Function0 r37, kotlin.jvm.functions.Function0 r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            r1 = r34
            r2 = r35
            r0 = r37
            r15 = r38
            r14 = r40
            r3 = 1686700288(0x64890100, float:2.0218208E22)
            r4 = r39
            androidx.compose.runtime.Composer r13 = r4.q(r3)
            r4 = r14 & 6
            r5 = 2
            if (r4 != 0) goto L_0x0023
            boolean r4 = r13.W(r1)
            if (r4 == 0) goto L_0x0020
            r4 = 4
            goto L_0x0021
        L_0x0020:
            r4 = r5
        L_0x0021:
            r4 = r4 | r14
            goto L_0x0024
        L_0x0023:
            r4 = r14
        L_0x0024:
            r7 = r14 & 48
            if (r7 != 0) goto L_0x0034
            boolean r7 = r13.l(r2)
            if (r7 == 0) goto L_0x0031
            r7 = 32
            goto L_0x0033
        L_0x0031:
            r7 = 16
        L_0x0033:
            r4 = r4 | r7
        L_0x0034:
            r7 = r14 & 384(0x180, float:5.38E-43)
            r12 = r36
            if (r7 != 0) goto L_0x0046
            boolean r7 = r13.l(r12)
            if (r7 == 0) goto L_0x0043
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0056
            boolean r7 = r13.l(r0)
            if (r7 == 0) goto L_0x0053
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r4 = r4 | r7
        L_0x0056:
            r7 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0066
            boolean r7 = r13.l(r15)
            if (r7 == 0) goto L_0x0063
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0065
        L_0x0063:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x0065:
            r4 = r4 | r7
        L_0x0066:
            r7 = r4
            r4 = r7 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r11) goto L_0x007b
            boolean r4 = r13.t()
            if (r4 != 0) goto L_0x0074
            goto L_0x007b
        L_0x0074:
            r13.B()
            r11 = r13
            r12 = r15
            goto L_0x01d3
        L_0x007b:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0087
            r4 = -1
            java.lang.String r11 = "com.hansecom.abt.presentation.screens.home.faremedia.removeCard.DialogImpl (FareMediaRemoveCardDialog.kt:47)"
            androidx.compose.runtime.ComposerKt.Y(r3, r7, r4, r11)
        L_0x0087:
            int r3 = com.hansecom.abt.R.string.C4
            r4 = 0
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r3 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r11, r13, r4)
            int r11 = com.hansecom.abt.R.string.A4
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r9 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r11, r9, r13, r4)
            int r11 = com.hansecom.abt.R.string.z4
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r10 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r11, r10, r13, r4)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r11 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r6 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r11 = r11.a(r13, r6)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r20 = r11.b(r13, r4)
            boolean r11 = r34.b()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r6 = 0
            r8 = 1
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r22 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r6, r11, r8, r6)
            boolean r11 = r34.b()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r24 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r11, r6, r5, r6)
            int r5 = com.hansecom.abt.R.string.y4
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r25 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r11, r13, r4)
            com.hansecom.abt.presentation.screens.home.faremedia.removeCard.ComposableSingletons$FareMediaRemoveCardDialogKt r5 = com.hansecom.abt.presentation.screens.home.faremedia.removeCard.ComposableSingletons$FareMediaRemoveCardDialogKt.f37233a
            kotlin.jvm.functions.Function2 r26 = r5.a()
            r5 = 1342044174(0x4ffdf80e, float:8.5217843E9)
            r13.X(r5)
            r5 = r7 & 112(0x70, float:1.57E-43)
            r11 = 32
            if (r5 != r11) goto L_0x00e1
            r5 = r8
            goto L_0x00e2
        L_0x00e1:
            r5 = r4
        L_0x00e2:
            java.lang.Object r11 = r13.g()
            if (r5 != 0) goto L_0x00f0
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r11 != r5) goto L_0x00f8
        L_0x00f0:
            com.hansecom.abt.presentation.screens.home.faremedia.removeCard.d r11 = new com.hansecom.abt.presentation.screens.home.faremedia.removeCard.d
            r11.<init>(r2)
            r13.N(r11)
        L_0x00f8:
            r27 = r11
            kotlin.jvm.functions.Function0 r27 = (kotlin.jvm.functions.Function0) r27
            r13.M()
            r5 = 1342052537(0x4ffe18b9, float:8.5260662E9)
            r13.X(r5)
            r5 = r7 & 14
            r11 = 4
            if (r5 != r11) goto L_0x010c
            r5 = r8
            goto L_0x010d
        L_0x010c:
            r5 = r4
        L_0x010d:
            r11 = r7 & 7168(0x1c00, float:1.0045E-41)
            r8 = 2048(0x800, float:2.87E-42)
            if (r11 != r8) goto L_0x0116
            r16 = 1
            goto L_0x0118
        L_0x0116:
            r16 = r4
        L_0x0118:
            r5 = r5 | r16
            java.lang.Object r4 = r13.g()
            if (r5 != 0) goto L_0x0128
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x0130
        L_0x0128:
            com.hansecom.abt.presentation.screens.home.faremedia.removeCard.e r4 = new com.hansecom.abt.presentation.screens.home.faremedia.removeCard.e
            r4.<init>(r1, r0)
            r13.N(r4)
        L_0x0130:
            r18 = r4
            kotlin.jvm.functions.Function0 r18 = (kotlin.jvm.functions.Function0) r18
            r13.M()
            r21 = 24576(0x6000, float:3.4438E-41)
            r23 = 82220(0x1412c, float:1.15215E-40)
            r5 = 0
            r4 = 0
            r28 = 6
            r6 = r4
            r4 = 0
            r29 = r8
            r30 = 1
            r8 = r4
            r31 = r11
            r11 = r4
            r17 = 0
            r19 = 0
            r32 = 0
            r4 = r9
            r33 = r7
            r7 = r26
            r9 = r22
            r12 = r20
            r39 = r13
            r13 = r27
            r14 = r24
            r15 = r25
            r16 = r37
            r20 = r39
            r22 = r31
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = com.hansecom.abt.ui.CompositionLocalKt.c()
            r11 = r39
            java.lang.Object r3 = r11.C(r3)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r3 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r3
            r4 = 1342057061(0x4ffe2a65, float:8.5283825E9)
            r11.X(r4)
            boolean r4 = r11.l(r3)
            r6 = r31
            r5 = 2048(0x800, float:2.87E-42)
            if (r6 != r5) goto L_0x0189
            r5 = r30
            goto L_0x018b
        L_0x0189:
            r5 = r32
        L_0x018b:
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r33 & r5
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r5 != r6) goto L_0x0196
            goto L_0x0198
        L_0x0196:
            r30 = r32
        L_0x0198:
            r4 = r4 | r30
            java.lang.Object r5 = r11.g()
            if (r4 != 0) goto L_0x01ac
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x01a9
            goto L_0x01ac
        L_0x01a9:
            r12 = r38
            goto L_0x01b7
        L_0x01ac:
            com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardDialogKt$DialogImpl$3$1 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardDialogKt$DialogImpl$3$1
            r12 = r38
            r4 = 0
            r5.<init>(r3, r0, r12, r4)
            r11.N(r5)
        L_0x01b7:
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r11.M()
            int r3 = r33 >> 6
            r9 = r3 & 14
            r10 = 6
            r5 = 0
            r6 = 0
            r4 = r36
            r8 = r11
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r4, r5, r6, r7, r8, r9, r10)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01d3
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d3:
            androidx.compose.runtime.ScopeUpdateScope r7 = r11.x()
            if (r7 == 0) goto L_0x01ee
            com.hansecom.abt.presentation.screens.home.faremedia.removeCard.f r8 = new com.hansecom.abt.presentation.screens.home.faremedia.removeCard.f
            r0 = r8
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardDialogKt.e(com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCard$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit f(Function1 function1) {
        function1.invoke(FareMediaRemoveCard.Action.Confirm.f37238a);
        return Unit.f40552a;
    }

    public static final Unit g(FareMediaRemoveCard.State state, Function0 function0) {
        if (!state.b()) {
            function0.invoke();
        }
        return Unit.f40552a;
    }

    public static final Unit h(FareMediaRemoveCard.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        e(state, function1, flow, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if ((r15 & 1) != 0) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function0 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            java.lang.String r0 = "onDismiss"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onSuccess"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 1865232784(0x6f2d3190, float:5.3600824E28)
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel> r1 = com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.S()
            r13.S()
            com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel r10 = (com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardDialog (FareMediaRemoveCardDialog.kt:29)"
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
            com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCard$State r1 = j(r1)
            r2 = 1313924279(0x4e50e4b7, float:8.761625E8)
            r13.X(r2)
            boolean r2 = r13.l(r10)
            java.lang.Object r3 = r13.g()
            if (r2 != 0) goto L_0x0104
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x010c
        L_0x0104:
            com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardDialogKt$FareMediaRemoveCardDialog$1$1 r3 = new com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardDialogKt$FareMediaRemoveCardDialog$1$1
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
            e(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0065
        L_0x012e:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.x()
            if (r10 == 0) goto L_0x0141
            com.hansecom.abt.presentation.screens.home.faremedia.removeCard.g r13 = new com.hansecom.abt.presentation.screens.home.faremedia.removeCard.g
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardDialogKt.i(com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final FareMediaRemoveCard.State j(State state) {
        return (FareMediaRemoveCard.State) state.getValue();
    }

    public static final Unit k(FareMediaRemoveCardViewModel fareMediaRemoveCardViewModel, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        i(fareMediaRemoveCardViewModel, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
