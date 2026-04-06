package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ButtonKt$Button$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f9324A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f9325B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f9326z;

    public ButtonKt$Button$2(long j2, PaddingValues paddingValues, Function3 function3) {
        this.f9326z = j2;
        this.f9324A = paddingValues;
        this.f9325B = function3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-535639973, i2, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:138)");
            }
            long j2 = this.f9326z;
            TextStyle s2 = MaterialTheme.f10273a.e(composer, 6).s();
            final PaddingValues paddingValues = this.f9324A;
            final Function3 function3 = this.f9325B;
            ProvideContentColorTextStyleKt.b(j2, s2, ComposableLambdaKt.e(417635459, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(417635459, i2, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:142)");
                        }
                        Modifier.Companion companion = Modifier.f15489d;
                        ButtonDefaults buttonDefaults = ButtonDefaults.f9301a;
                        Modifier h2 = PaddingKt.h(SizeKt.a(companion, buttonDefaults.i(), buttonDefaults.h()), paddingValues);
                        Arrangement.HorizontalOrVertical b2 = Arrangement.f3739a.b();
                        Alignment.Vertical i3 = Alignment.f15444a.i();
                        Function3 function3 = function3;
                        MeasurePolicy b3 = RowKt.b(b2, i3, composer, 54);
                        int a2 = ComposablesKt.a(composer, 0);
                        CompositionLocalMap I = composer.I();
                        Modifier e2 = ComposedModifierKt.e(composer, h2);
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
                        Composer b4 = Updater.b(composer);
                        Updater.g(b4, b3, companion2.c());
                        Updater.g(b4, I, companion2.e());
                        Function2 b5 = companion2.b();
                        if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a2))) {
                            b4.N(Integer.valueOf(a2));
                            b4.A(Integer.valueOf(a2), b5);
                        }
                        Updater.g(b4, e2, companion2.d());
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
