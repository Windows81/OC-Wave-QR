package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TimePickerDialogKt$TimePickerDialogLayout$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f11458A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f11459B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f11460z;

    public TimePickerDialogKt$TimePickerDialogLayout$1(Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function2 function24) {
        this.f11460z = function2;
        this.f11458A = function3;
        this.f11459B = function22;
        this.C = function23;
        this.D = function24;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1522143641, i2, -1, "androidx.compose.material3.TimePickerDialogLayout.<anonymous> (TimePickerDialog.kt:110)");
            }
            Function2 function2 = this.f11460z;
            final Function2 function22 = this.f11459B;
            final Function2 function23 = this.C;
            final Function2 function24 = this.D;
            TimePickerDialogKt.c(function2, ComposableLambdaKt.e(2122920701, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(2122920701, i2, -1, "androidx.compose.material3.TimePickerDialogLayout.<anonymous>.<anonymous> (TimePickerDialog.kt:113)");
                        }
                        Modifier.Companion companion = Modifier.f15489d;
                        Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
                        Function2 function2 = function22;
                        Function2 function22 = function23;
                        Function2 function23 = function24;
                        MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.f(), Alignment.f15444a.l(), composer, 0);
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
                        if (function2 == null) {
                            composer.X(675833080);
                        } else {
                            composer.X(2100011049);
                            function2.m(composer, 0);
                        }
                        composer.M();
                        SpacerKt.a(RowScope.c(rowScopeInstance, companion, 1.0f, false, 2, (Object) null), composer, 0);
                        if (function22 == null) {
                            composer.X(675935256);
                        } else {
                            composer.X(2100014345);
                            function22.m(composer, 0);
                        }
                        composer.M();
                        function23.m(composer, 0);
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
            }, composer, 54), this.f11458A, composer, 48);
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
