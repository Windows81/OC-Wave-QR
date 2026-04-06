package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import com.hansecom.abt.ui.components.dialog.AbtDialogKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class PassCheckoutScreenKt {
    public static final Unit A(PassCheckout.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3, Composer composer, int i4) {
        y(state, function1, flow, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void B(PassCheckout.State state, Composer composer, int i2) {
        int i3;
        String a2;
        Composer q2 = composer.q(-342807401);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(state) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-342807401, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.TotalsSection (PassCheckoutScreen.kt:273)");
            }
            w(StringResourceKt.a(R.string.T2, new Object[0], q2, 0), state.p(), (TextStyle) null, 0, 0, q2, 0, 28);
            q2.X(567684973);
            if (state.r() && state.e() != null) {
                SpacerKt.a(SizeKt.i(Modifier.f15489d, Dp.m((float) 8)), q2, 6);
                if (state.f() != null) {
                    q2.X(418537031);
                    a2 = StringResourceKt.a(R.string.L2, new Object[]{state.f(), state.d()}, q2, 0);
                    q2.M();
                } else {
                    q2.X(418743739);
                    a2 = StringResourceKt.a(R.string.K2, new Object[]{state.d()}, q2, 0);
                    q2.M();
                }
                String str = a2;
                BigDecimal negate = state.e().negate();
                Intrinsics.h(negate, "negate(...)");
                w(str, negate, (TextStyle) null, 0, AbtTheme.f38851a.b(q2, 6).v(), q2, 0, 12);
            }
            q2.M();
            SpacerKt.a(SizeKt.i(Modifier.f15489d, Dp.m((float) 16)), q2, 6);
            w(StringResourceKt.a(R.string.V2, new Object[0], q2, 0), state.q(), AbtTheme.f38851a.d(q2, 6).a(), 0, 0, q2, 0, 24);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0583a(state, i2));
        }
    }

    public static final Unit C(PassCheckout.State state, int i2, Composer composer, int i3) {
        B(state, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State r32, kotlin.jvm.functions.Function1 r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            r0 = r32
            r1 = r33
            r2 = r35
            r3 = 893071969(0x353b3261, float:6.973624E-7)
            r4 = r34
            androidx.compose.runtime.Composer r14 = r4.q(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x001e
            boolean r4 = r14.l(r0)
            if (r4 == 0) goto L_0x001b
            r4 = 4
            goto L_0x001c
        L_0x001b:
            r4 = 2
        L_0x001c:
            r4 = r4 | r2
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            r5 = r2 & 48
            r15 = 16
            r13 = 32
            if (r5 != 0) goto L_0x0031
            boolean r5 = r14.l(r1)
            if (r5 == 0) goto L_0x002f
            r5 = r13
            goto L_0x0030
        L_0x002f:
            r5 = r15
        L_0x0030:
            r4 = r4 | r5
        L_0x0031:
            r12 = r4
            r4 = r12 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0045
            boolean r4 = r14.t()
            if (r4 != 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            r14.B()
            r4 = r14
            goto L_0x01ff
        L_0x0045:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0051
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.CouponSection (PassCheckoutScreen.kt:235)"
            androidx.compose.runtime.ComposerKt.Y(r3, r12, r4, r5)
        L_0x0051:
            boolean r3 = r32.r()
            if (r3 == 0) goto L_0x01f5
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r3 = r14.C(r3)
            androidx.compose.ui.focus.FocusManager r3 = (androidx.compose.ui.focus.FocusManager) r3
            int r4 = com.hansecom.abt.R.string.r3
            r11 = 0
            java.lang.Object[] r5 = new java.lang.Object[r11]
            java.lang.String r4 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r4, r5, r14, r11)
            com.hansecom.abt.ui.theme.AbtTheme r5 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r9 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r5 = r5.d(r14, r9)
            androidx.compose.ui.text.TextStyle r25 = r5.a()
            r28 = 0
            r29 = 131070(0x1fffe, float:1.83668E-40)
            r5 = 0
            r6 = 0
            r8 = 0
            r16 = 0
            r9 = r16
            r16 = 0
            r11 = r16
            r31 = r12
            r12 = r16
            r13 = r16
            r16 = 0
            r34 = r14
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r26 = r34
            androidx.compose.material3.TextKt.j(r4, r5, r6, r8, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.ui.Modifier$Companion r15 = androidx.compose.ui.Modifier.f15489d
            r4 = 8
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.i(r15, r4)
            r14 = r34
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r4, r14, r13)
            java.lang.String r4 = r32.d()
            com.hansecom.abt.ui.UiResult r5 = r32.g()
            com.hansecom.abt.util.resourcesResolvers.StringValue r5 = r5.a()
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r12 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.c(r5, r7, r14, r6)
            com.hansecom.abt.ui.UiResult r5 = r32.g()
            boolean r7 = r5.c()
            int r5 = com.hansecom.abt.R.string.q3
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r11 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r8, r14, r6)
            int r5 = com.hansecom.abt.R.string.p3
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r5, r8, r14, r6)
            com.hansecom.abt.ui.UiResult r8 = r32.g()
            boolean r8 = r8.b()
            com.hansecom.abt.ui.UiResult r9 = r32.g()
            boolean r9 = r9.c()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r16 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.a(r9, r8)
            r8 = -2056362796(0xffffffff856e64d4, float:-1.12092254E-35)
            r14.X(r8)
            r8 = r31 & 112(0x70, float:1.57E-43)
            r10 = 32
            if (r8 != r10) goto L_0x0112
            r17 = 1
            goto L_0x0114
        L_0x0112:
            r17 = r6
        L_0x0114:
            java.lang.Object r6 = r14.g()
            if (r17 != 0) goto L_0x0122
            androidx.compose.runtime.Composer$Companion r17 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r17.a()
            if (r6 != r9) goto L_0x012a
        L_0x0122:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.f r6 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.f
            r6.<init>(r1)
            r14.N(r6)
        L_0x012a:
            r18 = r6
            kotlin.jvm.functions.Function1 r18 = (kotlin.jvm.functions.Function1) r18
            r14.M()
            androidx.compose.foundation.text.KeyboardActions r26 = new androidx.compose.foundation.text.KeyboardActions
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 62
            r25 = 0
            r17 = r26
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r6 = -2056357477(0xffffffff856e799b, float:-1.12130416E-35)
            r14.X(r6)
            if (r8 != r10) goto L_0x0150
            r6 = 1
            goto L_0x0151
        L_0x0150:
            r6 = 0
        L_0x0151:
            java.lang.Object r9 = r14.g()
            if (r6 != 0) goto L_0x015f
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x0167
        L_0x015f:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.g r9 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.g
            r9.<init>(r1)
            r14.N(r9)
        L_0x0167:
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r14.M()
            r6 = -2056355524(0xffffffff856e813c, float:-1.1214443E-35)
            r14.X(r6)
            boolean r6 = r14.l(r3)
            if (r8 != r10) goto L_0x017b
            r17 = 1
            goto L_0x017d
        L_0x017b:
            r17 = 0
        L_0x017d:
            r6 = r6 | r17
            java.lang.Object r13 = r14.g()
            if (r6 != 0) goto L_0x018d
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r13 != r6) goto L_0x0195
        L_0x018d:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.h r13 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.h
            r13.<init>(r3, r1)
            r14.N(r13)
        L_0x0195:
            r3 = r13
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r14.M()
            r6 = -2056351598(0xffffffff856e9092, float:-1.12172596E-35)
            r14.X(r6)
            if (r8 != r10) goto L_0x01a6
            r30 = 1
            goto L_0x01a8
        L_0x01a6:
            r30 = 0
        L_0x01a8:
            java.lang.Object r6 = r14.g()
            if (r30 != 0) goto L_0x01b6
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r6 != r8) goto L_0x01be
        L_0x01b6:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.i r6 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.i
            r6.<init>(r1)
            r14.N(r6)
        L_0x01be:
            r10 = r6
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r14.M()
            r18 = 0
            r19 = 1088(0x440, float:1.525E-42)
            r13 = 0
            r17 = 0
            r20 = 0
            r6 = r7
            r7 = r9
            r8 = r3
            r9 = r10
            r10 = r13
            r3 = 6
            r13 = r16
            r34 = r14
            r14 = r17
            r3 = r15
            r15 = r26
            r16 = r34
            r17 = r20
            com.hansecom.abt.ui.components.coupon.CouponFieldKt.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4 = 16
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.i(r3, r4)
            r4 = r34
            r5 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r3, r4, r5)
            goto L_0x01f6
        L_0x01f5:
            r4 = r14
        L_0x01f6:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01ff
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ff:
            androidx.compose.runtime.ScopeUpdateScope r3 = r4.x()
            if (r3 == 0) goto L_0x020d
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.j r4 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.j
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt.l(com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit m(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new PassCheckout.Action.CouponChange(str));
        return Unit.f40552a;
    }

    public static final Unit n(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(PassCheckout.Action.CouponApply.f37087a);
        return Unit.f40552a;
    }

    public static final Unit o(Function1 function1) {
        function1.invoke(PassCheckout.Action.CouponReset.f37089a);
        return Unit.f40552a;
    }

    public static final Unit p(PassCheckout.State state, Function1 function1, int i2, Composer composer, int i3) {
        l(state, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit q(Function1 function1, KeyboardActionScope keyboardActionScope) {
        Intrinsics.i(keyboardActionScope, "$this$KeyboardActions");
        keyboardActionScope.a(ImeAction.f18821b.b());
        function1.invoke(PassCheckout.Action.CouponApply.f37087a);
        return Unit.f40552a;
    }

    public static final void r(boolean z2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        boolean z3 = z2;
        Composer q2 = composer.q(-1016492750);
        if ((i2 & 6) == 0) {
            i3 = i2 | (q2.d(z3) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1016492750, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.LoadingDialog (PassCheckoutScreen.kt:333)");
            }
            composer2 = q2;
            AbtDialogKt.e(StringResourceKt.a(R.string.O2, new Object[0], q2, 0), StringResourceKt.a(R.string.P2, new Object[0], q2, 0), (String) null, z2, ComposableSingletons$PassCheckoutScreenKt.f37074a.a(), (Function2) null, (AbtButtonState) null, (String) null, (Integer) null, (AbtButtonStyle) null, (Function0) null, (AbtButtonState) null, (String) null, (Function0) null, (AbtButtonStyle) null, (Function0) null, false, composer2, ((i3 << 9) & 7168) | 24576, 196608, 98276);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new C0584b(z2, i2));
        }
    }

    public static final Unit s(boolean z2, int i2, Composer composer, int i3) {
        r(z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if ((r14 & 1) != 0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel r10, kotlin.jvm.functions.Function0 r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "onCheckoutCompleted"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = 1693856390(0x64f63286, float:3.6332317E22)
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
            goto L_0x010c
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel> r1 = com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel r10 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreen (PassCheckoutScreen.kt:70)"
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
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State r1 = u(r1)
            r2 = 954104699(0x38de7b7b, float:1.0608785E-4)
            r12.X(r2)
            boolean r2 = r12.l(r10)
            java.lang.Object r3 = r12.g()
            if (r2 != 0) goto L_0x00e7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00ef
        L_0x00e7:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt$PassCheckoutScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt$PassCheckoutScreen$1$1
            r3.<init>(r10)
            r12.N(r3)
        L_0x00ef:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r12.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r10.l()
            r6 = r0 & 7168(0x1c00, float:1.0045E-41)
            r7 = 0
            r4 = r11
            r5 = r12
            y(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010c
            androidx.compose.runtime.ComposerKt.X()
        L_0x010c:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x011a
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.e r0 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.e
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt.t(com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final PassCheckout.State u(State state) {
        return (PassCheckout.State) state.getValue();
    }

    public static final Unit v(PassCheckoutViewModel passCheckoutViewModel, Function0 function0, int i2, int i3, Composer composer, int i4) {
        t(passCheckoutViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ca, code lost:
        if ((r74 & 16) != 0) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(java.lang.String r65, java.lang.Number r66, androidx.compose.ui.text.TextStyle r67, long r68, long r70, androidx.compose.runtime.Composer r72, int r73, int r74) {
        /*
            r2 = r66
            r8 = r73
            r0 = 1998356604(0x771c807c, float:3.1742355E33)
            r1 = r72
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r74 & 1
            if (r3 == 0) goto L_0x0017
            r3 = r8 | 6
            r5 = r3
            r3 = r65
            goto L_0x002b
        L_0x0017:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r65
            boolean r5 = r1.W(r3)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r8
            goto L_0x002b
        L_0x0028:
            r3 = r65
            r5 = r8
        L_0x002b:
            r6 = r74 & 2
            r7 = 16
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
            goto L_0x0043
        L_0x0034:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x0043
            boolean r6 = r1.l(r2)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0042
        L_0x0041:
            r6 = r7
        L_0x0042:
            r5 = r5 | r6
        L_0x0043:
            r6 = r8 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005c
            r6 = r74 & 4
            if (r6 != 0) goto L_0x0056
            r6 = r67
            boolean r9 = r1.W(r6)
            if (r9 == 0) goto L_0x0058
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0056:
            r6 = r67
        L_0x0058:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r5 = r5 | r9
            goto L_0x005e
        L_0x005c:
            r6 = r67
        L_0x005e:
            r9 = r8 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0077
            r9 = r74 & 8
            if (r9 != 0) goto L_0x0071
            r9 = r68
            boolean r11 = r1.j(r9)
            if (r11 == 0) goto L_0x0073
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0071:
            r9 = r68
        L_0x0073:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r5 = r5 | r11
            goto L_0x0079
        L_0x0077:
            r9 = r68
        L_0x0079:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0092
            r11 = r74 & 16
            if (r11 != 0) goto L_0x008c
            r11 = r70
            boolean r13 = r1.j(r11)
            if (r13 == 0) goto L_0x008e
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008c:
            r11 = r70
        L_0x008e:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r5 = r5 | r13
            goto L_0x0094
        L_0x0092:
            r11 = r70
        L_0x0094:
            r13 = r5 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00a7
            boolean r13 = r1.t()
            if (r13 != 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            r1.B()
            r4 = r9
            goto L_0x023d
        L_0x00a7:
            r1.p()
            r13 = r8 & 1
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 6
            if (r13 == 0) goto L_0x00d2
            boolean r13 = r1.J()
            if (r13 == 0) goto L_0x00b9
            goto L_0x00d2
        L_0x00b9:
            r1.B()
            r13 = r74 & 4
            if (r13 == 0) goto L_0x00c2
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c2:
            r13 = r74 & 8
            if (r13 == 0) goto L_0x00c8
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00c8:
            r13 = r74 & 16
            if (r13 == 0) goto L_0x00cd
        L_0x00cc:
            r5 = r5 & r14
        L_0x00cd:
            r61 = r9
            r63 = r11
            goto L_0x0101
        L_0x00d2:
            r13 = r74 & 4
            if (r13 == 0) goto L_0x00e2
            com.hansecom.abt.ui.theme.AbtTheme r6 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r6 = r6.d(r1, r15)
            androidx.compose.ui.text.TextStyle r6 = r6.b()
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e2:
            r13 = r74 & 8
            if (r13 == 0) goto L_0x00f2
            com.hansecom.abt.ui.theme.AbtTheme r9 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r9 = r9.b(r1, r15)
            long r9 = r9.q()
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00f2:
            r13 = r74 & 16
            if (r13 == 0) goto L_0x00cd
            com.hansecom.abt.ui.theme.AbtTheme r11 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r11 = r11.b(r1, r15)
            long r11 = r11.q()
            goto L_0x00cc
        L_0x0101:
            r1.U()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0110
            r9 = -1
            java.lang.String r10 = "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.RowWithAmount (PassCheckoutScreen.kt:315)"
            androidx.compose.runtime.ComposerKt.Y(r0, r5, r9, r10)
        L_0x0110:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r9 = 0
            r10 = 1
            r11 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.SizeKt.h(r0, r9, r10, r11)
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r10 = r10.f()
            androidx.compose.ui.Alignment$Companion r12 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r12 = r12.l()
            r14 = 0
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.RowKt.b(r10, r12, r1, r14)
            int r12 = androidx.compose.runtime.ComposablesKt.a(r1, r14)
            androidx.compose.runtime.CompositionLocalMap r13 = r1.I()
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.ComposedModifierKt.e(r1, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r11 = r16.a()
            androidx.compose.runtime.Applier r17 = r1.v()
            if (r17 != 0) goto L_0x0145
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0145:
            r1.s()
            boolean r17 = r1.n()
            if (r17 == 0) goto L_0x0152
            r1.y(r11)
            goto L_0x0155
        L_0x0152:
            r1.K()
        L_0x0155:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r1)
            kotlin.jvm.functions.Function2 r14 = r16.c()
            androidx.compose.runtime.Updater.g(r11, r10, r14)
            kotlin.jvm.functions.Function2 r10 = r16.e()
            androidx.compose.runtime.Updater.g(r11, r13, r10)
            kotlin.jvm.functions.Function2 r10 = r16.b()
            boolean r13 = r11.n()
            if (r13 != 0) goto L_0x017f
            java.lang.Object r13 = r11.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r13, r14)
            if (r13 != 0) goto L_0x018d
        L_0x017f:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r11.N(r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.A(r12, r10)
        L_0x018d:
            kotlin.jvm.functions.Function2 r10 = r16.d()
            androidx.compose.runtime.Updater.g(r11, r9, r10)
            androidx.compose.foundation.layout.RowScopeInstance r9 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            r10 = 2
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r67 = r9
            r68 = r0
            r69 = r12
            r70 = r13
            r71 = r10
            r72 = r11
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.RowScope.c(r67, r68, r69, r70, r71, r72)
            r9 = r5 & 14
            int r11 = r5 >> 3
            r11 = r11 & 896(0x380, float:1.256E-42)
            r32 = r9 | r11
            int r9 = r5 << 15
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r33 = r9 & r11
            r59 = r33
            r34 = 131064(0x1fff8, float:1.8366E-40)
            r13 = 0
            r11 = 0
            r9 = r15
            r14 = r11
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r11 = r9
            r9 = r65
            r4 = r11
            r11 = r61
            r30 = r6
            r31 = r1
            androidx.compose.material3.TextKt.j(r9, r10, r11, r13, r14, r16, r17, r18, r19, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            float r7 = (float) r7
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.y(r0, r7)
            androidx.compose.foundation.layout.SpacerKt.a(r0, r1, r4)
            com.hansecom.abt.util.formatters.CurrencyValueFormater r0 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            r7 = 2
            r9 = 0
            r10 = 0
            java.lang.String r35 = com.hansecom.abt.util.formatters.CurrencyValueFormater.c(r0, r2, r10, r7, r9)
            int r0 = r5 >> 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r58 = r0
            r60 = 131066(0x1fffa, float:1.83663E-40)
            r36 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r37 = r63
            r56 = r6
            r57 = r1
            androidx.compose.material3.TextKt.j(r35, r36, r37, r39, r40, r42, r43, r44, r45, r47, r48, r49, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0239
            androidx.compose.runtime.ComposerKt.X()
        L_0x0239:
            r4 = r61
            r11 = r63
        L_0x023d:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0256
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.k r13 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.k
            r0 = r13
            r1 = r65
            r2 = r66
            r3 = r6
            r6 = r11
            r8 = r73
            r9 = r74
            r0.<init>(r1, r2, r3, r4, r6, r8, r9)
            r10.a(r13)
        L_0x0256:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt.w(java.lang.String, java.lang.Number, androidx.compose.ui.text.TextStyle, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit x(String str, Number number, TextStyle textStyle, long j2, long j3, int i2, int i3, Composer composer, int i4) {
        w(str, number, textStyle, j2, j3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt$ScreenImpl$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt$ScreenImpl$2$1} */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009b, code lost:
        if ((r25 & 4) != 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0177, code lost:
        if (r7 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0179;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void y(com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout.State r19, kotlin.jvm.functions.Function1 r20, kotlinx.coroutines.flow.Flow r21, kotlin.jvm.functions.Function0 r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r1 = r19
            r2 = r20
            r5 = r24
            r0 = -1858308430(0xffffffff913c76b2, float:-1.4867161E-28)
            r3 = r23
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r4 = r25 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r5 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r5 & 6
            if (r4 != 0) goto L_0x0025
            boolean r4 = r3.l(r1)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r5
            goto L_0x0026
        L_0x0025:
            r4 = r5
        L_0x0026:
            r6 = r25 & 2
            r15 = 32
            if (r6 == 0) goto L_0x002f
            r4 = r4 | 48
            goto L_0x003e
        L_0x002f:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x003e
            boolean r6 = r3.l(r2)
            if (r6 == 0) goto L_0x003b
            r6 = r15
            goto L_0x003d
        L_0x003b:
            r6 = 16
        L_0x003d:
            r4 = r4 | r6
        L_0x003e:
            r6 = r5 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0057
            r6 = r25 & 4
            if (r6 != 0) goto L_0x0051
            r6 = r21
            boolean r7 = r3.l(r6)
            if (r7 == 0) goto L_0x0053
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0051:
            r6 = r21
        L_0x0053:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r4 = r4 | r7
            goto L_0x0059
        L_0x0057:
            r6 = r21
        L_0x0059:
            r7 = r25 & 8
            r14 = 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0064
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r13 = r22
            goto L_0x0075
        L_0x0064:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            r13 = r22
            if (r7 != 0) goto L_0x0075
            boolean r7 = r3.l(r13)
            if (r7 == 0) goto L_0x0072
            r7 = r14
            goto L_0x0074
        L_0x0072:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r4 = r4 | r7
        L_0x0075:
            r7 = r4 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x0088
            boolean r7 = r3.t()
            if (r7 != 0) goto L_0x0082
            goto L_0x0088
        L_0x0082:
            r3.B()
            r4 = r6
            goto L_0x01a0
        L_0x0088:
            r3.p()
            r7 = r5 & 1
            if (r7 == 0) goto L_0x00a2
            boolean r7 = r3.J()
            if (r7 == 0) goto L_0x0096
            goto L_0x00a2
        L_0x0096:
            r3.B()
            r7 = r25 & 4
            if (r7 == 0) goto L_0x009f
        L_0x009d:
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x009f:
            r12 = r4
            r4 = r6
            goto L_0x00ab
        L_0x00a2:
            r7 = r25 & 4
            if (r7 == 0) goto L_0x009f
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.A()
            goto L_0x009d
        L_0x00ab:
            r3.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x00ba
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.ScreenImpl (PassCheckoutScreen.kt:87)"
            androidx.compose.runtime.ComposerKt.Y(r0, r12, r6, r7)
        L_0x00ba:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r6 = "PassCheckoutScreen"
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.platform.TestTagKt.a(r0, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt$ScreenImpl$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt$ScreenImpl$1
            r0.<init>(r1, r2)
            r7 = 54
            r8 = 894069875(0x354a6c73, float:7.540868E-7)
            r11 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r11, r0, r3, r7)
            r16 = 3078(0xc06, float:4.313E-42)
            r17 = 6
            r7 = 0
            r9 = 0
            r18 = r11
            r11 = r0
            r0 = r12
            r12 = r3
            r13 = r16
            r14 = r17
            com.hansecom.abt.ui.components.ScreenContentKt.d(r6, r7, r9, r11, r12, r13, r14)
            boolean r6 = r19.o()
            r11 = 0
            r(r6, r3, r11)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.activity.compose.LocalActivityKt.a()
            java.lang.Object r6 = r3.C(r6)
            android.app.Activity r6 = (android.app.Activity) r6
            r7 = -235513057(0xfffffffff1f65b1f, float:-2.439791E30)
            r3.X(r7)
            if (r6 != 0) goto L_0x0102
            r6 = 0
        L_0x0100:
            r12 = r6
            goto L_0x0135
        L_0x0102:
            com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult r6 = new com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult
            r6.<init>()
            r7 = -626538534(0xffffffffdaa7c7da, float:-2.36130301E16)
            r3.X(r7)
            r7 = r0 & 112(0x70, float:1.57E-43)
            if (r7 != r15) goto L_0x0114
            r7 = r18
            goto L_0x0115
        L_0x0114:
            r7 = r11
        L_0x0115:
            java.lang.Object r8 = r3.g()
            if (r7 != 0) goto L_0x0123
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x012b
        L_0x0123:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.c r8 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.c
            r8.<init>(r2)
            r3.N(r8)
        L_0x012b:
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r3.M()
            androidx.activity.compose.ManagedActivityResultLauncher r6 = androidx.activity.compose.ActivityResultRegistryKt.a(r6, r8, r3, r11)
            goto L_0x0100
        L_0x0135:
            r3.M()
            androidx.compose.runtime.ProvidableCompositionLocal r6 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r6 = r3.C(r6)
            r9 = r6
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r9 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r9
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r3.C(r6)
            r10 = r6
            android.content.Context r10 = (android.content.Context) r10
            r6 = -235501302(0xfffffffff1f6890a, float:-2.4415674E30)
            r3.X(r6)
            boolean r6 = r3.l(r9)
            boolean r7 = r3.l(r10)
            r6 = r6 | r7
            r7 = r0 & 7168(0x1c00, float:1.0045E-41)
            r8 = 2048(0x800, float:2.87E-42)
            if (r7 != r8) goto L_0x0165
            r11 = r18
        L_0x0165:
            r6 = r6 | r11
            boolean r7 = r3.l(r12)
            r6 = r6 | r7
            java.lang.Object r7 = r3.g()
            if (r6 != 0) goto L_0x0179
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0185
        L_0x0179:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt$ScreenImpl$2$1 r7 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt$ScreenImpl$2$1
            r13 = 0
            r8 = r7
            r11 = r22
            r8.<init>(r9, r10, r11, r12, r13)
            r3.N(r7)
        L_0x0185:
            r9 = r7
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r3.M()
            int r0 = r0 >> 6
            r11 = r0 & 14
            r12 = 6
            r7 = 0
            r8 = 0
            r6 = r4
            r10 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01a0
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a0:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.x()
            if (r7 == 0) goto L_0x01ba
            com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.d r8 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.d
            r0 = r8
            r1 = r19
            r2 = r20
            r3 = r4
            r4 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt.y(com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit z(Function1 function1, ApiTaskResult apiTaskResult) {
        Intrinsics.f(apiTaskResult);
        function1.invoke(new PassCheckout.Action.GooglePayResult(apiTaskResult));
        return Unit.f40552a;
    }
}
