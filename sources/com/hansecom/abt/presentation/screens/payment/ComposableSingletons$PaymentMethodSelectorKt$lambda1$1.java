package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.payment.ComposableSingletons$PaymentMethodSelectorKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$PaymentMethodSelectorKt$lambda1$1 implements Function3<Function0<? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$PaymentMethodSelectorKt$lambda1$1 f37796z = new ComposableSingletons$PaymentMethodSelectorKt$lambda1$1();

    public final void b(Function0 function0, Composer composer, int i2) {
        Intrinsics.i(function0, "it");
        if ((i2 & 6) == 0) {
            i2 |= composer.l(function0) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1401569615, i2, -1, "com.hansecom.abt.presentation.screens.payment.ComposableSingletons$PaymentMethodSelectorKt.lambda-1.<anonymous> (PaymentMethodSelector.kt:40)");
            }
            PaymentMethodSelectorKt.g(function0, composer, i2 & 14);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Function0) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
