package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.listItem.ComposableSingletons$GroupMenuItemKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$GroupMenuItemKt$lambda2$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$GroupMenuItemKt$lambda2$1 f38454z = new ComposableSingletons$GroupMenuItemKt$lambda2$1();

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        int i3 = i2;
        Intrinsics.i(columnScope, "$this$GroupMenuItem");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1843222763, i3, -1, "com.hansecom.abt.ui.components.listItem.ComposableSingletons$GroupMenuItemKt.lambda-2.<anonymous> (GroupMenuItem.kt:104)");
            }
            MenuItemKt.h("SubItem", (Modifier) null, 0.0f, (PaddingValues) null, (Function0) null, (Painter) null, (Painter) null, false, false, false, (String) null, composer, 6, 0, 2046);
            MenuItemKt.h("SubItem", (Modifier) null, 0.0f, (PaddingValues) null, (Function0) null, (Painter) null, (Painter) null, false, false, false, (String) null, composer, 6, 0, 2046);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
