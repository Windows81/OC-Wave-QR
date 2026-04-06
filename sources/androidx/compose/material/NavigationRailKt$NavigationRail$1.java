package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
public final class NavigationRailKt$NavigationRail$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f8050A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f8051B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f8052z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRail$1(WindowInsets windowInsets, Function3 function3, Function3 function32) {
        super(2);
        this.f8052z = windowInsets;
        this.f8050A = function3;
        this.f8051B = function32;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-245908831, i2, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:116)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier a2 = SelectableGroupKt.a(PaddingKt.k(WindowInsetsPaddingKt.e(SizeKt.d(companion, 0.0f, 1, (Object) null), this.f8052z), 0.0f, NavigationRailKt.f8045d, 1, (Object) null));
            Alignment.Horizontal g2 = Alignment.f15444a.g();
            Function3 function3 = this.f8050A;
            Function3 function32 = this.f8051B;
            MeasurePolicy a3 = ColumnKt.a(Arrangement.f3739a.g(), g2, composer, 48);
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
            if (function3 != null) {
                composer.X(-1453937351);
                function3.d(columnScopeInstance, composer, 6);
                SpacerKt.a(SizeKt.i(companion, NavigationRailKt.f8046e), composer, 6);
                composer.M();
            } else {
                composer.X(-1453846056);
                composer.M();
            }
            function32.d(columnScopeInstance, composer, 6);
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
