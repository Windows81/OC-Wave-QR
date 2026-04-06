package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.c6  reason: case insensitive filesystem */
public final /* synthetic */ class C0069c6 implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderState f11891A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f11892z;

    public /* synthetic */ C0069c6(float f2, SliderState sliderState) {
        this.f11892z = f2;
        this.f11891A = sliderState;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return SliderDefaults.z(this.f11892z, this.f11891A, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
    }
}
