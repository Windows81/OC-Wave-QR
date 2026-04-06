package com.hansecom.abt.presentation.screens.home.barcode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class BarcodeDisplayScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BarcodeDisplay.State f35844z;

    public static final Unit g(BarcodeDisplay.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-585039503, i2, -1, "com.hansecom.abt.presentation.screens.home.barcode.Preview.<anonymous> (BarcodeDisplayScreen.kt:198)");
            }
            Flow A2 = FlowKt.A();
            BarcodeDisplay.State state = this.f35844z;
            composer.X(1427301733);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new d();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            composer.X(1427304709);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new e();
                composer.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer.X(1427303749);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new f();
                composer.N(g4);
            }
            composer.M();
            BarcodeDisplayScreenKt.i(state, function1, A2, function0, (Function0) g4, composer, 27696, 0);
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
