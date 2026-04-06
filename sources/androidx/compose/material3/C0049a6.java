package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.a6  reason: case insensitive filesystem */
public final /* synthetic */ class C0049a6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f11859A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SliderColors f11860z;

    public /* synthetic */ C0049a6(SliderColors sliderColors, boolean z2) {
        this.f11860z = sliderColors;
        this.f11859A = z2;
    }

    public final Object m(Object obj, Object obj2) {
        return SliderDefaults.H(this.f11860z, this.f11859A, (DrawScope) obj, (Offset) obj2);
    }
}
