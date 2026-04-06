package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
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
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomNavigationKt$BottomNavigation$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f7323A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7324z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigation$1(WindowInsets windowInsets, Function3 function3) {
        super(2);
        this.f7324z = windowInsets;
        this.f7323A = function3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-352628062, i2, -1, "androidx.compose.material.BottomNavigation.<anonymous> (BottomNavigation.kt:114)");
            }
            Modifier a2 = SelectableGroupKt.a(SizeKt.b(WindowInsetsPaddingKt.e(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), this.f7324z), 0.0f, BottomNavigationKt.f7319b, 1, (Object) null));
            Arrangement.HorizontalOrVertical d2 = Arrangement.f3739a.d();
            Function3 function3 = this.f7323A;
            MeasurePolicy b2 = RowKt.b(d2, Alignment.f15444a.l(), composer, 6);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, a2);
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
            Composer b3 = Updater.b(composer);
            Updater.g(b3, b2, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
                b3.N(Integer.valueOf(a3));
                b3.A(Integer.valueOf(a3), b4);
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
