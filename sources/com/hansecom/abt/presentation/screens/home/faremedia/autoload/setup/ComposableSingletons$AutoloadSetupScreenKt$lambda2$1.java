package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.paymentOptions.PaymentMethodBadgeKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ComposableSingletons$AutoloadSetupScreenKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$AutoloadSetupScreenKt$lambda2$1 implements Function3<BoxScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AutoloadSetupScreenKt$lambda2$1 f36336z = new ComposableSingletons$AutoloadSetupScreenKt$lambda2$1();

    public final void b(BoxScope boxScope, Composer composer, int i2) {
        Intrinsics.i(boxScope, "$this$PaymentMethodSelector");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1429302560, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.ComposableSingletons$AutoloadSetupScreenKt.lambda-2.<anonymous> (AutoloadSetupScreen.kt:255)");
            }
            String b2 = StringResources_androidKt.b(R.string.Z0, composer, 0);
            AbtTheme abtTheme = AbtTheme.f38851a;
            PaymentMethodBadgeKt.b(b2, abtTheme.b(composer, 6).f(), abtTheme.b(composer, 6).l(), (Modifier) null, composer, 0, 8);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
