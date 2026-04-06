package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.material3.SnackbarData;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.snackbar.ComposableSingletons$AbtSnackbarHostKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AbtSnackbarHostKt$lambda1$1 implements Function3<SnackbarData, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtSnackbarHostKt$lambda1$1 f38802z = new ComposableSingletons$AbtSnackbarHostKt$lambda1$1();

    public final void b(SnackbarData snackbarData, Composer composer, int i2) {
        Intrinsics.i(snackbarData, "snackbarData");
        if ((i2 & 6) == 0) {
            i2 |= composer.W(snackbarData) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-307092846, i2, -1, "com.hansecom.abt.ui.components.snackbar.ComposableSingletons$AbtSnackbarHostKt.lambda-1.<anonymous> (AbtSnackbarHost.kt:18)");
            }
            AbtSnackbarKt.d(snackbarData, composer, i2 & 14);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SnackbarData) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
