package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import com.hansecom.abt.ui.components.AbtTextKt;
import com.hansecom.abt.ui.components.emptyView.EmptyViewKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class AutoloadScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if ((r14 & 1) != 0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel r10, kotlin.jvm.functions.Function1 r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "goToAutoloadSetup"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = -875764873(0xffffffffcbcce377, float:-2.685515E7)
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel> r1 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel r10 = (com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreen (AutoloadScreen.kt:59)"
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
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State r1 = i(r1)
            r2 = -833950083(0xffffffffce4aee7d, float:-8.511568E8)
            r12.X(r2)
            boolean r2 = r12.l(r10)
            java.lang.Object r3 = r12.g()
            if (r2 != 0) goto L_0x00e7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00ef
        L_0x00e7:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt$AutoloadScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt$AutoloadScreen$1$1
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
            s(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010b
            androidx.compose.runtime.ComposerKt.X()
        L_0x010b:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x0119
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.d r0 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.d
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt.h(com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Autoload.State i(State state) {
        return (Autoload.State) state.getValue();
    }

    public static final Unit j(AutoloadViewModel autoloadViewModel, Function1 function1, int i2, int i3, Composer composer, int i4) {
        h(autoloadViewModel, function1, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload.State r26, kotlin.jvm.functions.Function1 r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            r0 = r26
            r1 = r27
            r2 = r29
            r3 = -657041465(0xffffffffd8d657c7, float:-1.88537991E15)
            r4 = r28
            androidx.compose.runtime.Composer r15 = r4.q(r3)
            r4 = r2 & 6
            r5 = 2
            if (r4 != 0) goto L_0x001f
            boolean r4 = r15.W(r0)
            if (r4 == 0) goto L_0x001c
            r4 = 4
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            r4 = r4 | r2
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = r2 & 48
            r7 = 32
            if (r6 != 0) goto L_0x0031
            boolean r6 = r15.l(r1)
            if (r6 == 0) goto L_0x002e
            r6 = r7
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r4 = r4 | r6
        L_0x0031:
            r6 = r4 & 19
            r8 = 18
            if (r6 != r8) goto L_0x0044
            boolean r6 = r15.t()
            if (r6 != 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            r15.B()
            r4 = r15
            goto L_0x01da
        L_0x0044:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0050
            r6 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.Dialogs (AutoloadScreen.kt:236)"
            androidx.compose.runtime.ComposerKt.Y(r3, r4, r6, r8)
        L_0x0050:
            boolean r3 = r26.f()
            r6 = 0
            if (r3 == 0) goto L_0x012f
            r3 = 923135288(0x3705ed38, float:7.98265E-6)
            r15.X(r3)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State$LoadState r3 = r26.e()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State$LoadState r8 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload.State.LoadState.DELETING
            r9 = 1
            if (r3 != r8) goto L_0x0068
            r3 = r9
            goto L_0x0069
        L_0x0068:
            r3 = r6
        L_0x0069:
            int r8 = com.hansecom.abt.R.string.G0
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r10 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r8, r10, r15, r6)
            int r8 = com.hansecom.abt.R.string.F0
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.String r11 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r8, r11, r15, r6)
            int r8 = com.hansecom.abt.R.string.E0
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r13 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r8, r12, r15, r6)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r8 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r12 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r8 = r8.a(r15, r12)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r16 = r8.b(r15, r6)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r12 = 0
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r19 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r12, r8, r9, r12)
            int r8 = com.hansecom.abt.R.string.D0
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.String r21 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r8, r14, r15, r6)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r25 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r8, r12, r5, r12)
            r5 = 445445267(0x1a8cf493, float:5.8297774E-23)
            r15.X(r5)
            if (r3 == 0) goto L_0x00af
            r3 = r12
            goto L_0x00d8
        L_0x00af:
            r3 = 445447946(0x1a8cff0a, float:5.831468E-23)
            r15.X(r3)
            r3 = r4 & 112(0x70, float:1.57E-43)
            if (r3 != r7) goto L_0x00bb
            r3 = r9
            goto L_0x00bc
        L_0x00bb:
            r3 = r6
        L_0x00bc:
            java.lang.Object r5 = r15.g()
            if (r3 != 0) goto L_0x00ca
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x00d2
        L_0x00ca:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.e r5 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.e
            r5.<init>(r1)
            r15.N(r5)
        L_0x00d2:
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r15.M()
            r3 = r5
        L_0x00d8:
            r15.M()
            r5 = 445437401(0x1a8cd5d9, float:5.824813E-23)
            r15.X(r5)
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r7) goto L_0x00e6
            r6 = r9
        L_0x00e6:
            java.lang.Object r4 = r15.g()
            if (r6 != 0) goto L_0x00f4
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x00fc
        L_0x00f4:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.f r4 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.f
            r4.<init>(r1)
            r15.N(r4)
        L_0x00fc:
            r14 = r4
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            r15.M()
            r23 = 0
            r24 = 90428(0x1613c, float:1.26717E-40)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r4 = r10
            r5 = r11
            r10 = r19
            r11 = r13
            r13 = r16
            r28 = r15
            r15 = r25
            r16 = r21
            r19 = r3
            r21 = r28
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r28.M()
        L_0x012b:
            r4 = r28
            goto L_0x01d1
        L_0x012f:
            r28 = r15
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State$LoadState r3 = r26.e()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State$LoadState r4 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload.State.LoadState.ACTIVATING
            if (r3 != r4) goto L_0x017b
            r3 = 924146198(0x37155a16, float:8.902067E-6)
            r15 = r28
            r15.X(r3)
            int r3 = com.hansecom.abt.R.string.B0
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r4, r15, r6)
            int r3 = com.hansecom.abt.R.string.A0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r15, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.ComposableSingletons$AutoloadScreenKt r3 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.ComposableSingletons$AutoloadScreenKt.f36258a
            kotlin.jvm.functions.Function2 r8 = r3.a()
            r23 = 0
            r24 = 131052(0x1ffec, float:1.83643E-40)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r3 = 0
            r15 = r3
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 24576(0x6000, float:3.4438E-41)
            r21 = r28
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r28.M()
            goto L_0x012b
        L_0x017b:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State$LoadState r3 = r26.e()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State$LoadState r4 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload.State.LoadState.PAUSING
            if (r3 != r4) goto L_0x01c6
            r3 = 924479324(0x371a6f5c, float:9.205043E-6)
            r15 = r28
            r15.X(r3)
            int r3 = com.hansecom.abt.R.string.P0
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r4, r15, r6)
            int r3 = com.hansecom.abt.R.string.O0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r15, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.ComposableSingletons$AutoloadScreenKt r3 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.ComposableSingletons$AutoloadScreenKt.f36258a
            kotlin.jvm.functions.Function2 r8 = r3.b()
            r23 = 0
            r24 = 131052(0x1ffec, float:1.83643E-40)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r3 = 0
            r15 = r3
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 24576(0x6000, float:3.4438E-41)
            r21 = r28
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r28.M()
            goto L_0x012b
        L_0x01c6:
            r3 = 924737058(0x371e5e22, float:9.439451E-6)
            r4 = r28
            r4.X(r3)
            r4.M()
        L_0x01d1:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01da
            androidx.compose.runtime.ComposerKt.X()
        L_0x01da:
            androidx.compose.runtime.ScopeUpdateScope r3 = r4.x()
            if (r3 == 0) goto L_0x01e8
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.g r4 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.g
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x01e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt.k(com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit l(Function1 function1) {
        function1.invoke(new Autoload.Action.ShowDeleteDialog(false));
        return Unit.f40552a;
    }

    public static final Unit m(Function1 function1) {
        function1.invoke(Autoload.Action.Delete.f36222a);
        return Unit.f40552a;
    }

    public static final Unit n(Autoload.State state, Function1 function1, int i2, Composer composer, int i3) {
        k(state, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void o(Autoload.State state, Function0 function0, Composer composer, int i2) {
        int i3;
        Autoload.State state2 = state;
        Function0 function02 = function0;
        int i4 = i2;
        Composer q2 = composer.q(-1544056408);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(state2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function02) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1544056408, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.autoload.Empty (AutoloadScreen.kt:293)");
            }
            EmptyViewKt.b(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), Integer.valueOf(R.drawable.f33023y), StringResourceKt.a(R.string.L0, new Object[0], q2, 0), StyledStringResourceKt.c(R.string.M0, new Object[]{CurrencyValueFormater.c(CurrencyValueFormater.f39045a, state.d(), false, 2, (Object) null)}, q2, 0), StringResourceKt.a(R.string.K0, new Object[0], q2, 0), "set_autoload", (Integer) null, function0, false, q2, ((i3 << 18) & 29360128) | 196614, 320);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new c(state2, function02, i4));
        }
    }

    public static final Unit p(Autoload.State state, Function0 function0, int i2, Composer composer, int i3) {
        o(state, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void q(String str, PaymentMethodState.CreditCard creditCard, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str2 = str;
        PaymentMethodState.CreditCard creditCard2 = creditCard;
        Composer q2 = composer.q(-496604265);
        if ((i2 & 6) == 0) {
            i3 = i2 | (q2.W(str2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(creditCard2) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-496604265, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.autoload.PaymentMethodInfo (AutoloadScreen.kt:277)");
            }
            AbtTheme abtTheme = AbtTheme.f38851a;
            Composer composer3 = q2;
            AbtTextKt.c(str, (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).a(), composer3, i3 & 14, 0, 65534);
            composer2 = composer3;
            SpacerKt.a(SizeKt.i(Modifier.f15489d, Dp.m((float) 8)), composer2, 6);
            AbtTextKt.c(CollectionsKt.n0(CollectionsKt.r(creditCard.e(), creditCard.d()), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).b(), composer2, 0, 0, 65534);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new C0527a(str, creditCard, i2));
        }
    }

    public static final Unit r(String str, PaymentMethodState.CreditCard creditCard, int i2, Composer composer, int i3) {
        q(str, creditCard, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload.State r17, kotlin.jvm.functions.Function1 r18, kotlinx.coroutines.flow.Flow r19, kotlin.jvm.functions.Function1 r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            r1 = r17
            r2 = r18
            r4 = r20
            r5 = r22
            r0 = -141768821(0xfffffffff78cc78b, float:-5.7106935E33)
            r3 = r21
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
            r15 = r19
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
            if (r7 != 0) goto L_0x0053
            boolean r7 = r3.l(r4)
            if (r7 == 0) goto L_0x0050
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0052
        L_0x0050:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0052:
            r6 = r6 | r7
        L_0x0053:
            r14 = r6
            r6 = r14 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0066
            boolean r6 = r3.t()
            if (r6 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r3.B()
            goto L_0x00f2
        L_0x0066:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0072
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.ScreenImpl (AutoloadScreen.kt:76)"
            androidx.compose.runtime.ComposerKt.Y(r0, r14, r6, r7)
        L_0x0072:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r6 = "AutoloadScreen"
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.platform.TestTagKt.a(r0, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt$ScreenImpl$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt$ScreenImpl$1
            r0.<init>(r1, r4, r2)
            r7 = 54
            r8 = 595517546(0x237ee06a, float:1.3816889E-17)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r9, r0, r3, r7)
            r13 = 3078(0xc06, float:4.313E-42)
            r0 = 6
            r7 = 0
            r9 = 0
            r12 = r3
            r16 = r14
            r14 = r0
            com.hansecom.abt.ui.components.ScreenContentKt.d(r6, r7, r9, r11, r12, r13, r14)
            r0 = r16 & 126(0x7e, float:1.77E-43)
            k(r1, r2, r3, r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r3.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r3.C(r6)
            android.content.Context r6 = (android.content.Context) r6
            r7 = -1146077695(0xffffffffbbb03e01, float:-0.005378485)
            r3.X(r7)
            boolean r7 = r3.l(r0)
            boolean r8 = r3.l(r6)
            r7 = r7 | r8
            java.lang.Object r8 = r3.g()
            if (r7 != 0) goto L_0x00cd
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00d6
        L_0x00cd:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt$ScreenImpl$2$1 r8 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt$ScreenImpl$2$1
            r7 = 0
            r8.<init>(r0, r6, r7)
            r3.N(r8)
        L_0x00d6:
            r9 = r8
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r3.M()
            int r0 = r16 >> 6
            r11 = r0 & 14
            r12 = 6
            r7 = 0
            r8 = 0
            r6 = r19
            r10 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00f2
            androidx.compose.runtime.ComposerKt.X()
        L_0x00f2:
            androidx.compose.runtime.ScopeUpdateScope r6 = r3.x()
            if (r6 == 0) goto L_0x010b
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.b r7 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.b
            r0 = r7
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt.s(com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit t(Autoload.State state, Function1 function1, Flow flow, Function1 function12, int i2, Composer composer, int i3) {
        s(state, function1, flow, function12, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
