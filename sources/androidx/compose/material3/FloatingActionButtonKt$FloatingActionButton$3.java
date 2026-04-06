package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
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
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FloatingActionButtonKt$FloatingActionButton$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextStyle f10064A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f10065B;
    public final /* synthetic */ float C;
    public final /* synthetic */ Function2 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f10066z;

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1779603465, i2, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:158)");
            }
            long j2 = this.f10066z;
            TextStyle textStyle = this.f10064A;
            final float f2 = this.f10065B;
            final float f3 = this.C;
            final Function2 function2 = this.D;
            ProvideContentColorTextStyleKt.b(j2, textStyle, ComposableLambdaKt.e(-1767363041, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, 1 & i2)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1767363041, i2, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:159)");
                        }
                        Modifier a2 = SizeKt.a(Modifier.f15489d, f2, f3);
                        Alignment e2 = Alignment.f15444a.e();
                        Function2 function2 = function2;
                        MeasurePolicy g2 = BoxKt.g(e2, false);
                        int a3 = ComposablesKt.a(composer, 0);
                        CompositionLocalMap I = composer.I();
                        Modifier e3 = ComposedModifierKt.e(composer, a2);
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
                        Updater.g(b2, g2, companion.c());
                        Updater.g(b2, I, companion.e());
                        Function2 b3 = companion.b();
                        if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                            b2.N(Integer.valueOf(a3));
                            b2.A(Integer.valueOf(a3), b3);
                        }
                        Updater.g(b2, e3, companion.d());
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
            }, composer, 54), composer, 384);
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
