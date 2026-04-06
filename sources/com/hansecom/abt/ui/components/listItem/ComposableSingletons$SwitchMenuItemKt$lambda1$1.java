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
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.listItem.ComposableSingletons$SwitchMenuItemKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$SwitchMenuItemKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$SwitchMenuItemKt$lambda1$1 f38474z = new ComposableSingletons$SwitchMenuItemKt$lambda1$1();

    /* access modifiers changed from: private */
    public static final Unit f(boolean z2) {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g(boolean z2) {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1013828074, i2, -1, "com.hansecom.abt.ui.components.listItem.ComposableSingletons$SwitchMenuItemKt.lambda-1.<anonymous> (SwitchMenuItem.kt:65)");
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
            composer.X(-1658090728);
            Object g2 = composer.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g2 == companion3.a()) {
                g2 = new f();
                composer.N(g2);
            }
            composer.M();
            int i3 = VectorPainter.M;
            SwitchMenuItemKt.b("Title", (Function1) g2, (Modifier) null, h2, true, false, false, composer, (i3 << 9) | 24630, 100);
            VectorPainter h3 = VectorPainterKt.h(HouseKt.a(outlined), composer, 0);
            composer.X(-1658083240);
            Object g3 = composer.g();
            if (g3 == companion3.a()) {
                g3 = new g();
                composer.N(g3);
            }
            composer.M();
            SwitchMenuItemKt.b("Title", (Function1) g3, (Modifier) null, h3, false, false, false, composer, (i3 << 9) | 24630, 100);
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
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
