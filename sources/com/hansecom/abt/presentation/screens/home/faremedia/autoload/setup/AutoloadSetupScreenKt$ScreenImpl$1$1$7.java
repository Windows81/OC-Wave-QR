package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AutoloadSetupScreenKt$ScreenImpl$1$1$7 implements Function3<PaymentMethodState, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f36312z;

    public AutoloadSetupScreenKt$ScreenImpl$1$1$7(Function1 function1) {
        this.f36312z = function1;
    }

    /* access modifiers changed from: private */
    public static final Unit e(Function1 function1) {
        function1.invoke(new AutoloadSetup.Action.BackupPaymentMethodChange((PaymentMethodState) null));
        return Unit.f40552a;
    }

    public final void c(PaymentMethodState paymentMethodState, Composer composer, int i2) {
        Intrinsics.i(paymentMethodState, "it");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(535947618, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ScreenImpl.<anonymous>.<anonymous>.<anonymous> (AutoloadSetupScreen.kt:250)");
            }
            composer.X(-1072335469);
            boolean W = composer.W(this.f36312z);
            Function1 function1 = this.f36312z;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new l(function1);
                composer.N(g2);
            }
            composer.M();
            AutoloadSetupScreenKt.g((Function0) g2, composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((PaymentMethodState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
