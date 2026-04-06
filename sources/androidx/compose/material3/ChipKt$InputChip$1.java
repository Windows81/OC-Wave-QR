package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ChipKt$InputChip$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f9427A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9428B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f9429z;

    public static final Unit e(float f2, Shape shape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.d(f2);
        graphicsLayerScope.s1(shape);
        graphicsLayerScope.R(true);
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-570452295, i2, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:654)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            boolean h2 = composer.h(this.f9429z) | composer.W(this.f9427A);
            float f2 = this.f9429z;
            Shape shape = this.f9427A;
            Object g2 = composer.g();
            if (h2 || g2 == Composer.f14567a.a()) {
                g2 = new C0181m0(f2, shape);
                composer.N(g2);
            }
            Modifier a2 = GraphicsLayerModifierKt.a(companion, (Function1) g2);
            Alignment e2 = Alignment.f15444a.e();
            Function2 function2 = this.f9428B;
            MeasurePolicy g3 = BoxKt.g(e2, false);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer, a2);
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
            Updater.g(b2, g3, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e3, companion2.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function2.m(composer, 0);
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
