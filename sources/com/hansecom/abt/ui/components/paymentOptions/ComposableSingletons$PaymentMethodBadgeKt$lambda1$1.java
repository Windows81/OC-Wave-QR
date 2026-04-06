package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodBadgeKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$PaymentMethodBadgeKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$PaymentMethodBadgeKt$lambda1$1 f38657z = new ComposableSingletons$PaymentMethodBadgeKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1634716327, i2, -1, "com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodBadgeKt.lambda-1.<anonymous> (PaymentMethodBadge.kt:45)");
            }
            AbtTheme abtTheme = AbtTheme.f38851a;
            PaymentMethodBadgeKt.b("Label", abtTheme.b(composer, 6).w(), abtTheme.b(composer, 6).n(), (Modifier) null, composer, 6, 8);
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
