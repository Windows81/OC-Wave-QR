package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.listItem.ComposableSingletons$GroupMenuItemKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$GroupMenuItemKt$lambda1$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$GroupMenuItemKt$lambda1$1 f38453z = new ComposableSingletons$GroupMenuItemKt$lambda1$1();

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Intrinsics.i(columnScope, "$this$GroupMenuItem");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1360823618, i2, -1, "com.hansecom.abt.ui.components.listItem.ComposableSingletons$GroupMenuItemKt.lambda-1.<anonymous> (GroupMenuItem.kt:98)");
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
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
