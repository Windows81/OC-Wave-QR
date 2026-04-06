package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class NavigationDrawerKt$NavigationDrawerItem$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavigationDrawerItemColors f10451A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10452B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10453z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, 1 & i3)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1173018444, i3, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:1090)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier m2 = PaddingKt.m(companion, Dp.m((float) 16), 0.0f, Dp.m((float) 24), 0.0f, 10, (Object) null);
            Alignment.Companion companion2 = Alignment.f15444a;
            Alignment.Vertical i4 = companion2.i();
            Function2 function2 = this.f10453z;
            NavigationDrawerItemColors navigationDrawerItemColors = this.f10451A;
            boolean z2 = this.f10452B;
            Function2 function22 = this.C;
            Function2 function23 = this.D;
            MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.f(), i4, composer2, 48);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, m2);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            if (function2 != null) {
                composer2.X(-2013920011);
                CompositionLocalKt.c(ContentColorKt.a().d(Color.h(((Color) navigationDrawerItemColors.a(z2, composer2, 0).getValue()).v())), function2, composer2, ProvidedValue.f14769i);
                SpacerKt.a(SizeKt.y(companion, Dp.m((float) 12)), composer2, 6);
                composer.M();
            } else {
                composer2.X(-2013707630);
                composer.M();
            }
            Function2 function24 = function23;
            Modifier c2 = RowScope.c(rowScopeInstance, companion, 1.0f, false, 2, (Object) null);
            MeasurePolicy g2 = BoxKt.g(companion2.o(), false);
            int a4 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, c2);
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
            ProvidedValue d2 = ContentColorKt.a().d(Color.h(((Color) navigationDrawerItemColors.c(z2, composer2, 0).getValue()).v()));
            int i5 = ProvidedValue.f14769i;
            CompositionLocalKt.c(d2, function24, composer2, i5);
            composer.T();
            if (function22 != null) {
                composer2.X(-2013454639);
                SpacerKt.a(SizeKt.y(companion, Dp.m((float) 12)), composer2, 6);
                CompositionLocalKt.c(ContentColorKt.a().d(Color.h(((Color) navigationDrawerItemColors.b(z2, composer2, 0).getValue()).v())), function22, composer2, i5);
                composer.M();
            } else {
                composer2.X(-2013238414);
                composer.M();
            }
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
