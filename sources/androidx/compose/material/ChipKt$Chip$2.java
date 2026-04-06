package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
public final class ChipKt$Chip$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7481A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ChipColors f7482B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function3 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f7483z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$2(State state, Function2 function2, ChipColors chipColors, boolean z2, Function3 function3) {
        super(2);
        this.f7483z = state;
        this.f7481A = function2;
        this.f7482B = chipColors;
        this.C = z2;
        this.D = function3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(139076687, i2, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:112)");
            }
            ProvidedValue d2 = ContentAlphaKt.a().d(Float.valueOf(Color.o(ChipKt.b(this.f7483z))));
            final Function2 function2 = this.f7481A;
            final ChipColors chipColors = this.f7482B;
            final boolean z2 = this.C;
            final Function3 function3 = this.D;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(667535631, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(667535631, i2, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:113)");
                        }
                        TextStyle b2 = MaterialTheme.f7937a.c(composer, 6).b();
                        final Function2 function2 = function2;
                        final ChipColors chipColors = chipColors;
                        final boolean z2 = z2;
                        final Function3 function3 = function3;
                        TextKt.a(b2, ComposableLambdaKt.e(-1131213696, true, new Function2<Composer, Integer, Unit>() {
                            public static final long c(State state) {
                                return ((Color) state.getValue()).v();
                            }

                            public final void b(Composer composer, int i2) {
                                if (composer.E((i2 & 3) != 2, i2 & 1)) {
                                    if (ComposerKt.P()) {
                                        ComposerKt.Y(-1131213696, i2, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:114)");
                                    }
                                    Modifier.Companion companion = Modifier.f15489d;
                                    Modifier m2 = PaddingKt.m(SizeKt.b(companion, 0.0f, ChipDefaults.f7470a.c(), 1, (Object) null), function2 == null ? ChipKt.f7475a : Dp.m((float) 0), 0.0f, ChipKt.f7475a, 0.0f, 10, (Object) null);
                                    Arrangement.Horizontal f2 = Arrangement.f3739a.f();
                                    Alignment.Vertical i3 = Alignment.f15444a.i();
                                    Function2 function2 = function2;
                                    ChipColors chipColors = chipColors;
                                    boolean z2 = z2;
                                    Function3 function3 = function3;
                                    MeasurePolicy b2 = RowKt.b(f2, i3, composer, 54);
                                    int a2 = ComposablesKt.a(composer, 0);
                                    CompositionLocalMap I = composer.I();
                                    Modifier e2 = ComposedModifierKt.e(composer, m2);
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
                                    if (function2 != null) {
                                        composer.X(2027612844);
                                        SpacerKt.a(SizeKt.y(companion, ChipKt.f7476b), composer, 6);
                                        State c2 = chipColors.c(z2, composer, 0);
                                        CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(c(c2))), ContentAlphaKt.a().d(Float.valueOf(Color.o(c(c2))))}, function2, composer, ProvidedValue.f14769i);
                                        SpacerKt.a(SizeKt.y(companion, ChipKt.f7477c), composer, 6);
                                        composer.M();
                                    } else {
                                        composer.X(2028143316);
                                        composer.M();
                                    }
                                    function3.d(rowScopeInstance, composer, 6);
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
