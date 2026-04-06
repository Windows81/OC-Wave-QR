package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MenuItemKt$MenuItemRow$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f38486A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f38487B;
    public final /* synthetic */ Function3 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38488z;

    public MenuItemKt$MenuItemRow$1(Modifier modifier, float f2, PaddingValues paddingValues, Function3 function3) {
        this.f38488z = modifier;
        this.f38486A = f2;
        this.f38487B = paddingValues;
        this.C = function3;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2076929333, i2, -1, "com.hansecom.abt.ui.components.listItem.MenuItemRow.<anonymous> (MenuItem.kt:103)");
            }
            Modifier h2 = PaddingKt.h(SizeKt.h(SizeKt.b(this.f38488z, 0.0f, this.f38486A, 1, (Object) null), 0.0f, 1, (Object) null), this.f38487B);
            Alignment.Vertical i3 = Alignment.f15444a.i();
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m((float) 16));
            Function3 function3 = this.C;
            MeasurePolicy b2 = RowKt.b(n2, i3, composer, 54);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, h2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a3);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            Updater.g(b3, b2, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion.d());
            function3.d(RowScopeInstance.f4150a, composer, 6);
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
