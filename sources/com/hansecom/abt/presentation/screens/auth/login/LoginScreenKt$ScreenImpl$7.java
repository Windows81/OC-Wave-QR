package com.hansecom.abt.presentation.screens.auth.login;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.auth.login.Login;
import com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt;
import com.hansecom.abt.util.CallDeviceOnBackButtonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class LoginScreenKt$ScreenImpl$7 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Login.State f34300z;

    public LoginScreenKt$ScreenImpl$7(Login.State state) {
        this.f34300z = state;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1745280974, i2, -1, "com.hansecom.abt.presentation.screens.auth.login.ScreenImpl.<anonymous> (LoginScreen.kt:106)");
            }
            String b2 = StringResources_androidKt.b(R.string.Q9, composer, 0);
            composer.X(-1991827716);
            Function0 b3 = !this.f34300z.k() ? CallDeviceOnBackButtonKt.b(composer, 0) : null;
            composer.M();
            AbtTopBarKt.b(b2, (Modifier) null, b3, (Function3) null, false, composer, 0, 26);
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
