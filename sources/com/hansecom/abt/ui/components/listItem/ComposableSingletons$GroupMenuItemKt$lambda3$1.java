package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.HouseKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.listItem.ComposableSingletons$GroupMenuItemKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$GroupMenuItemKt$lambda3$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$GroupMenuItemKt$lambda3$1 f38455z = new ComposableSingletons$GroupMenuItemKt$lambda3$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-626588376, i2, -1, "com.hansecom.abt.ui.components.listItem.ComposableSingletons$GroupMenuItemKt.lambda-3.<anonymous> (GroupMenuItem.kt:94)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer, 0);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            Icons.Outlined outlined = Icons.Outlined.f8954a;
            VectorPainter h2 = VectorPainterKt.h(HouseKt.a(outlined), composer, 0);
            ComposableSingletons$GroupMenuItemKt composableSingletons$GroupMenuItemKt = ComposableSingletons$GroupMenuItemKt.f38448a;
            Function3 a5 = composableSingletons$GroupMenuItemKt.a();
            int i3 = VectorPainter.M;
            Composer composer2 = composer;
            GroupMenuItemKt.e("Collapsed group", (Modifier) null, h2, (Painter) null, false, false, a5, composer2, (i3 << 6) | 1572870, 58);
            GroupMenuItemKt.e("Expanded group", (Modifier) null, VectorPainterKt.h(HouseKt.a(outlined), composer, 0), (Painter) null, true, false, composableSingletons$GroupMenuItemKt.b(), composer2, (i3 << 6) | 1597446, 42);
            composer.T();
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
