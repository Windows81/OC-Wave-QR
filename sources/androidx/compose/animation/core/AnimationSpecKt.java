package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AnimationSpecKt {
    public static final AnimationVector b(TwoWayConverter twoWayConverter, Object obj) {
        if (obj == null) {
            return null;
        }
        return (AnimationVector) twoWayConverter.a().invoke(obj);
    }

    public static final AnimationSpec c(AnimationSpec animationSpec, long j2) {
        return new StartDelayAnimationSpec(animationSpec, j2);
    }

    public static final InfiniteRepeatableSpec d(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, j2, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec e(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i2 & 4) != 0) {
            j2 = StartOffset.c(0, 0, 2, (DefaultConstructorMarker) null);
        }
        return d(durationBasedAnimationSpec, repeatMode, j2);
    }

    public static final KeyframesSpec f(Function1 function1) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        function1.invoke(keyframesSpecConfig);
        return new KeyframesSpec(keyframesSpecConfig);
    }

    public static final RepeatableSpec g(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        return new RepeatableSpec(i2, durationBasedAnimationSpec, repeatMode, j2, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RepeatableSpec h(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i3 & 8) != 0) {
            j2 = StartOffset.c(0, 0, 2, (DefaultConstructorMarker) null);
        }
        return g(i2, durationBasedAnimationSpec, repeatMode, j2);
    }

    public static final SnapSpec i(int i2) {
        return new SnapSpec(i2);
    }

    public static /* synthetic */ SnapSpec j(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return i(i2);
    }

    public static final SpringSpec k(float f2, float f3, Object obj) {
        return new SpringSpec(f2, f3, obj);
    }

    public static /* synthetic */ SpringSpec l(float f2, float f3, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return k(f2, f3, obj);
    }

    public static final TweenSpec m(int i2, int i3, Easing easing) {
        return new TweenSpec(i2, i3, easing);
    }

    public static /* synthetic */ TweenSpec n(int i2, int i3, Easing easing, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            easing = EasingKt.d();
        }
        return m(i2, i3, easing);
    }
}
