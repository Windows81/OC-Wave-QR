package com.hansecom.abt.presentation.screens.home.account.information;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata
final class AccountInformationScreenKt$AccountScreenPreview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AccountInformation.State f35444z;

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-210871182, i2, -1, "com.hansecom.abt.presentation.screens.home.account.information.AccountScreenPreview.<anonymous> (AccountInformationScreen.kt:190)");
            }
            AccountInformationScreenKt.h(this.f35444z, (Function1) null, (Flow) null, (Function0) null, composer, 0, 14);
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
