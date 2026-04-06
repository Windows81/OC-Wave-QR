package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f9941A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f9942B;
    public final /* synthetic */ MutableTransitionState C;
    public final /* synthetic */ MutableState D;
    public final /* synthetic */ ScrollState E;
    public final /* synthetic */ Shape F;
    public final /* synthetic */ long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ float I;
    public final /* synthetic */ BorderStroke J;
    public final /* synthetic */ Function3 K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ExposedDropdownMenuBoxScope f9943z;

    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z2, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, Function3 function3) {
        this.f9943z = exposedDropdownMenuBoxScope;
        this.f9941A = modifier;
        this.f9942B = z2;
        this.C = mutableTransitionState;
        this.D = mutableState;
        this.E = scrollState;
        this.F = shape;
        this.G = j2;
        this.H = f2;
        this.I = f3;
        this.J = borderStroke;
        this.K = function3;
    }

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2063119149, i3, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:355)");
            }
            MenuKt.d(this.f9943z.h(this.f9941A, this.f9942B), this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, composer, (MutableTransitionState.f2620d << 3) | 384);
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
