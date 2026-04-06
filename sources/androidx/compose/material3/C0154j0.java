package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.j0  reason: case insensitive filesystem */
public final /* synthetic */ class C0154j0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ToggleableState f12468A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f12469B;
    public final /* synthetic */ CheckboxColors C;
    public final /* synthetic */ Stroke D;
    public final /* synthetic */ Stroke E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f12470z;

    public /* synthetic */ C0154j0(boolean z2, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, Stroke stroke, Stroke stroke2, int i2) {
        this.f12470z = z2;
        this.f12468A = toggleableState;
        this.f12469B = modifier;
        this.C = checkboxColors;
        this.D = stroke;
        this.E = stroke2;
        this.F = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CheckboxKt.k(this.f12470z, this.f12468A, this.f12469B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
