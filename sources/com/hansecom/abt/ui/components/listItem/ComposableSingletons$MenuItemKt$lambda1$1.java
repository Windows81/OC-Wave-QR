package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ChevronRightKt;
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
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.listItem.ComposableSingletons$MenuItemKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$MenuItemKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MenuItemKt$lambda1$1 f38463z = new ComposableSingletons$MenuItemKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2101284758, i3, -1, "com.hansecom.abt.ui.components.listItem.ComposableSingletons$MenuItemKt.lambda-1.<anonymous> (MenuItem.kt:151)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a4);
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
            VectorPainter h2 = VectorPainterKt.h(HouseKt.a(outlined), composer2, 0);
            VectorPainter h3 = VectorPainterKt.h(ChevronRightKt.a(outlined), composer2, 0);
            int i4 = VectorPainter.M;
            Composer composer3 = composer;
            MenuItemKt.h("Title", (Modifier) null, 0.0f, (PaddingValues) null, (Function0) null, h2, h3, false, false, false, "Subtitle", composer3, (i4 << 15) | 6 | (i4 << 18), 6, 926);
            MenuItemKt.h("Item with divider", (Modifier) null, 0.0f, (PaddingValues) null, (Function0) null, VectorPainterKt.h(HouseKt.a(outlined), composer2, 0), (Painter) null, false, true, false, (String) null, composer3, (i4 << 15) | 100663302, 0, 1758);
            MenuItemKt.h("Item without icons", (Modifier) null, 0.0f, (PaddingValues) null, (Function0) null, (Painter) null, (Painter) null, false, false, false, (String) null, composer3, 196614, 0, 2014);
            MenuItemKt.h("Disabled item", (Modifier) null, 0.0f, (PaddingValues) null, (Function0) null, (Painter) null, (Painter) null, false, false, false, (String) null, composer3, 805306374, 0, 1534);
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
