package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItemKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.ComposableSingletons$FareMediaSelectorKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$FareMediaSelectorKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$FareMediaSelectorKt$lambda1$1 f37271z = new ComposableSingletons$FareMediaSelectorKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(424741410, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.ComposableSingletons$FareMediaSelectorKt.lambda-1.<anonymous> (FareMediaSelector.kt:61)");
            }
            PaymentMethodItemKt.b(composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
