package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostKt;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AddPaymentMethodNmiScreenKt$ScreenImpl$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtSnackbarHostState f35622z;

    public AddPaymentMethodNmiScreenKt$ScreenImpl$2(AbtSnackbarHostState abtSnackbarHostState) {
        this.f35622z = abtSnackbarHostState;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2011155771, i2, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.ScreenImpl.<anonymous> (AddPaymentMethodNmiScreen.kt:141)");
            }
            AbtSnackbarHostKt.b(this.f35622z, (Modifier) null, composer, 0, 2);
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
