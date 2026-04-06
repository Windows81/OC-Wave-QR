package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata
public final class EdgeEffectCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final EdgeEffectCompat f3052a = new EdgeEffectCompat();

    public final float a(EdgeEffect edgeEffect, float f2, float f3, Density density) {
        if (EdgeEffectCompat_androidKt.b(density, f2) > c(edgeEffect) * f3) {
            return 0.0f;
        }
        d(edgeEffect, MathKt.d(f2));
        return f2;
    }

    public final EdgeEffect b(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.f2916a.a(context, (AttributeSet) null) : new GlowEdgeEffectCompat(context);
    }

    public final float c(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.f2916a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void d(EdgeEffect edgeEffect, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i2);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i2);
        }
    }

    public final float e(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.f2916a.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public final void f(EdgeEffect edgeEffect, float f2) {
        if (edgeEffect instanceof GlowEdgeEffectCompat) {
            ((GlowEdgeEffectCompat) edgeEffect).a(f2);
        } else {
            edgeEffect.onRelease();
        }
    }
}
