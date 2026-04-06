package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.listItem.ComposableSingletons$MenuItemListKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$MenuItemListKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MenuItemListKt$lambda1$1 f38467z = new ComposableSingletons$MenuItemListKt$lambda1$1();

    public static final Unit e(MenuItemState menuItemState) {
        Intrinsics.i(menuItemState, "it");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1189614431, i3, -1, "com.hansecom.abt.ui.components.listItem.ComposableSingletons$MenuItemListKt.lambda-1.<anonymous> (MenuItemList.kt:95)");
            }
            Modifier i4 = PaddingKt.i(Modifier.f15489d, Dp.m((float) 16));
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), false);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, i4);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            MenuItemListState menuItemListState = new MenuItemListState(ExtensionsKt.b(new MenuItemState.Text(new StringValue.Value("Item1"), (StringValue) null, "user", (String) null, (String) null, (String) null, false, ModuleDescriptor.MODULE_VERSION, (DefaultConstructorMarker) null), new MenuItemState.Text(new StringValue.Value("Item2"), (StringValue) null, (String) null, "chevron-right", (String) null, (String) null, false, 118, (DefaultConstructorMarker) null), new MenuItemState.Text(new StringValue.Value("Item3"), (StringValue) null, (String) null, (String) null, (String) null, (String) null, false, 126, (DefaultConstructorMarker) null)));
            composer2.X(-525019090);
            Object g3 = composer.g();
            if (g3 == Composer.f14567a.a()) {
                g3 = new c();
                composer2.N(g3);
            }
            composer.M();
            MenuItemListKt.j(menuItemListState, (Function1) g3, (Modifier) null, false, composer, 48, 12);
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
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
