package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f34526z;

    public RegisterResultExitingAccountNeedsActivationScreenKt$ScreenImpl$1(Function0 function0) {
        this.f34526z = function0;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1998762957, i2, -1, "com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.ScreenImpl.<anonymous> (RegisterResultExitingAccountNeedsActivationScreen.kt:67)");
            }
            AbtTopBarKt.b(StringResources_androidKt.b(R.string.D8, composer, 0), (Modifier) null, this.f34526z, (Function3) null, false, composer, 0, 26);
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
