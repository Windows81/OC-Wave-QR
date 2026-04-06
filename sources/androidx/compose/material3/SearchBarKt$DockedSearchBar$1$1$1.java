package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import kotlin.ranges.RangesKt;

@Metadata
public final class SearchBarKt$DockedSearchBar$1$1$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f10836A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10837z;

    public SearchBarKt$DockedSearchBar$1$1$1(SearchBarColors searchBarColors, Function3 function3) {
        this.f10837z = searchBarColors;
        this.f10836A = function3;
    }

    public final void b(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1224554113, i2, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:674)");
        }
        float m2 = Dp.m(SearchBar_androidKt.a(composer, 0) * 0.6666667f);
        Modifier j2 = SizeKt.j(Modifier.f15489d, ((Dp) RangesKt.l(Dp.j(SearchBarKt.K()), Dp.j(m2))).t(), m2);
        SearchBarColors searchBarColors = this.f10837z;
        Function3 function3 = this.f10836A;
        MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer, 0);
        int a3 = ComposablesKt.a(composer, 0);
        CompositionLocalMap I = composer.I();
        Modifier e2 = ComposedModifierKt.e(composer, j2);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
        DividerKt.e((Modifier) null, 0.0f, searchBarColors.b(), composer, 0, 3);
        function3.d(columnScopeInstance, composer, 6);
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
