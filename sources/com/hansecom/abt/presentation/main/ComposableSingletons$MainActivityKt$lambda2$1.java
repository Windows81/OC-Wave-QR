package com.hansecom.abt.presentation.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.ui.theme.AbtThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.main.ComposableSingletons$MainActivityKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$MainActivityKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MainActivityKt$lambda2$1 f34166z = new ComposableSingletons$MainActivityKt$lambda2$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1391097431, i2, -1, "com.hansecom.abt.presentation.main.ComposableSingletons$MainActivityKt.lambda-2.<anonymous> (MainActivity.kt:81)");
            }
            AbtThemeKt.b(false, ComposableSingletons$MainActivityKt.f34162a.a(), composer, 48, 1);
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
