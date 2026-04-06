package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DatePickerDialog_androidKt$DatePickerDialog$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9690A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f9691B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Shape f9692z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1108953335, i3, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:80)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f13010a;
            Modifier k2 = SizeKt.k(SizeKt.s(companion, datePickerModalTokens.c()), 0.0f, datePickerModalTokens.b(), 1, (Object) null);
            Shape shape = this.f9692z;
            long c2 = this.f9690A.c();
            float f2 = this.f9691B;
            final Function3 function3 = this.C;
            final Function2 function2 = this.D;
            final Function2 function22 = this.E;
            SurfaceKt.c(k2, shape, c2, 0, f2, 0.0f, (BorderStroke) null, ComposableLambdaKt.e(1782015378, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    Composer composer2 = composer;
                    int i3 = i2;
                    if (composer2.E((i3 & 3) != 2, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1782015378, i3, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:88)");
                        }
                        Arrangement.HorizontalOrVertical d2 = Arrangement.f3739a.d();
                        Function3 function3 = function3;
                        Function2 function2 = function2;
                        Function2 function22 = function22;
                        Modifier.Companion companion = Modifier.f15489d;
                        Alignment.Companion companion2 = Alignment.f15444a;
                        MeasurePolicy a2 = ColumnKt.a(d2, companion2.k(), composer2, 6);
                        int a3 = ComposablesKt.a(composer2, 0);
                        CompositionLocalMap I = composer.I();
                        Modifier e2 = ComposedModifierKt.e(composer2, companion);
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
                        Modifier a5 = columnScopeInstance.a(companion, 1.0f, false);
                        MeasurePolicy g2 = BoxKt.g(companion2.o(), false);
                        int a6 = ComposablesKt.a(composer2, 0);
                        CompositionLocalMap I2 = composer.I();
                        Modifier e3 = ComposedModifierKt.e(composer2, a5);
                        Function0 a7 = companion3.a();
                        if (composer.v() == null) {
                            ComposablesKt.d();
                        }
                        composer.s();
                        if (composer.n()) {
                            composer2.y(a7);
                        } else {
                            composer.K();
                        }
                        Composer b4 = Updater.b(composer);
                        Updater.g(b4, g2, companion3.c());
                        Updater.g(b4, I2, companion3.e());
                        Function2 b5 = companion3.b();
                        if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a6))) {
                            b4.N(Integer.valueOf(a6));
                            b4.A(Integer.valueOf(a6), b5);
                        }
                        Updater.g(b4, e3, companion3.d());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                        function3.d(columnScopeInstance, composer2, 6);
                        composer.T();
                        Modifier h2 = PaddingKt.h(columnScopeInstance.b(companion, companion2.j()), DatePickerDialog_androidKt.f9687a);
                        MeasurePolicy g3 = BoxKt.g(companion2.o(), false);
                        int a8 = ComposablesKt.a(composer2, 0);
                        CompositionLocalMap I3 = composer.I();
                        Modifier e4 = ComposedModifierKt.e(composer2, h2);
                        Function0 a9 = companion3.a();
                        if (composer.v() == null) {
                            ComposablesKt.d();
                        }
                        composer.s();
                        if (composer.n()) {
                            composer2.y(a9);
                        } else {
                            composer.K();
                        }
                        Composer b6 = Updater.b(composer);
                        Updater.g(b6, g3, companion3.c());
                        Updater.g(b6, I3, companion3.e());
                        Function2 b7 = companion3.b();
                        if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a8))) {
                            b6.N(Integer.valueOf(a8));
                            b6.A(Integer.valueOf(a8), b7);
                        }
                        Updater.g(b6, e4, companion3.d());
                        DialogTokens dialogTokens = DialogTokens.f13036a;
                        ProvideContentColorTextStyleKt.b(ColorSchemeKt.k(dialogTokens.a(), composer2, 6), TypographyKt.e(dialogTokens.b(), composer2, 6), ComposableLambdaKt.e(-1103927529, true, new DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1(function2, function22), composer2, 54), composer, 384);
                        composer.T();
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
            }, composer2, 54), composer, 12582918, 104);
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
