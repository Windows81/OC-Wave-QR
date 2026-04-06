package com.hansecom.abt.ui.components.quickSelectionButton;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.quickSelectionButton.ComposableSingletons$QuickSelectionButtonKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$QuickSelectionButtonKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$QuickSelectionButtonKt$lambda1$1 f38747z = new ComposableSingletons$QuickSelectionButtonKt$lambda1$1();

    public static final String g(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    public static final void h(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    public static final Unit i(List list, MutableState mutableState, LazyGridScope lazyGridScope) {
        Intrinsics.i(lazyGridScope, "$this$LazyVerticalGrid");
        lazyGridScope.c(list.size(), (Function1) null, (Function2) null, new ComposableSingletons$QuickSelectionButtonKt$lambda1$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$3(list), ComposableLambdaKt.c(1229287273, true, new ComposableSingletons$QuickSelectionButtonKt$lambda1$1$invoke$lambda$7$lambda$6$lambda$5$$inlined$itemsIndexed$default$4(list, mutableState)));
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1114329177, i3, -1, "com.hansecom.abt.ui.components.quickSelectionButton.ComposableSingletons$QuickSelectionButtonKt.lambda-1.<anonymous> (QuickSelectionButton.kt:89)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier f2 = SizeKt.f(companion, 0.0f, 1, (Object) null);
            Alignment.Companion companion2 = Alignment.f15444a;
            Alignment.Horizontal g2 = companion2.g();
            Arrangement arrangement = Arrangement.f3739a;
            MeasurePolicy a2 = ColumnKt.a(arrangement.g(), g2, composer2, 48);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, f2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a4 = companion3.a();
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
            Updater.g(b2, a2, companion3.c());
            Updater.g(b2, I, companion3.e());
            Function2 b3 = companion3.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            composer2.X(-493657968);
            Object g3 = composer.g();
            Composer.Companion companion4 = Composer.f14567a;
            if (g3 == companion4.a()) {
                g3 = SnapshotStateKt__SnapshotStateKt.e("10", (SnapshotMutationPolicy) null, 2, (Object) null);
                composer2.N(g3);
            }
            MutableState mutableState = (MutableState) g3;
            composer.M();
            List p2 = CollectionsKt.p("5", "10", "20");
            Modifier G = SizeKt.G(companion, (Alignment.Horizontal) null, false, 3, (Object) null);
            GridCells.Adaptive adaptive = new GridCells.Adaptive(Dp.m((float) 64), (DefaultConstructorMarker) null);
            float f3 = (float) 16;
            Arrangement.Horizontal o2 = arrangement.o(Dp.m(f3), companion2.g());
            Arrangement.Vertical p3 = arrangement.p(Dp.m(f3), companion2.i());
            composer2.X(-493641788);
            Object g4 = composer.g();
            if (g4 == companion4.a()) {
                g4 = new a(p2, mutableState);
                composer2.N(g4);
            }
            composer.M();
            LazyGridDslKt.c(adaptive, G, (LazyGridState) null, (PaddingValues) null, false, p3, o2, (FlingBehavior) null, false, (OverscrollEffect) null, (Function1) g4, composer, 1769520, 6, 924);
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
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
