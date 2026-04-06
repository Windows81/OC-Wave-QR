package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TimePickerKt$ClockDisplayNumbers$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f11487A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TimePickerState f11488z;

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-477913269, i2, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1179)");
            }
            TimePickerState timePickerState = this.f11488z;
            TimePickerColors timePickerColors = this.f11487A;
            Modifier.Companion companion = Modifier.f15489d;
            MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.f(), Alignment.f15444a.l(), composer, 0);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, companion);
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
            Composer b3 = Updater.b(composer);
            Updater.g(b3, b2, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion2.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            TimePickerTokens timePickerTokens = TimePickerTokens.f14264a;
            Modifier v2 = SizeKt.v(companion, timePickerTokens.h(), timePickerTokens.f());
            int y0 = TimePickerKt.y0(timePickerState);
            TimePickerSelectionMode.Companion companion3 = TimePickerSelectionMode.f11521b;
            TimePickerState timePickerState2 = timePickerState;
            TimePickerColors timePickerColors2 = timePickerColors;
            Composer composer2 = composer;
            TimePickerKt.S(v2, y0, timePickerState2, companion3.a(), timePickerColors2, composer2, 3078);
            TimePickerKt.F(SizeKt.v(companion, TimePickerKt.f11472e, timePickerTokens.e()), composer, 6);
            TimePickerKt.S(SizeKt.v(companion, timePickerTokens.h(), timePickerTokens.f()), timePickerState.c(), timePickerState2, companion3.b(), timePickerColors2, composer2, 3078);
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
