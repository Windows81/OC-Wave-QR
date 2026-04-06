package com.hansecom.abt.presentation.screens.auth.register;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostKt;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class RegisterScreenKt$RegisterScreenImpl$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtSnackbarHostState f34398z;

    public RegisterScreenKt$RegisterScreenImpl$3(AbtSnackbarHostState abtSnackbarHostState) {
        this.f34398z = abtSnackbarHostState;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-663918061, i2, -1, "com.hansecom.abt.presentation.screens.auth.register.RegisterScreenImpl.<anonymous> (RegisterScreen.kt:88)");
            }
            AbtSnackbarHostKt.b(this.f34398z, (Modifier) null, composer, 0, 2);
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
