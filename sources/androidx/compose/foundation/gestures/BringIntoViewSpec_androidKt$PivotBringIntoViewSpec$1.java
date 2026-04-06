package androidx.compose.foundation.gestures;

import kotlin.Metadata;

@Metadata
public final class BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1 implements BringIntoViewSpec {

    /* renamed from: b  reason: collision with root package name */
    public final float f3409b = 0.3f;

    /* renamed from: c  reason: collision with root package name */
    public final float f3410c;

    public float a(float f2, float f3, float f4) {
        float abs = Math.abs((f3 + f2) - f2);
        boolean z2 = abs <= f4;
        float f5 = (this.f3409b * f4) - (this.f3410c * abs);
        float f6 = f4 - f5;
        if (z2 && f6 < abs) {
            f5 = f4 - abs;
        }
        return f2 - f5;
    }
}
