package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.ShortNavigationBarArrangement;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DefaultShortNavigationBarOverride$ShortNavigationBar$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ShortNavigationBarOverrideScope f9843z;

    public final void b(Composer composer, int i2) {
        Object obj;
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(236236519, i2, -1, "androidx.compose.material3.DefaultShortNavigationBarOverride.ShortNavigationBar.<anonymous> (ShortNavigationBar.kt:124)");
            }
            Modifier a2 = SelectableGroupKt.a(SizeKt.b(WindowInsetsPaddingKt.e(Modifier.f15489d, this.f9843z.c()), 0.0f, NavigationBarTokens.f13572a.a(), 1, (Object) null));
            Function2 b2 = this.f9843z.b();
            int a3 = this.f9843z.a();
            ShortNavigationBarArrangement.Companion companion = ShortNavigationBarArrangement.f11014b;
            if (ShortNavigationBarArrangement.e(a3, companion.b())) {
                obj = new EqualWeightContentMeasurePolicy();
            } else if (ShortNavigationBarArrangement.e(a3, companion.a())) {
                obj = new CenteredContentMeasurePolicy();
            } else {
                throw new IllegalArgumentException("Invalid ItemsArrangement value.");
            }
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
            Composer b3 = Updater.b(composer);
            Updater.g(b3, obj, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a4))) {
                b3.N(Integer.valueOf(a4));
                b3.A(Integer.valueOf(a4), b4);
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
