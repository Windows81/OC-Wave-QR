package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
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
public final class AppBarKt$AppBar$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f7149A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f7150B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7151z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$AppBar$1(WindowInsets windowInsets, PaddingValues paddingValues, Function3 function3) {
        super(2);
        this.f7151z = windowInsets;
        this.f7149A = paddingValues;
        this.f7150B = function3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(213273114, i2, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:712)");
            }
            ProvidedValue d2 = ContentAlphaKt.a().d(Float.valueOf(ContentAlpha.f7561a.d(composer, 6)));
            final WindowInsets windowInsets = this.f7151z;
            final PaddingValues paddingValues = this.f7149A;
            final Function3 function3 = this.f7150B;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(600325466, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(600325466, i2, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:713)");
                        }
                        Modifier i3 = SizeKt.i(PaddingKt.h(WindowInsetsPaddingKt.e(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), windowInsets), paddingValues), AppBarKt.f7142a);
                        Arrangement.Horizontal f2 = Arrangement.f3739a.f();
                        Alignment.Vertical i4 = Alignment.f15444a.i();
                        Function3 function3 = function3;
                        MeasurePolicy b2 = RowKt.b(f2, i4, composer, 54);
                        int a2 = ComposablesKt.a(composer, 0);
                        CompositionLocalMap I = composer.I();
                        Modifier e2 = ComposedModifierKt.e(composer, i3);
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

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
