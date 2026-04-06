package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.FareMediaAddValueCashPaymentBarcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class FareMediaAddValueCashBarcodeScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaAddValueCashPaymentBarcode.State f36127z;

    /* access modifiers changed from: private */
    public static final Unit g(FareMediaAddValueCashPaymentBarcode.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i(String str, String str2) {
        Intrinsics.i(str, "<unused var>");
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-137912551, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.barcode.Preview.<anonymous> (FareMediaAddValueCashBarcodeScreen.kt:135)");
            }
            FareMediaAddValueCashPaymentBarcode.State state = this.f36127z;
            composer.X(1382034960);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new f();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            Flow A2 = FlowKt.A();
            composer.X(1382037296);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new g();
                composer.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer.X(1382038425);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new h();
                composer.N(g4);
            }
            composer.M();
            FareMediaAddValueCashBarcodeScreenKt.f(state, function1, A2, function0, (Function2) g4, composer, 27696);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
