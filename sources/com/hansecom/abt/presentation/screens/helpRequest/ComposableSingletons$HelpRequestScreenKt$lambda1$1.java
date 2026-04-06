package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.progress.AbtCircularProgressIndicatorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.helpRequest.ComposableSingletons$HelpRequestScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$HelpRequestScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$HelpRequestScreenKt$lambda1$1 f34813z = new ComposableSingletons$HelpRequestScreenKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(422312118, i2, -1, "com.hansecom.abt.presentation.screens.helpRequest.ComposableSingletons$HelpRequestScreenKt.lambda-1.<anonymous> (HelpRequestScreen.kt:205)");
            }
            AbtCircularProgressIndicatorKt.e((Modifier) null, 0, 0.0f, 0, 0, composer, 0, 31);
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
