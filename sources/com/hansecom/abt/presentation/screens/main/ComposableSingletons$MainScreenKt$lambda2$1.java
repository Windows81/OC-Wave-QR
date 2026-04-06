package com.hansecom.abt.presentation.screens.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.main.ComposableSingletons$MainScreenKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$MainScreenKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MainScreenKt$lambda2$1 f37537z = new ComposableSingletons$MainScreenKt$lambda2$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-256018591, i2, -1, "com.hansecom.abt.presentation.screens.main.ComposableSingletons$MainScreenKt.lambda-2.<anonymous> (MainScreen.kt:159)");
            }
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
