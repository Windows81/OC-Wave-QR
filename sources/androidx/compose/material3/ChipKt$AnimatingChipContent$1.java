package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChipKt$AnimatingChipContent$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f9413A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9414B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ long E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ long G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f9415z;

    public ChipKt$AnimatingChipContent$1(float f2, PaddingValues paddingValues, Function2 function2, Function2 function22, Function2 function23, long j2, Function2 function24, long j3) {
        this.f9415z = f2;
        this.f9413A = paddingValues;
        this.f9414B = function2;
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
                ComposerKt.Y(-668234218, i3, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous> (Chip.kt:2120)");
            }
            FiniteAnimationSpec b2 = MotionSchemeKt.b(MotionSchemeKeyTokens.SlowEffects, composer2, 6);
            FiniteAnimationSpec b3 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, composer2, 6);
            FiniteAnimationSpec b4 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastSpatial, composer2, 6);
            FiniteAnimationSpec b5 = MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, composer2, 6);
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = PaddingKt.h(SizeKt.b(companion, 0.0f, this.f9415z, 1, (Object) null), this.f9413A);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new ChipLayoutMeasurePolicy();
                composer2.N(g2);
            }
            ChipLayoutMeasurePolicy chipLayoutMeasurePolicy = (ChipLayoutMeasurePolicy) g2;
            Function2 function2 = this.f9414B;
            Function2 function22 = this.C;
            Function2 function23 = this.D;
            long j2 = this.E;
            Function2 function24 = this.F;
            Function2 function25 = function23;
            Function2 function26 = function22;
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
            Composer b6 = Updater.b(composer);
            Updater.g(b6, chipLayoutMeasurePolicy, companion2.c());
            Updater.g(b6, I, companion2.e());
            Function2 b7 = companion2.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a2))) {
                b6.N(Integer.valueOf(a2));
                b6.A(Integer.valueOf(a2), b7);
            }
            Updater.g(b6, e2, companion2.d());
            Modifier b8 = LayoutIdKt.b(companion, "leadingIcon");
            boolean z2 = (function2 == null && function26 == null) ? false : true;
            Alignment.Companion companion3 = Alignment.f15444a;
            Function2 function27 = function24;
            long j4 = j3;
            Function2 function28 = function25;
            EnterTransition c2 = EnterExitTransitionKt.i(b4, companion3.k(), false, (Function1) null, 12, (Object) null).c(EnterExitTransitionKt.o(b2, 0.0f, 2, (Object) null));
            ExitTransition c3 = EnterExitTransitionKt.u(b5, companion3.k(), false, (Function1) null, 12, (Object) null).c(EnterExitTransitionKt.q(b3, 0.0f, 2, (Object) null));
            ComposableLambda e3 = ComposableLambdaKt.e(687705959, true, new ChipKt$AnimatingChipContent$1$2$1(function2, function26, j2), composer2, 54);
            Modifier.Companion companion4 = companion;
            AnimatedVisibilityKt.j(z2, b8, c2, c3, (String) null, e3, composer, 196656, 16);
            Modifier k2 = PaddingKt.k(LayoutIdKt.b(companion4, "label"), ChipKt.f9409a, 0.0f, 2, (Object) null);
            MeasurePolicy b9 = RowKt.b(Arrangement.f3739a.f(), companion3.i(), composer2, 54);
            int a4 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e4 = ComposedModifierKt.e(composer2, k2);
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
            Composer b10 = Updater.b(composer);
            Updater.g(b10, b9, companion2.c());
            Updater.g(b10, I2, companion2.e());
            Function2 b11 = companion2.b();
            if (b10.n() || !Intrinsics.d(b10.g(), Integer.valueOf(a4))) {
                b10.N(Integer.valueOf(a4));
                b10.A(Integer.valueOf(a4), b11);
            }
            Updater.g(b10, e4, companion2.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            boolean z3 = false;
            function27.m(composer2, 0);
            composer.T();
            Modifier b12 = LayoutIdKt.b(companion4, "trailingIcon");
            Function2 function29 = function28;
            if (function29 != null) {
                z3 = true;
            }
            AnimatedVisibilityKt.j(z3, b12, EnterExitTransitionKt.i(b4, companion3.j(), false, (Function1) null, 12, (Object) null).c(EnterExitTransitionKt.o(b2, 0.0f, 2, (Object) null)), EnterExitTransitionKt.u(b5, companion3.j(), false, (Function1) null, 12, (Object) null).c(EnterExitTransitionKt.q(b3, 0.0f, 2, (Object) null)), (String) null, ComposableLambdaKt.e(1905252304, true, new ChipKt$AnimatingChipContent$1$2$3(function29, j4), composer2, 54), composer, 196656, 16);
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
