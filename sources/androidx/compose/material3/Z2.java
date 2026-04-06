package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class Z2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f11836A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f11837B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ IconToggleButtonColors D;
    public final /* synthetic */ MutableInteractionSource E;
    public final /* synthetic */ Shape F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f11838z;

    public /* synthetic */ Z2(boolean z2, Function1 function1, Modifier modifier, boolean z3, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i2, int i3) {
        this.f11838z = z2;
        this.f11836A = function1;
        this.f11837B = modifier;
        this.C = z3;
        this.D = iconToggleButtonColors;
        this.E = mutableInteractionSource;
        this.F = shape;
        this.G = function2;
        this.H = i2;
        this.I = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return IconButtonKt.l(this.f11838z, this.f11836A, this.f11837B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
