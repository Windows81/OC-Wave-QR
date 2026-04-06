package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TimePickerDialogKt$TimePickerCustomLayout$content$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11451A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f11452B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f11453z;

    public TimePickerDialogKt$TimePickerCustomLayout$content$1(Function3 function3, Function2 function2, Function2 function22) {
        this.f11453z = function3;
        this.f11451A = function2;
        this.f11452B = function22;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(468305759, i2, -1, "androidx.compose.material3.TimePickerCustomLayout.<anonymous> (TimePickerDialog.kt:133)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier b2 = LayoutIdKt.b(companion, "title");
            Function2 function2 = this.f11451A;
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy g2 = BoxKt.g(companion2.o(), false);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, b2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
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
            Updater.g(b3, g2, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function2.m(composer, 0);
            composer.T();
            Modifier b5 = LayoutIdKt.b(companion, "actions");
            Function2 function22 = this.f11452B;
            MeasurePolicy g3 = BoxKt.g(companion2.o(), false);
            int a4 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer, b5);
            Function0 a5 = companion3.a();
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
            Updater.g(b6, g3, companion3.c());
            Updater.g(b6, I2, companion3.e());
            Function2 b7 = companion3.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a4))) {
                b6.N(Integer.valueOf(a4));
                b6.A(Integer.valueOf(a4), b7);
            }
            Updater.g(b6, e3, companion3.d());
            function22.m(composer, 0);
            composer.T();
            Modifier b8 = LayoutIdKt.b(companion, "timePickerContent");
            Function3 function3 = this.f11453z;
            MeasurePolicy a6 = ColumnKt.a(Arrangement.f3739a.g(), companion2.k(), composer, 0);
            int a7 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I3 = composer.I();
            Modifier e4 = ComposedModifierKt.e(composer, b8);
            Function0 a8 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a8);
            } else {
                composer.K();
            }
            Composer b9 = Updater.b(composer);
            Updater.g(b9, a6, companion3.c());
            Updater.g(b9, I3, companion3.e());
            Function2 b10 = companion3.b();
            if (b9.n() || !Intrinsics.d(b9.g(), Integer.valueOf(a7))) {
                b9.N(Integer.valueOf(a7));
                b9.A(Integer.valueOf(a7), b10);
            }
            Updater.g(b9, e4, companion3.d());
            function3.d(ColumnScopeInstance.f3815a, composer, 6);
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
