package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxKt;
import com.hansecom.abt.ui.components.notificationBox.AbtNotificationBoxType;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.ComposableSingletons$FareMediaScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$FareMediaScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$FareMediaScreenKt$lambda1$1 f35893z = new ComposableSingletons$FareMediaScreenKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-531716044, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.ComposableSingletons$FareMediaScreenKt.lambda-1.<anonymous> (FareMediaScreen.kt:244)");
            }
            AbtNotificationBoxKt.c(AbtNotificationBoxType.WARNING, PainterResources_androidKt.c(R.drawable.f33007i, composer, 0), StringResourceKt.a(R.string.J4, new Object[0], composer, 0), SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), (String) null, (Function0) null, composer, 3078, 48);
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
