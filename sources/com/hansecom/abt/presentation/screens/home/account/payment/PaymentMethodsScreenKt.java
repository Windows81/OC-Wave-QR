package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.ui.theme.Dimensions;
import com.hansecom.abt.util.LazyListExtKt$itemsWithSpacing$2$1;
import com.hansecom.abt.util.LazyListExtKt$itemsWithSpacing$3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class PaymentMethodsScreenKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods.State r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function1 r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = 849015710(0x329af39e, float:1.8038744E-8)
            r5 = r22
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r3 & 6
            r6 = 2
            r7 = 4
            if (r5 != 0) goto L_0x0022
            boolean r5 = r15.W(r0)
            if (r5 == 0) goto L_0x001f
            r5 = r7
            goto L_0x0020
        L_0x001f:
            r5 = r6
        L_0x0020:
            r5 = r5 | r3
            goto L_0x0023
        L_0x0022:
            r5 = r3
        L_0x0023:
            r8 = r3 & 48
            r9 = 32
            if (r8 != 0) goto L_0x0034
            boolean r8 = r15.l(r1)
            if (r8 == 0) goto L_0x0031
            r8 = r9
            goto L_0x0033
        L_0x0031:
            r8 = 16
        L_0x0033:
            r5 = r5 | r8
        L_0x0034:
            r8 = r3 & 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r8 != 0) goto L_0x0045
            boolean r8 = r15.l(r2)
            if (r8 == 0) goto L_0x0042
            r8 = r10
            goto L_0x0044
        L_0x0042:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r5 = r5 | r8
        L_0x0045:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r8 != r11) goto L_0x0058
            boolean r8 = r15.t()
            if (r8 != 0) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            r15.B()
            r4 = r15
            goto L_0x00d3
        L_0x0058:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0064
            r8 = -1
            java.lang.String r11 = "com.hansecom.abt.presentation.screens.home.account.payment.Content (PaymentMethodsScreen.kt:125)"
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r8, r11)
        L_0x0064:
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r8 = 0
            r11 = 1
            r12 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.f(r4, r8, r11, r12)
            com.hansecom.abt.ui.theme.Dimensions r13 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r13 = r13.c()
            androidx.compose.foundation.layout.PaddingValues r8 = androidx.compose.foundation.layout.PaddingKt.c(r13, r8, r6, r12)
            r6 = -852044694(0xffffffffcd36d46a, float:-1.9171088E8)
            r15.X(r6)
            r6 = r5 & 14
            r12 = 0
            if (r6 != r7) goto L_0x0084
            r6 = r11
            goto L_0x0085
        L_0x0084:
            r6 = r12
        L_0x0085:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != r10) goto L_0x008b
            r7 = r11
            goto L_0x008c
        L_0x008b:
            r7 = r12
        L_0x008c:
            r6 = r6 | r7
            r5 = r5 & 112(0x70, float:1.57E-43)
            if (r5 != r9) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r11 = r12
        L_0x0093:
            r5 = r6 | r11
            java.lang.Object r6 = r15.g()
            if (r5 != 0) goto L_0x00a3
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00ab
        L_0x00a3:
            com.hansecom.abt.presentation.screens.home.account.payment.f r6 = new com.hansecom.abt.presentation.screens.home.account.payment.f
            r6.<init>(r0, r2, r1)
            r15.N(r6)
        L_0x00ab:
            r14 = r6
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r15.M()
            r16 = 390(0x186, float:5.47E-43)
            r17 = 506(0x1fa, float:7.09E-43)
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r18 = 0
            r5 = r4
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r18
            r4 = r15
            androidx.compose.foundation.lazy.LazyDslKt.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x00d3
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d3:
            androidx.compose.runtime.ScopeUpdateScope r4 = r4.x()
            if (r4 == 0) goto L_0x00e1
            com.hansecom.abt.presentation.screens.home.account.payment.g r5 = new com.hansecom.abt.presentation.screens.home.account.payment.g
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt.k(com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$State, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit l(PaymentMethods.State state, Function1 function1, Function0 function0, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableSingletons$PaymentMethodsScreenKt.f35488a.a(), 3, (Object) null);
        ImmutableList g2 = state.g();
        float m2 = Dp.m((float) 8);
        lazyListScope.d(g2.size(), new LazyListExtKt$itemsWithSpacing$2$1(new i(), g2), new LazyListExtKt$itemsWithSpacing$3(new j(), g2), ComposableLambdaKt.c(-1395388335, true, new PaymentMethodsScreenKt$Content$lambda$16$lambda$15$$inlined$itemsWithSpacing6a0pyJM$1(g2, m2, function1)));
        lazyListScope.a("add", ContentType.ADD, ComposableLambdaKt.c(537288210, true, new PaymentMethodsScreenKt$Content$1$1$4(state, function0)));
        return Unit.f40552a;
    }

    public static final Object m(PaymentMethodState.CreditCard creditCard) {
        Intrinsics.i(creditCard, "it");
        return Long.valueOf(creditCard.c());
    }

    public static final Object n(PaymentMethodState.CreditCard creditCard) {
        Intrinsics.i(creditCard, "it");
        return ContentType.PAYMENT_METHOD;
    }

    public static final Unit o(PaymentMethods.State state, Function0 function0, Function1 function1, int i2, Composer composer, int i3) {
        k(state, function0, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void p(boolean z2, Integer num, boolean z3, Function0 function0, Composer composer, int i2) {
        int i3;
        float f2;
        int i4;
        boolean z4 = z2;
        Integer num2 = num;
        boolean z5 = z3;
        int i5 = i2;
        Composer q2 = composer.q(-1280028608);
        int i6 = 6;
        if ((i5 & 6) == 0) {
            i3 = (q2.d(z4) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 48) == 0) {
            i3 |= q2.W(num2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i3 |= q2.d(z5) ? 256 : 128;
        }
        Function0 function02 = function0;
        if ((i5 & 3072) == 0) {
            i3 |= q2.l(function02) ? 2048 : 1024;
        }
        int i7 = i3;
        if ((i7 & 1171) != 1170 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1280028608, i7, -1, "com.hansecom.abt.presentation.screens.home.account.payment.ItemAdd (PaymentMethodsScreen.kt:166)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), q2, 0);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, h2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a4);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, a2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            float f3 = (float) 24;
            SpacerKt.a(SizeKt.t(companion, Dp.m(f3)), q2, 6);
            q2.X(1962334647);
            if (z5) {
                i4 = i7;
                f2 = f3;
                TextKt.j(StringResources_androidKt.c(R.string.d8, new Object[]{Integer.valueOf(num2 != null ? num.intValue() : 0)}, q2, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(q2, 6).d(), q2, 0, 0, 131070);
                i6 = 6;
                SpacerKt.a(SizeKt.t(companion, Dp.m(f2)), q2, 6);
            } else {
                i4 = i7;
                f2 = f3;
            }
            q2.M();
            DividerKt.e((Modifier) null, 0.0f, AbtTheme.f38851a.b(q2, i6).u(), q2, 0, 3);
            SpacerKt.a(SizeKt.t(companion, Dp.m(f2)), q2, i6);
            boolean z6 = true;
            Modifier a5 = TestTagKt.a(SizeKt.h(companion, 0.0f, 1, (Object) null), "add");
            String b4 = StringResources_androidKt.b(R.string.Z7, q2, 0);
            if (!z4 && !z5) {
                z6 = false;
            }
            AbtButtonKt.j(function0, a5, AbtButtonStyle.f37880f.a(q2, i6).e(q2, 0), AbtButtonStateKt.b(Boolean.valueOf(z6), (Boolean) null, 2, (Object) null), b4, Integer.valueOf(R.drawable.Q), (AbtButtonIconPosition) null, q2, ((i4 >> 9) & 14) | 48, 64);
            SpacerKt.a(SizeKt.i(companion, Dimensions.f38856a.e()), q2, i6);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new e(z2, num, z3, function0, i2));
        }
    }

    public static final Unit q(boolean z2, Integer num, boolean z3, Function0 function0, int i2, Composer composer, int i3) {
        p(z2, num, z3, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if ((r15 & 1) != 0) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function1 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            java.lang.String r0 = "navigateAddPaymentMethod"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "navigateOpenPaymentMethod"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 1952025372(0x74598b1c, float:6.8942254E31)
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
            goto L_0x012f
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel> r1 = com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.S()
            r13.S()
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel r10 = (com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreen (PaymentMethodsScreen.kt:57)"
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
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$State r1 = s(r1)
            r2 = 1717914504(0x66654b88, float:2.707038E23)
            r13.X(r2)
            boolean r2 = r13.l(r10)
            java.lang.Object r3 = r13.g()
            if (r2 != 0) goto L_0x0104
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x010c
        L_0x0104:
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$PaymentMethodsScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$PaymentMethodsScreen$1$1
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
            r8 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            u(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0065
        L_0x012f:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.x()
            if (r10 == 0) goto L_0x0142
            com.hansecom.abt.presentation.screens.home.account.payment.h r13 = new com.hansecom.abt.presentation.screens.home.account.payment.h
            r1 = r13
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r10.a(r13)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt.r(com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final PaymentMethods.State s(State state) {
        return (PaymentMethods.State) state.getValue();
    }

    public static final Unit t(PaymentMethodsViewModel paymentMethodsViewModel, Function0 function0, Function1 function1, int i2, int i3, Composer composer, int i4) {
        r(paymentMethodsViewModel, function0, function1, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void u(com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods.State r24, kotlin.jvm.functions.Function1 r25, kotlinx.coroutines.flow.Flow r26, kotlin.jvm.functions.Function0 r27, kotlin.jvm.functions.Function1 r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r6 = r30
            r0 = 1120822120(0x42ce6368, float:103.19415)
            r1 = r29
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r6 | 6
            r4 = r3
            r3 = r24
            goto L_0x0029
        L_0x0015:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r24
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r6
            goto L_0x0029
        L_0x0026:
            r3 = r24
            r4 = r6
        L_0x0029:
            r5 = r31 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r7 = r25
            goto L_0x0044
        L_0x0032:
            r7 = r6 & 48
            if (r7 != 0) goto L_0x002f
            r7 = r25
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r4 = r4 | r8
        L_0x0044:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005d
            r8 = r31 & 4
            if (r8 != 0) goto L_0x0057
            r8 = r26
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r8 = r26
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r8 = r26
        L_0x005f:
            r9 = r31 & 8
            r15 = 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r10 = r27
            goto L_0x007b
        L_0x006a:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0067
            r10 = r27
            boolean r11 = r1.l(r10)
            if (r11 == 0) goto L_0x0078
            r11 = r15
            goto L_0x007a
        L_0x0078:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r4 = r4 | r11
        L_0x007b:
            r11 = r31 & 16
            if (r11 == 0) goto L_0x0084
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0081:
            r12 = r28
            goto L_0x0096
        L_0x0084:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0081
            r12 = r28
            boolean r13 = r1.l(r12)
            if (r13 == 0) goto L_0x0093
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r4 = r4 | r13
        L_0x0096:
            r13 = r4 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00ae
            boolean r13 = r1.t()
            if (r13 != 0) goto L_0x00a3
            goto L_0x00ae
        L_0x00a3:
            r1.B()
            r16 = r3
            r2 = r7
            r3 = r8
            r4 = r10
            r5 = r12
            goto L_0x01f3
        L_0x00ae:
            r1.p()
            r13 = r6 & 1
            if (r13 == 0) goto L_0x00cd
            boolean r13 = r1.J()
            if (r13 == 0) goto L_0x00bc
            goto L_0x00cd
        L_0x00bc:
            r1.B()
            r2 = r31 & 4
            if (r2 == 0) goto L_0x00c5
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c5:
            r2 = r3
            r13 = r4
            r3 = r7
        L_0x00c8:
            r4 = r8
            r5 = r10
            r14 = r12
            goto L_0x015f
        L_0x00cd:
            if (r2 == 0) goto L_0x00e5
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$State r2 = new com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$State
            r22 = 31
            r23 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00e6
        L_0x00e5:
            r2 = r3
        L_0x00e6:
            if (r5 == 0) goto L_0x0108
            r3 = 440684557(0x1a44500d, float:4.0596515E-23)
            r1.X(r3)
            java.lang.Object r3 = r1.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r3 != r5) goto L_0x0102
            com.hansecom.abt.presentation.screens.home.account.payment.a r3 = new com.hansecom.abt.presentation.screens.home.account.payment.a
            r3.<init>()
            r1.N(r3)
        L_0x0102:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r1.M()
            goto L_0x0109
        L_0x0108:
            r3 = r7
        L_0x0109:
            r5 = r31 & 4
            if (r5 == 0) goto L_0x0114
            kotlinx.coroutines.flow.Flow r5 = kotlinx.coroutines.flow.FlowKt.A()
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r8 = r5
        L_0x0114:
            if (r9 == 0) goto L_0x0136
            r5 = 440687373(0x1a445b0d, float:4.06054E-23)
            r1.X(r5)
            java.lang.Object r5 = r1.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x0130
            com.hansecom.abt.presentation.screens.home.account.payment.b r5 = new com.hansecom.abt.presentation.screens.home.account.payment.b
            r5.<init>()
            r1.N(r5)
        L_0x0130:
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r1.M()
            r10 = r5
        L_0x0136:
            if (r11 == 0) goto L_0x015c
            r5 = 440689037(0x1a44618d, float:4.061065E-23)
            r1.X(r5)
            java.lang.Object r5 = r1.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x0152
            com.hansecom.abt.presentation.screens.home.account.payment.c r5 = new com.hansecom.abt.presentation.screens.home.account.payment.c
            r5.<init>()
            r1.N(r5)
        L_0x0152:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r1.M()
            r13 = r4
            r14 = r5
            r4 = r8
            r5 = r10
            goto L_0x015f
        L_0x015c:
            r13 = r4
            goto L_0x00c8
        L_0x015f:
            r1.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x016e
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.account.payment.ScreenImpl (PaymentMethodsScreen.kt:77)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r7, r8)
        L_0x016e:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r7 = "PaymentMethodsScreen"
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.TestTagKt.a(r0, r7)
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$ScreenImpl$4 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$ScreenImpl$4
            r0.<init>(r2, r3, r14, r5)
            r8 = 54
            r9 = 456518889(0x1b35ece9, float:1.5048519E-22)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r12, r0, r1, r8)
            r16 = 3078(0xc06, float:4.313E-42)
            r17 = 6
            r8 = 0
            r10 = 0
            r18 = r12
            r12 = r0
            r0 = r13
            r13 = r1
            r19 = r14
            r14 = r16
            r16 = r2
            r2 = r15
            r15 = r17
            com.hansecom.abt.ui.components.ScreenContentKt.d(r7, r8, r10, r12, r13, r14, r15)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r7 = r1.C(r7)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r7 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r7
            r8 = 440744334(0x1a45398e, float:4.0785137E-23)
            r1.X(r8)
            boolean r8 = r1.l(r7)
            r9 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != r2) goto L_0x01b9
            r12 = r18
            goto L_0x01ba
        L_0x01b9:
            r12 = 0
        L_0x01ba:
            r2 = r8 | r12
            java.lang.Object r8 = r1.g()
            if (r2 != 0) goto L_0x01ca
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x01d3
        L_0x01ca:
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$ScreenImpl$5$1 r8 = new com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$ScreenImpl$5$1
            r2 = 0
            r8.<init>(r7, r5, r2)
            r1.N(r8)
        L_0x01d3:
            r10 = r8
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r1.M()
            int r0 = r0 >> 6
            r12 = r0 & 14
            r13 = 6
            r8 = 0
            r9 = 0
            r7 = r4
            r11 = r1
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01ee
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ee:
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r19
        L_0x01f3:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x0208
            com.hansecom.abt.presentation.screens.home.account.payment.d r9 = new com.hansecom.abt.presentation.screens.home.account.payment.d
            r0 = r9
            r1 = r16
            r6 = r30
            r7 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0208:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt.u(com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit v(PaymentMethods.State state, Function1 function1, Flow flow, Function0 function0, Function1 function12, int i2, int i3, Composer composer, int i4) {
        u(state, function1, flow, function0, function12, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit w(PaymentMethods.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit x() {
        return Unit.f40552a;
    }

    public static final Unit y(long j2) {
        return Unit.f40552a;
    }
}
