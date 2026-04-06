package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class L6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f10209A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f10210B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ SwitchColors E;
    public final /* synthetic */ MutableInteractionSource F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f10211z;

    public /* synthetic */ L6(boolean z2, Function1 function1, Modifier modifier, Function2 function2, boolean z3, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
        this.f10211z = z2;
        this.f10209A = function1;
        this.f10210B = modifier;
        this.C = function2;
        this.D = z3;
        this.E = switchColors;
        this.F = mutableInteractionSource;
        this.G = i2;
        this.H = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SwitchKt.d(this.f10211z, this.f10209A, this.f10210B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
