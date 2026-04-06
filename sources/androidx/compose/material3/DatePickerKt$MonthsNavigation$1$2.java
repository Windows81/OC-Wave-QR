package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DatePickerKt$MonthsNavigation$1$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f9751A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f9752B;
    public final /* synthetic */ boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f9753z;

    public DatePickerKt$MonthsNavigation$1$2(Function0 function0, boolean z2, Function0 function02, boolean z3) {
        this.f9753z = function0;
        this.f9751A = z2;
        this.f9752B = function02;
        this.C = z3;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, 1 & i3)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-128317193, i3, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2220)");
            }
            Function0 function0 = this.f9753z;
            boolean z2 = this.f9751A;
            Function0 function02 = this.f9752B;
            boolean z3 = this.C;
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
            Icons.AutoMirrored.Filled filled = Icons.AutoMirrored.Filled.f12253a;
            ImageVector a4 = filled.a();
            Strings.Companion companion3 = Strings.f12320b;
            Composer composer3 = composer;
            DatePickerKt.S(function0, a4, Strings_androidKt.b(Strings.a(R.string.f10675v), composer, 0), (Modifier) null, z2, composer3, 0, 8);
            DatePickerKt.S(function02, filled.b(), Strings_androidKt.b(Strings.a(R.string.f10674u), composer, 0), (Modifier) null, z3, composer3, 0, 8);
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
