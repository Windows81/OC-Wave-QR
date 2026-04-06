package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
final class GlowEdgeEffectCompat extends EdgeEffect {

    /* renamed from: a  reason: collision with root package name */
    public final float f3077a;

    /* renamed from: b  reason: collision with root package name */
    public float f3078b;

    public GlowEdgeEffectCompat(Context context) {
        super(context);
        this.f3077a = AndroidDensity_androidKt.a(context).B1(Dp.m((float) 1));
    }

    public final void a(float f2) {
        float f3 = this.f3078b + f2;
        this.f3078b = f3;
        if (Math.abs(f3) > this.f3077a) {
            onRelease();
        }
    }

    public void onAbsorb(int i2) {
        this.f3078b = 0.0f;
        super.onAbsorb(i2);
    }

    public void onPull(float f2, float f3) {
        this.f3078b = 0.0f;
        super.onPull(f2, f3);
    }

    public void onRelease() {
        this.f3078b = 0.0f;
        super.onRelease();
    }

    public void onPull(float f2) {
        this.f3078b = 0.0f;
        super.onPull(f2);
    }
}
