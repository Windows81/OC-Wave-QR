package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public final class PaymentMethodSelectorKt {
    public static final void g(Function0 function0, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(259479948);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(259479948, i3, -1, "com.hansecom.abt.presentation.screens.payment.DefaultSelectButton (PaymentMethodSelector.kt:99)");
            }
            Function0 function02 = function0;
            AbtButtonKt.j(function02, TestTagKt.a(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), "payment_method_select"), AbtButtonStyle.f37880f.a(q2, 6).c(q2, 0), (AbtButtonState) null, StringResources_androidKt.b(R.string.J2, q2, 0), Integer.valueOf(R.drawable.Q), (AbtButtonIconPosition) null, q2, (i3 & 14) | 48, 72);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new D(function0, i2));
        }
    }

    public static final Unit h(Function0 function0, int i2, Composer composer, int i3) {
        g(function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(com.hansecom.abt.presentation.model.PaymentMethodState r30, java.util.List r31, kotlin.jvm.functions.Function1 r32, java.util.List r33, java.lang.String r34, kotlin.jvm.functions.Function3 r35, kotlin.jvm.functions.Function3 r36, kotlin.jvm.functions.Function3 r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r7 = r30
            r15 = r31
            r14 = r32
            r13 = r39
            r12 = r40
            r0 = 128(0x80, float:1.794E-43)
            r1 = 16
            r2 = 32
            r3 = 48
            r8 = 6
            java.lang.String r4 = "paymentMethodTypes"
            kotlin.jvm.internal.Intrinsics.i(r15, r4)
            java.lang.String r4 = "onChoosePaymentMethod"
            kotlin.jvm.internal.Intrinsics.i(r14, r4)
            r4 = 1544610829(0x5c10e40d, float:1.63132565E17)
            r5 = r38
            androidx.compose.runtime.Composer r11 = r5.q(r4)
            r10 = 1
            r5 = r12 & 1
            r9 = 2
            r6 = 4
            if (r5 == 0) goto L_0x0030
            r5 = r13 | 6
            goto L_0x0049
        L_0x0030:
            r5 = r13 & 6
            if (r5 != 0) goto L_0x0048
            r5 = r13 & 8
            if (r5 != 0) goto L_0x003d
            boolean r5 = r11.W(r7)
            goto L_0x0041
        L_0x003d:
            boolean r5 = r11.l(r7)
        L_0x0041:
            if (r5 == 0) goto L_0x0045
            r5 = r6
            goto L_0x0046
        L_0x0045:
            r5 = r9
        L_0x0046:
            r5 = r5 | r13
            goto L_0x0049
        L_0x0048:
            r5 = r13
        L_0x0049:
            r16 = r12 & 2
            if (r16 == 0) goto L_0x004f
            r5 = r5 | r3
            goto L_0x0060
        L_0x004f:
            r16 = r13 & 48
            if (r16 != 0) goto L_0x0060
            boolean r16 = r11.l(r15)
            if (r16 == 0) goto L_0x005c
            r16 = r2
            goto L_0x005e
        L_0x005c:
            r16 = r1
        L_0x005e:
            r5 = r5 | r16
        L_0x0060:
            r16 = r12 & 4
            if (r16 == 0) goto L_0x0067
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0076
        L_0x0067:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0076
            boolean r6 = r11.l(r14)
            if (r6 == 0) goto L_0x0074
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0075
        L_0x0074:
            r6 = r0
        L_0x0075:
            r5 = r5 | r6
        L_0x0076:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x007f
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x007c:
            r9 = r33
            goto L_0x0092
        L_0x007f:
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007c
            r9 = r33
            boolean r17 = r11.l(r9)
            if (r17 == 0) goto L_0x008e
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0090
        L_0x008e:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0090:
            r5 = r5 | r17
        L_0x0092:
            r1 = r1 & r12
            if (r1 == 0) goto L_0x009a
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0097:
            r8 = r34
            goto L_0x00ad
        L_0x009a:
            r8 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0097
            r8 = r34
            boolean r18 = r11.W(r8)
            if (r18 == 0) goto L_0x00a9
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ab
        L_0x00a9:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00ab:
            r5 = r5 | r18
        L_0x00ad:
            r2 = r2 & r12
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00b7
            r5 = r5 | r18
            r10 = r35
            goto L_0x00ca
        L_0x00b7:
            r18 = r13 & r18
            r10 = r35
            if (r18 != 0) goto L_0x00ca
            boolean r19 = r11.l(r10)
            if (r19 == 0) goto L_0x00c6
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c8
        L_0x00c6:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00c8:
            r5 = r5 | r19
        L_0x00ca:
            r19 = r12 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00d5
            r5 = r5 | r20
            r3 = r36
            goto L_0x00e8
        L_0x00d5:
            r20 = r13 & r20
            r3 = r36
            if (r20 != 0) goto L_0x00e8
            boolean r21 = r11.l(r3)
            if (r21 == 0) goto L_0x00e4
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r5 = r5 | r21
        L_0x00e8:
            r0 = r0 & r12
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00f2
            r5 = r5 | r21
            r4 = r37
            goto L_0x0105
        L_0x00f2:
            r21 = r13 & r21
            r4 = r37
            if (r21 != 0) goto L_0x0105
            boolean r22 = r11.l(r4)
            if (r22 == 0) goto L_0x0101
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0103
        L_0x0101:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x0103:
            r5 = r5 | r22
        L_0x0105:
            r22 = 4793491(0x492493, float:6.717112E-39)
            r3 = r5 & r22
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r4) goto L_0x0122
            boolean r3 = r11.t()
            if (r3 != 0) goto L_0x0116
            goto L_0x0122
        L_0x0116:
            r11.B()
            r7 = r36
            r4 = r9
            r6 = r10
            r5 = r11
            r9 = r37
            goto L_0x03fd
        L_0x0122:
            if (r6 == 0) goto L_0x0127
            r23 = 0
            goto L_0x0129
        L_0x0127:
            r23 = r9
        L_0x0129:
            if (r1 == 0) goto L_0x012e
            r24 = 0
            goto L_0x0130
        L_0x012e:
            r24 = r8
        L_0x0130:
            if (r2 == 0) goto L_0x0139
            com.hansecom.abt.presentation.screens.payment.ComposableSingletons$PaymentMethodSelectorKt r1 = com.hansecom.abt.presentation.screens.payment.ComposableSingletons$PaymentMethodSelectorKt.f37793a
            kotlin.jvm.functions.Function3 r1 = r1.a()
            r10 = r1
        L_0x0139:
            if (r19 == 0) goto L_0x0143
            com.hansecom.abt.presentation.screens.payment.ComposableSingletons$PaymentMethodSelectorKt r1 = com.hansecom.abt.presentation.screens.payment.ComposableSingletons$PaymentMethodSelectorKt.f37793a
            kotlin.jvm.functions.Function3 r1 = r1.b()
            r9 = r1
            goto L_0x0145
        L_0x0143:
            r9 = r36
        L_0x0145:
            if (r0 == 0) goto L_0x0149
            r8 = 0
            goto L_0x014b
        L_0x0149:
            r8 = r37
        L_0x014b:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x015a
            r0 = -1
            java.lang.String r1 = "com.hansecom.abt.presentation.screens.payment.PaymentMethodSelector (PaymentMethodSelector.kt:43)"
            r2 = 1544610829(0x5c10e40d, float:1.63132565E17)
            androidx.compose.runtime.ComposerKt.Y(r2, r5, r0, r1)
        L_0x015a:
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r1 = 719248190(0x2adedb3e, float:3.9587252E-13)
            r11.X(r1)
            java.lang.Object r1 = r11.g()
            androidx.compose.runtime.Composer$Companion r19 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r19.a()
            if (r1 != r2) goto L_0x0177
            com.hansecom.abt.presentation.screens.payment.E r1 = new com.hansecom.abt.presentation.screens.payment.E
            r1.<init>()
            r11.N(r1)
        L_0x0177:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r11.M()
            r2 = 48
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.j(r0, r1, r11, r2)
            r3 = r0
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            if (r7 == 0) goto L_0x0306
            r0 = 821926635(0x30fd9aeb, float:1.8452203E-9)
            r11.X(r0)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Alignment$Companion r20 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r0 = r20.o()
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.g(r0, r6)
            int r21 = androidx.compose.runtime.ComposablesKt.a(r11, r6)
            androidx.compose.runtime.CompositionLocalMap r4 = r11.I()
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.ComposedModifierKt.e(r11, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r25 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r2 = r25.a()
            androidx.compose.runtime.Applier r26 = r11.v()
            if (r26 != 0) goto L_0x01b4
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01b4:
            r11.s()
            boolean r26 = r11.n()
            if (r26 == 0) goto L_0x01c1
            r11.y(r2)
            goto L_0x01c4
        L_0x01c1:
            r11.K()
        L_0x01c4:
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.Updater.b(r11)
            r35 = r1
            kotlin.jvm.functions.Function2 r1 = r25.c()
            androidx.compose.runtime.Updater.g(r2, r0, r1)
            kotlin.jvm.functions.Function2 r0 = r25.e()
            androidx.compose.runtime.Updater.g(r2, r4, r0)
            kotlin.jvm.functions.Function2 r0 = r25.b()
            boolean r1 = r2.n()
            if (r1 != 0) goto L_0x01f0
            java.lang.Object r1 = r2.g()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r4)
            if (r1 != 0) goto L_0x01fe
        L_0x01f0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r2.N(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r2.A(r1, r0)
        L_0x01fe:
            kotlin.jvm.functions.Function2 r0 = r25.d()
            androidx.compose.runtime.Updater.g(r2, r6, r0)
            androidx.compose.foundation.layout.BoxScopeInstance r6 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem r0 = com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.f38685a
            r1 = -2142919704(0xffffffff8045a3e8, float:-6.395448E-39)
            r11.X(r1)
            boolean r1 = r11.W(r3)
            java.lang.Object r2 = r11.g()
            if (r1 != 0) goto L_0x021f
            java.lang.Object r1 = r19.a()
            if (r2 != r1) goto L_0x0227
        L_0x021f:
            com.hansecom.abt.presentation.screens.payment.F r2 = new com.hansecom.abt.presentation.screens.payment.F
            r2.<init>(r3)
            r11.N(r2)
        L_0x0227:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r11.M()
            com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt$PaymentMethodSelector$1$2 r1 = new com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt$PaymentMethodSelector$1$2
            r1.<init>(r9, r7)
            r4 = -1279311125(0xffffffffb3bf42eb, float:-8.906303E-8)
            r36 = r3
            r34 = r6
            r3 = 1
            r6 = 54
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r3, r1, r11, r6)
            r1 = r5 & 14
            r3 = r1 | 3456(0xd80, float:4.843E-42)
            r21 = 0
            r27 = r35
            r1 = r30
            r28 = r36
            r26 = r3
            r3 = r4
            r4 = r11
            r22 = r5
            r5 = r26
            r29 = r34
            r7 = 4
            r6 = r21
            r0.j(r1, r2, r3, r4, r5, r6)
            r0 = -2142915381(0xffffffff8045b4cb, float:-6.401506E-39)
            r11.X(r0)
            if (r8 != 0) goto L_0x0266
            r2 = 0
            goto L_0x02fa
        L_0x0266:
            float r0 = (float) r7
            float r1 = androidx.compose.ui.unit.Dp.m(r0)
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            r2 = r27
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.OffsetKt.b(r2, r1, r0)
            androidx.compose.ui.Alignment r1 = r20.o()
            r2 = 0
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r2)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r11, r2)
            androidx.compose.runtime.CompositionLocalMap r4 = r11.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r11, r0)
            kotlin.jvm.functions.Function0 r5 = r25.a()
            androidx.compose.runtime.Applier r6 = r11.v()
            if (r6 != 0) goto L_0x0297
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0297:
            r11.s()
            boolean r6 = r11.n()
            if (r6 == 0) goto L_0x02a4
            r11.y(r5)
            goto L_0x02a7
        L_0x02a4:
            r11.K()
        L_0x02a7:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r11)
            kotlin.jvm.functions.Function2 r6 = r25.c()
            androidx.compose.runtime.Updater.g(r5, r1, r6)
            kotlin.jvm.functions.Function2 r1 = r25.e()
            androidx.compose.runtime.Updater.g(r5, r4, r1)
            kotlin.jvm.functions.Function2 r1 = r25.b()
            boolean r4 = r5.n()
            if (r4 != 0) goto L_0x02d1
            java.lang.Object r4 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)
            if (r4 != 0) goto L_0x02df
        L_0x02d1:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.A(r3, r1)
        L_0x02df:
            kotlin.jvm.functions.Function2 r1 = r25.d()
            androidx.compose.runtime.Updater.g(r5, r0, r1)
            int r0 = r22 >> 18
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 6
            r0 = r0 | r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r29
            r8.d(r1, r11, r0)
            r11.T()
            kotlin.Unit r0 = kotlin.Unit.f40552a
        L_0x02fa:
            r11.M()
            r11.T()
            r11.M()
            r0 = r28
            goto L_0x0344
        L_0x0306:
            r28 = r3
            r22 = r5
            r2 = r6
            r0 = 822320924(0x31039f1c, float:1.9153452E-9)
            r11.X(r0)
            r0 = 719263849(0x2adf1869, float:3.9629695E-13)
            r11.X(r0)
            r0 = r28
            boolean r1 = r11.W(r0)
            java.lang.Object r3 = r11.g()
            if (r1 != 0) goto L_0x0329
            java.lang.Object r1 = r19.a()
            if (r3 != r1) goto L_0x0331
        L_0x0329:
            com.hansecom.abt.presentation.screens.payment.G r3 = new com.hansecom.abt.presentation.screens.payment.G
            r3.<init>(r0)
            r11.N(r3)
        L_0x0331:
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r11.M()
            int r1 = r22 >> 12
            r1 = r1 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.d(r3, r11, r1)
            r11.M()
        L_0x0344:
            boolean r1 = n(r0)
            if (r1 == 0) goto L_0x03e3
            r1 = 1
            r3 = 2
            r4 = 0
            r5 = 6
            androidx.compose.material3.SheetState r3 = androidx.compose.material3.ModalBottomSheetKt.T(r1, r4, r11, r5, r3)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = com.hansecom.abt.presentation.screens.main.MainNavigationKt.l()
            java.lang.Object r4 = r11.C(r4)
            r16 = r4
            androidx.navigation.NavHostController r16 = (androidx.navigation.NavHostController) r16
            java.lang.Object r4 = r11.g()
            java.lang.Object r5 = r19.a()
            if (r4 != r5) goto L_0x0371
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r4 = androidx.compose.runtime.EffectsKt.j(r4, r11)
            r11.N(r4)
        L_0x0371:
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            com.hansecom.abt.ui.theme.AbtTheme r5 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r6 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r5.b(r11, r6)
            long r5 = r5.z()
            int r7 = com.hansecom.abt.R.string.i3
            java.lang.String r2 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r11, r2)
            r7 = 719280266(0x2adf588a, float:3.9674194E-13)
            r11.X(r7)
            boolean r7 = r11.W(r0)
            java.lang.Object r1 = r11.g()
            if (r7 != 0) goto L_0x039a
            java.lang.Object r7 = r19.a()
            if (r1 != r7) goto L_0x03a2
        L_0x039a:
            com.hansecom.abt.presentation.screens.payment.H r1 = new com.hansecom.abt.presentation.screens.payment.H
            r1.<init>(r0)
            r11.N(r1)
        L_0x03a2:
            r17 = r1
            kotlin.jvm.functions.Function0 r17 = (kotlin.jvm.functions.Function0) r17
            r11.M()
            com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt$PaymentMethodSelector$4 r1 = new com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt$PaymentMethodSelector$4
            r7 = r8
            r8 = r1
            r25 = r9
            r9 = r31
            r33 = r7
            r26 = r10
            r7 = 1
            r10 = r23
            r34 = r5
            r5 = r11
            r11 = r24
            r12 = r32
            r13 = r4
            r14 = r3
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 919063559(0x36c7cc07, float:5.954414E-6)
            r4 = 54
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r7, r1, r5, r4)
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            r22 = 184(0xb8, float:2.58E-43)
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r9 = r3
            r10 = r2
            r11 = r34
            r20 = r5
            com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt.e(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x03ea
        L_0x03e3:
            r33 = r8
            r25 = r9
            r26 = r10
            r5 = r11
        L_0x03ea:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03f3
            androidx.compose.runtime.ComposerKt.X()
        L_0x03f3:
            r9 = r33
            r4 = r23
            r8 = r24
            r7 = r25
            r6 = r26
        L_0x03fd:
            androidx.compose.runtime.ScopeUpdateScope r11 = r5.x()
            if (r11 == 0) goto L_0x0418
            com.hansecom.abt.presentation.screens.payment.I r12 = new com.hansecom.abt.presentation.screens.payment.I
            r0 = r12
            r1 = r30
            r2 = r31
            r3 = r32
            r5 = r8
            r8 = r9
            r9 = r39
            r10 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0418:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt.i(com.hansecom.abt.presentation.model.PaymentMethodState, java.util.List, kotlin.jvm.functions.Function1, java.util.List, java.lang.String, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final MutableState j() {
        return SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public static final Unit k(MutableState mutableState) {
        o(mutableState, true);
        return Unit.f40552a;
    }

    public static final Unit l(MutableState mutableState) {
        o(mutableState, false);
        return Unit.f40552a;
    }

    public static final Unit m(PaymentMethodState paymentMethodState, List list, Function1 function1, List list2, String str, Function3 function3, Function3 function32, Function3 function33, int i2, int i3, Composer composer, int i4) {
        i(paymentMethodState, list, function1, list2, str, function3, function32, function33, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final boolean n(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void o(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final Unit p(MutableState mutableState) {
        o(mutableState, true);
        return Unit.f40552a;
    }
}
