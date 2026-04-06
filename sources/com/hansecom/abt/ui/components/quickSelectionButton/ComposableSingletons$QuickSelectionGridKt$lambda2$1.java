package com.hansecom.abt.ui.components.quickSelectionButton;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.quickSelectionButton.ComposableSingletons$QuickSelectionGridKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$QuickSelectionGridKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$QuickSelectionGridKt$lambda2$1 f38755z = new ComposableSingletons$QuickSelectionGridKt$lambda2$1();

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-336041430, i3, -1, "com.hansecom.abt.ui.components.quickSelectionButton.ComposableSingletons$QuickSelectionGridKt.lambda-2.<anonymous> (QuickSelectionGrid.kt:90)");
            }
            SurfaceKt.c(SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), (Shape) null, 0, 0, 0.0f, 0.0f, (BorderStroke) null, ComposableSingletons$QuickSelectionGridKt.f38751a.a(), composer, 12582918, 126);
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
