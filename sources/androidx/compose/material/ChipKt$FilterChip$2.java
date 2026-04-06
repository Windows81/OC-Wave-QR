package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ChipKt$FilterChip$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7494A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f7495B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ SelectableChipColors F;
    public final /* synthetic */ boolean G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f7496z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$FilterChip$2(State state, Function2 function2, boolean z2, Function2 function22, Function2 function23, Function3 function3, SelectableChipColors selectableChipColors, boolean z3) {
        super(2);
        this.f7496z = state;
        this.f7494A = function2;
        this.f7495B = z2;
        this.C = function22;
        this.D = function23;
        this.E = function3;
        this.F = selectableChipColors;
        this.G = z3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(722126431, i2, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:210)");
            }
            ProvidedValue d2 = ContentAlphaKt.a().d(Float.valueOf(Color.o(((Color) this.f7496z.getValue()).v())));
            final Function2 function2 = this.f7494A;
            final boolean z2 = this.f7495B;
            final Function2 function22 = this.C;
            final Function2 function23 = this.D;
            final Function3 function3 = this.E;
            final SelectableChipColors selectableChipColors = this.F;
            final boolean z3 = this.G;
            final State state = this.f7496z;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(1582291359, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1582291359, i2, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:211)");
                        }
                        TextStyle b2 = MaterialTheme.f7937a.c(composer, 6).b();
                        final Function2 function2 = function2;
                        final boolean z2 = z2;
                        final Function2 function22 = function22;
                        final Function2 function23 = function23;
                        final Function3 function3 = function3;
                        final SelectableChipColors selectableChipColors = selectableChipColors;
                        final boolean z3 = z3;
                        final State state = state;
                        TextKt.a(b2, ComposableLambdaKt.e(-1543702066, true, new Function2<Composer, Integer, Unit>() {
                            public final void b(Composer composer, int i2) {
                                Arrangement arrangement;
                                Function3 function3;
                                long j2;
                                boolean z2;
                                Modifier modifier;
                                Composer composer2 = composer;
                                int i3 = i2;
                                if (composer2.E((i3 & 3) != 2, i3 & 1)) {
                                    if (ComposerKt.P()) {
                                        ComposerKt.Y(-1543702066, i3, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:212)");
                                    }
                                    Modifier.Companion companion = Modifier.f15489d;
                                    Modifier m2 = PaddingKt.m(SizeKt.b(IntrinsicKt.b(companion, IntrinsicSize.Max), 0.0f, ChipDefaults.f7470a.c(), 1, (Object) null), (function2 != null || (z2 && function22 != null)) ? Dp.m((float) 0) : ChipKt.f7475a, 0.0f, function23 == null ? ChipKt.f7475a : Dp.m((float) 0), 0.0f, 10, (Object) null);
                                    Arrangement arrangement2 = Arrangement.f3739a;
                                    Arrangement.Horizontal f2 = arrangement2.f();
                                    Alignment.Companion companion2 = Alignment.f15444a;
                                    Alignment.Vertical i4 = companion2.i();
                                    Function2 function2 = function2;
                                    boolean z3 = z2;
                                    Function2 function22 = function22;
                                    Function3 function32 = function3;
                                    Function2 function23 = function23;
                                    SelectableChipColors selectableChipColors = selectableChipColors;
                                    boolean z4 = z3;
                                    State state = state;
                                    MeasurePolicy b2 = RowKt.b(f2, i4, composer2, 54);
                                    int a2 = ComposablesKt.a(composer2, 0);
                                    CompositionLocalMap I = composer.I();
                                    Modifier e2 = ComposedModifierKt.e(composer2, m2);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
                                    Function0 a3 = companion3.a();
                                    if (composer.v() == null) {
                                        ComposablesKt.d();
                                    }
                                    composer.s();
                                    if (composer.n()) {
                                        composer2.y(a3);
                                    } else {
                                        composer.K();
                                    }
                                    Composer b3 = Updater.b(composer);
                                    Function2 function24 = function23;
                                    Updater.g(b3, b2, companion3.c());
                                    Updater.g(b3, I, companion3.e());
                                    Function2 b4 = companion3.b();
                                    if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                                        b3.N(Integer.valueOf(a2));
                                        b3.A(Integer.valueOf(a2), b4);
                                    }
                                    Updater.g(b3, e2, companion3.d());
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
                                    if (function2 != null || (z3 && function22 != null)) {
                                        composer2.X(692233385);
                                        SpacerKt.a(SizeKt.y(companion, ChipKt.f7476b), composer2, 6);
                                        MeasurePolicy g2 = BoxKt.g(companion2.o(), false);
                                        int a4 = ComposablesKt.a(composer2, 0);
                                        CompositionLocalMap I2 = composer.I();
                                        Modifier e3 = ComposedModifierKt.e(composer2, companion);
                                        function3 = function32;
                                        Function0 a5 = companion3.a();
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
                                        arrangement = arrangement2;
                                        Updater.g(b5, g2, companion3.c());
                                        Updater.g(b5, I2, companion3.e());
                                        Function2 b6 = companion3.b();
                                        if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a4))) {
                                            b5.N(Integer.valueOf(a4));
                                            b5.A(Integer.valueOf(a4), b6);
                                        }
                                        Updater.g(b5, e3, companion3.d());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                                        if (function2 != null) {
                                            composer2.X(1866339666);
                                            State b7 = selectableChipColors.b(z4, z3, composer2, 0);
                                            CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(b7.getValue()), ContentAlphaKt.a().d(Float.valueOf(Color.o(((Color) b7.getValue()).v())))}, function2, composer2, ProvidedValue.f14769i);
                                            composer.M();
                                        } else {
                                            composer2.X(1866780765);
                                            composer.M();
                                        }
                                        if (!z3 || function22 == null) {
                                            composer2.X(1868134845);
                                            composer.M();
                                        } else {
                                            composer2.X(1866887467);
                                            long v2 = ((Color) state.getValue()).v();
                                            if (function2 != null) {
                                                composer2.X(1867062772);
                                                modifier = ClipKt.a(BackgroundKt.a(SizeKt.o(companion, ChipKt.f7479e), ((Color) state.getValue()).v(), RoundedCornerShapeKt.f()), RoundedCornerShapeKt.f());
                                                z2 = false;
                                                j2 = ((Color) selectableChipColors.c(z4, z3, composer2, 0).getValue()).v();
                                                composer.M();
                                            } else {
                                                z2 = false;
                                                composer2.X(1867624957);
                                                composer.M();
                                                j2 = v2;
                                                modifier = companion;
                                            }
                                            MeasurePolicy g3 = BoxKt.g(companion2.e(), z2);
                                            int a6 = ComposablesKt.a(composer2, z2 ? 1 : 0);
                                            CompositionLocalMap I3 = composer.I();
                                            Modifier e4 = ComposedModifierKt.e(composer2, modifier);
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
                                            Composer b8 = Updater.b(composer);
                                            Updater.g(b8, g3, companion3.c());
                                            Updater.g(b8, I3, companion3.e());
                                            Function2 b9 = companion3.b();
                                            if (b8.n() || !Intrinsics.d(b8.g(), Integer.valueOf(a6))) {
                                                b8.N(Integer.valueOf(a6));
                                                b8.A(Integer.valueOf(a6), b9);
                                            }
                                            Updater.g(b8, e4, companion3.d());
                                            CompositionLocalKt.c(ContentColorKt.a().d(Color.h(j2)), function22, composer2, ProvidedValue.f14769i);
                                            composer.T();
                                            composer.M();
                                        }
                                        composer.T();
                                        SpacerKt.a(SizeKt.y(companion, ChipKt.f7477c), composer2, 6);
                                        composer.M();
                                    } else {
                                        composer2.X(694250524);
                                        composer.M();
                                        arrangement = arrangement2;
                                        function3 = function32;
                                    }
                                    Modifier c2 = RowScope.c(rowScopeInstance, companion, 1.0f, false, 2, (Object) null);
                                    MeasurePolicy b10 = RowKt.b(arrangement.f(), companion2.i(), composer2, 54);
                                    int a8 = ComposablesKt.a(composer2, 0);
                                    CompositionLocalMap I4 = composer.I();
                                    Modifier e5 = ComposedModifierKt.e(composer2, c2);
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
                                    Composer b11 = Updater.b(composer);
                                    Updater.g(b11, b10, companion3.c());
                                    Updater.g(b11, I4, companion3.e());
                                    Function2 b12 = companion3.b();
                                    if (b11.n() || !Intrinsics.d(b11.g(), Integer.valueOf(a8))) {
                                        b11.N(Integer.valueOf(a8));
                                        b11.A(Integer.valueOf(a8), b12);
                                    }
                                    Updater.g(b11, e5, companion3.d());
                                    function3.d(rowScopeInstance, composer2, 6);
                                    composer.T();
                                    if (function24 != null) {
                                        composer2.X(694586006);
                                        SpacerKt.a(SizeKt.y(companion, ChipKt.f7478d), composer2, 6);
                                        function24.m(composer2, 0);
                                        SpacerKt.a(SizeKt.y(companion, ChipKt.f7478d), composer2, 6);
                                        composer.M();
                                    } else {
                                        composer2.X(694776284);
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
                        }, composer, 54), composer, 48);
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
            }, composer, 54), composer, ProvidedValue.f14769i | 48);
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
