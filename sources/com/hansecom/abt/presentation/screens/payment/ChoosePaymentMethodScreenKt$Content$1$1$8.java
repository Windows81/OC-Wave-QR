package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChoosePaymentMethodScreenKt$Content$1$1$8 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37761A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChoosePaymentMethod.State f37762z;

    public ChoosePaymentMethodScreenKt$Content$1$1$8(ChoosePaymentMethod.State state, Function0 function0) {
        this.f37762z = state;
        this.f37761A = function0;
    }

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-43133750, i2, -1, "com.hansecom.abt.presentation.screens.payment.Content.<anonymous>.<anonymous>.<anonymous> (ChoosePaymentMethodScreen.kt:166)");
            }
            SpacerKt.a(SizeKt.i(Modifier.f15489d, Dp.m((float) 4)), composer, 6);
            ChoosePaymentMethodScreenKt.A(this.f37762z.f(), this.f37761A, composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
