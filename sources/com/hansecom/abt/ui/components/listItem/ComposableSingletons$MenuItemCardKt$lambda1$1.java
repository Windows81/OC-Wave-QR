package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.listItem.ComposableSingletons$MenuItemCardKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$MenuItemCardKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MenuItemCardKt$lambda1$1 f38459z = new ComposableSingletons$MenuItemCardKt$lambda1$1();

    /* access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1561582509, i3, -1, "com.hansecom.abt.ui.components.listItem.ComposableSingletons$MenuItemCardKt.lambda-1.<anonymous> (MenuItemCard.kt:50)");
            }
            Modifier i4 = PaddingKt.i(Modifier.f15489d, Dp.m((float) 16));
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.n(Dp.m((float) 8)), Alignment.f15444a.k(), composer, 6);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, i4);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
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
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            Icons.Outlined outlined = Icons.Outlined.f8954a;
            VectorPainter h2 = VectorPainterKt.h(HouseKt.a(outlined), composer, 0);
            VectorPainter h3 = VectorPainterKt.h(ChevronRightKt.a(outlined), composer, 0);
            composer.X(1475887100);
            Object g2 = composer.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g2 == companion2.a()) {
                g2 = new C0659a();
                composer.N(g2);
            }
            composer.M();
            int i5 = VectorPainter.M;
            MenuItemCardKt.b("Title", (Function0) g2, h2, (Modifier) null, h3, composer, (i5 << 6) | 54 | (i5 << 12), 8);
            VectorPainter h4 = VectorPainterKt.h(HouseKt.a(outlined), composer, 0);
            VectorPainter h5 = VectorPainterKt.h(ChevronRightKt.a(outlined), composer, 0);
            composer.X(1475896796);
            Object g3 = composer.g();
            if (g3 == companion2.a()) {
                g3 = new b();
                composer.N(g3);
            }
            composer.M();
            MenuItemCardKt.b("Long text text text text text text text text text text", (Function0) g3, h4, (Modifier) null, h5, composer, (i5 << 6) | 54 | (i5 << 12), 8);
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
