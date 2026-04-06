package com.hansecom.abt.util;

import android.app.Activity;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class CallDeviceOnBackButtonKt {
    public static final Function0 b(Composer composer, int i2) {
        composer.X(-1409774440);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1409774440, i2, -1, "com.hansecom.abt.util.callDeviceOnBackButton (CallDeviceOnBackButton.kt:6)");
        }
        Activity activity = (Activity) composer.C(LocalActivityKt.a());
        composer.X(291526368);
        boolean l2 = composer.l(activity);
        Object g2 = composer.g();
        if (l2 || g2 == Composer.f14567a.a()) {
            g2 = new a(activity);
            composer.N(g2);
        }
        Function0 function0 = (Function0) g2;
        composer.M();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return function0;
    }

    public static final Unit c(Activity activity) {
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.f40552a;
    }
}
