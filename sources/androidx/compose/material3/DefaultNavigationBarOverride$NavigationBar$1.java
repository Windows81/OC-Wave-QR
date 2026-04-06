package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DefaultNavigationBarOverride$NavigationBar$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavigationBarOverrideScope f9839z;

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1991263321, i2, -1, "androidx.compose.material3.DefaultNavigationBarOverride.NavigationBar.<anonymous> (NavigationBar.kt:146)");
            }
            Modifier a2 = SelectableGroupKt.a(SizeKt.b(WindowInsetsPaddingKt.e(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), this.f9839z.b()), 0.0f, NavigationBarKt.f10403a, 1, (Object) null));
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(NavigationBarKt.j());
            Alignment.Vertical i3 = Alignment.f15444a.i();
            Function3 a3 = this.f9839z.a();
            MeasurePolicy b2 = RowKt.b(n2, i3, composer, 54);
            int a4 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, a2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a5 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a5);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            Updater.g(b3, b2, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a4))) {
                b3.N(Integer.valueOf(a4));
                b3.A(Integer.valueOf(a4), b4);
            }
            Updater.g(b3, e2, companion.d());
            a3.d(RowScopeInstance.f4150a, composer, 6);
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
