package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcode;
import com.hansecom.abt.ui.components.ScreenContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class FareMediaAddValueCashBarcodeScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if ((r15 & 1) != 0) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function2 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            java.lang.String r0 = "onInstructionsClick"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onFindStoreClick"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 1216852354(0x4887b182, float:277900.06)
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
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel> r1 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.S()
            r13.S()
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel r10 = (com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel) r10
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
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashBarcodeScreen (FareMediaAddValueCashBarcodeScreen.kt:48)"
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
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcode$State r1 = d(r1)
            r2 = 1964981661(0x751f3d9d, float:2.0186154E32)
            r13.X(r2)
            boolean r2 = r13.l(r10)
            java.lang.Object r3 = r13.g()
            if (r2 != 0) goto L_0x0104
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x010c
        L_0x0104:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashBarcodeScreenKt$FareMediaAddValueCashBarcodeScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashBarcodeScreenKt$FareMediaAddValueCashBarcodeScreen$1$1
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
            f(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0065
        L_0x012e:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.x()
            if (r10 == 0) goto L_0x0141
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.d r13 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.d
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashBarcodeScreenKt.c(com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcodeViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final FareMediaAddValueCashPaymentBarcode.State d(State state) {
        return (FareMediaAddValueCashPaymentBarcode.State) state.getValue();
    }

    public static final Unit e(FareMediaAddValueCashPaymentBarcodeViewModel fareMediaAddValueCashPaymentBarcodeViewModel, Function0 function0, Function2 function2, int i2, int i3, Composer composer, int i4) {
        c(fareMediaAddValueCashPaymentBarcodeViewModel, function0, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void f(FareMediaAddValueCashPaymentBarcode.State state, Function1 function1, Flow flow, Function0 function0, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        FareMediaAddValueCashPaymentBarcode.State state2 = state;
        int i4 = i2;
        Composer q2 = composer.q(-1062539756);
        if ((i4 & 6) == 0) {
            i3 = ((i4 & 8) == 0 ? q2.W(state2) : q2.l(state2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        Function1 function12 = function1;
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function12) ? 32 : 16;
        }
        Function0 function02 = function0;
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function02) ? 2048 : 1024;
        }
        Function2 function22 = function2;
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function22) ? 16384 : 8192;
        }
        if ((i3 & 9235) != 9234 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1062539756, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.ScreenImpl (FareMediaAddValueCashBarcodeScreen.kt:67)");
            }
            composer2 = q2;
            ScreenContentKt.d((Modifier) null, 0, 0, ComposableLambdaKt.e(756412723, true, new FareMediaAddValueCashBarcodeScreenKt$ScreenImpl$1(state, function1, function2, (Context) q2.C(AndroidCompositionLocals_androidKt.g()), function0), q2, 54), q2, 3072, 7);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new e(state, function1, flow, function0, function2, i2));
        }
    }

    public static final Unit g(FareMediaAddValueCashPaymentBarcode.State state, Function1 function1, Flow flow, Function0 function0, Function2 function2, int i2, Composer composer, int i3) {
        f(state, function1, flow, function0, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
