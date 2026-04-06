package com.hansecom.abt.presentation.screens.auth.register;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt;
import com.hansecom.abt.util.CallDeviceOnBackButtonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class RegisterScreenKt$RegisterScreenImpl$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f34397z;

    public RegisterScreenKt$RegisterScreenImpl$2(String str) {
        this.f34397z = str;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-436697071, i2, -1, "com.hansecom.abt.presentation.screens.auth.register.RegisterScreenImpl.<anonymous> (RegisterScreen.kt:82)");
            }
            Function0 b2 = CallDeviceOnBackButtonKt.b(composer, 0);
            AbtTopBarKt.b(this.f34397z, SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), b2, (Function3) null, false, composer, 48, 24);
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
