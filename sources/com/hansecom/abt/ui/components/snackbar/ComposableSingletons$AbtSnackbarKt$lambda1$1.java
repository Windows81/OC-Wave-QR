package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.snackbar.ComposableSingletons$AbtSnackbarKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AbtSnackbarKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtSnackbarKt$lambda1$1 f38806z = new ComposableSingletons$AbtSnackbarKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(769900850, i2, -1, "com.hansecom.abt.ui.components.snackbar.ComposableSingletons$AbtSnackbarKt.lambda-1.<anonymous> (AbtSnackbar.kt:122)");
            }
            IconKt.e(CloseKt.a(Icons.Filled.f8953a), "Dismiss", (Modifier) null, 0, composer, 48, 12);
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
