package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.listItem.ComposableSingletons$MenuItemKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$MenuItemKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MenuItemKt$lambda2$1 f38464z = new ComposableSingletons$MenuItemKt$lambda2$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1274994319, i2, -1, "com.hansecom.abt.ui.components.listItem.ComposableSingletons$MenuItemKt.lambda-2.<anonymous> (MenuItem.kt:150)");
            }
            SurfaceKt.c((Modifier) null, (Shape) null, 0, 0, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$MenuItemKt.f38460a.a(), composer, 12582912, 127);
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
