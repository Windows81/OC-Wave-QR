package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChipKt$ChipContent$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f9424A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9425B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ long E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ long G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f9426z;

    public ChipKt$ChipContent$1(float f2, PaddingValues paddingValues, Function2 function2, Function2 function22, Function2 function23, long j2, Function2 function24, long j3) {
        this.f9426z = f2;
        this.f9424A = paddingValues;
        this.f9425B = function2;
        this.C = function22;
        this.D = function23;
        this.E = j2;
        this.F = function24;
        this.G = j3;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2130105544, i3, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:2057)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = PaddingKt.h(SizeKt.b(companion, 0.0f, this.f9426z, 1, (Object) null), this.f9424A);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new ChipLayoutMeasurePolicy();
                composer2.N(g2);
            }
            ChipLayoutMeasurePolicy chipLayoutMeasurePolicy = (ChipLayoutMeasurePolicy) g2;
            Function2 function2 = this.f9425B;
            Function2 function22 = this.C;
            Function2 function23 = this.D;
            long j2 = this.E;
            Function2 function24 = this.F;
            long j3 = this.G;
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, h2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            long j4 = j3;
            Updater.g(b2, chipLayoutMeasurePolicy, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion2.d());
            if (function2 == null && function22 == null) {
                composer2.X(-410471693);
                composer.M();
            } else {
                composer2.X(-410987750);
                Modifier b4 = LayoutIdKt.b(companion, "leadingIcon");
                MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.e(), false);
                int a4 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I2 = composer.I();
                Modifier e3 = ComposedModifierKt.e(composer2, b4);
                Function0 a5 = companion2.a();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer2.y(a5);
                } else {
                    composer.K();
                }
                Composer b5 = Updater.b(composer);
                Updater.g(b5, g3, companion2.c());
                Updater.g(b5, I2, companion2.e());
                Function2 b6 = companion2.b();
                if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a4))) {
                    b5.N(Integer.valueOf(a4));
                    b5.A(Integer.valueOf(a4), b6);
                }
                Updater.g(b5, e3, companion2.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                Function2 j5 = ChipKt.m(function2, function22, j2, composer, 0);
                if (j5 != null) {
                    composer2.X(-1737425918);
                    j5.m(composer2, 0);
                    composer.M();
                } else {
                    composer2.X(-1737349038);
                    composer.M();
                }
                composer.T();
                composer.M();
            }
            Modifier j6 = PaddingKt.j(LayoutIdKt.b(companion, "label"), ChipKt.f9409a, Dp.m((float) 0));
            Arrangement.Horizontal f2 = Arrangement.f3739a.f();
            Alignment.Companion companion3 = Alignment.f15444a;
            MeasurePolicy b7 = RowKt.b(f2, companion3.i(), composer2, 54);
            int a6 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I3 = composer.I();
            Modifier e4 = ComposedModifierKt.e(composer2, j6);
            Function0 a7 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a7);
            } else {
                composer.K();
            }
            Composer b8 = Updater.b(composer);
            Updater.g(b8, b7, companion2.c());
            Updater.g(b8, I3, companion2.e());
            Function2 b9 = companion2.b();
            if (b8.n() || !Intrinsics.d(b8.g(), Integer.valueOf(a6))) {
                b8.N(Integer.valueOf(a6));
                b8.A(Integer.valueOf(a6), b9);
            }
            Updater.g(b8, e4, companion2.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            function24.m(composer2, 0);
            composer.T();
            if (function23 != null) {
                composer2.X(-410073157);
                Modifier b10 = LayoutIdKt.b(companion, "trailingIcon");
                MeasurePolicy g4 = BoxKt.g(companion3.e(), false);
                int a8 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I4 = composer.I();
                Modifier e5 = ComposedModifierKt.e(composer2, b10);
                Function0 a9 = companion2.a();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer2.y(a9);
                } else {
                    composer.K();
                }
                Composer b11 = Updater.b(composer);
                Updater.g(b11, g4, companion2.c());
                Updater.g(b11, I4, companion2.e());
                Function2 b12 = companion2.b();
                if (b11.n() || !Intrinsics.d(b11.g(), Integer.valueOf(a8))) {
                    b11.N(Integer.valueOf(a8));
                    b11.A(Integer.valueOf(a8), b12);
                }
                Updater.g(b11, e5, companion2.d());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3797a;
                Function2 l2 = ChipKt.o(function23, j4, composer2, 0);
                if (l2 != null) {
                    composer2.X(1073690090);
                    l2.m(composer2, 0);
                    composer.M();
                } else {
                    composer2.X(1073767931);
                    composer.M();
                }
                composer.T();
                composer.M();
            } else {
                composer2.X(-409588813);
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
