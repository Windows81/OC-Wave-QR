package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtSideButtonKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.LazyListExtKt$itemsWithSpacing$2$1;
import com.hansecom.abt.util.LazyListExtKt$itemsWithSpacing$3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class ChoosePaymentMethodScreenKt {
    public static final void A(boolean z2, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(465766907);
        if ((i2 & 6) == 0) {
            i3 = (q2.d(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function0) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(465766907, i3, -1, "com.hansecom.abt.presentation.screens.payment.ItemAdd (ChoosePaymentMethodScreen.kt:202)");
            }
            AbtSideButtonKt.c(function0, SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), z2 ? AbtButtonState.Loading : AbtButtonState.Enabled, StringResources_androidKt.b(R.string.b3, q2, 0), Integer.valueOf(R.drawable.Q), q2, ((i3 >> 3) & 14) | 48, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0621a(z2, function0, i2));
        }
    }

    public static final Unit B(boolean z2, Function0 function0, int i2, Composer composer, int i3) {
        A(z2, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void C(Integer num, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Integer num2 = num;
        int i4 = i2;
        Composer q2 = composer.q(-70376646);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(num2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-70376646, i3, -1, "com.hansecom.abt.presentation.screens.payment.ItemMaxCountReached (ChoosePaymentMethodScreen.kt:217)");
            }
            composer2 = q2;
            TextKt.j(StringResources_androidKt.c(R.string.f3, new Object[]{Integer.valueOf(num2 != null ? num.intValue() : 0)}, q2, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(q2, 6).d(), composer2, 0, 0, 131070);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new C0627g(num2, i4));
        }
    }

    public static final Unit D(Integer num, int i2, Composer composer, int i3) {
        C(num, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod.State r18, kotlin.jvm.functions.Function1 r19, kotlinx.coroutines.flow.Flow r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function1 r22, androidx.compose.runtime.Composer r23, int r24) {
        /*
            r1 = r18
            r2 = r19
            r4 = r21
            r5 = r22
            r6 = r24
            r0 = -1943384764(0xffffffff8c2a4d44, float:-1.3119575E-31)
            r3 = r23
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r7 = r6 & 6
            if (r7 != 0) goto L_0x002b
            r7 = r6 & 8
            if (r7 != 0) goto L_0x0020
            boolean r7 = r3.W(r1)
            goto L_0x0024
        L_0x0020:
            boolean r7 = r3.l(r1)
        L_0x0024:
            if (r7 == 0) goto L_0x0028
            r7 = 4
            goto L_0x0029
        L_0x0028:
            r7 = 2
        L_0x0029:
            r7 = r7 | r6
            goto L_0x002c
        L_0x002b:
            r7 = r6
        L_0x002c:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x003c
            boolean r8 = r3.l(r2)
            if (r8 == 0) goto L_0x0039
            r8 = 32
            goto L_0x003b
        L_0x0039:
            r8 = 16
        L_0x003b:
            r7 = r7 | r8
        L_0x003c:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r14 = r20
            if (r8 != 0) goto L_0x004e
            boolean r8 = r3.l(r14)
            if (r8 == 0) goto L_0x004b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x004d
        L_0x004b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x004d:
            r7 = r7 | r8
        L_0x004e:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x005e
            boolean r8 = r3.l(r4)
            if (r8 == 0) goto L_0x005b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x005d
        L_0x005b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x005d:
            r7 = r7 | r8
        L_0x005e:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x006e
            boolean r8 = r3.l(r5)
            if (r8 == 0) goto L_0x006b
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006d
        L_0x006b:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x006d:
            r7 = r7 | r8
        L_0x006e:
            r8 = r7 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r12) goto L_0x0080
            boolean r8 = r3.t()
            if (r8 != 0) goto L_0x007b
            goto L_0x0080
        L_0x007b:
            r3.B()
            goto L_0x025f
        L_0x0080:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x008c
            r8 = -1
            java.lang.String r12 = "com.hansecom.abt.presentation.screens.payment.ScreenImpl (ChoosePaymentMethodScreen.kt:71)"
            androidx.compose.runtime.ComposerKt.Y(r0, r7, r8, r12)
        L_0x008c:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r12 = r8.o()
            r13 = 0
            androidx.compose.ui.layout.MeasurePolicy r12 = androidx.compose.foundation.layout.BoxKt.g(r12, r13)
            int r15 = androidx.compose.runtime.ComposablesKt.a(r3, r13)
            androidx.compose.runtime.CompositionLocalMap r11 = r3.I()
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.ComposedModifierKt.e(r3, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r9 = r16.a()
            androidx.compose.runtime.Applier r17 = r3.v()
            if (r17 != 0) goto L_0x00b4
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00b4:
            r3.s()
            boolean r17 = r3.n()
            if (r17 == 0) goto L_0x00c1
            r3.y(r9)
            goto L_0x00c4
        L_0x00c1:
            r3.K()
        L_0x00c4:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r3)
            kotlin.jvm.functions.Function2 r13 = r16.c()
            androidx.compose.runtime.Updater.g(r9, r12, r13)
            kotlin.jvm.functions.Function2 r12 = r16.e()
            androidx.compose.runtime.Updater.g(r9, r11, r12)
            kotlin.jvm.functions.Function2 r11 = r16.b()
            boolean r12 = r9.n()
            if (r12 != 0) goto L_0x00ee
            java.lang.Object r12 = r9.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r13)
            if (r12 != 0) goto L_0x00fc
        L_0x00ee:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r9.N(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r9.A(r12, r11)
        L_0x00fc:
            kotlin.jvm.functions.Function2 r11 = r16.d()
            androidx.compose.runtime.Updater.g(r9, r10, r11)
            androidx.compose.foundation.layout.BoxScopeInstance r9 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            boolean r9 = r18.e()
            r10 = 0
            r11 = 1
            if (r9 == 0) goto L_0x019f
            r9 = -1376216743(0xffffffffadf89959, float:-2.8262436E-11)
            r3.X(r9)
            r9 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r0, r9, r11, r10)
            r9 = 240(0xf0, float:3.36E-43)
            float r9 = (float) r9
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r0, r9)
            androidx.compose.ui.Alignment r8 = r8.o()
            r9 = 0
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.BoxKt.g(r8, r9)
            int r12 = androidx.compose.runtime.ComposablesKt.a(r3, r9)
            androidx.compose.runtime.CompositionLocalMap r9 = r3.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r3, r0)
            kotlin.jvm.functions.Function0 r13 = r16.a()
            androidx.compose.runtime.Applier r15 = r3.v()
            if (r15 != 0) goto L_0x0145
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0145:
            r3.s()
            boolean r15 = r3.n()
            if (r15 == 0) goto L_0x0152
            r3.y(r13)
            goto L_0x0155
        L_0x0152:
            r3.K()
        L_0x0155:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r3)
            kotlin.jvm.functions.Function2 r15 = r16.c()
            androidx.compose.runtime.Updater.g(r13, r8, r15)
            kotlin.jvm.functions.Function2 r8 = r16.e()
            androidx.compose.runtime.Updater.g(r13, r9, r8)
            kotlin.jvm.functions.Function2 r8 = r16.b()
            boolean r9 = r13.n()
            if (r9 != 0) goto L_0x017f
            java.lang.Object r9 = r13.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r15)
            if (r9 != 0) goto L_0x018d
        L_0x017f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r13.N(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r13.A(r9, r8)
        L_0x018d:
            kotlin.jvm.functions.Function2 r8 = r16.d()
            androidx.compose.runtime.Updater.g(r13, r0, r8)
            r9 = 0
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r3, r9)
            r3.T()
            r3.M()
            goto L_0x0200
        L_0x019f:
            r9 = 0
            r0 = 1618181667(0x60737e23, float:7.0182E19)
            r3.X(r0)
            r0 = 1618184143(0x607387cf, float:7.019289E19)
            r3.X(r0)
            r0 = r7 & 112(0x70, float:1.57E-43)
            r8 = 32
            if (r0 != r8) goto L_0x01b4
            r8 = r11
            goto L_0x01b5
        L_0x01b4:
            r8 = r9
        L_0x01b5:
            java.lang.Object r12 = r3.g()
            if (r8 != 0) goto L_0x01c3
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r12 != r8) goto L_0x01cb
        L_0x01c3:
            com.hansecom.abt.presentation.screens.payment.h r12 = new com.hansecom.abt.presentation.screens.payment.h
            r12.<init>(r2)
            r3.N(r12)
        L_0x01cb:
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            r3.M()
            r8 = 1618186550(0x60739136, float:7.0203474E19)
            r3.X(r8)
            r8 = 32
            if (r0 != r8) goto L_0x01dc
            r0 = r11
            goto L_0x01dd
        L_0x01dc:
            r0 = r9
        L_0x01dd:
            java.lang.Object r8 = r3.g()
            if (r0 != 0) goto L_0x01eb
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r8 != r0) goto L_0x01f3
        L_0x01eb:
            com.hansecom.abt.presentation.screens.payment.i r8 = new com.hansecom.abt.presentation.screens.payment.i
            r8.<init>(r2)
            r3.N(r8)
        L_0x01f3:
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r3.M()
            r0 = r7 & 14
            r(r1, r12, r8, r3, r0)
            r3.M()
        L_0x0200:
            r3.T()
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r3.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            r8 = -1815289721(0xffffffff93cce087, float:-5.171824E-27)
            r3.X(r8)
            boolean r8 = r3.l(r0)
            r12 = r7 & 7168(0x1c00, float:1.0045E-41)
            r13 = 2048(0x800, float:2.87E-42)
            if (r12 != r13) goto L_0x021f
            r12 = r11
            goto L_0x0220
        L_0x021f:
            r12 = r9
        L_0x0220:
            r8 = r8 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r7
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r13) goto L_0x022b
            r13 = r11
            goto L_0x022c
        L_0x022b:
            r13 = r9
        L_0x022c:
            r8 = r8 | r13
            java.lang.Object r9 = r3.g()
            if (r8 != 0) goto L_0x023b
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0243
        L_0x023b:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$ScreenImpl$2$1 r9 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$ScreenImpl$2$1
            r9.<init>(r0, r4, r5, r10)
            r3.N(r9)
        L_0x0243:
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r3.M()
            int r0 = r7 >> 6
            r12 = r0 & 14
            r13 = 6
            r8 = 0
            r9 = 0
            r7 = r20
            r11 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x025f
            androidx.compose.runtime.ComposerKt.X()
        L_0x025f:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.x()
            if (r7 == 0) goto L_0x027a
            com.hansecom.abt.presentation.screens.payment.j r8 = new com.hansecom.abt.presentation.screens.payment.j
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x027a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt.E(com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit F(ChoosePaymentMethod.State state, Function1 function1, Flow flow, Function0 function0, Function1 function12, int i2, Composer composer, int i3) {
        E(state, function1, flow, function0, function12, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit G(Function1 function1) {
        function1.invoke(ChoosePaymentMethod.Action.AddPaymentMethod.f37737a);
        return Unit.f40552a;
    }

    public static final Unit H(Function1 function1, PaymentMethodState paymentMethodState) {
        Intrinsics.i(paymentMethodState, "it");
        function1.invoke(new ChoosePaymentMethod.Action.C0009ChoosePaymentMethod(paymentMethodState));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if ((r15 & 1) != 0) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0153  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function1 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            java.lang.String r0 = "navigateAddPaymentMethod"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onChoosePaymentMethodCard"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 652738912(0x26e80160, float:1.6098607E-15)
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
            goto L_0x0158
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
            java.lang.Class<com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel> r1 = com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.S()
            r13.S()
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel r10 = (com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreen (ChoosePaymentMethodScreen.kt:48)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00db:
            r0 = 6
            int r7 = r9 << 6
            r5 = r7 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r13
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            kotlin.Unit r2 = kotlin.Unit.f40552a
            r3 = -1315253096(0xffffffffb19ad498, float:-4.506159E-9)
            r13.X(r3)
            boolean r3 = r13.l(r10)
            java.lang.Object r4 = r13.g()
            if (r3 != 0) goto L_0x0103
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x010c
        L_0x0103:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$ChoosePaymentMethodScreen$1$1 r4 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$ChoosePaymentMethodScreen$1$1
            r3 = 0
            r4.<init>(r10, r3)
            r13.N(r4)
        L_0x010c:
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r13.M()
            androidx.compose.runtime.EffectsKt.g(r2, r4, r13, r0)
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$State r1 = p(r1)
            r0 = -1315249332(0xffffffffb19ae34c, float:-4.5078306E-9)
            r13.X(r0)
            boolean r0 = r13.l(r10)
            java.lang.Object r2 = r13.g()
            if (r0 != 0) goto L_0x0130
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0138
        L_0x0130:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$ChoosePaymentMethodScreen$2$1 r2 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$ChoosePaymentMethodScreen$2$1
            r2.<init>(r10)
            r13.N(r2)
        L_0x0138:
            kotlin.reflect.KFunction r2 = (kotlin.reflect.KFunction) r2
            r13.M()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r10.l()
            r0 = 64512(0xfc00, float:9.04E-41)
            r7 = r7 & r0
            r4 = r11
            r5 = r12
            r6 = r13
            E(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0065
        L_0x0158:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.x()
            if (r10 == 0) goto L_0x016b
            com.hansecom.abt.presentation.screens.payment.f r13 = new com.hansecom.abt.presentation.screens.payment.f
            r1 = r13
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r10.a(r13)
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt.o(com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ChoosePaymentMethod.State p(State state) {
        return (ChoosePaymentMethod.State) state.getValue();
    }

    public static final Unit q(ChoosePaymentMethodViewModel choosePaymentMethodViewModel, Function0 function0, Function1 function1, int i2, int i3, Composer composer, int i4) {
        o(choosePaymentMethodViewModel, function0, function1, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod.State r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function1 r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = -1609731206(0xffffffffa00d737a, float:-1.1981373E-19)
            r5 = r21
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r3 & 6
            r6 = 4
            if (r5 != 0) goto L_0x002a
            r5 = r3 & 8
            if (r5 != 0) goto L_0x001f
            boolean r5 = r15.W(r0)
            goto L_0x0023
        L_0x001f:
            boolean r5 = r15.l(r0)
        L_0x0023:
            if (r5 == 0) goto L_0x0027
            r5 = r6
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r3
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            r7 = r3 & 48
            r8 = 32
            if (r7 != 0) goto L_0x003c
            boolean r7 = r15.l(r1)
            if (r7 == 0) goto L_0x0039
            r7 = r8
            goto L_0x003b
        L_0x0039:
            r7 = 16
        L_0x003b:
            r5 = r5 | r7
        L_0x003c:
            r7 = r3 & 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x004d
            boolean r7 = r15.l(r2)
            if (r7 == 0) goto L_0x004a
            r7 = r9
            goto L_0x004c
        L_0x004a:
            r7 = 128(0x80, float:1.794E-43)
        L_0x004c:
            r5 = r5 | r7
        L_0x004d:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r7 != r10) goto L_0x0060
            boolean r7 = r15.t()
            if (r7 != 0) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            r15.B()
            r4 = r15
            goto L_0x00cb
        L_0x0060:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x006c
            r7 = -1
            java.lang.String r10 = "com.hansecom.abt.presentation.screens.payment.Content (ChoosePaymentMethodScreen.kt:107)"
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r7, r10)
        L_0x006c:
            r4 = -2048350065(0xffffffff85e8a88f, float:-2.1879094E-35)
            r15.X(r4)
            r4 = r5 & 14
            r7 = 1
            r10 = 0
            if (r4 == r6) goto L_0x0085
            r4 = r5 & 8
            if (r4 == 0) goto L_0x0083
            boolean r4 = r15.l(r0)
            if (r4 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r4 = r10
            goto L_0x0086
        L_0x0085:
            r4 = r7
        L_0x0086:
            r6 = r5 & 896(0x380, float:1.256E-42)
            if (r6 != r9) goto L_0x008c
            r6 = r7
            goto L_0x008d
        L_0x008c:
            r6 = r10
        L_0x008d:
            r4 = r4 | r6
            r5 = r5 & 112(0x70, float:1.57E-43)
            if (r5 != r8) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r7 = r10
        L_0x0094:
            r4 = r4 | r7
            java.lang.Object r5 = r15.g()
            if (r4 != 0) goto L_0x00a3
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00ab
        L_0x00a3:
            com.hansecom.abt.presentation.screens.payment.k r5 = new com.hansecom.abt.presentation.screens.payment.k
            r5.<init>(r0, r2, r1)
            r15.N(r5)
        L_0x00ab:
            r14 = r5
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r15.M()
            r16 = 0
            r17 = 511(0x1ff, float:7.16E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r4 = r15
            androidx.compose.foundation.lazy.LazyDslKt.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x00cb
            androidx.compose.runtime.ComposerKt.X()
        L_0x00cb:
            androidx.compose.runtime.ScopeUpdateScope r4 = r4.x()
            if (r4 == 0) goto L_0x00d9
            com.hansecom.abt.presentation.screens.payment.l r5 = new com.hansecom.abt.presentation.screens.payment.l
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt.r(com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod$State, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit s(ChoosePaymentMethod.State state, Function1 function1, Function0 function0, LazyListScope lazyListScope) {
        ChoosePaymentMethod.State state2 = state;
        Function1 function12 = function1;
        LazyListScope lazyListScope2 = lazyListScope;
        Intrinsics.i(lazyListScope2, "$this$LazyColumn");
        if (!state.d().isEmpty()) {
            ComposableSingletons$ChoosePaymentMethodScreenKt composableSingletons$ChoosePaymentMethodScreenKt = ComposableSingletons$ChoosePaymentMethodScreenKt.f37784a;
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, composableSingletons$ChoosePaymentMethodScreenKt.a(), 3, (Object) null);
            ImmutableList d2 = state.d();
            float m2 = Dp.m((float) 4);
            lazyListScope2.d(d2.size(), new LazyListExtKt$itemsWithSpacing$2$1(new C0633m(), d2), new LazyListExtKt$itemsWithSpacing$3(new n(), d2), ComposableLambdaKt.c(-1395388335, true, new ChoosePaymentMethodScreenKt$Content$lambda$25$lambda$24$$inlined$itemsWithSpacing6a0pyJM$1(d2, m2, function1)));
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, composableSingletons$ChoosePaymentMethodScreenKt.b(), 3, (Object) null);
        }
        ComposableSingletons$ChoosePaymentMethodScreenKt composableSingletons$ChoosePaymentMethodScreenKt2 = ComposableSingletons$ChoosePaymentMethodScreenKt.f37784a;
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, composableSingletons$ChoosePaymentMethodScreenKt2.c(), 3, (Object) null);
        ImmutableList c2 = state.c();
        float f2 = (float) 4;
        float m3 = Dp.m(f2);
        lazyListScope2.d(c2.size(), new LazyListExtKt$itemsWithSpacing$2$1(new C0622b(), c2), new LazyListExtKt$itemsWithSpacing$3(new C0623c(), c2), ComposableLambdaKt.c(-1395388335, true, new ChoosePaymentMethodScreenKt$Content$lambda$25$lambda$24$$inlined$itemsWithSpacing6a0pyJM$2(c2, m3, function1)));
        if (state.h()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.c(-1099716685, true, new ChoosePaymentMethodScreenKt$Content$1$1$7(state)), 3, (Object) null);
        } else {
            Function0 function02 = function0;
            lazyListScope2.a("add", ContentType.ADD, ComposableLambdaKt.c(-43133750, true, new ChoosePaymentMethodScreenKt$Content$1$1$8(state, function0)));
        }
        if (!state.i().isEmpty()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, composableSingletons$ChoosePaymentMethodScreenKt2.d(), 3, (Object) null);
            ImmutableList i2 = state.i();
            float m4 = Dp.m(f2);
            lazyListScope2.d(i2.size(), new LazyListExtKt$itemsWithSpacing$2$1(new C0624d(), i2), new LazyListExtKt$itemsWithSpacing$3(new C0625e(), i2), ComposableLambdaKt.c(-1395388335, true, new ChoosePaymentMethodScreenKt$Content$lambda$25$lambda$24$$inlined$itemsWithSpacing6a0pyJM$3(i2, m4, function1)));
        }
        return Unit.f40552a;
    }

    public static final Object t(PaymentMethodState.FareMedia fareMedia) {
        Intrinsics.i(fareMedia, "it");
        return fareMedia.m();
    }

    public static final Object u(PaymentMethodState.FareMedia fareMedia) {
        Intrinsics.i(fareMedia, "it");
        return ContentType.PAYMENT_METHOD;
    }

    public static final Object v(PaymentMethodState.CreditCard creditCard) {
        Intrinsics.i(creditCard, "it");
        return Long.valueOf(creditCard.c());
    }

    public static final Object w(PaymentMethodState.CreditCard creditCard) {
        Intrinsics.i(creditCard, "it");
        return ContentType.PAYMENT_METHOD;
    }

    public static final Object x(PaymentMethodState paymentMethodState) {
        Intrinsics.i(paymentMethodState, "it");
        String simpleName = paymentMethodState.getClass().getSimpleName();
        Intrinsics.h(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public static final Object y(PaymentMethodState paymentMethodState) {
        Intrinsics.i(paymentMethodState, "it");
        return ContentType.PAYMENT_METHOD;
    }

    public static final Unit z(ChoosePaymentMethod.State state, Function0 function0, Function1 function1, int i2, Composer composer, int i3) {
        r(state, function0, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
