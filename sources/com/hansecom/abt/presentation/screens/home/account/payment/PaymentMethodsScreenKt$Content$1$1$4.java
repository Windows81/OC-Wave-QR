package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PaymentMethodsScreenKt$Content$1$1$4 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f35508A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethods.State f35509z;

    public PaymentMethodsScreenKt$Content$1$1$4(PaymentMethods.State state, Function0 function0) {
        this.f35509z = state;
        this.f35508A = function0;
    }

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(537288210, i2, -1, "com.hansecom.abt.presentation.screens.home.account.payment.Content.<anonymous>.<anonymous>.<anonymous> (PaymentMethodsScreen.kt:150)");
            }
            PaymentMethodsScreenKt.p(this.f35509z.d(), this.f35509z.e(), this.f35509z.f(), this.f35508A, composer, 0);
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
