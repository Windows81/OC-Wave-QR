package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BasicMarqueeKt {
    public static final AnimationSpec b(int i2, float f2, int i3, int i4, float f3, Density density) {
        TweenSpec c2 = c(Math.abs(density.B1(f3)), f2, i4);
        long c3 = StartOffset.c((-i4) + i3, 0, 2, (DefaultConstructorMarker) null);
        return i2 == Integer.MAX_VALUE ? AnimationSpecKt.e(c2, (RepeatMode) null, c3, 2, (Object) null) : AnimationSpecKt.h(i2, c2, (RepeatMode) null, c3, 4, (Object) null);
    }

    public static final TweenSpec c(float f2, float f3, int i2) {
        return AnimationSpecKt.m((int) ((float) Math.ceil((double) (f3 / (f2 / 1000.0f)))), i2, EasingKt.e());
    }
}
