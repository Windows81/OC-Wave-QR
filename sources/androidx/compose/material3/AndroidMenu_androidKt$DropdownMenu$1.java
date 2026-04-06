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
public final class AndroidMenu_androidKt$DropdownMenu$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableTransitionState f9161A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f9162B;
    public final /* synthetic */ ScrollState C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ long E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ BorderStroke H;
    public final /* synthetic */ Function3 I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f9163z;

    public AndroidMenu_androidKt$DropdownMenu$1(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, Function3 function3) {
        this.f9163z = modifier;
        this.f9161A = mutableTransitionState;
        this.f9162B = mutableState;
        this.C = scrollState;
        this.D = shape;
        this.E = j2;
        this.F = f2;
        this.G = f3;
        this.H = borderStroke;
        this.I = function3;
    }

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-917492520, i3, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
            }
            MenuKt.d(this.f9163z, this.f9161A, this.f9162B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, (MutableTransitionState.f2620d << 3) | 384);
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
