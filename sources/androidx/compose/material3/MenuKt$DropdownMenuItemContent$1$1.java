package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
public final class MenuKt$DropdownMenuItemContent$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MenuItemColors f10302A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10303B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ RowScope D;
    public final /* synthetic */ Function2 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10304z;

    public MenuKt$DropdownMenuItemContent$1$1(Function2 function2, MenuItemColors menuItemColors, boolean z2, Function2 function22, RowScope rowScope, Function2 function23) {
        this.f10304z = function2;
        this.f10302A = menuItemColors;
        this.f10303B = z2;
        this.C = function22;
        this.D = rowScope;
        this.E = function23;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(865999929, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:450)");
            }
            if (this.f10304z != null) {
                composer.X(-864613220);
                ProvidedValue d2 = ContentColorKt.a().d(Color.h(this.f10302A.a(this.f10303B)));
                final Function2 function2 = this.f10304z;
                CompositionLocalKt.c(d2, ComposableLambdaKt.e(1241781204, true, new Function2<Composer, Integer, Unit>() {
                    public final void b(Composer composer, int i2) {
                        if (composer.E((i2 & 3) != 2, 1 & i2)) {
                            if (ComposerKt.P()) {
                                ComposerKt.Y(1241781204, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:454)");
                            }
                            Modifier b2 = SizeKt.b(Modifier.f15489d, ListTokens.f13495a.k(), 0.0f, 2, (Object) null);
                            Function2 function2 = function2;
                            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), false);
                            int a2 = ComposablesKt.a(composer, 0);
                            CompositionLocalMap I = composer.I();
                            Modifier e2 = ComposedModifierKt.e(composer, b2);
                            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
                            Function0 a3 = companion.a();
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
                            Updater.g(b3, g2, companion.c());
                            Updater.g(b3, I, companion.e());
                            Function2 b4 = companion.b();
                            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                                b3.N(Integer.valueOf(a2));
                                b3.A(Integer.valueOf(a2), b4);
                            }
                            Updater.g(b3, e2, companion.d());
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
                        b((Composer) obj, ((Number) obj2).intValue());
                        return Unit.f40552a;
                    }
                }, composer, 54), composer, ProvidedValue.f14769i | 48);
                composer.M();
            } else {
                composer.X(-864293207);
                composer.M();
            }
            ProvidedValue d3 = ContentColorKt.a().d(Color.h(this.f10302A.b(this.f10303B)));
            final RowScope rowScope = this.D;
            final Function2 function22 = this.f10304z;
            final Function2 function23 = this.C;
            final Function2 function24 = this.E;
            ComposableLambda e2 = ComposableLambdaKt.e(-893579015, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    Composer composer2 = composer;
                    int i3 = i2;
                    if (composer2.E((i3 & 3) != 2, 1 & i3)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-893579015, i3, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:460)");
                        }
                        Modifier m2 = PaddingKt.m(RowScope.c(rowScope, Modifier.f15489d, 1.0f, false, 2, (Object) null), function22 != null ? MenuKt.f10293c : Dp.m((float) 0), 0.0f, function23 != null ? MenuKt.f10293c : Dp.m((float) 0), 0.0f, 10, (Object) null);
                        Function2 function2 = function24;
                        MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), false);
                        int a2 = ComposablesKt.a(composer2, 0);
                        CompositionLocalMap I = composer.I();
                        Modifier e2 = ComposedModifierKt.e(composer2, m2);
                        ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
                        Function0 a3 = companion.a();
                        if (composer.v() == null) {
                            ComposablesKt.d();
                        }
                        composer.s();
                        if (composer.n()) {
                            composer2.y(a3);
                        } else {
                            composer.K();
                        }
                        Composer b2 = Updater.b(composer);
                        Updater.g(b2, g2, companion.c());
                        Updater.g(b2, I, companion.e());
                        Function2 b3 = companion.b();
                        if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                            b2.N(Integer.valueOf(a2));
                            b2.A(Integer.valueOf(a2), b3);
                        }
                        Updater.g(b2, e2, companion.d());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                        function2.m(composer2, 0);
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
            }, composer, 54);
            int i3 = ProvidedValue.f14769i;
            CompositionLocalKt.c(d3, e2, composer, i3 | 48);
            if (this.C != null) {
                composer.X(-863394951);
                ProvidedValue d4 = ContentColorKt.a().d(Color.h(this.f10302A.c(this.f10303B)));
                final Function2 function25 = this.C;
                CompositionLocalKt.c(d4, ComposableLambdaKt.e(-782441013, true, new Function2<Composer, Integer, Unit>() {
                    public final void b(Composer composer, int i2) {
                        if (composer.E((i2 & 3) != 2, 1 & i2)) {
                            if (ComposerKt.P()) {
                                ComposerKt.Y(-782441013, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:484)");
                            }
                            Modifier b2 = SizeKt.b(Modifier.f15489d, ListTokens.f13495a.q(), 0.0f, 2, (Object) null);
                            Function2 function2 = function25;
                            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), false);
                            int a2 = ComposablesKt.a(composer, 0);
                            CompositionLocalMap I = composer.I();
                            Modifier e2 = ComposedModifierKt.e(composer, b2);
                            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
                            Function0 a3 = companion.a();
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
                            Updater.g(b3, g2, companion.c());
                            Updater.g(b3, I, companion.e());
                            Function2 b4 = companion.b();
                            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                                b3.N(Integer.valueOf(a2));
                                b3.A(Integer.valueOf(a2), b4);
                            }
                            Updater.g(b3, e2, companion.d());
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
                        b((Composer) obj, ((Number) obj2).intValue());
                        return Unit.f40552a;
                    }
                }, composer, 54), composer, i3 | 48);
                composer.M();
            } else {
                composer.X(-863072055);
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

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
