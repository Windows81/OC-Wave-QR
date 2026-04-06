package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PaymentMethodItem$FareMediaCard$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.FareMedia f38692z;

    public PaymentMethodItem$FareMediaCard$1(PaymentMethodState.FareMedia fareMedia) {
        this.f38692z = fareMedia;
    }

    public final void b(RowScope rowScope, Composer composer, int i2) {
        Intrinsics.i(rowScope, "$this$Container");
        if ((i2 & 6) == 0) {
            i2 |= composer.W(rowScope) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(956649500, i2, -1, "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.FareMediaCard.<anonymous> (PaymentMethodItem.kt:154)");
            }
            PaymentMethodItem paymentMethodItem = PaymentMethodItem.f38685a;
            final PaymentMethodState.FareMedia fareMedia = this.f38692z;
            paymentMethodItem.z(rowScope, ComposableLambdaKt.e(478711359, true, new Function3<ColumnScope, Composer, Integer, Unit>() {
                public final void b(ColumnScope columnScope, Composer composer, int i2) {
                    Intrinsics.i(columnScope, "$this$MiddleInfoContainer");
                    if ((i2 & 17) != 16 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(478711359, i2, -1, "com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.FareMediaCard.<anonymous>.<anonymous> (PaymentMethodItem.kt:155)");
                        }
                        FareMediaPaymentMethodItemKt.c(fareMedia, SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), composer, 48, 0);
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
            }, composer, 54), composer, (i2 & 14) | 432);
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
