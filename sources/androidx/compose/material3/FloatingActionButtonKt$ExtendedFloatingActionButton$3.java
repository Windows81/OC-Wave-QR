package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.FabBaselineTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FloatingActionButtonKt$ExtendedFloatingActionButton$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10055A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f10056B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f10057z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(632971498, i3, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:401)");
            }
            Modifier m2 = PaddingKt.m(SizeKt.x(Modifier.f15489d, this.f10057z ? FloatingActionButtonKt.f10053v : FabBaselineTokens.f13183a.a(), 0.0f, 0.0f, 0.0f, 14, (Object) null), this.f10057z ? FloatingActionButtonKt.f10050s : Dp.m((float) 0), 0.0f, this.f10057z ? FloatingActionButtonKt.f10052u : Dp.m((float) 0), 0.0f, 10, (Object) null);
            Alignment.Vertical i4 = Alignment.f15444a.i();
            Arrangement.Horizontal f2 = this.f10057z ? Arrangement.f3739a.f() : Arrangement.f3739a.b();
            Function2 function2 = this.f10055A;
            boolean z2 = this.f10057z;
            Function2 function22 = this.f10056B;
            MeasurePolicy b2 = RowKt.b(f2, i4, composer2, 48);
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
            function2.m(composer2, 0);
            AnimatedVisibilityKt.i(rowScopeInstance, z2, (Modifier) null, FloatingActionButtonKt.h(composer2, 0), FloatingActionButtonKt.g(composer2, 0), (String) null, ComposableLambdaKt.e(-660008666, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1(function22), composer2, 54), composer, 1572870, 18);
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
