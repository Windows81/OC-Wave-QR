package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.m6  reason: case insensitive filesystem */
public final /* synthetic */ class C0187m6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12529A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SliderColors f12530z;

    public /* synthetic */ C0187m6(SliderColors sliderColors, boolean z2) {
        this.f12530z = sliderColors;
        this.f12529A = z2;
    }

    public final Object m(Object obj, Object obj2) {
        return SliderDefaults.J(this.f12530z, this.f12529A, (DrawScope) obj, (Offset) obj2);
    }
}
