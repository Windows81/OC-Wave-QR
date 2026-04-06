package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import android.webkit.WebView;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource;
import com.hansecom.abt.ui.components.progress.AbtCircularProgressIndicatorKt;
import com.hansecom.abt.util.ScaffoldImePaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class AddPaymentMethodCyberSourceScreenKt {
    public static final AddPaymentMethodCyberSourceScreenKt$addPaymentWebViewClient$1 A(WebView webView, Function0 function0) {
        return new AddPaymentMethodCyberSourceScreenKt$addPaymentWebViewClient$1(function0, webView);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlinx.coroutines.flow.Flow} */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if ((r15 & 1) != 0) goto L_0x007d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function0 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            java.lang.String r0 = "onUpClick"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onCardAdded"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 2074183153(0x7ba185f1, float:1.6773529E36)
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
            goto L_0x014f
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel> r1 = com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.S()
            r13.S()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel r10 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreen (AddPaymentMethodCyberSourceScreen.kt:73)"
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
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource$State r1 = i(r1)
            r2 = 939362684(0x37fd897c, float:3.0223971E-5)
            r13.X(r2)
            boolean r2 = r13.l(r10)
            java.lang.Object r3 = r13.g()
            if (r2 != 0) goto L_0x0104
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x010c
        L_0x0104:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$AddPaymentMethodCyberSourceScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$AddPaymentMethodCyberSourceScreen$1$1
            r3.<init>(r10)
            r13.N(r3)
        L_0x010c:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r13.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r3 = 939363892(0x37fd8e34, float:3.0226169E-5)
            r13.X(r3)
            boolean r3 = r13.W(r10)
            java.lang.Object r4 = r13.g()
            if (r3 != 0) goto L_0x012c
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0133
        L_0x012c:
            kotlinx.coroutines.flow.Flow r4 = r10.l()
            r13.N(r4)
        L_0x0133:
            r3 = r4
            kotlinx.coroutines.flow.Flow r3 = (kotlinx.coroutines.flow.Flow) r3
            r13.M()
            r4 = 64512(0xfc00, float:9.04E-41)
            r7 = r0 & r4
            r4 = r11
            r5 = r12
            r6 = r13
            o(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0065
        L_0x014f:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.x()
            if (r10 == 0) goto L_0x0162
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.g r13 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.g
            r1 = r13
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r10.a(r13)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt.h(com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AddPaymentMethodCyberSource.State i(State state) {
        return (AddPaymentMethodCyberSource.State) state.getValue();
    }

    public static final Unit j(AddPaymentMethodCyberSourceViewModel addPaymentMethodCyberSourceViewModel, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        h(addPaymentMethodCyberSourceViewModel, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(androidx.compose.foundation.layout.PaddingValues r37, com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource.State r38, kotlin.jvm.functions.Function1 r39, androidx.compose.runtime.Composer r40, int r41) {
        /*
            r0 = r37
            r1 = r38
            r2 = r39
            r3 = r41
            r4 = -61700396(0xfffffffffc5286d4, float:-4.372468E36)
            r5 = r40
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r3 & 6
            r6 = 2
            if (r5 != 0) goto L_0x0021
            boolean r5 = r15.W(r0)
            if (r5 == 0) goto L_0x001e
            r5 = 4
            goto L_0x001f
        L_0x001e:
            r5 = r6
        L_0x001f:
            r5 = r5 | r3
            goto L_0x0022
        L_0x0021:
            r5 = r3
        L_0x0022:
            r7 = r3 & 48
            if (r7 != 0) goto L_0x0032
            boolean r7 = r15.W(r1)
            if (r7 == 0) goto L_0x002f
            r7 = 32
            goto L_0x0031
        L_0x002f:
            r7 = 16
        L_0x0031:
            r5 = r5 | r7
        L_0x0032:
            r7 = r3 & 384(0x180, float:5.38E-43)
            r14 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0043
            boolean r7 = r15.l(r2)
            if (r7 == 0) goto L_0x0040
            r7 = r14
            goto L_0x0042
        L_0x0040:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r5 = r5 | r7
        L_0x0043:
            r13 = r5
            r5 = r13 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x0057
            boolean r5 = r15.t()
            if (r5 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            r15.B()
            r4 = r15
            goto L_0x0259
        L_0x0057:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0063
            r5 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.InputInfo (AddPaymentMethodCyberSourceScreen.kt:215)"
            androidx.compose.runtime.ComposerKt.Y(r4, r13, r5, r7)
        L_0x0063:
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r4 = r15.C(r4)
            androidx.compose.ui.focus.FocusManager r4 = (androidx.compose.ui.focus.FocusManager) r4
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            r11 = 0
            r9 = 1
            r10 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.f(r12, r11, r9, r10)
            androidx.compose.ui.Modifier r16 = com.hansecom.abt.util.ScaffoldImePaddingKt.a(r5, r0)
            r7 = 0
            androidx.compose.foundation.ScrollState r17 = androidx.compose.foundation.ScrollKt.c(r7, r15, r7, r9)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r23 = androidx.compose.foundation.ScrollKt.g(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.ui.theme.Dimensions r30 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r25 = r30.d()
            r28 = 13
            r29 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.PaddingKt.m(r23, r24, r25, r26, r27, r28, r29)
            float r8 = r30.c()
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.PaddingKt.k(r5, r8, r11, r6, r10)
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r6 = r6.g()
            androidx.compose.ui.Alignment$Companion r25 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r8 = r25.k()
            r16 = r13
            r13 = 6
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.ColumnKt.a(r6, r8, r15, r13)
            int r8 = androidx.compose.runtime.ComposablesKt.a(r15, r7)
            androidx.compose.runtime.CompositionLocalMap r7 = r15.I()
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.ComposedModifierKt.e(r15, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r9 = r17.a()
            androidx.compose.runtime.Applier r19 = r15.v()
            if (r19 != 0) goto L_0x00d7
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00d7:
            r15.s()
            boolean r19 = r15.n()
            if (r19 == 0) goto L_0x00e4
            r15.y(r9)
            goto L_0x00e7
        L_0x00e4:
            r15.K()
        L_0x00e7:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r10 = r17.c()
            androidx.compose.runtime.Updater.g(r9, r6, r10)
            kotlin.jvm.functions.Function2 r6 = r17.e()
            androidx.compose.runtime.Updater.g(r9, r7, r6)
            kotlin.jvm.functions.Function2 r6 = r17.b()
            boolean r7 = r9.n()
            if (r7 != 0) goto L_0x0111
            java.lang.Object r7 = r9.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r10)
            if (r7 != 0) goto L_0x011f
        L_0x0111:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r9.N(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r9.A(r7, r6)
        L_0x011f:
            kotlin.jvm.functions.Function2 r6 = r17.d()
            androidx.compose.runtime.Updater.g(r9, r5, r6)
            androidx.compose.foundation.layout.ColumnScopeInstance r9 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.lang.String r17 = r38.c()
            r20 = 0
            r21 = 111(0x6f, float:1.56E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r10 = 0
            r31 = r9
            r9 = r22
            r11 = r17
            r32 = r12
            r12 = r24
            r33 = r16
            r13 = r26
            r14 = r15
            r34 = r15
            r15 = r20
            r16 = r21
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16)
            java.lang.String r5 = r38.e()
            int r7 = com.hansecom.abt.R.string.Z
            com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r6 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
            com.hansecom.abt.util.resourcesResolvers.StringValue r8 = r6.a()
            r15 = r32
            r9 = 0
            r13 = 0
            r14 = 1
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.h(r15, r9, r14, r13)
            java.lang.String r10 = "nickname"
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.platform.TestTagKt.a(r6, r10)
            androidx.compose.ui.text.input.ImeAction$Companion r6 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r21 = r6.d()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r6 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r26 = r6.e()
            r6 = -393749843(0xffffffffe887daad, float:-5.1324267E24)
            r12 = r34
            r12.X(r6)
            r6 = r33
            r11 = r6 & 896(0x380, float:1.256E-42)
            r10 = 256(0x100, float:3.59E-43)
            if (r11 != r10) goto L_0x018c
            r6 = r14
            goto L_0x018d
        L_0x018c:
            r6 = 0
        L_0x018d:
            java.lang.Object r9 = r12.g()
            if (r6 != 0) goto L_0x019b
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x01a3
        L_0x019b:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.d r9 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.d
            r9.<init>(r2)
            r12.N(r9)
        L_0x01a3:
            r6 = r9
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r12.M()
            r23 = 54
            r24 = 62432(0xf3e0, float:8.7486E-41)
            r9 = 0
            r10 = r9
            r9 = 0
            r35 = r11
            r11 = r9
            r34 = r12
            r12 = r9
            r9 = 0
            r13 = r9
            r9 = 0
            r14 = r9
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 27648(0x6c00, float:3.8743E-41)
            r9 = r16
            r36 = r15
            r15 = r26
            r16 = r21
            r21 = r34
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            float r5 = r30.f()
            r15 = r36
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.i(r15, r5)
            r14 = r34
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r5, r14, r13)
            int r5 = com.hansecom.abt.R.string.U
            r6 = 0
            java.lang.String r9 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r14, r6)
            r5 = 0
            r7 = 1
            r8 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.h(r15, r5, r7, r8)
            androidx.compose.ui.Alignment$Horizontal r8 = r25.g()
            r10 = r31
            androidx.compose.ui.Modifier r5 = r10.b(r5, r8)
            java.lang.String r8 = "add"
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.platform.TestTagKt.a(r5, r8)
            r5 = -393733112(0xffffffffe8881c08, float:-5.1420714E24)
            r14.X(r5)
            boolean r5 = r14.l(r4)
            r11 = r35
            r10 = 256(0x100, float:3.59E-43)
            if (r11 != r10) goto L_0x0211
            r6 = r7
        L_0x0211:
            r5 = r5 | r6
            java.lang.Object r6 = r14.g()
            if (r5 != 0) goto L_0x0220
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0228
        L_0x0220:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.e r6 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.e
            r6.<init>(r4, r2)
            r14.N(r6)
        L_0x0228:
            r5 = r6
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r14.M()
            r4 = 0
            r16 = 108(0x6c, float:1.51E-43)
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r6 = r8
            r8 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r13 = r4
            r4 = r14
            r14 = r16
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            float r5 = r30.e()
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.i(r15, r5)
            r6 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r5, r4, r6)
            r4.T()
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0259
            androidx.compose.runtime.ComposerKt.X()
        L_0x0259:
            androidx.compose.runtime.ScopeUpdateScope r4 = r4.x()
            if (r4 == 0) goto L_0x0267
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.f r5 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.f
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt.k(androidx.compose.foundation.layout.PaddingValues, com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource$State, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit l(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AddPaymentMethodCyberSource.Action.NicknameChange(str));
        return Unit.f40552a;
    }

    public static final Unit m(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(AddPaymentMethodCyberSource.Action.Confirm.f35541a);
        return Unit.f40552a;
    }

    public static final Unit n(PaddingValues paddingValues, AddPaymentMethodCyberSource.State state, Function1 function1, int i2, Composer composer, int i3) {
        k(paddingValues, state, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1} */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource.State r34, kotlin.jvm.functions.Function1 r35, kotlinx.coroutines.flow.Flow r36, kotlin.jvm.functions.Function0 r37, kotlin.jvm.functions.Function0 r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            r1 = r34
            r2 = r35
            r9 = r37
            r10 = r40
            r0 = -1278024551(0xffffffffb3d2e499, float:-9.820469E-8)
            r3 = r39
            androidx.compose.runtime.Composer r8 = r3.q(r0)
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0020
            boolean r3 = r8.W(r1)
            if (r3 == 0) goto L_0x001d
            r3 = 4
            goto L_0x001e
        L_0x001d:
            r3 = 2
        L_0x001e:
            r3 = r3 | r10
            goto L_0x0021
        L_0x0020:
            r3 = r10
        L_0x0021:
            r4 = r10 & 48
            if (r4 != 0) goto L_0x0031
            boolean r4 = r8.l(r2)
            if (r4 == 0) goto L_0x002e
            r4 = 32
            goto L_0x0030
        L_0x002e:
            r4 = 16
        L_0x0030:
            r3 = r3 | r4
        L_0x0031:
            r4 = r10 & 384(0x180, float:5.38E-43)
            r7 = r36
            if (r4 != 0) goto L_0x0043
            boolean r4 = r8.l(r7)
            if (r4 == 0) goto L_0x0040
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0042
        L_0x0040:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r3 = r3 | r4
        L_0x0043:
            r4 = r10 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0053
            boolean r4 = r8.l(r9)
            if (r4 == 0) goto L_0x0050
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0052
        L_0x0050:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0052:
            r3 = r3 | r4
        L_0x0053:
            r4 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0066
            r4 = r38
            boolean r11 = r8.l(r4)
            if (r11 == 0) goto L_0x0062
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0064
        L_0x0062:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0064:
            r3 = r3 | r11
            goto L_0x0068
        L_0x0066:
            r4 = r38
        L_0x0068:
            r11 = r3 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x007b
            boolean r11 = r8.t()
            if (r11 != 0) goto L_0x0075
            goto L_0x007b
        L_0x0075:
            r8.B()
            r0 = r8
            goto L_0x0194
        L_0x007b:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0087
            r11 = -1
            java.lang.String r12 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.ScreenImpl (AddPaymentMethodCyberSourceScreen.kt:91)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r11, r12)
        L_0x0087:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r8.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r12 = "AddPaymentMethodCyberSourceScreen"
            androidx.compose.ui.Modifier r11 = androidx.compose.ui.platform.TestTagKt.a(r11, r12)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$1 r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$1
            r12.<init>(r9)
            r13 = 774996821(0x2e318355, float:4.0361787E-11)
            r15 = 1
            r14 = 54
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r15, r12, r8, r14)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$2 r13 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$2
            r13.<init>(r0)
            r5 = 988613907(0x3aed0d13, float:0.0018085561)
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r15, r13, r8, r14)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$3 r13 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$3
            r13.<init>(r1, r2)
            r6 = 1750637610(0x68589c2a, float:4.0916475E24)
            androidx.compose.runtime.internal.ComposableLambda r22 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r15, r13, r8, r14)
            r24 = 805309494(0x30000c36, float:4.658348E-10)
            r25 = 500(0x1f4, float:7.0E-43)
            r13 = 0
            r6 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r14 = r5
            r5 = r15
            r15 = r6
            r23 = r8
            androidx.compose.material3.ScaffoldKt.f(r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25)
            java.lang.Object r6 = r8.g()
            androidx.compose.runtime.Composer$Companion r32 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r32.a()
            if (r6 != r11) goto L_0x00ec
            kotlin.coroutines.EmptyCoroutineContext r6 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r6 = androidx.compose.runtime.EffectsKt.j(r6, r8)
            r8.N(r6)
        L_0x00ec:
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            boolean r14 = r34.f()
            int r11 = com.hansecom.abt.R.string.Y
            r13 = 0
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r11, r8, r13)
            int r12 = com.hansecom.abt.R.string.X
            java.lang.String r12 = androidx.compose.ui.res.StringResources_androidKt.b(r12, r8, r13)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.ComposableSingletons$AddPaymentMethodCyberSourceScreenKt r15 = com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.ComposableSingletons$AddPaymentMethodCyberSourceScreenKt.f35572a
            kotlin.jvm.functions.Function2 r15 = r15.a()
            r30 = 196608(0x30000, float:2.75506E-40)
            r31 = 98276(0x17fe4, float:1.37714E-40)
            r16 = 0
            r33 = r13
            r13 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 24576(0x6000, float:3.4438E-41)
            r28 = r8
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r11 = 2069767343(0x7b5e24af, float:1.1534339E36)
            r8.X(r11)
            boolean r11 = r8.l(r0)
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r3
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r13) goto L_0x0141
            r15 = r5
            goto L_0x0143
        L_0x0141:
            r15 = r33
        L_0x0143:
            r11 = r11 | r15
            boolean r12 = r8.l(r6)
            r11 = r11 | r12
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r13 = 2048(0x800, float:2.87E-42)
            if (r12 != r13) goto L_0x0151
            r15 = r5
            goto L_0x0153
        L_0x0151:
            r15 = r33
        L_0x0153:
            r5 = r11 | r15
            java.lang.Object r11 = r8.g()
            if (r5 != 0) goto L_0x0165
            java.lang.Object r5 = r32.a()
            if (r11 != r5) goto L_0x0162
            goto L_0x0165
        L_0x0162:
            r13 = r3
            r0 = r8
            goto L_0x0177
        L_0x0165:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1 r11 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1
            r12 = 0
            r13 = r3
            r3 = r11
            r4 = r0
            r5 = r38
            r7 = r37
            r0 = r8
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.N(r11)
        L_0x0177:
            r14 = r11
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r0.M()
            int r3 = r13 >> 6
            r16 = r3 & 14
            r17 = 6
            r12 = 0
            r13 = 0
            r11 = r36
            r15 = r0
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r11, r12, r13, r14, r15, r16, r17)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0194
            androidx.compose.runtime.ComposerKt.X()
        L_0x0194:
            androidx.compose.runtime.ScopeUpdateScope r7 = r0.x()
            if (r7 == 0) goto L_0x01af
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.b r8 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.b
            r0 = r8
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt.o(com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final void p(AddPaymentMethodCyberSource.State state, Function1 function1, PaddingValues paddingValues, Composer composer, int i2) {
        composer.X(1229205681);
        if (ComposerKt.P()) {
            ComposerKt.Y(1229205681, i2, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.ScreenImpl.Content (AddPaymentMethodCyberSourceScreen.kt:93)");
        }
        if (state.d() != null) {
            composer.X(682654062);
            String d2 = state.d();
            composer.X(1407496301);
            boolean W = composer.W(function1);
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new a(function1);
                composer.N(g2);
            }
            composer.M();
            s(d2, paddingValues, (Function0) g2, composer, (i2 << 3) & 112);
            composer.M();
        } else {
            composer.X(682770653);
            k(paddingValues, state, function1, composer, i2 & 14);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }

    public static final Unit q(Function1 function1) {
        function1.invoke(AddPaymentMethodCyberSource.Action.OnCardAddedInWebView.f35543a);
        return Unit.f40552a;
    }

    public static final Unit r(AddPaymentMethodCyberSource.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        o(state, function1, flow, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void s(String str, PaddingValues paddingValues, Function0 function0, Composer composer, int i2) {
        int i3;
        Continuation continuation;
        int i4;
        String str2 = str;
        PaddingValues paddingValues2 = paddingValues;
        Function0 function02 = function0;
        int i5 = i2;
        Composer q2 = composer.q(52083640);
        if ((i5 & 6) == 0) {
            i3 = (q2.W(str2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 48) == 0) {
            i3 |= q2.W(paddingValues2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i3 |= q2.l(function02) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(52083640, i3, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.WebViewCardInfo (AddPaymentMethodCyberSourceScreen.kt:155)");
            }
            Modifier f2 = SizeKt.f(ScaffoldImePaddingKt.a(Modifier.f15489d, paddingValues2), 0.0f, 1, (Object) null);
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.e(), false);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, f2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            AbtCircularProgressIndicatorKt.e((Modifier) null, 0, 0.0f, 0, 0, q2, 0, 31);
            q2.X(-868106519);
            Object g3 = q2.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g3 == companion2.a()) {
                i4 = 2;
                continuation = null;
                g3 = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
                q2.N(g3);
            } else {
                i4 = 2;
                continuation = null;
            }
            MutableState mutableState = (MutableState) g3;
            q2.M();
            Unit unit = Unit.f40552a;
            q2.X(-868104465);
            Object g4 = q2.g();
            if (g4 == companion2.a()) {
                g4 = new AddPaymentMethodCyberSourceScreenKt$WebViewCardInfo$1$1$1(mutableState, continuation);
                q2.N(g4);
            }
            q2.M();
            EffectsKt.g(unit, (Function2) g4, q2, 6);
            AnimatedVisibilityKt.j(u(mutableState), (Modifier) null, EnterExitTransitionKt.o(AnimationSpecKt.m(200, 2500, EasingFunctionsKt.m()), 0.0f, i4, continuation), (ExitTransition) null, (String) null, ComposableLambdaKt.e(740241942, true, new AddPaymentMethodCyberSourceScreenKt$WebViewCardInfo$1$2(function02, str2), q2, 54), q2, 196608, 26);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new c(str2, paddingValues2, function02, i5));
        }
    }

    public static final void t(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final boolean u(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final Unit v(String str, PaddingValues paddingValues, Function0 function0, int i2, Composer composer, int i3) {
        s(str, paddingValues, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
