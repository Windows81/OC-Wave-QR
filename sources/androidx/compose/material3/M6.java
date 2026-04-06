package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class M6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10269A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10270B;
    public final /* synthetic */ SwitchColors C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ InteractionSource E;
    public final /* synthetic */ Shape F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f10271z;

    public /* synthetic */ M6(Modifier modifier, boolean z2, boolean z3, SwitchColors switchColors, Function2 function2, InteractionSource interactionSource, Shape shape, int i2) {
        this.f10271z = modifier;
        this.f10269A = z2;
        this.f10270B = z3;
        this.C = switchColors;
        this.D = function2;
        this.E = interactionSource;
        this.F = shape;
        this.G = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return SwitchKt.f(this.f10271z, this.f10269A, this.f10270B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
