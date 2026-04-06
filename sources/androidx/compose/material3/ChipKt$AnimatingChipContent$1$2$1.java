package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
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

@Metadata
public final class ChipKt$AnimatingChipContent$1$2$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9416A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f9417B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f9418z;

    public ChipKt$AnimatingChipContent$1$2$1(Function2 function2, Function2 function22, long j2) {
        this.f9418z = function2;
        this.f9416A = function22;
        this.f9417B = j2;
    }

    public final void b(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(687705959, i2, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous>.<anonymous>.<anonymous> (Chip.kt:2145)");
        }
        State k2 = ChipKt.n(ChipKt.m(this.f9418z, this.f9416A, this.f9417B, composer, 0), composer, 0);
        Alignment e2 = Alignment.f15444a.e();
        Modifier.Companion companion = Modifier.f15489d;
        MeasurePolicy g2 = BoxKt.g(e2, false);
        int a2 = ComposablesKt.a(composer, 0);
        CompositionLocalMap I = composer.I();
        Modifier e3 = ComposedModifierKt.e(composer, companion);
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
        Composer b2 = Updater.b(composer);
        Updater.g(b2, g2, companion2.c());
        Updater.g(b2, I, companion2.e());
        Function2 b3 = companion2.b();
        if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
            b2.N(Integer.valueOf(a2));
            b2.A(Integer.valueOf(a2), b3);
        }
        Updater.g(b2, e3, companion2.d());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
        Function2 function2 = (Function2) k2.getValue();
        if (function2 == null) {
            composer.X(-1538103400);
        } else {
            composer.X(-326710903);
            function2.m(composer, 0);
        }
        composer.M();
        composer.T();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
