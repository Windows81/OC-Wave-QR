package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AddPaymentMethodCyberSourceScreenKt$ScreenImpl$3 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35557A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodCyberSource.State f35558z;

    public AddPaymentMethodCyberSourceScreenKt$ScreenImpl$3(AddPaymentMethodCyberSource.State state, Function1 function1) {
        this.f35558z = state;
        this.f35557A = function1;
    }

    public final void b(PaddingValues paddingValues, Composer composer, int i2) {
        Intrinsics.i(paddingValues, "it");
        if ((i2 & 6) == 0) {
            i2 |= composer.W(paddingValues) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1750637610, i2, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.ScreenImpl.<anonymous> (AddPaymentMethodCyberSourceScreen.kt:118)");
            }
            AddPaymentMethodCyberSourceScreenKt.p(this.f35558z, this.f35557A, paddingValues, composer, i2 & 14);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
