package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
final class DatePickerKt$DateEntryContainer$2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9711A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9712B;
    public final /* synthetic */ DatePickerColors C;
    public final /* synthetic */ TextStyle D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f9713z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1658370654, i3, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1371)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            Function2 function2 = this.f9713z;
            Function2 function22 = this.f9711A;
            Function2 function23 = this.f9712B;
            DatePickerColors datePickerColors = this.C;
            TextStyle textStyle = this.D;
            Arrangement arrangement = Arrangement.f3739a;
            Arrangement.Vertical g2 = arrangement.g();
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy a2 = ColumnKt.a(g2, companion2.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, h2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a4 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a2, companion3.c());
            Updater.g(b2, I, companion3.e());
            Function2 b3 = companion3.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            Arrangement.Horizontal f2 = (function2 == null || function22 == null) ? function2 != null ? arrangement.f() : arrangement.c() : arrangement.d();
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            MeasurePolicy b4 = RowKt.b(f2, companion2.i(), composer2, 48);
            int a5 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, h3);
            Function0 a6 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a6);
            } else {
                composer.K();
            }
            Composer b5 = Updater.b(composer);
            Updater.g(b5, b4, companion3.c());
            Updater.g(b5, I2, companion3.e());
            Function2 b6 = companion3.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                b5.N(Integer.valueOf(a5));
                b5.A(Integer.valueOf(a5), b6);
            }
            Updater.g(b5, e3, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            if (function2 != null) {
                composer2.X(-516028300);
                TextKt.h(textStyle, ComposableLambdaKt.e(-738208900, true, new DatePickerKt$DateEntryContainer$2$1$1$1$1(rowScopeInstance, function2), composer2, 54), composer2, 48);
                composer.M();
            } else {
                composer2.X(-515838022);
                composer.M();
            }
            if (function22 == null) {
                composer2.X(-515799087);
            } else {
                composer2.X(260455984);
                function22.m(composer2, 0);
            }
            composer.M();
            composer.T();
            if (function23 == null && function2 == null && function22 == null) {
                composer2.X(-250277930);
                composer.M();
            } else {
                composer2.X(-250360576);
                DividerKt.e((Modifier) null, 0.0f, datePickerColors.f(), composer, 0, 3);
                composer.M();
            }
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
