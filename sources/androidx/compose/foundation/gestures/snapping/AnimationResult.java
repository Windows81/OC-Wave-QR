package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

@Metadata
final class AnimationResult<T, V extends AnimationVector> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3645a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimationState f3646b;

    public AnimationResult(Object obj, AnimationState animationState) {
        this.f3645a = obj;
        this.f3646b = animationState;
    }

    public final Object a() {
        return this.f3645a;
    }

    public final AnimationState b() {
        return this.f3646b;
    }

    public final AnimationState c() {
        return this.f3646b;
    }
}
