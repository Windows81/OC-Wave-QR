package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class SearchBarKt$DockedSearchBarLayout$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SearchBarState f10841A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10842B;
    public final /* synthetic */ Function3 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10843z;

    public SearchBarKt$DockedSearchBarLayout$2(Function2 function2, SearchBarState searchBarState, SearchBarColors searchBarColors, Function3 function3) {
        this.f10843z = function2;
        this.f10841A = searchBarState;
        this.f10842B = searchBarColors;
        this.C = function3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-956905210, i2, -1, "androidx.compose.material3.DockedSearchBarLayout.<anonymous> (SearchBar.kt:2335)");
            }
            float m2 = Dp.m(SearchBar_androidKt.a(composer, 0) * 0.6666667f);
            float t2 = ((Dp) RangesKt.l(Dp.j(SearchBarKt.K()), Dp.j(m2))).t();
            Function2 function2 = this.f10843z;
            final SearchBarColors searchBarColors = this.f10842B;
            final Function3 function3 = this.C;
            List p2 = CollectionsKt.p(function2, ComposableLambdaKt.e(-1776541672, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1776541672, i2, -1, "androidx.compose.material3.DockedSearchBarLayout.<anonymous>.<anonymous> (SearchBar.kt:2344)");
                        }
                        SearchBarColors searchBarColors = searchBarColors;
                        Function3 function3 = function3;
                        Modifier.Companion companion = Modifier.f15489d;
                        MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer, 0);
                        int a3 = ComposablesKt.a(composer, 0);
                        CompositionLocalMap I = composer.I();
                        Modifier e2 = ComposedModifierKt.e(composer, companion);
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
                        Updater.g(b2, a2, companion2.c());
                        Updater.g(b2, I, companion2.e());
                        Function2 b3 = companion2.b();
                        if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                            b2.N(Integer.valueOf(a3));
                            b2.A(Integer.valueOf(a3), b3);
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
                    b((Composer) obj, ((Number) obj2).intValue());
                    return Unit.f40552a;
                }
            }, composer, 54));
            boolean W = composer.W(this.f10841A) | composer.h(m2) | composer.h(t2);
            SearchBarState searchBarState = this.f10841A;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new SearchBarKt$DockedSearchBarLayout$2$2$1(searchBarState, m2, t2);
                composer.N(g2);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) g2;
            Modifier.Companion companion = Modifier.f15489d;
            Function2 b2 = LayoutKt.b(p2);
            boolean W2 = composer.W(multiContentMeasurePolicy);
            Object g3 = composer.g();
            if (W2 || g3 == Composer.f14567a.a()) {
                g3 = MultiContentMeasurePolicyKt.a(multiContentMeasurePolicy);
                composer.N(g3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g3;
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a3);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            Updater.g(b3, measurePolicy, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion2.d());
            b2.m(composer, 0);
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
