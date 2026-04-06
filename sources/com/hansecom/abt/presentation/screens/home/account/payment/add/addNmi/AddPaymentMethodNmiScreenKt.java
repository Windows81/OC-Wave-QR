package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import android.webkit.WebView;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class AddPaymentMethodNmiScreenKt {
    public static final Unit A(Function0 function0) {
        function0.invoke();
        return Unit.f40552a;
    }

    public static final Unit B(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AddPaymentMethodNmi.Action.StateChange(str));
        return Unit.f40552a;
    }

    public static final Unit C(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AddPaymentMethodNmi.Action.PostalCodeChange(str));
        return Unit.f40552a;
    }

    public static final Unit D(Function0 function0) {
        function0.invoke();
        return Unit.f40552a;
    }

    public static final Unit E(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(AddPaymentMethodNmi.Action.Confirm.f35601a);
        return Unit.f40552a;
    }

    public static final Unit F(PaddingValues paddingValues, AddPaymentMethodNmi.State state, Function1 function1, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        v(paddingValues, state, function1, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void G(com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State r31, kotlin.jvm.functions.Function1 r32, kotlinx.coroutines.flow.Flow r33, kotlin.jvm.functions.Function0 r34, kotlin.jvm.functions.Function0 r35, kotlin.jvm.functions.Function0 r36, kotlin.jvm.functions.Function0 r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            r4 = r34
            r5 = r35
            r8 = r39
            r0 = -748523071(0xffffffffd36271c1, float:-9.7257108E11)
            r1 = r38
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r8 & 6
            if (r2 != 0) goto L_0x0020
            r2 = r31
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x001d
            r3 = 4
            goto L_0x001e
        L_0x001d:
            r3 = 2
        L_0x001e:
            r3 = r3 | r8
            goto L_0x0023
        L_0x0020:
            r2 = r31
            r3 = r8
        L_0x0023:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x0036
            r6 = r32
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0032
            r7 = 32
            goto L_0x0034
        L_0x0032:
            r7 = 16
        L_0x0034:
            r3 = r3 | r7
            goto L_0x0038
        L_0x0036:
            r6 = r32
        L_0x0038:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r33
            boolean r9 = r1.l(r7)
            if (r9 == 0) goto L_0x0047
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0049
        L_0x0047:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0049:
            r3 = r3 | r9
            goto L_0x004d
        L_0x004b:
            r7 = r33
        L_0x004d:
            r9 = r8 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x005d
            boolean r9 = r1.l(r4)
            if (r9 == 0) goto L_0x005a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x005c
        L_0x005a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x005c:
            r3 = r3 | r9
        L_0x005d:
            r9 = r8 & 24576(0x6000, float:3.4438E-41)
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r9 != 0) goto L_0x006e
            boolean r9 = r1.l(r5)
            if (r9 == 0) goto L_0x006b
            r9 = r14
            goto L_0x006d
        L_0x006b:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x006d:
            r3 = r3 | r9
        L_0x006e:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r8
            r13 = r36
            if (r9 != 0) goto L_0x0081
            boolean r9 = r1.l(r13)
            if (r9 == 0) goto L_0x007e
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0080
        L_0x007e:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x0080:
            r3 = r3 | r9
        L_0x0081:
            r9 = 1572864(0x180000, float:2.204052E-39)
            r9 = r9 & r8
            r12 = r37
            if (r9 != 0) goto L_0x0094
            boolean r9 = r1.l(r12)
            if (r9 == 0) goto L_0x0091
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0093
        L_0x0091:
            r9 = 524288(0x80000, float:7.34684E-40)
        L_0x0093:
            r3 = r3 | r9
        L_0x0094:
            r9 = 599187(0x92493, float:8.3964E-40)
            r9 = r9 & r3
            r10 = 599186(0x92492, float:8.39638E-40)
            if (r9 != r10) goto L_0x00a9
            boolean r9 = r1.t()
            if (r9 != 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            r1.B()
            goto L_0x01a8
        L_0x00a9:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00b5
            r9 = -1
            java.lang.String r10 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.ScreenImpl (AddPaymentMethodNmiScreen.kt:110)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r9, r10)
        L_0x00b5:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r1.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r10 = "AddPaymentMethodNmiScreen"
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.platform.TestTagKt.a(r9, r10)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$ScreenImpl$1 r9 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$ScreenImpl$1
            r9.<init>(r4)
            r10 = -1415884163(0xffffffffab9b527d, float:-1.1036308E-12)
            r11 = 1
            r15 = 54
            androidx.compose.runtime.internal.ComposableLambda r17 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r11, r9, r1, r15)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$ScreenImpl$2 r9 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$ScreenImpl$2
            r9.<init>(r0)
            r10 = 2011155771(0x77dfcd3b, float:9.078475E33)
            androidx.compose.runtime.internal.ComposableLambda r18 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r11, r9, r1, r15)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$ScreenImpl$3 r10 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$ScreenImpl$3
            r9 = r10
            r2 = r10
            r10 = r31
            r6 = r11
            r11 = r32
            r12 = r0
            r13 = r36
            r14 = r37
            r9.<init>(r10, r11, r12, r13, r14)
            r9 = -667944750(0xffffffffd82ff8d2, float:-7.7393284E14)
            androidx.compose.runtime.internal.ComposableLambda r20 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r6, r2, r1, r15)
            r22 = 805309494(0x30000c36, float:4.658348E-10)
            r23 = 500(0x1f4, float:7.0E-43)
            r11 = 0
            r13 = 0
            r14 = 0
            r24 = 0
            r26 = 0
            r19 = 0
            r9 = r16
            r10 = r17
            r12 = r18
            r2 = 2048(0x800, float:2.87E-42)
            r15 = r24
            r17 = r26
            r21 = r1
            androidx.compose.material3.ScaffoldKt.f(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22, r23)
            boolean r12 = r31.x()
            int r9 = com.hansecom.abt.R.string.Y
            r15 = 0
            java.lang.String r9 = androidx.compose.ui.res.StringResources_androidKt.b(r9, r1, r15)
            int r10 = com.hansecom.abt.R.string.X
            java.lang.String r10 = androidx.compose.ui.res.StringResources_androidKt.b(r10, r1, r15)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.ComposableSingletons$AddPaymentMethodNmiScreenKt r11 = com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.ComposableSingletons$AddPaymentMethodNmiScreenKt.f35656a
            kotlin.jvm.functions.Function2 r13 = r11.a()
            r28 = 196608(0x30000, float:2.75506E-40)
            r29 = 98276(0x17fe4, float:1.37714E-40)
            r11 = 0
            r14 = 0
            r16 = 0
            r30 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 24576(0x6000, float:3.4438E-41)
            r26 = r1
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r9 = -1176823998(0xffffffffb9db1742, float:-4.1788263E-4)
            r1.X(r9)
            boolean r9 = r1.l(r0)
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r3
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r10 != r11) goto L_0x0168
            r11 = r6
            goto L_0x016a
        L_0x0168:
            r11 = r30
        L_0x016a:
            r9 = r9 | r11
            r10 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != r2) goto L_0x0171
            r11 = r6
            goto L_0x0173
        L_0x0171:
            r11 = r30
        L_0x0173:
            r2 = r9 | r11
            java.lang.Object r6 = r1.g()
            if (r2 != 0) goto L_0x0183
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x018c
        L_0x0183:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$ScreenImpl$4$1 r6 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$ScreenImpl$4$1
            r2 = 0
            r6.<init>(r0, r5, r4, r2)
            r1.N(r6)
        L_0x018c:
            r12 = r6
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r1.M()
            int r0 = r3 >> 6
            r14 = r0 & 14
            r15 = 6
            r10 = 0
            r11 = 0
            r9 = r33
            r13 = r1
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01a8
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a8:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x01c7
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.e r10 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.e
            r0 = r10
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt.G(com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void H(com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State r7, kotlin.jvm.functions.Function1 r8, com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r9, kotlin.jvm.functions.Function0 r10, kotlin.jvm.functions.Function0 r11, androidx.compose.foundation.layout.PaddingValues r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            r0 = 2023748057(0x789ff1d9, float:2.5952514E34)
            r13.X(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.ScreenImpl.Content (AddPaymentMethodNmiScreen.kt:114)"
            androidx.compose.runtime.ComposerKt.Y(r0, r14, r1, r2)
        L_0x0012:
            boolean r0 = r7.w()
            if (r0 != 0) goto L_0x0079
            r10 = 1205953337(0x47e16339, float:115398.445)
            r13.X(r10)
            int r1 = r7.l()
            r7 = 593096507(0x2359ef3b, float:1.1814253E-17)
            r13.X(r7)
            boolean r7 = r13.W(r8)
            java.lang.Object r10 = r13.g()
            if (r7 != 0) goto L_0x003a
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r10 != r7) goto L_0x0042
        L_0x003a:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.a r10 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.a
            r10.<init>(r8)
            r13.N(r10)
        L_0x0042:
            r2 = r10
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r13.M()
            r7 = 593098774(0x2359f816, float:1.1816128E-17)
            r13.X(r7)
            boolean r7 = r13.l(r9)
            java.lang.Object r8 = r13.g()
            if (r7 != 0) goto L_0x0060
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0068
        L_0x0060:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.h r8 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.h
            r8.<init>(r9)
            r13.N(r8)
        L_0x0068:
            r3 = r8
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r13.M()
            r5 = r14 & 14
            r0 = r12
            r4 = r13
            L(r0, r1, r2, r3, r4, r5)
            r13.M()
            goto L_0x008d
        L_0x0079:
            r9 = 1206268235(0x47e6314b, float:117858.586)
            r13.X(r9)
            r6 = r14 & 14
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r13
            v(r0, r1, r2, r3, r4, r5, r6)
            r13.M()
        L_0x008d:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0096
            androidx.compose.runtime.ComposerKt.X()
        L_0x0096:
            r13.M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt.H(com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State, kotlin.jvm.functions.Function1, com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit I(Function1 function1, CreditCardInfoNetworkMerchantResponse creditCardInfoNetworkMerchantResponse) {
        Intrinsics.i(creditCardInfoNetworkMerchantResponse, "it");
        function1.invoke(new AddPaymentMethodNmi.Action.OnCardAddedInWebView(creditCardInfoNetworkMerchantResponse));
        return Unit.f40552a;
    }

    public static final Unit J(AbtSnackbarHostState abtSnackbarHostState, StringValue stringValue) {
        Intrinsics.i(stringValue, "it");
        AbtSnackbarHostState.d(abtSnackbarHostState, stringValue, (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit K(AddPaymentMethodNmi.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, Composer composer, int i3) {
        G(state, function1, flow, function0, function02, function03, function04, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.JsInterface} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void L(androidx.compose.foundation.layout.PaddingValues r23, int r24, kotlin.jvm.functions.Function1 r25, kotlin.jvm.functions.Function1 r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r28
            r0 = 233810986(0xdefac2a, float:1.4770959E-30)
            r6 = r27
            androidx.compose.runtime.Composer r15 = r6.q(r0)
            r14 = 6
            r6 = r5 & 6
            r13 = 2
            if (r6 != 0) goto L_0x0024
            boolean r6 = r15.W(r1)
            if (r6 == 0) goto L_0x0021
            r6 = 4
            goto L_0x0022
        L_0x0021:
            r6 = r13
        L_0x0022:
            r6 = r6 | r5
            goto L_0x0025
        L_0x0024:
            r6 = r5
        L_0x0025:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0035
            boolean r7 = r15.i(r2)
            if (r7 == 0) goto L_0x0032
            r7 = 32
            goto L_0x0034
        L_0x0032:
            r7 = 16
        L_0x0034:
            r6 = r6 | r7
        L_0x0035:
            r7 = r5 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0046
            boolean r7 = r15.l(r3)
            if (r7 == 0) goto L_0x0043
            r7 = r8
            goto L_0x0045
        L_0x0043:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r6 = r6 | r7
        L_0x0046:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r7 != 0) goto L_0x0057
            boolean r7 = r15.l(r4)
            if (r7 == 0) goto L_0x0054
            r7 = r9
            goto L_0x0056
        L_0x0054:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0056:
            r6 = r6 | r7
        L_0x0057:
            r7 = r6 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r7 != r10) goto L_0x006a
            boolean r7 = r15.t()
            if (r7 != 0) goto L_0x0064
            goto L_0x006a
        L_0x0064:
            r15.B()
            r1 = r15
            goto L_0x01d6
        L_0x006a:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0076
            r7 = -1
            java.lang.String r10 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.WebViewCardInfo (AddPaymentMethodNmiScreen.kt:179)"
            androidx.compose.runtime.ComposerKt.Y(r0, r6, r7, r10)
        L_0x0076:
            r0 = 1626477506(0x60f213c2, float:1.3954799E20)
            r15.X(r0)
            r0 = r6 & 896(0x380, float:1.256E-42)
            r7 = 0
            r12 = 1
            if (r0 != r8) goto L_0x0084
            r0 = r12
            goto L_0x0085
        L_0x0084:
            r0 = r7
        L_0x0085:
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != r9) goto L_0x008b
            r6 = r12
            goto L_0x008c
        L_0x008b:
            r6 = r7
        L_0x008c:
            r0 = r0 | r6
            java.lang.Object r6 = r15.g()
            if (r0 != 0) goto L_0x009b
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x00a3
        L_0x009b:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.JsInterface r6 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.JsInterface
            r6.<init>(r3, r4)
            r15.N(r6)
        L_0x00a3:
            r0 = r6
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.JsInterface r0 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.JsInterface) r0
            r15.M()
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r6 = com.hansecom.abt.util.ScaffoldImePaddingKt.a(r6, r1)
            r10 = 0
            r11 = 0
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.f(r6, r10, r12, r11)
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r8 = r8.e()
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.BoxKt.g(r8, r7)
            int r7 = androidx.compose.runtime.ComposablesKt.a(r15, r7)
            androidx.compose.runtime.CompositionLocalMap r9 = r15.I()
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.ComposedModifierKt.e(r15, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r10 = r16.a()
            androidx.compose.runtime.Applier r17 = r15.v()
            if (r17 != 0) goto L_0x00da
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00da:
            r15.s()
            boolean r17 = r15.n()
            if (r17 == 0) goto L_0x00e7
            r15.y(r10)
            goto L_0x00ea
        L_0x00e7:
            r15.K()
        L_0x00ea:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r11 = r16.c()
            androidx.compose.runtime.Updater.g(r10, r8, r11)
            kotlin.jvm.functions.Function2 r8 = r16.e()
            androidx.compose.runtime.Updater.g(r10, r9, r8)
            kotlin.jvm.functions.Function2 r8 = r16.b()
            boolean r9 = r10.n()
            if (r9 != 0) goto L_0x0114
            java.lang.Object r9 = r10.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r11)
            if (r9 != 0) goto L_0x0122
        L_0x0114:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r10.N(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.A(r7, r8)
        L_0x0122:
            kotlin.jvm.functions.Function2 r7 = r16.d()
            androidx.compose.runtime.Updater.g(r10, r6, r7)
            androidx.compose.foundation.layout.BoxScopeInstance r6 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r15.C(r6)
            r10 = r6
            android.content.Context r10 = (android.content.Context) r10
            r16 = 0
            r18 = 31
            r6 = 0
            r7 = 0
            r9 = 0
            r19 = 0
            r21 = 0
            r22 = r10
            r10 = r19
            r12 = r21
            r13 = r15
            r14 = r16
            r1 = r15
            r15 = r18
            com.hansecom.abt.ui.components.progress.AbtCircularProgressIndicatorKt.e(r6, r7, r9, r10, r12, r13, r14, r15)
            r6 = -1653656769(0xffffffff9d6f333f, float:-3.165788E-21)
            r1.X(r6)
            java.lang.Object r6 = r1.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r7.a()
            if (r6 != r8) goto L_0x016f
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r8 = 2
            r9 = 0
            androidx.compose.runtime.MutableState r6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r6, r9, r8, r9)
            r1.N(r6)
            goto L_0x0171
        L_0x016f:
            r8 = 2
            r9 = 0
        L_0x0171:
            androidx.compose.runtime.MutableState r6 = (androidx.compose.runtime.MutableState) r6
            r1.M()
            kotlin.Unit r10 = kotlin.Unit.f40552a
            r11 = -1653654715(0xffffffff9d6f3b45, float:-3.1662028E-21)
            r1.X(r11)
            java.lang.Object r11 = r1.g()
            java.lang.Object r7 = r7.a()
            if (r11 != r7) goto L_0x0190
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$1$1 r11 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$1$1
            r11.<init>(r6, r9)
            r1.N(r11)
        L_0x0190:
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r1.M()
            r7 = 6
            androidx.compose.runtime.EffectsKt.g(r10, r11, r1, r7)
            boolean r6 = M(r6)
            r7 = 2500(0x9c4, float:3.503E-42)
            androidx.compose.animation.core.Easing r10 = androidx.compose.animation.core.EasingFunctionsKt.m()
            r11 = 200(0xc8, float:2.8E-43)
            androidx.compose.animation.core.TweenSpec r7 = androidx.compose.animation.core.AnimationSpecKt.m(r11, r7, r10)
            r10 = 0
            androidx.compose.animation.EnterTransition r8 = androidx.compose.animation.EnterExitTransitionKt.o(r7, r10, r8, r9)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$2 r7 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$2
            r9 = r22
            r7.<init>(r0, r9, r2)
            r0 = 54
            r9 = -683609076(0xffffffffd740f40c, float:-2.12154406E14)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r10, r7, r1, r0)
            r13 = 196608(0x30000, float:2.75506E-40)
            r14 = 26
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = r1
            androidx.compose.animation.AnimatedVisibilityKt.j(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01d6
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d6:
            androidx.compose.runtime.ScopeUpdateScope r6 = r1.x()
            if (r6 == 0) goto L_0x01ef
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.i r7 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.i
            r0 = r7
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt.L(androidx.compose.foundation.layout.PaddingValues, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final boolean M(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void N(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final Unit O(PaddingValues paddingValues, int i2, Function1 function1, Function1 function12, int i3, Composer composer, int i4) {
        L(paddingValues, i2, function1, function12, composer, RecomposeScopeImplKt.a(i3 | 1));
        return Unit.f40552a;
    }

    public static final AddPaymentMethodNmiScreenKt$addPaymentWebViewClient$1 T(WebView webView) {
        return new AddPaymentMethodNmiScreenKt$addPaymentWebViewClient$1(webView);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: kotlinx.coroutines.flow.Flow} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c4, code lost:
        if ((r24 & 1) != 0) goto L_0x00c6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel r17, kotlin.jvm.functions.Function0 r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function0 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r23
            java.lang.String r0 = "onUpClick"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "onCardAdded"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            java.lang.String r0 = "onCountryClick"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onStateClick"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 857681925(0x331f3005, float:3.7063746E-8)
            r1 = r22
            androidx.compose.runtime.Composer r14 = r1.q(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x003e
            r1 = r24 & 1
            if (r1 != 0) goto L_0x0039
            r1 = r17
            boolean r2 = r14.l(r1)
            if (r2 == 0) goto L_0x003b
            r2 = 4
            goto L_0x003c
        L_0x0039:
            r1 = r17
        L_0x003b:
            r2 = 2
        L_0x003c:
            r2 = r2 | r13
            goto L_0x0041
        L_0x003e:
            r1 = r17
            r2 = r13
        L_0x0041:
            r3 = r24 & 2
            if (r3 == 0) goto L_0x0048
            r2 = r2 | 48
            goto L_0x0058
        L_0x0048:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x0058
            boolean r3 = r14.l(r9)
            if (r3 == 0) goto L_0x0055
            r3 = 32
            goto L_0x0057
        L_0x0055:
            r3 = 16
        L_0x0057:
            r2 = r2 | r3
        L_0x0058:
            r3 = r24 & 4
            if (r3 == 0) goto L_0x005f
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005f:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x006f
            boolean r3 = r14.l(r10)
            if (r3 == 0) goto L_0x006c
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r3 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r2 = r2 | r3
        L_0x006f:
            r3 = r24 & 8
            if (r3 == 0) goto L_0x0076
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0076:
            r3 = r13 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0086
            boolean r3 = r14.l(r11)
            if (r3 == 0) goto L_0x0083
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r2 = r2 | r3
        L_0x0086:
            r3 = r24 & 16
            if (r3 == 0) goto L_0x008e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x008c:
            r15 = r2
            goto L_0x009f
        L_0x008e:
            r3 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008c
            boolean r3 = r14.l(r12)
            if (r3 == 0) goto L_0x009b
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r2 = r2 | r3
            goto L_0x008c
        L_0x009f:
            r2 = r15 & 9363(0x2493, float:1.312E-41)
            r3 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r3) goto L_0x00b1
            boolean r2 = r14.t()
            if (r2 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            r14.B()
            goto L_0x01a3
        L_0x00b1:
            r14.p()
            r2 = r13 & 1
            if (r2 == 0) goto L_0x00ce
            boolean r2 = r14.J()
            if (r2 == 0) goto L_0x00bf
            goto L_0x00ce
        L_0x00bf:
            r14.B()
            r2 = r24 & 1
            if (r2 == 0) goto L_0x00c8
        L_0x00c6:
            r15 = r15 & -15
        L_0x00c8:
            r16 = r15
            r15 = r1
            r1 = r16
            goto L_0x011a
        L_0x00ce:
            r2 = r24 & 1
            if (r2 == 0) goto L_0x00c8
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r14.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r2 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r1.c(r14, r2)
            if (r2 == 0) goto L_0x0112
            r1 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r14, r1)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r14.f(r1)
            boolean r1 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L_0x00fa
            r1 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.n()
        L_0x00f8:
            r5 = r1
            goto L_0x00fd
        L_0x00fa:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00f8
        L_0x00fd:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel> r1 = com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel.class
            r3 = 0
            r6 = r14
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.S()
            r14.S()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel r1 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel) r1
            goto L_0x00c6
        L_0x0112:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x011a:
            r14.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0129
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreen (AddPaymentMethodNmiScreen.kt:88)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x0129:
            int r0 = r1 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r15
            r4 = r14
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r1 = r(r1)
            r2 = -1200342328(0xffffffffb8743ac8, float:-5.8228878E-5)
            r14.X(r2)
            boolean r2 = r14.l(r15)
            java.lang.Object r3 = r14.g()
            if (r2 != 0) goto L_0x0152
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x015a
        L_0x0152:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$AddPaymentMethodNmiScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$AddPaymentMethodNmiScreen$1$1
            r3.<init>(r15)
            r14.N(r3)
        L_0x015a:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r14.M()
            r2 = -1200341120(0xffffffffb8743f80, float:-5.8233272E-5)
            r14.X(r2)
            boolean r2 = r14.W(r15)
            java.lang.Object r4 = r14.g()
            if (r2 != 0) goto L_0x0177
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x017e
        L_0x0177:
            kotlinx.coroutines.flow.Flow r4 = r15.l()
            r14.N(r4)
        L_0x017e:
            r2 = r4
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
            r14.M()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r4 = 4193280(0x3ffc00, float:5.876037E-39)
            r8 = r0 & r4
            r0 = r1
            r1 = r3
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r14
            G(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01a2
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a2:
            r1 = r15
        L_0x01a3:
            androidx.compose.runtime.ScopeUpdateScope r8 = r14.x()
            if (r8 == 0) goto L_0x01be
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.f r14 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.f
            r0 = r14
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r14)
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt.q(com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AddPaymentMethodNmi.State r(State state) {
        return (AddPaymentMethodNmi.State) state.getValue();
    }

    public static final Unit s(AddPaymentMethodNmiViewModel addPaymentMethodNmiViewModel, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, int i3, Composer composer, int i4) {
        q(addPaymentMethodNmiViewModel, function0, function02, function03, function04, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void t(Composer composer, int i2) {
        Composer composer2;
        int i3 = i2;
        Composer q2 = composer.q(-159034385);
        if (i3 != 0 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-159034385, i3, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.Info (AddPaymentMethodNmiScreen.kt:360)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            TextAlign.Companion companion2 = TextAlign.f19080b;
            int f2 = companion2.f();
            String b2 = StringResources_androidKt.b(R.string.b0, q2, 0);
            AbtTheme abtTheme = AbtTheme.f38851a;
            Composer composer3 = q2;
            TextKt.j(b2, h2, abtTheme.b(q2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(f2), 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).f(), composer3, 48, 0, 130040);
            Composer composer4 = composer3;
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 8)), composer4, 6);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            int f3 = companion2.f();
            composer2 = composer4;
            TextKt.j(StringResources_androidKt.b(R.string.a0, composer4, 0), h3, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(f3), 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer4, 6).b(), composer2, 48, 0, 130044);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new C0482g(i3));
        }
    }

    public static final Unit u(int i2, Composer composer, int i3) {
        t(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(androidx.compose.foundation.layout.PaddingValues r52, com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State r53, kotlin.jvm.functions.Function1 r54, kotlin.jvm.functions.Function0 r55, kotlin.jvm.functions.Function0 r56, androidx.compose.runtime.Composer r57, int r58) {
        /*
            r1 = r52
            r3 = r54
            r4 = r55
            r5 = r56
            r6 = r58
            r0 = 1862683426(0x6f064b22, float:4.156182E28)
            r2 = r57
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r7 = r6 & 6
            r8 = 2
            if (r7 != 0) goto L_0x0023
            boolean r7 = r2.W(r1)
            if (r7 == 0) goto L_0x0020
            r7 = 4
            goto L_0x0021
        L_0x0020:
            r7 = r8
        L_0x0021:
            r7 = r7 | r6
            goto L_0x0024
        L_0x0023:
            r7 = r6
        L_0x0024:
            r9 = r6 & 48
            r15 = r53
            if (r9 != 0) goto L_0x0036
            boolean r9 = r2.W(r15)
            if (r9 == 0) goto L_0x0033
            r9 = 32
            goto L_0x0035
        L_0x0033:
            r9 = 16
        L_0x0035:
            r7 = r7 | r9
        L_0x0036:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0046
            boolean r9 = r2.l(r3)
            if (r9 == 0) goto L_0x0043
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r7 = r7 | r9
        L_0x0046:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0056
            boolean r9 = r2.l(r4)
            if (r9 == 0) goto L_0x0053
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r7 = r7 | r9
        L_0x0056:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0066
            boolean r9 = r2.l(r5)
            if (r9 == 0) goto L_0x0063
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0065
        L_0x0063:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0065:
            r7 = r7 | r9
        L_0x0066:
            r12 = r7
            r7 = r12 & 9363(0x2493, float:1.312E-41)
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r9) goto L_0x0079
            boolean r7 = r2.t()
            if (r7 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r2.B()
            goto L_0x05cd
        L_0x0079:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0085
            r7 = -1
            java.lang.String r9 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.InputInfoAndAddCard (AddPaymentMethodNmiScreen.kt:235)"
            androidx.compose.runtime.ComposerKt.Y(r0, r12, r7, r9)
        L_0x0085:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r0 = r2.C(r0)
            androidx.compose.ui.focus.FocusManager r0 = (androidx.compose.ui.focus.FocusManager) r0
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            r10 = 0
            r7 = 1
            r15 = 0
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.SizeKt.f(r9, r10, r7, r15)
            androidx.compose.ui.Modifier r16 = com.hansecom.abt.util.ScaffoldImePaddingKt.a(r11, r1)
            r11 = 0
            androidx.compose.foundation.ScrollState r17 = androidx.compose.foundation.ScrollKt.c(r11, r2, r11, r7)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.ScrollKt.g(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.ui.theme.Dimensions r27 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r13 = r27.c()
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.PaddingKt.k(r7, r13, r10, r8, r15)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r8 = r8.g()
            androidx.compose.ui.Alignment$Companion r28 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r13 = r28.k()
            r15 = 6
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.ColumnKt.a(r8, r13, r2, r15)
            int r13 = androidx.compose.runtime.ComposablesKt.a(r2, r11)
            androidx.compose.runtime.CompositionLocalMap r10 = r2.I()
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.ComposedModifierKt.e(r2, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r19 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r11 = r19.a()
            androidx.compose.runtime.Applier r21 = r2.v()
            if (r21 != 0) goto L_0x00e5
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00e5:
            r2.s()
            boolean r21 = r2.n()
            if (r21 == 0) goto L_0x00f2
            r2.y(r11)
            goto L_0x00f5
        L_0x00f2:
            r2.K()
        L_0x00f5:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r2)
            kotlin.jvm.functions.Function2 r14 = r19.c()
            androidx.compose.runtime.Updater.g(r11, r8, r14)
            kotlin.jvm.functions.Function2 r8 = r19.e()
            androidx.compose.runtime.Updater.g(r11, r10, r8)
            kotlin.jvm.functions.Function2 r8 = r19.b()
            boolean r10 = r11.n()
            if (r10 != 0) goto L_0x011f
            java.lang.Object r10 = r11.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r14)
            if (r10 != 0) goto L_0x012d
        L_0x011f:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r11.N(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r11.A(r10, r8)
        L_0x012d:
            kotlin.jvm.functions.Function2 r8 = r19.d()
            androidx.compose.runtime.Updater.g(r11, r7, r8)
            androidx.compose.foundation.layout.ColumnScopeInstance r14 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            java.lang.String r13 = r53.c()
            r19 = 0
            r22 = 111(0x6f, float:1.56E-43)
            r7 = 0
            r8 = 0
            r10 = 0
            r24 = 0
            r26 = 0
            r29 = 0
            r31 = r9
            r9 = r10
            r33 = r12
            r11 = r24
            r34 = r14
            r14 = r26
            r15 = r29
            r16 = r2
            r17 = r19
            r18 = r22
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18)
            java.lang.String r7 = r53.k()
            int r9 = com.hansecom.abt.R.string.Z
            com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r8 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
            com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r8.a()
            r11 = r31
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r11, r15, r14, r13)
            java.lang.String r12 = "nickname"
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.platform.TestTagKt.a(r8, r12)
            androidx.compose.ui.text.input.ImeAction$Companion r29 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r18 = r29.d()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r30 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r23 = r30.e()
            r8 = 1210937309(0x482d6fdd, float:177599.45)
            r2.X(r8)
            r12 = r33
            r8 = r12 & 896(0x380, float:1.256E-42)
            r15 = 256(0x100, float:3.59E-43)
            if (r8 != r15) goto L_0x0196
            r16 = r14
            goto L_0x0198
        L_0x0196:
            r16 = 0
        L_0x0198:
            java.lang.Object r13 = r2.g()
            if (r16 != 0) goto L_0x01a6
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r16.a()
            if (r13 != r14) goto L_0x01ae
        L_0x01a6:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.j r13 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.j
            r13.<init>(r3)
            r2.N(r13)
        L_0x01ae:
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r14 = r8
            r8 = r13
            r2.M()
            r25 = 54
            r26 = 62432(0xf3e0, float:8.7486E-41)
            r13 = 0
            r35 = r12
            r12 = r13
            r13 = 0
            r16 = 0
            r36 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 27648(0x6c00, float:3.8743E-41)
            r37 = r11
            r11 = r17
            r17 = r23
            r23 = r2
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r11 = 0
            t(r2, r11)
            r7 = 24
            float r7 = (float) r7
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            r10 = r37
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.i(r10, r7)
            r9 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r7, r2, r9)
            java.lang.String r7 = r53.s()
            int r17 = com.hansecom.abt.R.string.f0
            com.hansecom.abt.util.resourcesResolvers.StringValue r18 = r53.t()
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r10, r15, r14, r13)
            java.lang.String r12 = "address"
            androidx.compose.ui.Modifier r22 = androidx.compose.ui.platform.TestTagKt.a(r8, r12)
            int r23 = r29.d()
            int r31 = r30.e()
            androidx.compose.ui.autofill.ContentType$Companion r32 = androidx.compose.ui.autofill.ContentType.f15598a
            androidx.compose.ui.autofill.ContentType r33 = r32.d()
            r8 = 1210954879(0x482db47f, float:177873.98)
            r2.X(r8)
            r8 = r36
            r12 = 256(0x100, float:3.59E-43)
            if (r8 != r12) goto L_0x0229
            r16 = r14
            goto L_0x022b
        L_0x0229:
            r16 = r11
        L_0x022b:
            java.lang.Object r9 = r2.g()
            if (r16 != 0) goto L_0x0239
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r16.a()
            if (r9 != r11) goto L_0x0241
        L_0x0239:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.k r9 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.k
            r9.<init>(r3)
            r2.N(r9)
        L_0x0241:
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r11 = r8
            r8 = r9
            r2.M()
            r25 = 54
            r26 = 29664(0x73e0, float:4.1568E-41)
            r9 = 0
            r12 = r9
            r9 = 0
            r13 = r9
            r14 = r9
            r9 = 0
            r15 = r9
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r9 = r17
            r38 = r10
            r10 = r18
            r39 = r11
            r11 = r22
            r17 = r31
            r18 = r23
            r22 = r33
            r23 = r2
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r7 = r53.u()
            int r9 = com.hansecom.abt.R.string.g0
            com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r53.v()
            r11 = r38
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r11, r15, r14, r13)
            java.lang.String r12 = "address2"
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.platform.TestTagKt.a(r8, r12)
            int r18 = r29.d()
            int r22 = r30.e()
            androidx.compose.ui.autofill.ContentType r23 = r32.a()
            r8 = 1210973289(0x482dfc69, float:178161.64)
            r2.X(r8)
            r8 = r39
            r12 = 256(0x100, float:3.59E-43)
            if (r8 != r12) goto L_0x02a6
            r16 = r14
            goto L_0x02a8
        L_0x02a6:
            r16 = 0
        L_0x02a8:
            java.lang.Object r12 = r2.g()
            if (r16 != 0) goto L_0x02b6
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r16.a()
            if (r12 != r13) goto L_0x02be
        L_0x02b6:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.l r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.l
            r12.<init>(r3)
            r2.N(r12)
        L_0x02be:
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r13 = r8
            r8 = r12
            r2.M()
            r25 = 54
            r26 = 29664(0x73e0, float:4.1568E-41)
            r12 = 0
            r16 = 0
            r40 = r13
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r41 = r11
            r11 = r17
            r17 = r22
            r22 = r23
            r23 = r2
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r7 = r53.f()
            int r9 = com.hansecom.abt.R.string.V
            com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r53.g()
            r11 = r41
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r11, r15, r14, r13)
            java.lang.String r12 = "city"
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.platform.TestTagKt.a(r8, r12)
            int r18 = r29.d()
            int r22 = r30.e()
            androidx.compose.ui.autofill.ContentType r23 = r32.b()
            r8 = 1210992537(0x482e4799, float:178462.39)
            r2.X(r8)
            r8 = r40
            r12 = 256(0x100, float:3.59E-43)
            if (r8 != r12) goto L_0x0321
            r16 = r14
            goto L_0x0323
        L_0x0321:
            r16 = 0
        L_0x0323:
            java.lang.Object r12 = r2.g()
            if (r16 != 0) goto L_0x0331
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r16.a()
            if (r12 != r13) goto L_0x0339
        L_0x0331:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.m r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.m
            r12.<init>(r3)
            r2.N(r12)
        L_0x0339:
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r13 = r8
            r8 = r12
            r2.M()
            r25 = 54
            r26 = 29664(0x73e0, float:4.1568E-41)
            r12 = 0
            r16 = 0
            r42 = r13
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r43 = r11
            r11 = r17
            r17 = r22
            r22 = r23
            r23 = r2
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r7 = r53.p()
            java.lang.String r8 = "state"
            if (r7 == 0) goto L_0x03e3
            r7 = -1113446533(0xffffffffbda2277b, float:-0.079176866)
            r2.X(r7)
            java.lang.String r7 = r53.q()
            r15 = r43
            r12 = 0
            r13 = 1
            r14 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.SizeKt.h(r15, r14, r13, r12)
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.platform.TestTagKt.a(r9, r8)
            int r9 = com.hansecom.abt.R.string.e0
            com.hansecom.abt.util.resourcesResolvers.StringValue r8 = r53.r()
            r11 = 0
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r12 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r8, r12, r2, r11)
            r8 = 1211021354(0x482eb82a, float:178912.66)
            r2.X(r8)
            r8 = 57344(0xe000, float:8.0356E-41)
            r31 = r15
            r15 = r35
            r8 = r8 & r15
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r8 != r11) goto L_0x03a8
            r8 = r13
            goto L_0x03a9
        L_0x03a8:
            r8 = 0
        L_0x03a9:
            java.lang.Object r11 = r2.g()
            if (r8 != 0) goto L_0x03b7
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x03bf
        L_0x03b7:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.n r11 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.n
            r11.<init>(r5)
            r2.N(r11)
        L_0x03bf:
            r8 = r11
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r2.M()
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 80
            r11 = 0
            r18 = 0
            r13 = r18
            r14 = r2
            r44 = r15
            r45 = r31
            r15 = r16
            r16 = r17
            com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.M()
            r46 = r42
            r47 = r45
            goto L_0x0469
        L_0x03e3:
            r44 = r35
            r45 = r43
            r7 = -1112977007(0xffffffffbda95191, float:-0.08267511)
            r2.X(r7)
            java.lang.String r7 = r53.q()
            int r9 = com.hansecom.abt.R.string.e0
            com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r53.r()
            r11 = r45
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.h(r11, r15, r14, r13)
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.platform.TestTagKt.a(r12, r8)
            int r18 = r29.b()
            int r22 = r30.e()
            androidx.compose.ui.autofill.ContentType r23 = r32.c()
            r8 = 1211026490(0x482ecc3a, float:178992.9)
            r2.X(r8)
            r8 = r42
            r12 = 256(0x100, float:3.59E-43)
            if (r8 != r12) goto L_0x041f
            r16 = r14
            goto L_0x0421
        L_0x041f:
            r16 = 0
        L_0x0421:
            java.lang.Object r12 = r2.g()
            if (r16 != 0) goto L_0x042f
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r16.a()
            if (r12 != r13) goto L_0x0437
        L_0x042f:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.o r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.o
            r12.<init>(r3)
            r2.N(r12)
        L_0x0437:
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r13 = r8
            r8 = r12
            r2.M()
            r25 = 54
            r26 = 29664(0x73e0, float:4.1568E-41)
            r12 = 0
            r16 = 0
            r46 = r13
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r47 = r11
            r11 = r17
            r17 = r22
            r22 = r23
            r23 = r2
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.M()
        L_0x0469:
            java.lang.String r7 = r53.n()
            int r9 = com.hansecom.abt.R.string.d0
            com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r53.o()
            r11 = r47
            r13 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r11, r15, r14, r13)
            java.lang.String r12 = "zip"
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.platform.TestTagKt.a(r8, r12)
            int r18 = r29.d()
            int r22 = r30.a()
            androidx.compose.ui.autofill.ContentType r23 = r32.l()
            r8 = 1211045471(0x482f165f, float:179289.48)
            r2.X(r8)
            r8 = r46
            r12 = 256(0x100, float:3.59E-43)
            if (r8 != r12) goto L_0x049d
            r16 = r14
            goto L_0x049f
        L_0x049d:
            r16 = 0
        L_0x049f:
            java.lang.Object r12 = r2.g()
            if (r16 != 0) goto L_0x04ad
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r16.a()
            if (r12 != r13) goto L_0x04b5
        L_0x04ad:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.p r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.p
            r12.<init>(r3)
            r2.N(r12)
        L_0x04b5:
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r13 = r8
            r8 = r12
            r2.M()
            r25 = 54
            r26 = 29664(0x73e0, float:4.1568E-41)
            r12 = 0
            r16 = 0
            r48 = r13
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r49 = r11
            r11 = r17
            r17 = r22
            r22 = r23
            r23 = r2
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r7 = r53.h()
            r15 = r49
            r12 = 0
            r13 = 1
            r14 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.h(r15, r14, r13, r12)
            java.lang.String r9 = "country"
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.platform.TestTagKt.a(r8, r9)
            int r9 = com.hansecom.abt.R.string.W
            com.hansecom.abt.util.resourcesResolvers.StringValue r8 = r53.i()
            r11 = 0
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r12 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r8, r12, r2, r11)
            r8 = 1211072812(0x482f812c, float:179716.69)
            r2.X(r8)
            r8 = r44
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r11 = 2048(0x800, float:2.87E-42)
            if (r8 != r11) goto L_0x0514
            r8 = r13
            goto L_0x0515
        L_0x0514:
            r8 = 0
        L_0x0515:
            java.lang.Object r11 = r2.g()
            if (r8 != 0) goto L_0x0523
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x052b
        L_0x0523:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.b r11 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.b
            r11.<init>(r4)
            r2.N(r11)
        L_0x052b:
            r8 = r11
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r2.M()
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 80
            r11 = 0
            r18 = 0
            r13 = r18
            r14 = r2
            r50 = r15
            r15 = r16
            r16 = r17
            com.hansecom.abt.ui.components.formFields.ClickableOutlinedTextFieldKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            float r7 = r27.f()
            r15 = r50
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.i(r15, r7)
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r7, r2, r14)
            int r7 = com.hansecom.abt.R.string.U
            r8 = 0
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r2, r8)
            r7 = 0
            r9 = 1
            r10 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r15, r7, r9, r10)
            androidx.compose.ui.Alignment$Horizontal r10 = r28.g()
            r12 = r34
            androidx.compose.ui.Modifier r7 = r12.b(r7, r10)
            java.lang.String r10 = "add"
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.platform.TestTagKt.a(r7, r10)
            r7 = 1211077752(0x482f9478, float:179793.88)
            r2.X(r7)
            boolean r7 = r2.l(r0)
            r13 = r48
            r12 = 256(0x100, float:3.59E-43)
            if (r13 != r12) goto L_0x0581
            goto L_0x0582
        L_0x0581:
            r9 = r8
        L_0x0582:
            r7 = r7 | r9
            java.lang.Object r8 = r2.g()
            if (r7 != 0) goto L_0x0591
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0599
        L_0x0591:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.c r8 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.c
            r8.<init>(r0, r3)
            r2.N(r8)
        L_0x0599:
            r7 = r8
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r2.M()
            r0 = 0
            r16 = 108(0x6c, float:1.51E-43)
            r9 = 0
            r12 = 0
            r13 = 0
            r17 = 0
            r8 = r10
            r10 = r12
            r12 = r13
            r13 = r17
            r14 = r2
            r51 = r15
            r15 = r0
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            float r0 = r27.e()
            r7 = r51
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r7, r0)
            r7 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r0, r2, r7)
            r2.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x05cd
            androidx.compose.runtime.ComposerKt.X()
        L_0x05cd:
            androidx.compose.runtime.ScopeUpdateScope r7 = r2.x()
            if (r7 == 0) goto L_0x05e8
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.d r8 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.d
            r0 = r8
            r1 = r52
            r2 = r53
            r3 = r54
            r4 = r55
            r5 = r56
            r6 = r58
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x05e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt.v(androidx.compose.foundation.layout.PaddingValues, com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit w(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AddPaymentMethodNmi.Action.NicknameChange(str));
        return Unit.f40552a;
    }

    public static final Unit x(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AddPaymentMethodNmi.Action.StreetNameChange(str));
        return Unit.f40552a;
    }

    public static final Unit y(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AddPaymentMethodNmi.Action.StreetNameSecondLineChange(str));
        return Unit.f40552a;
    }

    public static final Unit z(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new AddPaymentMethodNmi.Action.CityChange(str));
        return Unit.f40552a;
    }
}
