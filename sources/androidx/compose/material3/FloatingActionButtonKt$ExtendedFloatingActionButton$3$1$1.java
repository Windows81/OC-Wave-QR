package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10058z;

    public FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1(Function2 function2) {
        this.f10058z = function2;
    }

    /* access modifiers changed from: private */
    public static final Unit e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public final void c(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-660008666, i2, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:424)");
        }
        Modifier.Companion companion = Modifier.f15489d;
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new Q2();
            composer.N(g2);
        }
        Modifier a2 = SemanticsModifierKt.a(companion, (Function1) g2);
        Function2 function2 = this.f10058z;
        MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.f(), Alignment.f15444a.l(), composer, 0);
        int a3 = ComposablesKt.a(composer, 0);
        CompositionLocalMap I = composer.I();
        Modifier e2 = ComposedModifierKt.e(composer, a2);
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
        Composer b3 = Updater.b(composer);
        Updater.g(b3, b2, companion2.c());
        Updater.g(b3, I, companion2.e());
        Function2 b4 = companion2.b();
        if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
            b3.N(Integer.valueOf(a3));
            b3.A(Integer.valueOf(a3), b4);
        }
        Updater.g(b3, e2, companion2.d());
        RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
        SpacerKt.a(SizeKt.y(companion, FloatingActionButtonKt.f10051t), composer, 6);
        function2.m(composer, 0);
        composer.T();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
