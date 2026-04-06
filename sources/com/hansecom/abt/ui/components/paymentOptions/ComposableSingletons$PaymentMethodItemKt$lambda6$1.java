package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt$lambda-6$1  reason: invalid class name */
public final class ComposableSingletons$PaymentMethodItemKt$lambda6$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$PaymentMethodItemKt$lambda6$1 f38680z = new ComposableSingletons$PaymentMethodItemKt$lambda6$1();

    public final void b(RowScope rowScope, Composer composer, int i2) {
        Intrinsics.i(rowScope, "$this$Container");
        if ((i2 & 6) == 0) {
            i2 |= composer.W(rowScope) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1215394389, i2, -1, "com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt.lambda-6.<anonymous> (PaymentMethodItem.kt:125)");
            }
            PaymentMethodItem paymentMethodItem = PaymentMethodItem.f38685a;
            ComposableSingletons$PaymentMethodItemKt composableSingletons$PaymentMethodItemKt = ComposableSingletons$PaymentMethodItemKt.f38659a;
            paymentMethodItem.x(composableSingletons$PaymentMethodItemKt.f(), composer, 54);
            paymentMethodItem.z(rowScope, composableSingletons$PaymentMethodItemKt.g(), composer, (i2 & 14) | 432);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
