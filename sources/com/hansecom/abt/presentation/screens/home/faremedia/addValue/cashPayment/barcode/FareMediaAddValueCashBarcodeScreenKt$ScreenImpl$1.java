package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.IntSize;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcode;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class FareMediaAddValueCashBarcodeScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36128A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f36129B;
    public final /* synthetic */ Context C;
    public final /* synthetic */ Function0 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaAddValueCashPaymentBarcode.State f36130z;

    public FareMediaAddValueCashBarcodeScreenKt$ScreenImpl$1(FareMediaAddValueCashPaymentBarcode.State state, Function1 function1, Function2 function2, Context context, Function0 function0) {
        this.f36130z = state;
        this.f36128A = function1;
        this.f36129B = function2;
        this.C = context;
        this.D = function0;
    }

    public static final Unit f(Function1 function1, IntSize intSize) {
        function1.invoke(new FareMediaAddValueCashPaymentBarcode.Action.GenerateBarcode((int) (intSize.j() >> 32), (int) (intSize.j() & 4294967295L)));
        return Unit.f40552a;
    }

    public static final Unit g(FareMediaAddValueCashPaymentBarcode.State state, Function2 function2, Context context) {
        String e2 = state.e();
        if (e2 != null) {
            StringValue d2 = state.d();
            function2.m(e2, d2 != null ? StringResourceKt.b(context, d2, new Object[0]) : null);
        }
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r35, int r36) {
        /*
            r34 = this;
            r0 = r34
            r15 = r35
            r1 = r36
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r35.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r35.B()
            goto L_0x0261
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.ScreenImpl.<anonymous> (FareMediaAddValueCashBarcodeScreen.kt:70)"
            r5 = 756412723(0x2d15f133, float:8.523226E-12)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            androidx.compose.ui.Modifier$Companion r13 = androidx.compose.ui.Modifier.f15489d
            r14 = 0
            r12 = 1
            r11 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r13, r14, r12, r11)
            com.hansecom.abt.ui.theme.Dimensions r27 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r27.c()
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r14, r3, r11)
            r3 = 0
            androidx.compose.foundation.ScrollState r5 = androidx.compose.foundation.ScrollKt.c(r3, r15, r3, r12)
            r9 = 14
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r4, r5, r6, r7, r8, r9, r10)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcode$State r10 = r0.f36130z
            kotlin.jvm.functions.Function1 r9 = r0.f36128A
            kotlin.jvm.functions.Function2 r8 = r0.f36129B
            android.content.Context r7 = r0.C
            kotlin.jvm.functions.Function0 r5 = r0.D
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r28 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r4 = r28.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r4, r15, r3)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r15, r3)
            androidx.compose.runtime.CompositionLocalMap r6 = r35.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r11 = r16.a()
            androidx.compose.runtime.Applier r17 = r35.v()
            if (r17 != 0) goto L_0x007d
            androidx.compose.runtime.ComposablesKt.d()
        L_0x007d:
            r35.s()
            boolean r17 = r35.n()
            if (r17 == 0) goto L_0x008a
            r15.y(r11)
            goto L_0x008d
        L_0x008a:
            r35.K()
        L_0x008d:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r35)
            kotlin.jvm.functions.Function2 r12 = r16.c()
            androidx.compose.runtime.Updater.g(r11, r2, r12)
            kotlin.jvm.functions.Function2 r2 = r16.e()
            androidx.compose.runtime.Updater.g(r11, r6, r2)
            kotlin.jvm.functions.Function2 r2 = r16.b()
            boolean r6 = r11.n()
            if (r6 != 0) goto L_0x00b7
            java.lang.Object r6 = r11.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r12)
            if (r6 != 0) goto L_0x00c5
        L_0x00b7:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r11.N(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11.A(r4, r2)
        L_0x00c5:
            kotlin.jvm.functions.Function2 r2 = r16.d()
            androidx.compose.runtime.Updater.g(r11, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r12 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r1 = com.hansecom.abt.R.string.F7
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r3)
            int r1 = com.hansecom.abt.R.string.I7
            java.lang.String r16 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r3)
            r18 = 0
            r19 = 79
            r1 = 0
            r2 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r6 = r3
            r3 = r20
            r29 = r5
            r14 = r6
            r5 = r22
            r30 = r7
            r7 = r11
            r11 = r8
            r8 = r16
            r14 = r9
            r9 = r24
            r31 = r10
            r10 = r35
            r32 = r11
            r11 = r18
            r33 = r12
            r0 = 1
            r12 = r19
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            com.hansecom.abt.ui.components.barcode.BarcodeState r1 = r31.c()
            r2 = 2141075846(0x7f9e3986, float:NaN)
            r15.X(r2)
            boolean r2 = r15.W(r14)
            java.lang.Object r3 = r35.g()
            if (r2 != 0) goto L_0x0123
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x012b
        L_0x0123:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.i r3 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.i
            r3.<init>(r14)
            r15.N(r3)
        L_0x012b:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r35.M()
            r2 = 0
            com.hansecom.abt.ui.components.barcode.BarcodeKt.h(r1, r3, r15, r2)
            r1 = 16
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r13, r1)
            r11 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r15, r11)
            r3 = 0
            r12 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r13, r3, r0, r12)
            androidx.compose.ui.text.style.TextAlign$Companion r1 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r4 = r1.a()
            int r1 = com.hansecom.abt.R.string.H7
            r5 = 0
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r15, r5)
            com.hansecom.abt.ui.theme.AbtTheme r6 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r6 = r6.d(r15, r11)
            androidx.compose.ui.text.TextStyle r22 = r6.b()
            androidx.compose.ui.text.style.TextAlign r14 = androidx.compose.ui.text.style.TextAlign.h(r4)
            r10 = r3
            r9 = r5
            r25 = 0
            r26 = 130044(0x1fbfc, float:1.8223E-40)
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r16 = 0
            r0 = r9
            r9 = r16
            r10 = r16
            r16 = 0
            r0 = r11
            r11 = r16
            r16 = 0
            r0 = r13
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 48
            r23 = r35
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 24
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r0, r1)
            r11 = r35
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r11, r2)
            int r1 = com.hansecom.abt.R.string.E7
            r3 = 0
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r11, r3)
            int r1 = com.hansecom.abt.R.drawable.W
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r12 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r4 = r12.a(r11, r2)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r4 = r4.c(r11, r3)
            r2 = 1
            r13 = 0
            r14 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r0, r13, r2, r14)
            androidx.compose.ui.Alignment$Horizontal r2 = r28.g()
            r15 = r33
            androidx.compose.ui.Modifier r2 = r15.b(r3, r2)
            r3 = 2141092074(0x7f9e78ea, float:NaN)
            r11.X(r3)
            r3 = r31
            boolean r6 = r11.l(r3)
            r7 = r32
            boolean r8 = r11.W(r7)
            r6 = r6 | r8
            r8 = r30
            boolean r9 = r11.l(r8)
            r6 = r6 | r9
            java.lang.Object r9 = r35.g()
            if (r6 != 0) goto L_0x01f4
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x01fc
        L_0x01f4:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.j r9 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.j
            r9.<init>(r3, r7, r8)
            r11.N(r9)
        L_0x01fc:
            r3 = r9
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r35.M()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r9 = 0
            r10 = 72
            r7 = 0
            r8 = 0
            r1 = r3
            r3 = r4
            r4 = r7
            r7 = r8
            r8 = r35
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r0, r1)
            r2 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r11, r2)
            int r1 = com.hansecom.abt.R.string.G7
            r3 = 0
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r11, r3)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r12.a(r11, r2)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r1.e(r11, r3)
            r1 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r0, r13, r1, r14)
            androidx.compose.ui.Alignment$Horizontal r2 = r28.g()
            androidx.compose.ui.Modifier r2 = r15.b(r1, r2)
            r10 = 104(0x68, float:1.46E-43)
            r4 = 0
            r6 = 0
            r7 = 0
            r1 = r29
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r1 = r27.e()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r0, r1)
            r1 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r0, r11, r1)
            r35.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0261
            androidx.compose.runtime.ComposerKt.X()
        L_0x0261:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashBarcodeScreenKt$ScreenImpl$1.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
