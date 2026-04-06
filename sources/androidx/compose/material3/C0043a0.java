package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.a0  reason: case insensitive filesystem */
public final /* synthetic */ class C0043a0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f11848A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f11849B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ ButtonColors D;
    public final /* synthetic */ ButtonElevation E;
    public final /* synthetic */ BorderStroke F;
    public final /* synthetic */ PaddingValues G;
    public final /* synthetic */ MutableInteractionSource H;
    public final /* synthetic */ Function3 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f11850z;

    public /* synthetic */ C0043a0(Function0 function0, Modifier modifier, boolean z2, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i2, int i3) {
        this.f11850z = function0;
        this.f11848A = modifier;
        this.f11849B = z2;
        this.C = shape;
        this.D = buttonColors;
        this.E = buttonElevation;
        this.F = borderStroke;
        this.G = paddingValues;
        this.H = mutableInteractionSource;
        this.I = function3;
        this.J = i2;
        this.K = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ButtonKt.h(this.f11850z, this.f11848A, this.f11849B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (Composer) obj, ((Integer) obj2).intValue());
    }
}
