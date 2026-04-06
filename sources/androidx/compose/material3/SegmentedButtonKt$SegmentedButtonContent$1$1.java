package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class SegmentedButtonKt$SegmentedButtonContent$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10939A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f10940B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10941z;

    public SegmentedButtonKt$SegmentedButtonContent$1$1(Function2 function2, Function2 function22, FiniteAnimationSpec finiteAnimationSpec) {
        this.f10941z = function2;
        this.f10939A = function22;
        this.f10940B = finiteAnimationSpec;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1372614088, i2, -1, "androidx.compose.material3.SegmentedButtonContent.<anonymous>.<anonymous> (SegmentedButton.kt:392)");
            }
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, composer);
                composer.N(g2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) g2;
            FiniteAnimationSpec finiteAnimationSpec = this.f10940B;
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new SegmentedButtonContentMeasurePolicy(coroutineScope, finiteAnimationSpec);
                composer.N(g3);
            }
            SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy = (SegmentedButtonContentMeasurePolicy) g3;
            Modifier a2 = IntrinsicKt.a(Modifier.f15489d, IntrinsicSize.Min);
            Function2 b2 = LayoutKt.b(CollectionsKt.p(this.f10941z, this.f10939A));
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = MultiContentMeasurePolicyKt.a(segmentedButtonContentMeasurePolicy);
                composer.N(g4);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g4;
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, a2);
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
            Composer b3 = Updater.b(composer);
            Updater.g(b3, measurePolicy, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
                b3.N(Integer.valueOf(a3));
                b3.A(Integer.valueOf(a3), b4);
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
