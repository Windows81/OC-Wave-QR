package com.hansecom.abt.presentation.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.main.MainScreenKt;
import com.hansecom.abt.presentation.screens.main.MainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.main.ComposableSingletons$MainActivityKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$MainActivityKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MainActivityKt$lambda1$1 f34165z = new ComposableSingletons$MainActivityKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1912273467, i2, -1, "com.hansecom.abt.presentation.main.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:82)");
            }
            MainScreenKt.j((MainViewModel) null, composer, 0, 1);
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
