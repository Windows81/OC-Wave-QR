package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtSideButtonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ComposableSingletons$AutoloadSetupScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AutoloadSetupScreenKt$lambda1$1 implements Function3<Function0<? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AutoloadSetupScreenKt$lambda1$1 f36335z = new ComposableSingletons$AutoloadSetupScreenKt$lambda1$1();

    public final void b(Function0 function0, Composer composer, int i2) {
        Intrinsics.i(function0, "onClick");
        if ((i2 & 6) == 0) {
            i2 |= composer.l(function0) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1622720325, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ComposableSingletons$AutoloadSetupScreenKt.lambda-1.<anonymous> (AutoloadSetupScreen.kt:242)");
            }
            AbtSideButtonKt.c(function0, SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), (AbtButtonState) null, StringResources_androidKt.b(R.string.Y0, composer, 0), Integer.valueOf(R.drawable.Q), composer, (i2 & 14) | 48, 4);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Function0) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
