package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.k6  reason: case insensitive filesystem */
public final /* synthetic */ class C0169k6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12492A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SliderColors f12493z;

    public /* synthetic */ C0169k6(SliderColors sliderColors, boolean z2) {
        this.f12493z = sliderColors;
        this.f12492A = z2;
    }

    public final Object m(Object obj, Object obj2) {
        return SliderDefaults.L(this.f12493z, this.f12492A, (DrawScope) obj, (Offset) obj2);
    }
}
