package com.hansecom.abt.ui.components.checkout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.checkout.ComposableSingletons$CheckoutSummaryKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$CheckoutSummaryKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$CheckoutSummaryKt$lambda1$1 f38085z = new ComposableSingletons$CheckoutSummaryKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1789879540, i2, -1, "com.hansecom.abt.ui.components.checkout.ComposableSingletons$CheckoutSummaryKt.lambda-1.<anonymous> (CheckoutSummary.kt:71)");
            }
            BigDecimal valueOf = BigDecimal.valueOf(1);
            Intrinsics.h(valueOf, "valueOf(...)");
            CheckoutItem checkoutItem = new CheckoutItem("First item", valueOf);
            BigDecimal valueOf2 = BigDecimal.valueOf((long) 10);
            Intrinsics.h(valueOf2, "valueOf(...)");
            CheckoutItem checkoutItem2 = new CheckoutItem("Second item", valueOf2);
            BigDecimal valueOf3 = BigDecimal.valueOf(0);
            Intrinsics.h(valueOf3, "valueOf(...)");
            CheckoutItem checkoutItem3 = new CheckoutItem("Free item", valueOf3);
            BigDecimal valueOf4 = BigDecimal.valueOf((long) -2);
            Intrinsics.h(valueOf4, "valueOf(...)");
            CheckoutItem checkoutItem4 = new CheckoutItem("Discount", valueOf4);
            BigDecimal valueOf5 = BigDecimal.valueOf((long) 9);
            Intrinsics.h(valueOf5, "valueOf(...)");
            CheckoutSummaryKt.c(ExtensionsKt.b(checkoutItem, checkoutItem2, checkoutItem3, checkoutItem4, new CheckoutItem("Total", valueOf5)), composer, 0);
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
