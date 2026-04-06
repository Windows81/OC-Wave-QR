package com.hansecom.abt.ui.components.abtTopBar;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.abtTopBar.ComposableSingletons$AbtTopBarKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AbtTopBarKt$lambda1$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtTopBarKt$lambda1$1 f37943z = new ComposableSingletons$AbtTopBarKt$lambda1$1();

    public final void b(RowScope rowScope, Composer composer, int i2) {
        Intrinsics.i(rowScope, "<this>");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1888896010, i2, -1, "com.hansecom.abt.ui.components.abtTopBar.ComposableSingletons$AbtTopBarKt.lambda-1.<anonymous> (AbtTopBar.kt:31)");
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
