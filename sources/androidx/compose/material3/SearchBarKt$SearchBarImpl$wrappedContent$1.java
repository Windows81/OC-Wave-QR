package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SearchBarKt$SearchBarImpl$wrappedContent$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10874A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f10875B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Animatable f10876z;

    /* access modifiers changed from: private */
    public static final Unit e(Animatable animatable, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.d(((Number) animatable.m()).floatValue());
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1831594093, i2, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.kt:2135)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            boolean l2 = composer.l(this.f10876z);
            Animatable animatable = this.f10876z;
            Object g2 = composer.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new G5(animatable);
                composer.N(g2);
            }
            Modifier a2 = GraphicsLayerModifierKt.a(companion, (Function1) g2);
            SearchBarColors searchBarColors = this.f10874A;
            Function3 function3 = this.f10875B;
            MeasurePolicy a3 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer, 0);
            int a4 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, a2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a5 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a5);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a3, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a4))) {
                b2.N(Integer.valueOf(a4));
                b2.A(Integer.valueOf(a4), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            DividerKt.e((Modifier) null, 0.0f, searchBarColors.b(), composer, 0, 3);
            function3.d(columnScopeInstance, composer, 6);
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
