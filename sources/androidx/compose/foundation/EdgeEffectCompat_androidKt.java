package androidx.compose.foundation;

import android.view.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public final class EdgeEffectCompat_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f3053a = ViewConfiguration.getScrollFriction();

    /* renamed from: b  reason: collision with root package name */
    public static final double f3054b;

    /* renamed from: c  reason: collision with root package name */
    public static final double f3055c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f3054b = log;
        f3055c = log - 1.0d;
    }

    public static final float b(Density density, float f2) {
        double density2 = (double) (density.getDensity() * 386.0878f * 160.0f * 0.84f);
        float f3 = f3053a;
        return (float) (((double) f3) * density2 * Math.exp((f3054b / f3055c) * Math.log(((double) (Math.abs(f2) * 0.35f)) / (((double) f3) * density2))));
    }
}
