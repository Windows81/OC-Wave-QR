package androidx.compose.material3.internal;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ShapeWithHorizontalCenterOptically;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class AnimatedShapeKt$rememberAnimatedShape$1$1 implements ShapeWithHorizontalCenterOptically {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f12138a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AnimatedShapeState f12139b;

    public Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        this.f12139b.m(j2);
        c(RangesKt.b(0.0f, Float.intBitsToFloat((int) (4294967295L & j2)) / ((float) 2)));
        return RoundedCornerShapeKt.a(((Number) RangesKt.r(Float.valueOf(AnimatedShapeState.q(this.f12139b, 0, (Density) null, 3, (Object) null)), b())).floatValue(), ((Number) RangesKt.r(Float.valueOf(AnimatedShapeState.o(this.f12139b, 0, (Density) null, 3, (Object) null)), b())).floatValue(), ((Number) RangesKt.r(Float.valueOf(AnimatedShapeState.g(this.f12139b, 0, (Density) null, 3, (Object) null)), b())).floatValue(), ((Number) RangesKt.r(Float.valueOf(AnimatedShapeState.i(this.f12139b, 0, (Density) null, 3, (Object) null)), b())).floatValue()).a(j2, layoutDirection, density);
    }

    public final ClosedFloatingPointRange b() {
        return (ClosedFloatingPointRange) this.f12138a.getValue();
    }

    public final void c(ClosedFloatingPointRange closedFloatingPointRange) {
        this.f12138a.setValue(closedFloatingPointRange);
    }
}
