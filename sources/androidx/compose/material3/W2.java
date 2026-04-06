package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class W2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f11725A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f11726B;
    public final /* synthetic */ IconButtonColors C;
    public final /* synthetic */ MutableInteractionSource D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f11727z;

    public /* synthetic */ W2(Function0 function0, Modifier modifier, boolean z2, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i2, int i3) {
        this.f11727z = function0;
        this.f11725A = modifier;
        this.f11726B = z2;
        this.C = iconButtonColors;
        this.D = mutableInteractionSource;
        this.E = shape;
        this.F = function2;
        this.G = i2;
        this.H = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return IconButtonKt.f(this.f11727z, this.f11725A, this.f11726B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
