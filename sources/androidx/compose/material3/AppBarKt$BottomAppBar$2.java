package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AppBarKt$BottomAppBar$2 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9193A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f9194z;

    public final void b(RowScope rowScope, Composer composer, int i2) {
        int i3;
        Composer composer2 = composer;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.W(rowScope) ? 4 : 2);
        } else {
            RowScope rowScope2 = rowScope;
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1943077286, i3, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:1119)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier c2 = RowScope.c(rowScope, companion, 1.0f, false, 2, (Object) null);
            Arrangement.Horizontal f2 = Arrangement.f3739a.f();
            Alignment.Companion companion2 = Alignment.f15444a;
            Alignment.Vertical i4 = companion2.i();
            Function3 function3 = this.f9194z;
            MeasurePolicy b2 = RowKt.b(f2, i4, composer2, 54);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, c2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            Updater.g(b3, b2, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            function3.d(RowScopeInstance.f4150a, composer2, 6);
            composer.T();
            if (this.f9193A != null) {
                composer2.X(1354051795);
                Modifier m2 = PaddingKt.m(SizeKt.d(companion, 0.0f, 1, (Object) null), 0.0f, AppBarKt.f9185d, AppBarKt.f9184c, 0.0f, 9, (Object) null);
                Alignment o2 = companion2.o();
                Function2 function2 = this.f9193A;
                MeasurePolicy g2 = BoxKt.g(o2, false);
                int a4 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I2 = composer.I();
                Modifier e3 = ComposedModifierKt.e(composer2, m2);
                Function0 a5 = companion3.a();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer2.y(a5);
                } else {
                    composer.K();
                }
                Composer b5 = Updater.b(composer);
                Updater.g(b5, g2, companion3.c());
                Updater.g(b5, I2, companion3.e());
                Function2 b6 = companion3.b();
                if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a4))) {
                    b5.N(Integer.valueOf(a4));
                    b5.A(Integer.valueOf(a4), b6);
                }
                Updater.g(b5, e3, companion3.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                function2.m(composer2, 0);
                composer.T();
                composer.M();
            } else {
                composer2.X(1354317992);
                composer.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
