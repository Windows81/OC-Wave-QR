package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class RippleAnimationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9074a = Dp.m((float) 10);

    public static final float a(Density density, boolean z2, long j2) {
        float k2 = Offset.k(OffsetKt.a(Size.i(j2), Size.g(j2))) / 2.0f;
        return z2 ? k2 + density.B1(f9074a) : k2;
    }

    public static final float b(long j2) {
        return Math.max(Size.i(j2), Size.g(j2)) * 0.3f;
    }
}
