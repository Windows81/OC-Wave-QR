package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class X2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f11792A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f11793B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ IconToggleButtonColors D;
    public final /* synthetic */ MutableInteractionSource E;
    public final /* synthetic */ Shape F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f11794z;

    public /* synthetic */ X2(boolean z2, Function1 function1, Modifier modifier, boolean z3, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i2, int i3) {
        this.f11794z = z2;
        this.f11792A = function1;
        this.f11793B = modifier;
        this.C = z3;
        this.D = iconToggleButtonColors;
        this.E = mutableInteractionSource;
        this.F = shape;
        this.G = function2;
        this.H = i2;
        this.I = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return IconButtonKt.j(this.f11794z, this.f11792A, this.f11793B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
