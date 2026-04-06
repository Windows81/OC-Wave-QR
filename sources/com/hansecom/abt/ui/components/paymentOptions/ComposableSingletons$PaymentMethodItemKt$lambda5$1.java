package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt$lambda-5$1  reason: invalid class name */
public final class ComposableSingletons$PaymentMethodItemKt$lambda5$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$PaymentMethodItemKt$lambda5$1 f38679z = new ComposableSingletons$PaymentMethodItemKt$lambda5$1();

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Intrinsics.i(columnScope, "$this$MiddleInfoContainer");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-941946866, i2, -1, "com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt.lambda-5.<anonymous> (PaymentMethodItem.kt:135)");
            }
            PaymentMethodItem.f38685a.l(StringResources_androidKt.b(R.string.e3, composer, 0), composer, 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
