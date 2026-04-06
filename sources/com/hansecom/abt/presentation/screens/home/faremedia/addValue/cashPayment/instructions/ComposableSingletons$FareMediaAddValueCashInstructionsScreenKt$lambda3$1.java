package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.ComposableSingletons$FareMediaAddValueCashInstructionsScreenKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$FareMediaAddValueCashInstructionsScreenKt$lambda3$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$FareMediaAddValueCashInstructionsScreenKt$lambda3$1 f36166z = new ComposableSingletons$FareMediaAddValueCashInstructionsScreenKt$lambda3$1();

    /* access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-516996342, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.ComposableSingletons$FareMediaAddValueCashInstructionsScreenKt.lambda-3.<anonymous> (FareMediaAddValueCashInstructionsScreen.kt:126)");
            }
            FareMediaAddValueCashPaymentInstructions.State state = new FareMediaAddValueCashPaymentInstructions.State(true);
            composer.X(-440772454);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new a();
                composer.N(g2);
            }
            composer.M();
            FareMediaAddValueCashInstructionsScreenKt.i(state, (Function0) g2, composer, 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
