package com.hansecom.abt.ui.components.listItem;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GroupMenuItemKt$GroupMenuItem$1$4 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f38479z;

    public GroupMenuItemKt$GroupMenuItem$1$4(Function3 function3) {
        this.f38479z = function3;
    }

    public final void b(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        Intrinsics.i(animatedVisibilityScope, "$this$AnimatedVisibility");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1345123995, i2, -1, "com.hansecom.abt.ui.components.listItem.GroupMenuItem.<anonymous>.<anonymous> (GroupMenuItem.kt:77)");
        }
        Modifier m2 = PaddingKt.m(Modifier.f15489d, 0.0f, Dp.m((float) 4), 0.0f, 0.0f, 13, (Object) null);
        Function3 function3 = this.f38479z;
        MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer, 0);
        int a3 = ComposablesKt.a(composer, 0);
        CompositionLocalMap I = composer.I();
        Modifier e2 = ComposedModifierKt.e(composer, m2);
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
        function3.d(ColumnScopeInstance.f3815a, composer, 6);
        composer.T();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
