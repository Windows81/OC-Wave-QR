package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.h0  reason: case insensitive filesystem */
public final /* synthetic */ class C0111h0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f12060A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Stroke f12061B;
    public final /* synthetic */ Stroke C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ CheckboxColors F;
    public final /* synthetic */ MutableInteractionSource G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ToggleableState f12062z;

    public /* synthetic */ C0111h0(ToggleableState toggleableState, Function0 function0, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
        this.f12062z = toggleableState;
        this.f12060A = function0;
        this.f12061B = stroke;
        this.C = stroke2;
        this.D = modifier;
        this.E = z2;
        this.F = checkboxColors;
        this.G = mutableInteractionSource;
        this.H = i2;
        this.I = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return CheckboxKt.m(this.f12062z, this.f12060A, this.f12061B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
