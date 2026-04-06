package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
public final class AppBarKt$TopAppBar$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7164A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f7165B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7166z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBar$1(Function2 function2, Function2 function22, Function3 function3) {
        super(3);
        this.f7166z = function2;
        this.f7164A = function22;
        this.f7165B = function3;
    }

    public final void b(RowScope rowScope, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.W(rowScope) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1849684359, i2, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:103)");
            }
            if (this.f7166z == null) {
                composer.X(1108917613);
                SpacerKt.a(AppBarKt.f7144c, composer, 6);
                composer.M();
            } else {
                composer.X(1108983209);
                Modifier m2 = AppBarKt.f7145d;
                Alignment.Vertical i3 = Alignment.f15444a.i();
                Function2 function2 = this.f7166z;
                MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.f(), i3, composer, 48);
                int a2 = ComposablesKt.a(composer, 0);
                CompositionLocalMap I = composer.I();
                Modifier e2 = ComposedModifierKt.e(composer, m2);
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
                Updater.g(b3, b2, companion.c());
                Updater.g(b3, I, companion.e());
                Function2 b4 = companion.b();
                if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                    b3.N(Integer.valueOf(a2));
                    b3.A(Integer.valueOf(a2), b4);
                }
                Updater.g(b3, e2, companion.d());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
                CompositionLocalKt.c(ContentAlphaKt.a().d(Float.valueOf(ContentAlpha.f7561a.c(composer, 6))), function2, composer, ProvidedValue.f14769i);
                composer.T();
                composer.M();
            }
            Modifier c2 = RowScope.c(rowScope, SizeKt.d(Modifier.f15489d, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            Alignment.Vertical i4 = Alignment.f15444a.i();
            Function2 function22 = this.f7164A;
            MeasurePolicy b5 = RowKt.b(Arrangement.f3739a.f(), i4, composer, 48);
            int a4 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer, c2);
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
            Composer b6 = Updater.b(composer);
            Updater.g(b6, b5, companion2.c());
            Updater.g(b6, I2, companion2.e());
            Function2 b7 = companion2.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a4))) {
                b6.N(Integer.valueOf(a4));
                b6.A(Integer.valueOf(a4), b7);
            }
            Updater.g(b6, e3, companion2.d());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f4150a;
            TextKt.a(MaterialTheme.f7937a.c(composer, 6).e(), ComposableLambdaKt.e(-1654084516, true, new AppBarKt$TopAppBar$1$2$1(function22), composer, 54), composer, 48);
            composer.T();
            ProvidedValue d2 = ContentAlphaKt.a().d(Float.valueOf(ContentAlpha.f7561a.d(composer, 6)));
            final Function3 function3 = this.f7165B;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(2129753671, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(2129753671, i2, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:124)");
                        }
                        Modifier d2 = SizeKt.d(Modifier.f15489d, 0.0f, 1, (Object) null);
                        Arrangement.Horizontal c2 = Arrangement.f3739a.c();
                        Alignment.Vertical i3 = Alignment.f15444a.i();
                        Function3 function3 = function3;
                        MeasurePolicy b2 = RowKt.b(c2, i3, composer, 54);
                        int a2 = ComposablesKt.a(composer, 0);
                        CompositionLocalMap I = composer.I();
                        Modifier e2 = ComposedModifierKt.e(composer, d2);
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
                        Updater.g(b3, b2, companion.c());
                        Updater.g(b3, I, companion.e());
                        Function2 b4 = companion.b();
                        if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                            b3.N(Integer.valueOf(a2));
                            b3.A(Integer.valueOf(a2), b4);
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
            }, composer, 54), composer, ProvidedValue.f14769i | 48);
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
