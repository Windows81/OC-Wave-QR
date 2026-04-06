package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PaymentMethodItem {

    /* renamed from: a  reason: collision with root package name */
    public static final PaymentMethodItem f38685a = new PaymentMethodItem();

    public static final Unit A(PaymentMethodItem paymentMethodItem, RowScope rowScope, Function3 function3, int i2, Composer composer, int i3) {
        paymentMethodItem.z(rowScope, function3, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit k(PaymentMethodItem paymentMethodItem, PaymentMethodState paymentMethodState, Function0 function0, Function2 function2, int i2, int i3, Composer composer, int i4) {
        paymentMethodItem.j(paymentMethodState, function0, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit m(PaymentMethodItem paymentMethodItem, String str, int i2, Composer composer, int i3) {
        paymentMethodItem.l(str, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit o(PaymentMethodItem paymentMethodItem, Modifier modifier, Function0 function0, Function2 function2, int i2, int i3, Composer composer, int i4) {
        paymentMethodItem.n(modifier, function0, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit q(PaymentMethodItem paymentMethodItem, Modifier modifier, Function0 function0, boolean z2, Function2 function2, Function3 function3, int i2, int i3, Composer composer, int i4) {
        paymentMethodItem.p(modifier, function0, z2, function2, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit s(PaymentMethodItem paymentMethodItem, PaymentMethodState.CreditCard creditCard, Modifier modifier, Function0 function0, Function2 function2, int i2, int i3, Composer composer, int i4) {
        paymentMethodItem.r(creditCard, modifier, function0, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit u(PaymentMethodItem paymentMethodItem, Modifier modifier, PaymentMethodState.FareMedia fareMedia, Function0 function0, boolean z2, Function2 function2, int i2, int i3, Composer composer, int i4) {
        paymentMethodItem.t(modifier, fareMedia, function0, z2, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit w(PaymentMethodItem paymentMethodItem, Modifier modifier, Function0 function0, Function2 function2, int i2, int i3, Composer composer, int i4) {
        paymentMethodItem.v(modifier, function0, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit y(PaymentMethodItem paymentMethodItem, Function3 function3, int i2, Composer composer, int i3) {
        paymentMethodItem.x(function3, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(com.hansecom.abt.presentation.model.PaymentMethodState r17, kotlin.jvm.functions.Function0 r18, kotlin.jvm.functions.Function2 r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r16 = this;
            r2 = r17
            r12 = r18
            r13 = r21
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = -1271210035(0xffffffffb43adfcd, float:-1.7404018E-7)
            r1 = r20
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r22 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r13 | 6
            goto L_0x0039
        L_0x0020:
            r3 = r13 & 6
            if (r3 != 0) goto L_0x0038
            r3 = r13 & 8
            if (r3 != 0) goto L_0x002d
            boolean r3 = r1.W(r2)
            goto L_0x0031
        L_0x002d:
            boolean r3 = r1.l(r2)
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r3 = 4
            goto L_0x0036
        L_0x0035:
            r3 = 2
        L_0x0036:
            r3 = r3 | r13
            goto L_0x0039
        L_0x0038:
            r3 = r13
        L_0x0039:
            r4 = r22 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 48
            goto L_0x0050
        L_0x0040:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x0050
            boolean r4 = r1.l(r12)
            if (r4 == 0) goto L_0x004d
            r4 = 32
            goto L_0x004f
        L_0x004d:
            r4 = 16
        L_0x004f:
            r3 = r3 | r4
        L_0x0050:
            r4 = r22 & 4
            if (r4 == 0) goto L_0x0059
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0056:
            r5 = r19
            goto L_0x006b
        L_0x0059:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0056
            r5 = r19
            boolean r6 = r1.l(r5)
            if (r6 == 0) goto L_0x0068
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r6 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r3 = r3 | r6
        L_0x006b:
            r6 = r22 & 8
            if (r6 == 0) goto L_0x0074
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r14 = r16
            goto L_0x0086
        L_0x0074:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            r14 = r16
            if (r6 != 0) goto L_0x0086
            boolean r6 = r1.W(r14)
            if (r6 == 0) goto L_0x0083
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r3 = r3 | r6
        L_0x0086:
            r6 = r3 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0099
            boolean r6 = r1.t()
            if (r6 != 0) goto L_0x0093
            goto L_0x0099
        L_0x0093:
            r1.B()
            r4 = r5
            goto L_0x01a5
        L_0x0099:
            r6 = 0
            if (r4 == 0) goto L_0x009e
            r15 = r6
            goto L_0x009f
        L_0x009e:
            r15 = r5
        L_0x009f:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x00ab
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.Button (PaymentMethodItem.kt:168)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r4, r5)
        L_0x00ab:
            boolean r0 = r2 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard
            r4 = 57344(0xe000, float:8.0356E-41)
            r5 = 0
            r7 = 1
            if (r0 == 0) goto L_0x00e5
            r0 = -254285546(0xfffffffff0d7e916, float:-5.345685E29)
            r1.X(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r0, r5, r7, r6)
            java.lang.String r5 = "payment_method_select_card"
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.platform.TestTagKt.a(r0, r5)
            r0 = r2
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r0 = (com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard) r0
            int r3 = r3 << 3
            r6 = r3 & 896(0x380, float:1.256E-42)
            r6 = r6 | 48
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r7
            r3 = r3 & r4
            r9 = r6 | r3
            r10 = 0
            r3 = r16
            r4 = r0
            r6 = r18
            r7 = r15
            r8 = r1
            r3.r(r4, r5, r6, r7, r8, r9, r10)
            r1.M()
            goto L_0x019b
        L_0x00e5:
            com.hansecom.abt.presentation.model.PaymentMethodState$Cash r0 = com.hansecom.abt.presentation.model.PaymentMethodState.Cash.f34177z
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r2, r0)
            if (r0 == 0) goto L_0x0119
            r0 = -423834777(0xffffffffe6bccb67, float:-4.457785E23)
            r1.X(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r0, r5, r7, r6)
            java.lang.String r4 = "payment_method_select_cash"
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.platform.TestTagKt.a(r0, r4)
            r0 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            r5 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r5
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r8 = r0 | r3
            r9 = 0
            r3 = r16
            r5 = r18
            r6 = r15
            r7 = r1
            r3.n(r4, r5, r6, r7, r8, r9)
            r1.M()
            goto L_0x019b
        L_0x0119:
            boolean r0 = r2 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.GooglePay
            if (r0 == 0) goto L_0x0148
            r0 = -423825684(0xffffffffe6bceeec, float:-4.461061E23)
            r1.X(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r0, r5, r7, r6)
            java.lang.String r4 = "payment_method_select_gpay"
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.platform.TestTagKt.a(r0, r4)
            r0 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            r5 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r5
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r8 = r0 | r3
            r9 = 0
            r3 = r16
            r5 = r18
            r6 = r15
            r7 = r1
            r3.v(r4, r5, r6, r7, r8, r9)
            r1.M()
            goto L_0x019b
        L_0x0148:
            boolean r0 = r2 instanceof com.hansecom.abt.presentation.model.PaymentMethodState.FareMedia
            if (r0 == 0) goto L_0x01bf
            r0 = -253398698(0xfffffffff0e57156, float:-5.6807266E29)
            r1.X(r0)
            r0 = r2
            com.hansecom.abt.presentation.model.PaymentMethodState$FareMedia r0 = (com.hansecom.abt.presentation.model.PaymentMethodState.FareMedia) r0
            boolean r8 = r0.c()
            if (r8 != 0) goto L_0x016f
            boolean r8 = r0.d()
            if (r8 != 0) goto L_0x016f
            java.math.BigDecimal r8 = r0.a()
            java.math.BigDecimal r9 = java.math.BigDecimal.ZERO
            int r8 = r8.compareTo(r9)
            if (r8 <= 0) goto L_0x016f
            r8 = r7
            goto L_0x0170
        L_0x016f:
            r8 = 0
        L_0x0170:
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.h(r9, r5, r7, r6)
            java.lang.String r6 = "payment_method_select_fare_media"
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.platform.TestTagKt.a(r5, r6)
            int r6 = r3 << 3
            r6 = r6 & 896(0x380, float:1.256E-42)
            r6 = r6 | 6
            int r3 = r3 << 6
            r4 = r4 & r3
            r4 = r4 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r6
            r10 = r4 | r3
            r11 = 0
            r3 = r16
            r4 = r5
            r5 = r0
            r6 = r18
            r7 = r8
            r8 = r15
            r9 = r1
            r3.t(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.M()
        L_0x019b:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01a4
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a4:
            r4 = r15
        L_0x01a5:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x01be
            com.hansecom.abt.ui.components.paymentOptions.j r8 = new com.hansecom.abt.ui.components.paymentOptions.j
            r0 = r8
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01be:
            return
        L_0x01bf:
            r0 = -423845557(0xffffffffe6bca14b, float:-4.453901E23)
            r1.X(r0)
            r1.M()
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.j(com.hansecom.abt.presentation.model.PaymentMethodState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public final void l(String str, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str2 = str;
        Composer q2 = composer.q(493791339);
        if ((i2 & 6) == 0) {
            i3 = i2 | (q2.W(str2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(493791339, i3, -1, "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.CardTitle (PaymentMethodItem.kt:214)");
            }
            AbtTheme abtTheme = AbtTheme.f38851a;
            composer2 = q2;
            TextKt.j(str, (Modifier) null, abtTheme.b(q2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).a(), composer2, i3 & 14, 0, 131066);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new o(this, str, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(androidx.compose.ui.Modifier r16, kotlin.jvm.functions.Function0 r17, kotlin.jvm.functions.Function2 r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            r15 = this;
            r9 = r16
            r10 = r17
            r11 = r20
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = -384797151(0xffffffffe9107621, float:-1.0915198E25)
            r1 = r19
            androidx.compose.runtime.Composer r12 = r1.q(r0)
            r1 = r21 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r12.W(r9)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r11
            goto L_0x0030
        L_0x002f:
            r1 = r11
        L_0x0030:
            r2 = r21 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x0047
        L_0x0037:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0047
            boolean r2 = r12.l(r10)
            if (r2 == 0) goto L_0x0044
            r2 = 32
            goto L_0x0046
        L_0x0044:
            r2 = 16
        L_0x0046:
            r1 = r1 | r2
        L_0x0047:
            r2 = r21 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r3 = r18
            goto L_0x0062
        L_0x0050:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004d
            r3 = r18
            boolean r4 = r12.l(r3)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
        L_0x0062:
            r4 = r21 & 8
            if (r4 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r13 = r15
            goto L_0x007b
        L_0x006a:
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            r13 = r15
            if (r4 != 0) goto L_0x007b
            boolean r4 = r12.W(r15)
            if (r4 == 0) goto L_0x0078
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r4
        L_0x007b:
            r4 = r1 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x008d
            boolean r4 = r12.t()
            if (r4 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r12.B()
            r4 = r3
            goto L_0x00ce
        L_0x008d:
            if (r2 == 0) goto L_0x0092
            r2 = 0
            r14 = r2
            goto L_0x0093
        L_0x0092:
            r14 = r3
        L_0x0093:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x009f
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.Cash (PaymentMethodItem.kt:102)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x009f:
            com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt r0 = com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt.f38659a
            kotlin.jvm.functions.Function3 r5 = r0.e()
            r0 = r1 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r2 = r1 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            int r1 = r1 << 6
            r1 = r1 & r2
            r7 = r0 | r1
            r8 = 4
            r3 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r14
            r6 = r12
            r0.p(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00cd
            androidx.compose.runtime.ComposerKt.X()
        L_0x00cd:
            r4 = r14
        L_0x00ce:
            androidx.compose.runtime.ScopeUpdateScope r7 = r12.x()
            if (r7 == 0) goto L_0x00e6
            com.hansecom.abt.ui.components.paymentOptions.p r8 = new com.hansecom.abt.ui.components.paymentOptions.p
            r0 = r8
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.n(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function0 r29, boolean r30, kotlin.jvm.functions.Function2 r31, kotlin.jvm.functions.Function3 r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r27 = this;
            r6 = r32
            r7 = r34
            r0 = -2069690761(0xffffffff84a30677, float:-3.8327053E-36)
            r1 = r33
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r35 & 1
            r3 = 4
            if (r2 == 0) goto L_0x0018
            r2 = r7 | 6
            r4 = r2
            r2 = r28
            goto L_0x002c
        L_0x0018:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0029
            r2 = r28
            boolean r4 = r1.W(r2)
            if (r4 == 0) goto L_0x0026
            r4 = r3
            goto L_0x0027
        L_0x0026:
            r4 = 2
        L_0x0027:
            r4 = r4 | r7
            goto L_0x002c
        L_0x0029:
            r2 = r28
            r4 = r7
        L_0x002c:
            r5 = r35 & 2
            if (r5 == 0) goto L_0x0035
            r4 = r4 | 48
        L_0x0032:
            r5 = r29
            goto L_0x0047
        L_0x0035:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x0032
            r5 = r29
            boolean r8 = r1.l(r5)
            if (r8 == 0) goto L_0x0044
            r8 = 32
            goto L_0x0046
        L_0x0044:
            r8 = 16
        L_0x0046:
            r4 = r4 | r8
        L_0x0047:
            r8 = r35 & 4
            if (r8 == 0) goto L_0x0050
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r9 = r30
            goto L_0x0062
        L_0x0050:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004d
            r9 = r30
            boolean r10 = r1.d(r9)
            if (r10 == 0) goto L_0x005f
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r4 = r4 | r10
        L_0x0062:
            r10 = r35 & 8
            if (r10 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r11 = r31
            goto L_0x007d
        L_0x006b:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0068
            r11 = r31
            boolean r12 = r1.l(r11)
            if (r12 == 0) goto L_0x007a
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r12
        L_0x007d:
            r12 = r35 & 16
            if (r12 == 0) goto L_0x0084
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0094
        L_0x0084:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0094
            boolean r12 = r1.l(r6)
            if (r12 == 0) goto L_0x0091
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r12
        L_0x0094:
            r12 = r4 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00a7
            boolean r12 = r1.t()
            if (r12 != 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            r1.B()
            r4 = r9
            goto L_0x0126
        L_0x00a7:
            r12 = 1
            if (r8 == 0) goto L_0x00ac
            r15 = r12
            goto L_0x00ad
        L_0x00ac:
            r15 = r9
        L_0x00ad:
            if (r10 == 0) goto L_0x00b2
            r8 = 0
            r14 = r8
            goto L_0x00b3
        L_0x00b2:
            r14 = r11
        L_0x00b3:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x00bf
            r8 = -1
            java.lang.String r9 = "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.Container (PaymentMethodItem.kt:229)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r8, r9)
        L_0x00bf:
            float r0 = (float) r3
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.foundation.shape.RoundedCornerShape r11 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r0)
            androidx.compose.material3.CardDefaults r0 = androidx.compose.material3.CardDefaults.f9356a
            int r3 = androidx.compose.material3.CardDefaults.f9357b
            androidx.compose.material3.CardColors r16 = r0.a(r1, r3)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r3 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r1, r3)
            long r17 = r0.A()
            r25 = 14
            r26 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            androidx.compose.material3.CardColors r0 = androidx.compose.material3.CardColors.d(r16, r17, r19, r21, r23, r25, r26)
            com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem$Container$1 r3 = new com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem$Container$1
            r3.<init>(r15, r6, r14)
            r8 = 54
            r9 = 215089260(0xcd2006c, float:3.2355877E-31)
            androidx.compose.runtime.internal.ComposableLambda r16 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r12, r3, r1, r8)
            int r3 = r4 >> 3
            r3 = r3 & 14
            r8 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r8
            int r8 = r4 << 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 | r8
            r4 = r4 & 896(0x380, float:1.256E-42)
            r18 = r3 | r4
            r19 = 224(0xe0, float:3.14E-43)
            r13 = 0
            r3 = 0
            r4 = 0
            r8 = r29
            r9 = r28
            r10 = r15
            r12 = r0
            r0 = r14
            r14 = r3
            r3 = r15
            r15 = r4
            r17 = r1
            androidx.compose.material3.CardKt.d(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0124
            androidx.compose.runtime.ComposerKt.X()
        L_0x0124:
            r11 = r0
            r4 = r3
        L_0x0126:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x0142
            com.hansecom.abt.ui.components.paymentOptions.q r10 = new com.hansecom.abt.ui.components.paymentOptions.q
            r0 = r10
            r1 = r27
            r2 = r28
            r3 = r29
            r5 = r11
            r6 = r32
            r7 = r34
            r8 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.p(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(com.hansecom.abt.presentation.model.PaymentMethodState.CreditCard r18, androidx.compose.ui.Modifier r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function2 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r17 = this;
            r2 = r18
            r12 = r20
            r13 = r23
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = -1254000266(0xffffffffb5417976, float:-7.207485E-7)
            r1 = r22
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r24 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r13 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r13 & 6
            if (r3 != 0) goto L_0x002f
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r13
            goto L_0x0030
        L_0x002f:
            r3 = r13
        L_0x0030:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
        L_0x0036:
            r5 = r19
            goto L_0x004b
        L_0x0039:
            r5 = r13 & 48
            if (r5 != 0) goto L_0x0036
            r5 = r19
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
        L_0x004b:
            r6 = r24 & 4
            if (r6 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0062
            boolean r6 = r1.l(r12)
            if (r6 == 0) goto L_0x005f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r3 = r3 | r6
        L_0x0062:
            r6 = r24 & 8
            if (r6 == 0) goto L_0x006b
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r7 = r21
            goto L_0x007d
        L_0x006b:
            r7 = r13 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r21
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x007a
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r3 = r3 | r8
        L_0x007d:
            r8 = r24 & 16
            if (r8 == 0) goto L_0x0086
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r14 = r17
            goto L_0x0098
        L_0x0086:
            r8 = r13 & 24576(0x6000, float:3.4438E-41)
            r14 = r17
            if (r8 != 0) goto L_0x0098
            boolean r8 = r1.W(r14)
            if (r8 == 0) goto L_0x0095
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r3 = r3 | r8
        L_0x0098:
            r8 = r3 & 9363(0x2493, float:1.312E-41)
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r9) goto L_0x00ab
            boolean r8 = r1.t()
            if (r8 != 0) goto L_0x00a5
            goto L_0x00ab
        L_0x00a5:
            r1.B()
            r3 = r5
            r5 = r7
            goto L_0x0101
        L_0x00ab:
            if (r4 == 0) goto L_0x00b1
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r15 = r4
            goto L_0x00b2
        L_0x00b1:
            r15 = r5
        L_0x00b2:
            if (r6 == 0) goto L_0x00b8
            r4 = 0
            r16 = r4
            goto L_0x00ba
        L_0x00b8:
            r16 = r7
        L_0x00ba:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x00c6
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.CreditCard (PaymentMethodItem.kt:50)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r4, r5)
        L_0x00c6:
            com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem$CreditCard$1 r0 = new com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem$CreditCard$1
            r0.<init>(r2)
            r4 = 54
            r5 = -1648477152(0xffffffff9dbe3c20, float:-5.035475E-21)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r6, r0, r1, r4)
            int r0 = r3 >> 3
            r4 = r0 & 14
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r4
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            int r3 = r3 << 3
            r3 = r3 & r4
            r10 = r0 | r3
            r11 = 4
            r6 = 0
            r3 = r17
            r4 = r15
            r5 = r20
            r7 = r16
            r9 = r1
            r3.p(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00fe
            androidx.compose.runtime.ComposerKt.X()
        L_0x00fe:
            r3 = r15
            r5 = r16
        L_0x0101:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x011a
            com.hansecom.abt.ui.components.paymentOptions.n r9 = new com.hansecom.abt.ui.components.paymentOptions.n
            r0 = r9
            r1 = r17
            r2 = r18
            r4 = r20
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.r(com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(androidx.compose.ui.Modifier r18, com.hansecom.abt.presentation.model.PaymentMethodState.FareMedia r19, kotlin.jvm.functions.Function0 r20, boolean r21, kotlin.jvm.functions.Function2 r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r17 = this;
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r24
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = -1942726158(0xffffffff8c3459f2, float:-1.3893763E-31)
            r1 = r23
            androidx.compose.runtime.Composer r13 = r1.q(r0)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0027
            r1 = r12 | 6
            goto L_0x0037
        L_0x0027:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x0036
            boolean r1 = r13.W(r9)
            if (r1 == 0) goto L_0x0033
            r1 = 4
            goto L_0x0034
        L_0x0033:
            r1 = 2
        L_0x0034:
            r1 = r1 | r12
            goto L_0x0037
        L_0x0036:
            r1 = r12
        L_0x0037:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x003e
            r1 = r1 | 48
            goto L_0x004e
        L_0x003e:
            r2 = r12 & 48
            if (r2 != 0) goto L_0x004e
            boolean r2 = r13.W(r10)
            if (r2 == 0) goto L_0x004b
            r2 = 32
            goto L_0x004d
        L_0x004b:
            r2 = 16
        L_0x004d:
            r1 = r1 | r2
        L_0x004e:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r2 = r12 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0065
            boolean r2 = r13.l(r11)
            if (r2 == 0) goto L_0x0062
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r2
        L_0x0065:
            r2 = r25 & 8
            if (r2 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r14 = r21
            goto L_0x0080
        L_0x006e:
            r2 = r12 & 3072(0xc00, float:4.305E-42)
            r14 = r21
            if (r2 != 0) goto L_0x0080
            boolean r2 = r13.d(r14)
            if (r2 == 0) goto L_0x007d
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r2
        L_0x0080:
            r2 = r25 & 16
            if (r2 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r3 = r22
            goto L_0x009b
        L_0x0089:
            r3 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0086
            r3 = r22
            boolean r4 = r13.l(r3)
            if (r4 == 0) goto L_0x0098
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r4
        L_0x009b:
            r4 = r25 & 32
            r5 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00a5
            r1 = r1 | r5
            r15 = r17
            goto L_0x00b7
        L_0x00a5:
            r4 = r12 & r5
            r15 = r17
            if (r4 != 0) goto L_0x00b7
            boolean r4 = r13.W(r15)
            if (r4 == 0) goto L_0x00b4
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r1 = r1 | r4
        L_0x00b7:
            r4 = 74899(0x12493, float:1.04956E-40)
            r4 = r4 & r1
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r5) goto L_0x00cc
            boolean r4 = r13.t()
            if (r4 != 0) goto L_0x00c7
            goto L_0x00cc
        L_0x00c7:
            r13.B()
            r6 = r3
            goto L_0x011d
        L_0x00cc:
            if (r2 == 0) goto L_0x00d2
            r2 = 0
            r16 = r2
            goto L_0x00d4
        L_0x00d2:
            r16 = r3
        L_0x00d4:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x00e0
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.FareMediaCard (PaymentMethodItem.kt:147)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x00e0:
            com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem$FareMediaCard$1 r0 = new com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem$FareMediaCard$1
            r0.<init>(r10)
            r2 = 54
            r3 = 956649500(0x3905501c, float:1.2713711E-4)
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r4, r0, r13, r2)
            r0 = r1 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            int r2 = r1 >> 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r7 = r0 | r1
            r8 = 0
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            r4 = r16
            r6 = r13
            r0.p(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x011b
            androidx.compose.runtime.ComposerKt.X()
        L_0x011b:
            r6 = r16
        L_0x011d:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.x()
            if (r13 == 0) goto L_0x013b
            com.hansecom.abt.ui.components.paymentOptions.k r8 = new com.hansecom.abt.ui.components.paymentOptions.k
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r7 = r24
            r9 = r8
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.a(r9)
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.t(androidx.compose.ui.Modifier, com.hansecom.abt.presentation.model.PaymentMethodState$FareMedia, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(androidx.compose.ui.Modifier r16, kotlin.jvm.functions.Function0 r17, kotlin.jvm.functions.Function2 r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            r15 = this;
            r9 = r16
            r10 = r17
            r11 = r20
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = 447912961(0x1ab29c01, float:7.387111E-23)
            r1 = r19
            androidx.compose.runtime.Composer r12 = r1.q(r0)
            r1 = r21 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r12.W(r9)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r11
            goto L_0x0030
        L_0x002f:
            r1 = r11
        L_0x0030:
            r2 = r21 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x0047
        L_0x0037:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0047
            boolean r2 = r12.l(r10)
            if (r2 == 0) goto L_0x0044
            r2 = 32
            goto L_0x0046
        L_0x0044:
            r2 = 16
        L_0x0046:
            r1 = r1 | r2
        L_0x0047:
            r2 = r21 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r3 = r18
            goto L_0x0062
        L_0x0050:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004d
            r3 = r18
            boolean r4 = r12.l(r3)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
        L_0x0062:
            r4 = r21 & 8
            if (r4 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r13 = r15
            goto L_0x007b
        L_0x006a:
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            r13 = r15
            if (r4 != 0) goto L_0x007b
            boolean r4 = r12.W(r15)
            if (r4 == 0) goto L_0x0078
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r4
        L_0x007b:
            r4 = r1 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x008d
            boolean r4 = r12.t()
            if (r4 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r12.B()
            r4 = r3
            goto L_0x00ce
        L_0x008d:
            if (r2 == 0) goto L_0x0092
            r2 = 0
            r14 = r2
            goto L_0x0093
        L_0x0092:
            r14 = r3
        L_0x0093:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x009f
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.GooglePay (PaymentMethodItem.kt:123)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x009f:
            com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt r0 = com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt.f38659a
            kotlin.jvm.functions.Function3 r5 = r0.h()
            r0 = r1 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r2 = r1 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            int r1 = r1 << 6
            r1 = r1 & r2
            r7 = r0 | r1
            r8 = 4
            r3 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r14
            r6 = r12
            r0.p(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00cd
            androidx.compose.runtime.ComposerKt.X()
        L_0x00cd:
            r4 = r14
        L_0x00ce:
            androidx.compose.runtime.ScopeUpdateScope r7 = r12.x()
            if (r7 == 0) goto L_0x00e6
            com.hansecom.abt.ui.components.paymentOptions.r r8 = new com.hansecom.abt.ui.components.paymentOptions.r
            r0 = r8
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.v(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public final void x(Function3 function3, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(995567186);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(995567186, i3, -1, "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.ImageContainer (PaymentMethodItem.kt:259)");
            }
            Modifier i4 = SizeKt.i(SizeKt.y(Modifier.f15489d, Dp.m((float) 77)), Dp.m((float) 40));
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.e(), false);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, i4);
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
            function3.d(BoxScopeInstance.f3797a, q2, Integer.valueOf(((i3 << 3) & 112) | 6));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new l(this, function3, i2));
        }
    }

    public final void z(RowScope rowScope, Function3 function3, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(303706702);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(rowScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function3) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(303706702, i3, -1, "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.MiddleInfoContainer (PaymentMethodItem.kt:271)");
            }
            Modifier c2 = RowScope.c(rowScope, Modifier.f15489d, 1.0f, false, 2, (Object) null);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.n(Dp.m((float) 4)), Alignment.f15444a.k(), q2, 6);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, c2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
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
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            function3.d(ColumnScopeInstance.f3815a, q2, Integer.valueOf((i3 & 112) | 6));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new m(this, rowScope, function3, i2));
        }
    }
}
